package sp0;

import android.net.Network;
import android.os.Build;
import gy3.C87412m;

/* renamed from: sp0.s */
public final class C13756s implements C13763x {

    /* renamed from: b */
    public static final C13756s f38857b = new C13756s();

    /* renamed from: a */
    public final /* synthetic */ C13763x f38858a;

    public C13756s() {
        this.f38858a = Build.VERSION.SDK_INT >= 23 ? C36774t.f97662a : C13757u.f38859a;
    }

    /* renamed from: a */
    public boolean mo13124a(int i, Network network) {
        C87412m.m108594g(network, "network");
        return this.f38858a.mo13124a(i, network);
    }
}
