package cj1;

import gy3.C87412m;
import ok1.C62042e;
import pe3.C89349b;
import te3.C52013xs0;
import te3.C64348eu0;

/* renamed from: cj1.d2 */
public final class C0529d2 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0529d2(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    /* renamed from: q */
    public Object mo563q() {
        if (this.f1530a.f144903e != 20031) {
            return null;
        }
        C64348eu0 eu02 = new C64348eu0();
        C89349b bVar = this.f1530a.f144906h;
        eu02.parseFrom(bVar != null ? bVar.mo123703f() : null);
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("FinderLiveGlobalLevelUpgradeMsg", "userlevelTest," + eu02);
        int i = eu02.f183030d;
        if (i == 1 || i == 2) {
            return eu02;
        }
        return null;
    }

    public String toString() {
        Object q = mo563q();
        if (!(q instanceof C64348eu0)) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("nickNake:");
        sb.append(mo573g());
        sb.append('-');
        sb.append(mo585o());
        sb.append(",type:");
        C64348eu0 eu02 = (C64348eu0) q;
        sb.append(eu02.f183030d);
        sb.append(",level:");
        sb.append(eu02.f183031e);
        sb.append('-');
        sb.append(eu02.f183032f);
        return sb.toString();
    }
}
