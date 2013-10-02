package de.bennyn.samples.resource.bundles.beans;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class ResourceBundleBean implements Serializable {

    public ResourceBundleBean() {
    }

    public String getValueByExpression(String var, String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        String expression = "#{" + var + "['" + key + "']}";
        return context.getApplication().evaluateExpressionGet(context, expression, String.class);
    }

    public String getValueByResourceBundle(String baseName, String key) {
        ResourceBundle messageBundle = ResourceBundle.getBundle(baseName);
        return messageBundle.getString(key);
    }

    public String getLanguageCode() {
        Locale locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
        return locale.getLanguage();
    }

    public String sayHello() {
        return "Hello World!";
    }
}
