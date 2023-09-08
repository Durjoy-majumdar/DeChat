package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;

/* renamed from: je1.u2 */
public final class C33562u2 extends C60628i {

    /* renamed from: g */
    public final String f90863g = "Finder.NetSceneFinderAdReport";

    /* renamed from: h */
    public C47350c f90864h;

    /* renamed from: i */
    public C11385n f90865i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x008d, code lost:
        r8 = (r8 = (te3.C51822we1) sx3.C110818d0.m150916N((r8 = r8.f135319n))).f143985e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33562u2(long r7, int r9, int r10, java.lang.String r11) {
        /*
            r6 = this;
            java.lang.String r0 = "reportData"
            gy3.C87412m.m108594g(r11, r0)
            r0 = 0
            r1 = 1
            r6.<init>(r0, r1, r0)
            java.lang.String r1 = "Finder.NetSceneFinderAdReport"
            r6.f90863g = r1
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            r3 = 9935(0x26cf, float:1.3922E-41)
            r2.f127069d = r3
            te3.jf0 r4 = new te3.jf0
            r4.<init>()
            r4.f136089e = r10
            r4.f136090f = r11
            je1.h2 r5 = je1.C46523h2.f125330a
            te3.ig0 r3 = r5.mo71859a(r3)
            r4.f136088d = r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            rx3.l r8 = new rx3.l
            r8.<init>(r9, r7)
            java.util.List r7 = sx3.C26236u.m33719b(r8)
            r5.mo71865g(r3, r7, r0)
            r2.f127066a = r4
            te3.kf0 r7 = new te3.kf0
            r7.<init>()
            te3.ja r8 = new te3.ja
            r8.<init>()
            r7.setBaseResponse(r8)
            r2.f127067b = r7
            java.lang.String r7 = "/cgi-bin/micromsg-bin/finderadreport"
            r2.f127068c = r7
            ob0.c r7 = r2.mo72403a()
            r6.f90864h = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "NetSceneFinderAdReport "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "NetSceneFinderAdReport sessionBuffer: "
            r7.append(r8)
            te3.ig0 r8 = r4.f136088d
            if (r8 == 0) goto L_0x0091
            java.util.LinkedList<te3.we1> r8 = r8.f135319n
            if (r8 == 0) goto L_0x0091
            java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
            te3.we1 r8 = (te3.C51822we1) r8
            if (r8 == 0) goto L_0x0091
            java.lang.String r8 = r8.f143985e
            if (r8 != 0) goto L_0x0093
        L_0x0091:
            java.lang.String r8 = ""
        L_0x0093:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C33562u2.<init>(long, int, int, java.lang.String):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90865i = nVar;
        Log.m105924i(this.f90863g, "NetSceneFinderAdReport doScene");
        return dispatch(gVar, this.f90864h, this);
    }

    public int getType() {
        return 9935;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f90863g;
        Log.m105924i(str2, "NetSceneFinderAdReport onGYNetEnd " + i2 + ' ' + i3 + ' ' + str + ' ');
        C11385n nVar = this.f90865i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
