package vk0;

import org.json.JSONObject;

public final /* synthetic */ class o$$b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f260766d;

    /* renamed from: e */
    public final /* synthetic */ C90815g f260767e;

    public /* synthetic */ o$$b$$a(JSONObject jSONObject, C90815g gVar) {
        this.f260766d = jSONObject;
        this.f260767e = gVar;
    }

    public final void run() {
        JSONObject jSONObject = this.f260766d;
        C90815g gVar = this.f260767e;
        gVar.setCompressRecord(jSONObject.optBoolean("compressed"));
        gVar.mo22096i();
    }
}
