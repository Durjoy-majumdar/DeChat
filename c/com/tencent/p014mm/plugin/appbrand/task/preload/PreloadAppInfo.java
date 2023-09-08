package com.tencent.p014mm.plugin.appbrand.task.preload;

/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.PreloadAppInfo */
class PreloadAppInfo {
    private static final String TAG = "PreloadAppInfo";
    public String appId;
    public int appType;
    public float openRate;
    public String path;

    public String toString() {
        return String.format("preloadAppInfo appId:%s,appType:%d,path:%s,openRate:%f", new Object[]{this.appId, Integer.valueOf(this.appType), this.path, Float.valueOf(this.openRate)});
    }
}
