package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.skyline.IRouteDoneCallback;
import org.json.JSONObject;

/* renamed from: lc.o$$a */
public final /* synthetic */ class o$$a implements IRouteDoneCallback {

    /* renamed from: d */
    public final /* synthetic */ C88453o f255493d;

    /* renamed from: e */
    public final /* synthetic */ boolean f255494e;

    /* renamed from: f */
    public final /* synthetic */ long f255495f;

    public /* synthetic */ o$$a(C88453o oVar, boolean z, long j) {
        this.f255493d = oVar;
        this.f255494e = z;
        this.f255495f = j;
    }

    public final void onDone() {
        C88453o oVar = this.f255493d;
        boolean z = this.f255494e;
        long j = this.f255495f;
        if (oVar.mo116061h0() != null && z) {
            oVar.mo116061h0().mo116298l(j, C83817h4.NAVIGATE_BACK, (JSONObject) null);
        }
    }
}
