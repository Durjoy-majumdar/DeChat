package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rd0 */
public class C101835rd0 extends C47465a {

    /* renamed from: A */
    public String f299343A;

    /* renamed from: B */
    public String f299344B;

    /* renamed from: C */
    public boolean f299345C = false;

    /* renamed from: d */
    public int f299346d;

    /* renamed from: e */
    public boolean f299347e = false;

    /* renamed from: f */
    public String f299348f;

    /* renamed from: g */
    public boolean f299349g = false;

    /* renamed from: h */
    public String f299350h;

    /* renamed from: i */
    public boolean f299351i = false;

    /* renamed from: j */
    public String f299352j;

    /* renamed from: n */
    public boolean f299353n = false;

    /* renamed from: o */
    public String f299354o;

    /* renamed from: p */
    public boolean f299355p = false;

    /* renamed from: q */
    public long f299356q;

    /* renamed from: r */
    public boolean f299357r = false;

    /* renamed from: s */
    public String f299358s;

    /* renamed from: t */
    public boolean f299359t = false;

    /* renamed from: u */
    public String f299360u;

    /* renamed from: v */
    public boolean f299361v = false;

    /* renamed from: w */
    public String f299362w;

    /* renamed from: x */
    public boolean f299363x = false;

    /* renamed from: y */
    public String f299364y;

    /* renamed from: z */
    public boolean f299365z = false;

    /* renamed from: b */
    public final int mo141271b() {
        return this.f299346d;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101835rd0)) {
            return false;
        }
        C101835rd0 rd02 = (C101835rd0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299346d), Integer.valueOf(rd02.f299346d)) && C46238a.m51546a(this.f299348f, rd02.f299348f) && C46238a.m51546a(this.f299350h, rd02.f299350h) && C46238a.m51546a(this.f299352j, rd02.f299352j) && C46238a.m51546a(this.f299354o, rd02.f299354o) && C46238a.m51546a(Long.valueOf(this.f299356q), Long.valueOf(rd02.f299356q)) && C46238a.m51546a(this.f299358s, rd02.f299358s) && C46238a.m51546a(this.f299360u, rd02.f299360u) && C46238a.m51546a(this.f299362w, rd02.f299362w) && C46238a.m51546a(this.f299364y, rd02.f299364y) && C46238a.m51546a(this.f299343A, rd02.f299343A) && C46238a.m51546a(this.f299344B, rd02.f299344B);
    }

    /* renamed from: d */
    public final C101835rd0 mo141272d(String str) {
        this.f299362w = str;
        this.f299363x = true;
        return this;
    }

    /* renamed from: f */
    public final C101835rd0 mo141273f(long j) {
        this.f299356q = j;
        this.f299357r = true;
        return this;
    }

    /* renamed from: j */
    public final C101835rd0 mo141274j(String str) {
        this.f299360u = str;
        this.f299361v = true;
        return this;
    }

    /* renamed from: k */
    public final C101835rd0 mo141275k(String str) {
        this.f299348f = str;
        this.f299349g = true;
        return this;
    }

    /* renamed from: l */
    public final C101835rd0 mo141276l(String str) {
        this.f299364y = str;
        this.f299365z = true;
        return this;
    }

    /* renamed from: m */
    public final C101835rd0 mo141277m(int i) {
        this.f299346d = i;
        this.f299347e = true;
        return this;
    }

    /* renamed from: n */
    public final C101835rd0 mo141278n(String str) {
        this.f299352j = str;
        this.f299353n = true;
        return this;
    }

    /* renamed from: o */
    public final C101835rd0 mo141279o(String str) {
        this.f299350h = str;
        this.f299351i = true;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            boolean z = this.f299347e;
            if (z) {
                if (z) {
                    aVar.mo74318e(1, this.f299346d);
                }
                String str = this.f299348f;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f299350h;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f299352j;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f299354o;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                if (this.f299357r) {
                    aVar.mo74321h(6, this.f299356q);
                }
                String str5 = this.f299358s;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f299360u;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f299362w;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                String str8 = this.f299364y;
                if (str8 != null) {
                    aVar.mo74323j(10, str8);
                }
                String str9 = this.f299343A;
                if (str9 != null) {
                    aVar.mo74323j(11, str9);
                }
                String str10 = this.f299344B;
                if (str10 == null) {
                    return 0;
                }
                aVar.mo74323j(12, str10);
                return 0;
            }
            throw new C52419b("Not all required fields were included: sourceType");
        } else if (i2 == 1) {
            int e = this.f299347e ? C52418a.m58678e(1, this.f299346d) + 0 : 0;
            String str11 = this.f299348f;
            if (str11 != null) {
                e += C52418a.m58683j(2, str11);
            }
            String str12 = this.f299350h;
            if (str12 != null) {
                e += C52418a.m58683j(3, str12);
            }
            String str13 = this.f299352j;
            if (str13 != null) {
                e += C52418a.m58683j(4, str13);
            }
            String str14 = this.f299354o;
            if (str14 != null) {
                e += C52418a.m58683j(5, str14);
            }
            if (this.f299357r) {
                e += C52418a.m58681h(6, this.f299356q);
            }
            String str15 = this.f299358s;
            if (str15 != null) {
                e += C52418a.m58683j(7, str15);
            }
            String str16 = this.f299360u;
            if (str16 != null) {
                e += C52418a.m58683j(8, str16);
            }
            String str17 = this.f299362w;
            if (str17 != null) {
                e += C52418a.m58683j(9, str17);
            }
            String str18 = this.f299364y;
            if (str18 != null) {
                e += C52418a.m58683j(10, str18);
            }
            String str19 = this.f299343A;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            String str20 = this.f299344B;
            return str20 != null ? e + C52418a.m58683j(12, str20) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299347e) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: sourceType");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101835rd0 rd02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rd02.f299346d = aVar3.mo141629g(intValue);
                    rd02.f299347e = true;
                    return 0;
                case 2:
                    rd02.f299348f = aVar3.mo141633k(intValue);
                    rd02.f299349g = true;
                    return 0;
                case 3:
                    rd02.f299350h = aVar3.mo141633k(intValue);
                    rd02.f299351i = true;
                    return 0;
                case 4:
                    rd02.f299352j = aVar3.mo141633k(intValue);
                    rd02.f299353n = true;
                    return 0;
                case 5:
                    rd02.f299354o = aVar3.mo141633k(intValue);
                    rd02.f299355p = true;
                    return 0;
                case 6:
                    rd02.f299356q = aVar3.mo141631i(intValue);
                    rd02.f299357r = true;
                    return 0;
                case 7:
                    rd02.f299358s = aVar3.mo141633k(intValue);
                    rd02.f299359t = true;
                    return 0;
                case 8:
                    rd02.f299360u = aVar3.mo141633k(intValue);
                    rd02.f299361v = true;
                    return 0;
                case 9:
                    rd02.f299362w = aVar3.mo141633k(intValue);
                    rd02.f299363x = true;
                    return 0;
                case 10:
                    rd02.f299364y = aVar3.mo141633k(intValue);
                    rd02.f299365z = true;
                    return 0;
                case 11:
                    rd02.f299343A = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    rd02.f299344B = aVar3.mo141633k(intValue);
                    rd02.f299345C = true;
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
