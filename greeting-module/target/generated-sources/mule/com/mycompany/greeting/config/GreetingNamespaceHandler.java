
package com.mycompany.greeting.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/greeting</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2013-01-21T06:11:25+00:00", comments = "Build 3.3.1.1298.3ae82a7")
public class GreetingNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new GreetingModuleConfigDefinitionParser());
        registerBeanDefinitionParser("hello", new HelloDefinitionParser());
        registerBeanDefinitionParser("goodbye", new GoodbyeDefinitionParser());
        registerBeanDefinitionParser("go-away", new GoAwayDefinitionParser());
    }

}
