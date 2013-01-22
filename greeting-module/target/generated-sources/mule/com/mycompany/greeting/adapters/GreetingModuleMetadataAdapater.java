
package com.mycompany.greeting.adapters;

import javax.annotation.Generated;
import com.mycompany.greeting.GreetingModule;
import org.mule.api.MetadataAware;


/**
 * A <code>GreetingModuleMetadataAdapater</code> is a wrapper around {@link GreetingModule } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2013-01-21T06:11:25+00:00", comments = "Build 3.3.1.1298.3ae82a7")
public class GreetingModuleMetadataAdapater
    extends GreetingModuleCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "greeting";
    private final static String MODULE_VERSION = "1.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.3.1";
    private final static String DEVKIT_BUILD = "3.3.1.1298.3ae82a7";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
