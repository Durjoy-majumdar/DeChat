package nj2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import gy3.C87412m;
import p1081gi.C98121d;
import vj2.C65759a;
import wj2.C66132f;
import wj2.C66135h;
import xj2.C66286a;

/* renamed from: nj2.k */
public final class C61763k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f175564d;

    public C61763k(String str) {
        this.f175564d = str;
    }

    public final void run() {
        C72963f4 f4Var = new C72963f4();
        C68070l.C68072b bVar = new C68070l.C68072b();
        C65759a aVar = new C65759a();
        String str = this.f175564d;
        C61768p pVar = C61768p.f175586a;
        C87412m.m108594g(str, "toUser");
        String string = C61768p.f175591f.getString(str, (String) null);
        C66132f b = string == null ? C66135h.f190107E.mo90187b() : C66135h.f190107E.mo90190f(string);
        aVar.f189163b = b;
        bVar.f195582i = 1077936177;
        bVar.mo93545f(aVar);
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
        f4Var.setType(1077936177);
        f4Var.mo108740T2(0);
        f4Var.mo108749c3(this.f175564d);
        f4Var.mo108733M2(C75604z3.m90843o(this.f175564d));
        long x = C75604z3.m90852x(f4Var);
        C66286a.m78219f(3, 1, "", this.f175564d, b.mo90173d());
        Log.m105925i("MicroMsg.QuickRingtoneHelper", "insert ringtone msg %d", Long.valueOf(x));
    }
}
