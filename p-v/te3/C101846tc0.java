package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tc0 */
public class C101846tc0 extends C47465a {

    /* renamed from: A */
    public String f299512A;

    /* renamed from: B */
    public String f299513B;

    /* renamed from: C */
    public boolean f299514C = false;

    /* renamed from: D */
    public String f299515D;

    /* renamed from: E */
    public boolean f299516E = false;

    /* renamed from: d */
    public int f299517d;

    /* renamed from: e */
    public boolean f299518e = false;

    /* renamed from: f */
    public String f299519f;

    /* renamed from: g */
    public boolean f299520g = false;

    /* renamed from: h */
    public String f299521h;

    /* renamed from: i */
    public boolean f299522i = false;

    /* renamed from: j */
    public String f299523j;

    /* renamed from: n */
    public boolean f299524n = false;

    /* renamed from: o */
    public String f299525o;

    /* renamed from: p */
    public boolean f299526p = false;

    /* renamed from: q */
    public long f299527q;

    /* renamed from: r */
    public boolean f299528r = false;

    /* renamed from: s */
    public String f299529s;

    /* renamed from: t */
    public boolean f299530t = false;

    /* renamed from: u */
    public String f299531u;

    /* renamed from: v */
    public boolean f299532v = false;

    /* renamed from: w */
    public String f299533w;

    /* renamed from: x */
    public boolean f299534x = false;

    /* renamed from: y */
    public String f299535y;

    /* renamed from: z */
    public boolean f299536z = false;

    /* renamed from: b */
    public final String mo141301b() {
        return this.f299513B;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101846tc0)) {
            return false;
        }
        C101846tc0 tc02 = (C101846tc0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299517d), Integer.valueOf(tc02.f299517d)) && C46238a.m51546a(this.f299519f, tc02.f299519f) && C46238a.m51546a(this.f299521h, tc02.f299521h) && C46238a.m51546a(this.f299523j, tc02.f299523j) && C46238a.m51546a(this.f299525o, tc02.f299525o) && C46238a.m51546a(Long.valueOf(this.f299527q), Long.valueOf(tc02.f299527q)) && C46238a.m51546a(this.f299529s, tc02.f299529s) && C46238a.m51546a(this.f299531u, tc02.f299531u) && C46238a.m51546a(this.f299533w, tc02.f299533w) && C46238a.m51546a(this.f299535y, tc02.f299535y) && C46238a.m51546a(this.f299512A, tc02.f299512A) && C46238a.m51546a(this.f299513B, tc02.f299513B) && C46238a.m51546a(this.f299515D, tc02.f299515D);
    }

    /* renamed from: d */
    public final String mo141302d() {
        return this.f299519f;
    }

    /* renamed from: f */
    public final String mo141303f() {
        return this.f299515D;
    }

    /* renamed from: k */
    public final String mo141304k() {
        return this.f299525o;
    }

    /* renamed from: l */
    public final C101846tc0 mo141305l(String str) {
        this.f299513B = str;
        this.f299514C = true;
        return this;
    }

    /* renamed from: m */
    public final C101846tc0 mo141306m(String str) {
        this.f299519f = str;
        this.f299520g = true;
        return this;
    }

    /* renamed from: n */
    public final C101846tc0 mo141307n(String str) {
        this.f299535y = str;
        this.f299536z = true;
        return this;
    }

    /* renamed from: o */
    public final C101846tc0 mo141308o(String str) {
        this.f299525o = str;
        this.f299526p = true;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            boolean z = this.f299518e;
            if (z) {
                if (z) {
                    aVar.mo74318e(1, this.f299517d);
                }
                String str = this.f299519f;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f299521h;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f299523j;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f299525o;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                if (this.f299528r) {
                    aVar.mo74321h(6, this.f299527q);
                }
                String str5 = this.f299529s;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f299531u;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f299533w;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                String str8 = this.f299535y;
                if (str8 != null) {
                    aVar.mo74323j(10, str8);
                }
                String str9 = this.f299512A;
                if (str9 != null) {
                    aVar.mo74323j(11, str9);
                }
                String str10 = this.f299513B;
                if (str10 != null) {
                    aVar.mo74323j(12, str10);
                }
                String str11 = this.f299515D;
                if (str11 == null) {
                    return 0;
                }
                aVar.mo74323j(13, str11);
                return 0;
            }
            throw new C52419b("Not all required fields were included: sourceType");
        } else if (i2 == 1) {
            int e = this.f299518e ? C52418a.m58678e(1, this.f299517d) + 0 : 0;
            String str12 = this.f299519f;
            if (str12 != null) {
                e += C52418a.m58683j(2, str12);
            }
            String str13 = this.f299521h;
            if (str13 != null) {
                e += C52418a.m58683j(3, str13);
            }
            String str14 = this.f299523j;
            if (str14 != null) {
                e += C52418a.m58683j(4, str14);
            }
            String str15 = this.f299525o;
            if (str15 != null) {
                e += C52418a.m58683j(5, str15);
            }
            if (this.f299528r) {
                e += C52418a.m58681h(6, this.f299527q);
            }
            String str16 = this.f299529s;
            if (str16 != null) {
                e += C52418a.m58683j(7, str16);
            }
            String str17 = this.f299531u;
            if (str17 != null) {
                e += C52418a.m58683j(8, str17);
            }
            String str18 = this.f299533w;
            if (str18 != null) {
                e += C52418a.m58683j(9, str18);
            }
            String str19 = this.f299535y;
            if (str19 != null) {
                e += C52418a.m58683j(10, str19);
            }
            String str20 = this.f299512A;
            if (str20 != null) {
                e += C52418a.m58683j(11, str20);
            }
            String str21 = this.f299513B;
            if (str21 != null) {
                e += C52418a.m58683j(12, str21);
            }
            String str22 = this.f299515D;
            return str22 != null ? e + C52418a.m58683j(13, str22) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299518e) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: sourceType");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101846tc0 tc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tc02.f299517d = aVar3.mo141629g(intValue);
                    tc02.f299518e = true;
                    return 0;
                case 2:
                    tc02.f299519f = aVar3.mo141633k(intValue);
                    tc02.f299520g = true;
                    return 0;
                case 3:
                    tc02.f299521h = aVar3.mo141633k(intValue);
                    tc02.f299522i = true;
                    return 0;
                case 4:
                    tc02.f299523j = aVar3.mo141633k(intValue);
                    tc02.f299524n = true;
                    return 0;
                case 5:
                    tc02.f299525o = aVar3.mo141633k(intValue);
                    tc02.f299526p = true;
                    return 0;
                case 6:
                    tc02.f299527q = aVar3.mo141631i(intValue);
                    tc02.f299528r = true;
                    return 0;
                case 7:
                    tc02.f299529s = aVar3.mo141633k(intValue);
                    tc02.f299530t = true;
                    return 0;
                case 8:
                    tc02.f299531u = aVar3.mo141633k(intValue);
                    tc02.f299532v = true;
                    return 0;
                case 9:
                    tc02.f299533w = aVar3.mo141633k(intValue);
                    tc02.f299534x = true;
                    return 0;
                case 10:
                    tc02.f299535y = aVar3.mo141633k(intValue);
                    tc02.f299536z = true;
                    return 0;
                case 11:
                    tc02.f299512A = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    tc02.f299513B = aVar3.mo141633k(intValue);
                    tc02.f299514C = true;
                    return 0;
                case 13:
                    tc02.f299515D = aVar3.mo141633k(intValue);
                    tc02.f299516E = true;
                    return 0;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: p */
    public final C101846tc0 mo141309p(int i) {
        this.f299517d = i;
        this.f299518e = true;
        return this;
    }

    /* renamed from: q */
    public final C101846tc0 mo141310q(String str) {
        this.f299521h = str;
        this.f299522i = true;
        return this;
    }
}
