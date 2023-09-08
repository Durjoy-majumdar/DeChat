package gk0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C52225z7;

/* renamed from: gk0.q0 */
public class C45928q0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52225z7 f123922d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f123923e;

    /* renamed from: f */
    public final /* synthetic */ int f123924f;

    /* renamed from: g */
    public final /* synthetic */ C45931t0 f123925g;

    public C45928q0(C45931t0 t0Var, C52225z7 z7Var, C83780d1 d1Var, int i) {
        this.f123925g = t0Var;
        this.f123922d = z7Var;
        this.f123923e = d1Var;
        this.f123924f = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do not accept the auto fill data protocol");
        this.f123922d.f145733f = false;
        this.f123923e.mo109647a(this.f123924f, this.f123925g.mo115109j("cancel"));
        C45931t0.m51191w(this.f123925g, this.f123923e, this.f123922d);
    }
}
