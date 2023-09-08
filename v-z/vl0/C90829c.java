package vl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import sl0.C90218c;
import sp0.C90302k;

/* renamed from: vl0.c */
public class C90829c extends C90218c {
    public static final int CTRL_INDEX = 272;
    public static final String NAME = "createUploadTaskAsync";

    /* renamed from: h */
    public C90825a f260793h;

    public C90829c(C90302k.C90305c cVar) {
        this.f260793h = new C90825a(cVar, this.f259023g);
    }

    /* renamed from: a */
    public String mo122435a() {
        this.f260793h.getClass();
        return "uploadTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        this.f260793h.mo122436d(fVar, jSONObject, str);
    }

    public String getTaskId() {
        return this.f260793h.getTaskId();
    }
}
