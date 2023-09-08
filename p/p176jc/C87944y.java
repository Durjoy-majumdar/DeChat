package p176jc;

import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: jc.y */
public class C87944y extends Resources {
    public C87944y(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }

    public Configuration getConfiguration() {
        Configuration configuration = super.getConfiguration();
        configuration.fontScale = 1.0f;
        return configuration;
    }
}
