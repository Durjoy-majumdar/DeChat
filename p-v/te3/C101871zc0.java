package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zc0 */
public class C101871zc0 extends C47465a {

    /* renamed from: A */
    public boolean f299944A;

    /* renamed from: B */
    public boolean f299945B = false;

    /* renamed from: C */
    public String f299946C;

    /* renamed from: D */
    public boolean f299947D = false;

    /* renamed from: E */
    public String f299948E;

    /* renamed from: F */
    public boolean f299949F = false;

    /* renamed from: d */
    public double f299950d;

    /* renamed from: e */
    public boolean f299951e = false;

    /* renamed from: f */
    public double f299952f;

    /* renamed from: g */
    public boolean f299953g = false;

    /* renamed from: h */
    public int f299954h;

    /* renamed from: i */
    public boolean f299955i = false;

    /* renamed from: j */
    public String f299956j;

    /* renamed from: n */
    public boolean f299957n = false;

    /* renamed from: o */
    public String f299958o;

    /* renamed from: p */
    public boolean f299959p = false;

    /* renamed from: q */
    public String f299960q;

    /* renamed from: r */
    public boolean f299961r = false;

    /* renamed from: s */
    public String f299962s;

    /* renamed from: t */
    public boolean f299963t = false;

    /* renamed from: u */
    public String f299964u;

    /* renamed from: v */
    public boolean f299965v = false;

    /* renamed from: w */
    public String f299966w;

    /* renamed from: x */
    public boolean f299967x = false;

    /* renamed from: y */
    public float f299968y;

    /* renamed from: z */
    public boolean f299969z = false;

    /* renamed from: A */
    public final C101871zc0 mo141319A(String str) {
        this.f299966w = str;
        this.f299967x = true;
        return this;
    }

    /* renamed from: B */
    public final C101871zc0 mo141320B(float f) {
        this.f299968y = f;
        this.f299969z = true;
        return this;
    }

    /* renamed from: C */
    public final C101871zc0 mo141321C(String str) {
        this.f299960q = str;
        this.f299961r = true;
        return this;
    }

    /* renamed from: E */
    public final C101871zc0 mo141322E(String str) {
        this.f299958o = str;
        this.f299959p = true;
        return this;
    }

    /* renamed from: F */
    public final C101871zc0 mo141323F(int i) {
        this.f299954h = i;
        this.f299955i = true;
        return this;
    }

    /* renamed from: b */
    public final String mo141324b() {
        return this.f299946C;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101871zc0)) {
            return false;
        }
        C101871zc0 zc02 = (C101871zc0) aVar;
        return C46238a.m51546a(Double.valueOf(this.f299950d), Double.valueOf(zc02.f299950d)) && C46238a.m51546a(Double.valueOf(this.f299952f), Double.valueOf(zc02.f299952f)) && C46238a.m51546a(Integer.valueOf(this.f299954h), Integer.valueOf(zc02.f299954h)) && C46238a.m51546a(this.f299956j, zc02.f299956j) && C46238a.m51546a(this.f299958o, zc02.f299958o) && C46238a.m51546a(this.f299960q, zc02.f299960q) && C46238a.m51546a(this.f299962s, zc02.f299962s) && C46238a.m51546a(this.f299964u, zc02.f299964u) && C46238a.m51546a(this.f299966w, zc02.f299966w) && C46238a.m51546a(Float.valueOf(this.f299968y), Float.valueOf(zc02.f299968y)) && C46238a.m51546a(Boolean.valueOf(this.f299944A), Boolean.valueOf(zc02.f299944A)) && C46238a.m51546a(this.f299946C, zc02.f299946C) && C46238a.m51546a(this.f299948E, zc02.f299948E);
    }

    /* renamed from: d */
    public final String mo141325d() {
        return this.f299948E;
    }

    /* renamed from: f */
    public final boolean mo141326f() {
        return this.f299944A;
    }

    /* renamed from: j */
    public final double mo141327j() {
        return this.f299952f;
    }

    /* renamed from: k */
    public final double mo141328k() {
        return this.f299950d;
    }

    /* renamed from: l */
    public final String mo141329l() {
        return this.f299964u;
    }

    /* renamed from: m */
    public final String mo141330m() {
        return this.f299962s;
    }

    /* renamed from: n */
    public final String mo141331n() {
        return this.f299966w;
    }

    /* renamed from: o */
    public final float mo141332o() {
        return this.f299968y;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299951e) {
                aVar.mo74316c(1, this.f299950d);
            }
            if (this.f299953g) {
                aVar.mo74316c(2, this.f299952f);
            }
            if (this.f299955i) {
                aVar.mo74318e(3, this.f299954h);
            }
            String str = this.f299956j;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f299958o;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f299960q;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f299962s;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f299964u;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f299966w;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            if (this.f299969z) {
                aVar.mo74317d(10, this.f299968y);
            }
            if (this.f299945B) {
                aVar.mo74314a(11, this.f299944A);
            }
            String str7 = this.f299946C;
            if (str7 != null) {
                aVar.mo74323j(12, str7);
            }
            String str8 = this.f299948E;
            if (str8 == null) {
                return 0;
            }
            aVar.mo74323j(13, str8);
            return 0;
        } else if (i2 == 1) {
            int c = this.f299951e ? C52418a.m58676c(1, this.f299950d) + 0 : 0;
            if (this.f299953g) {
                c += C52418a.m58676c(2, this.f299952f);
            }
            if (this.f299955i) {
                c += C52418a.m58678e(3, this.f299954h);
            }
            String str9 = this.f299956j;
            if (str9 != null) {
                c += C52418a.m58683j(4, str9);
            }
            String str10 = this.f299958o;
            if (str10 != null) {
                c += C52418a.m58683j(5, str10);
            }
            String str11 = this.f299960q;
            if (str11 != null) {
                c += C52418a.m58683j(6, str11);
            }
            String str12 = this.f299962s;
            if (str12 != null) {
                c += C52418a.m58683j(7, str12);
            }
            String str13 = this.f299964u;
            if (str13 != null) {
                c += C52418a.m58683j(8, str13);
            }
            String str14 = this.f299966w;
            if (str14 != null) {
                c += C52418a.m58683j(9, str14);
            }
            if (this.f299969z) {
                c += C52418a.m58677d(10, this.f299968y);
            }
            if (this.f299945B) {
                c += C52418a.m58674a(11, this.f299944A);
            }
            String str15 = this.f299946C;
            if (str15 != null) {
                c += C52418a.m58683j(12, str15);
            }
            String str16 = this.f299948E;
            return str16 != null ? c + C52418a.m58683j(13, str16) : c;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101871zc0 zc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zc02.f299950d = aVar3.mo141627e(intValue);
                    zc02.f299951e = true;
                    return 0;
                case 2:
                    zc02.f299952f = aVar3.mo141627e(intValue);
                    zc02.f299953g = true;
                    return 0;
                case 3:
                    zc02.f299954h = aVar3.mo141629g(intValue);
                    zc02.f299955i = true;
                    return 0;
                case 4:
                    zc02.f299956j = aVar3.mo141633k(intValue);
                    zc02.f299957n = true;
                    return 0;
                case 5:
                    zc02.f299958o = aVar3.mo141633k(intValue);
                    zc02.f299959p = true;
                    return 0;
                case 6:
                    zc02.f299960q = aVar3.mo141633k(intValue);
                    zc02.f299961r = true;
                    return 0;
                case 7:
                    zc02.f299962s = aVar3.mo141633k(intValue);
                    zc02.f299963t = true;
                    return 0;
                case 8:
                    zc02.f299964u = aVar3.mo141633k(intValue);
                    zc02.f299965v = true;
                    return 0;
                case 9:
                    zc02.f299966w = aVar3.mo141633k(intValue);
                    zc02.f299967x = true;
                    return 0;
                case 10:
                    zc02.f299968y = aVar3.mo141628f(intValue);
                    zc02.f299969z = true;
                    return 0;
                case 11:
                    zc02.f299944A = aVar3.mo141625c(intValue);
                    zc02.f299945B = true;
                    return 0;
                case 12:
                    zc02.f299946C = aVar3.mo141633k(intValue);
                    zc02.f299947D = true;
                    return 0;
                case 13:
                    zc02.f299948E = aVar3.mo141633k(intValue);
                    zc02.f299949F = true;
                    return 0;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: p */
    public final String mo141333p() {
        return this.f299960q;
    }

    /* renamed from: q */
    public final String mo141334q() {
        return this.f299958o;
    }

    /* renamed from: r */
    public final int mo141335r() {
        return this.f299954h;
    }

    /* renamed from: s */
    public final C101871zc0 mo141336s(String str) {
        this.f299946C = str;
        this.f299947D = true;
        return this;
    }

    /* renamed from: t */
    public final C101871zc0 mo141337t(String str) {
        this.f299948E = str;
        this.f299949F = true;
        return this;
    }

    /* renamed from: u */
    public final C101871zc0 mo141338u(boolean z) {
        this.f299944A = z;
        this.f299945B = true;
        return this;
    }

    /* renamed from: v */
    public final C101871zc0 mo141339v(String str) {
        this.f299956j = str;
        this.f299957n = true;
        return this;
    }

    /* renamed from: w */
    public final C101871zc0 mo141340w(double d) {
        this.f299952f = d;
        this.f299953g = true;
        return this;
    }

    /* renamed from: x */
    public final C101871zc0 mo141341x(double d) {
        this.f299950d = d;
        this.f299951e = true;
        return this;
    }

    /* renamed from: y */
    public final C101871zc0 mo141342y(String str) {
        this.f299964u = str;
        this.f299965v = true;
        return this;
    }

    /* renamed from: z */
    public final C101871zc0 mo141343z(String str) {
        this.f299962s = str;
        this.f299963t = true;
        return this;
    }
}
