package bp3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Map;
import te3.C64418hb3;
import te3.C77946ib3;

/* renamed from: bp3.m */
public class C67301m {

    /* renamed from: bp3.m$a */
    public static class C67302a extends C77946ib3 {

        /* renamed from: o */
        public String f193143o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r6 = eb0.C75604z3.m90848t(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m79636a(com.tencent.p014mm.storage.C72963f4 r6) {
        /*
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r6.getContent()
            int r2 = r6.getType()
            r3 = 1107296305(0x42000031, float:32.000187)
            if (r2 != r3) goto L_0x0016
            java.lang.String r1 = r6.mo108775z2()
        L_0x0016:
            if (r1 != 0) goto L_0x0019
            return r0
        L_0x0019:
            r0 = 0
            int r2 = r6.getType()
            r4 = 1
            if (r2 == r4) goto L_0x0039
            r5 = 11
            if (r2 == r5) goto L_0x0039
            r5 = 21
            if (r2 == r5) goto L_0x0039
            r5 = 31
            if (r2 == r5) goto L_0x0039
            r5 = 36
            if (r2 == r5) goto L_0x0039
            r5 = 301989937(0x12000031, float:4.0389914E-28)
            if (r2 == r5) goto L_0x0039
            if (r2 == r3) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            r2 = -1
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r6.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 == 0) goto L_0x0058
            int r6 = r6.mo108769t2()
            if (r6 == r4) goto L_0x0058
            int r6 = eb0.C75604z3.m90848t(r1)
            if (r6 == r2) goto L_0x0058
            int r6 = r6 + r4
            java.lang.String r1 = r1.substring(r6)
        L_0x0058:
            return r1
        L_0x0059:
            java.lang.String r0 = r6.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 == 0) goto L_0x0074
            int r6 = r6.mo108769t2()
            if (r6 == r4) goto L_0x0074
            int r6 = eb0.C75604z3.m90848t(r1)
            if (r6 == r2) goto L_0x0074
            int r6 = r6 + r4
            java.lang.String r1 = r1.substring(r6)
        L_0x0074:
            r6 = 60
            int r6 = r1.indexOf(r6)
            if (r6 <= 0) goto L_0x0080
            java.lang.String r1 = r1.substring(r6)
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bp3.C67301m.m79636a(com.tencent.mm.storage.f4):java.lang.String");
    }

    /* renamed from: b */
    public static String m79637b(C72963f4 f4Var) {
        if (f4Var == null) {
            return "";
        }
        if (f4Var.mo108769t2() == 1) {
            return C75592q0.m90789s();
        }
        String t = f4Var.mo108768t();
        if (C72996z1.m85820U5(t)) {
            String s = C75604z3.m90847s(f4Var.getContent());
            if (!(t == null || s == null || s.length() <= 0)) {
                return s;
            }
        }
        return t;
    }

    /* renamed from: c */
    public static boolean m79638c(long j) {
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        return b002.getStatus() == 2 || b002.getStatus() == 3 || b002.getStatus() == 5;
    }

    /* renamed from: d */
    public static C64418hb3 m79639d(String str) {
        return !Util.isNullOrNil(str) ? !str.contains("appmsg") ? m79640e("", XmlParser.parseXml(str, "patMsg", (String) null)) : m79640e(".msg.appmsg", XmlParser.parseXml(str, "msg", (String) null)) : new C64418hb3();
    }

    /* renamed from: e */
    public static C64418hb3 m79640e(String str, Map<String, String> map) {
        C64418hb3 hb32 = new C64418hb3();
        if (map != null) {
            String str2 = Util.nullAsNil(str) + ".patMsg";
            hb32.f183463d = Util.nullAsNil(map.get(str2 + ".chatUser"));
            int safeParseInt = Util.safeParseInt(map.get(str2 + ".records.recordNum"));
            for (int i = 0; i < safeParseInt; i++) {
                C77946ib3 ib32 = new C77946ib3();
                String str3 = str2 + ".records.record";
                if (i > 0) {
                    str3 = str3 + i;
                }
                ib32.f227607d = Util.nullAsNil(map.get(str3 + ".fromUser"));
                ib32.f227608e = Util.nullAsNil(map.get(str3 + ".pattedUser"));
                String nullAsNil = Util.nullAsNil(map.get(str3 + ".template"));
                ib32.f227609f = nullAsNil;
                if (Util.isNullOrNil(nullAsNil)) {
                    ib32.f227609f = Util.nullAsNil(map.get(str3 + ".templete"));
                }
                ib32.f227610g = Util.safeParseLong(map.get(str3 + ".createTime"));
                ib32.f227611h = Util.safeParseInt(map.get(str3 + ".readStatus"));
                ib32.f227612i = Util.safeParseLong(map.get(str3 + ".svrId"));
                ib32.f227613j = Util.safeParseInt(map.get(str3 + ".showModifyTip"));
                ib32.f227614n = Util.safeParseInt(map.get(str3 + ".isNewPatMsg"));
                hb32.f183464e.add(ib32);
            }
        }
        return hb32;
    }
}
