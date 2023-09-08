package com.tencent.p014mm.toolkit.frontia.core;

import android.app.Application;
import android.content.Context;
import ti3.C90501a;

/* renamed from: com.tencent.mm.toolkit.frontia.core.PluginApp */
public abstract class PluginApp extends Application {
    public Context mContext;

    public abstract C90501a getBehavior();

    public void setAppContext(Context context) {
        this.mContext = context;
    }
}
