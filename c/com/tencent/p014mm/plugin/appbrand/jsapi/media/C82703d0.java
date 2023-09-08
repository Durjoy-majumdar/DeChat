package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.d0 */
public final class C82703d0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82777y f241998a;

    public C82703d0(C82777y yVar) {
        this.f241998a = yVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f241998a.f242124a.getContext());
        if (castActivityOrNull == null) {
            Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:startActivityForResult, context !is Activity");
            C88643g.m110544b().mo72091a(new IllegalStateException("fail:internal error invalid android context"));
            return C82739n.C82740a.f242060a;
        }
        boolean z = true;
        if (this.f241998a.f242125b == C82698b2.CAMERA.getFlag()) {
            C88643g.m110543a(C82777y.m101525b(this.f241998a));
        } else {
            if (this.f241998a.f242125b != C82698b2.ALBUM.getFlag()) {
                z = false;
            }
            if (z) {
                C88643g.m110543a(C82777y.m101524a(this.f241998a));
            } else {
                C46888b c = C88643g.m110545c();
                C45082x0 x0Var = new C45082x0(castActivityOrNull);
                C82777y yVar = this.f241998a;
                x0Var.f122286e.f225802y = new C82782z(c);
                x0Var.mo70436b((View) null, new C82691a0(yVar), new C82694b0(yVar, c), new C82700c0(c));
            }
        }
        return C82739n.C82740a.f242060a;
    }
}
