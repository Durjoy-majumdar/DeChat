package qg2;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tav.coremedia.TimeUtil;
import d62.C75339i;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import gw0.C76073b;
import he0.C46021h;
import ie0.C46223m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import p158gt.C98201k;
import p227rn.C101396n;
import p227rn.C101397o;
import p227rn.C48053v;
import p243tn.C14050a;
import pb1.C100714h1;
import qe0.C47806g;
import s90.C77627f;
import s90.C77630j;
import sb0.C48353j;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C64258bf0;
import te3.C64878zd0;

/* renamed from: qg2.j */
public class C101146j {

    /* renamed from: a */
    public static final SimpleDateFormat f296055a = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);

    /* renamed from: a */
    public static String m132592a(C64258bf0 bf02) {
        if (TextUtils.isEmpty(bf02.f182282f) || (bf02.f182284h & 1) == 1) {
            return bf02.f182281e;
        }
        return MMApplicationContext.getContext().getString(C0966R.string.htc, new Object[]{bf02.f182282f, bf02.f182281e});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0939, code lost:
        r4 = new te3.C101834rc0();
        r4.mo141259o(m132603l(r19));
        r4.mo141229B(r19.mo108774y2());
        r4.mo141260p(1);
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0958, code lost:
        if (r12.f195582i != 74) goto L_0x0964;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x095a, code lost:
        r2.append(r0.getString(com.tencent.p014mm.C0966R.string.f8007z3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0964, code lost:
        r2.append(r12.f195570f);
        r4.mo141265u(r2.toString());
        r4.mo141232F(true);
        r4.mo141231E(true);
        r4.f299296c1 = r8;
        r4.mo141263s(m132605n(r8.f299405d));
        r4.mo141264t(m132606o(r8.f299405d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0993, code lost:
        if (com.tencent.p014mm.storage.C72996z1.m85843n5(r8.f299405d.f299525o) == false) goto L_0x09b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0995, code lost:
        r0 = qe0.C47806g.m53116a(((f62.C75700k0) f40.C86709a0.m107533q(r6)).mo96097Ni().get(r8.f299405d.f299525o));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x09af, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) != false) goto L_0x09b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x09b1, code lost:
        r4.f299245B1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x09b3, code lost:
        r1.f264674d.f264676a.f298618f.add(r4);
        r1.f264674d.f264677b.f186671d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x09c6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0a23, code lost:
        r0 = (ht1.C60178k) r12.mo93555w(ht1.C60178k.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0a2b, code lost:
        if (r0 == null) goto L_0x0a91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0a2d, code lost:
        r0 = r0.f171714b;
        r3 = new te3.C101834rc0();
        r3.mo141263s(m132605n(r8.f299405d));
        r3.mo141264t(m132606o(r8.f299405d));
        r3.mo141259o(m132603l(r19));
        r3.mo141229B(r19.mo108774y2());
        r3.mo141231E(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0a5a, code lost:
        if (r0.f185604e != 1) goto L_0x0a71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0a5c, code lost:
        r3.mo141246U(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.f361167hu1, new java.lang.Object[]{r0.f185603d}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0a71, code lost:
        r3.mo141246U(r0.f185603d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0a76, code lost:
        r3.mo141265u(r0.f185606g);
        r3.mo141260p(27);
        r8.mo141299y(r0);
        r3.mo141258n(r8);
        r1.f264674d.f264676a.f298618f.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0a90, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0a91, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132593b(android.content.Context r17, com.tencent.p014mm.autogen.events.DoFavoriteEvent r18, com.tencent.p014mm.storage.C72963f4 r19, boolean r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Class<ls3.g> r3 = ls3.C61397g.class
            java.lang.Class<ym.s> r4 = p763ym.C53543s.class
            java.lang.Class<gt.k> r5 = p158gt.C98201k.class
            java.lang.Class<f62.k0> r6 = f62.C75700k0.class
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.m> r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m.class
            te3.sc0 r8 = new te3.sc0
            r8.<init>()
            te3.tc0 r9 = m132601j(r19)
            r8.f299405d = r9
            java.lang.String r9 = r19.getContent()
            r10 = 0
            r11 = 2131825667(0x7f111403, float:1.9284197E38)
            if (r9 != 0) goto L_0x002a
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r11
            return r10
        L_0x002a:
            r12 = 0
            com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r12)
            if (r12 != 0) goto L_0x0036
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r11
            return r10
        L_0x0036:
            te3.tc0 r11 = r8.f299405d
            java.lang.String r13 = r12.f195562d
            r11.f299533w = r13
            r13 = 1
            r11.f299534x = r13
            java.lang.String r14 = r12.f195634v
            r11.mo141305l(r14)
            java.lang.Class<ym.l> r11 = p763ym.C79138l.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ym.l r11 = (p763ym.C79138l) r11
            java.lang.String r14 = r12.f195562d
            com.tencent.mm.pluginsdk.model.app.j r11 = r11.getAppInfo(r14)
            if (r11 == 0) goto L_0x0071
            boolean r11 = r11.mo69359k()
            if (r11 == 0) goto L_0x0071
            if (r20 == 0) goto L_0x0071
            r3 = 2131821548(0x7f1103ec, float:1.9275842E38)
            java.lang.String r0 = r0.getString(r3)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r13
        L_0x0071:
            int r11 = r12.f195582i
            r14 = 2131825665(0x7f111401, float:1.9284193E38)
            r15 = 19
            if (r11 == r15) goto L_0x0bdb
            r15 = 20
            if (r11 == r15) goto L_0x0b51
            r15 = 50
            if (r11 == r15) goto L_0x0b02
            r15 = 51
            if (r11 == r15) goto L_0x0a92
            r15 = 2131821615(0x7f11042f, float:1.9275978E38)
            r13 = 2131825673(0x7f111409, float:1.9284209E38)
            switch(r11) {
                case 1: goto L_0x0461;
                case 2: goto L_0x0394;
                case 3: goto L_0x0323;
                case 4: goto L_0x02be;
                case 5: goto L_0x01c4;
                case 6: goto L_0x00c1;
                case 7: goto L_0x0098;
                default: goto L_0x008f;
            }
        L_0x008f:
            r4 = 1
            switch(r11) {
                case 10: goto L_0x07a4;
                case 13: goto L_0x0714;
                case 16: goto L_0x0711;
                case 24: goto L_0x0c9e;
                case 33: goto L_0x05f8;
                case 36: goto L_0x05f8;
                case 44: goto L_0x05b1;
                case 46: goto L_0x059e;
                case 48: goto L_0x0577;
                case 53: goto L_0x0461;
                case 57: goto L_0x0461;
                case 59: goto L_0x0a23;
                case 63: goto L_0x04db;
                case 82: goto L_0x049c;
                case 88: goto L_0x04db;
                case 94: goto L_0x0464;
                case 98: goto L_0x0cdb;
                case 101: goto L_0x0cf2;
                default: goto L_0x0093;
            }
        L_0x0093:
            switch(r11) {
                case 72: goto L_0x0a23;
                case 73: goto L_0x09c7;
                case 74: goto L_0x0461;
                case 75: goto L_0x0ccd;
                case 76: goto L_0x0833;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0d1b
        L_0x0098:
            java.lang.String r0 = r12.f195606o
            if (r0 == 0) goto L_0x00b5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a3
            goto L_0x00b5
        L_0x00a3:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            boolean r0 = r0.mo121147n()
            if (r0 != 0) goto L_0x00bc
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r10
        L_0x00b5:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r2 = 2131825658(0x7f1113fa, float:1.9284178E38)
            r0.f264687l = r2
        L_0x00bc:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r14
            return r10
        L_0x00c1:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            boolean r0 = r0.mo121147n()
            if (r0 != 0) goto L_0x00d3
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r10
        L_0x00d3:
            di3.d r0 = di3.C86312j.m106911c(r4)
            ym.s r0 = (p763ym.C53543s) r0
            ym.i r0 = r0.mo74024KZ()
            java.lang.String r3 = r12.f195606o
            com.tencent.mm.pluginsdk.model.app.e r0 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r0
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r3)
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r0.field_fileFullPath
            r3.f299284V = r0
        L_0x00f0:
            java.lang.String r0 = m132603l(r19)
            r3.mo141259o(r0)
            long r9 = r19.mo108774y2()
            r3.mo141229B(r9)
            r0 = 8
            r3.mo141260p(r0)
            java.lang.String r0 = r12.f195602n
            r3.mo141261q(r0)
            di3.d r0 = di3.C86312j.m106911c(r5)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r4 = r19.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            r5 = 1
            java.lang.String r0 = r0.v10(r4, r5)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0126
            r3.mo141232F(r5)
        L_0x0126:
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r4 == 0) goto L_0x012f
            r3.mo141233G(r0)
        L_0x012f:
            java.lang.String r0 = r12.f195570f
            r3.mo141246U(r0)
            java.lang.String r0 = r12.f195574g
            r3.mo141265u(r0)
            r3.mo141258n(r8)
            te3.tc0 r0 = r8.mo141282d()
            java.lang.String r0 = m132605n(r0)
            r3.mo141263s(r0)
            te3.tc0 r0 = r8.mo141282d()
            java.lang.String r0 = m132606o(r0)
            r3.mo141264t(r0)
            long r4 = r19.getMsgId()
            r3.mo141237K(r4)
            int r0 = r12.f195594l
            long r4 = (long) r0
            r3.mo141269y(r4)
            java.lang.String r0 = r12.f195622s
            r3.mo141268x(r0)
            te3.tc0 r0 = r8.mo141282d()
            java.lang.String r0 = m132602k(r0)
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x0195
            te3.tc0 r0 = r8.mo141282d()
            java.lang.String r0 = m132602k(r0)
            k40.a r2 = f40.C86709a0.m107533q(r6)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r2.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0195
            r3.mo141238L(r0)
        L_0x0195:
            if (r20 == 0) goto L_0x01b0
            java.lang.String r0 = r12.f195500J
            r3.mo141254j(r0)
            java.lang.String r0 = r12.f195524R
            r3.mo141253f(r0)
            java.lang.String r0 = r12.f195650z
            r3.mo141249X(r0)
            java.lang.String r0 = r12.f195524R
            r3.mo141247V(r0)
            java.lang.String r0 = r12.f195472C
            r3.mo141248W(r0)
        L_0x01b0:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186678n
            r3 = 1
            int r1 = r1 + r3
            r0.f186678n = r1
            return r3
        L_0x01c4:
            r3 = 1
            java.lang.String r4 = r12.f195586j
            if (r4 == 0) goto L_0x029e
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x029e
            if (r20 == 0) goto L_0x01ed
            int r4 = r12.f195483E2
            if (r4 != r3) goto L_0x01d8
            r10 = 1
        L_0x01d8:
            if (r10 == 0) goto L_0x01ed
            java.lang.String r0 = r0.getString(r15)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r0 = 1
            return r0
        L_0x01ed:
            te3.tc0 r0 = r8.f299405d
            java.lang.String r3 = r12.f195586j
            r0.mo141307n(r3)
            r0 = 5
            te3.rc0 r0 = m132607p(r2, r12, r0)
            r0.f299296c1 = r8
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = m132605n(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = m132606o(r3)
            r0.mo141264t(r3)
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = r3.f299525o
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r3 == 0) goto L_0x023a
            te3.tc0 r3 = r8.mo141282d()
            java.lang.String r3 = m132602k(r3)
            k40.a r4 = f40.C86709a0.m107533q(r6)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r4.get(r3)
            java.lang.String r3 = qe0.C47806g.m53116a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x023a
            r0.mo141238L(r3)
        L_0x023a:
            te3.ae0 r3 = new te3.ae0
            r3.<init>()
            java.lang.String r4 = r12.f195570f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x024c
            java.lang.String r4 = r12.f195570f
            r3.mo141198r(r4)
        L_0x024c:
            java.lang.String r4 = r12.f195574g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0259
            java.lang.String r4 = r12.f195574g
            r3.mo141194n(r4)
        L_0x0259:
            java.lang.String r4 = r12.f195646y
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0266
            java.lang.String r4 = r12.f195646y
            r3.mo141197q(r4)
        L_0x0266:
            java.lang.String r4 = r12.f195475C2
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0276
            java.lang.String r4 = r12.f195475C2
            r3.f297875s = r4
            r4 = 1
            r3.f297876t = r4
            goto L_0x0277
        L_0x0276:
            r4 = 1
        L_0x0277:
            int r5 = r12.f195483E2
            r3.mo141195o(r5)
            int r5 = r3.computeSize()
            if (r5 <= 0) goto L_0x0288
            r3.mo141196p(r4)
            r8.mo141280A(r3)
        L_0x0288:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d
            te3.kd0 r5 = r5.f264676a
            java.util.LinkedList<te3.rc0> r5 = r5.f298618f
            r5.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186675h
            int r1 = r1 + r4
            r0.f186675h = r1
            m132595d(r2, r8, r3)
            return r4
        L_0x029e:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d
            r4 = 2131825661(0x7f1113fd, float:1.9284184E38)
            r3.f264687l = r4
            if (r20 == 0) goto L_0x02bd
            r3 = 2131821695(0x7f11047f, float:1.927614E38)
            java.lang.String r0 = r0.getString(r3)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r0 = 1
            return r0
        L_0x02bd:
            return r10
        L_0x02be:
            r0 = 4
            te3.rc0 r0 = m132607p(r2, r12, r0)
            r0.f299296c1 = r8
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = m132605n(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = m132606o(r3)
            r0.mo141264t(r3)
            long r3 = r19.getMsgId()
            r0.mo141237K(r3)
            java.lang.String r2 = r2.f230724G
            java.lang.String r2 = eb0.C75569c4.m90685r(r2)
            r0.mo141230C(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x030f
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x030f
            r0.f299245B1 = r2
        L_0x030f:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186674g
            r2 = 1
            int r1 = r1 + r2
            r0.f186674g = r1
            return r2
        L_0x0323:
            r0 = 7
            te3.rc0 r0 = m132607p(r2, r12, r0)
            r0.f299296c1 = r8
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132605n(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132606o(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0364
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0364
            r0.f299245B1 = r2
        L_0x0364:
            com.tencent.mm.message.g r2 = r12.mo93555w(r7)
            if (r2 == 0) goto L_0x0380
            com.tencent.mm.message.g r2 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            java.lang.String r2 = r2.f212519b
            r0.mo141235I(r2)
            com.tencent.mm.message.g r2 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            java.lang.String r2 = r2.f212520c
            r0.mo141236J(r2)
        L_0x0380:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186677j
            r2 = 1
            int r1 = r1 + r2
            r0.f186677j = r1
            return r2
        L_0x0394:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            boolean r0 = r0.mo121147n()
            if (r0 != 0) goto L_0x03a6
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r13
            return r10
        L_0x03a6:
            di3.d r0 = di3.C86312j.m106911c(r4)
            ym.s r0 = (p763ym.C53543s) r0
            ym.i r0 = r0.mo74024KZ()
            java.lang.String r3 = r12.f195606o
            com.tencent.mm.pluginsdk.model.app.e r0 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r0
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r3)
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            java.lang.String r4 = m132603l(r19)
            r3.mo141259o(r4)
            long r9 = r19.mo108774y2()
            r3.mo141229B(r9)
            if (r0 == 0) goto L_0x03d1
            java.lang.String r0 = r0.field_fileFullPath
            r3.f299284V = r0
        L_0x03d1:
            di3.d r0 = di3.C86312j.m106911c(r5)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r4 = r19.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            r5 = 1
            java.lang.String r0 = r0.v10(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r4 == 0) goto L_0x03ee
            r3.f299286W = r0
        L_0x03ee:
            r0 = 2
            r3.mo141260p(r0)
            java.lang.String r0 = r12.f195570f
            r3.mo141246U(r0)
            java.lang.String r0 = r12.f195574g
            r3.mo141265u(r0)
            r3.f299296c1 = r8
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = m132605n(r0)
            r3.mo141263s(r0)
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = m132606o(r0)
            r3.mo141264t(r0)
            long r4 = r19.getMsgId()
            r3.mo141237K(r4)
            java.lang.String r0 = r2.f230724G
            java.lang.String r0 = eb0.C75569c4.m90685r(r0)
            r3.mo141230C(r0)
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x044d
            te3.tc0 r0 = r8.mo141282d()
            java.lang.String r0 = m132602k(r0)
            k40.a r2 = f40.C86709a0.m107533q(r6)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r2.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x044d
            r3.mo141238L(r0)
        L_0x044d:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186672e
            r4 = 1
            int r1 = r1 + r4
            r0.f186672e = r1
            return r4
        L_0x0461:
            r3 = 1
            goto L_0x0939
        L_0x0464:
            java.lang.Class<ht1.j> r3 = ht1.C60176j.class
            com.tencent.mm.message.g r3 = r12.mo93555w(r3)
            ht1.j r3 = (ht1.C60176j) r3
            r5 = 2131821538(0x7f1103e2, float:1.9275822E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            te3.xk1 r4 = r3.f171713b
            java.lang.String r4 = r4.f186328f
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r6[r10] = r4
            java.lang.String r0 = r0.getString(r5, r6)
            te3.rc0 r2 = m132604m(r2, r0, r8)
            r2.mo141246U(r0)
            r0 = 34
            r2.mo141260p(r0)
            te3.xk1 r0 = r3.f171713b
            r8.f299404F = r0
            r2.f299296c1 = r8
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r2)
            r0 = 1
            return r0
        L_0x049c:
            java.lang.Class<ht1.i> r3 = ht1.C60175i.class
            com.tencent.mm.message.g r3 = r12.mo93555w(r3)
            ht1.i r3 = (ht1.C60175i) r3
            r4 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r0 = r0.getString(r4)
            if (r3 == 0) goto L_0x04cc
            te3.ci1 r4 = r3.f171712b
            java.lang.String r4 = r4.f182504p
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x04cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            te3.ci1 r0 = r3.mo85181f()
            java.lang.String r0 = r0.f182504p
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x04cc:
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r0 = 1
            return r0
        L_0x04db:
            java.lang.Class<ht1.b> r0 = ht1.C60151b.class
            com.tencent.mm.message.g r0 = r12.mo93555w(r0)
            ht1.b r0 = (ht1.C60151b) r0
            if (r0 == 0) goto L_0x0576
            te3.p81 r0 = r0.f171698b
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            te3.tc0 r5 = r8.f299405d
            java.lang.String r5 = m132605n(r5)
            r4.mo141263s(r5)
            te3.tc0 r5 = r8.f299405d
            java.lang.String r5 = m132606o(r5)
            r4.mo141264t(r5)
            java.lang.String r5 = m132603l(r19)
            r4.mo141259o(r5)
            long r5 = r19.mo108774y2()
            r4.mo141229B(r5)
            r2 = 1
            r4.mo141231E(r2)
            java.lang.String r5 = r0.f184778d
            r6 = 0
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r6)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131825787(0x7f11147b, float:1.928444E38)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r2 = r0.f184781g
            r7[r10] = r2
            java.lang.String r2 = r5.getString(r6, r7)
            di3.d r5 = di3.C86312j.m106911c(r3)
            ls3.g r5 = (ls3.C61397g) r5
            boolean r5 = r5.mo83476G0(r0)
            if (r5 != 0) goto L_0x0546
            di3.d r3 = di3.C86312j.m106911c(r3)
            r11 = r3
            ls3.g r11 = (ls3.C61397g) r11
            java.lang.String r12 = r0.f184779e
            r13 = 0
            r14 = 0
            boolean r3 = r11.Nj0(r12, r13, r14, r15)
            if (r3 == 0) goto L_0x0558
        L_0x0546:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131825786(0x7f11147a, float:1.9284438E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r0.f184781g
            r6[r10] = r5
            java.lang.String r2 = r2.getString(r3, r6)
        L_0x0558:
            r4.mo141246U(r2)
            java.lang.String r2 = r0.f184782h
            r4.mo141265u(r2)
            r2 = 23
            r4.mo141260p(r2)
            r8.mo141298x(r0)
            r4.mo141258n(r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            r0 = 1
            return r0
        L_0x0576:
            return r10
        L_0x0577:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131821550(0x7f1103ee, float:1.9275846E38)
            java.lang.String r0 = r0.getString(r4)
            r3.append(r0)
            java.lang.String r0 = r12.f195570f
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r3 = 1
            return r3
        L_0x059e:
            r3 = 1
            java.lang.String r0 = r0.getString(r15)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r3
        L_0x05b1:
            r3 = 1
            java.lang.String r4 = r12.mo93549l(r0, r3)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x05d8
            if (r20 == 0) goto L_0x05d3
            r4 = 2131821695(0x7f11047f, float:1.927614E38)
            java.lang.String r0 = r0.getString(r4)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r3
        L_0x05d3:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r14
            return r10
        L_0x05d8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r3 = r12.f195570f
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r3 = 1
            return r3
        L_0x05f8:
            r3 = 1
            int r4 = r12.f195581h2
            r7 = 3
            if (r4 == r7) goto L_0x0602
            int r4 = r12.f195605n2
            if (r4 != r3) goto L_0x0616
        L_0x0602:
            if (r20 == 0) goto L_0x0616
            java.lang.String r0 = r0.getString(r15)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r3
        L_0x0616:
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m132603l(r19)
            r0.mo141259o(r3)
            java.lang.String r3 = r12.f195570f
            r0.mo141246U(r3)
            java.lang.String r3 = r12.f195574g
            r0.mo141265u(r3)
            r3 = 19
            r0.mo141260p(r3)
            long r3 = r19.mo108774y2()
            r0.mo141229B(r3)
            di3.d r3 = di3.C86312j.m106911c(r5)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.String r4 = r19.mo108765s2()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r3 = r3.b00(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x0656
            r4 = 1
            r0.mo141232F(r4)
        L_0x0656:
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 == 0) goto L_0x065f
            r0.mo141233G(r3)
        L_0x065f:
            te3.pc0 r3 = new te3.pc0
            r3.<init>()
            java.lang.String r4 = r12.f195573f2
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0670
            java.lang.String r4 = r12.f195573f2
            r3.f259741d = r4
        L_0x0670:
            java.lang.String r4 = r12.f195577g2
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x067c
            java.lang.String r4 = r12.f195577g2
            r3.f259742e = r4
        L_0x067c:
            java.lang.String r4 = r12.f195471B2
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0688
            java.lang.String r4 = r12.f195471B2
            r3.f259744g = r4
        L_0x0688:
            int r4 = r12.f195581h2
            r3.f259745h = r4
            int r4 = r12.f195653z2
            r3.f259743f = r4
            java.lang.String r4 = r12.f195569e2
            r3.f259746i = r4
            java.lang.String r4 = r12.f195638w
            r3.f259747j = r4
            int r4 = r12.f195605n2
            r3.f259749o = r4
            java.lang.Class<com.tencent.mm.message.a> r4 = com.tencent.p014mm.message.C80995a.class
            com.tencent.mm.message.g r4 = r12.mo93555w(r4)
            com.tencent.mm.message.a r4 = (com.tencent.p014mm.message.C80995a) r4
            if (r4 == 0) goto L_0x06b2
            int r5 = r4.f237906o
            r3.f259753s = r5
            java.lang.String r5 = r4.f237910s
            r3.f259751q = r5
            int r4 = r4.f237911t
            r3.f259752r = r4
        L_0x06b2:
            r8.mo141295u(r3)
            r0.mo141258n(r8)
            te3.tc0 r3 = r8.mo141282d()
            java.lang.String r3 = m132605n(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r8.mo141282d()
            java.lang.String r3 = m132606o(r3)
            r0.mo141264t(r3)
            long r2 = r19.getMsgId()
            r0.mo141237K(r2)
            te3.tc0 r2 = r8.mo141282d()
            java.lang.String r2 = m132602k(r2)
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0706
            te3.tc0 r2 = r8.mo141282d()
            java.lang.String r2 = m132602k(r2)
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0706
            r0.mo141238L(r2)
        L_0x0706:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r0 = 1
            return r0
        L_0x0711:
            r3 = 1
            goto L_0x0cb6
        L_0x0714:
            te3.jd0 r0 = new te3.jd0
            r0.<init>()
            java.lang.String r3 = r12.f195570f
            r0.mo141207o(r3)
            java.lang.String r3 = r12.f195574g
            r0.mo141204l(r3)
            int r3 = r12.f195575g0
            r0.mo141208p(r3)
            java.lang.String r3 = r12.f195579h0
            r0.mo141205m(r3)
            java.lang.String r3 = r12.f195646y
            r0.mo141206n(r3)
            r8.f299408g = r0
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m132603l(r19)
            r0.mo141259o(r3)
            long r2 = r19.mo108774y2()
            r0.mo141229B(r2)
            r2 = 11
            r0.mo141260p(r2)
            r2 = 1
            r0.mo141232F(r2)
            r0.mo141231E(r2)
            r0.f299296c1 = r8
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132605n(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132606o(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0790
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0790
            r0.mo141238L(r2)
        L_0x0790:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186681q
            r2 = 1
            int r1 = r1 + r2
            r0.f186681q = r1
            return r2
        L_0x07a4:
            te3.jd0 r0 = new te3.jd0
            r0.<init>()
            java.lang.String r3 = r12.f195570f
            r0.mo141207o(r3)
            java.lang.String r3 = r12.f195574g
            r0.mo141204l(r3)
            int r3 = r12.f195551a0
            r0.mo141208p(r3)
            java.lang.String r3 = r12.f195555b0
            r0.mo141205m(r3)
            java.lang.String r3 = r12.f195646y
            r0.mo141206n(r3)
            r8.f299408g = r0
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m132603l(r19)
            r0.mo141259o(r3)
            long r2 = r19.mo108774y2()
            r0.mo141229B(r2)
            r2 = 10
            r0.mo141260p(r2)
            r2 = 1
            r0.mo141232F(r2)
            r0.mo141231E(r2)
            r0.f299296c1 = r8
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132605n(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132606o(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x081f
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x081f
            r0.f299245B1 = r2
        L_0x081f:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186680p
            r2 = 1
            int r1 = r1 + r2
            r0.f186680p = r1
            return r2
        L_0x0833:
            r0 = 29
            te3.rc0 r0 = m132607p(r2, r12, r0)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132605n(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132606o(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0878
            te3.tc0 r2 = r8.mo141282d()
            java.lang.String r2 = m132602k(r2)
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0878
            r0.mo141238L(r2)
        L_0x0878:
            com.tencent.mm.message.g r2 = r12.mo93555w(r7)
            if (r2 == 0) goto L_0x0922
            com.tencent.mm.message.g r2 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            java.lang.String r2 = r2.f212519b
            r0.mo141235I(r2)
            com.tencent.mm.message.g r2 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            java.lang.String r2 = r2.f212520c
            r0.mo141236J(r2)
            te3.t23 r2 = new te3.t23
            r2.<init>()
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212521d
            r2.f185459d = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212522e
            r2.f185460e = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212523f
            r2.f185461f = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212524g
            r2.f185462g = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212525h
            r2.f185463h = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212526i
            r2.f185464i = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212527j
            r2.f185466n = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212528k
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r3)
            r2.f185467o = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212529l
            r2.f185468p = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            int r3 = r3.f212531n
            r2.f185469q = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212530m
            r2.f185465j = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212532o
            r2.f185471s = r3
            com.tencent.mm.message.g r3 = r12.mo93555w(r7)
            com.tencent.mm.pluginsdk.ui.tools.m r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r3
            java.lang.String r3 = r3.f212533p
            r2.f185470r = r3
            r8.mo141300z(r2)
        L_0x0922:
            r0.mo141258n(r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186677j
            r3 = 1
            int r1 = r1 + r3
            r0.f186677j = r1
            return r3
        L_0x0939:
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            java.lang.String r5 = m132603l(r19)
            r4.mo141259o(r5)
            long r9 = r19.mo108774y2()
            r4.mo141229B(r9)
            r4.mo141260p(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r12.f195582i
            r5 = 74
            if (r3 != r5) goto L_0x0964
            r3 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r0 = r0.getString(r3)
            r2.append(r0)
        L_0x0964:
            java.lang.String r0 = r12.f195570f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.mo141265u(r0)
            r0 = 1
            r4.mo141232F(r0)
            r4.mo141231E(r0)
            r4.f299296c1 = r8
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = m132605n(r0)
            r4.mo141263s(r0)
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = m132606o(r0)
            r4.mo141264t(r0)
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x09b3
            te3.tc0 r0 = r8.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r2 = f40.C86709a0.m107533q(r6)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r2.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x09b3
            r4.f299245B1 = r0
        L_0x09b3:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186671d
            r2 = 1
            int r1 = r1 + r2
            r0.f186671d = r1
            return r2
        L_0x09c7:
            java.lang.Class<ht1.d> r0 = ht1.C60158d.class
            com.tencent.mm.message.g r0 = r12.mo93555w(r0)
            ht1.d r0 = (ht1.C60158d) r0
            if (r0 == 0) goto L_0x0a22
            te3.nk1 r0 = r0.mo85130f()
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            te3.tc0 r4 = r8.mo141282d()
            java.lang.String r4 = m132605n(r4)
            r3.mo141263s(r4)
            te3.tc0 r4 = r8.mo141282d()
            java.lang.String r4 = m132606o(r4)
            r3.mo141264t(r4)
            java.lang.String r4 = m132603l(r19)
            r3.mo141259o(r4)
            long r4 = r19.mo108774y2()
            r3.mo141229B(r4)
            r2 = 1
            r3.mo141231E(r2)
            java.lang.String r2 = r0.f184476e
            r3.mo141246U(r2)
            java.lang.String r2 = r0.f184477f
            r3.mo141265u(r2)
            r2 = 28
            r3.mo141260p(r2)
            r8.mo141297w(r0)
            r3.mo141258n(r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            r0 = 1
            return r0
        L_0x0a22:
            return r10
        L_0x0a23:
            java.lang.Class<ht1.k> r0 = ht1.C60178k.class
            com.tencent.mm.message.g r0 = r12.mo93555w(r0)
            ht1.k r0 = (ht1.C60178k) r0
            if (r0 == 0) goto L_0x0a91
            te3.tk1 r0 = r0.f171714b
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            te3.tc0 r4 = r8.f299405d
            java.lang.String r4 = m132605n(r4)
            r3.mo141263s(r4)
            te3.tc0 r4 = r8.f299405d
            java.lang.String r4 = m132606o(r4)
            r3.mo141264t(r4)
            java.lang.String r4 = m132603l(r19)
            r3.mo141259o(r4)
            long r4 = r19.mo108774y2()
            r3.mo141229B(r4)
            r2 = 1
            r3.mo141231E(r2)
            int r4 = r0.f185604e
            if (r4 != r2) goto L_0x0a71
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131834460(0x7f11365c, float:1.930203E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r2 = r0.f185603d
            r6[r10] = r2
            java.lang.String r2 = r4.getString(r5, r6)
            r3.mo141246U(r2)
            goto L_0x0a76
        L_0x0a71:
            java.lang.String r2 = r0.f185603d
            r3.mo141246U(r2)
        L_0x0a76:
            java.lang.String r2 = r0.f185606g
            r3.mo141265u(r2)
            r2 = 27
            r3.mo141260p(r2)
            r8.mo141299y(r0)
            r3.mo141258n(r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            r0 = 1
            return r0
        L_0x0a91:
            return r10
        L_0x0a92:
            java.lang.Class<ht1.f> r0 = ht1.C60166f.class
            com.tencent.mm.message.g r0 = r12.mo93555w(r0)
            ht1.f r0 = (ht1.C60166f) r0
            if (r0 == 0) goto L_0x0b01
            te3.rk1 r3 = r0.f171710b
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            te3.tc0 r5 = r8.f299405d
            java.lang.String r5 = m132605n(r5)
            r4.mo141263s(r5)
            te3.tc0 r5 = r8.f299405d
            java.lang.String r5 = m132606o(r5)
            r4.mo141264t(r5)
            java.lang.String r5 = m132603l(r19)
            r4.mo141259o(r5)
            long r5 = r19.mo108774y2()
            r4.mo141229B(r5)
            r2 = 1
            r4.mo141231E(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.mo85179g()
            r2.append(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131825789(0x7f11147d, float:1.9284444E38)
            java.lang.String r0 = r0.getString(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.mo141246U(r0)
            java.lang.String r0 = r3.f185187h
            r4.mo141265u(r0)
            r0 = 22
            r4.mo141260p(r0)
            r8.f299423y = r3
            r4.f299296c1 = r8
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            r0 = 1
            return r0
        L_0x0b01:
            return r10
        L_0x0b02:
            java.lang.Class<ht1.e> r0 = ht1.C60161e.class
            com.tencent.mm.message.g r0 = r12.mo93555w(r0)
            ht1.e r0 = (ht1.C60161e) r0
            if (r0 == 0) goto L_0x0b50
            te3.qk1 r3 = r0.f171701b
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            te3.tc0 r5 = r8.f299405d
            java.lang.String r5 = m132605n(r5)
            r4.mo141263s(r5)
            te3.tc0 r5 = r8.f299405d
            java.lang.String r5 = m132606o(r5)
            r4.mo141264t(r5)
            java.lang.String r5 = m132603l(r19)
            r4.mo141259o(r5)
            long r5 = r19.mo108774y2()
            r4.mo141229B(r5)
            r2 = 1
            r4.mo141231E(r2)
            java.lang.String r0 = r0.f171704e
            r4.mo141246U(r0)
            r0 = 26
            r4.mo141260p(r0)
            r8.f299399A = r3
            r4.f299296c1 = r8
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            r0 = 1
            return r0
        L_0x0b50:
            return r10
        L_0x0b51:
            te3.ud0 r0 = new te3.ud0
            r0.<init>()
            java.lang.String r3 = r12.f195570f
            r0.mo141318n(r3)
            java.lang.String r3 = r12.f195574g
            r0.mo141315k(r3)
            java.lang.String r3 = r12.f195567e0
            r0.mo141316l(r3)
            java.lang.String r3 = r12.f195646y
            r0.mo141317m(r3)
            r8.f299409h = r0
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m132603l(r19)
            r0.mo141259o(r3)
            long r2 = r19.mo108774y2()
            r0.mo141229B(r2)
            r2 = 14
            r0.mo141260p(r2)
            r2 = 1
            r0.mo141232F(r2)
            r0.mo141231E(r2)
            r0.f299296c1 = r8
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132605n(r2)
            r0.mo141263s(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = m132606o(r2)
            r0.mo141264t(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0bc7
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0bc7
            r0.f299245B1 = r2
        L_0x0bc7:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r1.f264674d
            te3.kd0 r2 = r2.f264676a
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            r2.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r1 = r0.f186684t
            r2 = 1
            int r1 = r1 + r2
            r0.f186684t = r1
            return r2
        L_0x0bdb:
            java.lang.String r3 = r12.f195571f0
            if (r3 == 0) goto L_0x0be9
            java.lang.String r4 = "<recordxml>"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0be9
            r3 = 1
            goto L_0x0bea
        L_0x0be9:
            r3 = 0
        L_0x0bea:
            if (r3 != 0) goto L_0x0c9e
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m132603l(r19)
            r0.mo141259o(r3)
            r3 = 17
            r0.mo141260p(r3)
            r3 = 1
            r0.mo141232F(r3)
            java.lang.String r3 = r12.f195570f
            r0.mo141246U(r3)
            java.lang.String r3 = r12.f195571f0
            r0.mo141234H(r3)
            long r3 = r19.mo108774y2()
            r0.mo141229B(r3)
            java.lang.String r3 = r12.f195574g
            com.tencent.mm.autogen.events.RecordOperationEvent r4 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r4.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r5 = r4.f265027d
            r5.f265029a = r10
            java.lang.String r7 = r12.f195571f0
            r5.f265030b = r7
            r4.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r4 = r4.f265028e
            te3.dp3 r4 = r4.f265048a
            if (r4 == 0) goto L_0x0c49
            java.util.LinkedList<te3.rc0> r5 = r4.f227155f
            java.util.Iterator r5 = r5.iterator()
        L_0x0c30:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0c49
            java.lang.Object r7 = r5.next()
            te3.rc0 r7 = (te3.C101834rc0) r7
            java.lang.String r7 = r7.f299342z1
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0c30
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r14
            return r10
        L_0x0c49:
            if (r4 == 0) goto L_0x0c4d
            java.lang.String r3 = r4.f227154e
        L_0x0c4d:
            r0.mo141265u(r3)
            r0.f299296c1 = r8
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = m132605n(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r8.f299405d
            java.lang.String r3 = m132606o(r3)
            r0.mo141264t(r3)
            long r2 = r19.getMsgId()
            r0.mo141237K(r2)
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0c93
            te3.tc0 r2 = r8.f299405d
            java.lang.String r2 = r2.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r6)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r3.get(r2)
            java.lang.String r2 = qe0.C47806g.m53116a(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0c93
            r0.f299245B1 = r2
        L_0x0c93:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r3 = 1
            return r3
        L_0x0c9e:
            r3 = 1
            if (r20 == 0) goto L_0x0cb6
            r4 = 2131825823(0x7f11149f, float:1.9284513E38)
            java.lang.String r0 = r0.getString(r4)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r3
        L_0x0cb6:
            if (r20 == 0) goto L_0x0ccd
            r4 = 2131821646(0x7f11044e, float:1.9276041E38)
            java.lang.String r0 = r0.getString(r4)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r3
        L_0x0ccd:
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f195491G2
            int r4 = r12.f195479D2
            int r3 = ht1.C60167f1.m70144b(r3, r4)
            r4 = 3
            if (r3 == r4) goto L_0x0d38
            r4 = 4
            if (r3 == r4) goto L_0x0d38
        L_0x0cdb:
            if (r20 == 0) goto L_0x0cf2
            ig.g r0 = new ig.g
            r0.<init>()
            r0.mo141099d(r9)
            java.lang.Class<hg.d> r0 = p548hg.C98450d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.d r0 = (p548hg.C98450d) r0
            boolean r0 = r0.mo137800fg(r8, r1, r2)
            return r0
        L_0x0cf2:
            if (r20 == 0) goto L_0x0d1b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r0 = r0.getString(r4)
            r3.append(r0)
            java.lang.String r0 = r12.f195570f
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            r3 = 1
            return r3
        L_0x0d1b:
            r3 = 1
            if (r20 == 0) goto L_0x0d33
            r4 = 2131821695(0x7f11047f, float:1.927614E38)
            java.lang.String r0 = r0.getString(r4)
            te3.rc0 r0 = m132604m(r2, r0, r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r1.f264674d
            te3.kd0 r1 = r1.f264676a
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r1.add(r0)
            return r3
        L_0x0d33:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r14
            return r10
        L_0x0d38:
            java.lang.Class<ht1.c> r0 = ht1.C60154c.class
            com.tencent.mm.message.g r0 = r12.mo93555w(r0)
            ht1.c r0 = (ht1.C60154c) r0
            if (r0 == 0) goto L_0x0d9e
            te3.tk1 r0 = r0.f171699b
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            te3.tc0 r4 = r8.f299405d
            java.lang.String r4 = m132605n(r4)
            r3.mo141263s(r4)
            te3.tc0 r4 = r8.f299405d
            java.lang.String r4 = m132606o(r4)
            r3.mo141264t(r4)
            java.lang.String r4 = m132603l(r19)
            r3.mo141259o(r4)
            long r4 = r19.mo108774y2()
            r3.mo141229B(r4)
            r2 = 1
            r3.mo141231E(r2)
            int r2 = r0.f185604e
            r4 = 7
            if (r2 != r4) goto L_0x0d7e
            te3.bf0 r2 = r0.f185609j
            if (r2 == 0) goto L_0x0d7e
            java.lang.String r2 = m132592a(r2)
            r3.mo141246U(r2)
            goto L_0x0d83
        L_0x0d7e:
            java.lang.String r2 = r0.f185603d
            r3.mo141246U(r2)
        L_0x0d83:
            java.lang.String r2 = r0.f185606g
            r3.mo141265u(r2)
            r2 = 30
            r3.mo141260p(r2)
            r8.mo141296v(r0)
            r3.mo141258n(r8)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            r0 = 1
            return r0
        L_0x0d9e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101146j.m132593b(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f4, boolean):boolean");
    }

    /* renamed from: c */
    public static boolean m132594c(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        Class cls = C101396n.class;
        try {
            C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent());
            LinkedList<C77630j> linkedList = JZ.f226295i;
            if (linkedList != null) {
                int i = 0;
                for (C77630j next : linkedList) {
                    if (!((C101396n) C86312j.m106911c(cls)).mo140650h0(next.f226336r)) {
                        C101841sc0 sc02 = new C101841sc0();
                        C101846tc0 j = m132601j(f4Var);
                        sc02.f299405d = j;
                        j.mo141305l(JZ.f226292f);
                        sc02.f299405d.mo141307n(next.f226326e);
                        C101834rc0 rc02 = new C101834rc0();
                        rc02.mo141246U(next.f226325d);
                        rc02.mo141265u(next.f226332n);
                        rc02.mo141259o(m132603l(f4Var));
                        rc02.mo141229B(f4Var.mo108774y2());
                        if (!Util.isNullOrNil(next.f226330i)) {
                            rc02.f299286W = C14050a.m13405b(next.f226330i);
                        } else {
                            rc02.mo141232F(true);
                        }
                        rc02.mo141231E(true);
                        C101756ae0 ae02 = new C101756ae0();
                        if (!Util.isNullOrNil(next.f226325d)) {
                            ae02.mo141198r(next.f226325d);
                        }
                        if (!Util.isNullOrNil(next.f226332n)) {
                            ae02.mo141194n(next.f226332n);
                        }
                        if (!Util.isNullOrNil(next.f226330i)) {
                            ae02.mo141197q(((C101396n) C86312j.m106911c(cls)).Oj0(next));
                        }
                        if (ae02.computeSize() > 0) {
                            ae02.mo141196p(1);
                            sc02.f299407f = ae02;
                        }
                        rc02.mo141260p(5);
                        rc02.f299296c1 = sc02;
                        rc02.mo141263s(m132605n(sc02.f299405d));
                        rc02.mo141264t(m132606o(sc02.f299405d));
                        if (C72996z1.m85843n5(sc02.f299405d.f299525o)) {
                            String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(sc02.f299405d.f299525o));
                            if (!Util.isNullOrNil(a)) {
                                rc02.f299245B1 = a;
                            }
                        }
                        doFavoriteEvent.f264674d.f264676a.f298618f.add(rc02);
                        doFavoriteEvent.f264674d.f264677b.f186675h++;
                        i++;
                        sc02.f299421w = ((C101396n) C86312j.m106911c(cls)).mo140651i8(next, ae02, JZ.f226292f, JZ.f226293g);
                    }
                }
                if (i != 0) {
                    return true;
                }
                doFavoriteEvent.f264674d.f264687l = C0966R.string.co9;
                return false;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.GetFavRecordDataSourceForRecordMsg", e, "", new Object[0]);
            Log.m105921e("MicroMsg.GetFavRecordDataSourceForRecordMsg", "retransmit app msg error : %s", e.getLocalizedMessage());
        }
        doFavoriteEvent.f264674d.f264687l = C0966R.string.coa;
        return false;
    }

    /* renamed from: d */
    public static void m132595d(C72963f4 f4Var, C101841sc0 sc02, C101756ae0 ae02) {
        sc02.f299421w = ((C101396n) C86312j.m106911c(C101396n.class)).mo140652mF(f4Var, ae02);
    }

    /* renamed from: e */
    public static boolean m132596e(Context context, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var) {
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299405d = m132601j(f4Var);
        C46223m Rm = ((C46021h) C86312j.m106911c(C46021h.class)).mo71455Rm(f4Var.getContent());
        C101834rc0 rc02 = new C101834rc0();
        if (Rm != null) {
            rc02.mo141246U(Util.nullAs(Rm.mo71634a(), Rm.f124596a));
        }
        rc02.mo141259o(m132603l(f4Var));
        rc02.mo141260p(31);
        rc02.mo141265u(f4Var.getContent());
        rc02.mo141232F(true);
        rc02.mo141231E(true);
        rc02.f299296c1 = sc02;
        rc02.mo141263s(m132605n(sc02.f299405d));
        rc02.mo141264t(m132606o(sc02.f299405d));
        rc02.mo141229B(f4Var.mo108774y2());
        doFavoriteEvent.f264674d.f264676a.f298618f.add(rc02);
        doFavoriteEvent.f264674d.f264677b.f186685u++;
        return true;
    }

    /* renamed from: f */
    public static boolean m132597f(DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var, boolean z) {
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
        if (u == null) {
            Log.m105928w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "doFillMpVideoEventInfo content is null");
            return false;
        }
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(4);
        rd02.mo141273f(Util.nowMilliSecond());
        rd02.mo141276l(u.f195586j);
        kd02.mo141219q(rd02);
        C101834rc0 rc02 = new C101834rc0();
        rc02.f299284V = "";
        rc02.mo141267w(u.f195646y);
        C101755ad0 Of0 = ((C101396n) C86312j.m106911c(C101396n.class)).Of0(f4Var);
        if (Of0 == null) {
            Log.m105928w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "doFillMpVideoEventInfo favMpMsgItem is null");
            return false;
        }
        rc02.mo141266v(Of0.f297853i);
        rc02.mo141246U(u.f195570f);
        rc02.mo141242Q(u.f195586j);
        rc02.mo141231E(true);
        rc02.mo141232F(true);
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299405d = m132601j(f4Var);
        if (f4Var.mo100983V3()) {
            sc02.f299422x = Of0;
        }
        rc02.f299296c1 = sc02;
        rc02.mo141237K(f4Var.getMsgId());
        rc02.mo141263s(m132605n(sc02.f299405d));
        rc02.mo141264t(m132606o(sc02.f299405d));
        if (C72996z1.m85843n5(sc02.f299405d.f299525o)) {
            String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(sc02.f299405d.f299525o));
            if (!Util.isNullOrNil(a)) {
                rc02.f299245B1 = a;
            }
        }
        doFavoriteEvent.f264674d.f264676a.f298618f.add(rc02);
        doFavoriteEvent.f264674d.f264677b.f186674g++;
        rc02.mo141260p(4);
        return true;
    }

    /* renamed from: g */
    public static boolean m132598g(Context context, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var, int i) {
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299405d = m132601j(f4Var);
        String str = null;
        if (i == 1) {
            str = context.getString(C0966R.string.f7957xf);
        } else if (i == 2) {
            str = context.getString(C0966R.string.a1b);
        } else if (i == 3) {
            str = context.getString(C0966R.string.a39);
        }
        doFavoriteEvent.f264674d.f264676a.f298618f.add(m132604m(f4Var, str, sc02));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0433, code lost:
        if (r4.f267374a <= 0) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0241, code lost:
        if (r14 == null) goto L_0x0248;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0aef  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0266  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132599h(android.content.Context r20, com.tencent.p014mm.autogen.events.DoFavoriteEvent r21, com.tencent.p014mm.storage.C72963f4 r22, boolean r23, int r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.Class<rz.u> r3 = p682rz.C101491u.class
            java.lang.Class<rz.s> r4 = p682rz.C101488s.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.String r6 = "MicroMsg.GetFavRecordDataSourceForRecordMsg"
            r7 = 0
            if (r1 == 0) goto L_0x0af3
            if (r22 != 0) goto L_0x0015
            goto L_0x0af3
        L_0x0015:
            com.tencent.mm.storage.f4 r8 = com.tencent.p014mm.storage.C72963f4.m85593l3(r22)
            boolean r9 = eb0.C75569c4.m90686s(r8)
            r10 = 1
            if (r9 == 0) goto L_0x0043
            te3.sc0 r3 = new te3.sc0
            r3.<init>()
            te3.tc0 r4 = m132601j(r8)
            r3.f299405d = r4
            r4 = 2131821588(0x7f110414, float:1.9275923E38)
            java.lang.String r0 = r0.getString(r4)
            te3.rc0 r0 = m132604m(r8, r0, r3)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d
            te3.kd0 r3 = r3.f264676a
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            r3.add(r0)
        L_0x003f:
            r10 = r8
        L_0x0040:
            r7 = 1
            goto L_0x0aed
        L_0x0043:
            boolean r9 = r8.mo100993e4()
            r11 = 10
            java.lang.String r12 = ""
            if (r9 == 0) goto L_0x00fa
            te3.sc0 r0 = new te3.sc0
            r0.<init>()
            te3.tc0 r3 = m132601j(r8)
            r0.f299405d = r3
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            java.lang.String r4 = m132603l(r8)
            r3.mo141259o(r4)
            long r6 = r8.mo108774y2()
            r3.mo141229B(r6)
            r3.mo141260p(r10)
            boolean r4 = r8.mo100971J3()
            if (r4 == 0) goto L_0x008e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131835001(0x7f113879, float:1.9303128E38)
            java.lang.String r6 = r6.getString(r7)
            r4.append(r6)
            r4.append(r11)
            java.lang.String r12 = r4.toString()
        L_0x008e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r6 = r8.getContent()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.mo141265u(r4)
            r3.mo141232F(r10)
            r3.mo141231E(r10)
            r3.f299296c1 = r0
            te3.tc0 r4 = r0.f299405d
            java.lang.String r4 = m132605n(r4)
            r3.mo141263s(r4)
            te3.tc0 r4 = r0.f299405d
            java.lang.String r4 = m132606o(r4)
            r3.mo141264t(r4)
            te3.tc0 r4 = r0.f299405d
            java.lang.String r4 = r4.f299525o
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            if (r4 == 0) goto L_0x00e6
            te3.tc0 r0 = r0.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r4 = f40.C86709a0.m107533q(r5)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r4.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x00e6
            r3.f299245B1 = r0
        L_0x00e6:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186671d
            int r3 = r3 + r10
            r0.f186671d = r3
            goto L_0x003f
        L_0x00fa:
            boolean r9 = r8.mo100995g4()
            r11 = 3
            r13 = 2
            if (r9 == 0) goto L_0x02a1
            java.lang.Class<dn.t> r0 = p492dn.C75415t.class
            te3.sc0 r3 = new te3.sc0
            r3.<init>()
            te3.tc0 r4 = m132601j(r8)
            r3.f299405d = r4
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            java.lang.String r9 = m132603l(r8)
            r4.mo141259o(r9)
            long r14 = r8.mo108774y2()
            r4.mo141229B(r14)
            r4.mo141260p(r11)
            if (r2 == 0) goto L_0x0130
            r4.mo141232F(r10)
            r4.mo141231E(r10)
            r15 = r8
            goto L_0x0248
        L_0x0130:
            java.lang.String r11 = r8.mo108768t()
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85803I5(r11)
            if (r11 == 0) goto L_0x018f
            java.lang.String r11 = r8.mo108765s2()
            java.lang.String r12 = ng2.C11163e.m11041a()
            java.lang.String r14 = "recbiz_"
            java.lang.String r15 = ".rec"
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.FilePathGenerator.genPath(r12, r14, r11, r15, r13)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 == 0) goto L_0x0153
            r11 = 0
            goto L_0x018c
        L_0x0153:
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r14 = r12.getPath()
            if (r14 == 0) goto L_0x0177
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r7, r7)
            java.lang.String r15 = r12.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x0177
            android.net.Uri$Builder r12 = r12.buildUpon()
            android.net.Uri$Builder r12 = r12.path(r14)
            android.net.Uri r12 = r12.build()
        L_0x0177:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r12 = r14.mo177799l(r12, r15)
            boolean r14 = r12.mo177810a()
            if (r14 != 0) goto L_0x0185
            goto L_0x018c
        L_0x0185:
            com.tencent.mm.vfs.FileSystem$c r14 = r12.f348991a
            java.lang.String r12 = r12.f348992b
            r14.mo119948x(r12)
        L_0x018c:
            r4.f299284V = r11
            goto L_0x019f
        L_0x018f:
            di3.d r11 = di3.C86312j.m106911c(r0)
            dn.t r11 = (p492dn.C75415t) r11
            java.lang.String r12 = r8.mo108765s2()
            java.lang.String r11 = r11.mo91610mf(r12)
            r4.f299284V = r11
        L_0x019f:
            r4.mo141232F(r10)
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0230 }
            dn.t r0 = (p492dn.C75415t) r0     // Catch:{ all -> 0x0230 }
            java.lang.String r11 = r8.mo108765s2()     // Catch:{ all -> 0x0230 }
            kd0.d r14 = r0.w20(r11)     // Catch:{ all -> 0x0230 }
            if (r14 != 0) goto L_0x01bc
            if (r14 == 0) goto L_0x01b9
            r14.mo106769b()     // Catch:{ all -> 0x01b8 }
            goto L_0x01b9
        L_0x01b8:
        L_0x01b9:
            r15 = r8
            goto L_0x0297
        L_0x01bc:
            java.lang.Class<pb1.h1> r0 = pb1.C100714h1.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x022d }
            pb1.h1 r0 = (pb1.C100714h1) r0     // Catch:{ all -> 0x022d }
            int r11 = r14.getFormat()     // Catch:{ all -> 0x022d }
            java.lang.String r0 = r0.mo135062wO(r11)     // Catch:{ all -> 0x022d }
            r4.mo141261q(r0)     // Catch:{ all -> 0x022d }
            java.lang.String r0 = r8.getContent()     // Catch:{ all -> 0x022d }
            java.lang.String r11 = "\n"
            boolean r11 = r0.endsWith(r11)     // Catch:{ Exception -> 0x021c }
            if (r11 == 0) goto L_0x01e4
            int r11 = r0.length()     // Catch:{ Exception -> 0x021c }
            int r11 = r11 - r10
            java.lang.String r0 = r0.substring(r7, r11)     // Catch:{ Exception -> 0x021c }
        L_0x01e4:
            java.lang.String r11 = ":"
            java.lang.String[] r0 = r0.split(r11)     // Catch:{ Exception -> 0x021c }
            int r11 = r0.length     // Catch:{ Exception -> 0x021c }
            r9 = 4
            if (r11 != r9) goto L_0x01f8
            r9 = r0[r7]     // Catch:{ Exception -> 0x021c }
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85811N4(r9)     // Catch:{ Exception -> 0x021c }
            if (r9 == 0) goto L_0x01f8
            r9 = 1
            goto L_0x01f9
        L_0x01f8:
            r9 = 0
        L_0x01f9:
            int r11 = r0.length     // Catch:{ Exception -> 0x021c }
            if (r11 <= r9) goto L_0x01fe
            r11 = r0[r9]     // Catch:{ Exception -> 0x021c }
        L_0x01fe:
            int r11 = r0.length     // Catch:{ Exception -> 0x021c }
            int r12 = r9 + 1
            if (r11 <= r12) goto L_0x020d
            r11 = r0[r12]     // Catch:{ Exception -> 0x021c }
            r15 = r8
            r7 = 0
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r7)     // Catch:{ Exception -> 0x021d }
            goto L_0x0210
        L_0x020d:
            r15 = r8
            r11 = 0
        L_0x0210:
            int r7 = r0.length     // Catch:{ Exception -> 0x021d }
            int r9 = r9 + r13
            if (r7 <= r9) goto L_0x0226
            r0 = r0[r9]     // Catch:{ Exception -> 0x021d }
            java.lang.String r7 = "1"
            r0.equals(r7)     // Catch:{ Exception -> 0x021d }
            goto L_0x0226
        L_0x021c:
            r15 = r8
        L_0x021d:
            java.lang.String r0 = "MicroMsg.VoiceContent"
            java.lang.String r7 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x022b }
            r11 = 0
        L_0x0226:
            int r0 = (int) r11     // Catch:{ all -> 0x022b }
            r4.mo141266v(r0)     // Catch:{ all -> 0x022b }
            goto L_0x0243
        L_0x022b:
            r0 = move-exception
            goto L_0x0233
        L_0x022d:
            r0 = move-exception
            r15 = r8
            goto L_0x0233
        L_0x0230:
            r0 = move-exception
            r15 = r8
            r14 = 0
        L_0x0233:
            java.lang.String r7 = "[-] Fail to get format for: %s"
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ all -> 0x029a }
            java.lang.String r9 = r15.mo108765s2()     // Catch:{ all -> 0x029a }
            r11 = 0
            r8[r11] = r9     // Catch:{ all -> 0x029a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r8)     // Catch:{ all -> 0x029a }
            if (r14 == 0) goto L_0x0248
        L_0x0243:
            r14.mo106769b()     // Catch:{ all -> 0x0247 }
            goto L_0x0248
        L_0x0247:
        L_0x0248:
            r4.f299296c1 = r3
            te3.tc0 r0 = r3.f299405d
            java.lang.String r0 = m132605n(r0)
            r4.mo141263s(r0)
            te3.tc0 r0 = r3.f299405d
            java.lang.String r0 = m132606o(r0)
            r4.mo141264t(r0)
            te3.tc0 r0 = r3.f299405d
            java.lang.String r0 = r0.f299525o
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x0284
            te3.tc0 r0 = r3.f299405d
            java.lang.String r0 = r0.f299525o
            k40.a r3 = f40.C86709a0.m107533q(r5)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r3.get(r0)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0284
            r4.f299245B1 = r0
        L_0x0284:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r4)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186673f
            int r3 = r3 + r10
            r0.f186673f = r3
        L_0x0296:
            r7 = 1
        L_0x0297:
            r10 = r15
            goto L_0x0aed
        L_0x029a:
            r0 = move-exception
            if (r14 == 0) goto L_0x02a0
            r14.mo106769b()     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            throw r0
        L_0x02a1:
            r15 = r8
            boolean r7 = r15.mo100982U3()
            java.lang.String r8 = "msg"
            if (r7 == 0) goto L_0x03fb
            te3.sc0 r0 = new te3.sc0
            r0.<init>()
            te3.tc0 r3 = m132601j(r15)
            r0.f299405d = r3
            java.lang.String r3 = r15.getContent()
            r4 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r8, r4)
            if (r3 == 0) goto L_0x03f1
            te3.zc0 r4 = new te3.zc0     // Catch:{ Exception -> 0x03dd }
            r4.<init>()     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$label"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141339v(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$x"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x03dd }
            r4.mo141340w(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$y"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x03dd }
            r4.mo141341x(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$scale"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x03dd }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x03dd }
            r4.mo141323F(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$poiname"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141322E(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$poiid"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141321C(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$poiCategoryTips"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141343z(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$poiBusinessHour"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141342y(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$poiPhone"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141319A(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$poiPriceTips"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            float r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r7)     // Catch:{ Exception -> 0x03dd }
            r4.mo141320B(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$isFromPoiList"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r8 = 0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r7, r8)     // Catch:{ Exception -> 0x03dd }
            r4.mo141338u(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$buildingId"
            java.lang.Object r7 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03dd }
            r4.mo141336s(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r7 = ".msg.location.$floorName"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x03dd }
            r4.mo141337t(r3)     // Catch:{ Exception -> 0x03dd }
            r0.f299406e = r4     // Catch:{ Exception -> 0x03dd }
            te3.rc0 r3 = new te3.rc0     // Catch:{ Exception -> 0x03dd }
            r3.<init>()     // Catch:{ Exception -> 0x03dd }
            java.lang.String r4 = m132603l(r15)     // Catch:{ Exception -> 0x03dd }
            r3.mo141259o(r4)     // Catch:{ Exception -> 0x03dd }
            long r7 = r15.mo108774y2()     // Catch:{ Exception -> 0x03dd }
            r3.mo141229B(r7)     // Catch:{ Exception -> 0x03dd }
            r4 = 6
            r3.mo141260p(r4)     // Catch:{ Exception -> 0x03dd }
            r3.mo141232F(r10)     // Catch:{ Exception -> 0x03dd }
            r3.mo141231E(r10)     // Catch:{ Exception -> 0x03dd }
            r3.f299296c1 = r0     // Catch:{ Exception -> 0x03dd }
            te3.tc0 r4 = r0.f299405d     // Catch:{ Exception -> 0x03dd }
            java.lang.String r4 = m132605n(r4)     // Catch:{ Exception -> 0x03dd }
            r3.mo141263s(r4)     // Catch:{ Exception -> 0x03dd }
            te3.tc0 r4 = r0.f299405d     // Catch:{ Exception -> 0x03dd }
            java.lang.String r4 = m132606o(r4)     // Catch:{ Exception -> 0x03dd }
            r3.mo141264t(r4)     // Catch:{ Exception -> 0x03dd }
            te3.tc0 r4 = r0.f299405d     // Catch:{ Exception -> 0x03dd }
            java.lang.String r4 = r4.f299525o     // Catch:{ Exception -> 0x03dd }
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)     // Catch:{ Exception -> 0x03dd }
            if (r4 == 0) goto L_0x03c9
            te3.tc0 r0 = r0.f299405d     // Catch:{ Exception -> 0x03dd }
            java.lang.String r0 = r0.f299525o     // Catch:{ Exception -> 0x03dd }
            k40.a r4 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x03dd }
            f62.k0 r4 = (f62.C75700k0) r4     // Catch:{ Exception -> 0x03dd }
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()     // Catch:{ Exception -> 0x03dd }
            com.tencent.mm.storage.z1 r0 = r4.get(r0)     // Catch:{ Exception -> 0x03dd }
            java.lang.String r0 = qe0.C47806g.m53116a(r0)     // Catch:{ Exception -> 0x03dd }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x03dd }
            if (r4 != 0) goto L_0x03c9
            r3.f299245B1 = r0     // Catch:{ Exception -> 0x03dd }
        L_0x03c9:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d     // Catch:{ Exception -> 0x03dd }
            te3.kd0 r0 = r0.f264676a     // Catch:{ Exception -> 0x03dd }
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f     // Catch:{ Exception -> 0x03dd }
            r0.add(r3)     // Catch:{ Exception -> 0x03dd }
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d     // Catch:{ Exception -> 0x03dd }
            te3.zd0 r0 = r0.f264677b     // Catch:{ Exception -> 0x03dd }
            int r3 = r0.f186676i     // Catch:{ Exception -> 0x03dd }
            int r3 = r3 + r10
            r0.f186676i = r3     // Catch:{ Exception -> 0x03dd }
            goto L_0x0296
        L_0x03dd:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r0 = r0.toString()
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "parse failed, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r3)
        L_0x03f1:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825667(0x7f111403, float:1.9284197E38)
            r0.f264687l = r3
            r7 = 0
            goto L_0x0297
        L_0x03fb:
            boolean r7 = r15.mo100979R3()
            if (r7 == 0) goto L_0x0602
            java.lang.Class<gt.l> r0 = p158gt.C76053l.class
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            long r18 = r15.getMsgId()
            r16 = 0
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x042a
            di3.d r4 = di3.C86312j.m106911c(r3)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r7 = r15.mo108768t()
            long r10 = r15.getMsgId()
            int r9 = (int) r10
            long r9 = (long) r9
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r4 = r4.mo127200vP(r7, r9)
            goto L_0x042b
        L_0x042a:
            r4 = 0
        L_0x042b:
            if (r4 == 0) goto L_0x0436
            long r9 = r4.f267374a
            r16 = 0
            int r7 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0458
            goto L_0x0438
        L_0x0436:
            r16 = 0
        L_0x0438:
            long r9 = r15.mo108774y2()
            int r7 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0458
            di3.d r4 = di3.C86312j.m106911c(r3)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r7 = r15.mo108768t()
            long r9 = r15.mo108774y2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r4 = r4.mo127168NQ(r7, r9)
        L_0x0458:
            if (r4 != 0) goto L_0x0469
            java.lang.String r0 = "getImgDataPath: try get imgInfo fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825663(0x7f1113ff, float:1.9284189E38)
            r0.f264687l = r3
            r10 = r15
            goto L_0x077a
        L_0x0469:
            te3.sc0 r7 = new te3.sc0
            r7.<init>()
            te3.tc0 r9 = m132601j(r15)
            r7.f299405d = r9
            te3.rc0 r9 = new te3.rc0
            r9.<init>()
            java.lang.String r10 = m132603l(r15)
            r9.mo141259o(r10)
            long r10 = r15.mo108774y2()
            r9.mo141229B(r10)
            r9.mo141260p(r13)
            di3.d r10 = di3.C86312j.m106911c(r3)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            di3.d r11 = di3.C86312j.m106911c(r0)
            gt.l r11 = (p158gt.C76053l) r11
            java.lang.String r11 = r11.mo106262y8(r4)
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            r13 = 1
            java.lang.String r10 = r10.mo127174TY(r11, r12, r12, r13)
            r9.f299284V = r10
            boolean r10 = r4.mo127145p()
            if (r10 == 0) goto L_0x04ee
            di3.d r10 = di3.C86312j.m106911c(r3)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            int r11 = r4.f267390q
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            com.tencent.mm.modelimage.k r10 = r10.mo127173TO(r11)
            int r11 = r10.f267377d
            int r10 = r10.f267376c
            if (r11 <= r10) goto L_0x04ee
            di3.d r10 = di3.C86312j.m106911c(r3)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "SERVERID://"
            r11.append(r13)
            long r13 = r15.mo108774y2()
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            r13 = 1
            java.lang.String r10 = r10.mo127174TY(r11, r12, r12, r13)
            r9.f299284V = r10
            goto L_0x04ef
        L_0x04ee:
            r13 = 1
        L_0x04ef:
            di3.d r10 = di3.C86312j.m106911c(r3)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.String r11 = r15.mo108765s2()
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            java.lang.String r10 = r10.v10(r11, r13)
            r9.f299286W = r10
            r9.f299296c1 = r7
            te3.tc0 r10 = r7.f299405d
            java.lang.String r10 = m132605n(r10)
            r9.mo141263s(r10)
            te3.tc0 r10 = r7.f299405d
            java.lang.String r10 = m132606o(r10)
            r9.mo141264t(r10)
            long r10 = r15.getMsgId()
            r9.mo141237K(r10)
            r10 = r15
            java.lang.String r11 = r10.f230724G
            java.lang.String r11 = eb0.C75569c4.m90685r(r11)
            r9.mo141230C(r11)
            te3.tc0 r11 = r7.f299405d
            java.lang.String r11 = r11.f299525o
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85843n5(r11)
            if (r11 == 0) goto L_0x0552
            te3.tc0 r7 = r7.f299405d
            java.lang.String r7 = r7.f299525o
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r5.get(r7)
            java.lang.String r5 = qe0.C47806g.m53116a(r5)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x0552
            r9.f299245B1 = r5
        L_0x0552:
            if (r2 == 0) goto L_0x05ed
            boolean r5 = r4.mo127145p()
            if (r5 == 0) goto L_0x0570
            int r5 = r4.f267377d
            if (r5 != 0) goto L_0x0570
            di3.d r5 = di3.C86312j.m106911c(r3)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            int r4 = r4.f267390q
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            com.tencent.mm.modelimage.k r4 = r5.mo127173TO(r4)
        L_0x0570:
            int r5 = r10.mo108769t2()
            r7 = 1
            if (r5 != r7) goto L_0x057d
            boolean r0 = r4.mo127145p()
            r5 = 1
            goto L_0x05ab
        L_0x057d:
            boolean r5 = r4.mo127145p()
            if (r5 != 0) goto L_0x0585
            r5 = 1
            goto L_0x05a8
        L_0x0585:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.l r0 = (p158gt.C76053l) r0
            com.tencent.mm.modelimage.k r0 = r0.mo106261jD(r4)
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.String r0 = r0.f267378e
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            r5 = 1
            java.lang.String r0 = r3.mo127174TY(r0, r12, r12, r5)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x05aa
        L_0x05a8:
            r0 = 0
            goto L_0x05ab
        L_0x05aa:
            r0 = 1
        L_0x05ab:
            java.lang.String r3 = r4.f267393t
            r7 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r8, r7)
            if (r3 == 0) goto L_0x05df
            if (r0 == r5) goto L_0x05b7
            goto L_0x05ed
        L_0x05b7:
            java.lang.String r0 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9.mo141254j(r0)
            java.lang.String r0 = ".msg.img.$length"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            long r4 = (long) r0
            r9.mo141269y(r4)
            java.lang.String r0 = ".msg.img.$aeskey"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9.mo141253f(r0)
            goto L_0x05ed
        L_0x05df:
            r3 = 1
            r5 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r4.f267393t
            r0[r5] = r3
            java.lang.String r3 = "parse cdnInfo failed. [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r0)
        L_0x05ed:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r9)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186672e
            r4 = 1
            int r3 = r3 + r4
            r0.f186672e = r3
            goto L_0x0040
        L_0x0602:
            r10 = r15
            boolean r7 = r10.mo100994f4()
            if (r7 != 0) goto L_0x077d
            boolean r7 = r10.mo100989b4()
            if (r7 == 0) goto L_0x0611
            goto L_0x077d
        L_0x0611:
            boolean r3 = r10.mo100983V3()
            if (r3 == 0) goto L_0x061d
            boolean r7 = m132597f(r1, r10, r2)
            goto L_0x0aed
        L_0x061d:
            if (r2 == 0) goto L_0x062d
            int r3 = r10.getType()
            r4 = 318767153(0x13000031, float:1.6155966E-27)
            if (r3 != r4) goto L_0x062d
            m132598g(r0, r1, r10, r11)
            r1 = 1
            return r1
        L_0x062d:
            boolean r3 = r10.mo100967F3()
            if (r3 == 0) goto L_0x0639
            boolean r7 = m132594c(r1, r10)
            goto L_0x0aed
        L_0x0639:
            if (r2 == 0) goto L_0x064d
            boolean r3 = r10.mo100973L3()
            if (r3 != 0) goto L_0x0647
            boolean r3 = r10.mo101022y3()
            if (r3 == 0) goto L_0x064d
        L_0x0647:
            r3 = 1
            m132598g(r0, r1, r10, r3)
            goto L_0x0040
        L_0x064d:
            if (r2 == 0) goto L_0x065d
            int r3 = r10.getType()
            r4 = 419430449(0x19000031, float:6.6174836E-24)
            if (r3 != r4) goto L_0x065d
            m132598g(r0, r1, r10, r13)
            goto L_0x0040
        L_0x065d:
            boolean r3 = r10.mo100975N3()
            if (r3 == 0) goto L_0x074a
            k40.a r3 = f40.C86709a0.m107533q(r5)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            java.lang.String r4 = r10.getContent()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4$b r3 = r3.Rv0(r4)
            te3.sc0 r4 = new te3.sc0
            r4.<init>()
            te3.tc0 r6 = m132601j(r10)
            r4.f299405d = r6
            int r6 = r3.f212691q
            java.util.Set<java.lang.String> r7 = eb0.C45628s0.f123410p
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85810M4(r6)
            if (r6 == 0) goto L_0x06ef
            te3.rc0 r0 = new te3.rc0
            r0.<init>()
            java.lang.String r3 = m132603l(r10)
            r0.mo141259o(r3)
            long r6 = r10.mo108774y2()
            r0.mo141229B(r6)
            r3 = 16
            r0.mo141260p(r3)
            java.lang.String r3 = r10.getContent()
            r0.mo141265u(r3)
            r3 = 1
            r0.mo141232F(r3)
            r0.mo141231E(r3)
            r0.f299296c1 = r4
            te3.tc0 r3 = r4.f299405d
            java.lang.String r3 = m132605n(r3)
            r0.mo141263s(r3)
            te3.tc0 r3 = r4.f299405d
            java.lang.String r3 = m132606o(r3)
            r0.mo141264t(r3)
            te3.tc0 r3 = r4.f299405d
            java.lang.String r3 = r3.f299525o
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r3 == 0) goto L_0x0735
            te3.tc0 r3 = r4.f299405d
            java.lang.String r3 = r3.f299525o
            k40.a r4 = f40.C86709a0.m107533q(r5)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r4.get(r3)
            java.lang.String r3 = qe0.C47806g.m53116a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0735
            r0.f299245B1 = r3
            goto L_0x0735
        L_0x06ef:
            java.lang.String r5 = r3.f212675a
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r5)
            r6 = 2131821547(0x7f1103eb, float:1.927584E38)
            if (r5 == 0) goto L_0x072d
            java.lang.Class<he0.j> r5 = he0.C76158j.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            he0.j r5 = (he0.C76158j) r5
            java.lang.String r3 = r3.f212699y
            he0.j$a r7 = he0.C76158j.C8510a.TYPE_WORDING
            java.lang.String r8 = "openim_card_type_name"
            java.lang.String r3 = r5.Rn0(r3, r8, r7)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x071c
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getString(r6)
            goto L_0x0728
        L_0x071c:
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            r0[r5] = r3
            java.lang.String r3 = "[%s]"
            java.lang.String r0 = java.lang.String.format(r3, r0)
        L_0x0728:
            te3.rc0 r0 = m132604m(r10, r0, r4)
            goto L_0x0735
        L_0x072d:
            java.lang.String r0 = r0.getString(r6)
            te3.rc0 r0 = m132604m(r10, r0, r4)
        L_0x0735:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d
            te3.kd0 r3 = r3.f264676a
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            r3.add(r0)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r3 = r0.f186685u
            r4 = 1
            int r3 = r3 + r4
            r0.f186685u = r3
            goto L_0x0040
        L_0x074a:
            boolean r3 = r10.mo100981T3()
            if (r3 == 0) goto L_0x0755
            m132596e(r0, r1, r10)
            goto L_0x0040
        L_0x0755:
            boolean r3 = r10.mo101020w3()
            r4 = 2131825665(0x7f111401, float:1.9284193E38)
            if (r3 == 0) goto L_0x076f
            boolean r3 = r10.mo101022y3()
            if (r3 == 0) goto L_0x0769
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r0.f264687l = r4
            goto L_0x077a
        L_0x0769:
            boolean r7 = m132593b(r0, r1, r10, r2)
            goto L_0x0aed
        L_0x076f:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r1.f264674d
            r3.f264687l = r4
            if (r2 == 0) goto L_0x077a
            m132598g(r0, r1, r10, r11)
            goto L_0x0040
        L_0x077a:
            r7 = 0
            goto L_0x0aed
        L_0x077d:
            java.lang.String r0 = ".msg.videomsg.$aeskey"
            java.lang.String r7 = ".msg.videomsg.$cdnvideourl"
            java.lang.String r11 = "cdntra parse video recv xml failed"
            java.lang.String r15 = "video info null"
            r12 = r24
            r13 = 10
            if (r12 != r13) goto L_0x0944
            te3.sc0 r12 = new te3.sc0
            r12.<init>()
            te3.tc0 r13 = m132601j(r10)
            r12.f299405d = r13
            te3.rc0 r13 = new te3.rc0
            r13.<init>()
            java.lang.String r9 = m132603l(r10)
            r13.mo141259o(r9)
            r9 = r15
            long r14 = r10.mo108774y2()
            r13.mo141229B(r14)
            di3.d r14 = di3.C86312j.m106911c(r4)
            rz.s r14 = (p682rz.C101488s) r14
            rz.t r14 = r14.Kj0()
            java.lang.String r15 = r10.mo108765s2()
            hd0.o0 r14 = (hd0.C98410o0) r14
            java.lang.String r14 = r14.mo137728q(r15)
            r13.f299284V = r14
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.s r4 = (p682rz.C101488s) r4
            rz.t r4 = r4.Kj0()
            java.lang.String r14 = r10.mo108765s2()
            hd0.o0 r4 = (hd0.C98410o0) r4
            java.lang.String r4 = r4.mo137729r(r14)
            r13.f299286W = r4
            java.lang.String r4 = r13.f299284V
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106454o(r4)
            r13.mo141261q(r4)
            boolean r4 = r10.mo100989b4()
            if (r4 == 0) goto L_0x07ec
            r4 = 15
            r13.mo141260p(r4)
            goto L_0x07f0
        L_0x07ec:
            r4 = 4
            r13.mo141260p(r4)
        L_0x07f0:
            di3.d r4 = di3.C86312j.m106911c(r3)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r14 = r10.mo108765s2()
            hd0.n0 r4 = r4.mo140806Zd(r14)
            if (r4 != 0) goto L_0x080c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825656(0x7f1113f8, float:1.9284174E38)
            r0.f264687l = r3
            goto L_0x077a
        L_0x080c:
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r14 = r4.f288559f
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 0
            r9[r15] = r14
            int r14 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39149a()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 1
            r9[r15] = r14
            java.lang.String r15 = "video length is %d maxFileLength:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r15, r9)
            int r9 = r4.f288559f
            int r15 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39149a()
            if (r9 <= r15) goto L_0x083a
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825811(0x7f111493, float:1.9284489E38)
            r0.f264687l = r3
            goto L_0x077a
        L_0x083a:
            boolean r9 = r10.mo100989b4()
            if (r9 == 0) goto L_0x0859
            di3.d r9 = di3.C86312j.m106911c(r3)
            rz.u r9 = (p682rz.C101491u) r9
            java.lang.String r15 = r4.mo137700d()
            boolean r9 = r9.mo140809kU(r15)
            if (r9 == 0) goto L_0x0859
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825656(0x7f1113f8, float:1.9284174E38)
            r0.f264687l = r3
            goto L_0x077a
        L_0x0859:
            int r9 = r4.f288566m
            r13.mo141266v(r9)
            r13.f299296c1 = r12
            te3.tc0 r9 = r12.f299405d
            java.lang.String r9 = m132605n(r9)
            r13.mo141263s(r9)
            te3.tc0 r9 = r12.f299405d
            java.lang.String r9 = m132606o(r9)
            r13.mo141264t(r9)
            te3.tc0 r9 = r12.f299405d
            java.lang.String r9 = r9.f299525o
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85843n5(r9)
            if (r9 == 0) goto L_0x089a
            te3.tc0 r9 = r12.f299405d
            java.lang.String r9 = r9.f299525o
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r5.get(r9)
            java.lang.String r5 = qe0.C47806g.m53116a(r5)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 != 0) goto L_0x089a
            r13.f299245B1 = r5
        L_0x089a:
            long r14 = r10.getMsgId()
            r13.mo141237K(r14)
            java.lang.String r5 = r10.f230724G
            java.lang.String r5 = eb0.C75569c4.m90685r(r5)
            r13.mo141230C(r5)
            int r5 = r4.f288559f
            long r14 = (long) r5
            r13.mo141269y(r14)
            if (r2 == 0) goto L_0x08d3
            java.lang.String r5 = r4.mo137705i()
            r9 = 0
            java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r8, r9)
            if (r5 == 0) goto L_0x08d0
            java.lang.Object r6 = r5.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            r13.mo141254j(r6)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r13.mo141253f(r0)
            goto L_0x08d3
        L_0x08d0:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
        L_0x08d3:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r13)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r5 = r0.f186674g
            r6 = 1
            int r5 = r5 + r6
            r0.f186674g = r5
            di3.d r0 = di3.C86312j.m106911c(r3)
            rz.u r0 = (p682rz.C101491u) r0
            java.lang.String r3 = r10.mo108765s2()
            hd0.n0 r0 = r0.mo140806Zd(r3)
            java.lang.String r3 = r4.mo137705i()
            r4 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r8, r4)
            if (r3 == 0) goto L_0x090a
            java.lang.String r4 = ".msg.videomsg.$md5"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r13.mo141268x(r3)
        L_0x090a:
            java.lang.String r3 = r0.f288536D
            r13.mo141239N(r3)
            te3.tc4 r0 = r0.f288535C
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = r0.f299543j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0040
            te3.uc0 r3 = new te3.uc0
            r3.<init>()
            java.lang.String r4 = r0.f299537d
            r3.f299610d = r4
            int r4 = r0.f299538e
            r3.f299611e = r4
            java.lang.String r4 = r0.f299539f
            r3.f299612f = r4
            java.lang.String r4 = r0.f299540g
            r3.f299613g = r4
            java.lang.String r4 = r0.f299541h
            r3.f299614h = r4
            java.lang.String r4 = r0.f299542i
            r3.f299615i = r4
            java.lang.String r4 = r0.f299543j
            r3.f299616j = r4
            java.lang.String r0 = r0.f299544n
            r3.f299617n = r0
            r13.f299306h1 = r3
            goto L_0x0040
        L_0x0944:
            r9 = r15
            te3.sc0 r15 = new te3.sc0
            r15.<init>()
            te3.tc0 r14 = m132601j(r10)
            r15.f299405d = r14
            te3.rc0 r14 = new te3.rc0
            r14.<init>()
            java.lang.String r12 = m132603l(r10)
            r14.mo141259o(r12)
            long r12 = r10.mo108774y2()
            r14.mo141229B(r12)
            di3.d r12 = di3.C86312j.m106911c(r4)
            rz.s r12 = (p682rz.C101488s) r12
            rz.t r12 = r12.Kj0()
            java.lang.String r13 = r10.mo108765s2()
            hd0.o0 r12 = (hd0.C98410o0) r12
            java.lang.String r12 = r12.mo137728q(r13)
            r14.f299284V = r12
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.s r4 = (p682rz.C101488s) r4
            rz.t r4 = r4.Kj0()
            java.lang.String r12 = r10.mo108765s2()
            hd0.o0 r4 = (hd0.C98410o0) r4
            java.lang.String r4 = r4.mo137729r(r12)
            r14.f299286W = r4
            java.lang.String r4 = r14.f299284V
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106454o(r4)
            r14.mo141261q(r4)
            boolean r4 = r10.mo100989b4()
            if (r4 == 0) goto L_0x09a4
            r4 = 15
            r14.mo141260p(r4)
            goto L_0x09a8
        L_0x09a4:
            r4 = 4
            r14.mo141260p(r4)
        L_0x09a8:
            di3.d r4 = di3.C86312j.m106911c(r3)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r12 = r10.mo108765s2()
            hd0.n0 r4 = r4.mo140806Zd(r12)
            if (r4 != 0) goto L_0x09c4
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825656(0x7f1113f8, float:1.9284174E38)
            r0.f264687l = r3
            goto L_0x077a
        L_0x09c4:
            r9 = 1
            java.lang.Object[] r12 = new java.lang.Object[r9]
            int r13 = r4.f288559f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r16 = 0
            r12[r16] = r13
            java.lang.String r13 = "video length is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r12)
            int r12 = r4.f288559f
            long r12 = (long) r12
            java.lang.Class<pb1.j1> r16 = pb1.C100718j1.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            r22 = r14
            r14 = r16
            pb1.j1 r14 = (pb1.C100718j1) r14
            long r16 = r14.mo128216vR(r9)
            r9 = r22
            int r19 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r19 <= 0) goto L_0x09f9
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825811(0x7f111493, float:1.9284489E38)
            r0.f264687l = r3
            goto L_0x077a
        L_0x09f9:
            boolean r12 = r10.mo100989b4()
            if (r12 == 0) goto L_0x0a18
            di3.d r12 = di3.C86312j.m106911c(r3)
            rz.u r12 = (p682rz.C101491u) r12
            java.lang.String r13 = r4.mo137700d()
            boolean r12 = r12.mo140809kU(r13)
            if (r12 == 0) goto L_0x0a18
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r3 = 2131825656(0x7f1113f8, float:1.9284174E38)
            r0.f264687l = r3
            goto L_0x077a
        L_0x0a18:
            int r12 = r4.f288566m
            r9.mo141266v(r12)
            r9.f299296c1 = r15
            te3.tc0 r12 = r15.f299405d
            java.lang.String r12 = m132605n(r12)
            r9.mo141263s(r12)
            te3.tc0 r12 = r15.f299405d
            java.lang.String r12 = m132606o(r12)
            r9.mo141264t(r12)
            te3.tc0 r12 = r15.f299405d
            java.lang.String r12 = r12.f299525o
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85843n5(r12)
            if (r12 == 0) goto L_0x0a59
            te3.tc0 r12 = r15.f299405d
            java.lang.String r12 = r12.f299525o
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r5.get(r12)
            java.lang.String r5 = qe0.C47806g.m53116a(r5)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r12 != 0) goto L_0x0a59
            r9.f299245B1 = r5
        L_0x0a59:
            long r12 = r10.getMsgId()
            r9.mo141237K(r12)
            java.lang.String r5 = r10.f230724G
            java.lang.String r5 = eb0.C75569c4.m90685r(r5)
            r9.mo141230C(r5)
            int r5 = r4.f288559f
            long r12 = (long) r5
            r9.mo141269y(r12)
            if (r2 == 0) goto L_0x0a92
            java.lang.String r4 = r4.mo137705i()
            r5 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r4, r8, r5)
            if (r4 == 0) goto L_0x0a8f
            java.lang.Object r5 = r4.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            r9.mo141254j(r5)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9.mo141253f(r0)
            goto L_0x0a92
        L_0x0a8f:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
        L_0x0a92:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.kd0 r0 = r0.f264676a
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r9)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            te3.zd0 r0 = r0.f264677b
            int r4 = r0.f186674g
            r5 = 1
            int r4 = r4 + r5
            r0.f186674g = r4
            di3.d r0 = di3.C86312j.m106911c(r3)
            rz.u r0 = (p682rz.C101491u) r0
            java.lang.String r3 = r10.mo108765s2()
            hd0.n0 r0 = r0.mo140806Zd(r3)
            java.lang.String r3 = r0.f288536D
            r9.mo141239N(r3)
            te3.tc4 r0 = r0.f288535C
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = r0.f299543j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0040
            te3.uc0 r3 = new te3.uc0
            r3.<init>()
            java.lang.String r4 = r0.f299537d
            r3.f299610d = r4
            int r4 = r0.f299538e
            r3.f299611e = r4
            java.lang.String r4 = r0.f299539f
            r3.f299612f = r4
            java.lang.String r4 = r0.f299540g
            r3.f299613g = r4
            java.lang.String r4 = r0.f299541h
            r3.f299614h = r4
            java.lang.String r4 = r0.f299542i
            r3.f299615i = r4
            java.lang.String r4 = r0.f299543j
            r3.f299616j = r4
            java.lang.String r0 = r0.f299544n
            r3.f299617n = r0
            r9.f299306h1 = r3
            goto L_0x0040
        L_0x0aed:
            if (r2 != 0) goto L_0x0af2
            com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118400a(r10, r1, r7)
        L_0x0af2:
            return r7
        L_0x0af3:
            java.lang.String r0 = "fill favorite event fail, event or msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            if (r1 == 0) goto L_0x0b01
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r1.f264674d
            r1 = 2131825657(0x7f1113f9, float:1.9284176E38)
            r0.f264687l = r1
        L_0x0b01:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101146j.m132599h(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f4, boolean, int):boolean");
    }

    /* renamed from: i */
    public static boolean m132600i(Context context, DoFavoriteEvent doFavoriteEvent, String str, List<C72963f4> list, boolean z, boolean z2, int i) {
        String str2;
        Context context2 = context;
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        String str3 = str;
        List<C72963f4> list2 = list;
        boolean z3 = z;
        int i2 = i;
        Class cls = C75339i.class;
        Class cls2 = C100714h1.class;
        Class cls3 = C101397o.class;
        if (doFavoriteEvent2 == null || list2 == null || list.isEmpty() || context2 == null) {
            Log.m105928w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "fill favorite event fail, event or msgs is null");
            if (doFavoriteEvent2 != null) {
                doFavoriteEvent2.f264674d.f264687l = C0966R.string.f360421co1;
            }
            return false;
        }
        for (C72963f4 next : list) {
            if (C75569c4.m90690w(next)) {
                int type = next.getType() & 65535;
                if (type == 1) {
                    next.mo108732L2(context2.getString(C0966R.string.a3f));
                } else if (type == 3) {
                    next.mo108732L2(context2.getString(C0966R.string.a1p));
                    next.setType(1);
                } else if (type == 43) {
                    next.mo108732L2(context2.getString(C0966R.string.f360103a43));
                    next.setType(1);
                } else if (type == 49) {
                    next.mo108732L2(context2.getString(C0966R.string.a3q));
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
                String Ol0 = ((C101397o) C86312j.m106911c(cls3)).Ol0(list2.get(0).mo108759l2());
                if (((C101397o) C86312j.m106911c(cls3)).mo72601Ox(Ol0)) {
                    doFavoriteEvent2.f264674d.f264676a.mo141220r(context2.getString(C0966R.string.htm));
                } else {
                    C48353j c9 = ((C101397o) C86312j.m106911c(cls3)).mo72603c9(str3);
                    if (c9 != null) {
                        doFavoriteEvent2.f264674d.f264676a.mo141220r(context2.getString(C0966R.string.cq8, new Object[]{c9.field_userName, ((C101397o) C86312j.m106911c(cls3)).mo72602WH(Ol0)}));
                    }
                }
            } else {
                str2 = "";
                if (C72996z1.m85820U5(str)) {
                    doFavoriteEvent2.f264674d.f264676a.mo141220r(context2.getString(C0966R.string.htm));
                } else {
                    String nullAsNil = Util.nullAsNil(C75592q0.m90783m());
                    if (nullAsNil.equals(Util.nullAsNil(((C75339i) C86312j.m106911c(cls)).mo62514P1(str3)))) {
                        doFavoriteEvent2.f264674d.f264676a.mo141220r(context2.getString(C0966R.string.cq9, new Object[]{nullAsNil}));
                    } else {
                        doFavoriteEvent2.f264674d.f264676a.mo141220r(context2.getString(C0966R.string.cq8, new Object[]{C75592q0.m90783m(), ((C75339i) C86312j.m106911c(cls)).mo62514P1(str3)}));
                    }
                }
            }
            Log.m105919d("MicroMsg.GetFavRecordDataSourceForRecordMsg", "title %s", doFavoriteEvent2.f264674d.f264676a.f298626q);
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
            for (C72963f4 h : list) {
                if (m132599h(context2, doFavoriteEvent2, h, z3, i2)) {
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
            return ((C100714h1) C86312j.m106911c(cls2)).mo135058Vn(doFavoriteEvent2, f4Var);
        }
        LinkedList<C77630j> linkedList = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent()).f226295i;
        if (linkedList != null && linkedList.size() == 1) {
            return ((C100714h1) C86312j.m106911c(cls2)).mo135058Vn(doFavoriteEvent2, f4Var);
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
        return m132599h(context2, doFavoriteEvent2, f4Var, z3, i2);
    }

    /* renamed from: j */
    public static C101846tc0 m132601j(C72963f4 f4Var) {
        C101846tc0 tc02 = new C101846tc0();
        if (f4Var != null) {
            if (f4Var.mo108769t2() == 0) {
                tc02.mo141306m(f4Var.mo108768t());
                tc02.mo141310q(C75592q0.m90789s());
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    tc02.mo141308o(f4Var.getContent() != null ? f4Var.getContent().substring(0, Math.max(0, f4Var.getContent().indexOf(58))) : "");
                    if (!Util.isNullOrNil(tc02.f299525o) && !f4Var.mo100995g4() && !f4Var.mo101016t3()) {
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

    /* renamed from: k */
    public static String m132602k(C101846tc0 tc02) {
        return tc02.f299525o;
    }

    /* renamed from: l */
    public static String m132603l(C72963f4 f4Var) {
        if (f4Var.mo108769t2() != 1) {
            return String.valueOf(f4Var.mo108774y2());
        }
        if (C72996z1.m85820U5(f4Var.mo108768t()) || f4Var.mo108768t().equals("filehelper")) {
            return String.format("%d", new Object[]{Long.valueOf(f4Var.mo108774y2())});
        }
        return String.format("%s#%d", new Object[]{f4Var.mo108768t(), Long.valueOf(f4Var.mo108774y2())});
    }

    /* renamed from: m */
    public static C101834rc0 m132604m(C72963f4 f4Var, String str, C101841sc0 sc02) {
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141259o(m132603l(f4Var));
        rc02.mo141229B(f4Var.mo108774y2());
        rc02.mo141260p(1);
        rc02.mo141265u(str);
        rc02.mo141232F(true);
        rc02.mo141231E(true);
        rc02.f299296c1 = sc02;
        rc02.mo141263s(m132605n(sc02.f299405d));
        rc02.mo141264t(m132606o(sc02.f299405d));
        if (C72996z1.m85843n5(sc02.f299405d.f299525o)) {
            String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(sc02.f299405d.f299525o));
            if (!Util.isNullOrNil(a)) {
                rc02.f299245B1 = a;
            }
        }
        return rc02;
    }

    /* renamed from: n */
    public static String m132605n(C101846tc0 tc02) {
        Class cls = C101397o.class;
        String str = tc02.f299525o;
        if (Util.isNullOrNil(str)) {
            str = tc02.f299519f;
        }
        return ((C101397o) C86312j.m106911c(cls)).mo72605ip(str) ? ((C101397o) C86312j.m106911c(cls)).mo72602WH(str) : ((C75339i) C86312j.m106911c(C75339i.class)).mo62514P1(str);
    }

    /* renamed from: o */
    public static String m132606o(C101846tc0 tc02) {
        return f296055a.format(new Date(tc02.f299527q));
    }

    /* renamed from: p */
    public static C101834rc0 m132607p(C72963f4 f4Var, C68070l.C68072b bVar, int i) {
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141259o(m132603l(f4Var));
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
        rc02.mo141260p(i);
        rc02.mo141252d(bVar.f195475C2);
        return rc02;
    }
}
