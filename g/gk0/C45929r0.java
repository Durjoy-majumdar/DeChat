package gk0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C52225z7;

/* renamed from: gk0.r0 */
public class C45929r0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52225z7 f123926d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f123927e;

    /* renamed from: f */
    public final /* synthetic */ int f123928f;

    /* renamed from: g */
    public final /* synthetic */ C45931t0 f123929g;

    public C45929r0(C45931t0 t0Var, C52225z7 z7Var, C83780d1 d1Var, int i) {
        this.f123929g = t0Var;
        this.f123926d = z7Var;
        this.f123927e = d1Var;
        this.f123928f = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do accept the auto fill data protocol");
        this.f123926d.f145733f = true;
        this.f123927e.mo109647a(this.f123928f, this.f123929g.mo115109j("ok"));
        C45931t0.m51191w(this.f123929g, this.f123927e, this.f123926d);
    }
}
