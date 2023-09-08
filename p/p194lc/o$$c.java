package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import org.json.JSONObject;

/* renamed from: lc.o$$c */
public final /* synthetic */ class o$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88453o f255501d;

    /* renamed from: e */
    public final /* synthetic */ boolean f255502e;

    /* renamed from: f */
    public final /* synthetic */ long f255503f;

    /* renamed from: g */
    public final /* synthetic */ C83817h4 f255504g;

    /* renamed from: h */
    public final /* synthetic */ JSONObject f255505h;

    public /* synthetic */ o$$c(C88453o oVar, boolean z, long j, C83817h4 h4Var, JSONObject jSONObject) {
        this.f255501d = oVar;
        this.f255502e = z;
        this.f255503f = j;
        this.f255504g = h4Var;
        this.f255505h = jSONObject;
    }

    public final void run() {
        C88453o oVar = this.f255501d;
        boolean z = this.f255502e;
        long j = this.f255503f;
        C83817h4 h4Var = this.f255504g;
        JSONObject jSONObject = this.f255505h;
        if (!z) {
            oVar.getClass();
        } else if (oVar.mo116061h0() != null) {
            oVar.mo116061h0().mo116298l(j, h4Var, jSONObject);
        }
    }
}
