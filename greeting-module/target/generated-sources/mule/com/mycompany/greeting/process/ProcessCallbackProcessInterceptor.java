
package com.mycompany.greeting.process;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.process.ProcessCallback;
import org.mule.api.process.ProcessInterceptor;
import org.mule.api.processor.MessageProcessor;

@Generated(value = "Mule DevKit Version 3.3.1", date = "2013-01-21T06:11:25+00:00", comments = "Build 3.3.1.1298.3ae82a7")
public class ProcessCallbackProcessInterceptor<T, O >implements ProcessInterceptor<T, O>
{


    public T execute(ProcessCallback<T, O> processCallback, O object, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processCallback.process(object);
    }

}
