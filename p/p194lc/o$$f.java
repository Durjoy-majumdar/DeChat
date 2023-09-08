package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.skyline.IRouteDoneCallback;
import org.json.JSONObject;

/* renamed from: lc.o$$f */
public class o$$f implements IRouteDoneCallback {

    /* renamed from: d */
    public final /* synthetic */ boolean f255509d;

    /* renamed from: e */
    public final /* synthetic */ long f255510e;

    /* renamed from: f */
    public final /* synthetic */ C83817h4 f255511f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f255512g;

    /* renamed from: h */
    public final /* synthetic */ C88453o f255513h;

    public o$$f(C88453o oVar, boolean z, long j, C83817h4 h4Var, JSONObject jSONObject) {
        this.f255513h = oVar;
        this.f255509d = z;
        this.f255510e = j;
        this.f255511f = h4Var;
        this.f255512g = jSONObject;
    }

    public void onDone() {
        if (this.f255509d && this.f255513h.mo116061h0() != null) {
            this.f255513h.mo116061h0().mo116298l(this.f255510e, this.f255511f, this.f255512g);
        }
    }
}
