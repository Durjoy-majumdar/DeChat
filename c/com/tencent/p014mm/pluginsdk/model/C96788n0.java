package com.tencent.p014mm.pluginsdk.model;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import i40.C98597b;
import i40.C98598e;
import mh0.C99862a;
import mh0.C99864d;
import mh0.C99865e0;
import mh0.C99893q;
import p434ig.C98674g;
import pb1.C100714h1;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101849uc0;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.pluginsdk.model.n0 */
public class C96788n0 extends C86301e implements C100714h1 {
    public boolean Ae0(DoFavoriteEvent doFavoriteEvent, Intent intent) {
        return C96787m0.m124257k(doFavoriteEvent, intent);
    }

    public boolean Cq0(DoFavoriteEvent doFavoriteEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        String str8 = str;
        String str9 = str3;
        if (doFavoriteEvent2 == null) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (doFavoriteEvent2 != null) {
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        String format = String.format("%s#%s", new Object[]{str8, ""});
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        String str10 = str2;
        rd02.mo141275k(str2);
        rd02.mo141277m(2);
        rd02.mo141273f(System.currentTimeMillis());
        rd02.mo141274j(str + "");
        rd02.mo141278n(format);
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141259o(format);
        rc02.mo141232F(true);
        rc02.mo141260p(5);
        rc02.mo141246U(str3);
        rc02.mo141265u(str4);
        rc02.mo141252d(str5);
        rc02.mo141231E(true);
        kd02.f298618f.add(rc02);
        C101756ae0 ae02 = new C101756ae0();
        ae02.mo141197q(str6);
        ae02.f297867h = str7;
        ae02.f297868i = true;
        kd02.mo141221s(ae02);
        kd02.mo141219q(rd02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
        aVar.f264676a = kd02;
        aVar.f264680e = str9;
        aVar.f264678c = 5;
        return true;
    }

    public boolean Gh0(DoFavoriteEvent doFavoriteEvent, int i, String str, String str2, String str3) {
        return C96787m0.m124254h(doFavoriteEvent, i, str, str2, str3, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J60(com.tencent.p014mm.autogen.events.DoFavoriteEvent r22, int r23, java.util.List<p434ig.C98672d> r24, java.util.List<com.tencent.p014mm.storage.C72963f4> r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "MicroMsg.GetFavDataSource"
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0228
            if (r2 == 0) goto L_0x0228
            boolean r6 = r24.isEmpty()
            if (r6 == 0) goto L_0x0016
            goto L_0x0228
        L_0x0016:
            int r6 = r24.size()
            r7 = 9
            if (r6 <= r7) goto L_0x0027
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 2131825664(0x7f111400, float:1.928419E38)
            r0.f264687l = r1
            goto L_0x0237
        L_0x0027:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = r24.toString()
            r7[r5] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            r7[r4] = r8
            java.lang.String r8 = "do fill album event info(fav simple images), paths %s sourceType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r7)
            te3.kd0 r3 = new te3.kd0
            r3.<init>()
            te3.rd0 r7 = new te3.rd0
            r7.<init>()
            r8 = 0
        L_0x0046:
            int r9 = r24.size()
            if (r8 >= r9) goto L_0x021c
            java.lang.Object r9 = r2.get(r8)
            ig.d r9 = (p434ig.C98672d) r9
            int r10 = r25.size()
            if (r8 >= r10) goto L_0x0061
            r10 = r25
            java.lang.Object r12 = r10.get(r8)
            com.tencent.mm.storage.f4 r12 = (com.tencent.p014mm.storage.C72963f4) r12
            goto L_0x0064
        L_0x0061:
            r10 = r25
            r12 = 0
        L_0x0064:
            if (r12 == 0) goto L_0x0071
            java.lang.String r15 = r12.mo108768t()
            long r16 = r12.getMsgId()
            r13 = r16
            goto L_0x0075
        L_0x0071:
            java.lang.String r15 = ""
            r13 = 0
        L_0x0075:
            te3.sc0 r11 = new te3.sc0
            r11.<init>()
            te3.tc0 r5 = qg2.C101146j.m132601j(r12)
            r11.f299405d = r5
            int r4 = r9.mo55274P()
            if (r4 != r6) goto L_0x00de
            ph0.a r4 = ph0.C100792a.f295260a
            java.lang.String r6 = r4.mo140234e(r9, r15, r13)
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r16 == 0) goto L_0x0097
            r18 = r8
            r8 = r3
            goto L_0x01c7
        L_0x0097:
            te3.rc0 r2 = new te3.rc0
            r2.<init>()
            r10 = 2
            r2.mo141260p(r10)
            r2.f299284V = r6
            r6 = 1
            r2.mo141232F(r6)
            java.lang.String r4 = r4.mo140251w(r9, r15, r13)
            r2.f299286W = r4
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r7.mo141275k(r4)
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r7.mo141279o(r4)
            r7.mo141277m(r1)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.mo141273f(r9)
            java.lang.String r4 = qg2.C101146j.m132605n(r5)
            r2.mo141263s(r4)
            java.lang.String r4 = qg2.C101146j.m132606o(r5)
            r2.mo141264t(r4)
            r2.f299296c1 = r11
            r3.mo141219q(r7)
            java.util.LinkedList<te3.rc0> r4 = r3.f298618f
            r4.add(r2)
            goto L_0x01ac
        L_0x00de:
            int r2 = r9.mo55274P()
            r4 = 4
            if (r2 != r4) goto L_0x01ac
            ph0.a r2 = ph0.C100792a.f295260a
            java.lang.String r6 = r2.mo140234e(r9, r15, r13)
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r4 = r10.getPath()
            r18 = r8
            if (r4 == 0) goto L_0x0112
            r8 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r8, r8)
            java.lang.String r8 = r10.getPath()
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0112
            android.net.Uri$Builder r8 = r10.buildUpon()
            android.net.Uri$Builder r4 = r8.path(r4)
            android.net.Uri r10 = r4.build()
        L_0x0112:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r8 = 0
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r10, r8)
            boolean r8 = r4.mo177810a()
            if (r8 != 0) goto L_0x0120
            goto L_0x012a
        L_0x0120:
            com.tencent.mm.vfs.FileSystem$c r8 = r4.f348991a
            java.lang.String r4 = r4.f348992b
            com.tencent.mm.vfs.b0 r4 = r8.mo119945q(r4)
            if (r4 != 0) goto L_0x012e
        L_0x012a:
            r8 = r3
            r16 = 0
            goto L_0x0133
        L_0x012e:
            r8 = r3
            long r3 = r4.f250473c
            r16 = r3
        L_0x0133:
            java.lang.Class<pb1.j1> r3 = pb1.C100718j1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            pb1.j1 r3 = (pb1.C100718j1) r3
            r4 = 1
            long r19 = r3.mo128216vR(r4)
            int r3 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x014d
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 2131825811(0x7f111493, float:1.9284489E38)
            r0.f264687l = r1
            goto L_0x0237
        L_0x014d:
            java.lang.String r2 = r2.mo140251w(r9, r15, r13)
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            r3.f299284V = r6
            r4 = 4
            r3.mo141260p(r4)
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106454o(r6)
            r3.mo141261q(r4)
            r3.f299286W = r2
            long r13 = r9.mo55278R()
            int r2 = (int) r13
            r3.mo141266v(r2)
            java.lang.String r2 = r9.mo55272O()
            r3.mo141246U(r2)
            java.lang.String r2 = r9.mo55258H()
            r3.mo141265u(r2)
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r7.mo141275k(r2)
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r7.mo141279o(r2)
            r7.mo141277m(r1)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.mo141273f(r9)
            java.lang.String r2 = qg2.C101146j.m132605n(r5)
            r3.mo141263s(r2)
            java.lang.String r2 = qg2.C101146j.m132606o(r5)
            r3.mo141264t(r2)
            r3.f299296c1 = r11
            r8.mo141219q(r7)
            java.util.LinkedList<te3.rc0> r2 = r8.f298618f
            r2.add(r3)
            goto L_0x01af
        L_0x01ac:
            r18 = r8
            r8 = r3
        L_0x01af:
            java.lang.String r2 = r12.mo108768t()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x01ca
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131834443(0x7f11364b, float:1.9301996E38)
            java.lang.String r2 = r2.getString(r3)
            r8.mo141220r(r2)
        L_0x01c7:
            r5 = 1
            r9 = 0
            goto L_0x01f8
        L_0x01ca:
            java.lang.String r2 = eb0.C75592q0.m90783m()
            java.lang.Class<d62.i> r3 = d62.C75339i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            d62.i r3 = (d62.C75339i) r3
            java.lang.String r4 = r12.mo101010p2()
            java.lang.String r3 = r3.mo62514P1(r4)
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L_0x01fa
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131825738(0x7f11144a, float:1.928434E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r9 = 0
            r6[r9] = r2
            java.lang.String r2 = r3.getString(r4, r6)
            r8.mo141220r(r2)
        L_0x01f8:
            r10 = 2
            goto L_0x0211
        L_0x01fa:
            r5 = 1
            r9 = 0
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131825737(0x7f111449, float:1.9284339E38)
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r2
            r11[r5] = r3
            java.lang.String r2 = r4.getString(r6, r11)
            r8.mo141220r(r2)
        L_0x0211:
            int r2 = r18 + 1
            r3 = r8
            r4 = 1
            r5 = 0
            r6 = 2
            r8 = r2
            r2 = r24
            goto L_0x0046
        L_0x021c:
            r8 = r3
            r5 = 1
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 14
            r0.f264678c = r1
            r0.f264676a = r8
            r4 = 1
            goto L_0x0238
        L_0x0228:
            r9 = 0
            java.lang.String r1 = "fill favorite album event fail, event is null or paths is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
            if (r0 == 0) goto L_0x0237
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 2131825657(0x7f1113f9, float:1.9284176E38)
            r0.f264687l = r1
        L_0x0237:
            r4 = 0
        L_0x0238:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96788n0.J60(com.tencent.mm.autogen.events.DoFavoriteEvent, int, java.util.List, java.util.List):boolean");
    }

    /* renamed from: NB */
    public boolean mo135056NB(DoFavoriteEvent doFavoriteEvent, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        int i3 = i2;
        String str12 = str;
        String str13 = str3;
        if (doFavoriteEvent2 == null) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
            return false;
        }
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141260p(5);
        rc02.f299286W = str7;
        rc02.mo141242Q(str3);
        rc02.mo141266v(i2);
        rc02.mo141246U(str);
        String str14 = str2;
        rc02.mo141265u(str2);
        rc02.mo141239N(str11);
        C101849uc0 uc02 = new C101849uc0();
        uc02.f299614h = str12;
        uc02.f299611e = i3;
        uc02.f299610d = str13;
        uc02.f299613g = str5;
        uc02.f299612f = str4;
        uc02.f299615i = str6;
        uc02.f299616j = str9;
        uc02.f299617n = str10;
        rc02.f299306h1 = uc02;
        rd02.mo141275k(str8);
        rd02.mo141279o(C75592q0.m90789s());
        int i4 = i;
        rd02.mo141277m(i);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
        String str15 = rc02.f299297d;
        aVar.f264679d = str15;
        aVar.f264680e = str15;
        aVar.f264676a = kd02;
        aVar.f264678c = 4;
        return true;
    }

    /* renamed from: PN */
    public boolean mo135057PN(DoFavoriteEvent doFavoriteEvent, long j) {
        return C96787m0.m124255i(doFavoriteEvent, j);
    }

    /* renamed from: Vn */
    public boolean mo135058Vn(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        return C96787m0.m124256j(doFavoriteEvent, f4Var);
    }

    public boolean Zp0(DoFavoriteEvent doFavoriteEvent, int i, String str, String str2, int i2, String str3, String str4) {
        return C96787m0.m124253g(doFavoriteEvent, i, str, str2, i2, str3, str4, true);
    }

    /* renamed from: mH */
    public boolean mo135060mH(DoFavoriteEvent doFavoriteEvent, int i, String str) {
        return C96787m0.m124252f(doFavoriteEvent, i, str);
    }

    public boolean to0(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var, C98674g gVar, String str) {
        if (doFavoriteEvent == null || f4Var == null || gVar == null || gVar.mo55348A().isEmpty()) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite album event fail, event is null or paths is empty");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            return false;
        }
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        if (aVar.f264676a == null) {
            aVar.f264676a = new C101801kd0();
            doFavoriteEvent.f264674d.f264676a.mo141219q(C96787m0.m124260n(f4Var));
        }
        doFavoriteEvent.f264674d.f264680e = gVar.mo55349B();
        doFavoriteEvent.f264674d.f264679d = gVar.mo55352E();
        String valueOf = String.valueOf(f4Var.mo108774y2());
        if (TextUtils.isEmpty(str)) {
            str = valueOf;
        }
        doFavoriteEvent.f264674d.f264676a.f298616d.mo141278n(str);
        C101835rd0 rd02 = doFavoriteEvent.f264674d.f264676a.f298616d;
        rd02.f299358s = String.valueOf(f4Var.getMsgId());
        rd02.f299359t = true;
        doFavoriteEvent.f264674d.f264676a.mo141210d(127);
        doFavoriteEvent.f264674d.f264678c = 23;
        C99862a g3 = ((C99865e0) C98597b.m128130c3((C98598e) C86312j.m106911c(C99864d.class), C99865e0.class)).mo139217g3(f4Var.getMsgId());
        for (int i = 0; i < gVar.mo55348A().size(); i++) {
            C99893q qVar = null;
            if (i < g3.f292635g.mo139238A().size()) {
                qVar = g3.f292635g.mo139238A().get(i);
            }
            doFavoriteEvent.f264674d.f264676a.f298618f.add(C96787m0.m124259m(doFavoriteEvent, f4Var, gVar.mo55348A().get(i), qVar, str, i));
        }
        return doFavoriteEvent.f264674d.f264687l == 0;
    }

    /* renamed from: wO */
    public String mo135062wO(int i) {
        return i == 1 ? "speex" : i == 4 ? "silk" : "amr";
    }
}
