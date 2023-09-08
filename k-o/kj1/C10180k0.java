package kj1;

import cl1.C0702z0;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import d14.C58052j1;

/* renamed from: kj1.k0 */
public final class C10180k0 implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C10125e1 f31143a;

    public C10180k0(C10125e1 e1Var) {
        this.f31143a = e1Var;
    }

    public final void onStatusChange(boolean z) {
        C10119d1.f30943a.mo10530a(4, 0, 4, z ? 2 : 3);
        ((C58052j1) ((C0702z0) this.f31143a.mo10534b(C0702z0.class)).f1688y).setValue(Boolean.valueOf(z));
    }
}
