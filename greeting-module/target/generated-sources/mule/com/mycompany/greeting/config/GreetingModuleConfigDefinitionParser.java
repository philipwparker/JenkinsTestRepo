
package com.mycompany.greeting.config;

import javax.annotation.Generated;
import com.mycompany.greeting.adapters.GreetingModuleProcessAdapter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.3.1", date = "2013-01-21T06:11:25+00:00", comments = "Build 3.3.1.1298.3ae82a7")
public class GreetingModuleConfigDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(GreetingModuleProcessAdapter.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, GreetingModuleProcessAdapter.class);
        setDestroyMethodIfNeeded(builder, GreetingModuleProcessAdapter.class);
        parseProperty(builder, element, "myProperty", "myProperty");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
