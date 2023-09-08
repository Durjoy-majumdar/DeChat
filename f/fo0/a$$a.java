package fo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import org.json.JSONObject;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87012a f252498d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f252499e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f252500f;

    /* renamed from: g */
    public final /* synthetic */ int f252501g;

    /* renamed from: h */
    public final /* synthetic */ C82870p f252502h;

    public /* synthetic */ a$$a(C87012a aVar, C82381f fVar, JSONObject jSONObject, int i, C82870p pVar) {
        this.f252498d = aVar;
        this.f252499e = fVar;
        this.f252500f = jSONObject;
        this.f252501g = i;
        this.f252502h = pVar;
    }

    public final void run() {
        C87012a aVar = this.f252498d;
        C82381f fVar = this.f252499e;
        JSONObject jSONObject = this.f252500f;
        int i = this.f252501g;
        C82870p pVar = this.f252502h;
        aVar.getClass();
        aVar.f252493g = (C82520h) fVar;
        SkiaCanvasView skiaCanvasView = new SkiaCanvasView(C87027l.m108053a(fVar), aVar.f252497n, fVar.getAppId(), (long) aVar.f252494h);
        aVar.f252495i = skiaCanvasView;
        C87018f.m108050b(aVar.f252494h, skiaCanvasView);
        a$$c a__c = new a$$c(aVar.f252493g);
        aVar.f252496j = a__c;
        a__c.f252515j = jSONObject.optString("data", "");
        a$$c a__c2 = aVar.f252496j;
        jSONObject.optBoolean("gesture", false);
        a__c2.getClass();
        fVar.mo109647a(i, pVar.mo115109j("ok"));
    }
}
