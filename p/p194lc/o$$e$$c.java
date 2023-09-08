package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.d1$$r;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: lc.o$$e$$c */
public class o$$e$$c implements d1$$r {

    /* renamed from: d */
    public final AtomicBoolean f255489d = new AtomicBoolean(false);

    /* renamed from: e */
    public final /* synthetic */ C83820i0 f255490e;

    /* renamed from: f */
    public final /* synthetic */ int f255491f;

    public o$$e$$c(o$$e o__e, C83820i0 i0Var, int i) {
        this.f255490e = i0Var;
        this.f255491f = i;
    }

    /* renamed from: h5 */
    public void mo116384h5(boolean z) {
    }

    public void run() {
        C83820i0 i0Var;
        if (!this.f255489d.getAndSet(true) && (i0Var = this.f255490e) != null) {
            i0Var.mo116298l((long) this.f255491f, C83817h4.NAVIGATE_BACK, (JSONObject) null);
        }
    }
}
