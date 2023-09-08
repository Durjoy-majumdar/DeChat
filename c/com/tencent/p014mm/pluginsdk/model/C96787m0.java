package com.tencent.p014mm.pluginsdk.model;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import ht1.C60166f;
import i40.C98597b;
import i40.C98598e;
import mh0.C99862a;
import mh0.C99864d;
import mh0.C99865e0;
import mh0.C99893q;
import p1081gi.C98121d;
import p158gt.C98201k;
import p434ig.C98672d;
import p434ig.C98674g;
import p763ym.C53543s;
import p823sg.C90193h;
import pb1.C100718j1;
import ph0.C100792a;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C64682rk1;
import te3.C64719t23;
import te3.C64878zd0;
import te3.C90431pc0;
import th0.C101888l;
import u73.C90621r0;

/* renamed from: com.tencent.mm.pluginsdk.model.m0 */
public final class C96787m0 {
    /* renamed from: a */
    public static C101834rc0 m124247a(C101834rc0 rc02, boolean z) {
        C101834rc0 rc03 = new C101834rc0();
        C101841sc0 sc02 = new C101841sc0();
        C101846tc0 tc02 = new C101846tc0();
        C101846tc0 tc03 = rc02.f299296c1.f299405d;
        if (tc03.f299520g) {
            tc02.mo141306m(tc03.f299519f);
        }
        if (tc03.f299522i) {
            tc02.mo141310q(tc03.f299521h);
        }
        if (tc03.f299526p) {
            tc02.mo141308o(tc03.f299525o);
        }
        if (tc03.f299516E) {
            tc02.f299515D = tc03.f299515D;
            tc02.f299516E = true;
        }
        tc02.mo141309p(1);
        tc02.f299527q = Util.nowMilliSecond();
        tc02.f299528r = true;
        sc02.f299405d = tc02;
        sc02.f299421w = rc02.f299296c1.f299421w;
        rc03.f299296c1 = sc02;
        rc03.mo141263s(rc02.f299298d1);
        rc03.mo141264t(rc02.f299302f1);
        rc03.f299245B1 = rc02.f299245B1;
        rc03.f299247C1 = rc02.f299247C1;
        rc03.f299249D1 = true;
        rc03.f299340y1 = rc02.f299340y1;
        rc03.f299337x1 = rc02.f299337x1;
        rc03.f299342z1 = rc02.f299342z1;
        rc03.f299243A1 = rc02.f299243A1;
        rc03.f299334w1 = rc02.f299334w1;
        rc03.mo141232F(true);
        rc03.mo141231E(true);
        rc03.mo141228A(rc02.f299308i1);
        rc03.mo141262r(rc02.f299322q1);
        rc03.mo141268x(rc02.f299266M);
        rc03.mo141270z(rc02.f299271P);
        rc03.mo141269y(rc02.f299276R);
        rc03.mo141245T(rc02.f299288X);
        rc03.mo141244S(rc02.f299292Z);
        rc03.mo141243R(rc02.f299336x0);
        rc03.mo141266v(rc02.f299338y);
        if (z) {
            rc03.mo141257m(rc02.f299280T);
        }
        return rc03;
    }

    /* renamed from: b */
    public static C101834rc0 m124248b(C101834rc0 rc02, int i, boolean z) {
        C101834rc0 a = m124247a(rc02, z);
        a.mo141260p(i);
        C101841sc0 sc02 = rc02.f299296c1;
        if (!(sc02 == null || sc02.f299408g == null)) {
            C101793jd0 jd02 = new C101793jd0();
            jd02.mo141207o(rc02.f299296c1.f299408g.f298511d);
            jd02.mo141204l(rc02.f299296c1.f299408g.f298513f);
            jd02.mo141208p(rc02.f299296c1.f299408g.f298519o);
            jd02.mo141205m(rc02.f299296c1.f299408g.f298517j);
            jd02.mo141206n(rc02.f299296c1.f299408g.f298515h);
            a.f299296c1.f299408g = jd02;
        }
        return a;
    }

    /* renamed from: c */
    public static void m124249c(C101834rc0 rc02, C101834rc0 rc03) {
        rc02.mo141240O(rc03.f299246C);
        rc02.mo141241P(rc03.f299250E);
        rc02.mo141242Q(rc03.f299242A);
        rc02.mo141246U(rc03.f299297d);
        rc02.mo141265u(rc03.f299301f);
    }

    /* renamed from: d */
    public static boolean m124250d(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        C72963f4 f4Var2 = f4Var;
        Class cls = C53543s.class;
        Class cls2 = C98201k.class;
        C101801kd0 kd02 = new C101801kd0();
        kd02.mo141219q(m124260n(f4Var));
        String content = f4Var.getContent();
        if (content == null) {
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.coa;
            return false;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
        if (u == null) {
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.coa;
            return false;
        }
        doFavoriteEvent2.f264674d.f264676a = kd02;
        C101835rd0 rd02 = kd02.f298616d;
        rd02.mo141272d(u.f195562d);
        rd02.f299344B = u.f195634v;
        rd02.f299345C = true;
        int i = u.f195582i;
        if (i == 19) {
            doFavoriteEvent2.f264674d.f264677b = new C64878zd0();
            return m124251e(doFavoriteEvent2, u, kd02, f4Var2, false);
        } else if (i != 20) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    if (!C86709a0.m107535s().mo121147n()) {
                        doFavoriteEvent2.f264674d.f264687l = C0966R.string.cog;
                        return false;
                    }
                    C72683d qq = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100154qq(u.f195606o);
                    C101834rc0 rc02 = new C101834rc0();
                    m124262p(rc02, f4Var2);
                    rc02.mo141229B(f4Var.mo108774y2());
                    if (qq != null) {
                        rc02.f299284V = qq.field_fileFullPath;
                    }
                    String v102 = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).v10(f4Var.mo108765s2(), true);
                    if (C86013q1.m106450k(v102)) {
                        rc02.f299286W = v102;
                    }
                    rc02.mo141260p(2);
                    rc02.mo141246U(u.f195570f);
                    rc02.mo141265u(u.f195574g);
                    rc02.mo141230C(C75569c4.m90685r(f4Var2.f230724G));
                    kd02.f298618f.add(rc02);
                    doFavoriteEvent2.f264674d.f264678c = 2;
                    return true;
                case 3:
                    kd02.f298618f.add(m124261o(f4Var2, u, 7));
                    doFavoriteEvent2.f264674d.f264678c = 7;
                    return true;
                case 4:
                    C101834rc0 o = m124261o(f4Var2, u, 4);
                    kd02.mo141220r(o.f299297d);
                    kd02.mo141212j(o.f299301f);
                    o.mo141230C(C75569c4.m90685r(f4Var2.f230724G));
                    kd02.f298618f.add(o);
                    doFavoriteEvent2.f264674d.f264678c = 4;
                    return true;
                case 5:
                    String str = u.f195586j;
                    if (str == null || str.equals("")) {
                        doFavoriteEvent2.f264674d.f264687l = C0966R.string.co5;
                        return false;
                    }
                    kd02.f298616d.mo141276l(u.f195586j);
                    kd02.f298616d.mo141278n("");
                    C101756ae0 ae02 = new C101756ae0();
                    ae02.mo141197q(u.f195646y);
                    ae02.mo141195o(u.f195483E2);
                    C90621r0 r0Var = (C90621r0) u.mo93555w(C90621r0.class);
                    if (r0Var != null && !Util.isNullOrNil(r0Var.f260345b)) {
                        StringBuilder sb = new StringBuilder();
                        r0Var.mo7616c(sb, (C68070l.C68072b) null, (String) null, (C98121d) null, 0, 0);
                        ae02.f297877u = sb.toString();
                        ae02.f297878v = true;
                    }
                    kd02.mo141221s(ae02);
                    kd02.mo141216n(C92721n.m116877e(f4Var2, ae02));
                    C101834rc0 o2 = m124261o(f4Var2, u, 5);
                    kd02.f298618f.add(o2);
                    kd02.mo141220r(o2.f299297d);
                    kd02.mo141212j(o2.f299301f);
                    doFavoriteEvent2.f264674d.f264678c = 5;
                    return true;
                case 6:
                    if (!C86709a0.m107535s().mo121147n()) {
                        doFavoriteEvent2.f264674d.f264687l = C0966R.string.cog;
                        return false;
                    }
                    C72683d qq4 = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100154qq(u.f195606o);
                    C101834rc0 rc03 = new C101834rc0();
                    if (qq4 != null) {
                        rc03.f299284V = qq4.field_fileFullPath;
                    }
                    m124262p(rc03, f4Var2);
                    rc03.mo141229B(f4Var.mo108774y2());
                    rc03.mo141260p(8);
                    rc03.mo141261q(u.f195602n);
                    String v103 = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).v10(f4Var.mo108765s2(), true);
                    if (Util.isNullOrNil(v103)) {
                        rc03.mo141232F(true);
                    }
                    if (C86013q1.m106450k(v103)) {
                        rc03.f299286W = v103;
                    }
                    rc03.mo141246U(u.f195570f);
                    rc03.mo141265u(u.f195574g);
                    kd02.f298618f.add(rc03);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
                    aVar.f264680e = u.f195570f;
                    aVar.f264678c = 8;
                    return true;
                case 7:
                    String str2 = u.f195606o;
                    if (str2 == null || str2.length() == 0) {
                        doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360422co2;
                    } else if (!C86709a0.m107535s().mo121147n()) {
                        doFavoriteEvent2.f264674d.f264687l = C0966R.string.cog;
                        return false;
                    }
                    doFavoriteEvent2.f264674d.f264687l = C0966R.string.co9;
                    return false;
                default:
                    int i2 = 21;
                    switch (i) {
                        case 10:
                            C101793jd0 jd02 = new C101793jd0();
                            jd02.mo141207o(u.f195570f);
                            jd02.mo141204l(u.f195574g);
                            jd02.mo141208p(u.f195551a0);
                            jd02.mo141205m(u.f195555b0);
                            jd02.mo141206n(u.f195646y);
                            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent2.f264674d;
                            aVar2.f264679d = u.f195570f;
                            aVar2.f264680e = u.f195574g;
                            aVar2.f264678c = 10;
                            kd02.mo141218p(jd02);
                            return true;
                        case 13:
                            C101793jd0 jd03 = new C101793jd0();
                            jd03.mo141207o(u.f195570f);
                            jd03.mo141204l(u.f195574g);
                            jd03.mo141208p(u.f195575g0);
                            jd03.mo141205m(u.f195579h0);
                            jd03.mo141206n(u.f195646y);
                            DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent2.f264674d;
                            aVar3.f264679d = u.f195570f;
                            aVar3.f264680e = u.f195574g;
                            aVar3.f264678c = 11;
                            kd02.mo141218p(jd03);
                            return true;
                        case 24:
                            doFavoriteEvent2.f264674d.f264677b = new C64878zd0();
                            return m124251e(doFavoriteEvent2, u, kd02, f4Var2, true);
                        case 33:
                        case 36:
                            C90431pc0 pc02 = new C90431pc0();
                            pc02.f259741d = u.f195573f2;
                            pc02.f259742e = u.f195577g2;
                            pc02.f259743f = u.f195653z2;
                            pc02.f259744g = u.f195471B2;
                            pc02.f259746i = u.f195569e2;
                            pc02.f259747j = u.f195638w;
                            pc02.f259749o = u.f195605n2;
                            pc02.f259745h = u.f195581h2;
                            C80995a aVar4 = (C80995a) u.mo93555w(C80995a.class);
                            if (aVar4 != null) {
                                pc02.f259753s = aVar4.f237906o;
                                pc02.f259751q = aVar4.f237910s;
                                pc02.f259752r = aVar4.f237911t;
                            }
                            pc02.f259748n = u.f195467A2;
                            C101834rc0 rc04 = new C101834rc0();
                            m124262p(rc04, f4Var2);
                            rc04.mo141229B(f4Var.mo108774y2());
                            rc04.mo141260p(19);
                            String v104 = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).v10(f4Var.mo108765s2(), true);
                            if (Util.isNullOrNil(v104)) {
                                rc04.mo141232F(true);
                            }
                            if (C86013q1.m106450k(v104)) {
                                rc04.f299286W = v104;
                            }
                            rc04.mo141246U(u.f195570f);
                            rc04.mo141265u(u.f195574g);
                            kd02.f298618f.add(rc04);
                            kd02.mo141220r(u.f195570f);
                            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                                i2 = 22;
                            }
                            rd02.mo141277m(i2);
                            DoFavoriteEvent.C92474a aVar5 = doFavoriteEvent2.f264674d;
                            aVar5.f264679d = u.f195570f;
                            aVar5.f264680e = u.f195574g;
                            aVar5.f264678c = 19;
                            kd02.f298610I = pc02;
                            kd02.f298611J = true;
                            return true;
                        case 51:
                            C60166f fVar = (C60166f) u.mo93555w(C60166f.class);
                            if (fVar == null) {
                                return false;
                            }
                            C64682rk1 rk12 = fVar.f171710b;
                            kd02.mo141220r(fVar.mo85179g() + MMApplicationContext.getContext().getString(C0966R.string.cri));
                            kd02.mo141212j(rk12.f185187h);
                            kd02.mo141214l(rk12);
                            doFavoriteEvent2.f264674d.f264678c = 20;
                            return true;
                        case 53:
                        case 57:
                        case 60:
                            break;
                        case 76:
                            kd02.f298618f.add(m124261o(f4Var2, u, 29));
                            doFavoriteEvent2.f264674d.f264678c = 21;
                            return true;
                        case 98:
                            C98674g gVar = new C98674g();
                            gVar.mo141099d(content);
                            DoFavoriteEvent.C92474a aVar6 = doFavoriteEvent2.f264674d;
                            if (aVar6.f264676a == null) {
                                aVar6.f264676a = new C101801kd0();
                                doFavoriteEvent2.f264674d.f264676a.mo141219q(m124260n(f4Var));
                            }
                            DoFavoriteEvent.C92474a aVar7 = doFavoriteEvent2.f264674d;
                            aVar7.f264680e = gVar.f289363g;
                            aVar7.f264679d = gVar.f289362f;
                            String valueOf = String.valueOf(f4Var.mo108774y2());
                            doFavoriteEvent2.f264674d.f264676a.f298616d.mo141278n(valueOf);
                            C101835rd0 rd03 = doFavoriteEvent2.f264674d.f264676a.f298616d;
                            rd03.f299358s = String.valueOf(f4Var.getMsgId());
                            rd03.f299359t = true;
                            doFavoriteEvent2.f264674d.f264676a.mo141210d(127);
                            doFavoriteEvent2.f264674d.f264678c = 23;
                            C99862a g3 = ((C99865e0) C98597b.m128130c3((C98598e) C86312j.m106911c(C99864d.class), C99865e0.class)).mo139217g3(f4Var.getMsgId());
                            int i3 = 0;
                            while (i3 < gVar.f289364h.size()) {
                                doFavoriteEvent2.f264674d.f264676a.f298618f.add(m124259m(doFavoriteEvent, f4Var, gVar.f289364h.get(i3), i3 < g3.f292635g.mo139238A().size() ? g3.f292635g.mo139238A().get(i3) : null, valueOf, i3));
                                i3++;
                            }
                            return doFavoriteEvent2.f264674d.f264687l == 0;
                        default:
                            doFavoriteEvent2.f264674d.f264687l = C0966R.string.co9;
                            return false;
                    }
            }
            DoFavoriteEvent.C92474a aVar8 = doFavoriteEvent2.f264674d;
            aVar8.f264676a = kd02;
            aVar8.f264680e = u.f195570f;
            aVar8.f264678c = 1;
            return true;
        } else {
            C101850ud0 ud02 = new C101850ud0();
            ud02.mo141318n(u.f195570f);
            ud02.mo141315k(u.f195574g);
            ud02.mo141316l(u.f195567e0);
            ud02.mo141317m(u.f195646y);
            DoFavoriteEvent.C92474a aVar9 = doFavoriteEvent2.f264674d;
            aVar9.f264679d = u.f195570f;
            aVar9.f264680e = u.f195574g;
            aVar9.f264678c = 15;
            kd02.f298604C = ud02;
            kd02.f298605D = true;
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0488, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f265028e.f265050c) == false) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x048a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.GetFavDataSource", "cloneVideoItem:not record plugin ? get paths error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x048f, code lost:
        r8.mo141231E(false);
        r8.f299284V = r11.f265028e.f265049b;
        r8.f299296c1 = r10.f299296c1;
        r8.mo141232F(false);
        r8.f299286W = r11.f265028e.f265050c;
        r8.mo141266v(r10.f299338y);
        r0.f264674d.f264677b.f186674g++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x04b6, code lost:
        r11 = m124247a(r10, r3);
        r11.mo141260p(14);
        r1 = r10.f299296c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x04c1, code lost:
        if (r1 == null) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x04c5, code lost:
        if (r1.f299409h == null) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x04c7, code lost:
        r1 = new te3.C101850ud0();
        r1.mo141318n(r10.f299296c1.f299409h.f299618d);
        r1.mo141315k(r10.f299296c1.f299409h.f299620f);
        r1.mo141316l(r10.f299296c1.f299409h.f299624j);
        r1.mo141317m(r10.f299296c1.f299409h.f299622h);
        r11.f299296c1.f299409h = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04f4, code lost:
        r0.f264674d.f264677b.f186684t++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04fd, code lost:
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x028d, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x044d, code lost:
        r1 = r21.getMsgId();
        r8 = m124247a(r10, r3);
        m124249c(r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x045c, code lost:
        if (r10.f299258I != 15) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x045e, code lost:
        r8.mo141260p(15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0462, code lost:
        r8.mo141260p(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0466, code lost:
        r11 = new com.tencent.p014mm.autogen.events.RecordOperationEvent();
        r13 = r11.f265027d;
        r13.f265029a = 1;
        r13.f265031c = r10;
        r13.f265032d = r1;
        r11.publish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x047e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f265028e.f265049b) == false) goto L_0x048f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m124251e(com.tencent.p014mm.autogen.events.DoFavoriteEvent r18, com.tencent.p014mm.message.C68070l.C68072b r19, te3.C101801kd0 r20, com.tencent.p014mm.storage.C72963f4 r21, boolean r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            com.tencent.mm.autogen.events.RecordOperationEvent r4 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r4.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r5 = r4.f265027d
            r6 = 0
            r5.f265029a = r6
            java.lang.String r7 = r1.f195571f0
            r5.f265030b = r7
            r4.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r4 = r4.f265028e
            te3.dp3 r4 = r4.f265048a
            java.lang.String r5 = "MicroMsg.GetFavDataSource"
            if (r4 != 0) goto L_0x002e
            java.lang.String r1 = "fill favorite event fail, parse record msg null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 2131825667(0x7f111403, float:1.9284197E38)
            r0.f264687l = r1
            return r6
        L_0x002e:
            java.lang.String r7 = r4.f227153d
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L_0x008f
            java.lang.String r7 = r21.mo108768t()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x0050
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r10 = 2131834443(0x7f11364b, float:1.9301996E38)
            java.lang.String r7 = r7.getString(r10)
            r4.f227153d = r7
            goto L_0x008f
        L_0x0050:
            java.lang.String r7 = eb0.C75592q0.m90783m()
            java.lang.Class<d62.i> r10 = d62.C75339i.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r11 = r21.mo101010p2()
            java.lang.String r10 = r10.mo62514P1(r11)
            boolean r11 = r7.equals(r10)
            if (r11 == 0) goto L_0x007c
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131825738(0x7f11144a, float:1.928434E38)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r6] = r7
            java.lang.String r7 = r10.getString(r11, r12)
            r4.f227153d = r7
            goto L_0x008f
        L_0x007c:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 2131825737(0x7f111449, float:1.9284339E38)
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r6] = r7
            r13[r9] = r10
            java.lang.String r7 = r11.getString(r12, r13)
            r4.f227153d = r7
        L_0x008f:
            java.lang.String r7 = r4.f227153d
            java.lang.String r1 = r1.f195570f
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r1)
            r2.mo141220r(r1)
            java.util.LinkedList<te3.rc0> r1 = r4.f227155f
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L_0x00a1:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x065d
            java.lang.Object r10 = r1.next()
            te3.rc0 r10 = (te3.C101834rc0) r10
            int r12 = r7 + 1
            int r13 = r21.mo108769t2()
            java.lang.String r14 = "%d$%d"
            r15 = 3
            if (r13 != r9) goto L_0x0105
            java.lang.String r13 = r21.mo108768t()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r13 != 0) goto L_0x00ee
            java.lang.String r13 = r21.mo108768t()
            java.lang.String r11 = "filehelper"
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x00cf
            goto L_0x00ee
        L_0x00cf:
            java.lang.Object[] r11 = new java.lang.Object[r15]
            java.lang.String r13 = r21.mo108768t()
            r11[r6] = r13
            long r13 = r21.mo108774y2()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r11[r9] = r13
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r8] = r7
            java.lang.String r7 = "%s#%d$%d"
            java.lang.String r7 = java.lang.String.format(r7, r11)
            goto L_0x011b
        L_0x00ee:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            long r16 = r21.mo108774y2()
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            r11[r6] = r13
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r9] = r7
            java.lang.String r7 = java.lang.String.format(r14, r11)
            goto L_0x011b
        L_0x0105:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            long r16 = r21.mo108774y2()
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            r11[r6] = r13
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r9] = r7
            java.lang.String r7 = java.lang.String.format(r14, r11)
        L_0x011b:
            int r11 = r10.f299258I
            r13 = 19
            if (r11 == r13) goto L_0x05c1
            r13 = 20
            if (r11 == r13) goto L_0x05b2
            r13 = 22
            if (r11 == r13) goto L_0x0596
            java.lang.String r13 = "cloneMusicItem:not record plugin ? get paths error"
            r14 = 29
            if (r11 == r14) goto L_0x0536
            r14 = 31
            if (r11 == r14) goto L_0x0525
            r14 = 35
            if (r11 == r14) goto L_0x0500
            java.lang.String r14 = "cloneImgItem:not record plugin ? get paths error"
            switch(r11) {
                case 1: goto L_0x03d3;
                case 2: goto L_0x0383;
                case 3: goto L_0x0325;
                case 4: goto L_0x0321;
                case 5: goto L_0x0290;
                case 6: goto L_0x01f6;
                case 7: goto L_0x01a1;
                case 8: goto L_0x0149;
                default: goto L_0x013c;
            }
        L_0x013c:
            r6 = r1
            r15 = 2
            switch(r11) {
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ec;
                case 12: goto L_0x04b6;
                default: goto L_0x0141;
            }
        L_0x0141:
            switch(r11) {
                case 14: goto L_0x04b6;
                case 15: goto L_0x044d;
                case 16: goto L_0x0434;
                case 17: goto L_0x040a;
                default: goto L_0x0144;
            }
        L_0x0144:
            int r12 = r12 + -1
            r8 = 0
            goto L_0x0642
        L_0x0149:
            long r13 = r21.getMsgId()
            te3.rc0 r11 = m124247a(r10, r3)
            m124249c(r11, r10)
            r15 = 8
            r11.mo141260p(r15)
            com.tencent.mm.autogen.events.RecordOperationEvent r15 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r15.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r8 = r15.f265027d
            r8.f265029a = r9
            r8.f265031c = r10
            r8.f265032d = r13
            r15.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r8 = r15.f265028e
            java.lang.String r8 = r8.f265049b
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0182
            com.tencent.mm.autogen.events.RecordOperationEvent$b r8 = r15.f265028e
            java.lang.String r8 = r8.f265050c
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0182
            java.lang.String r8 = "cloneFileItem:not record plugin ? get paths error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
        L_0x0182:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r8 = r15.f265028e
            java.lang.String r13 = r8.f265049b
            r11.f299284V = r13
            java.lang.String r8 = r8.f265050c
            r11.f299286W = r8
            r11.mo141231E(r6)
            java.lang.String r8 = r10.f299262K
            r11.mo141261q(r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r8 = r0.f264674d
            te3.zd0 r8 = r8.f264677b
            int r13 = r8.f186678n
            int r13 = r13 + r9
            r8.f186678n = r13
            r6 = r1
            r15 = 2
            goto L_0x04fd
        L_0x01a1:
            long r14 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            m124249c(r8, r10)
            java.lang.String r11 = r10.f299251E1
            r8.mo141235I(r11)
            java.lang.String r11 = r10.f299255G1
            r8.mo141236J(r11)
            r11 = 7
            r8.mo141260p(r11)
            com.tencent.mm.autogen.events.RecordOperationEvent r11 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r11.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r6 = r11.f265027d
            r6.f265029a = r9
            r6.f265031c = r10
            r6.f265032d = r14
            r11.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r6 = r11.f265028e
            java.lang.String r6 = r6.f265049b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x01e1
            com.tencent.mm.autogen.events.RecordOperationEvent$b r6 = r11.f265028e
            java.lang.String r6 = r6.f265050c
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x01e1
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r13)
        L_0x01e1:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r6 = r11.f265028e
            java.lang.String r6 = r6.f265050c
            r8.f299286W = r6
            r6 = 0
            r8.mo141232F(r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r0.f264674d
            te3.zd0 r6 = r6.f264677b
            int r11 = r6.f186677j
            int r11 = r11 + r9
            r6.f186677j = r11
            goto L_0x028d
        L_0x01f6:
            te3.rc0 r8 = m124247a(r10, r3)
            r6 = 6
            r8.mo141260p(r6)
            te3.sc0 r6 = r10.f299296c1
            if (r6 == 0) goto L_0x0284
            te3.zc0 r6 = r6.f299406e
            if (r6 == 0) goto L_0x0284
            te3.zc0 r6 = new te3.zc0
            r6.<init>()
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299956j
            r6.mo141339v(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            double r13 = r11.f299952f
            r6.mo141340w(r13)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            double r13 = r11.f299950d
            r6.mo141341x(r13)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            int r11 = r11.f299954h
            r6.mo141323F(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299958o
            r6.mo141322E(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299960q
            r6.mo141321C(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299962s
            r6.mo141343z(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299964u
            r6.mo141342y(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299966w
            r6.mo141319A(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            float r11 = r11.f299968y
            r6.mo141320B(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            boolean r11 = r11.f299944A
            r6.mo141338u(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299946C
            r6.mo141336s(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.zc0 r11 = r11.f299406e
            java.lang.String r11 = r11.f299948E
            r6.mo141337t(r11)
            te3.sc0 r11 = r8.f299296c1
            r11.f299406e = r6
        L_0x0284:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r0.f264674d
            te3.zd0 r6 = r6.f264677b
            int r11 = r6.f186676i
            int r11 = r11 + r9
            r6.f186676i = r11
        L_0x028d:
            r6 = r1
            goto L_0x0642
        L_0x0290:
            long r13 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            m124249c(r8, r10)
            r6 = 5
            r8.mo141260p(r6)
            com.tencent.mm.autogen.events.RecordOperationEvent r6 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r6.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r11 = r6.f265027d
            r11.f265029a = r9
            r11.f265031c = r10
            r11.f265032d = r13
            r6.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r11 = r6.f265028e
            java.lang.String r11 = r11.f265049b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x02c8
            com.tencent.mm.autogen.events.RecordOperationEvent$b r11 = r6.f265028e
            java.lang.String r11 = r11.f265050c
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x02c8
            java.lang.String r11 = "cloneUrlItem:not record plugin ? get paths error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
        L_0x02c8:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r6 = r6.f265028e
            java.lang.String r6 = r6.f265050c
            r8.f299286W = r6
            r6 = 0
            r8.mo141232F(r6)
            te3.sc0 r6 = r10.f299296c1
            if (r6 == 0) goto L_0x0316
            te3.ae0 r6 = r6.f299407f
            if (r6 == 0) goto L_0x0316
            te3.ae0 r6 = new te3.ae0
            r6.<init>()
            te3.sc0 r11 = r10.f299296c1
            te3.ae0 r11 = r11.f299407f
            java.lang.String r11 = r11.f297863d
            r6.mo141198r(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.ae0 r11 = r11.f299407f
            java.lang.String r11 = r11.f297865f
            r6.mo141194n(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.ae0 r11 = r11.f299407f
            java.lang.String r11 = r11.f297869j
            r6.mo141197q(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.ae0 r11 = r11.f299407f
            int r11 = r11.f297871o
            r6.mo141196p(r11)
            te3.sc0 r11 = r10.f299296c1
            te3.ae0 r11 = r11.f299407f
            java.lang.String r13 = r11.f297867h
            r6.f297867h = r13
            r6.f297868i = r9
            int r11 = r11.f297879w
            r6.mo141195o(r11)
            te3.sc0 r11 = r8.f299296c1
            r11.f299407f = r6
        L_0x0316:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r0.f264674d
            te3.zd0 r6 = r6.f264677b
            int r11 = r6.f186675h
            int r11 = r11 + r9
            r6.f186675h = r11
            goto L_0x028d
        L_0x0321:
            r6 = r1
            r15 = 2
            goto L_0x044d
        L_0x0325:
            r6 = r1
            long r1 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            r8.mo141260p(r15)
            java.lang.String r11 = r10.f299308i1
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0377
            com.tencent.mm.autogen.events.RecordOperationEvent r11 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r11.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r13 = r11.f265027d
            r13.f265029a = r9
            r13.f265031c = r10
            r13.f265032d = r1
            r11.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265049b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0360
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0360
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
        L_0x0360:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265049b
            r8.f299284V = r1
            int r1 = r10.f299338y
            r8.mo141266v(r1)
            r8.mo141232F(r9)
            r1 = 0
            r8.mo141231E(r1)
            java.lang.String r1 = r10.f299262K
            r8.mo141261q(r1)
        L_0x0377:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186673f
            int r2 = r2 + r9
            r1.f186673f = r2
            r15 = 2
            goto L_0x0642
        L_0x0383:
            r6 = r1
            long r1 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            r15 = 2
            r8.mo141260p(r15)
            com.tencent.mm.autogen.events.RecordOperationEvent r11 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r11.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r13 = r11.f265027d
            r13.f265029a = r9
            r13.f265031c = r10
            r13.f265032d = r1
            r11.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265049b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x03b7
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x03b7
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
        L_0x03b7:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r2 = r1.f265049b
            r8.f299284V = r2
            java.lang.String r1 = r1.f265050c
            r8.f299286W = r1
            r1 = 0
            r8.mo141232F(r1)
            r8.mo141231E(r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186672e
            int r2 = r2 + r9
            r1.f186672e = r2
            goto L_0x0642
        L_0x03d3:
            r6 = r1
            r15 = 2
            te3.rc0 r8 = m124247a(r10, r3)
            r8.mo141260p(r9)
            java.lang.String r1 = r10.f299301f
            r8.mo141265u(r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186671d
            int r2 = r2 + r9
            r1.f186671d = r2
            goto L_0x0642
        L_0x03ec:
            te3.rc0 r11 = m124248b(r10, r11, r3)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186681q
            int r2 = r2 + r9
            r1.f186681q = r2
            goto L_0x04fd
        L_0x03fb:
            te3.rc0 r11 = m124248b(r10, r11, r3)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186680p
            int r2 = r2 + r9
            r1.f186680p = r2
            goto L_0x04fd
        L_0x040a:
            te3.rc0 r11 = m124247a(r10, r3)
            java.lang.String r1 = r10.f299297d
            r11.mo141246U(r1)
            java.lang.String r1 = r10.f299301f
            r11.mo141265u(r1)
            r1 = 0
            r11.mo141231E(r1)
            r1 = 17
            r11.mo141260p(r1)
            java.lang.String r1 = r10.f299326s1
            r11.mo141234H(r1)
            java.lang.String r1 = r10.f299326s1
            long r13 = r21.getMsgId()
            te3.kd0 r1 = com.tencent.p014mm.pluginsdk.model.C96785k0.m124245b(r1, r7, r13)
            r11.f299275Q1 = r1
            goto L_0x04fd
        L_0x0434:
            te3.rc0 r11 = m124247a(r10, r3)
            r1 = 16
            r11.mo141260p(r1)
            java.lang.String r1 = r10.f299301f
            r11.mo141265u(r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186685u
            int r2 = r2 + r9
            r1.f186685u = r2
            goto L_0x04fd
        L_0x044d:
            long r1 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            m124249c(r8, r10)
            int r11 = r10.f299258I
            r13 = 15
            if (r11 != r13) goto L_0x0462
            r8.mo141260p(r13)
            goto L_0x0466
        L_0x0462:
            r11 = 4
            r8.mo141260p(r11)
        L_0x0466:
            com.tencent.mm.autogen.events.RecordOperationEvent r11 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r11.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r13 = r11.f265027d
            r13.f265029a = r9
            r13.f265031c = r10
            r13.f265032d = r1
            r11.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265049b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x048f
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x048f
            java.lang.String r1 = "cloneVideoItem:not record plugin ? get paths error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
        L_0x048f:
            r1 = 0
            r8.mo141231E(r1)
            com.tencent.mm.autogen.events.RecordOperationEvent$b r2 = r11.f265028e
            java.lang.String r2 = r2.f265049b
            r8.f299284V = r2
            te3.sc0 r2 = r10.f299296c1
            r8.f299296c1 = r2
            r8.mo141232F(r1)
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            r8.f299286W = r1
            int r1 = r10.f299338y
            r8.mo141266v(r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186674g
            int r2 = r2 + r9
            r1.f186674g = r2
            goto L_0x0642
        L_0x04b6:
            te3.rc0 r11 = m124247a(r10, r3)
            r1 = 14
            r11.mo141260p(r1)
            te3.sc0 r1 = r10.f299296c1
            if (r1 == 0) goto L_0x04f4
            te3.ud0 r1 = r1.f299409h
            if (r1 == 0) goto L_0x04f4
            te3.ud0 r1 = new te3.ud0
            r1.<init>()
            te3.sc0 r2 = r10.f299296c1
            te3.ud0 r2 = r2.f299409h
            java.lang.String r2 = r2.f299618d
            r1.mo141318n(r2)
            te3.sc0 r2 = r10.f299296c1
            te3.ud0 r2 = r2.f299409h
            java.lang.String r2 = r2.f299620f
            r1.mo141315k(r2)
            te3.sc0 r2 = r10.f299296c1
            te3.ud0 r2 = r2.f299409h
            java.lang.String r2 = r2.f299624j
            r1.mo141316l(r2)
            te3.sc0 r2 = r10.f299296c1
            te3.ud0 r2 = r2.f299409h
            java.lang.String r2 = r2.f299622h
            r1.mo141317m(r2)
            te3.sc0 r2 = r11.f299296c1
            r2.f299409h = r1
        L_0x04f4:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186684t
            int r2 = r2 + r9
            r1.f186684t = r2
        L_0x04fd:
            r8 = r11
            goto L_0x0642
        L_0x0500:
            r6 = r1
            r15 = 2
            te3.rc0 r1 = m124247a(r10, r3)
            java.lang.String r2 = r10.f299297d
            r1.mo141246U(r2)
            java.lang.String r2 = r10.f299301f
            r1.mo141265u(r2)
            r1.mo141260p(r14)
            java.lang.String r2 = r10.f299326s1
            r1.mo141234H(r2)
            java.lang.String r2 = r10.f299326s1
            long r13 = r21.getMsgId()
            te3.kd0 r2 = com.tencent.p014mm.pluginsdk.model.C96785k0.m124245b(r2, r7, r13)
            r1.f299275Q1 = r2
            goto L_0x0533
        L_0x0525:
            r6 = r1
            r15 = 2
            te3.rc0 r1 = m124247a(r10, r3)
            r1.mo141260p(r14)
            java.lang.String r2 = r10.f299301f
            r1.mo141265u(r2)
        L_0x0533:
            r8 = r1
            goto L_0x0642
        L_0x0536:
            r6 = r1
            r15 = 2
            long r1 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            m124249c(r8, r10)
            te3.sc0 r11 = r10.f299296c1
            if (r11 == 0) goto L_0x054d
            te3.sc0 r15 = r8.f299296c1
            te3.t23 r11 = r11.f299401C
            r15.f299401C = r11
        L_0x054d:
            java.lang.String r11 = r10.f299251E1
            r8.mo141235I(r11)
            java.lang.String r11 = r10.f299255G1
            r8.mo141236J(r11)
            r8.mo141260p(r14)
            com.tencent.mm.autogen.events.RecordOperationEvent r11 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r11.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r14 = r11.f265027d
            r14.f265029a = r9
            r14.f265031c = r10
            r14.f265032d = r1
            r11.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265049b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0581
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0581
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r13)
        L_0x0581:
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            r8.f299286W = r1
            r1 = 0
            r8.mo141232F(r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            te3.zd0 r1 = r1.f264677b
            int r2 = r1.f186677j
            int r2 = r2 + r9
            r1.f186677j = r2
            goto L_0x0642
        L_0x0596:
            r6 = r1
            te3.rc0 r8 = m124247a(r10, r3)
            java.lang.String r1 = r10.f299297d
            r8.mo141246U(r1)
            java.lang.String r1 = r10.f299301f
            r8.mo141265u(r1)
            te3.sc0 r1 = r8.f299296c1
            te3.sc0 r2 = r10.f299296c1
            te3.rk1 r2 = r2.f299423y
            r1.f299423y = r2
            r8.mo141260p(r13)
            goto L_0x0642
        L_0x05b2:
            r6 = r1
            te3.rc0 r8 = m124247a(r10, r3)
            r8.mo141260p(r13)
            int r1 = r10.f299338y
            r8.mo141266v(r1)
            goto L_0x0642
        L_0x05c1:
            r6 = r1
            long r1 = r21.getMsgId()
            te3.rc0 r8 = m124247a(r10, r3)
            java.lang.String r11 = r10.f299297d
            r8.mo141246U(r11)
            java.lang.String r11 = r10.f299301f
            r8.mo141265u(r11)
            r8.mo141260p(r13)
            com.tencent.mm.autogen.events.RecordOperationEvent r11 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r11.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r13 = r11.f265027d
            r13.f265029a = r9
            r13.f265031c = r10
            r13.f265032d = r1
            r11.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x05f7
            java.lang.String r1 = "cloneAppBrandItem:not record plugin ? get paths error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x0601
        L_0x05f7:
            r1 = 0
            r8.mo141232F(r1)
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r11.f265028e
            java.lang.String r1 = r1.f265050c
            r8.f299286W = r1
        L_0x0601:
            te3.sc0 r1 = r10.f299296c1
            if (r1 == 0) goto L_0x0642
            te3.pc0 r1 = r1.f299420v
            if (r1 == 0) goto L_0x0642
            te3.pc0 r1 = new te3.pc0
            r1.<init>()
            te3.sc0 r2 = r10.f299296c1
            te3.pc0 r2 = r2.f299420v
            java.lang.String r11 = r2.f259741d
            r1.f259741d = r11
            java.lang.String r11 = r2.f259742e
            r1.f259742e = r11
            int r11 = r2.f259743f
            r1.f259743f = r11
            java.lang.String r11 = r2.f259744g
            r1.f259744g = r11
            int r11 = r2.f259745h
            r1.f259745h = r11
            java.lang.String r11 = r2.f259746i
            r1.f259746i = r11
            java.lang.String r11 = r2.f259747j
            r1.f259747j = r11
            int r11 = r2.f259748n
            r1.f259748n = r11
            int r11 = r2.f259753s
            r1.f259753s = r11
            int r11 = r2.f259749o
            r1.f259749o = r11
            java.lang.String r2 = r2.f259751q
            r1.f259751q = r2
            te3.sc0 r2 = r8.f299296c1
            r2.f299420v = r1
        L_0x0642:
            if (r8 == 0) goto L_0x0654
            r8.mo141259o(r7)
            java.lang.String r1 = r10.f299259I1
            r8.mo141230C(r1)
            r1 = r20
            java.util.LinkedList<te3.rc0> r2 = r1.f298618f
            r2.add(r8)
            goto L_0x0656
        L_0x0654:
            r1 = r20
        L_0x0656:
            r2 = r1
            r1 = r6
            r7 = r12
            r6 = 0
            r8 = 2
            goto L_0x00a1
        L_0x065d:
            java.util.LinkedList<te3.rc0> r1 = r4.f227155f
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            te3.rc0 r1 = (te3.C101834rc0) r1
            boolean r1 = com.tencent.p014mm.plugin.fav.p047ui.C93594f1.m118177e(r1)
            if (r1 == 0) goto L_0x0673
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 18
            r0.f264678c = r1
            goto L_0x0679
        L_0x0673:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            r1 = 14
            r0.f264678c = r1
        L_0x0679:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96787m0.m124251e(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.message.l$b, te3.kd0, com.tencent.mm.storage.f4, boolean):boolean");
    }

    /* renamed from: f */
    public static boolean m124252f(DoFavoriteEvent doFavoriteEvent, int i, String str) {
        if (doFavoriteEvent == null || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        Log.m105925i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", str, Integer.valueOf(i));
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141260p(2);
        rc02.f299284V = str;
        rc02.mo141257m(C90193h.m112878f((rc02.toString() + 2 + System.currentTimeMillis()).getBytes()));
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 27;
        aVar.f264840f = rc02;
        favoriteOperationEvent.publish();
        String str2 = favoriteOperationEvent.f264834e.f264858d;
        BitmapUtil.createThumbNail(str, 150, 150, Bitmap.CompressFormat.JPEG, 90, str2, true);
        rc02.f299286W = str2;
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(i);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264679d = rc02.f299297d;
        aVar2.f264676a = kd02;
        aVar2.f264678c = 2;
        return true;
    }

    /* renamed from: g */
    public static boolean m124253g(DoFavoriteEvent doFavoriteEvent, int i, String str, String str2, int i2, String str3, String str4, boolean z) {
        C86001b0 q;
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        String str5 = str;
        String str6 = str3;
        String str7 = str4;
        if (doFavoriteEvent2 == null || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent2 != null) {
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        Log.m105919d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", str6, str7, str5, Integer.valueOf(i));
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        long j = 0;
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
            j = q.f250473c;
        }
        if (j > ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128216vR(z)) {
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360438cs3;
            return false;
        }
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rc02.f299284V = str5;
        rc02.mo141260p(4);
        rc02.mo141261q(C86013q1.m106454o(str));
        rc02.f299286W = str2;
        rc02.mo141266v(i2);
        rc02.mo141246U(str6);
        rc02.mo141265u(str7);
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        int i3 = i;
        rd02.mo141277m(i);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
        String str8 = rc02.f299297d;
        aVar.f264679d = str8;
        aVar.f264680e = str8;
        aVar.f264676a = kd02;
        aVar.f264678c = 4;
        return true;
    }

    /* renamed from: h */
    public static boolean m124254h(DoFavoriteEvent doFavoriteEvent, int i, String str, String str2, String str3, boolean z) {
        C86001b0 q;
        if (doFavoriteEvent == null || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        Log.m105919d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", str2, str3, str, Integer.valueOf(i));
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        long j = 0;
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
            j = q.f250473c;
        }
        if (j > ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128210aN(z)) {
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360438cs3;
            return false;
        }
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rc02.f299284V = str;
        rc02.mo141260p(8);
        rc02.mo141261q(C86013q1.m106454o(str));
        rc02.mo141232F(true);
        rc02.mo141246U(str2);
        rc02.mo141265u(str3);
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(i);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        String str4 = rc02.f299297d;
        aVar.f264679d = str4;
        aVar.f264680e = str4;
        aVar.f264676a = kd02;
        aVar.f264678c = 8;
        return true;
    }

    /* renamed from: i */
    public static boolean m124255i(DoFavoriteEvent doFavoriteEvent, long j) {
        return m124256j(doFavoriteEvent, ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: com.tencent.mm.modelimage.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v39, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r3v16, types: [int] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r10v41 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r10v46 */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02a9, code lost:
        if (r5 <= 0) goto L_0x02ab;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m124256j(com.tencent.p014mm.autogen.events.DoFavoriteEvent r17, com.tencent.p014mm.storage.C72963f4 r18) {
        /*
            r1 = r17
            java.lang.Class<rz.s> r0 = p682rz.C101488s.class
            java.lang.String r2 = "MicroMsg.GetFavDataSource"
            r3 = 0
            if (r1 == 0) goto L_0x0724
            if (r18 != 0) goto L_0x000d
            goto L_0x0724
        L_0x000d:
            com.tencent.mm.storage.f4 r4 = com.tencent.p014mm.storage.C72963f4.m85593l3(r18)
            boolean r5 = r4.mo100993e4()
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x005f
            te3.kd0 r0 = new te3.kd0
            r0.<init>()
            te3.rd0 r2 = m124260n(r4)
            r0.mo141219q(r2)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            r2.f264676a = r0
            java.lang.String r0 = r4.getContent()
            r2.f264680e = r0
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264678c = r7
            java.lang.String r0 = r0.f264680e
            int r0 = com.tencent.p014mm.p136ui.tools.C45078p0.m49927f(r0)
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r5 = "InputLimitFavText"
            java.lang.String r2 = r2.mo107405c(r5)
            r5 = 100000(0x186a0, float:1.4013E-40)
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)
            int r2 = r2 * 2
            if (r0 <= r2) goto L_0x070f
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r2 = 2131825807(0x7f11148f, float:1.928448E38)
            r0.f264687l = r2
            goto L_0x0710
        L_0x005f:
            boolean r5 = r4.mo100995g4()
            r8 = 0
            r10 = 0
            r11 = 4
            if (r5 == 0) goto L_0x0186
            java.lang.Class<dn.t> r0 = p492dn.C75415t.class
            te3.kd0 r2 = new te3.kd0
            r2.<init>()
            te3.rd0 r5 = m124260n(r4)
            r2.mo141219q(r5)
            te3.rc0 r5 = new te3.rc0
            r5.<init>()
            m124262p(r5, r4)
            long r12 = r4.mo108774y2()
            r5.mo141229B(r12)
            java.lang.String r12 = r4.mo108768t()
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85803I5(r12)
            if (r12 == 0) goto L_0x00e4
            java.lang.String r12 = r4.mo108765s2()
            java.lang.String r13 = ng2.C11163e.m11041a()
            java.lang.String r14 = "recbiz_"
            java.lang.String r15 = ".rec"
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.FilePathGenerator.genPath(r13, r14, r12, r15, r6)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x00a8
            goto L_0x00e1
        L_0x00a8:
            android.net.Uri r13 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)
            java.lang.String r14 = r13.getPath()
            if (r14 == 0) goto L_0x00cc
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r3, r3)
            java.lang.String r15 = r13.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00cc
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r13 = r13.path(r14)
            android.net.Uri r13 = r13.build()
        L_0x00cc:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r10 = r14.mo177799l(r13, r10)
            boolean r13 = r10.mo177810a()
            if (r13 != 0) goto L_0x00d9
            goto L_0x00e0
        L_0x00d9:
            com.tencent.mm.vfs.FileSystem$c r13 = r10.f348991a
            java.lang.String r10 = r10.f348992b
            r13.mo119948x(r10)
        L_0x00e0:
            r10 = r12
        L_0x00e1:
            r5.f299284V = r10
            goto L_0x00f4
        L_0x00e4:
            di3.d r10 = di3.C86312j.m106911c(r0)
            dn.t r10 = (p492dn.C75415t) r10
            java.lang.String r12 = r4.mo108765s2()
            java.lang.String r10 = r10.mo91610mf(r12)
            r5.f299284V = r10
        L_0x00f4:
            r10 = 3
            r5.mo141260p(r10)
            r5.mo141232F(r7)
            di3.d r0 = di3.C86312j.m106911c(r0)
            dn.t r0 = (p492dn.C75415t) r0
            java.lang.String r12 = r4.mo108765s2()
            kd0.d r0 = r0.w20(r12)
            if (r0 != 0) goto L_0x010d
            goto L_0x0710
        L_0x010d:
            int r0 = r0.getFormat()
            if (r0 != r7) goto L_0x0117
            java.lang.String r0 = "speex"
            goto L_0x011f
        L_0x0117:
            if (r0 != r11) goto L_0x011d
            java.lang.String r0 = "silk"
            goto L_0x011f
        L_0x011d:
            java.lang.String r0 = "amr"
        L_0x011f:
            r5.mo141261q(r0)
            java.lang.String r0 = r4.getContent()
            java.lang.String r12 = "\n"
            boolean r12 = r0.endsWith(r12)     // Catch:{ Exception -> 0x0168 }
            if (r12 == 0) goto L_0x0137
            int r12 = r0.length()     // Catch:{ Exception -> 0x0168 }
            int r12 = r12 - r7
            java.lang.String r0 = r0.substring(r3, r12)     // Catch:{ Exception -> 0x0168 }
        L_0x0137:
            java.lang.String r12 = ":"
            java.lang.String[] r0 = r0.split(r12)     // Catch:{ Exception -> 0x0168 }
            int r12 = r0.length     // Catch:{ Exception -> 0x0168 }
            if (r12 != r11) goto L_0x0149
            r11 = r0[r3]     // Catch:{ Exception -> 0x0168 }
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85811N4(r11)     // Catch:{ Exception -> 0x0168 }
            if (r11 == 0) goto L_0x0149
            r3 = 1
        L_0x0149:
            int r11 = r0.length     // Catch:{ Exception -> 0x0168 }
            if (r11 <= r3) goto L_0x014e
            r11 = r0[r3]     // Catch:{ Exception -> 0x0168 }
        L_0x014e:
            int r11 = r0.length     // Catch:{ Exception -> 0x0168 }
            int r12 = r3 + 1
            if (r11 <= r12) goto L_0x015a
            r11 = r0[r12]     // Catch:{ Exception -> 0x0168 }
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r8)     // Catch:{ Exception -> 0x0168 }
            goto L_0x015b
        L_0x015a:
            r11 = r8
        L_0x015b:
            int r13 = r0.length     // Catch:{ Exception -> 0x0168 }
            int r3 = r3 + r6
            if (r13 <= r3) goto L_0x0166
            r0 = r0[r3]     // Catch:{ Exception -> 0x0168 }
            java.lang.String r3 = "1"
            r0.equals(r3)     // Catch:{ Exception -> 0x0168 }
        L_0x0166:
            r8 = r11
            goto L_0x016f
        L_0x0168:
            java.lang.String r0 = "MicroMsg.VoiceContent"
            java.lang.String r3 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
        L_0x016f:
            int r0 = (int) r8
            r5.mo141266v(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r5)
            r2.mo141211f(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264676a = r2
            r0.f264678c = r10
            goto L_0x070f
        L_0x0186:
            boolean r5 = r4.mo100982U3()
            r12 = 2131825667(0x7f111403, float:1.9284197E38)
            if (r5 == 0) goto L_0x0279
            te3.kd0 r0 = new te3.kd0
            r0.<init>()
            te3.rd0 r5 = m124260n(r4)
            r0.mo141219q(r5)
            java.lang.String r5 = r4.getContent()
            java.lang.String r6 = "msg"
            java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r6, r10)
            if (r5 == 0) goto L_0x0273
            te3.zc0 r6 = new te3.zc0     // Catch:{ Exception -> 0x0260 }
            r6.<init>()     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$label"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141339v(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$x"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x0260 }
            r6.mo141340w(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$y"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x0260 }
            r6.mo141341x(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$scale"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0260 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0260 }
            r6.mo141323F(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$poiname"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141322E(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$poiid"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141321C(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$poiCategoryTips"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141343z(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$poiBusinessHour"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141342y(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$poiPhone"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141319A(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$poiPriceTips"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            float r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r8)     // Catch:{ Exception -> 0x0260 }
            r6.mo141320B(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$isFromPoiList"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r8, r3)     // Catch:{ Exception -> 0x0260 }
            r6.mo141338u(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$buildingId"
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0260 }
            r6.mo141336s(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r8 = ".msg.location.$floorName"
            java.lang.Object r5 = r5.get(r8)     // Catch:{ Exception -> 0x0260 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0260 }
            r6.mo141337t(r5)     // Catch:{ Exception -> 0x0260 }
            r0.mo141215m(r6)     // Catch:{ Exception -> 0x0260 }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d     // Catch:{ Exception -> 0x0260 }
            r6 = 6
            r5.f264678c = r6     // Catch:{ Exception -> 0x0260 }
            r5.f264676a = r0     // Catch:{ Exception -> 0x0260 }
            goto L_0x070f
        L_0x0260:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r0 = r0.toString()
            r5[r3] = r0
            java.lang.String r0 = "parse failed, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r5)
        L_0x0273:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r12
            goto L_0x0710
        L_0x0279:
            boolean r5 = r4.mo100979R3()
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x038e
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            long r11 = r4.getMsgId()
            int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x02a3
            di3.d r5 = di3.C86312j.m106911c(r0)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            java.lang.String r10 = r4.mo108768t()
            long r11 = r4.getMsgId()
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            com.tencent.mm.modelimage.k r10 = r5.mo127200vP(r10, r11)
        L_0x02a3:
            if (r10 == 0) goto L_0x02ab
            long r11 = r10.f267374a
            int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x02cb
        L_0x02ab:
            long r11 = r4.mo108774y2()
            int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x02cb
            di3.d r5 = di3.C86312j.m106911c(r0)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            java.lang.String r8 = r4.mo108768t()
            long r9 = r4.mo108774y2()
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            com.tencent.mm.modelimage.k r10 = r5.mo127168NQ(r8, r9)
        L_0x02cb:
            if (r10 != 0) goto L_0x02db
            java.lang.String r0 = "getImgDataPath: try get imgInfo fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r2 = 2131825663(0x7f1113ff, float:1.9284189E38)
            r0.f264687l = r2
            goto L_0x0710
        L_0x02db:
            te3.kd0 r2 = new te3.kd0
            r2.<init>()
            te3.rd0 r3 = m124260n(r4)
            r2.mo141219q(r3)
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            m124262p(r3, r4)
            r3.mo141260p(r6)
            long r8 = r4.mo108774y2()
            r3.mo141229B(r8)
            di3.d r5 = di3.C86312j.m106911c(r0)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            java.lang.Class<gt.l> r8 = p158gt.C76053l.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            gt.l r8 = (p158gt.C76053l) r8
            java.lang.String r8 = r8.mo106262y8(r10)
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            java.lang.String r5 = r5.mo127174TY(r8, r13, r13, r7)
            r3.f299284V = r5
            boolean r5 = r10.mo127145p()
            if (r5 == 0) goto L_0x035c
            di3.d r5 = di3.C86312j.m106911c(r0)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            int r8 = r10.f267390q
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            com.tencent.mm.modelimage.k r5 = r5.mo127173TO(r8)
            int r8 = r5.f267377d
            int r5 = r5.f267376c
            if (r8 <= r5) goto L_0x035c
            di3.d r5 = di3.C86312j.m106911c(r0)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "SERVERID://"
            r8.append(r9)
            long r9 = r4.mo108774y2()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            java.lang.String r5 = r5.mo127174TY(r8, r13, r13, r7)
            r3.f299284V = r5
        L_0x035c:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r5 = r4.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.v10(r5, r7)
            r3.f299286W = r0
            java.lang.String r0 = r4.f230724G
            java.lang.String r0 = eb0.C75569c4.m90685r(r0)
            r3.mo141230C(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r3)
            r2.mo141211f(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264676a = r2
            r0.f264678c = r6
            goto L_0x070f
        L_0x038e:
            boolean r5 = r4.mo100994f4()
            if (r5 != 0) goto L_0x059c
            boolean r5 = r4.mo100989b4()
            if (r5 == 0) goto L_0x039c
            goto L_0x059c
        L_0x039c:
            boolean r5 = r4.mo100983V3()
            if (r5 == 0) goto L_0x043f
            java.lang.String r5 = r4.getContent()
            java.lang.String r6 = r4.mo108775z2()
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r6)
            if (r5 != 0) goto L_0x03b7
            java.lang.String r0 = "doFillMpVideoEventInfo content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0710
        L_0x03b7:
            te3.kd0 r6 = new te3.kd0
            r6.<init>()
            te3.rd0 r8 = m124260n(r4)
            r6.mo141219q(r8)
            te3.rc0 r8 = new te3.rc0
            r8.<init>()
            m124262p(r8, r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r9 = r4.mo108765s2()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r0 = r0.mo137729r(r9)
            r8.f299286W = r0
            java.lang.String r0 = r8.f299284V
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106454o(r0)
            r8.mo141261q(r0)
            long r9 = r4.mo108774y2()
            r8.mo141229B(r9)
            r8.f299284V = r13
            java.lang.String r0 = r5.f195646y
            r8.mo141267w(r0)
            te3.ad0 r0 = com.tencent.p014mm.message.C92721n.m116879g(r4)
            if (r0 != 0) goto L_0x0405
            java.lang.String r0 = "doFillMpVideoEventInfo favMpMsgItem is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0710
        L_0x0405:
            int r2 = r0.f297853i
            r8.mo141266v(r2)
            java.lang.String r2 = r5.f195570f
            r8.mo141246U(r2)
            java.lang.String r2 = r5.f195586j
            r8.mo141242Q(r2)
            r8.mo141231E(r7)
            r8.mo141232F(r7)
            te3.sc0 r2 = new te3.sc0
            r2.<init>()
            boolean r3 = r4.mo100983V3()
            if (r3 == 0) goto L_0x0427
            r2.f299422x = r0
        L_0x0427:
            r8.f299296c1 = r2
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r8)
            r6.mo141211f(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264676a = r6
            r0.f264678c = r11
            r8.mo141260p(r11)
            goto L_0x070f
        L_0x043f:
            boolean r0 = r4.mo100967F3()
            r5 = 2131825665(0x7f111401, float:1.9284193E38)
            if (r0 == 0) goto L_0x056b
            te3.kd0 r0 = new te3.kd0
            r0.<init>()
            te3.rd0 r6 = m124260n(r4)
            r0.mo141219q(r6)
            java.lang.Class<gw0.b> r8 = gw0.C76073b.class
            di3.d r8 = di3.C86312j.m106911c(r8)     // Catch:{ Exception -> 0x0551 }
            gw0.b r8 = (gw0.C76073b) r8     // Catch:{ Exception -> 0x0551 }
            long r9 = r4.getMsgId()     // Catch:{ Exception -> 0x0551 }
            java.lang.String r11 = r4.getContent()     // Catch:{ Exception -> 0x0551 }
            s90.f r8 = r8.mo94597JZ(r9, r11)     // Catch:{ Exception -> 0x0551 }
            java.util.LinkedList<s90.j> r9 = r8.f226295i     // Catch:{ Exception -> 0x0551 }
            java.lang.String r10 = r8.f226292f     // Catch:{ Exception -> 0x0551 }
            r6.f299344B = r10     // Catch:{ Exception -> 0x0551 }
            r6.f299345C = r7     // Catch:{ Exception -> 0x0551 }
            if (r9 == 0) goto L_0x0565
            int r10 = r9.size()     // Catch:{ Exception -> 0x0551 }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r11 = r1.f264674d     // Catch:{ Exception -> 0x0551 }
            int r11 = r11.f264682g     // Catch:{ Exception -> 0x0551 }
            if (r10 <= r11) goto L_0x0565
            java.lang.String r10 = "favorite biz msg, index is %d"
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0551 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0551 }
            r14[r3] = r11     // Catch:{ Exception -> 0x0551 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r14)     // Catch:{ Exception -> 0x0551 }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r1.f264674d     // Catch:{ Exception -> 0x0551 }
            int r10 = r10.f264682g     // Catch:{ Exception -> 0x0551 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0551 }
            s90.j r9 = (s90.C77630j) r9     // Catch:{ Exception -> 0x0551 }
            java.lang.String r10 = r9.f226336r     // Catch:{ Exception -> 0x0551 }
            sg.g<java.lang.Long, s90.i> r11 = com.tencent.p014mm.message.C92721n.f266840a     // Catch:{ Exception -> 0x0551 }
            boolean r10 = kb0.C9576e.m9260a(r10)     // Catch:{ Exception -> 0x0551 }
            if (r10 == 0) goto L_0x04a3
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d     // Catch:{ Exception -> 0x0551 }
            r0.f264687l = r5     // Catch:{ Exception -> 0x0551 }
            goto L_0x0710
        L_0x04a3:
            java.lang.String r5 = r9.f226326e     // Catch:{ Exception -> 0x0551 }
            r6.mo141276l(r5)     // Catch:{ Exception -> 0x0551 }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d     // Catch:{ Exception -> 0x0551 }
            int r5 = r5.f264682g     // Catch:{ Exception -> 0x0551 }
            if (r5 <= 0) goto L_0x04b1
            r6.mo141278n(r13)     // Catch:{ Exception -> 0x0551 }
        L_0x04b1:
            te3.rc0 r5 = new te3.rc0     // Catch:{ Exception -> 0x0551 }
            r5.<init>()     // Catch:{ Exception -> 0x0551 }
            java.lang.String r6 = r9.f226325d     // Catch:{ Exception -> 0x0551 }
            r5.mo141246U(r6)     // Catch:{ Exception -> 0x0551 }
            java.lang.String r6 = r9.f226332n     // Catch:{ Exception -> 0x0551 }
            r5.mo141265u(r6)     // Catch:{ Exception -> 0x0551 }
            m124262p(r5, r4)     // Catch:{ Exception -> 0x0551 }
            long r10 = r4.mo108774y2()     // Catch:{ Exception -> 0x0551 }
            r5.mo141229B(r10)     // Catch:{ Exception -> 0x0551 }
            java.lang.String r6 = com.tencent.p014mm.message.C92721n.m116882j(r9)     // Catch:{ Exception -> 0x0551 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0551 }
            if (r10 == 0) goto L_0x04f0
            java.lang.Class<ln.g> r10 = p196ln.C76706g.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x0551 }
            ln.g r10 = (p196ln.C76706g) r10     // Catch:{ Exception -> 0x0551 }
            ln.n r10 = r10.mo106832eg()     // Catch:{ Exception -> 0x0551 }
            java.lang.String r11 = r4.mo108768t()     // Catch:{ Exception -> 0x0551 }
            com.tencent.mm.modelavatar.o r10 = (com.tencent.p014mm.modelavatar.C68098o) r10     // Catch:{ Exception -> 0x0551 }
            com.tencent.mm.modelavatar.n r10 = r10.mo93607Lo(r11)     // Catch:{ Exception -> 0x0551 }
            if (r10 == 0) goto L_0x04f0
            java.lang.String r6 = r10.mo93594c()     // Catch:{ Exception -> 0x0551 }
        L_0x04f0:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0551 }
            if (r10 != 0) goto L_0x0516
            java.lang.String r10 = p243tn.C14050a.m13405b(r6)     // Catch:{ Exception -> 0x0551 }
            r5.f299286W = r10     // Catch:{ Exception -> 0x0551 }
            r5.mo141232F(r3)     // Catch:{ Exception -> 0x0551 }
            java.lang.String r10 = r5.f299286W     // Catch:{ Exception -> 0x0551 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0551 }
            if (r10 != 0) goto L_0x050f
            java.lang.String r10 = r5.f299286W     // Catch:{ Exception -> 0x0551 }
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x0551 }
            if (r10 != 0) goto L_0x0519
        L_0x050f:
            r5.mo141267w(r6)     // Catch:{ Exception -> 0x0551 }
            r5.mo141232F(r7)     // Catch:{ Exception -> 0x0551 }
            goto L_0x0519
        L_0x0516:
            r5.mo141232F(r7)     // Catch:{ Exception -> 0x0551 }
        L_0x0519:
            r5.mo141231E(r7)     // Catch:{ Exception -> 0x0551 }
            r10 = 5
            r5.mo141260p(r10)     // Catch:{ Exception -> 0x0551 }
            java.util.LinkedList<te3.rc0> r11 = r0.f298618f     // Catch:{ Exception -> 0x0551 }
            r11.add(r5)     // Catch:{ Exception -> 0x0551 }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d     // Catch:{ Exception -> 0x0551 }
            r5.f264676a = r0     // Catch:{ Exception -> 0x0551 }
            java.lang.String r11 = r9.f226325d     // Catch:{ Exception -> 0x0551 }
            r5.f264680e = r11     // Catch:{ Exception -> 0x0551 }
            r5.f264678c = r10     // Catch:{ Exception -> 0x0551 }
            te3.ae0 r5 = new te3.ae0     // Catch:{ Exception -> 0x0551 }
            r5.<init>()     // Catch:{ Exception -> 0x0551 }
            r5.mo141197q(r6)     // Catch:{ Exception -> 0x0551 }
            java.lang.String r6 = r9.f226325d     // Catch:{ Exception -> 0x0551 }
            r5.mo141198r(r6)     // Catch:{ Exception -> 0x0551 }
            java.lang.String r6 = r9.f226332n     // Catch:{ Exception -> 0x0551 }
            r5.mo141194n(r6)     // Catch:{ Exception -> 0x0551 }
            r0.mo141221s(r5)     // Catch:{ Exception -> 0x0551 }
            java.lang.String r6 = r8.f226292f     // Catch:{ Exception -> 0x0551 }
            java.lang.String r8 = r8.f226293g     // Catch:{ Exception -> 0x0551 }
            te3.ad0 r5 = com.tencent.p014mm.message.C92721n.m116878f(r9, r5, r6, r8)     // Catch:{ Exception -> 0x0551 }
            r0.mo141216n(r5)     // Catch:{ Exception -> 0x0551 }
            goto L_0x070f
        L_0x0551:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r13, r5)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getLocalizedMessage()
            r5[r3] = r0
            java.lang.String r0 = "retransmit app msg error : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r5)
        L_0x0565:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r12
            goto L_0x0710
        L_0x056b:
            boolean r0 = r4.mo100975N3()
            if (r0 != 0) goto L_0x0596
            boolean r0 = r4.mo100981T3()
            if (r0 == 0) goto L_0x0578
            goto L_0x0596
        L_0x0578:
            boolean r0 = r4.mo101020w3()
            if (r0 == 0) goto L_0x0590
            boolean r0 = r4.mo101022y3()
            if (r0 == 0) goto L_0x058a
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r5
            goto L_0x0710
        L_0x058a:
            boolean r3 = m124250d(r1, r4)
            goto L_0x0710
        L_0x0590:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r5
            goto L_0x0710
        L_0x0596:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r5
            goto L_0x0710
        L_0x059c:
            java.lang.Class<rz.u> r5 = p682rz.C101491u.class
            te3.kd0 r6 = new te3.kd0
            r6.<init>()
            te3.rd0 r8 = m124260n(r4)
            r6.mo141219q(r8)
            te3.rc0 r8 = new te3.rc0
            r8.<init>()
            m124262p(r8, r4)
            di3.d r9 = di3.C86312j.m106911c(r0)
            rz.s r9 = (p682rz.C101488s) r9
            rz.t r9 = r9.Kj0()
            java.lang.String r10 = r4.mo108765s2()
            hd0.o0 r9 = (hd0.C98410o0) r9
            java.lang.String r9 = r9.mo137729r(r10)
            r8.f299286W = r9
            java.lang.String r9 = r8.f299284V
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106454o(r9)
            r8.mo141261q(r9)
            long r9 = r4.mo108774y2()
            r8.mo141229B(r9)
            long r9 = r4.getMsgId()
            r8.mo141237K(r9)
            boolean r9 = r4.mo100989b4()
            if (r9 == 0) goto L_0x05f1
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r9 = r1.f264674d
            r10 = 16
            r9.f264678c = r10
            r9 = 15
            r8.mo141260p(r9)
            goto L_0x05f8
        L_0x05f1:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r9 = r1.f264674d
            r9.f264678c = r11
            r8.mo141260p(r11)
        L_0x05f8:
            di3.d r9 = di3.C86312j.m106911c(r5)
            rz.u r9 = (p682rz.C101491u) r9
            java.lang.String r10 = r4.mo108765s2()
            hd0.n0 r9 = r9.mo140806Zd(r10)
            r10 = 2131825656(0x7f1113f8, float:1.9284174E38)
            if (r9 != 0) goto L_0x0616
            java.lang.String r0 = "[doFileFavVideoEventInfo] null == info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r10
            goto L_0x0710
        L_0x0616:
            di3.d r11 = di3.C86312j.m106911c(r5)
            rz.u r11 = (p682rz.C101491u) r11
            java.lang.String r12 = r9.f288546N
            hd0.n0 r11 = r11.mo140806Zd(r12)
            if (r11 == 0) goto L_0x063b
            int r12 = r11.f288562i
            r14 = 199(0xc7, float:2.79E-43)
            if (r12 != r14) goto L_0x063b
            java.lang.Object[] r9 = new java.lang.Object[r7]
            int r12 = r11.f288559f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9[r3] = r12
            java.lang.String r12 = "origin video length is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r9)
            r9 = r11
        L_0x063b:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            int r12 = r9.f288559f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r3] = r12
            java.lang.String r12 = "video length is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r11)
            int r11 = r9.f288559f
            long r11 = (long) r11
            java.lang.Class<pb1.j1> r14 = pb1.C100718j1.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            pb1.j1 r14 = (pb1.C100718j1) r14
            long r14 = r14.mo128216vR(r7)
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0667
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r2 = 2131825811(0x7f111493, float:1.9284489E38)
            r0.f264687l = r2
            goto L_0x0710
        L_0x0667:
            boolean r11 = r4.mo100989b4()
            if (r11 == 0) goto L_0x067d
            java.lang.String r11 = r4.mo108765s2()
            boolean r11 = hd0.C98429r0.m127812c(r11)
            if (r11 == 0) goto L_0x067d
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r10
            goto L_0x0710
        L_0x067d:
            boolean r10 = r9.mo137710n()
            if (r10 == 0) goto L_0x06a4
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r10 = r9.mo137700d()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r0 = r0.mo137728q(r10)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r3] = r0
            java.lang.String r3 = "this video had finish download, set orgn path [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r10)
            r8.f299284V = r0
            goto L_0x06ac
        L_0x06a4:
            java.lang.String r0 = "this video had not finish download, set orgn path null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r8.f299284V = r13
        L_0x06ac:
            int r0 = r9.f288566m
            r8.mo141266v(r0)
            java.lang.String r0 = r4.f230724G
            java.lang.String r0 = eb0.C75569c4.m90685r(r0)
            r8.mo141230C(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r8)
            r6.mo141211f(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264676a = r6
            di3.d r0 = di3.C86312j.m106911c(r5)
            rz.u r0 = (p682rz.C101491u) r0
            java.lang.String r2 = r4.mo108765s2()
            hd0.n0 r0 = r0.mo140806Zd(r2)
            java.lang.String r2 = r0.f288536D
            r8.mo141239N(r2)
            te3.tc4 r0 = r0.f288535C
            if (r0 == 0) goto L_0x070f
            java.lang.String r2 = r0.f299543j
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x070f
            te3.uc0 r2 = new te3.uc0
            r2.<init>()
            java.lang.String r3 = r0.f299537d
            r2.f299610d = r3
            int r3 = r0.f299538e
            r2.f299611e = r3
            java.lang.String r3 = r0.f299539f
            r2.f299612f = r3
            java.lang.String r3 = r0.f299540g
            r2.f299613g = r3
            java.lang.String r3 = r0.f299541h
            r2.f299614h = r3
            java.lang.String r3 = r0.f299542i
            r2.f299615i = r3
            java.lang.String r3 = r0.f299543j
            r2.f299616j = r3
            java.lang.String r0 = r0.f299544n
            r2.f299617n = r0
            r8.f299306h1 = r2
        L_0x070f:
            r3 = 1
        L_0x0710:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            java.lang.String r2 = r4.getContent()
            r0.f264681f = r2
            if (r3 != 0) goto L_0x0720
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            int r0 = r0.f264687l
            if (r0 != 0) goto L_0x0723
        L_0x0720:
            com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118400a(r4, r1, r3)
        L_0x0723:
            return r3
        L_0x0724:
            java.lang.String r0 = "fill favorite event fail, event or msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            if (r1 == 0) goto L_0x0732
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825657(0x7f1113f9, float:1.9284176E38)
            r0.f264687l = r1
        L_0x0732:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96787m0.m124256j(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: k */
    public static boolean m124257k(DoFavoriteEvent doFavoriteEvent, Intent intent) {
        Intent intent2 = intent;
        if (doFavoriteEvent == null) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
            return false;
        }
        double doubleExtra = intent2.getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = intent2.getDoubleExtra("kwebmap_lng", 0.0d);
        int intExtra = intent2.getIntExtra("kwebmap_scale", 0);
        String nullAs = Util.nullAs(intent2.getStringExtra("Kwebmap_locaion"), "");
        String stringExtra = intent2.getStringExtra("kPoiName");
        intent2.getCharSequenceExtra("kRemark");
        intent2.getStringArrayListExtra("kTags");
        String nullAs2 = Util.nullAs(intent2.getStringExtra("kPoiid"), "");
        boolean booleanExtra = intent2.getBooleanExtra("KIsFromPoiList", false);
        String nullAs3 = Util.nullAs(intent2.getStringExtra("KPoiCategoryTips"), "");
        String nullAs4 = Util.nullAs(intent2.getStringExtra("kPoiBusinessHour"), "");
        String nullAs5 = Util.nullAs(intent2.getStringExtra("KPoiPhone"), "");
        float floatExtra = intent2.getFloatExtra("KPoiPriceTips", 0.0f);
        String stringExtra2 = intent2.getStringExtra("kBuildingID");
        String stringExtra3 = intent2.getStringExtra("kFloorName");
        C101871zc0 zc02 = new C101871zc0();
        zc02.mo141339v(nullAs);
        zc02.mo141340w(doubleExtra);
        zc02.mo141341x(doubleExtra2);
        zc02.mo141323F(intExtra);
        zc02.mo141322E(stringExtra);
        zc02.mo141321C(nullAs2);
        zc02.mo141338u(booleanExtra);
        zc02.mo141343z(nullAs3);
        zc02.mo141342y(nullAs4);
        zc02.mo141319A(nullAs5);
        zc02.mo141320B(floatExtra);
        zc02.mo141336s(stringExtra2);
        zc02.mo141337t(stringExtra3);
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        String s = C75592q0.m90789s();
        rd02.mo141275k(s);
        rd02.mo141279o(s);
        rd02.mo141277m(6);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141215m(zc02);
        kd02.mo141219q(rd02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264676a = kd02;
        aVar.f264678c = 6;
        return true;
    }

    /* renamed from: l */
    public static boolean m124258l(DoFavoriteEvent doFavoriteEvent, String str, int i) {
        if (doFavoriteEvent == null || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        Log.m105919d("MicroMsg.GetFavDataSource", "do fill event info(fav simple text), %s, sourceType %d", str, Integer.valueOf(i));
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(i);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141219q(rd02);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264680e = str;
        aVar.f264676a = kd02;
        aVar.f264678c = 1;
        return true;
    }

    /* renamed from: m */
    public static C101834rc0 m124259m(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var, C98672d dVar, C99893q qVar, String str, int i) {
        C101834rc0 rc02 = new C101834rc0();
        boolean z = false;
        rc02.mo141259o(String.format("%s$%s", new Object[]{str, Integer.valueOf(i)}));
        rc02.mo141257m(dVar.mo55264K());
        rc02.mo141260p(dVar.mo55274P());
        rc02.mo141270z(dVar.mo55288W());
        rc02.mo141264t(dVar.mo55318l0());
        rc02.mo141263s(dVar.mo55316k0());
        rc02.f299247C1 = dVar.mo55314j0();
        rc02.f299249D1 = true;
        rc02.mo141261q(dVar.mo55262J());
        rc02.mo141237K(f4Var.getMsgId());
        rc02.f299333w = dVar.mo55252E();
        rc02.f299335x = true;
        rc02.mo141265u(dVar.mo55258H());
        rc02.mo141246U(dVar.mo55272O());
        rc02.mo141230C(dVar.mo55294Z());
        rc02.mo141254j(dVar.mo55250D());
        rc02.mo141253f(dVar.mo55248C());
        rc02.mo141268x(dVar.mo55286V());
        rc02.f299270O1 = dVar.mo55282T();
        rc02.f299272P1 = true;
        rc02.mo141269y(dVar.mo55268M());
        rc02.f299267M1 = dVar.mo55336u0();
        rc02.f299269N1 = true;
        rc02.mo141244S(dVar.mo55340w0());
        rc02.mo141245T(dVar.mo55338v0());
        rc02.mo141255k(dVar.mo55254F());
        rc02.mo141256l(dVar.mo55256G());
        rc02.mo141243R(dVar.mo55344y0());
        rc02.mo141266v((int) dVar.mo55278R());
        C100792a aVar = C100792a.f295260a;
        String j = aVar.mo140238j(dVar, f4Var);
        String v = aVar.mo140250v(dVar, f4Var);
        C101888l lVar = C101888l.f300029a;
        if (!(lVar.mo141358h(dVar, f4Var) || lVar.mo141362l(dVar, f4Var)) && lVar.mo141359i(dVar, f4Var)) {
            if (lVar.mo141356f(dVar, f4Var) || lVar.mo141364n(dVar, f4Var)) {
                j = aVar.mo140245q(dVar, f4Var);
                rc02.mo141254j(dVar.mo55302d0());
                rc02.mo141253f(dVar.mo55296a0());
                rc02.mo141268x(dVar.mo55298b0());
                rc02.f299270O1 = dVar.mo55306f0();
                rc02.f299272P1 = true;
                rc02.mo141269y(dVar.mo55300c0());
            }
        }
        if (dVar.mo55274P() == 2) {
            rc02.f299284V = j;
            if (lVar.mo141358h(dVar, f4Var) || lVar.mo141356f(dVar, f4Var)) {
                z = true;
            }
            if (!z) {
                doFavoriteEvent.f264674d.f264687l = -10;
            }
            if (!lVar.mo141363m(dVar, f4Var) && lVar.mo141356f(dVar, f4Var)) {
                rc02.f299267M1 = rc02.f299270O1;
                rc02.f299269N1 = true;
                rc02.mo141245T(rc02.f299266M);
                rc02.mo141255k(rc02.f299329u);
                rc02.mo141256l(rc02.f299325s);
                rc02.mo141243R(rc02.f299276R);
                v = j;
            }
        } else if (dVar.mo55274P() == 4) {
            if (qVar == null || C86013q1.m106451l(qVar.mo55391P()) != dVar.mo55268M()) {
                rc02.f299284V = j;
            } else {
                rc02.f299284V = qVar.mo55391P();
            }
            if (!lVar.mo141361k(dVar, f4Var) || !lVar.mo141363m(dVar, f4Var)) {
                doFavoriteEvent.f264674d.f264687l = -10;
            }
        }
        rc02.f299286W = v;
        return rc02;
    }

    /* renamed from: n */
    public static C101835rd0 m124260n(C72963f4 f4Var) {
        C101835rd0 rd02 = new C101835rd0();
        if (f4Var.mo108769t2() == 1) {
            rd02.mo141275k(C75592q0.m90789s());
            rd02.mo141279o(f4Var.mo108768t());
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                rd02.f299354o = rd02.f299348f;
                rd02.f299355p = true;
            }
        } else {
            rd02.mo141275k(f4Var.mo108768t());
            rd02.mo141279o(C75592q0.m90789s());
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                String substring = f4Var.getContent() != null ? f4Var.getContent().substring(0, Math.max(0, f4Var.getContent().indexOf(58))) : "";
                rd02.f299354o = substring;
                rd02.f299355p = true;
                if (!Util.isNullOrNil(substring) && !f4Var.mo100995g4()) {
                    f4Var.mo108732L2(f4Var.getContent().substring(rd02.f299354o.length() + 1));
                    if (f4Var.getContent().length() > 0 && 10 == f4Var.getContent().charAt(0)) {
                        f4Var.mo108732L2(f4Var.getContent().substring(1));
                    }
                    if (f4Var.mo101015s3()) {
                        if (!Util.isNullOrNil(f4Var.mo108727G2()) && f4Var.mo108727G2().startsWith(rd02.f299354o)) {
                            f4Var.mo108758i3(f4Var.mo108727G2().substring(rd02.f299354o.length() + 1));
                        }
                        if (f4Var.mo108727G2().length() > 0 && 10 == f4Var.mo108727G2().charAt(0)) {
                            f4Var.mo108758i3(f4Var.mo108727G2().substring(1));
                        }
                    }
                }
            }
        }
        rd02.mo141277m(1);
        rd02.mo141273f(f4Var.getCreateTime());
        rd02.f299358s = f4Var.mo108774y2() + "";
        rd02.f299359t = true;
        if (f4Var.mo108774y2() > 0) {
            rd02.mo141278n(f4Var.mo108774y2() + "");
        }
        return rd02;
    }

    /* renamed from: o */
    public static C101834rc0 m124261o(C72963f4 f4Var, C68070l.C68072b bVar, int i) {
        C101834rc0 rc02 = new C101834rc0();
        m124262p(rc02, f4Var);
        rc02.mo141240O(bVar.f195530T);
        rc02.mo141241P(bVar.f195533U);
        rc02.mo141242Q(bVar.f195586j);
        rc02.mo141231E(true);
        rc02.mo141229B(f4Var.mo108774y2());
        C86009m1 m1Var = new C86009m1(Util.nullAs(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true), ""));
        if (m1Var.mo119967g()) {
            rc02.f299286W = m1Var.mo119971i();
        } else {
            rc02.mo141232F(true);
        }
        rc02.mo141246U(bVar.f195570f);
        rc02.mo141265u(bVar.f195574g);
        rc02.mo141252d(bVar.f195475C2);
        rc02.mo141260p(i);
        rc02.mo141239N(bVar.f195535U1);
        C72916m mVar = (C72916m) bVar.mo93555w(C72916m.class);
        if (mVar != null) {
            rc02.mo141235I(mVar.f212519b);
            rc02.mo141236J(mVar.f212520c);
            if (i == 29) {
                C101841sc0 sc02 = new C101841sc0();
                C64719t23 t232 = new C64719t23();
                t232.f185459d = mVar.f212521d;
                t232.f185460e = mVar.f212522e;
                t232.f185461f = mVar.f212523f;
                t232.f185462g = mVar.f212524g;
                t232.f185463h = mVar.f212525h;
                t232.f185464i = mVar.f212526i;
                t232.f185466n = mVar.f212527j;
                t232.f185467o = Util.safeParseLong(mVar.f212528k);
                t232.f185468p = mVar.f212529l;
                t232.f185469q = mVar.f212531n;
                t232.f185465j = mVar.f212530m;
                t232.f185471s = mVar.f212532o;
                t232.f185470r = mVar.f212533p;
                sc02.f299401C = t232;
                rc02.f299296c1 = sc02;
            }
        }
        return rc02;
    }

    /* renamed from: p */
    public static void m124262p(C101834rc0 rc02, C72963f4 f4Var) {
        if (f4Var.mo108769t2() != 1) {
            rc02.mo141259o(String.valueOf(f4Var.mo108774y2()));
        } else if (C72996z1.m85820U5(f4Var.mo108768t()) || f4Var.mo108768t().equals("filehelper")) {
            rc02.mo141259o(String.valueOf(f4Var.mo108774y2()));
        } else {
            rc02.mo141259o(f4Var.mo108768t() + "#" + String.valueOf(f4Var.mo108774y2()));
        }
    }
}
