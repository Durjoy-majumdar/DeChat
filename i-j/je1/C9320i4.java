package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C48727ak1;
import te3.C49572gk1;
import te3.C49712hj1;

/* renamed from: je1.i4 */
public final class C9320i4 extends C60628i implements C9332l2 {

    /* renamed from: g */
    public final String f29113g;

    /* renamed from: h */
    public final int f29114h;

    /* renamed from: i */
    public final String f29115i;

    /* renamed from: j */
    public final C89349b f29116j;

    /* renamed from: n */
    public final int f29117n;

    /* renamed from: o */
    public final boolean f29118o;

    /* renamed from: p */
    public final int f29119p;

    /* renamed from: q */
    public final String f29120q;

    /* renamed from: r */
    public int f29121r;

    /* renamed from: s */
    public C47350c f29122s;

    /* renamed from: t */
    public C11385n f29123t;

    /* renamed from: u */
    public C48727ak1 f29124u;

    /* renamed from: v */
    public C49572gk1 f29125v;

    /* renamed from: w */
    public boolean f29126w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9320i4(java.lang.String r3, int r4, java.lang.String r5, pe3.C89349b r6, int r7, te3.C49712hj1 r8, pe3.C89349b r9, pe3.C89349b r10, pe3.C89349b r11, boolean r12, int r13, int r14, gy3.C8480h r15) {
        /*
            r2 = this;
            r15 = r14 & 16
            r0 = 0
            if (r15 == 0) goto L_0x0006
            r7 = 0
        L_0x0006:
            r15 = r14 & 32
            r1 = 0
            if (r15 == 0) goto L_0x000c
            r8 = r1
        L_0x000c:
            r15 = r14 & 64
            if (r15 == 0) goto L_0x0011
            r9 = r1
        L_0x0011:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0016
            r10 = r1
        L_0x0016:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x001b
            r11 = r1
        L_0x001b:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0020
            r12 = 0
        L_0x0020:
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0025
            r13 = -1
        L_0x0025:
            java.lang.String r14 = "query"
            gy3.C87412m.m108594g(r3, r14)
            java.lang.String r14 = "requestId"
            gy3.C87412m.m108594g(r5, r14)
            r2.<init>(r8)
            r2.f29113g = r3
            r2.f29114h = r4
            r2.f29115i = r5
            r2.f29116j = r6
            r2.f29117n = r7
            r2.f29118o = r12
            r2.f29119p = r13
            java.lang.String r12 = "Finder.NetSceneFinderSearch"
            r2.f29120q = r12
            r13 = 1
            r2.f29121r = r13
            ob0.c$b r13 = new ob0.c$b
            r13.<init>()
            r14 = 3820(0xeec, float:5.353E-42)
            r13.f127069d = r14
            java.lang.String r15 = "/cgi-bin/micromsg-bin/findersearch"
            r13.f127068c = r15
            te3.fk1 r15 = new te3.fk1
            r15.<init>()
            r15.f133557d = r3
            r15.f133558e = r4
            r15.f133559f = r6
            r15.f133560g = r7
            r15.f133561h = r5
            je1.h2 r5 = je1.C46523h2.f125330a
            te3.ig0 r5 = r5.mo71860b(r14, r8)
            r15.f133562i = r5
            r15.f133563j = r9
            r15.f133564n = r10
            r15.f133565o = r11
            te3.lx4 r5 = new te3.lx4
            r5.<init>()
            te3.qv3 r6 = new te3.qv3
            r6.<init>()
            tc2.g r7 = tc2.C118418g.INSTANCE
            byte[] r7 = r7.mo175821hd()
            r6.mo73350k(r7)
            r5.f354117f = r6
            te3.ig0 r6 = r15.f133562i
            if (r6 != 0) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            pe3.b r7 = new pe3.b
            byte[] r5 = r5.toByteArray()
            r7.<init>(r5)
            r6.f135314f = r7
        L_0x0096:
            jm2.f r5 = jm2.C117361f.INSTANCE
            r6 = 540999700(0x203f0014, float:1.6178355E-19)
            r5.mo182041q(r6)
            r13.f127066a = r15
            te3.gk1 r5 = new te3.gk1
            r5.<init>()
            r13.f127067b = r5
            ob0.c r5 = r13.mo72403a()
            r2.f29122s = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NetSceneFinderSearch init query "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " offset "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            te3.gk1 r3 = new te3.gk1
            r3.<init>()
            r2.f29125v = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9320i4.<init>(java.lang.String, int, java.lang.String, pe3.b, int, te3.hj1, pe3.b, pe3.b, pe3.b, boolean, int, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29123t = nVar;
        return dispatch(gVar, this.f29122s, this);
    }

    public boolean equals(Object obj) {
        return hashCode() == (obj != null ? obj.hashCode() : 0);
    }

    public C49572gk1 getResponse() {
        return this.f29125v;
    }

    public int getType() {
        return 3820;
    }

    public int hashCode() {
        return (this.f29113g + '_' + this.f29114h + '_' + this.f29115i + '_' + this.f29116j + '_' + this.f29117n).hashCode();
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f29120q, "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47465a aVar = this.f29122s.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
        this.f29125v = (C49572gk1) aVar;
        C11385n nVar = this.f29123t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C49712hj1 hj12 = this.f172736d;
        if (hj12 != null) {
            LinkedList<FinderObject> linkedList = this.f29125v.f134091g;
            C87412m.m108593f(linkedList, "response.objectList");
            for (FinderObject finderObject : linkedList) {
                if (finderObject.sessionBuffer != null) {
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(finderObject, hj12.f134675i);
                }
            }
        }
    }
}
