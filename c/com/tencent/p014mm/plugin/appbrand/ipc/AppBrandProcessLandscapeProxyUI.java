package com.tencent.p014mm.plugin.appbrand.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessLandscapeProxyUI */
public class AppBrandProcessLandscapeProxyUI extends AppBrandProcessProxyUI {
    public int getForceOrientation() {
        return 6;
    }

    public void setMMOrientation() {
        setRequestedOrientation(getForceOrientation());
    }
}
