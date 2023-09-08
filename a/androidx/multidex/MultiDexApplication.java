package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import p1036t3.C90369a;

public class MultiDexApplication extends Application {
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (!C90369a.f259378b) {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                try {
                    C90369a.m113160b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
                } catch (Exception e) {
                    throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
                }
            }
        }
    }
}
