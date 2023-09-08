package z82;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import c92.C104331h;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import gy3.C87412m;
import java.util.ArrayList;
import x82.C112075a;
import x82.C112113q;

/* renamed from: z82.a */
public final class C112612a implements C112075a {

    /* renamed from: d */
    public Context f337242d;

    /* renamed from: e */
    public int f337243e = -1;

    /* renamed from: f */
    public C112113q f337244f = new C112113q(this.f337242d, this);

    /* renamed from: g */
    public final boolean f337245g = C104331h.m139315h();

    /* renamed from: h */
    public boolean f337246h;

    public C112612a(Context context) {
        C87412m.m108594g(context, "context");
        this.f337242d = context;
    }

    /* renamed from: a */
    public int mo163770a() {
        return 0;
    }

    /* renamed from: b */
    public int mo163771b() {
        return this.f337243e;
    }

    /* renamed from: c */
    public void mo163772c(C112075a.C112077b bVar, Bundle bundle) {
        boolean z;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        boolean z2 = false;
        if (ordinal != 7) {
            if (ordinal == 8) {
                this.f337246h = false;
            }
        } else if (this.f337245g || C105851w0.zx0().mo150670m().mo150708j()) {
            C112113q qVar = this.f337244f;
            if (qVar != null) {
                ViewGroup viewGroup = qVar.f335670i;
                if (viewGroup != null && viewGroup.getVisibility() == 0) {
                    z = true;
                    if (z && bundle != null) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("avatar_available_speaker");
                        C112113q qVar2 = this.f337244f;
                        if (qVar2 != null) {
                            C87412m.m108591d(stringArrayList);
                            qVar2.mo163846f(stringArrayList);
                            z2 = true;
                        }
                        this.f337246h = z2;
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    /* renamed from: d */
    public boolean mo163773d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo163774e() {
        return this.f337246h;
    }

    /* renamed from: f */
    public final void mo164385f(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "rootView");
        viewGroup.removeAllViews();
        C112113q qVar = this.f337244f;
        if (qVar != null) {
            qVar.mo163843c(false);
        }
    }

    public boolean getCurrentStatus() {
        return false;
    }
}
