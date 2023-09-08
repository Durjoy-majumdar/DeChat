package ul0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import sl0.C90218c;
import sp0.C90291h;

/* renamed from: ul0.d */
public class C90696d extends C90218c {
    public static final int CTRL_INDEX = 242;
    public static final String NAME = "createRequestTaskAsync";

    /* renamed from: h */
    public final C90691a f260529h;

    public C90696d(int i, C90291h.C90295d dVar) {
        this.f260529h = new C90691a(i, dVar, this.f259023g);
    }

    /* renamed from: a */
    public String mo122435a() {
        this.f260529h.getClass();
        return "requestTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        this.f260529h.mo122436d(fVar, jSONObject, str);
    }

    public String getTaskId() {
        return this.f260529h.getTaskId();
    }
}
