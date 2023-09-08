package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;

/* renamed from: je1.s2 */
public final class C33559s2 extends C60628i {

    /* renamed from: g */
    public final String f90855g = "Finder.NetSceneFinderAdCommentReport";

    /* renamed from: h */
    public C47350c f90856h;

    /* renamed from: i */
    public C11385n f90857i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x008a, code lost:
        r7 = (r7 = (te3.C51822we1) sx3.C110818d0.m150916N((r7 = r7.f135319n))).f143985e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33559s2(long r6, int r8, java.lang.String r9, java.lang.String r10) {
        /*
            r5 = this;
            java.lang.String r0 = "reportData"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "bypassData"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 0
            r1 = 1
            r5.<init>(r0, r1, r0)
            java.lang.String r1 = "Finder.NetSceneFinderAdCommentReport"
            r5.f90855g = r1
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            r3 = 8083(0x1f93, float:1.1327E-41)
            r2.f127069d = r3
            te3.df0 r4 = new te3.df0
            r4.<init>()
            r4.f132280e = r9
            r4.f132281f = r10
            je1.h2 r10 = je1.C46523h2.f125330a
            te3.ig0 r3 = r10.mo71859a(r3)
            r4.f132279d = r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            rx3.l r7 = new rx3.l
            r7.<init>(r8, r6)
            java.util.List r6 = sx3.C26236u.m33719b(r7)
            r10.mo71865g(r3, r6, r0)
            r2.f127066a = r4
            te3.ef0 r6 = new te3.ef0
            r6.<init>()
            te3.ja r7 = new te3.ja
            r7.<init>()
            r6.setBaseResponse(r7)
            r2.f127067b = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderadcommentreport"
            r2.f127068c = r6
            ob0.c r6 = r2.mo72403a()
            r5.f90856h = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "NetSceneFinderAdCommentReport  "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "NetSceneFinderAdCommentReport sessionBuffer: "
            r6.append(r7)
            te3.ig0 r7 = r4.f132279d
            if (r7 == 0) goto L_0x008e
            java.util.LinkedList<te3.we1> r7 = r7.f135319n
            if (r7 == 0) goto L_0x008e
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            te3.we1 r7 = (te3.C51822we1) r7
            if (r7 == 0) goto L_0x008e
            java.lang.String r7 = r7.f143985e
            if (r7 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r7 = ""
        L_0x0090:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C33559s2.<init>(long, int, java.lang.String, java.lang.String):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90857i = nVar;
        Log.m105924i(this.f90855g, "NetSceneFinderAdCommentReport doScene");
        return dispatch(gVar, this.f90856h, this);
    }

    public int getType() {
        return 8083;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f90855g;
        Log.m105924i(str2, "NetSceneFinderCommentAdReport onGYNetEnd " + i2 + ' ' + i3 + ' ' + str + ' ');
        C11385n nVar = this.f90857i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
