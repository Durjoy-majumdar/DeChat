package p004b0;

import fy3.C32224a;
import gy3.C87413o;
import p175j0.C108504h;
import p683s0.C110676d;
import p683s0.C36601l;

/* renamed from: b0.n0 */
public final class C103960n0 {

    /* renamed from: b0.n0$a */
    public static final class C103961a extends C87413o implements C32224a<C103953l0> {

        /* renamed from: d */
        public final /* synthetic */ int f307451d;

        /* renamed from: e */
        public final /* synthetic */ int f307452e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103961a(int i, int i2) {
            super(0);
            this.f307451d = i;
            this.f307452e = i2;
        }

        public Object invoke() {
            return new C103953l0(this.f307451d, this.f307452e);
        }
    }

    /* renamed from: a */
    public static final C103953l0 m138697a(int i, int i2, C108504h hVar, int i3, int i4) {
        hVar.mo51557H(1470655220);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        C36601l<C103953l0, ?> lVar = C103953l0.f307415r;
        C103953l0 l0Var = (C103953l0) C110676d.m150647a(new Object[0], C103953l0.f307415r, (String) null, new C103961a(i, i2), hVar, 72, 4);
        hVar.mo51565P();
        return l0Var;
    }
}
