package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import org.json.JSONObject;

/* renamed from: lc.o$$b */
public final /* synthetic */ class o$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88453o f255496d;

    /* renamed from: e */
    public final /* synthetic */ boolean f255497e;

    /* renamed from: f */
    public final /* synthetic */ long f255498f;

    /* renamed from: g */
    public final /* synthetic */ C83817h4 f255499g;

    /* renamed from: h */
    public final /* synthetic */ JSONObject f255500h;

    public /* synthetic */ o$$b(C88453o oVar, boolean z, long j, C83817h4 h4Var, JSONObject jSONObject) {
        this.f255496d = oVar;
        this.f255497e = z;
        this.f255498f = j;
        this.f255499g = h4Var;
        this.f255500h = jSONObject;
    }

    public final void run() {
        C88453o oVar = this.f255496d;
        boolean z = this.f255497e;
        long j = this.f255498f;
        C83817h4 h4Var = this.f255499g;
        JSONObject jSONObject = this.f255500h;
        if (!z) {
            oVar.getClass();
        } else if (oVar.mo116061h0() != null) {
            oVar.mo116061h0().mo116298l(j, h4Var, jSONObject);
        }
    }
}
