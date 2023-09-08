package com.tencent.p014mm.plugin.flash;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.flash.k */
public class C4392k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f19038d;

    /* renamed from: e */
    public final /* synthetic */ FaceFlashUI f19039e;

    public C4392k(FaceFlashUI faceFlashUI, JSONObject jSONObject) {
        this.f19039e = faceFlashUI;
        this.f19038d = jSONObject;
    }

    public void run() {
        this.f19039e.mo5239J7(this.f19038d);
    }
}
