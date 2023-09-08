package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gw0.C76073b;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import he0.C76158j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p158gt.C98201k;
import p227rn.C48053v;
import p682rz.C101488s;
import p682rz.C101491u;
import pb1.C100718j1;
import pb1.C100734q;
import qe0.C47806g;
import rb0.C48009v0;
import s90.C77630j;
import sb0.C48340e;
import sb0.C48353j;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C101849uc0;
import te3.C64878zd0;
import te3.tc4;

/* renamed from: com.tencent.mm.pluginsdk.model.p0 */
public class C96789p0 {

    /* renamed from: a */
    public static final SimpleDateFormat f283531a = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x04fe, code lost:
        r0 = new te3.C101834rc0();
        r0.mo141259o(m124275h(r18));
        r0.mo141260p(1);
        r0.mo141265u(r10.f195570f);
        r0.mo141232F(true);
        r0.mo141231E(true);
        r0.f299296c1 = r6;
        r0.mo141263s(m124277j(r6.f299405d));
        r0.mo141264t(m124278k(r6.f299405d));
        r0.mo141229B(r18.mo108774y2());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x053b, code lost:
        if (com.tencent.p014mm.storage.C72996z1.m85843n5(r6.f299405d.f299525o) == false) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x053d, code lost:
        r2 = qe0.C47806g.m53116a(((f62.C75700k0) f40.C86709a0.m107533q(r4)).mo96097Ni().get(r6.f299405d.f299525o));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0557, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2) != false) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0559, code lost:
        r0.f299245B1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x055b, code lost:
        r1.f264674d.f264676a.f298618f.add(r0);
        r1.f264674d.f264677b.f186671d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x056d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x085e, code lost:
        if (r19 == false) goto L_0x0872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0860, code lost:
        r1.f264674d.f264676a.f298618f.add(m124276i(r2, r0.getString(com.tencent.p014mm.C0966R.string.a39), r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0871, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0872, code lost:
        r1.f264674d.f264687l = com.tencent.p014mm.C0966R.string.co9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0876, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m124268a(android.content.Context r16, com.tencent.p014mm.autogen.events.DoFavoriteEvent r17, com.tencent.p014mm.storage.C72963f4 r18, boolean r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.m> r5 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m.class
            te3.sc0 r6 = new te3.sc0
            r6.<init>()
            te3.tc0 r7 = m124274g(r18)
            r6.f299405d = r7
            java.lang.String r7 = r18.getContent()
            r8 = 0
            r9 = 2131825667(0x7f111403, float:1.9284197E38)
            if (r7 != 0) goto L_0x0026
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r9
            return r8
        L_0x0026:
            r10 = 0
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r10)
            if (r10 != 0) goto L_0x0032
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r9
            return r8
        L_0x0032:
            te3.tc0 r9 = r6.f299405d
            java.lang.String r11 = r10.f195562d
            r9.f299533w = r11
            r11 = 1
            r9.f299534x = r11
            java.lang.String r12 = r10.f195634v
            r9.mo141305l(r12)
            java.lang.Class<ym.l> r9 = p763ym.C79138l.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ym.l r9 = (p763ym.C79138l) r9
            java.lang.String r12 = r10.f195562d
            com.tencent.mm.pluginsdk.model.app.j r9 = r9.getAppInfo(r12)
            if (r9 == 0) goto L_0x006d
            boolean r9 = r9.mo69359k()
            if (r9 == 0) goto L_0x006d
            if (r19 == 0) goto L_0x006d
            r3 = 2131821548(0x7f1103ec, float:1.9275842E38)
            java.lang.String r0 = r0.getString(r3)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x006d:
            int r9 = r10.f195582i
            r12 = 19
            r13 = 2131825665(0x7f111401, float:1.9284193E38)
            r15 = 4
            if (r9 == r12) goto L_0x08ff
            r12 = 20
            if (r9 == r12) goto L_0x0877
            r12 = 2131825673(0x7f111409, float:1.9284209E38)
            r14 = 2131821695(0x7f11047f, float:1.927614E38)
            switch(r9) {
                case 1: goto L_0x04fe;
                case 2: goto L_0x0315;
                case 3: goto L_0x02c1;
                case 4: goto L_0x025e;
                case 5: goto L_0x018b;
                case 6: goto L_0x00b2;
                case 7: goto L_0x008c;
                default: goto L_0x0084;
            }
        L_0x0084:
            r12 = 2131821615(0x7f11042f, float:1.9275978E38)
            switch(r9) {
                case 10: goto L_0x07d1;
                case 13: goto L_0x0744;
                case 16: goto L_0x0a00;
                case 24: goto L_0x09e2;
                case 33: goto L_0x0656;
                case 36: goto L_0x0656;
                case 44: goto L_0x0614;
                case 46: goto L_0x0602;
                case 48: goto L_0x05dc;
                case 51: goto L_0x056e;
                case 53: goto L_0x04fe;
                case 57: goto L_0x04fe;
                case 74: goto L_0x04f6;
                case 76: goto L_0x03f8;
                case 98: goto L_0x0a17;
                case 101: goto L_0x03d0;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x085e
        L_0x008c:
            java.lang.String r0 = r10.f195606o
            if (r0 == 0) goto L_0x00a6
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x00ad
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r12
            return r8
        L_0x00a6:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r2 = 2131825658(0x7f1113fa, float:1.9284178E38)
            r0.f264687l = r2
        L_0x00ad:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r8
        L_0x00b2:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x00c1
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r12
            return r8
        L_0x00c1:
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r5 = r10.f195606o
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r5)
            te3.rc0 r5 = new te3.rc0
            r5.<init>()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = r0.field_fileFullPath
            r5.f299284V = r0
        L_0x00d6:
            java.lang.String r0 = m124275h(r18)
            r5.mo141259o(r0)
            long r7 = r18.mo108774y2()
            r5.mo141229B(r7)
            r0 = 8
            r5.mo141260p(r0)
            java.lang.String r0 = r10.f195602n
            r5.mo141261q(r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r3 = r18.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.v10(r3, r11)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x010b
            r5.mo141232F(r11)
        L_0x010b:
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r3 == 0) goto L_0x0113
            r5.f299286W = r0
        L_0x0113:
            java.lang.String r0 = r10.f195570f
            r5.mo141246U(r0)
            java.lang.String r0 = r10.f195574g
            r5.mo141265u(r0)
            r5.f299296c1 = r6
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = m124277j(r0)
            r5.mo141263s(r0)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = m124278k(r0)
            r5.mo141264t(r0)
            long r2 = r18.getMsgId()
            r5.mo141237K(r2)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x0160
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r2 = f40.C86709a0.m107533q(r4)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r2.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0160
            r5.f299245B1 = r0
        L_0x0160:
            if (r19 == 0) goto L_0x0178
            java.lang.String r0 = r10.f195500J
            r5.mo141254j(r0)
            java.lang.String r0 = r10.f195524R
            r5.mo141253f(r0)
            java.lang.String r0 = r10.f195650z
            r5.f299342z1 = r0
            java.lang.String r0 = r10.f195524R
            r5.f299337x1 = r0
            java.lang.String r0 = r10.f195472C
            r5.f299340y1 = r0
        L_0x0178:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186678n
            int r1 = r1 + r11
            r0.f186678n = r1
            return r11
        L_0x018b:
            java.lang.String r3 = r10.f195586j
            if (r3 == 0) goto L_0x0242
            java.lang.String r5 = ""
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0242
            te3.tc0 r0 = r6.f299405d
            java.lang.String r3 = r10.f195586j
            r0.mo141307n(r3)
            r0 = 5
            te3.rc0 r0 = m124279l(r2, r10, r0)
            r0.f299296c1 = r6
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124277j(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124278k(r3)
            r0.mo141264t(r3)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = r3.f299525o
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r3 == 0) goto L_0x01df
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = r3.f299525o
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r4.get(r3)
            java.lang.String r3 = qe0.C47806g.m53116a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x01df
            r0.f299245B1 = r3
        L_0x01df:
            te3.ae0 r3 = new te3.ae0
            r3.<init>()
            java.lang.String r4 = r10.f195570f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01f1
            java.lang.String r4 = r10.f195570f
            r3.mo141198r(r4)
        L_0x01f1:
            java.lang.String r4 = r10.f195574g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01fe
            java.lang.String r4 = r10.f195574g
            r3.mo141194n(r4)
        L_0x01fe:
            java.lang.String r4 = r10.f195646y
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x020b
            java.lang.String r4 = r10.f195646y
            r3.mo141197q(r4)
        L_0x020b:
            java.lang.String r4 = r10.f195475C2
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0219
            java.lang.String r4 = r10.f195475C2
            r3.f297875s = r4
            r3.f297876t = r11
        L_0x0219:
            int r4 = r10.f195483E2
            r3.mo141195o(r4)
            int r4 = r3.computeSize()
            if (r4 <= 0) goto L_0x0229
            r3.mo141196p(r11)
            r6.f299407f = r3
        L_0x0229:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r4 = r1.f264674d
            te3.kd0 r4 = r4.f264676a
            java.util.LinkedList<te3.rc0> r4 = r4.f298618f
            r4.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186675h
            int r1 = r1 + r11
            r0.f186675h = r1
            te3.ad0 r0 = com.tencent.p014mm.message.C92721n.m116877e(r2, r3)
            r6.f299421w = r0
            return r11
        L_0x0242:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d
            r4 = 2131825661(0x7f1113fd, float:1.9284184E38)
            r3.f264687l = r4
            if (r19 == 0) goto L_0x025d
            java.lang.String r0 = r0.getString(r14)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x025d:
            return r8
        L_0x025e:
            te3.rc0 r0 = m124279l(r2, r10, r15)
            r0.f299296c1 = r6
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124277j(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124278k(r3)
            r0.mo141264t(r3)
            long r7 = r18.getMsgId()
            r0.mo141237K(r7)
            java.lang.String r2 = r2.f230724G
            java.lang.String r2 = eb0.C75569c4.m90685r(r2)
            r0.mo141230C(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x02ae
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x02ae
            r0.f299245B1 = r2
        L_0x02ae:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186674g
            int r1 = r1 + r11
            r0.f186674g = r1
            return r11
        L_0x02c1:
            r0 = 7
            te3.rc0 r0 = m124279l(r2, r10, r0)
            r0.f299296c1 = r6
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124277j(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124278k(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0302
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0302
            r0.f299245B1 = r2
        L_0x0302:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186677j
            int r1 = r1 + r11
            r0.f186677j = r1
            return r11
        L_0x0315:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x0324
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r12
            return r8
        L_0x0324:
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r5 = r10.f195606o
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r5)
            te3.rc0 r5 = new te3.rc0
            r5.<init>()
            java.lang.String r7 = m124275h(r18)
            r5.mo141259o(r7)
            long r7 = r18.mo108774y2()
            r5.mo141229B(r7)
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = r0.field_fileFullPath
            r5.f299284V = r0
        L_0x0347:
            di3.d r0 = di3.C86312j.m106911c(r3)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r3 = r18.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.v10(r3, r11)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r3 == 0) goto L_0x0363
            r5.f299286W = r0
        L_0x0363:
            r0 = 2
            r5.mo141260p(r0)
            java.lang.String r0 = r10.f195570f
            r5.mo141246U(r0)
            java.lang.String r0 = r10.f195574g
            r5.mo141265u(r0)
            r5.f299296c1 = r6
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = m124277j(r0)
            r5.mo141263s(r0)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = m124278k(r0)
            r5.mo141264t(r0)
            long r7 = r18.getMsgId()
            r5.mo141237K(r7)
            java.lang.String r0 = r2.f230724G
            java.lang.String r0 = eb0.C75569c4.m90685r(r0)
            r5.mo141230C(r0)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x03bd
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r2 = f40.C86709a0.m107533q(r4)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r2.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x03bd
            r5.f299245B1 = r0
        L_0x03bd:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186672e
            int r1 = r1 + r11
            r0.f186672e = r1
            return r11
        L_0x03d0:
            if (r19 == 0) goto L_0x085e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r0 = r0.getString(r4)
            r3.append(r0)
            java.lang.String r0 = r10.f195570f
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x03f8:
            r0 = 29
            te3.rc0 r0 = m124279l(r2, r10, r0)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124277j(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124278k(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0438
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0438
            r0.f299245B1 = r2
        L_0x0438:
            com.tencent.mm.message.g r2 = r10.mo93555w(r5)
            if (r2 == 0) goto L_0x04e1
            com.tencent.mm.message.g r2 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            java.lang.String r2 = r2.f212519b
            r0.mo141235I(r2)
            com.tencent.mm.message.g r2 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            java.lang.String r2 = r2.f212520c
            r0.mo141236J(r2)
            te3.t23 r2 = new te3.t23
            r2.<init>()
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212521d
            r2.f185459d = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212522e
            r2.f185460e = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212523f
            r2.f185461f = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212524g
            r2.f185462g = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212525h
            r2.f185463h = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212526i
            r2.f185464i = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212527j
            r2.f185466n = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212528k
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r3)
            r2.f185467o = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212529l
            r2.f185468p = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            int r3 = r3.f212531n
            r2.f185469q = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212530m
            r2.f185465j = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212532o
            r2.f185471s = r3
            com.tencent.mm.message.g r3 = r10.mo93555w(r5)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212533p
            r2.f185470r = r3
            r6.f299401C = r2
        L_0x04e1:
            r0.f299296c1 = r6
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186677j
            int r1 = r1 + r11
            r0.f186677j = r1
            return r11
        L_0x04f6:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825916(0x7f1114fc, float:1.9284702E38)
            r0.f264687l = r1
            return r8
        L_0x04fe:
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m124275h(r18)
            r0.mo141259o(r3)
            r0.mo141260p(r11)
            java.lang.String r3 = r10.f195570f
            r0.mo141265u(r3)
            r0.mo141232F(r11)
            r0.mo141231E(r11)
            r0.f299296c1 = r6
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124277j(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124278k(r3)
            r0.mo141264t(r3)
            long r2 = r18.mo108774y2()
            r0.mo141229B(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x055b
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x055b
            r0.f299245B1 = r2
        L_0x055b:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186671d
            int r1 = r1 + r11
            r0.f186671d = r1
            return r11
        L_0x056e:
            java.lang.Class<ht1.f> r0 = ht1.C60166f.class
            com.tencent.mm.message.g r0 = r10.mo93555w(r0)
            ht1.f r0 = (ht1.C60166f) r0
            if (r0 == 0) goto L_0x05db
            te3.rk1 r3 = r0.f171710b
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            te3.tc0 r5 = r6.f299405d
            java.lang.String r5 = m124277j(r5)
            r4.mo141263s(r5)
            te3.tc0 r5 = r6.f299405d
            java.lang.String r5 = m124278k(r5)
            r4.mo141264t(r5)
            java.lang.String r5 = m124275h(r18)
            r4.mo141259o(r5)
            r4.mo141231E(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r0.mo85179g()
            r5.append(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131825789(0x7f11147d, float:1.9284444E38)
            java.lang.String r0 = r0.getString(r7)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.mo141246U(r0)
            java.lang.String r0 = r3.f185187h
            r4.mo141265u(r0)
            r0 = 22
            r4.mo141260p(r0)
            r6.f299423y = r3
            r4.f299296c1 = r6
            long r2 = r18.mo108774y2()
            r4.mo141229B(r2)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            return r11
        L_0x05db:
            return r8
        L_0x05dc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131821550(0x7f1103ee, float:1.9275846E38)
            java.lang.String r0 = r0.getString(r4)
            r3.append(r0)
            java.lang.String r0 = r10.f195570f
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0602:
            java.lang.String r0 = r0.getString(r12)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0614:
            java.lang.String r3 = r10.mo93549l(r0, r11)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x0637
            if (r19 == 0) goto L_0x0632
            java.lang.String r0 = r0.getString(r14)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0632:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r8
        L_0x0637:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r10.f195570f
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0656:
            int r5 = r10.f195581h2
            r7 = 3
            if (r5 == r7) goto L_0x065f
            int r5 = r10.f195605n2
            if (r5 != r11) goto L_0x0673
        L_0x065f:
            if (r19 == 0) goto L_0x0673
            java.lang.String r0 = r0.getString(r12)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0673:
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r5 = m124275h(r18)
            r0.mo141259o(r5)
            java.lang.String r5 = r10.f195570f
            r0.mo141246U(r5)
            java.lang.String r5 = r10.f195574g
            r0.mo141265u(r5)
            r5 = 19
            r0.mo141260p(r5)
            long r12 = r18.mo108774y2()
            r0.mo141229B(r12)
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.String r5 = r18.mo108765s2()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r3 = r3.v10(r5, r11)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 == 0) goto L_0x06b2
            r0.mo141232F(r11)
        L_0x06b2:
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r5 == 0) goto L_0x06ba
            r0.f299286W = r3
        L_0x06ba:
            te3.pc0 r3 = new te3.pc0
            r3.<init>()
            java.lang.String r5 = r10.f195573f2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x06cb
            java.lang.String r5 = r10.f195573f2
            r3.f259741d = r5
        L_0x06cb:
            java.lang.String r5 = r10.f195577g2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x06d7
            java.lang.String r5 = r10.f195577g2
            r3.f259742e = r5
        L_0x06d7:
            java.lang.String r5 = r10.f195471B2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x06e3
            java.lang.String r5 = r10.f195471B2
            r3.f259744g = r5
        L_0x06e3:
            int r5 = r10.f195605n2
            r3.f259749o = r5
            int r5 = r10.f195581h2
            r3.f259745h = r5
            r3.f259743f = r8
            java.lang.String r5 = r10.f195569e2
            r3.f259746i = r5
            java.lang.String r5 = r10.f195638w
            r3.f259747j = r5
            r6.f299420v = r3
            r0.f299296c1 = r6
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124277j(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124278k(r3)
            r0.mo141264t(r3)
            long r2 = r18.getMsgId()
            r0.mo141237K(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x073a
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x073a
            r0.f299245B1 = r2
        L_0x073a:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0744:
            te3.jd0 r0 = new te3.jd0
            r0.<init>()
            java.lang.String r3 = r10.f195570f
            r0.mo141207o(r3)
            java.lang.String r3 = r10.f195574g
            r0.mo141204l(r3)
            int r3 = r10.f195575g0
            r0.mo141208p(r3)
            java.lang.String r3 = r10.f195579h0
            r0.mo141205m(r3)
            java.lang.String r3 = r10.f195646y
            r0.mo141206n(r3)
            r6.f299408g = r0
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m124275h(r18)
            r0.mo141259o(r3)
            long r2 = r18.mo108774y2()
            r0.mo141229B(r2)
            r2 = 11
            r0.mo141260p(r2)
            r0.mo141232F(r11)
            r0.mo141231E(r11)
            r0.f299296c1 = r6
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124277j(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124278k(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x07be
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x07be
            r0.f299245B1 = r2
        L_0x07be:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186681q
            int r1 = r1 + r11
            r0.f186681q = r1
            return r11
        L_0x07d1:
            te3.jd0 r0 = new te3.jd0
            r0.<init>()
            java.lang.String r3 = r10.f195570f
            r0.mo141207o(r3)
            java.lang.String r3 = r10.f195574g
            r0.mo141204l(r3)
            int r3 = r10.f195551a0
            r0.mo141208p(r3)
            java.lang.String r3 = r10.f195555b0
            r0.mo141205m(r3)
            java.lang.String r3 = r10.f195646y
            r0.mo141206n(r3)
            r6.f299408g = r0
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m124275h(r18)
            r0.mo141259o(r3)
            long r2 = r18.mo108774y2()
            r0.mo141229B(r2)
            r2 = 10
            r0.mo141260p(r2)
            r0.mo141232F(r11)
            r0.mo141231E(r11)
            r0.f299296c1 = r6
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124277j(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124278k(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x084b
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x084b
            r0.f299245B1 = r2
        L_0x084b:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186680p
            int r1 = r1 + r11
            r0.f186680p = r1
            return r11
        L_0x085e:
            if (r19 == 0) goto L_0x0872
            java.lang.String r0 = r0.getString(r14)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0872:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r8
        L_0x0877:
            te3.ud0 r0 = new te3.ud0
            r0.<init>()
            java.lang.String r3 = r10.f195570f
            r0.mo141318n(r3)
            java.lang.String r3 = r10.f195574g
            r0.mo141315k(r3)
            java.lang.String r3 = r10.f195567e0
            r0.mo141316l(r3)
            java.lang.String r3 = r10.f195646y
            r0.mo141317m(r3)
            r6.f299409h = r0
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m124275h(r18)
            r0.mo141259o(r3)
            long r2 = r18.mo108774y2()
            r0.mo141229B(r2)
            r2 = 14
            r0.mo141260p(r2)
            r0.mo141232F(r11)
            r0.mo141231E(r11)
            r0.f299296c1 = r6
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124277j(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = m124278k(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x08ec
            te3.tc0 r2 = r6.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x08ec
            r0.f299245B1 = r2
        L_0x08ec:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186684t
            int r1 = r1 + r11
            r0.f186684t = r1
            return r11
        L_0x08ff:
            java.lang.String r3 = r10.f195571f0
            if (r3 == 0) goto L_0x090d
            java.lang.String r5 = "<recordxml>"
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x090d
            r3 = 1
            goto L_0x090e
        L_0x090d:
            r3 = 0
        L_0x090e:
            if (r3 != 0) goto L_0x09e2
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m124275h(r18)
            r0.mo141259o(r3)
            r3 = 17
            r0.mo141260p(r3)
            r0.mo141232F(r11)
            java.lang.String r3 = r10.f195570f
            r0.mo141246U(r3)
            java.lang.String r3 = r10.f195571f0
            r0.mo141234H(r3)
            long r14 = r18.mo108774y2()
            r0.mo141229B(r14)
            java.lang.String r3 = r10.f195472C
            r0.f299340y1 = r3
            java.lang.String r3 = r10.f195476D
            r0.f299243A1 = r3
            java.lang.String r3 = r10.f195464A
            r0.f299334w1 = r3
            java.lang.String r3 = r10.f195524R
            r0.f299337x1 = r3
            java.lang.String r3 = r10.f195650z
            r0.f299342z1 = r3
            java.lang.String r3 = r10.f195574g
            com.tencent.mm.autogen.events.RecordOperationEvent r5 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r5.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r7 = r5.f265027d
            r7.f265029a = r8
            java.lang.String r9 = r10.f195571f0
            r7.f265030b = r9
            r5.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r5 = r5.f265028e
            te3.dp3 r5 = r5.f265048a
            if (r5 == 0) goto L_0x0980
            java.util.LinkedList<te3.rc0> r7 = r5.f227155f
            java.util.Iterator r7 = r7.iterator()
        L_0x0967:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0980
            java.lang.Object r9 = r7.next()
            te3.rc0 r9 = (te3.C101834rc0) r9
            java.lang.String r9 = r9.f299342z1
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0967
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r8
        L_0x0980:
            if (r5 == 0) goto L_0x0984
            java.lang.String r3 = r5.f227154e
        L_0x0984:
            r0.mo141265u(r3)
            r0.f299296c1 = r6
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124277j(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = m124278k(r3)
            r0.mo141264t(r3)
            long r7 = r18.getMsgId()
            r0.mo141237K(r7)
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = r3.f299525o
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r3 == 0) goto L_0x09ca
            te3.tc0 r3 = r6.f299405d
            java.lang.String r3 = r3.f299525o
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r4.get(r3)
            java.lang.String r3 = qe0.C47806g.m53116a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x09ca
            r0.f299245B1 = r3
        L_0x09ca:
            java.lang.String r3 = r0.f299326s1
            java.lang.String r4 = r0.f299274Q0
            long r5 = r18.getMsgId()
            te3.kd0 r2 = com.tencent.p014mm.pluginsdk.model.C96785k0.m124245b(r3, r4, r5)
            r0.f299275Q1 = r2
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x09e2:
            if (r19 == 0) goto L_0x0a00
            r3 = 2131825823(0x7f11149f, float:1.9284513E38)
            java.lang.String r0 = r0.getString(r3)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            int r0 = r0.f264687l
            if (r0 != 0) goto L_0x09ff
            r8 = 1
        L_0x09ff:
            return r8
        L_0x0a00:
            if (r19 == 0) goto L_0x0a17
            r3 = 2131821646(0x7f11044e, float:1.9276041E38)
            java.lang.String r0 = r0.getString(r3)
            te3.rc0 r0 = m124276i(r2, r0, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r11
        L_0x0a17:
            java.lang.Class<hg.d> r0 = p548hg.C98450d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.d r0 = (p548hg.C98450d) r0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = r18.getContent()
            java.lang.String r0 = r0.mo137797al(r3, r5)
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            java.lang.String r5 = m124275h(r18)
            r3.mo141259o(r5)
            r5 = 35
            r3.mo141260p(r5)
            r3.mo141265u(r0)
            r3.mo141232F(r11)
            r3.mo141231E(r11)
            r3.f299296c1 = r6
            long r9 = r18.mo108774y2()
            r3.mo141229B(r9)
            java.lang.String r0 = r2.f230724G
            java.lang.String r0 = eb0.C75569c4.m90685r(r0)
            r3.mo141230C(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r3.toString()
            r0.append(r9)
            r0.append(r5)
            long r9 = java.lang.System.currentTimeMillis()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r3.mo141257m(r0)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = m124277j(r0)
            r3.mo141263s(r0)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = m124278k(r0)
            r3.mo141264t(r0)
            long r9 = r18.getMsgId()
            r3.mo141237K(r9)
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x0abd
            te3.tc0 r0 = r6.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r4.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x0abd
            r3.f299245B1 = r0
        L_0x0abd:
            ig.a r0 = new ig.a
            r0.<init>()
            r0.mo141099d(r7)
            ig.g r4 = new ig.g
            r4.<init>()
            java.lang.String r0 = r0.f289309p
            r4.mo141099d(r0)
            ig.m r0 = new ig.m
            r0.<init>()
            java.util.List<ig.d> r5 = r4.f289364h
            java.util.Iterator r5 = r5.iterator()
        L_0x0ada:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0b21
            java.lang.Object r6 = r5.next()
            ig.d r6 = (p434ig.C98672d) r6
            int r7 = r6.mo55274P()
            r9 = -10
            r10 = 2
            if (r7 != r10) goto L_0x0b08
            th0.l r7 = th0.C101888l.f300029a
            boolean r12 = r7.mo141358h(r6, r2)
            if (r12 != 0) goto L_0x0b00
            boolean r6 = r7.mo141356f(r6, r2)
            if (r6 == 0) goto L_0x0afe
            goto L_0x0b00
        L_0x0afe:
            r6 = 0
            goto L_0x0b01
        L_0x0b00:
            r6 = 1
        L_0x0b01:
            if (r6 != 0) goto L_0x0ada
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r1.f264674d
            r6.f264687l = r9
            goto L_0x0ada
        L_0x0b08:
            int r7 = r6.mo55274P()
            if (r7 != r15) goto L_0x0ada
            th0.l r7 = th0.C101888l.f300029a
            boolean r12 = r7.mo141361k(r6, r2)
            if (r12 == 0) goto L_0x0b1c
            boolean r6 = r7.mo141363m(r6, r2)
            if (r6 != 0) goto L_0x0ada
        L_0x0b1c:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r1.f264674d
            r6.f264687l = r9
            goto L_0x0ada
        L_0x0b21:
            java.util.List<ig.d> r4 = r4.f289364h
            r0.mo138093B(r4)
            java.lang.String r0 = r0.mo141118z()
            r3.mo141234H(r0)
            java.lang.String r0 = r3.f299326s1
            java.lang.String r4 = r3.f299274Q0
            long r5 = r18.getMsgId()
            te3.kd0 r0 = com.tencent.p014mm.pluginsdk.model.C96785k0.m124245b(r0, r4, r5)
            r3.f299275Q1 = r0
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96789p0.m124268a(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f4, boolean):boolean");
    }

    /* renamed from: b */
    public static boolean m124269b(Context context, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        C101834rc0 rc02;
        String str;
        C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299405d = m124274g(f4Var);
        int i = Rv0.f212691q;
        Set<String> set = C45628s0.f123410p;
        if (C72996z1.m85810M4(i)) {
            rc02 = new C101834rc0();
            rc02.mo141259o(m124275h(f4Var));
            rc02.mo141260p(16);
            rc02.mo141265u(f4Var.getContent());
            rc02.mo141232F(true);
            rc02.mo141231E(true);
            rc02.f299296c1 = sc02;
            rc02.mo141263s(m124277j(sc02.f299405d));
            rc02.mo141264t(m124278k(sc02.f299405d));
            rc02.mo141229B(f4Var.mo108774y2());
            if (C72996z1.m85843n5(sc02.f299405d.f299525o)) {
                String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(sc02.f299405d.f299525o));
                if (!Util.isNullOrNil(a)) {
                    rc02.f299245B1 = a;
                }
            }
        } else if (C72996z1.m85843n5(Rv0.f212675a)) {
            String Rn0 = ((C76158j) C86312j.m106911c(C76158j.class)).Rn0(Rv0.f212699y, "openim_card_type_name", C76158j.C8510a.TYPE_WORDING);
            if (TextUtils.isEmpty(Rn0)) {
                str = context.getResources().getString(C0966R.string.f8021zh);
            } else {
                str = String.format("[%s]", new Object[]{Rn0});
            }
            rc02 = m124276i(f4Var, str, sc02);
        } else {
            rc02 = m124276i(f4Var, context.getString(C0966R.string.f8021zh), sc02);
        }
        doFavoriteEvent.f264674d.f264676a.f298618f.add(rc02);
        doFavoriteEvent.f264674d.f264677b.f186685u++;
        return true;
    }

    /* renamed from: c */
    public static boolean m124270c(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var, boolean z) {
        boolean z2;
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        Class cls = C101491u.class;
        Class cls2 = C101488s.class;
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299405d = m124274g(f4Var);
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141259o(m124275h(f4Var));
        rc02.f299284V = ((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137728q(f4Var.mo108765s2());
        rc02.f299286W = ((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137729r(f4Var.mo108765s2());
        rc02.mo141261q(C86013q1.m106454o(rc02.f299284V));
        rc02.mo141229B(f4Var.mo108774y2());
        if (f4Var.mo100989b4()) {
            rc02.mo141260p(15);
        } else {
            rc02.mo141260p(4);
        }
        C98408n0 Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(f4Var.mo108765s2());
        if (Zd == null) {
            Log.m105924i("MicroMsg.GetFavRecordDataSource", "video info null");
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360420co0;
            return false;
        }
        C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
        if (Zd2 == null || Zd2.f288562i != 199) {
            z2 = false;
        } else {
            rc02.f299284V = ((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137728q(Zd2.mo137700d());
            Zd = Zd2;
            z2 = true;
        }
        Log.m105925i("MicroMsg.GetFavRecordDataSource", "video length is %d", Integer.valueOf(Zd.f288559f));
        if (((long) Zd.f288559f) > ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128216vR(false)) {
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360438cs3;
            return false;
        } else if (!f4Var.mo100989b4() || !C98429r0.m127812c(Zd.mo137700d())) {
            rc02.mo141266v(Zd.f288566m);
            rc02.f299296c1 = sc02;
            rc02.mo141263s(m124277j(sc02.f299405d));
            rc02.mo141264t(m124278k(sc02.f299405d));
            if (C72996z1.m85843n5(sc02.f299405d.f299525o)) {
                String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(sc02.f299405d.f299525o));
                if (!Util.isNullOrNil(a)) {
                    rc02.f299245B1 = a;
                }
            }
            rc02.mo141237K(f4Var.getMsgId());
            rc02.mo141230C(C75569c4.m90685r(f4Var.f230724G));
            rc02.mo141269y((long) Zd.f288559f);
            if (z) {
                Map<String, String> parseXml = XmlParser.parseXml(Zd.mo137705i(), "msg", (String) null);
                if (parseXml != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".msg.videomsg.$");
                    sb.append(z2 ? "cdnrawvideourl" : "cdnvideourl");
                    rc02.mo141254j(parseXml.get(sb.toString()));
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(".msg.videomsg.$");
                    sb4.append(z2 ? "cdnrawvideoaeskey" : "aeskey");
                    rc02.mo141253f(parseXml.get(sb4.toString()));
                } else {
                    Log.m105924i("MicroMsg.GetFavRecordDataSource", "cdntra parse video recv xml failed");
                }
            }
            doFavoriteEvent2.f264674d.f264676a.f298618f.add(rc02);
            doFavoriteEvent2.f264674d.f264677b.f186674g++;
            C98408n0 Zd3 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(f4Var.mo108765s2());
            rc02.mo141239N(Zd3.f288536D);
            tc4 tc4 = Zd3.f288535C;
            if (tc4 != null && !Util.isNullOrNil(tc4.f299543j)) {
                C101849uc0 uc02 = new C101849uc0();
                uc02.f299610d = tc4.f299537d;
                uc02.f299611e = tc4.f299538e;
                uc02.f299612f = tc4.f299539f;
                uc02.f299613g = tc4.f299540g;
                uc02.f299614h = tc4.f299541h;
                uc02.f299615i = tc4.f299542i;
                uc02.f299616j = tc4.f299543j;
                uc02.f299617n = tc4.f299544n;
                rc02.f299306h1 = uc02;
            }
            return true;
        } else {
            doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360420co0;
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m124271d(Context context, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var, int i) {
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299405d = m124274g(f4Var);
        String str = null;
        if (i == 1) {
            str = context.getString(C0966R.string.f7957xf);
        } else if (i == 2) {
            str = context.getString(C0966R.string.a1b);
        } else if (i == 3) {
            str = context.getString(C0966R.string.a39);
        }
        doFavoriteEvent.f264674d.f264676a.f298618f.add(m124276i(f4Var, str, sc02));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v71, types: [int] */
    /* JADX WARNING: type inference failed for: r4v74 */
    /* JADX WARNING: type inference failed for: r4v75 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r4v90 */
    /* JADX WARNING: type inference failed for: r4v91 */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03a3, code lost:
        if (r10.f267374a <= 0) goto L_0x03a8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x07e0 A[Catch:{ Exception -> 0x0801 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x08fa  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m124272e(android.content.Context r19, com.tencent.p014mm.autogen.events.DoFavoriteEvent r20, com.tencent.p014mm.storage.C72963f4 r21, boolean r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            r4 = 0
            java.lang.String r5 = "MicroMsg.GetFavRecordDataSource"
            if (r1 == 0) goto L_0x08fe
            if (r21 != 0) goto L_0x0011
            goto L_0x08fe
        L_0x0011:
            com.tencent.mm.storage.f4 r6 = com.tencent.p014mm.storage.C72963f4.m85593l3(r21)
            boolean r7 = r6.mo100993e4()
            java.lang.String r8 = ""
            r9 = 1
            if (r7 == 0) goto L_0x00f5
            te3.sc0 r0 = new te3.sc0
            r0.<init>()
            te3.tc0 r5 = m124274g(r6)
            r0.f299405d = r5
            te3.rc0 r5 = new te3.rc0
            r5.<init>()
            java.lang.String r7 = m124275h(r6)
            r5.mo141259o(r7)
            long r10 = r6.mo108774y2()
            r5.mo141229B(r10)
            r5.mo141260p(r9)
            boolean r7 = r6.mo100964D3()
            r10 = 10
            if (r7 == 0) goto L_0x0068
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131834908(0x7f11381c, float:1.930294E38)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.String r13 = "@"
            r12[r4] = r13
            java.lang.String r4 = r8.getString(r11, r12)
            r7.append(r4)
            r7.append(r10)
            java.lang.String r8 = r7.toString()
            goto L_0x0088
        L_0x0068:
            boolean r4 = r6.mo100971J3()
            if (r4 == 0) goto L_0x0088
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131835001(0x7f113879, float:1.9303128E38)
            java.lang.String r7 = r7.getString(r8)
            r4.append(r7)
            r4.append(r10)
            java.lang.String r8 = r4.toString()
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r7 = r6.getContent()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r5.mo141265u(r4)
            r5.mo141232F(r9)
            r5.mo141231E(r9)
            r5.f299296c1 = r0
            te3.tc0 r4 = r0.f299405d
            java.lang.String r4 = m124277j(r4)
            r5.mo141263s(r4)
            te3.tc0 r4 = r0.f299405d
            java.lang.String r4 = m124278k(r4)
            r5.mo141264t(r4)
            te3.tc0 r4 = r0.f299405d
            java.lang.String r4 = r4.f299525o
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            if (r4 == 0) goto L_0x00e0
            te3.tc0 r0 = r0.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r3.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x00e0
            r5.f299245B1 = r0
        L_0x00e0:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186671d
            int r3 = r3 + r9
            r0.f186671d = r3
        L_0x00f2:
            r4 = 1
            goto L_0x08f8
        L_0x00f5:
            boolean r7 = r6.mo100995g4()
            r10 = 3
            r11 = 2
            r12 = 0
            if (r7 == 0) goto L_0x0272
            java.lang.Class<dn.t> r0 = p492dn.C75415t.class
            te3.sc0 r5 = new te3.sc0
            r5.<init>()
            te3.tc0 r7 = m124274g(r6)
            r5.f299405d = r7
            te3.rc0 r7 = new te3.rc0
            r7.<init>()
            java.lang.String r8 = m124275h(r6)
            r7.mo141259o(r8)
            r7.mo141260p(r10)
            long r13 = r6.mo108774y2()
            r7.mo141229B(r13)
            if (r2 == 0) goto L_0x012b
            r7.mo141232F(r9)
            r7.mo141231E(r9)
            goto L_0x0222
        L_0x012b:
            java.lang.String r8 = r6.mo108768t()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85803I5(r8)
            if (r8 == 0) goto L_0x0190
            java.lang.String r8 = r6.mo108765s2()
            eb0.c r10 = eb0.C97625j3.m125812b()
            r10.getClass()
            java.lang.String r10 = ng2.C11163e.m11041a()
            java.lang.String r13 = "recbiz_"
            java.lang.String r14 = ".rec"
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.FilePathGenerator.genPath(r10, r13, r8, r14, r11)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r10 == 0) goto L_0x0154
            goto L_0x018d
        L_0x0154:
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)
            java.lang.String r13 = r10.getPath()
            if (r13 == 0) goto L_0x0178
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r4, r4)
            java.lang.String r14 = r10.getPath()
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x0178
            android.net.Uri$Builder r10 = r10.buildUpon()
            android.net.Uri$Builder r10 = r10.path(r13)
            android.net.Uri r10 = r10.build()
        L_0x0178:
            com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r10 = r13.mo177799l(r10, r12)
            boolean r12 = r10.mo177810a()
            if (r12 != 0) goto L_0x0185
            goto L_0x018c
        L_0x0185:
            com.tencent.mm.vfs.FileSystem$c r12 = r10.f348991a
            java.lang.String r10 = r10.f348992b
            r12.mo119948x(r10)
        L_0x018c:
            r12 = r8
        L_0x018d:
            r7.f299284V = r12
            goto L_0x01a0
        L_0x0190:
            di3.d r8 = di3.C86312j.m106911c(r0)
            dn.t r8 = (p492dn.C75415t) r8
            java.lang.String r10 = r6.mo108765s2()
            java.lang.String r8 = r8.mo91610mf(r10)
            r7.f299284V = r8
        L_0x01a0:
            r7.mo141232F(r9)
            di3.d r0 = di3.C86312j.m106911c(r0)
            dn.t r0 = (p492dn.C75415t) r0
            java.lang.String r8 = r6.mo108765s2()
            kd0.d r0 = r0.w20(r8)
            if (r0 != 0) goto L_0x01b5
            goto L_0x08f8
        L_0x01b5:
            int r0 = r0.getFormat()
            r8 = 4
            if (r0 != r9) goto L_0x01c0
            java.lang.String r0 = "speex"
            goto L_0x01c8
        L_0x01c0:
            if (r0 != r8) goto L_0x01c6
            java.lang.String r0 = "silk"
            goto L_0x01c8
        L_0x01c6:
            java.lang.String r0 = "amr"
        L_0x01c8:
            r7.mo141261q(r0)
            java.lang.String r0 = r6.getContent()
            java.lang.String r10 = "\n"
            boolean r10 = r0.endsWith(r10)     // Catch:{ Exception -> 0x0215 }
            if (r10 == 0) goto L_0x01e0
            int r10 = r0.length()     // Catch:{ Exception -> 0x0215 }
            int r10 = r10 - r9
            java.lang.String r0 = r0.substring(r4, r10)     // Catch:{ Exception -> 0x0215 }
        L_0x01e0:
            java.lang.String r10 = ":"
            java.lang.String[] r0 = r0.split(r10)     // Catch:{ Exception -> 0x0215 }
            int r10 = r0.length     // Catch:{ Exception -> 0x0215 }
            if (r10 != r8) goto L_0x01f2
            r8 = r0[r4]     // Catch:{ Exception -> 0x0215 }
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85811N4(r8)     // Catch:{ Exception -> 0x0215 }
            if (r8 == 0) goto L_0x01f2
            r4 = 1
        L_0x01f2:
            int r8 = r0.length     // Catch:{ Exception -> 0x0215 }
            if (r8 <= r4) goto L_0x01f7
            r8 = r0[r4]     // Catch:{ Exception -> 0x0215 }
        L_0x01f7:
            int r8 = r0.length     // Catch:{ Exception -> 0x0215 }
            int r10 = r4 + 1
            if (r8 <= r10) goto L_0x0205
            r8 = r0[r10]     // Catch:{ Exception -> 0x0215 }
            r12 = 0
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r12)     // Catch:{ Exception -> 0x0215 }
            goto L_0x0207
        L_0x0205:
            r17 = 0
        L_0x0207:
            int r8 = r0.length     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            if (r8 <= r4) goto L_0x0212
            r0 = r0[r4]     // Catch:{ Exception -> 0x0215 }
            java.lang.String r4 = "1"
            r0.equals(r4)     // Catch:{ Exception -> 0x0215 }
        L_0x0212:
            r13 = r17
            goto L_0x021e
        L_0x0215:
            java.lang.String r0 = "MicroMsg.VoiceContent"
            java.lang.String r4 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            r13 = 0
        L_0x021e:
            int r0 = (int) r13
            r7.mo141266v(r0)
        L_0x0222:
            r7.f299296c1 = r5
            te3.tc0 r0 = r5.f299405d
            java.lang.String r0 = m124277j(r0)
            r7.mo141263s(r0)
            te3.tc0 r0 = r5.f299405d
            java.lang.String r0 = m124278k(r0)
            r7.mo141264t(r0)
            te3.tc0 r0 = r5.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x025e
            te3.tc0 r0 = r5.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r3.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x025e
            r7.f299245B1 = r0
        L_0x025e:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r7)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186673f
            int r3 = r3 + r9
            r0.f186673f = r3
            goto L_0x00f2
        L_0x0272:
            boolean r7 = r6.mo100982U3()
            java.lang.String r13 = "msg"
            r14 = 2131825667(0x7f111403, float:1.9284197E38)
            if (r7 == 0) goto L_0x0367
            te3.sc0 r0 = new te3.sc0
            r0.<init>()
            te3.tc0 r7 = m124274g(r6)
            r0.f299405d = r7
            java.lang.String r7 = r6.getContent()
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r13, r12)
            if (r7 == 0) goto L_0x0361
            te3.zc0 r8 = new te3.zc0     // Catch:{ Exception -> 0x034e }
            r8.<init>()     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = ".msg.location.$label"
            java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x034e }
            r8.mo141339v(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = ".msg.location.$x"
            java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x034e }
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x034e }
            r8.mo141340w(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = ".msg.location.$y"
            java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x034e }
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x034e }
            r8.mo141341x(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = ".msg.location.$scale"
            java.lang.Object r10 = r7.get(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x034e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x034e }
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x034e }
            r8.mo141323F(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r10 = ".msg.location.$poiname"
            java.lang.Object r7 = r7.get(r10)     // Catch:{ Exception -> 0x034e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x034e }
            r8.mo141322E(r7)     // Catch:{ Exception -> 0x034e }
            r0.f299406e = r8     // Catch:{ Exception -> 0x034e }
            te3.rc0 r7 = new te3.rc0     // Catch:{ Exception -> 0x034e }
            r7.<init>()     // Catch:{ Exception -> 0x034e }
            java.lang.String r8 = m124275h(r6)     // Catch:{ Exception -> 0x034e }
            r7.mo141259o(r8)     // Catch:{ Exception -> 0x034e }
            r8 = 6
            r7.mo141260p(r8)     // Catch:{ Exception -> 0x034e }
            r7.mo141232F(r9)     // Catch:{ Exception -> 0x034e }
            r7.mo141231E(r9)     // Catch:{ Exception -> 0x034e }
            r7.f299296c1 = r0     // Catch:{ Exception -> 0x034e }
            te3.tc0 r8 = r0.f299405d     // Catch:{ Exception -> 0x034e }
            java.lang.String r8 = m124277j(r8)     // Catch:{ Exception -> 0x034e }
            r7.mo141263s(r8)     // Catch:{ Exception -> 0x034e }
            te3.tc0 r8 = r0.f299405d     // Catch:{ Exception -> 0x034e }
            java.lang.String r8 = m124278k(r8)     // Catch:{ Exception -> 0x034e }
            r7.mo141264t(r8)     // Catch:{ Exception -> 0x034e }
            long r10 = r6.mo108774y2()     // Catch:{ Exception -> 0x034e }
            r7.mo141229B(r10)     // Catch:{ Exception -> 0x034e }
            te3.tc0 r8 = r0.f299405d     // Catch:{ Exception -> 0x034e }
            java.lang.String r8 = r8.f299525o     // Catch:{ Exception -> 0x034e }
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85843n5(r8)     // Catch:{ Exception -> 0x034e }
            if (r8 == 0) goto L_0x033a
            te3.tc0 r0 = r0.f299405d     // Catch:{ Exception -> 0x034e }
            java.lang.String r0 = r0.f299525o     // Catch:{ Exception -> 0x034e }
            k40.a r3 = f40.C86709a0.m107533q(r3)     // Catch:{ Exception -> 0x034e }
            f62.k0 r3 = (f62.C75700k0) r3     // Catch:{ Exception -> 0x034e }
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()     // Catch:{ Exception -> 0x034e }
            com.tencent.mm.storage.z1 r0 = r3.get(r0)     // Catch:{ Exception -> 0x034e }
            java.lang.String r0 = qe0.C47806g.m53116a(r0)     // Catch:{ Exception -> 0x034e }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x034e }
            if (r3 != 0) goto L_0x033a
            r7.f299245B1 = r0     // Catch:{ Exception -> 0x034e }
        L_0x033a:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d     // Catch:{ Exception -> 0x034e }
            te3.kd0 r0 = r0.f264676a     // Catch:{ Exception -> 0x034e }
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f     // Catch:{ Exception -> 0x034e }
            r0.add(r7)     // Catch:{ Exception -> 0x034e }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d     // Catch:{ Exception -> 0x034e }
            te3.zd0 r0 = r0.f264677b     // Catch:{ Exception -> 0x034e }
            int r3 = r0.f186676i     // Catch:{ Exception -> 0x034e }
            int r3 = r3 + r9
            r0.f186676i = r3     // Catch:{ Exception -> 0x034e }
            goto L_0x00f2
        L_0x034e:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r0 = r0.toString()
            r3[r4] = r0
            java.lang.String r0 = "parse failed, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r3)
        L_0x0361:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r14
            goto L_0x08f8
        L_0x0367:
            boolean r7 = r6.mo100979R3()
            if (r7 == 0) goto L_0x056f
            java.lang.Class<gt.l> r0 = p158gt.C76053l.class
            java.lang.Class<gt.k> r7 = p158gt.C98201k.class
            long r17 = r6.getMsgId()
            r14 = 0
            int r10 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0398
            di3.d r10 = di3.C86312j.m106911c(r7)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.String r14 = r6.mo108768t()
            r17 = r13
            long r12 = r6.getMsgId()
            int r13 = (int) r12
            long r12 = (long) r13
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            com.tencent.mm.modelimage.k r10 = r10.mo127200vP(r14, r12)
            goto L_0x039b
        L_0x0398:
            r17 = r13
            r10 = 0
        L_0x039b:
            if (r10 == 0) goto L_0x03a6
            long r12 = r10.f267374a
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x03c8
            goto L_0x03a8
        L_0x03a6:
            r14 = 0
        L_0x03a8:
            long r12 = r6.mo108774y2()
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x03c8
            di3.d r10 = di3.C86312j.m106911c(r7)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.String r12 = r6.mo108768t()
            long r13 = r6.mo108774y2()
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            com.tencent.mm.modelimage.k r10 = r10.mo127168NQ(r12, r13)
        L_0x03c8:
            if (r10 != 0) goto L_0x03d8
            java.lang.String r0 = "getImgDataPath: try get imgInfo fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825663(0x7f1113ff, float:1.9284189E38)
            r0.f264687l = r3
            goto L_0x08f8
        L_0x03d8:
            te3.sc0 r12 = new te3.sc0
            r12.<init>()
            te3.tc0 r13 = m124274g(r6)
            r12.f299405d = r13
            te3.rc0 r13 = new te3.rc0
            r13.<init>()
            java.lang.String r14 = m124275h(r6)
            r13.mo141259o(r14)
            r13.mo141260p(r11)
            di3.d r11 = di3.C86312j.m106911c(r7)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            di3.d r14 = di3.C86312j.m106911c(r0)
            gt.l r14 = (p158gt.C76053l) r14
            java.lang.String r14 = r14.mo106262y8(r10)
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            java.lang.String r11 = r11.mo127174TY(r14, r8, r8, r9)
            r13.f299284V = r11
            long r14 = r6.mo108774y2()
            r13.mo141229B(r14)
            boolean r11 = r10.mo127145p()
            if (r11 == 0) goto L_0x045d
            di3.d r11 = di3.C86312j.m106911c(r7)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            int r14 = r10.f267390q
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            com.tencent.mm.modelimage.k r11 = r11.mo127173TO(r14)
            int r14 = r11.f267377d
            int r11 = r11.f267376c
            if (r14 <= r11) goto L_0x045d
            di3.d r11 = di3.C86312j.m106911c(r7)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "SERVERID://"
            r14.append(r15)
            r16 = r5
            long r4 = r6.mo108774y2()
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            java.lang.String r4 = r11.mo127174TY(r4, r8, r8, r9)
            r13.f299284V = r4
            goto L_0x045f
        L_0x045d:
            r16 = r5
        L_0x045f:
            di3.d r4 = di3.C86312j.m106911c(r7)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r5 = r6.mo108765s2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            java.lang.String r4 = r4.v10(r5, r9)
            r13.f299286W = r4
            r13.f299296c1 = r12
            te3.tc0 r4 = r12.f299405d
            java.lang.String r4 = m124277j(r4)
            r13.mo141263s(r4)
            te3.tc0 r4 = r12.f299405d
            java.lang.String r4 = m124278k(r4)
            r13.mo141264t(r4)
            long r4 = r6.getMsgId()
            r13.mo141237K(r4)
            java.lang.String r4 = r6.f230724G
            java.lang.String r4 = eb0.C75569c4.m90685r(r4)
            r13.mo141230C(r4)
            te3.tc0 r4 = r12.f299405d
            java.lang.String r4 = r4.f299525o
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            if (r4 == 0) goto L_0x04c1
            te3.tc0 r4 = r12.f299405d
            java.lang.String r4 = r4.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r3.get(r4)
            java.lang.String r3 = qe0.C47806g.m53116a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x04c1
            r13.f299245B1 = r3
        L_0x04c1:
            if (r2 == 0) goto L_0x055b
            boolean r3 = r10.mo127145p()
            if (r3 == 0) goto L_0x04df
            int r3 = r10.f267377d
            if (r3 != 0) goto L_0x04df
            di3.d r3 = di3.C86312j.m106911c(r7)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            int r4 = r10.f267390q
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            com.tencent.mm.modelimage.k r10 = r3.mo127173TO(r4)
        L_0x04df:
            int r3 = r6.mo108769t2()
            if (r3 != r9) goto L_0x04ea
            boolean r0 = r10.mo127145p()
            goto L_0x0516
        L_0x04ea:
            boolean r3 = r10.mo127145p()
            if (r3 != 0) goto L_0x04f1
            goto L_0x0513
        L_0x04f1:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.l r0 = (p158gt.C76053l) r0
            com.tencent.mm.modelimage.k r0 = r0.mo106261jD(r10)
            di3.d r3 = di3.C86312j.m106911c(r7)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.String r0 = r0.f267378e
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r0 = r3.mo127174TY(r0, r8, r8, r9)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x0515
        L_0x0513:
            r0 = 0
            goto L_0x0516
        L_0x0515:
            r0 = 1
        L_0x0516:
            java.lang.String r3 = r10.f267393t
            r4 = r17
            r5 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r4, r5)
            if (r3 == 0) goto L_0x054c
            if (r0 == r9) goto L_0x0524
            goto L_0x055b
        L_0x0524:
            java.lang.String r0 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r13.mo141254j(r0)
            java.lang.String r0 = ".msg.img.$length"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            long r4 = (long) r0
            r13.mo141269y(r4)
            java.lang.String r0 = ".msg.img.$aeskey"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r13.mo141253f(r0)
            goto L_0x055b
        L_0x054c:
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = r10.f267393t
            r0[r4] = r3
            java.lang.String r3 = "parse cdnInfo failed. [%s]"
            r4 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
        L_0x055b:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r13)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186672e
            int r3 = r3 + r9
            r0.f186672e = r3
            goto L_0x00f2
        L_0x056f:
            r4 = r5
            boolean r5 = r6.mo100994f4()
            if (r5 == 0) goto L_0x057c
            boolean r4 = m124270c(r1, r6, r2)
            goto L_0x08f8
        L_0x057c:
            boolean r5 = r6.mo100989b4()
            if (r5 == 0) goto L_0x0588
            boolean r4 = m124270c(r1, r6, r2)
            goto L_0x08f8
        L_0x0588:
            boolean r5 = r6.mo100983V3()
            if (r5 == 0) goto L_0x0594
            boolean r4 = qg2.C101146j.m132597f(r1, r6, r2)
            goto L_0x08f8
        L_0x0594:
            if (r2 == 0) goto L_0x05a3
            int r5 = r6.getType()
            r7 = 318767153(0x13000031, float:1.6155966E-27)
            if (r5 != r7) goto L_0x05a3
            m124271d(r0, r1, r6, r10)
            return r9
        L_0x05a3:
            boolean r5 = r6.mo100967F3()
            if (r5 == 0) goto L_0x0823
            java.lang.Class<gw0.b> r0 = gw0.C76073b.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0803 }
            gw0.b r0 = (gw0.C76073b) r0     // Catch:{ Exception -> 0x0803 }
            long r10 = r6.getMsgId()     // Catch:{ Exception -> 0x0803 }
            java.lang.String r5 = r6.getContent()     // Catch:{ Exception -> 0x0803 }
            s90.f r0 = r0.mo94597JZ(r10, r5)     // Catch:{ Exception -> 0x0803 }
            java.util.LinkedList<s90.j> r5 = r0.f226295i     // Catch:{ Exception -> 0x0803 }
            if (r5 == 0) goto L_0x081a
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0803 }
            r10 = 0
        L_0x05c6:
            boolean r11 = r5.hasNext()     // Catch:{ Exception -> 0x0803 }
            if (r11 == 0) goto L_0x07f5
            java.lang.Object r11 = r5.next()     // Catch:{ Exception -> 0x0803 }
            s90.j r11 = (s90.C77630j) r11     // Catch:{ Exception -> 0x0803 }
            java.lang.String r12 = r11.f226336r     // Catch:{ Exception -> 0x0803 }
            sg.g<java.lang.Long, s90.i> r13 = com.tencent.p014mm.message.C92721n.f266840a     // Catch:{ Exception -> 0x0803 }
            boolean r12 = kb0.C9576e.m9260a(r12)     // Catch:{ Exception -> 0x0803 }
            if (r12 == 0) goto L_0x05dd
            goto L_0x05c6
        L_0x05dd:
            te3.sc0 r12 = new te3.sc0     // Catch:{ Exception -> 0x0803 }
            r12.<init>()     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r13 = m124274g(r6)     // Catch:{ Exception -> 0x0803 }
            r12.f299405d = r13     // Catch:{ Exception -> 0x0803 }
            java.lang.String r15 = r0.f226292f     // Catch:{ Exception -> 0x0803 }
            r13.mo141305l(r15)     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r13 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r15 = r11.f226326e     // Catch:{ Exception -> 0x0803 }
            r13.mo141307n(r15)     // Catch:{ Exception -> 0x0803 }
            te3.rc0 r13 = new te3.rc0     // Catch:{ Exception -> 0x0803 }
            r13.<init>()     // Catch:{ Exception -> 0x0803 }
            java.lang.String r15 = r11.f226325d     // Catch:{ Exception -> 0x0803 }
            r13.mo141246U(r15)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r15 = r11.f226332n     // Catch:{ Exception -> 0x0803 }
            r13.mo141265u(r15)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r15 = m124275h(r6)     // Catch:{ Exception -> 0x0803 }
            r13.mo141259o(r15)     // Catch:{ Exception -> 0x0803 }
            long r14 = r6.mo108774y2()     // Catch:{ Exception -> 0x0803 }
            r13.mo141229B(r14)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r14 = r11.f226330i     // Catch:{ Exception -> 0x0803 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0803 }
            if (r14 != 0) goto L_0x0622
            java.lang.String r14 = r11.f226330i     // Catch:{ Exception -> 0x0803 }
            java.lang.String r14 = p243tn.C14050a.m13405b(r14)     // Catch:{ Exception -> 0x0803 }
            r13.f299286W = r14     // Catch:{ Exception -> 0x0803 }
            goto L_0x0625
        L_0x0622:
            r13.mo141232F(r9)     // Catch:{ Exception -> 0x0803 }
        L_0x0625:
            r13.mo141231E(r9)     // Catch:{ Exception -> 0x0803 }
            te3.ae0 r14 = new te3.ae0     // Catch:{ Exception -> 0x0803 }
            r14.<init>()     // Catch:{ Exception -> 0x0803 }
            java.lang.String r15 = r11.f226325d     // Catch:{ Exception -> 0x0803 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0803 }
            if (r15 != 0) goto L_0x063a
            java.lang.String r15 = r11.f226325d     // Catch:{ Exception -> 0x0803 }
            r14.mo141198r(r15)     // Catch:{ Exception -> 0x0803 }
        L_0x063a:
            java.lang.String r15 = r11.f226332n     // Catch:{ Exception -> 0x0803 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0803 }
            if (r15 != 0) goto L_0x0647
            java.lang.String r15 = r11.f226332n     // Catch:{ Exception -> 0x0803 }
            r14.mo141194n(r15)     // Catch:{ Exception -> 0x0803 }
        L_0x0647:
            java.lang.String r15 = r11.f226330i     // Catch:{ Exception -> 0x0803 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x0803 }
            if (r15 != 0) goto L_0x0656
            java.lang.String r15 = com.tencent.p014mm.message.C92721n.m116882j(r11)     // Catch:{ Exception -> 0x0803 }
            r14.mo141197q(r15)     // Catch:{ Exception -> 0x0803 }
        L_0x0656:
            int r15 = r14.computeSize()     // Catch:{ Exception -> 0x0803 }
            if (r15 <= 0) goto L_0x0661
            r14.mo141196p(r9)     // Catch:{ Exception -> 0x0803 }
            r12.f299407f = r14     // Catch:{ Exception -> 0x0803 }
        L_0x0661:
            r15 = 5
            r13.mo141260p(r15)     // Catch:{ Exception -> 0x0803 }
            r13.f299296c1 = r12     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r7 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r7 = m124277j(r7)     // Catch:{ Exception -> 0x0803 }
            r13.mo141263s(r7)     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r7 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r7 = m124278k(r7)     // Catch:{ Exception -> 0x0803 }
            r13.mo141264t(r7)     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r7 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r7 = r7.f299525o     // Catch:{ Exception -> 0x0803 }
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85843n5(r7)     // Catch:{ Exception -> 0x0803 }
            if (r7 == 0) goto L_0x06a1
            te3.tc0 r7 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r7 = r7.f299525o     // Catch:{ Exception -> 0x0803 }
            k40.a r18 = f40.C86709a0.m107533q(r3)     // Catch:{ Exception -> 0x0803 }
            f62.k0 r18 = (f62.C75700k0) r18     // Catch:{ Exception -> 0x0803 }
            com.tencent.mm.storage.u3 r9 = r18.mo96097Ni()     // Catch:{ Exception -> 0x0803 }
            com.tencent.mm.storage.z1 r7 = r9.get(r7)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r7 = qe0.C47806g.m53116a(r7)     // Catch:{ Exception -> 0x0803 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0803 }
            if (r9 != 0) goto L_0x06a1
            r13.f299245B1 = r7     // Catch:{ Exception -> 0x0803 }
        L_0x06a1:
            int r7 = r11.f226333o     // Catch:{ Exception -> 0x0803 }
            if (r7 != r15) goto L_0x0767
            java.lang.String r7 = r11.f226321M     // Catch:{ Exception -> 0x0803 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0803 }
            if (r7 != 0) goto L_0x0767
            java.lang.String r7 = r11.f226321M     // Catch:{ Exception -> 0x0803 }
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r7)     // Catch:{ Exception -> 0x0803 }
            if (r7 == 0) goto L_0x0767
            java.lang.String r7 = r11.f226321M     // Catch:{ Exception -> 0x0803 }
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r7)     // Catch:{ Exception -> 0x0803 }
            if (r10 != 0) goto L_0x06bf
            r9 = r8
            goto L_0x06ce
        L_0x06bf:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0803 }
            r9.<init>()     // Catch:{ Exception -> 0x0803 }
            r9.append(r10)     // Catch:{ Exception -> 0x0803 }
            r9.append(r8)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0803 }
        L_0x06ce:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0803 }
            r15.<init>()     // Catch:{ Exception -> 0x0803 }
            r18 = r3
            java.lang.String r3 = ".msg.appmsg.mmreader.category.item"
            r15.append(r3)     // Catch:{ Exception -> 0x0803 }
            r15.append(r9)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x0803 }
            java.lang.Class<ht1.p4> r9 = ht1.C60193p4.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ Exception -> 0x0803 }
            ht1.p4 r9 = (ht1.C60193p4) r9     // Catch:{ Exception -> 0x0803 }
            te3.rk1 r3 = r9.an0(r3, r7)     // Catch:{ Exception -> 0x0803 }
            if (r3 == 0) goto L_0x0763
            java.lang.String r7 = r3.f185183d     // Catch:{ Exception -> 0x0803 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0803 }
            if (r7 != 0) goto L_0x0763
            java.lang.String r7 = "biz enter finder logic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)     // Catch:{ Exception -> 0x0803 }
            te3.rc0 r7 = new te3.rc0     // Catch:{ Exception -> 0x0803 }
            r7.<init>()     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r9 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r9 = m124277j(r9)     // Catch:{ Exception -> 0x0803 }
            r7.mo141263s(r9)     // Catch:{ Exception -> 0x0803 }
            te3.tc0 r9 = r12.f299405d     // Catch:{ Exception -> 0x0803 }
            java.lang.String r9 = m124278k(r9)     // Catch:{ Exception -> 0x0803 }
            r7.mo141264t(r9)     // Catch:{ Exception -> 0x0803 }
            java.lang.String r9 = m124275h(r6)     // Catch:{ Exception -> 0x0803 }
            r7.mo141259o(r9)     // Catch:{ Exception -> 0x0803 }
            r9 = r4
            r19 = r5
            long r4 = r6.mo108774y2()     // Catch:{ Exception -> 0x0801 }
            r7.mo141229B(r4)     // Catch:{ Exception -> 0x0801 }
            r4 = 1
            r7.mo141231E(r4)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = r3.f185185f     // Catch:{ Exception -> 0x0801 }
            java.lang.String r5 = r3.f185198v     // Catch:{ Exception -> 0x0801 }
            if (r5 == 0) goto L_0x0736
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0801 }
            if (r5 != 0) goto L_0x0736
            java.lang.String r4 = r3.f185198v     // Catch:{ Exception -> 0x0801 }
        L_0x0736:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0801 }
            r5.<init>()     // Catch:{ Exception -> 0x0801 }
            r5.append(r4)     // Catch:{ Exception -> 0x0801 }
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0801 }
            r13 = 2131825789(0x7f11147d, float:1.9284444E38)
            java.lang.String r4 = r4.getString(r13)     // Catch:{ Exception -> 0x0801 }
            r5.append(r4)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0801 }
            r7.mo141246U(r4)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = r3.f185187h     // Catch:{ Exception -> 0x0801 }
            r7.mo141265u(r4)     // Catch:{ Exception -> 0x0801 }
            r4 = 22
            r7.mo141260p(r4)     // Catch:{ Exception -> 0x0801 }
            r12.f299423y = r3     // Catch:{ Exception -> 0x0801 }
            r7.f299296c1 = r12     // Catch:{ Exception -> 0x0801 }
            r15 = 1
            goto L_0x07c9
        L_0x0763:
            r9 = r4
            r19 = r5
            goto L_0x07c7
        L_0x0767:
            r18 = r3
            r9 = r4
            r19 = r5
            int r3 = r11.f226333o     // Catch:{ Exception -> 0x0801 }
            r4 = 19
            if (r3 != r4) goto L_0x07c7
            te3.rc0 r13 = new te3.rc0     // Catch:{ Exception -> 0x0801 }
            r13.<init>()     // Catch:{ Exception -> 0x0801 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0801 }
            r3.<init>()     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = "["
            r3.append(r4)     // Catch:{ Exception -> 0x0801 }
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0801 }
            r5 = 2131826364(0x7f1116bc, float:1.928561E38)
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x0801 }
            r3.append(r4)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = "]"
            r3.append(r4)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0801 }
            te3.tc0 r4 = r12.f299405d     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = m124277j(r4)     // Catch:{ Exception -> 0x0801 }
            r13.mo141263s(r4)     // Catch:{ Exception -> 0x0801 }
            te3.tc0 r4 = r12.f299405d     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = m124278k(r4)     // Catch:{ Exception -> 0x0801 }
            r13.mo141264t(r4)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = m124275h(r6)     // Catch:{ Exception -> 0x0801 }
            r13.mo141259o(r4)     // Catch:{ Exception -> 0x0801 }
            r13.mo141246U(r3)     // Catch:{ Exception -> 0x0801 }
            r13.mo141265u(r3)     // Catch:{ Exception -> 0x0801 }
            r3 = 1
            r13.mo141231E(r3)     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = m124275h(r6)     // Catch:{ Exception -> 0x0801 }
            r13.mo141259o(r4)     // Catch:{ Exception -> 0x0801 }
            r13.mo141260p(r3)     // Catch:{ Exception -> 0x0801 }
            r13.f299296c1 = r12     // Catch:{ Exception -> 0x0801 }
        L_0x07c7:
            r7 = r13
            r15 = 0
        L_0x07c9:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d     // Catch:{ Exception -> 0x0801 }
            te3.kd0 r3 = r3.f264676a     // Catch:{ Exception -> 0x0801 }
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f     // Catch:{ Exception -> 0x0801 }
            r3.add(r7)     // Catch:{ Exception -> 0x0801 }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d     // Catch:{ Exception -> 0x0801 }
            te3.zd0 r3 = r3.f264677b     // Catch:{ Exception -> 0x0801 }
            int r4 = r3.f186675h     // Catch:{ Exception -> 0x0801 }
            r5 = 1
            int r4 = r4 + r5
            r3.f186675h = r4     // Catch:{ Exception -> 0x0801 }
            int r10 = r10 + 1
            if (r15 != 0) goto L_0x07ea
            java.lang.String r3 = r0.f226292f     // Catch:{ Exception -> 0x0801 }
            java.lang.String r4 = r0.f226293g     // Catch:{ Exception -> 0x0801 }
            te3.ad0 r3 = com.tencent.p014mm.message.C92721n.m116878f(r11, r14, r3, r4)     // Catch:{ Exception -> 0x0801 }
            r12.f299421w = r3     // Catch:{ Exception -> 0x0801 }
        L_0x07ea:
            r5 = r19
            r4 = r9
            r3 = r18
            r9 = 1
            r14 = 2131825667(0x7f111403, float:1.9284197E38)
            goto L_0x05c6
        L_0x07f5:
            r9 = r4
            if (r10 != 0) goto L_0x00f2
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d     // Catch:{ Exception -> 0x0801 }
            r3 = 2131825665(0x7f111401, float:1.9284193E38)
            r0.f264687l = r3     // Catch:{ Exception -> 0x0801 }
            goto L_0x08f7
        L_0x0801:
            r0 = move-exception
            goto L_0x0805
        L_0x0803:
            r0 = move-exception
            r9 = r4
        L_0x0805:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r8, r4)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getLocalizedMessage()
            r4[r3] = r0
            java.lang.String r0 = "retransmit app msg error : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r4)
        L_0x081a:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825667(0x7f111403, float:1.9284197E38)
            r0.f264687l = r3
            goto L_0x08f7
        L_0x0823:
            if (r2 == 0) goto L_0x0837
            boolean r3 = r6.mo100973L3()
            if (r3 != 0) goto L_0x0831
            boolean r3 = r6.mo101022y3()
            if (r3 == 0) goto L_0x0837
        L_0x0831:
            r3 = 1
            m124271d(r0, r1, r6, r3)
            goto L_0x00f2
        L_0x0837:
            if (r2 == 0) goto L_0x0847
            int r3 = r6.getType()
            r4 = 419430449(0x19000031, float:6.6174836E-24)
            if (r3 != r4) goto L_0x0847
            m124271d(r0, r1, r6, r11)
            goto L_0x00f2
        L_0x0847:
            boolean r3 = r6.mo100975N3()
            if (r3 == 0) goto L_0x0852
            m124269b(r0, r1, r6)
            goto L_0x00f2
        L_0x0852:
            boolean r3 = r6.mo100981T3()
            if (r3 == 0) goto L_0x08d0
            te3.sc0 r0 = new te3.sc0
            r0.<init>()
            te3.tc0 r3 = m124274g(r6)
            r0.f299405d = r3
            java.lang.Class<he0.h> r3 = he0.C46021h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            he0.h r3 = (he0.C46021h) r3
            java.lang.String r4 = r6.getContent()
            ie0.m r3 = r3.mo71455Rm(r4)
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            if (r3 == 0) goto L_0x0887
            java.lang.String r5 = r3.mo71634a()
            java.lang.String r3 = r3.f124596a
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r3)
            r4.mo141246U(r3)
        L_0x0887:
            java.lang.String r3 = m124275h(r6)
            r4.mo141259o(r3)
            r3 = 31
            r4.mo141260p(r3)
            java.lang.String r3 = r6.getContent()
            r4.mo141265u(r3)
            r3 = 1
            r4.mo141232F(r3)
            r4.mo141231E(r3)
            r4.f299296c1 = r0
            te3.tc0 r3 = r0.f299405d
            java.lang.String r3 = m124277j(r3)
            r4.mo141263s(r3)
            te3.tc0 r0 = r0.f299405d
            java.lang.String r0 = m124278k(r0)
            r4.mo141264t(r0)
            long r7 = r6.mo108774y2()
            r4.mo141229B(r7)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186685u
            r4 = 1
            int r3 = r3 + r4
            r0.f186685u = r3
            goto L_0x08f8
        L_0x08d0:
            r4 = 1
            boolean r3 = r6.mo101020w3()
            if (r3 == 0) goto L_0x08ea
            boolean r3 = r6.mo101022y3()
            if (r3 == 0) goto L_0x08e5
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825665(0x7f111401, float:1.9284193E38)
            r0.f264687l = r3
            goto L_0x08f7
        L_0x08e5:
            boolean r4 = m124268a(r0, r1, r6, r2)
            goto L_0x08f8
        L_0x08ea:
            r3 = 2131825665(0x7f111401, float:1.9284193E38)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d
            r5.f264687l = r3
            if (r2 == 0) goto L_0x08f7
            m124271d(r0, r1, r6, r10)
            goto L_0x08f8
        L_0x08f7:
            r4 = 0
        L_0x08f8:
            if (r2 != 0) goto L_0x08fd
            com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118400a(r6, r1, r4)
        L_0x08fd:
            return r4
        L_0x08fe:
            r9 = r5
            java.lang.String r0 = "fill favorite event fail, event or msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            if (r1 == 0) goto L_0x090d
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825657(0x7f1113f9, float:1.9284176E38)
            r0.f264687l = r1
        L_0x090d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96789p0.m124272e(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f4, boolean):boolean");
    }

    /* renamed from: f */
    public static boolean m124273f(Context context, DoFavoriteEvent doFavoriteEvent, String str, List<C72963f4> list, boolean z, boolean z2) {
        String str2;
        Context context2 = context;
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        String str3 = str;
        List<C72963f4> list2 = list;
        boolean z3 = z;
        Class cls = C75339i.class;
        if (doFavoriteEvent2 == null || list2 == null || list.isEmpty() || context2 == null) {
            Log.m105928w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msgs is null");
            if (doFavoriteEvent2 != null) {
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        for (C72963f4 next : list) {
            if (C75569c4.m90690w(next)) {
                int type = next.getType() & 65535;
                if (type == 1) {
                    next.mo108732L2(context.getString(C0966R.string.a3f));
                } else if (type == 3) {
                    next.mo108732L2(context.getString(C0966R.string.a1p));
                    next.setType(1);
                } else if (type == 43) {
                    next.mo108732L2(context.getString(C0966R.string.f360103a43));
                    next.setType(1);
                } else if (type == 49) {
                    next.mo108732L2(context.getString(C0966R.string.a3q));
                    next.setType(1);
                }
            }
        }
        boolean OE = ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(str3);
        if (list.size() != 1 || z2) {
            doFavoriteEvent2.f264674d.f264676a = new C101801kd0();
            doFavoriteEvent2.f264674d.f264677b = new C64878zd0();
            if (OE) {
                str2 = "";
                long l2 = list2.get(0).mo108759l2();
                String str4 = C48340e.f129426a;
                String str5 = C48009v0.Ax0().mo73042a0(l2).field_bizChatServId;
                if (C48340e.m53675p(str5)) {
                    doFavoriteEvent2.f264674d.f264676a.mo141220r(context.getString(C0966R.string.htm));
                } else {
                    C48353j e = C48340e.m53664e(str);
                    if (e != null) {
                        doFavoriteEvent2.f264674d.f264676a.mo141220r(context.getString(C0966R.string.cq8, new Object[]{e.field_userName, C48340e.m53672m(str5)}));
                    }
                }
            } else {
                str2 = "";
                if (C72996z1.m85820U5(str)) {
                    doFavoriteEvent2.f264674d.f264676a.mo141220r(context.getString(C0966R.string.htm));
                } else {
                    String nullAsNil = Util.nullAsNil(C75592q0.m90783m());
                    if (nullAsNil.equals(Util.nullAsNil(((C75339i) C86312j.m106911c(cls)).mo62514P1(str3)))) {
                        doFavoriteEvent2.f264674d.f264676a.mo141220r(context.getString(C0966R.string.cq9, new Object[]{nullAsNil}));
                    } else {
                        doFavoriteEvent2.f264674d.f264676a.mo141220r(context.getString(C0966R.string.cq8, new Object[]{C75592q0.m90783m(), ((C75339i) C86312j.m106911c(cls)).mo62514P1(str3)}));
                    }
                }
            }
            Log.m105919d("MicroMsg.GetFavRecordDataSource", "title %s", doFavoriteEvent2.f264674d.f264676a.f298626q);
            C101801kd0 kd02 = doFavoriteEvent2.f264674d.f264676a;
            C101835rd0 rd02 = new C101835rd0();
            rd02.mo141275k(str3);
            rd02.mo141277m(1);
            rd02.mo141273f(Util.nowMilliSecond());
            rd02.mo141278n(str2);
            kd02.mo141219q(rd02);
            doFavoriteEvent2.f264674d.f264678c = 14;
            boolean z4 = false;
            boolean z5 = true;
            for (C72963f4 e2 : list) {
                if (m124272e(context, doFavoriteEvent2, e2, z3)) {
                    z4 = true;
                } else {
                    z5 = false;
                }
            }
            if (z4) {
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
                if (aVar.f264687l > 0) {
                    aVar.f264687l = 0;
                }
            }
            return z5;
        }
        C72963f4 f4Var = list2.get(0);
        if (!f4Var.mo100967F3()) {
            return C96787m0.m124256j(doFavoriteEvent2, f4Var);
        }
        LinkedList<C77630j> linkedList = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent()).f226295i;
        if (linkedList != null && linkedList.size() == 1) {
            return C96787m0.m124256j(doFavoriteEvent2, f4Var);
        }
        doFavoriteEvent2.f264674d.f264676a = new C101801kd0();
        doFavoriteEvent2.f264674d.f264677b = new C64878zd0();
        C101801kd0 kd03 = doFavoriteEvent2.f264674d.f264676a;
        C101835rd0 rd03 = new C101835rd0();
        rd03.mo141275k(str3);
        rd03.mo141277m(1);
        rd03.mo141273f(Util.nowMilliSecond());
        rd03.mo141278n("");
        kd03.mo141219q(rd03);
        doFavoriteEvent2.f264674d.f264678c = 14;
        return m124272e(context, doFavoriteEvent2, f4Var, z3);
    }

    /* renamed from: g */
    public static C101846tc0 m124274g(C72963f4 f4Var) {
        C101846tc0 tc02 = new C101846tc0();
        if (f4Var != null) {
            if (f4Var.mo108769t2() == 0) {
                tc02.mo141306m(f4Var.mo108768t());
                tc02.mo141310q(C75592q0.m90789s());
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    tc02.mo141308o(f4Var.getContent() != null ? f4Var.getContent().substring(0, Math.max(0, f4Var.getContent().indexOf(58))) : "");
                    if (!Util.isNullOrNil(tc02.f299525o) && !f4Var.mo100995g4()) {
                        f4Var.mo108732L2(f4Var.getContent().substring(tc02.f299525o.length() + 1));
                        if (f4Var.getContent().length() > 0 && 10 == f4Var.getContent().charAt(0)) {
                            f4Var.mo108732L2(f4Var.getContent().substring(1));
                        }
                        if (f4Var.mo101015s3()) {
                            if (!Util.isNullOrNil(f4Var.mo108727G2()) && f4Var.mo108727G2().startsWith(tc02.f299525o)) {
                                f4Var.mo108758i3(f4Var.mo108727G2().substring(tc02.f299525o.length() + 1));
                            }
                            if (f4Var.mo108727G2().length() > 0 && 10 == f4Var.mo108727G2().charAt(0)) {
                                f4Var.mo108758i3(f4Var.mo108727G2().substring(1));
                            }
                        }
                    }
                }
            } else {
                tc02.mo141306m(C75592q0.m90789s());
                tc02.mo141310q(f4Var.mo108768t());
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    tc02.mo141308o(tc02.f299519f);
                }
            }
            if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var.mo108768t())) {
                String m2 = f4Var.mo108760m2();
                if (m2 == null) {
                    m2 = C75604z3.m90851w(f4Var.f230724G).f222109p;
                }
                tc02.mo141308o(m2);
            }
            tc02.mo141309p(1);
            tc02.f299527q = f4Var.getCreateTime();
            tc02.f299528r = true;
            tc02.f299529s = f4Var.mo108774y2() + "";
            tc02.f299530t = true;
            if (f4Var.mo108774y2() > 0) {
                tc02.f299523j = f4Var.mo108774y2() + "";
                tc02.f299524n = true;
            }
        }
        return tc02;
    }

    /* renamed from: h */
    public static String m124275h(C72963f4 f4Var) {
        if (f4Var.mo108769t2() != 1) {
            return String.valueOf(f4Var.mo108774y2());
        }
        if (C72996z1.m85820U5(f4Var.mo108768t()) || f4Var.mo108768t().equals("filehelper")) {
            return String.format("%d", new Object[]{Long.valueOf(f4Var.mo108774y2())});
        }
        return String.format("%s#%d", new Object[]{f4Var.mo108768t(), Long.valueOf(f4Var.mo108774y2())});
    }

    /* renamed from: i */
    public static C101834rc0 m124276i(C72963f4 f4Var, String str, C101841sc0 sc02) {
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141259o(m124275h(f4Var));
        rc02.mo141260p(1);
        rc02.mo141265u(str);
        rc02.mo141232F(true);
        rc02.mo141231E(true);
        rc02.f299296c1 = sc02;
        rc02.mo141263s(m124277j(sc02.f299405d));
        rc02.mo141264t(m124278k(sc02.f299405d));
        if (C72996z1.m85843n5(sc02.f299405d.f299525o)) {
            String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(sc02.f299405d.f299525o));
            if (!Util.isNullOrNil(a)) {
                rc02.f299245B1 = a;
            }
        }
        return rc02;
    }

    /* renamed from: j */
    public static String m124277j(C101846tc0 tc02) {
        String str = tc02.f299525o;
        if (Util.isNullOrNil(str)) {
            str = tc02.f299519f;
        }
        return C48340e.m53674o(str) ? C48340e.m53672m(str) : ((C75339i) C86312j.m106911c(C75339i.class)).mo62514P1(str);
    }

    /* renamed from: k */
    public static String m124278k(C101846tc0 tc02) {
        return f283531a.format(new Date(tc02.f299527q));
    }

    /* renamed from: l */
    public static C101834rc0 m124279l(C72963f4 f4Var, C68070l.C68072b bVar, int i) {
        Class cls = C98201k.class;
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141259o(m124275h(f4Var));
        rc02.mo141240O(bVar.f195530T);
        rc02.mo141241P(bVar.f195533U);
        rc02.mo141242Q(bVar.f195586j);
        if (C100734q.m131843d0()) {
            rc02.mo141256l(bVar.f195503K);
            rc02.mo141255k(bVar.f195527S);
            rc02.mo141245T(bVar.f195509M);
            rc02.mo141243R((long) bVar.f195506L);
            rc02.f299334w1 = bVar.f195464A;
            rc02.mo141232F(false);
            C86009m1 m1Var = new C86009m1(Util.nullAs(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(f4Var.mo108765s2(), true), ""));
            if (m1Var.mo119967g()) {
                rc02.f299286W = m1Var.mo119971i();
            }
        } else {
            C86009m1 m1Var2 = new C86009m1(Util.nullAs(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(f4Var.mo108765s2(), true), ""));
            if (m1Var2.mo119967g()) {
                rc02.f299286W = m1Var2.mo119971i();
            } else {
                rc02.mo141232F(true);
            }
        }
        rc02.mo141231E(true);
        rc02.mo141246U(bVar.f195570f);
        rc02.mo141265u(bVar.f195574g);
        rc02.mo141260p(i);
        rc02.mo141252d(bVar.f195475C2);
        rc02.mo141229B(f4Var.mo108774y2());
        return rc02;
    }
}
