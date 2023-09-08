package com.tencent.xweb.pinus;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.tencent.xweb.XWebContextWrapper;
import com.tencent.xweb.XWebResource;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import java.util.Locale;
import org.xwalk.core.XWalkEnvironment;

public class PSContextWrapper extends XWebContextWrapper {
    private static final String TAG = "PSContextWrapper";
    public int apkVersion = 0;
    public boolean enableV8Lite;
    public String extractedCoreDir;
    public int forceDarkBehavior = 2;
    public boolean isForceDarkMode = false;
    public boolean usingCustomContext = false;

    public PSContextWrapper(Context context, int i) {
        super(context);
        initContextWrapper(context, i);
    }

    private void initContextWrapper(Context context, int i) {
        this.mContext = context;
        this.mLayoutInflater = ((LayoutInflater) context.getApplicationContext().getSystemService("layout_inflater")).cloneInContext(this);
        this.apkVersion = i;
        this.extractedCoreDir = XWebFileUtil.getExtractedCoreDir(i);
        String downloadApkPath = XWebFileUtil.getDownloadApkPath(i);
        boolean usingCustomContextInternal = XWalkEnvironment.getUsingCustomContextInternal();
        this.usingCustomContext = usingCustomContextInternal;
        if (usingCustomContextInternal) {
            this.mResources = new XWebResource(getResources(context, downloadApkPath), context);
        } else {
            this.mResources = getResources(context, downloadApkPath);
        }
        XWebLog.m21911i(TAG, "usingCustomContext:" + this.usingCustomContext + ", resources:" + this.mResources);
        Locale locale = XWalkEnvironment.getLocale();
        if (locale != null) {
            XWebLog.m21911i(TAG, "updateResourceLocale, customize locale:" + locale.toLanguageTag());
            updateResourceLocale(locale);
        }
        this.enableV8Lite = XWalkEnvironment.getV8LiteMode();
        if (XWalkEnvironment.isCurrentVersionSupportConfigureV8Lite()) {
            XWebLog.m21911i(TAG, "configure v8 lite supported, enableV8Lite:" + this.enableV8Lite);
        } else {
            XWebLog.m21911i(TAG, "configure v8 lite not supported");
        }
        if (XWalkEnvironment.isCurrentVersionSupportForceDarkMode()) {
            this.isForceDarkMode = XWalkEnvironment.getForceDarkMode();
            this.forceDarkBehavior = XWalkEnvironment.getForceDarkBehavior();
            XWebLog.m21911i(TAG, "force dark mode supported, isForceDarkMode:" + this.isForceDarkMode + ", forceDarkBehavior:" + this.forceDarkBehavior);
        } else {
            XWebLog.m21911i(TAG, "force dark mode not supported");
        }
        Resources resources = this.mResources;
        if (resources != null && this.mApplicationInfo != null) {
            this.mTheme = resources.newTheme();
            if (getPackageInfo(context, downloadApkPath) != null) {
                Resources.Theme theme = context.getTheme();
                if (theme != null) {
                    this.mTheme.setTo(theme);
                }
                this.mTheme.applyStyle(this.mApplicationInfo.theme, true);
            }
        }
    }

    public ClassLoader getWebViewCoreClassLoader() {
        return PinusStandAloneChannel.getInstance().getClassLoader();
    }
}
