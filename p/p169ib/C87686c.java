package p169ib;

import android.graphics.Bitmap;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import p1017od.C89154b;
import p547hb.C87464c;
import rx3.C13598b0;

/* renamed from: ib.c */
public final class C87686c implements C87685a {
    /* renamed from: a */
    public void mo9700a(AppBrandRuntime appBrandRuntime, C32226l<? super Bitmap, C13598b0> lVar) {
        C13598b0 b0Var;
        MagicBrushView c;
        C87412m.m108594g(appBrandRuntime, "runtime");
        C87412m.m108594g(lVar, "callback");
        C83165i jsRuntime = appBrandRuntime.mo113047b0().getJsRuntime();
        C83181q qVar = jsRuntime != null ? (C83181q) jsRuntime.mo63321n0(C83181q.class) : null;
        if (qVar != null) {
            C87464c cVar = (C87464c) appBrandRuntime.mo113047b0().mo114341l0().mo116150E0(C87464c.class);
            C80301a magicBrush = (cVar == null || (c = cVar.mo111251c()) == null) ? null : c.getMagicBrush();
            if (magicBrush == null) {
                Log.m105928w("MicroMsg.MagicBrushCaptureDelegate", "hy: no magicbrush.");
                lVar.invoke(null);
            } else {
                if ((magicBrush.f235052a == 0 ? false : magicBrush.nativeGetIsMali(magicBrush.f235052a)) && qVar.mo115422q()) {
                    Log.m105928w("MicroMsg.MagicBrushCaptureDelegate", "hy: you can not ");
                }
                lVar.invoke(C89154b.m111438d(magicBrush.f235098n, (Bitmap) null, 1, (Object) null));
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("MicroMsg.MagicBrushCaptureDelegate", "hy: no js thread handler. can not capture magicbrush screenshot");
            lVar.invoke(null);
        }
    }
}
