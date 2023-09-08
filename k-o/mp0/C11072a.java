package mp0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.task.C1971b;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: mp0.a */
public class C11072a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f32840d;

    /* renamed from: e */
    public final /* synthetic */ String f32841e;

    /* renamed from: f */
    public final /* synthetic */ Context f32842f;

    public C11072a(C88795c cVar, C83928t1 t1Var, String str, Context context) {
        this.f32840d = t1Var;
        this.f32841e = str;
        this.f32842f = context;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107125a(1, C0966R.string.f7597ks);
        e0Var.mo107125a(2, C0966R.string.f7594kp);
        e0Var.mo107125a(7, C0966R.string.f7596kr);
        e0Var.mo107125a(9, C0966R.string.f7592km);
        e0Var.mo107142f(3, "appID: " + this.f32840d.getAppId());
        e0Var.mo107142f(8, "username: " + this.f32840d.getRuntime().mo113210l1().f234839s);
        e0Var.mo107142f(5, Util.isNullOrNil(this.f32841e) ? "UNKNOWN PROCESS NAME" : this.f32841e);
        e0Var.mo107142f(6, this.f32842f.getString(C0966R.string.f7593kn) + String.format("(cur:%b)", new Object[]{Boolean.valueOf(C1971b.m1957c())}));
        e0Var.mo107142f(10, "JAVA ASSERT");
        e0Var.mo107142f(11, "JNI ASSERT");
        e0Var.mo107142f(13, "ANR ASSERT");
        e0Var.mo107142f(12, "Watch Dog Memory Report");
    }
}
