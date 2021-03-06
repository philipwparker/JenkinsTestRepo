/**
 * This file was automatically generated by the Mule Development Kit
 */
package com.mycompany.greeting;

import org.mule.api.annotations.Module;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Processor;

/**
 * Generic module
 *
 * @author MuleSoft, Inc.
 */
@Module(name="greeting", schemaVersion="1.0-SNAPSHOT")
public class GreetingModule
{
    /**
     * Configurable
     */
    @Configurable
    private String myProperty;

    /**
     * Set property
     *
     * @param myProperty My property
     */
    public void setMyProperty(String myProperty)
    {
        this.myProperty = myProperty;
    }

    /**
     * Get property
     */
    public String getMyProperty()
    {
        return this.myProperty;
    }

    /**
     * adds hello
     *
     * {@sample.xml ../../../doc/Greeting-connector.xml.sample greeting:hello}
     *
     * @param content Content to be processed
     * @return Some string
     */
    @Processor
    public String hello(String content)
    {

        return "Hello "+ content;
    }
    
    /**
     * adds goodbye
     *
     * {@sample.xml ../../../doc/Greeting-connector.xml.sample greeting:goodbye}
     *
     * @param content Content to be processed
     * @return Some string
     */
    @Processor
    public String goodbye(String content)
    {

        return "Goodbye "+ content;
    }
    
    /**
     * adds go away
     *
     * {@sample.xml ../../../doc/Greeting-connector.xml.sample greeting:go-away}
     *
     * @param content Content to be processed
     * @return Some string
     */
    @Processor
    public String goAway(String content)
    {
        return "Go away "+ content;
    }
}
