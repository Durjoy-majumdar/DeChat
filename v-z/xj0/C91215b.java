package xj0;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import java.lang.ref.WeakReference;
import uj0.C90665a;

/* renamed from: xj0.b */
public abstract class C91215b {

    /* renamed from: a */
    public WeakReference<C81925i2> f261762a;

    /* renamed from: b */
    public WeakReference<MagicBrushView> f261763b;

    public C91215b(C81925i2 i2Var, C91213a aVar) {
        this.f261762a = new WeakReference<>(i2Var);
        C90665a aVar2 = (C90665a) i2Var.mo114341l0().mo116150E0(C90665a.class);
        this.f261763b = new WeakReference<>(aVar2 != null ? aVar2.mo111251c() : null);
    }
}
