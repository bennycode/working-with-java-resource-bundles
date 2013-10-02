package de.bennyn.samples.resource.bundles.beans;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class ResourceBundleBean implements Serializable {

    public ResourceBundleBean() {
    }
    
    public String sayHello() {
        return "Hello World!";
    }

    public String getSomething() {
        FacesContext context = FacesContext.getCurrentInstance();
        String expression = "#{sampleMessages['hello.world']}";
        return context.getApplication().evaluateExpressionGet(context, expression, String.class);
    }

    public String getLanguageCode() {
        Locale locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
        return locale.getLanguage();
    }

    public String getValue(String bundleName, String key) {
        // FacesContext context = FacesContext.getCurrentInstance();
        // String bundleName = context.getApplication().getMessageBundle();
        ResourceBundle messageBundle = ResourceBundle.getBundle(bundleName);
        return messageBundle.getString(key);
    }
}
