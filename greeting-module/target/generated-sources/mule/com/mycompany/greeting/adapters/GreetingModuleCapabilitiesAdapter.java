
package com.mycompany.greeting.adapters;

import javax.annotation.Generated;
import com.mycompany.greeting.GreetingModule;
import org.mule.api.Capabilities;
import org.mule.api.Capability;


/**
 * A <code>GreetingModuleCapabilitiesAdapter</code> is a wrapper around {@link GreetingModule } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2013-01-21T06:11:25+00:00", comments = "Build 3.3.1.1298.3ae82a7")
public class GreetingModuleCapabilitiesAdapter
    extends GreetingModule
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
