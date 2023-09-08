package vl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import sl0.C90217b;
import sp0.C90302k;

/* renamed from: vl0.b */
public class C90828b extends C90217b {
    public static final int CTRL_INDEX = 272;
    public static final String NAME = "createUploadTask";

    /* renamed from: h */
    public C90825a f260792h;

    public C90828b(C90302k.C90305c cVar) {
        this.f260792h = new C90825a(cVar, this.f259018g);
    }

    /* renamed from: a */
    public String mo122435a() {
        this.f260792h.getClass();
        return "uploadTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        this.f260792h.mo122436d(fVar, jSONObject, str);
    }

    public String getTaskId() {
        return this.f260792h.getTaskId();
    }
}
