package eb0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import pe3.C89349b;
import te3.C51163rv3;
import te3.C77982pz2;

/* renamed from: eb0.o4 */
public class C75590o4 {

    /* renamed from: a */
    public int f222064a = 0;

    /* renamed from: b */
    public int f222065b = 0;

    /* renamed from: c */
    public String f222066c = "";

    /* renamed from: d */
    public String f222067d = "";

    /* renamed from: e */
    public String f222068e = "";

    /* renamed from: f */
    public String f222069f = "";

    /* renamed from: g */
    public String f222070g = "";

    /* renamed from: h */
    public String f222071h = "";

    /* renamed from: i */
    public String f222072i = "";

    /* renamed from: eb0.o4$a */
    public static class C31499a {
        /* renamed from: a */
        public static boolean m39430a(String str, String str2) {
            String str3;
            String str4 = "";
            if (Util.isNullOrNil(str)) {
                return true;
            }
            try {
                str3 = str4;
                for (char c : str.toCharArray()) {
                    str3 = str3 + String.format("%02x", new Object[]{Integer.valueOf(c)});
                }
            } catch (Exception unused) {
                str3 = str4;
            }
            if (!Util.isNullOrNil(str3) && str3.length() % 2 == 0) {
                String str5 = str4;
                int i = 0;
                while (i < str3.length()) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str5);
                        int i2 = i + 2;
                        sb.append((char) Integer.parseInt(str3.substring(i, i2), 16));
                        int i3 = i2;
                        str5 = sb.toString();
                        i = i3;
                    } catch (Exception unused2) {
                    }
                }
                str4 = str5;
            }
            return Util.isNullOrNil(str4) || !str4.equals(str2);
        }
    }

    /* renamed from: a */
    public static C75590o4 m90740a() {
        C75590o4 o4Var = new C75590o4();
        o4Var.f222064a = 1;
        o4Var.f222065b = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
        o4Var.f222066c = (String) C86709a0.m107535s().mo121142i().mo119684e(12293, (Object) null);
        o4Var.f222067d = (String) C86709a0.m107535s().mo121142i().mo119684e(12292, (Object) null);
        o4Var.f222068e = (String) C86709a0.m107535s().mo121142i().mo119684e(12291, (Object) null);
        o4Var.f222069f = (String) C86709a0.m107535s().mo121142i().mo119684e(12307, (Object) null);
        o4Var.f222070g = (String) C86709a0.m107535s().mo121142i().mo119684e(12324, (Object) null);
        o4Var.f222072i = (String) C86709a0.m107535s().mo121142i().mo119684e(12325, (Object) null);
        o4Var.f222071h = (String) C86709a0.m107535s().mo121142i().mo119684e(12326, (Object) null);
        return o4Var;
    }

    /* renamed from: b */
    public static C75590o4 m90741b() {
        if (Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12289, (Object) null), 0) == 0) {
            return null;
        }
        return m90740a();
    }

    /* renamed from: e */
    public static C77982pz2 m90742e(C75590o4 o4Var) {
        C86709a0.m107535s().mo121142i().mo119676J(12289, Integer.valueOf(o4Var.f222064a));
        C86709a0.m107535s().mo121142i().mo119676J(12290, Integer.valueOf(o4Var.f222065b));
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12293, (Object) null), o4Var.mo105937d())) {
            C86709a0.m107535s().mo121142i().mo119676J(12293, o4Var.mo105937d());
        }
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12292, (Object) null), o4Var.mo105936c())) {
            C86709a0.m107535s().mo121142i().mo119676J(12292, o4Var.mo105936c());
        }
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12291, (Object) null), o4Var.f222068e)) {
            C86709a0.m107535s().mo121142i().mo119676J(12291, o4Var.f222068e);
        }
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12307, (Object) null), o4Var.f222069f)) {
            C86709a0.m107535s().mo121142i().mo119676J(12307, o4Var.f222069f);
        }
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12324, (Object) null), o4Var.f222070g)) {
            C86709a0.m107535s().mo121142i().mo119676J(12324, o4Var.f222070g);
        }
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12325, (Object) null), o4Var.f222072i)) {
            C86709a0.m107535s().mo121142i().mo119676J(12325, o4Var.f222072i);
        }
        if (C31499a.m39430a((String) C86709a0.m107535s().mo121142i().mo119684e(12326, (Object) null), o4Var.f222071h)) {
            C86709a0.m107535s().mo121142i().mo119676J(12326, o4Var.f222071h);
        }
        C77982pz2 pz22 = new C77982pz2();
        pz22.f228077d = 128;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = "";
        rv32.f141176e = true;
        pz22.f228078e = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = "";
        rv33.f141176e = true;
        pz22.f228079f = rv33;
        pz22.f228080g = 0;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = "";
        rv34.f141176e = true;
        pz22.f228081h = rv34;
        C51163rv3 rv35 = new C51163rv3();
        rv35.f141175d = "";
        rv35.f141176e = true;
        pz22.f228082i = rv35;
        pz22.f228083j = 0;
        byte[] O = C86013q1.m106433O("", 0, -1);
        byte[] bArr = O == null ? new byte[0] : O;
        pz22.f228085o = new C89349b(bArr, 0, bArr.length);
        pz22.f228084n = O == null ? 0 : O.length;
        pz22.f228086p = o4Var.f222065b;
        pz22.f228090t = o4Var.f222064a;
        pz22.f228089s = Util.nullAsNil(o4Var.f222068e);
        pz22.f228088r = Util.nullAsNil(o4Var.f222071h);
        pz22.f228087q = Util.nullAsNil(o4Var.f222072i);
        pz22.f228092v = 0;
        pz22.f228062D = Util.nullAsNil(o4Var.f222069f);
        pz22.f228063E = 0;
        pz22.f228065G = "";
        pz22.f228067I = 0;
        pz22.f228066H = "";
        pz22.f228076S = Util.nullAsNil(o4Var.f222070g);
        return pz22;
    }

    /* renamed from: c */
    public String mo105936c() {
        if (!Util.isNullOrNil(this.f222070g)) {
            if (Util.isNullOrNil(this.f222072i)) {
                this.f222067d = "";
            } else if (Util.isNullOrNil(this.f222071h)) {
                this.f222067d = RegionCodeDecoder.m124563k().mo135575j(this.f222070g, this.f222072i);
            } else {
                this.f222067d = RegionCodeDecoder.m124563k().mo135573h(this.f222070g, this.f222072i, this.f222071h);
            }
        }
        return Util.isNullOrNil(this.f222067d) ? Util.nullAsNil(this.f222071h) : this.f222067d;
    }

    /* renamed from: d */
    public String mo105937d() {
        if (!Util.isNullOrNil(this.f222070g)) {
            if (Util.isNullOrNil(this.f222072i) || Util.isNullOrNil(this.f222071h) || !RegionCodeDecoder.m124565r(this.f222070g)) {
                this.f222066c = RegionCodeDecoder.m124563k().mo135574i(this.f222070g);
            } else {
                this.f222066c = RegionCodeDecoder.m124563k().mo135575j(this.f222070g, this.f222072i);
            }
        }
        return Util.isNullOrNil(this.f222066c) ? Util.nullAsNil(this.f222072i) : this.f222066c;
    }
}
