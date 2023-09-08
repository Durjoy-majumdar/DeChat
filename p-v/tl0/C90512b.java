package tl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import sl0.C90217b;
import sp0.C90280d;

/* renamed from: tl0.b */
public class C90512b extends C90217b {
    public static final int CTRL_INDEX = 269;
    public static final String NAME = "createDownloadTask";

    /* renamed from: h */
    public final C90509a f260131h;

    public C90512b(C90280d.C90282b bVar) {
        this.f260131h = mo114485w(bVar);
    }

    /* renamed from: a */
    public String mo122435a() {
        this.f260131h.getClass();
        return "downloadTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        this.f260131h.mo122436d(fVar, jSONObject, str);
    }

    public String getTaskId() {
        return this.f260131h.getTaskId();
    }

    /* renamed from: w */
    public C90509a mo114485w(C90280d.C90282b bVar) {
        return new C90509a(bVar, this.f259018g);
    }
}
