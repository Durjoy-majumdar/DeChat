package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50393mf0;

/* renamed from: je1.m2 */
public final class C9338m2 extends C60628i {

    /* renamed from: g */
    public C47350c f29165g;

    /* renamed from: h */
    public C11385n f29166h;

    /* renamed from: i */
    public boolean f29167i = true;

    /* renamed from: j */
    public int f29168j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9338m2(java.lang.String r17, long r18, java.lang.String r20, long r21, pe3.C89349b r23, int r24, te3.C49712hj1 r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            r3 = r21
            r5 = r24
            r6 = r25
            java.lang.String r7 = "req_username"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "encryptedFeedId"
            gy3.C87412m.m108594g(r2, r7)
            r0.<init>(r6)
            r7 = 1
            r0.f29167i = r7
            fe1.d$b r8 = fe1.C58961d.f168673a
            fe1.q r8 = r8.mo84155b(r1)
            r9 = 0
            if (r8 == 0) goto L_0x0028
            java.lang.String r8 = r8.field_firstPageMD5
            goto L_0x0029
        L_0x0028:
            r8 = r9
        L_0x0029:
            if (r8 != 0) goto L_0x002d
            java.lang.String r8 = ""
        L_0x002d:
            ob0.c$b r10 = new ob0.c$b
            r10.<init>()
            java.lang.String r11 = "/cgi-bin/micromsg-bin/finderaduserpage"
            r10.f127068c = r11
            r11 = 6692(0x1a24, float:9.377E-42)
            r10.f127069d = r11
            te3.lf0 r12 = new te3.lf0
            r12.<init>()
            r12.f137372d = r1
            r12.f137373e = r3
            r12.f137374f = r8
            je1.h2 r13 = je1.C46523h2.f125330a
            te3.hh0 r14 = r13.mo71867j()
            r12.f137380o = r14
            zc1.b r14 = zc1.C66785b.f191882e
            java.lang.String r14 = r14.mo90662O5()
            r12.f137375g = r14
            te3.ig0 r11 = r13.mo71860b(r11, r6)
            r12.f137377i = r11
            r14 = 0
            if (r6 == 0) goto L_0x0061
            int r6 = r6.f134677n
            goto L_0x0062
        L_0x0061:
            r6 = 0
        L_0x0062:
            r11.f135313e = r6
            java.lang.String r6 = r12.f137372d
            java.lang.String r11 = r12.f137375g
            r15 = 2
            boolean r6 = z04.C112551y.m153810j(r6, r11, r14, r15, r9)
            if (r6 == 0) goto L_0x0071
            r12.f137376h = r7
        L_0x0071:
            te3.ig0 r6 = r12.f137377i
            rx3.l r7 = new rx3.l
            if (r6 == 0) goto L_0x0079
            int r14 = r6.f135313e
        L_0x0079:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            java.lang.Long r14 = java.lang.Long.valueOf(r18)
            r7.<init>(r11, r14)
            java.util.List r7 = sx3.C26236u.m33719b(r7)
            r13.mo71865g(r6, r7, r9)
            r6 = r18
            r12.f137381p = r6
            r12.f137382q = r2
            r2 = r23
            r12.f137378j = r2
            te3.mf0 r2 = new te3.mf0
            r2.<init>()
            r10.f127066a = r12
            r10.f127067b = r2
            ob0.c r2 = r10.mo72403a()
            r0.f29165g = r2
            r0.f29168j = r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "NetSceneFinderUserPage init maxId "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r3 = " username "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " pullType "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " fpMD5 "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Finder.NetSceneAdFeedListval"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9338m2.<init>(java.lang.String, long, java.lang.String, long, pe3.b, int, te3.hj1):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29166h = nVar;
        return dispatch(gVar, this.f29165g, this);
    }

    public int getType() {
        return 6692;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneAdFeedListval", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29165g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAdUserPageResponse");
            boolean z = true;
            if (((C50393mf0) aVar).f137985i != 1) {
                z = false;
            }
            this.f29167i = z;
        }
        C11385n nVar = this.f29166h;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
