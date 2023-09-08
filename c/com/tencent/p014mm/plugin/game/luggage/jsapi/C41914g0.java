package com.tencent.p014mm.plugin.game.luggage.jsapi;

import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.g0 */
public class C41914g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43620m2.C5947b f112922d;

    /* renamed from: e */
    public final /* synthetic */ C41911e0 f112923e;

    public C41914g0(C41911e0 e0Var, C43620m2.C5947b bVar) {
        this.f112923e = e0Var;
        this.f112922d = bVar;
    }

    public void run() {
        C44478c.m48835b(this.f112923e.f112914e);
        this.f112922d.mo6945a("expired", (JSONObject) null);
    }
}
