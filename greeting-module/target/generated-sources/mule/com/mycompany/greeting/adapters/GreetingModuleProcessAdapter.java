
package com.mycompany.greeting.adapters;

import javax.annotation.Generated;
import com.mycompany.greeting.GreetingModule;
import org.mule.api.MuleEvent;
import org.mule.api.process.ProcessAdapter;
import org.mule.api.process.ProcessCallback;
import org.mule.api.process.ProcessTemplate;
import org.mule.api.process.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;


/**
 * A <code>GreetingModuleProcessAdapter</code> is a wrapper around {@link GreetingModule } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2013-01-21T06:11:25+00:00", comments = "Build 3.3.1.1298.3ae82a7")
public class GreetingModuleProcessAdapter
    extends GreetingModuleLifecycleAdapter
    implements ProcessAdapter<GreetingModuleCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GreetingModuleCapabilitiesAdapter> getProcessTemplate() {
        final GreetingModuleCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GreetingModuleCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GreetingModuleCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
