package il1;

import android.content.Context;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58782w0;
import gy3.C87412m;
import il1.C60362c7;
import qj1.C62660c;
import te3.C51613uy0;
import te3.C64247az0;
import te3.C64582nl0;
import te3.C64789vy0;
import te3.C64863yr1;
import te3.e05;

/* renamed from: il1.g7 */
public final class C60411g7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172237d;

    /* renamed from: e */
    public final /* synthetic */ C64247az0 f172238e;

    /* renamed from: f */
    public final /* synthetic */ C51613uy0 f172239f;

    /* renamed from: g */
    public final /* synthetic */ C64863yr1 f172240g;

    /* renamed from: il1.g7$a */
    public static final class C60412a implements C60362c7.C60372c {

        /* renamed from: a */
        public final /* synthetic */ C64863yr1 f172241a;

        /* renamed from: b */
        public final /* synthetic */ C60362c7 f172242b;

        public C60412a(C64863yr1 yr12, C60362c7 c7Var) {
            this.f172241a = yr12;
            this.f172242b = c7Var;
        }

        /* renamed from: a */
        public void mo85355a(boolean z) {
            if (z) {
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "jump game " + this.f172241a.f186584e);
                this.f172242b.f172110L = this.f172241a.f186584e;
            }
            C60362c7 c7Var = this.f172242b;
            c7Var.f172108J = false;
            c7Var.mo85343r();
        }
    }

    public C60411g7(C60362c7 c7Var, C64247az0 az02, C51613uy0 uy02, C64863yr1 yr12) {
        this.f172237d = c7Var;
        this.f172238e = az02;
        this.f172239f = uy02;
        this.f172240g = yr12;
    }

    public final void run() {
        e05 e05;
        Class cls = C54991o.class;
        boolean z = true;
        this.f172237d.f172108J = true;
        C64582nl0 nl02 = this.f172238e.f182176B;
        String str = null;
        String str2 = nl02 != null ? nl02.f184482e : null;
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (z) {
            C51613uy0 uy02 = this.f172239f;
            if (uy02 != null) {
                str = uy02.f143183g;
            }
        } else {
            C64582nl0 nl03 = this.f172238e.f182176B;
            if (nl03 != null) {
                str = nl03.f184482e;
            }
        }
        C60362c7.C60363a aVar = C60362c7.f172094R;
        C60362c7 c7Var = this.f172237d;
        C62660c cVar = c7Var.f172118c;
        Context context = c7Var.f172116a.getContext();
        C87412m.m108593f(context, "root.context");
        C51613uy0 uy03 = this.f172239f;
        C64247az0 az02 = this.f172238e;
        String str3 = az02.f182181h;
        if (str3 == null) {
            str3 = "";
        }
        C58782w0 w0Var = C58782w0.f168290a;
        boolean a = aVar.mo85345a(az02);
        String str4 = (!aVar.mo85345a(this.f172238e) ? str != null : !((e05 = this.f172238e.f182195y) == null || (str = e05.f182917h) == null)) ? str : "";
        Context context2 = this.f172237d.f172116a.getContext();
        C87412m.m108593f(context2, "root.context");
        C64789vy0 vy02 = ((C54991o) this.f172237d.f172118c.mo87696x0(cls)).f154294a4;
        String f = w0Var.mo83847f(a, 7, str4, context2, vy02 != null ? vy02.f186017i : -1);
        C64863yr1 yr12 = this.f172240g;
        C60362c7 c7Var2 = this.f172237d;
        aVar.mo85346b(cVar, context, uy03, az02, str3, f, new C60412a(yr12, c7Var2), ((C54991o) c7Var2.f172118c.mo87696x0(cls)).f154384x1);
    }
}
