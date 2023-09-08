package qg2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tav.coremedia.TimeUtil;
import java.text.SimpleDateFormat;
import te3.C51163rv3;
import te3.C77949j3;

/* renamed from: qg2.m */
public class C101152m {

    /* renamed from: a */
    public static final /* synthetic */ int f296070a = 0;

    static {
        new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x027c, code lost:
        r11 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0285, code lost:
        if (r1.f195582i != 74) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0287, code lost:
        r11.append(r10.getString(com.tencent.p014mm.C0966R.string.f8007z3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0291, code lost:
        r11.append(r1.f195570f);
        m132653d(r11.toString(), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a2, code lost:
        m132651b(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a5, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132650a(android.content.Context r10, com.tencent.p014mm.storage.C72963f4 r11, boolean r12, te3.C77949j3 r13) {
        /*
            te3.sc0 r0 = new te3.sc0
            r0.<init>()
            te3.tc0 r1 = new te3.tc0
            r1.<init>()
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r11 == 0) goto L_0x0161
            int r5 = r11.mo108769t2()
            if (r5 != 0) goto L_0x00de
            java.lang.String r5 = r11.mo108768t()
            r1.mo141306m(r5)
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r1.mo141310q(r5)
            java.lang.String r5 = r11.mo108768t()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            if (r5 == 0) goto L_0x00fb
            java.lang.String r5 = r11.getContent()
            if (r5 == 0) goto L_0x004b
            java.lang.String r5 = r11.getContent()
            java.lang.String r6 = r11.getContent()
            r7 = 58
            int r6 = r6.indexOf(r7)
            int r6 = java.lang.Math.max(r2, r6)
            java.lang.String r5 = r5.substring(r2, r6)
            goto L_0x004c
        L_0x004b:
            r5 = r4
        L_0x004c:
            r1.mo141308o(r5)
            java.lang.String r5 = r1.f299525o
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00fb
            boolean r5 = r11.mo100995g4()
            if (r5 != 0) goto L_0x00fb
            java.lang.String r5 = r11.getContent()
            java.lang.String r6 = r1.f299525o
            int r6 = r6.length()
            int r6 = r6 + r3
            java.lang.String r5 = r5.substring(r6)
            r11.mo108732L2(r5)
            java.lang.String r5 = r11.getContent()
            int r5 = r5.length()
            r6 = 10
            if (r5 <= 0) goto L_0x0090
            java.lang.String r5 = r11.getContent()
            char r5 = r5.charAt(r2)
            if (r6 != r5) goto L_0x0090
            java.lang.String r5 = r11.getContent()
            java.lang.String r5 = r5.substring(r3)
            r11.mo108732L2(r5)
        L_0x0090:
            boolean r5 = r11.mo101015s3()
            if (r5 == 0) goto L_0x00fb
            java.lang.String r5 = r11.mo108727G2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00be
            java.lang.String r5 = r11.mo108727G2()
            java.lang.String r7 = r1.f299525o
            boolean r5 = r5.startsWith(r7)
            if (r5 == 0) goto L_0x00be
            java.lang.String r5 = r11.mo108727G2()
            java.lang.String r7 = r1.f299525o
            int r7 = r7.length()
            int r7 = r7 + r3
            java.lang.String r5 = r5.substring(r7)
            r11.mo108758i3(r5)
        L_0x00be:
            java.lang.String r5 = r11.mo108727G2()
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x00fb
            java.lang.String r5 = r11.mo108727G2()
            char r5 = r5.charAt(r2)
            if (r6 != r5) goto L_0x00fb
            java.lang.String r5 = r11.mo108727G2()
            java.lang.String r5 = r5.substring(r3)
            r11.mo108758i3(r5)
            goto L_0x00fb
        L_0x00de:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r1.mo141306m(r5)
            java.lang.String r5 = r11.mo108768t()
            r1.mo141310q(r5)
            java.lang.String r5 = r11.mo108768t()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            if (r5 == 0) goto L_0x00fb
            java.lang.String r5 = r1.f299519f
            r1.mo141308o(r5)
        L_0x00fb:
            java.lang.Class<rn.v> r5 = p227rn.C48053v.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            rn.v r5 = (p227rn.C48053v) r5
            java.lang.String r6 = r11.mo108768t()
            boolean r5 = r5.mo72614OE(r6)
            if (r5 == 0) goto L_0x011e
            java.lang.String r5 = r11.mo108760m2()
            if (r5 != 0) goto L_0x011b
            java.lang.String r5 = r11.f230724G
            eb0.z3$$h r5 = eb0.C75604z3.m90851w(r5)
            java.lang.String r5 = r5.f222109p
        L_0x011b:
            r1.mo141308o(r5)
        L_0x011e:
            r1.mo141309p(r3)
            long r5 = r11.getCreateTime()
            r1.f299527q = r5
            r1.f299528r = r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = r11.mo108774y2()
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r1.f299529s = r5
            r1.f299530t = r3
            long r5 = r11.mo108774y2()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0161
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = r11.mo108774y2()
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r1.f299523j = r5
            r1.f299524n = r3
        L_0x0161:
            r0.f299405d = r1
            java.lang.String r1 = r11.getContent()
            r5 = 3
            if (r1 != 0) goto L_0x016e
            m132652c(r10, r13, r5)
            return r2
        L_0x016e:
            r6 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r6)
            if (r1 != 0) goto L_0x0179
            m132652c(r10, r13, r5)
            return r2
        L_0x0179:
            te3.tc0 r0 = r0.f299405d
            java.lang.String r6 = r1.f195562d
            r0.f299533w = r6
            r0.f299534x = r3
            java.lang.String r6 = r1.f195634v
            r0.mo141305l(r6)
            java.lang.Class<ym.l> r0 = p763ym.C79138l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            java.lang.String r6 = r1.f195562d
            com.tencent.mm.pluginsdk.model.app.j r0 = r0.getAppInfo(r6)
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r0.mo69359k()
            if (r0 == 0) goto L_0x01a9
            if (r12 == 0) goto L_0x01a9
            r11 = 2131821548(0x7f1103ec, float:1.9275842E38)
            java.lang.String r10 = r10.getString(r11)
            m132653d(r10, r13)
            return r3
        L_0x01a9:
            int r0 = r1.f195582i
            r6 = 19
            r7 = 2131821695(0x7f11047f, float:1.927614E38)
            if (r0 == r6) goto L_0x02b2
            r6 = 20
            if (r0 == r6) goto L_0x02ae
            r6 = 50
            if (r0 == r6) goto L_0x02aa
            r6 = 51
            if (r0 == r6) goto L_0x02a6
            r6 = 2131821615(0x7f11042f, float:1.9275978E38)
            switch(r0) {
                case 1: goto L_0x027c;
                case 2: goto L_0x0209;
                case 3: goto L_0x0205;
                case 4: goto L_0x0201;
                case 5: goto L_0x01da;
                case 6: goto L_0x01d6;
                case 7: goto L_0x01d2;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            switch(r0) {
                case 10: goto L_0x0270;
                case 13: goto L_0x026c;
                case 16: goto L_0x0261;
                case 24: goto L_0x02ff;
                case 33: goto L_0x024b;
                case 36: goto L_0x024b;
                case 44: goto L_0x0235;
                case 46: goto L_0x022d;
                case 48: goto L_0x0211;
                case 53: goto L_0x027c;
                case 57: goto L_0x027c;
                case 59: goto L_0x02a2;
                case 63: goto L_0x020d;
                case 88: goto L_0x020d;
                case 94: goto L_0x020d;
                default: goto L_0x01c7;
            }
        L_0x01c7:
            switch(r0) {
                case 72: goto L_0x02a2;
                case 73: goto L_0x029e;
                case 74: goto L_0x027c;
                case 75: goto L_0x0278;
                case 76: goto L_0x0274;
                default: goto L_0x01ca;
            }
        L_0x01ca:
            java.lang.String r10 = r10.getString(r7)
            m132653d(r10, r13)
            return r3
        L_0x01d2:
            m132651b(r11, r13)
            return r3
        L_0x01d6:
            m132651b(r11, r13)
            return r3
        L_0x01da:
            java.lang.String r0 = r1.f195586j
            if (r0 == 0) goto L_0x01f9
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01f9
            if (r12 == 0) goto L_0x01f5
            int r12 = r1.f195483E2
            if (r12 != r3) goto L_0x01eb
            r2 = 1
        L_0x01eb:
            if (r2 == 0) goto L_0x01f5
            java.lang.String r10 = r10.getString(r6)
            m132653d(r10, r13)
            return r3
        L_0x01f5:
            m132651b(r11, r13)
            return r3
        L_0x01f9:
            java.lang.String r10 = r10.getString(r7)
            m132653d(r10, r13)
            return r3
        L_0x0201:
            m132651b(r11, r13)
            return r3
        L_0x0205:
            m132651b(r11, r13)
            return r3
        L_0x0209:
            m132651b(r11, r13)
            return r3
        L_0x020d:
            m132651b(r11, r13)
            return r3
        L_0x0211:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = 2131821550(0x7f1103ee, float:1.9275846E38)
            java.lang.String r10 = r10.getString(r12)
            r11.append(r10)
            java.lang.String r10 = r1.f195570f
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            m132653d(r10, r13)
            return r3
        L_0x022d:
            java.lang.String r10 = r10.getString(r6)
            m132653d(r10, r13)
            return r3
        L_0x0235:
            java.lang.String r12 = r1.mo93549l(r10, r3)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x0247
            java.lang.String r10 = r10.getString(r7)
            m132653d(r10, r13)
            return r3
        L_0x0247:
            m132651b(r11, r13)
            return r3
        L_0x024b:
            int r0 = r1.f195581h2
            if (r0 == r5) goto L_0x0253
            int r0 = r1.f195605n2
            if (r0 != r3) goto L_0x025d
        L_0x0253:
            if (r12 == 0) goto L_0x025d
            java.lang.String r10 = r10.getString(r6)
            m132653d(r10, r13)
            return r3
        L_0x025d:
            m132651b(r11, r13)
            return r3
        L_0x0261:
            r11 = 2131821646(0x7f11044e, float:1.9276041E38)
            java.lang.String r10 = r10.getString(r11)
            m132653d(r10, r13)
            return r3
        L_0x026c:
            m132651b(r11, r13)
            return r3
        L_0x0270:
            m132651b(r11, r13)
            return r3
        L_0x0274:
            m132651b(r11, r13)
            return r3
        L_0x0278:
            m132651b(r11, r13)
            return r3
        L_0x027c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r1.f195582i
            r0 = 74
            if (r12 != r0) goto L_0x0291
            r12 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r10 = r10.getString(r12)
            r11.append(r10)
        L_0x0291:
            java.lang.String r10 = r1.f195570f
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            m132653d(r10, r13)
            return r3
        L_0x029e:
            m132651b(r11, r13)
            return r3
        L_0x02a2:
            m132651b(r11, r13)
            return r3
        L_0x02a6:
            m132651b(r11, r13)
            return r3
        L_0x02aa:
            m132651b(r11, r13)
            return r3
        L_0x02ae:
            m132651b(r11, r13)
            return r3
        L_0x02b2:
            java.lang.String r12 = r1.f195571f0
            if (r12 == 0) goto L_0x02c0
            java.lang.String r0 = "<recordxml>"
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x02c0
            r12 = 1
            goto L_0x02c1
        L_0x02c0:
            r12 = 0
        L_0x02c1:
            if (r12 != 0) goto L_0x02ff
            com.tencent.mm.autogen.events.RecordOperationEvent r12 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r12.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r0 = r12.f265027d
            r0.f265029a = r2
            java.lang.String r1 = r1.f195571f0
            r0.f265030b = r1
            r12.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r12 = r12.f265028e
            te3.dp3 r12 = r12.f265048a
            if (r12 == 0) goto L_0x02fb
            java.util.LinkedList<te3.rc0> r12 = r12.f227155f
            java.util.Iterator r12 = r12.iterator()
        L_0x02df:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r0 = r12.next()
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.lang.String r0 = r0.f299342z1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02df
            java.lang.String r10 = r10.getString(r7)
            m132653d(r10, r13)
            return r2
        L_0x02fb:
            m132651b(r11, r13)
            return r3
        L_0x02ff:
            r11 = 2131825823(0x7f11149f, float:1.9284513E38)
            java.lang.String r10 = r10.getString(r11)
            m132653d(r10, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101152m.m132650a(android.content.Context, com.tencent.mm.storage.f4, boolean, te3.j3):boolean");
    }

    /* renamed from: b */
    public static boolean m132651b(C72963f4 f4Var, C77949j3 j3Var) {
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = Util.nullAs(f4Var.getContent(), "");
        rv32.f141176e = true;
        j3Var.f227631h = rv32;
        return true;
    }

    /* renamed from: c */
    public static boolean m132652c(Context context, C77949j3 j3Var, int i) {
        String string = i == 1 ? context.getString(C0966R.string.f7957xf) : i == 2 ? context.getString(C0966R.string.a1b) : i == 3 ? context.getString(C0966R.string.a39) : null;
        j3Var.f227630g = 1;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = string;
        rv32.f141176e = true;
        j3Var.f227631h = rv32;
        return true;
    }

    /* renamed from: d */
    public static void m132653d(String str, C77949j3 j3Var) {
        j3Var.f227630g = 1;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        j3Var.f227631h = rv32;
    }
}
