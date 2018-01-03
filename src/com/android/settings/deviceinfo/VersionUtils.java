
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getHeavensExperienceVersion(){
        return SystemProperties.get("org.heavensexperience.version.display","");
    }
}
