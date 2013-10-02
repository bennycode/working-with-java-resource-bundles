working-with-java-resource-bundles
==================================

Java
- Create Java Web Application with Maven
- Create "src/main/resources"
- Create a package in the resources dir
- Create "messages.properties" in the resources dir
- Create a "faces-config.xml" in "src/main/webapp/WEB-INF"
- Define "messages" in "faces-config.xml" with a custom "var" (sampleMessages)
- Create a XHTML page (src/main/webapp/index.xhtml)
- Define the "Faces Servlet" in "src/main/webapp/WEB-INF/web.xml" (also add it as a <welcome-file>)
- Use your messages in a JSF page:
hello_world ->
<h:outputText value="#{sampleMessages.hello_world}" />
hello.world ->
<h:outputText value="#{sampleMessages['hello.world']}" />
