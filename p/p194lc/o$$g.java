package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.skyline.IRouteDoneCallback;
import org.json.JSONObject;

/* renamed from: lc.o$$g */
public class o$$g implements IRouteDoneCallback {

    /* renamed from: d */
    public final /* synthetic */ boolean f255514d;

    /* renamed from: e */
    public final /* synthetic */ long f255515e;

    /* renamed from: f */
    public final /* synthetic */ C83817h4 f255516f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f255517g;

    /* renamed from: h */
    public final /* synthetic */ C88453o f255518h;

    public o$$g(C88453o oVar, boolean z, long j, C83817h4 h4Var, JSONObject jSONObject) {
        this.f255518h = oVar;
        this.f255514d = z;
        this.f255515e = j;
        this.f255516f = h4Var;
        this.f255517g = jSONObject;
    }

    public void onDone() {
        if (this.f255514d && this.f255518h.mo116061h0() != null) {
            this.f255518h.mo116061h0().mo116298l(this.f255515e, this.f255516f, this.f255517g);
        }
    }
}
