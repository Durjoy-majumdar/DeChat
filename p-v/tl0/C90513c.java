package tl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import sl0.C90218c;
import sp0.C90280d;

/* renamed from: tl0.c */
public class C90513c extends C90218c {
    public static final int CTRL_INDEX = 269;
    public static final String NAME = "createDownloadTaskAsync";

    /* renamed from: h */
    public final C90509a f260132h;

    public C90513c(C90280d.C90282b bVar) {
        this.f260132h = new C90509a(bVar, this.f259023g);
    }

    /* renamed from: a */
    public String mo122435a() {
        this.f260132h.getClass();
        return "downloadTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        this.f260132h.mo122436d(fVar, jSONObject, str);
    }

    public String getTaskId() {
        return this.f260132h.getTaskId();
    }
}
