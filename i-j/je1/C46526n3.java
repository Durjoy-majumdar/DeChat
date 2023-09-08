package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kt1.C46744d;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C47465a;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C49731ho0;
import te3.C49842ig0;
import te3.C49876io0;
import tf0.C64916p1;

/* renamed from: je1.n3 */
public final class C46526n3 extends C9255j {

    /* renamed from: g */
    public C47350c f125336g;

    /* renamed from: h */
    public C11385n f125337h;

    /* renamed from: i */
    public final String f125338i = "NetSceneFinderGetLiveRelatedList";

    /* renamed from: j */
    public C49731ho0 f125339j;

    /* renamed from: n */
    public int f125340n;

    /* renamed from: o */
    public int f125341o;

    /* renamed from: p */
    public long f125342p;

    /* renamed from: q */
    public String f125343q = "";

    /* renamed from: r */
    public int f125344r = -1;

    /* renamed from: s */
    public int f125345s;

    /* renamed from: t */
    public boolean f125346t;

    /* renamed from: u */
    public final JSONObject f125347u;

    /* renamed from: v */
    public final JSONObject f125348v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46526n3(long r17, java.lang.String r19, java.lang.String r20, pe3.C89349b r21, int r22, float r23, float r24, te3.C49842ig0 r25, te3.C50168kr0 r26, te3.C49712hj1 r27, te3.C51395th0 r28, java.util.LinkedList<te3.C48965c71> r29, int r30, te3.C64414h71 r31, te3.C51938x81 r32) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            java.lang.String r11 = "nonceId"
            gy3.C87412m.m108594g(r1, r11)
            java.lang.String r11 = "sessionBuffer"
            gy3.C87412m.m108594g(r2, r11)
            java.lang.String r11 = "baseRequest"
            gy3.C87412m.m108594g(r4, r11)
            java.lang.String r11 = "contextObj"
            gy3.C87412m.m108594g(r6, r11)
            r0.<init>(r6)
            java.lang.String r6 = "NetSceneFinderGetLiveRelatedList"
            r0.f125338i = r6
            java.lang.String r11 = ""
            r0.f125343q = r11
            r11 = -1
            r0.f125344r = r11
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            r0.f125347u = r11
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r0.f125348v = r12
            r12 = r17
            r0.f125342p = r12
            r12 = r22
            r0.f125344r = r12
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            r13 = 6479(0x194f, float:9.079E-42)
            r12.f127069d = r13
            te3.ho0 r13 = new te3.ho0
            r13.<init>()
            r0.f125339j = r13
            te3.ho0 r13 = r16.mo71876o1()
            long r14 = r0.f125342p
            r13.f134770f = r14
            te3.ho0 r13 = r16.mo71876o1()
            r13.f134771g = r1
            te3.ho0 r1 = r16.mo71876o1()
            r13 = r23
            r1.f134772h = r13
            te3.ho0 r1 = r16.mo71876o1()
            r13 = r24
            r1.f134773i = r13
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134769e = r3
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134777p = r2
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134768d = r4
            te3.ho0 r1 = r16.mo71876o1()
            int r2 = r0.f125344r
            r1.f134774j = r2
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134778q = r5
            te3.ho0 r1 = r16.mo71876o1()
            r2 = r28
            r1.f134781t = r2
            te3.ho0 r1 = r16.mo71876o1()
            int r2 = r0.f125341o
            r1.f134783v = r2
            te3.ho0 r1 = r16.mo71876o1()
            er1.j4 r2 = er1.C58739j4.f168176a
            te3.kw0 r4 = r2.mo83698a()
            r1.f134784w = r4
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134785x = r7
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134786y = r8
            te3.ho0 r1 = r16.mo71876o1()
            r4 = 0
            r13 = 3
            te3.xw0 r2 = er1.C58739j4.m68251e(r2, r4, r4, r13, r4)
            r1.f134776o = r2
            te3.ho0 r1 = r16.mo71876o1()
            r1.f134766D = r9
            if (r10 == 0) goto L_0x00db
            java.util.LinkedList<java.lang.Long> r1 = r10.f144517d
            goto L_0x00dc
        L_0x00db:
            r1 = r4
        L_0x00dc:
            r2 = 0
            r14 = 1
            if (r1 == 0) goto L_0x00e9
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r1 = 0
            goto L_0x00ea
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            if (r1 != 0) goto L_0x0110
            te3.ho0 r1 = r16.mo71876o1()
            if (r10 == 0) goto L_0x00f5
            java.util.LinkedList<java.lang.Long> r15 = r10.f144517d
            goto L_0x00f6
        L_0x00f5:
            r15 = r4
        L_0x00f6:
            r1.f134787z = r15
            te3.ho0 r1 = r16.mo71876o1()
            if (r10 == 0) goto L_0x0101
            pe3.b r15 = r10.f144518e
            goto L_0x0102
        L_0x0101:
            r15 = r4
        L_0x0102:
            r1.f134763A = r15
            te3.ho0 r1 = r16.mo71876o1()
            if (r10 == 0) goto L_0x010d
            pe3.b r10 = r10.f144519f
            goto L_0x010e
        L_0x010d:
            r10 = r4
        L_0x010e:
            r1.f134764B = r10
        L_0x0110:
            te3.ho0 r1 = r16.mo71876o1()
            r12.f127066a = r1
            te3.io0 r1 = new te3.io0
            r1.<init>()
            r12.f127067b = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/findergetliverelatedlist"
            r12.f127068c = r1
            ob0.c r1 = r12.mo72403a()
            r0.f125336g = r1
            int r10 = r0.f125345s
            if (r10 != r13) goto L_0x012e
            r1.setIsUserCmd(r14)
        L_0x012e:
            long r12 = r0.f125342p
            java.lang.String r1 = "object_id"
            r11.put(r1, r12)
            int r1 = r0.f125344r
            java.lang.String r10 = "scene"
            r11.put(r10, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "realInit feedId "
            r1.append(r10)
            long r10 = r0.f125342p
            r1.append(r10)
            java.lang.String r10 = "  category "
            r1.append(r10)
            java.lang.String r10 = r0.f125343q
            r1.append(r10)
            java.lang.String r10 = " lastBuffer relScene:"
            r1.append(r10)
            int r10 = r0.f125344r
            r1.append(r10)
            r10 = 32
            r1.append(r10)
            r1.append(r3)
            java.lang.String r3 = " tab_tips_path="
            r1.append(r3)
            if (r5 == 0) goto L_0x0171
            java.lang.String r3 = r5.f137000g
            goto L_0x0172
        L_0x0171:
            r3 = r4
        L_0x0172:
            r1.append(r3)
            java.lang.String r3 = "  tabTipsByPassInfo="
            r1.append(r3)
            if (r5 == 0) goto L_0x017f
            pe3.b r3 = r5.f136999f
            goto L_0x0180
        L_0x017f:
            r3 = r4
        L_0x0180:
            if (r3 == 0) goto L_0x0183
            r2 = 1
        L_0x0183:
            r1.append(r2)
            java.lang.String r2 = " objectId="
            r1.append(r2)
            if (r5 == 0) goto L_0x0194
            long r2 = r5.f136997d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0195
        L_0x0194:
            r2 = r4
        L_0x0195:
            r1.append(r2)
            java.lang.String r2 = " isUserCmd="
            r1.append(r2)
            ob0.c r2 = r0.f125336g
            if (r2 == 0) goto L_0x0213
            boolean r2 = r2.getIsUserCmd()
            r1.append(r2)
            java.lang.String r2 = " pullType:"
            r1.append(r2)
            te3.ho0 r2 = r16.mo71876o1()
            int r2 = r2.f134783v
            r1.append(r2)
            java.lang.String r2 = " speed="
            r1.append(r2)
            te3.ho0 r2 = r16.mo71876o1()
            te3.kw0 r2 = r2.f134784w
            if (r2 == 0) goto L_0x01ce
            te3.jw0 r2 = r2.f137066d
            if (r2 == 0) goto L_0x01ce
            int r2 = r2.f136359d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x01cf
        L_0x01ce:
            r2 = r4
        L_0x01cf:
            r1.append(r2)
            java.lang.String r2 = " readStatSize:"
            r1.append(r2)
            if (r7 == 0) goto L_0x01e1
            int r2 = r29.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
        L_0x01e1:
            r1.append(r4)
            java.lang.String r2 = " cur_object_index:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refObjectId:"
            r1.append(r2)
            if (r9 == 0) goto L_0x0202
            long r2 = r9.f183433p
            goto L_0x0204
        L_0x0202:
            r2 = 0
        L_0x0204:
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return
        L_0x0213:
            java.lang.String r1 = "rr"
            gy3.C87412m.m108603p(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46526n3.<init>(long, java.lang.String, java.lang.String, pe3.b, int, float, float, te3.ig0, te3.kr0, te3.hj1, te3.th0, java.util.LinkedList, int, te3.h71, te3.x81):void");
    }

    /* renamed from: I0 */
    public final boolean mo71874I0() {
        C47350c cVar = this.f125336g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
            return ((C49876io0) aVar).f135531f != 0;
        }
        C87412m.m108603p("rr");
        throw null;
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f125347u;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f125348v;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125337h = nVar;
        C47350c cVar = this.f125336g;
        if (cVar != null) {
            return dispatch(gVar, cVar, this);
        }
        C87412m.m108603p("rr");
        throw null;
    }

    public int getType() {
        return 6479;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        String str2 = this.f125338i;
        Log.m105924i(str2, hashCode() + " errType " + i2 + ", errCode " + i3 + ", errMsg " + str + ", pullType:" + this.f125341o);
        if (i2 == 0 && i3 == 0) {
            String str3 = this.f125338i;
            Log.m105924i(str3, "feedId " + this.f125342p + ", " + C9311g2.f29093a.mo10062a(mo71875n1()));
            this.f125348v.put("count", mo71875n1().size());
            for (FinderObject dv : mo71875n1()) {
                ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76694dv(dv, this.f172736d);
            }
            C47350c cVar = this.f125336g;
            if (cVar != null) {
                C47465a aVar = cVar.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                if (((C49876io0) aVar).f135535j) {
                    Log.m105924i(this.f125338i, "setHasShowFinderLoadMoreScrollFlag now");
                    C58739j4.f168176a.getClass();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, Boolean.TRUE);
                }
            } else {
                C87412m.m108603p("rr");
                throw null;
            }
        }
        C11385n nVar = this.f125337h;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47350c cVar = this.f125336g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
            LinkedList<FinderObject> linkedList = ((C49876io0) aVar).f135529d;
            if (linkedList == null) {
                return C64186f0.f181907d;
            }
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar2 = FinderItem.Companion;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                arrayList.add(aVar2.mo79056a(finderObject, 0));
            }
            return arrayList;
        }
        C87412m.m108603p("rr");
        throw null;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C49842ig0 ig02 = mo71876o1().f134768d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final LinkedList<FinderObject> mo71875n1() {
        C47350c cVar = this.f125336g;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
            LinkedList<FinderObject> linkedList = ((C49876io0) aVar).f135529d;
            return linkedList == null ? new LinkedList<>() : linkedList;
        }
        C87412m.m108603p("rr");
        throw null;
    }

    /* renamed from: o1 */
    public final C49731ho0 mo71876o1() {
        C49731ho0 ho02 = this.f125339j;
        if (ho02 != null) {
            return ho02;
        }
        C87412m.m108603p("request");
        throw null;
    }

    /* renamed from: p1 */
    public final void mo71877p1(int i) {
        this.f125341o = i;
        mo71876o1().f134783v = i;
        String str = this.f125338i;
        Log.m105924i(str, hashCode() + " setReqPullType " + i);
    }
}
