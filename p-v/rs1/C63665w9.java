package rs1;

import com.tencent.p014mm.view.TouchableLayout;
import df1.C58259c;
import ef1.C58555d;
import ef1.C7637b;
import gy3.C87412m;

/* renamed from: rs1.w9 */
public final class C63665w9 extends C58555d {

    /* renamed from: g */
    public final /* synthetic */ C63672y9 f180485g;

    public C63665w9(C63672y9 y9Var) {
        this.f180485g = y9Var;
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
        int i = TouchableLayout.f24959d;
        int i2 = TouchableLayout.f24959d;
        C63672y9 y9Var = this.f180485g;
        if (!(i2 == y9Var.f180503f && TouchableLayout.f24960e == y9Var.f180504g)) {
            y9Var.mo88482e3("TOUCH");
            C63672y9 y9Var2 = this.f180485g;
            y9Var2.f180503f = TouchableLayout.f24959d;
            y9Var2.f180504g = TouchableLayout.f24960e;
        }
        C63672y9 y9Var3 = this.f180485g;
        if (y9Var3.f180506i > 0 && (bVar instanceof C58259c.C58260a)) {
            C58259c.C58260a aVar = (C58259c.C58260a) bVar;
            int i3 = aVar.f166811b;
            boolean z = false;
            if (i3 == 1) {
                y9Var3.f180511q = false;
                long j = aVar.f166817h;
                y9Var3.f180510p = j;
                if (y9Var3.f180512r) {
                    y9Var3.mo88481d3(y9Var3.f180509o == j ? 1 : 0, false, j, y9Var3.f180507j, y9Var3.f180508n, false);
                }
                C63672y9 y9Var4 = this.f180485g;
                y9Var4.f180512r = false;
                y9Var4.f180509o = -1;
                y9Var4.mo88482e3("VIDEO_REAL_PLAY");
            } else if (i3 == 2) {
                y9Var3.f180501d++;
            } else if (i3 == 3) {
                y9Var3.f180507j = aVar.f166815f;
                y9Var3.f180508n = aVar.f166816g;
            }
            C63672y9 y9Var5 = this.f180485g;
            int i4 = y9Var5.f180501d;
            int i5 = y9Var5.f180506i;
            if (1 <= i5 && i5 < i4) {
                z = true;
            }
            if (z && y9Var5.f180505h > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                C63672y9 y9Var6 = this.f180485g;
                if (currentTimeMillis - y9Var6.f180502e >= y9Var6.f180505h) {
                    y9Var6.f180511q = true;
                    int i6 = y9Var6.f180507j + 1;
                    y9Var6.f180507j = i6;
                    C63672y9.m74981c3(y9Var6, aVar.f166817h, i6, y9Var6.f180508n, false);
                    C63672y9 y9Var7 = this.f180485g;
                    y9Var7.f180509o = aVar.f166817h;
                    y9Var7.mo88482e3("pausePlay");
                }
            }
            int i7 = aVar.f166811b;
            if (i7 == 17) {
                this.f180485g.f180512r = true;
            }
            C63672y9 y9Var8 = this.f180485g;
            if (!y9Var8.f180511q && i7 == 17) {
                y9Var8.mo88481d3(0, false, y9Var8.f180510p, y9Var8.f180507j, y9Var8.f180508n, true);
            }
        }
    }
}
