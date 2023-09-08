package ul0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import sl0.C90217b;
import sp0.C90291h;

/* renamed from: ul0.c */
public class C90695c extends C90217b {
    public static final int CTRL_INDEX = 242;
    public static final String NAME = "createRequestTask";

    /* renamed from: h */
    public final C90691a f260528h;

    public C90695c(int i, C90291h.C90295d dVar) {
        this.f260528h = new C90691a(i, dVar, this.f259018g);
    }

    /* renamed from: a */
    public String mo122435a() {
        this.f260528h.getClass();
        return "requestTaskId";
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        this.f260528h.mo122436d(fVar, jSONObject, str);
    }

    public String getTaskId() {
        return this.f260528h.getTaskId();
    }
}
