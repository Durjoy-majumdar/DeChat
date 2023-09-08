package je1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50856po1;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.q1 */
public final class C9367q1 extends C9251d<FinderUserPageResponse> {

    /* renamed from: s */
    public final String f29247s;

    /* renamed from: t */
    public C50856po1 f29248t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9367q1(java.lang.String r21, long r22, pe3.C89349b r24, int r25, te3.C49712hj1 r26, long r27, java.lang.String r29, long r30, boolean r32) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r4 = r26
            r5 = r29
            r6 = r30
            java.lang.String r8 = "username"
            gy3.C87412m.m108594g(r1, r8)
            java.lang.String r8 = "biz_username"
            gy3.C87412m.m108594g(r5, r8)
            r8 = 0
            r9 = 2
            r0.<init>(r8, r8, r9, r8)
            java.lang.String r10 = "Finder.CgiFinderUserPage"
            r0.f29247s = r10
            te3.po1 r10 = new te3.po1
            r10.<init>()
            r0.f29248t = r10
            r10 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            fe1.d$b r15 = fe1.C58961d.f168673a
            fe1.q r15 = r15.mo84155b(r1)
            if (r15 == 0) goto L_0x003d
            java.lang.String r15 = r15.field_firstPageMD5
            goto L_0x003e
        L_0x003d:
            r15 = r8
        L_0x003e:
            if (r15 != 0) goto L_0x0042
            java.lang.String r15 = ""
        L_0x0042:
            ob0.c$b r10 = new ob0.c$b
            r10.<init>()
            java.lang.String r11 = "/cgi-bin/micromsg-bin/finderuserpage"
            r10.f127068c = r11
            r11 = 3736(0xe98, float:5.235E-42)
            r10.f127069d = r11
            te3.po1 r8 = new te3.po1
            r8.<init>()
            r8.f139867d = r1
            r8.f139868e = r2
            r8.f139869f = r15
            zc1.b r16 = zc1.C66785b.f191882e
            java.lang.String r9 = r16.mo90662O5()
            r8.f139870g = r9
            r8.f139877q = r13
            r16 = r14
            r13 = r27
            r8.f139876p = r13
            je1.h2 r9 = je1.C46523h2.f125330a
            te3.ig0 r11 = r9.mo71860b(r11, r4)
            r8.f139872i = r11
            if (r4 == 0) goto L_0x0077
            int r4 = r4.f134677n
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            r11.f135313e = r4
            if (r32 == 0) goto L_0x0084
            int r4 = r11.f135315g
            r19 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 | r19
            r11.f135315g = r4
        L_0x0084:
            java.lang.String r4 = r8.f139867d
            java.lang.String r11 = r8.f139870g
            r17 = r15
            r13 = 0
            r14 = 2
            r15 = 0
            boolean r4 = z04.C112551y.m153810j(r4, r11, r13, r14, r15)
            r18 = 1
            if (r4 != 0) goto L_0x00ab
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            re1.a r4 = up1.C37521f.f99178G4
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r4 = 0
            goto L_0x00ac
        L_0x00ab:
            r4 = 1
        L_0x00ac:
            r8.f139871h = r4
            r4 = r24
            r8.f139873j = r4
            te3.hh0 r4 = r9.mo71867j()
            r8.f139875o = r4
            bl3.r r4 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r11 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r4 = r4.mo62446e(r11)
            java.lang.Class<os1.d> r11 = os1.C62153d.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r11)
            os1.d r4 = (os1.C62153d) r4
            rx3.l r4 = r4.mo9104X0()
            A r11 = r4.f38555d
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            r8.f139880t = r11
            B r4 = r4.f38556e
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r8.f139881u = r4
            if (r16 == 0) goto L_0x00e7
            int r4 = r16.intValue()
            goto L_0x00e8
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            r8.f139882v = r4
            if (r12 == 0) goto L_0x00f1
            long r11 = r12.longValue()
            goto L_0x00f3
        L_0x00f1:
            r11 = 0
        L_0x00f3:
            r8.f139883w = r11
            r8.f139878r = r6
            int r4 = r29.length()
            if (r4 <= 0) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            r18 = 0
        L_0x0100:
            if (r18 == 0) goto L_0x0111
            r11 = 0
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x010b
            r4 = 23
            goto L_0x010d
        L_0x010b:
            r4 = 24
        L_0x010d:
            r8.f139874n = r4
            r8.f139879s = r5
        L_0x0111:
            te3.ig0 r4 = r8.f139872i
            rx3.l r5 = new rx3.l
            if (r4 == 0) goto L_0x0119
            int r13 = r4.f135313e
        L_0x0119:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            java.lang.Long r7 = java.lang.Long.valueOf(r27)
            r5.<init>(r6, r7)
            java.util.List r5 = sx3.C26236u.m33719b(r5)
            r6 = 0
            r9.mo71865g(r4, r5, r6)
            com.tencent.mm.protocal.protobuf.FinderUserPageResponse r4 = new com.tencent.mm.protocal.protobuf.FinderUserPageResponse
            r4.<init>()
            r10.f127066a = r8
            r10.f127067b = r4
            ob0.c r4 = r10.mo72403a()
            r0.mo123453j(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NetSceneFinderUserPage init maxId "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " username "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = " pullType "
            r4.append(r1)
            r1 = r25
            r4.append(r1)
            java.lang.String r1 = " fpMD5 "
            r4.append(r1)
            r15 = r17
            r4.append(r15)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "Finder.NetSceneFinderUserPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9367q1.<init>(java.lang.String, long, pe3.b, int, te3.hj1, long, java.lang.String, long, boolean):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        FinderUserPageResponse finderUserPageResponse = (FinderUserPageResponse) eu32;
        C87412m.m108594g(finderUserPageResponse, "resp");
        super.mo332r(i, i2, str, finderUserPageResponse, yVar);
        String str2 = this.f29247s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        FinderUserPageResponse finderUserPageResponse = (FinderUserPageResponse) eu32;
        C87412m.m108594g(finderUserPageResponse, "resp");
        LinkedList<FinderObject> linkedList = finderUserPageResponse.object;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar = FinderItem.Companion;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            arrayList.add(aVar.mo79056a(finderObject, 0));
        }
        return arrayList;
    }

    /* renamed from: t */
    public long mo10028t() {
        C47465a aVar = this.f256789f.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageRequest");
        C49842ig0 ig02 = ((C50856po1) aVar).f139872i;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9367q1(String str, int i) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "username");
        this.f29247s = "Finder.CgiFinderUserPage";
        C50856po1 po12 = new C50856po1();
        this.f29248t = po12;
        po12.f139867d = str;
        po12.f139874n = i;
        po12.f139869f = "";
        po12.f139870g = C66785b.f191882e.mo90662O5();
        C50856po1 po13 = this.f29248t;
        C46523h2 h2Var = C46523h2.f125330a;
        po13.f139872i = h2Var.mo71860b(3736, (C49712hj1) null);
        C50856po1 po14 = this.f29248t;
        C49842ig0 ig02 = po14.f139872i;
        if (ig02 != null) {
            ig02.f135313e = 0;
        }
        po14.f139875o = h2Var.mo71867j();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f29248t;
        FinderUserPageResponse finderUserPageResponse = new FinderUserPageResponse();
        finderUserPageResponse.setBaseResponse(new C49966ja());
        finderUserPageResponse.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = finderUserPageResponse;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderuserpage";
        bVar.f127069d = 3736;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderUserPage", "init username:" + str + ", enterType:" + i);
    }
}
