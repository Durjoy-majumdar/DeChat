package dp1;

import c30.C104289g;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import gy3.C87412m;
import te3.C49712hj1;

/* renamed from: dp1.d1 */
public final class C7430d1 {

    /* renamed from: a */
    public long f25617a;

    /* renamed from: b */
    public final C58555d f25618b;

    /* renamed from: dp1.d1$a */
    public static final class C7431a extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C7430d1 f25619g;

        /* renamed from: h */
        public final /* synthetic */ C49712hj1 f25620h;

        public C7431a(C7430d1 d1Var, C49712hj1 hj12) {
            this.f25619g = d1Var;
            this.f25620h = hj12;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C87412m.m108594g(bVar, "ev");
            if (bVar instanceof C7642k) {
                C7642k kVar = (C7642k) bVar;
                if (this.f25619g.f25617a != kVar.f25958i) {
                    C7435f2 f2Var = C7435f2.f25626a;
                    f2Var.mo8580d(this.f25620h, "forward", false, new C104289g());
                    f2Var.mo8580d(this.f25620h, "tridot", false, new C104289g());
                    this.f25619g.f25617a = kVar.f25958i;
                }
            }
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r2 = ((ef1.C7642k) r3).f25951b;
         */
        /* renamed from: z1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2333z1(ef1.C58553c r2, ef1.C7637b r3) {
            /*
                r1 = this;
                java.lang.String r0 = "dispatcher"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r2 = "event"
                gy3.C87412m.m108594g(r3, r2)
                boolean r2 = r3 instanceof ef1.C7642k
                if (r2 == 0) goto L_0x001c
                ef1.k r3 = (ef1.C7642k) r3
                int r2 = r3.f25951b
                if (r2 == 0) goto L_0x001a
                r3 = 5
                if (r2 == r3) goto L_0x001a
                r3 = 4
                if (r2 != r3) goto L_0x001c
            L_0x001a:
                r2 = 1
                goto L_0x001d
            L_0x001c:
                r2 = 0
            L_0x001d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: dp1.C7430d1.C7431a.mo2333z1(ef1.c, ef1.b):boolean");
        }
    }

    public C7430d1(C49712hj1 hj12) {
        C87412m.m108594g(hj12, "contextObj");
        this.f25618b = new C7431a(this, hj12);
    }
}
