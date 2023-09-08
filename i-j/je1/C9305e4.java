package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C36907w;
import te3.C48713ah1;
import te3.C49842ig0;
import te3.C52259zg1;

/* renamed from: je1.e4 */
public final class C9305e4 extends C9255j {

    /* renamed from: g */
    public C47350c f29083g;

    /* renamed from: h */
    public C11385n f29084h;

    /* renamed from: i */
    public int f29085i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9305e4(te3.m74 r17, ht1.C98522w3.C8810a r18, pe3.C89349b r19, java.lang.Integer r20, te3.C49712hj1 r21, int r22, int r23, gy3.C8480h r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r23 & 8
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r2 = r3
            goto L_0x000d
        L_0x000b:
            r2 = r20
        L_0x000d:
            r4 = r23 & 16
            if (r4 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r3 = r21
        L_0x0014:
            r4 = r23 & 32
            r5 = 0
            if (r4 == 0) goto L_0x001b
            r4 = 0
            goto L_0x001d
        L_0x001b:
            r4 = r22
        L_0x001d:
            java.lang.String r6 = "location"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "fromType"
            r7 = r18
            gy3.C87412m.m108594g(r7, r6)
            r0.<init>(r3)
            ob0.c$b r6 = new ob0.c$b
            r6.<init>()
            r8 = 5225(0x1469, float:7.322E-42)
            r6.f127069d = r8
            te3.zg1 r9 = new te3.zg1
            r9.<init>()
            je1.h2 r10 = je1.C46523h2.f125330a
            te3.ig0 r3 = r10.mo71860b(r8, r3)
            r9.f145890d = r3
            java.lang.String r3 = r1.f184224i
            r9.f145895i = r3
            float r3 = r1.f184219d
            r9.f145892f = r3
            float r3 = r1.f184220e
            r9.f145893g = r3
            java.lang.String r3 = r1.f184223h
            r9.f145901r = r3
            java.lang.String r3 = r1.f184222g
            java.lang.String r10 = r1.f184234v
            java.lang.String r11 = r1.f184221f
            r12 = 1
            if (r3 == 0) goto L_0x0064
            int r13 = r3.length()
            if (r13 != 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r13 = 0
            goto L_0x0065
        L_0x0064:
            r13 = 1
        L_0x0065:
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x0078
            rx3.o r5 = new rx3.o
            if (r3 != 0) goto L_0x006e
            r3 = r14
        L_0x006e:
            if (r10 != 0) goto L_0x0071
            r10 = r14
        L_0x0071:
            if (r11 != 0) goto L_0x0074
            r11 = r14
        L_0x0074:
            r5.<init>(r3, r10, r11)
            goto L_0x00c9
        L_0x0078:
            gy3.C87412m.m108591d(r3)
            if (r10 == 0) goto L_0x0086
            int r13 = r10.length()
            if (r13 != 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r13 = 0
            goto L_0x0087
        L_0x0086:
            r13 = 1
        L_0x0087:
            if (r13 != 0) goto L_0x008e
            java.lang.String r13 = z04.C112551y.m153814n(r3, r10, r14, r5)
            goto L_0x008f
        L_0x008e:
            r13 = r3
        L_0x008f:
            if (r11 == 0) goto L_0x0099
            int r15 = r11.length()
            if (r15 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r12 = 0
        L_0x0099:
            if (r12 != 0) goto L_0x009f
            java.lang.String r13 = z04.C112551y.m153814n(r13, r11, r14, r5)
        L_0x009f:
            java.lang.String r12 = " · "
            boolean r15 = z04.C112551y.m153819s(r13, r12, r5)
            if (r15 == 0) goto L_0x00ac
            java.lang.String r13 = z04.C112550d0.m153777M(r13, r12)
            goto L_0x009f
        L_0x00ac:
            boolean r5 = z04.C112550d0.m153801u(r13, r12, r5)
            if (r5 == 0) goto L_0x00be
            rx3.o r5 = new rx3.o
            if (r10 != 0) goto L_0x00b7
            r10 = r14
        L_0x00b7:
            if (r11 != 0) goto L_0x00ba
            r11 = r14
        L_0x00ba:
            r5.<init>(r3, r10, r11)
            goto L_0x00c9
        L_0x00be:
            rx3.o r5 = new rx3.o
            if (r10 != 0) goto L_0x00c3
            r10 = r14
        L_0x00c3:
            if (r11 != 0) goto L_0x00c6
            r11 = r14
        L_0x00c6:
            r5.<init>(r13, r10, r11)
        L_0x00c9:
            A r3 = r5.f38557d
            java.lang.String r3 = (java.lang.String) r3
            B r10 = r5.f38558e
            java.lang.String r10 = (java.lang.String) r10
            C r5 = r5.f38559f
            java.lang.String r5 = (java.lang.String) r5
            r9.f145900q = r3
            r9.f145902s = r5
            r9.f145903t = r10
            int r3 = r18.ordinal()
            r9.f145897n = r3
            r3 = r19
            r9.f145891e = r3
            r9.f145899p = r4
            java.lang.Class<tf0.p1> r3 = tf0.C64916p1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            tf0.p1 r3 = (tf0.C64916p1) r3
            te3.hh0 r3 = r3.Na0()
            r9.f145894h = r3
            if (r2 == 0) goto L_0x00fd
            int r2 = r2.intValue()
            r9.f145897n = r2
        L_0x00fd:
            r6.f127066a = r9
            r6.f127069d = r8
            te3.ah1 r2 = new te3.ah1
            r2.<init>()
            r6.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderpoistream"
            r6.f127068c = r2
            ob0.c r2 = r6.mo72403a()
            r0.f29083g = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "poi_name="
            r2.append(r3)
            java.lang.String r3 = r1.f184222g
            r2.append(r3)
            java.lang.String r3 = " poiAddress="
            r2.append(r3)
            java.lang.String r3 = r1.f184223h
            r2.append(r3)
            java.lang.String r3 = " City="
            r2.append(r3)
            java.lang.String r3 = r1.f184221f
            r2.append(r3)
            java.lang.String r3 = " country="
            r2.append(r3)
            java.lang.String r3 = r1.f184234v
            r2.append(r3)
            java.lang.String r3 = "poiId="
            r2.append(r3)
            java.lang.String r1 = r1.f184224i
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Finder.NetSceneFinderPoiStream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9305e4.<init>(te3.m74, ht1.w3$a, pe3.b, java.lang.Integer, te3.hj1, int, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29084h = nVar;
        return dispatch(gVar, this.f29083g, this);
    }

    public int getType() {
        return 5225;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.NetSceneFinderPoiStream", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        StringBuilder sb = new StringBuilder();
        sb.append("server increatment size:");
        C47465a aVar = this.f29083g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        sb.append(((C48713ah1) aVar).f130513d.size());
        Log.m105924i("Finder.NetSceneFinderPoiStream", sb.toString());
        if (i2 == 0 && i3 == 0) {
            C47465a aVar2 = this.f29083g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
            C48713ah1 ah12 = (C48713ah1) aVar2;
            for (FinderObject dv : mo10061n1()) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83329dv(dv, this.f172736d);
            }
        }
        C11385n nVar = this.f29084h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        List<FinderObject> n1 = mo10061n1();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
        for (FinderObject b : n1) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29083g.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamRequest");
        C49842ig0 ig02 = ((C52259zg1) aVar).f145890d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final List<FinderObject> mo10061n1() {
        C47465a aVar = this.f29083g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        LinkedList<FinderObject> linkedList = ((C48713ah1) aVar).f130513d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…iStreamResponse).`object`");
        return linkedList;
    }
}
