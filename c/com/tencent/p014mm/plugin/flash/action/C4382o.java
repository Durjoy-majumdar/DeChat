package com.tencent.p014mm.plugin.flash.action;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.flash.action.o */
public class C4382o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f19014d;

    /* renamed from: e */
    public final /* synthetic */ FaceFlashActionUI f19015e;

    public C4382o(FaceFlashActionUI faceFlashActionUI, JSONObject jSONObject) {
        this.f19015e = faceFlashActionUI;
        this.f19014d = jSONObject;
    }

    public void run() {
        this.f19015e.mo5273J7(this.f19014d);
    }
}
