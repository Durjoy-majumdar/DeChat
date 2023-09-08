package com.tencent.xweb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.xweb.util.XWebLog;
import java.lang.ref.WeakReference;

public class XWebResource extends Resources {
    public static final String TAG = "XWebResource";
    private final WeakReference<Context> mWeChatContext;

    public XWebResource(Resources resources, Context context) {
        super(resources.getAssets(), context.getResources().getDisplayMetrics(), resources.getConfiguration());
        this.mWeChatContext = new WeakReference<>(context);
    }

    public DisplayMetrics getDisplayMetrics() {
        Context context = this.mWeChatContext.get();
        return context != null ? context.getResources().getDisplayMetrics() : super.getDisplayMetrics();
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        XWebLog.m21911i(TAG, "updateConfiguration, locale:" + configuration.locale);
        super.updateConfiguration(configuration, displayMetrics);
    }
}
