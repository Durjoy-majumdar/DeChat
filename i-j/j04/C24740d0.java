package j04;

import n04.C25202z1;
import qz3.C26019c;
import qz3.C26045k;
import qz3.C26065q;
import qz3.C26075s;
import qz3.C26093x;
import wy3.C26442c0;
import wy3.C26453f;

/* renamed from: j04.d0 */
public final class C24740d0 {

    /* renamed from: a */
    public static final C24740d0 f70587a = new C24740d0();

    /* renamed from: j04.d0$a */
    public /* synthetic */ class C24741a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70588a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70589b;

        static {
            int[] iArr = new int[C26045k.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f70588a = iArr;
            int[] iArr2 = new int[C26442c0.values().length];
            iArr2[0] = 1;
            iArr2[2] = 2;
            iArr2[3] = 3;
            iArr2[1] = 4;
            int[] iArr3 = new int[C26093x.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            iArr3[4] = 3;
            iArr3[2] = 4;
            iArr3[3] = 5;
            iArr3[5] = 6;
            int[] iArr4 = new int[C26019c.C26022c.values().length];
            iArr4[0] = 1;
            iArr4[1] = 2;
            iArr4[2] = 3;
            iArr4[3] = 4;
            iArr4[4] = 5;
            iArr4[5] = 6;
            iArr4[6] = 7;
            f70589b = iArr4;
            int[] iArr5 = new int[C26453f.values().length];
            iArr5[0] = 1;
            iArr5[1] = 2;
            iArr5[2] = 3;
            iArr5[3] = 4;
            iArr5[4] = 5;
            iArr5[5] = 6;
            int[] iArr6 = new int[C26075s.C26078c.values().length];
            iArr6[0] = 1;
            iArr6[1] = 2;
            iArr6[2] = 3;
            int[] iArr7 = new int[C26065q.C26067b.C26070c.values().length];
            iArr7[0] = 1;
            iArr7[1] = 2;
            iArr7[2] = 3;
            iArr7[3] = 4;
            int[] iArr8 = new int[C25202z1.values().length];
            iArr8[1] = 1;
            iArr8[2] = 2;
            iArr8[0] = 3;
        }
    }

    /* renamed from: a */
    public final C26442c0 mo51724a(C26045k kVar) {
        C26442c0 c0Var = C26442c0.FINAL;
        int i = kVar == null ? -1 : C24741a.f70588a[kVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? c0Var : C26442c0.SEALED : C26442c0.ABSTRACT : C26442c0.OPEN : c0Var;
    }
}
