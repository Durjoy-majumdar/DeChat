package com.tencent.xweb;

import android.content.Context;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

public abstract class XWebExtendPluginNativeViewDelegate {
    private WeakReference<XWebExtendPluginNativeViewClient> mClient;

    public abstract Context getContext();

    public FrameLayout getRootView() {
        if (this.mClient.get() != null) {
            return this.mClient.get().getRootView();
        }
        return null;
    }

    public abstract void onCreate(int i, int i2);

    public abstract void onDestroy();

    public abstract void onSizeChanged(int i, int i2);

    public void setClient(XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
        this.mClient = new WeakReference<>(xWebExtendPluginNativeViewClient);
    }
}
