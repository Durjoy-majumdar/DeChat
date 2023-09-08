package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jo3 */
public class C22503jo3 extends C47465a {

    /* renamed from: d */
    public String f64069d;

    /* renamed from: e */
    public int f64070e;

    /* renamed from: f */
    public int f64071f;

    /* renamed from: g */
    public long f64072g;

    /* renamed from: h */
    public int f64073h;

    /* renamed from: i */
    public String f64074i;

    /* renamed from: j */
    public String f64075j;

    /* renamed from: n */
    public String f64076n;

    /* renamed from: o */
    public String f64077o;

    /* renamed from: p */
    public String f64078p;

    /* renamed from: q */
    public String f64079q;

    /* renamed from: r */
    public String f64080r;

    /* renamed from: s */
    public String f64081s;

    /* renamed from: t */
    public int f64082t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22503jo3)) {
            return false;
        }
        C22503jo3 jo32 = (C22503jo3) aVar;
        return C46238a.m51546a(this.f64069d, jo32.f64069d) && C46238a.m51546a(Integer.valueOf(this.f64070e), Integer.valueOf(jo32.f64070e)) && C46238a.m51546a(Integer.valueOf(this.f64071f), Integer.valueOf(jo32.f64071f)) && C46238a.m51546a(Long.valueOf(this.f64072g), Long.valueOf(jo32.f64072g)) && C46238a.m51546a(Integer.valueOf(this.f64073h), Integer.valueOf(jo32.f64073h)) && C46238a.m51546a(this.f64074i, jo32.f64074i) && C46238a.m51546a(this.f64075j, jo32.f64075j) && C46238a.m51546a(this.f64076n, jo32.f64076n) && C46238a.m51546a(this.f64077o, jo32.f64077o) && C46238a.m51546a(this.f64078p, jo32.f64078p) && C46238a.m51546a(this.f64079q, jo32.f64079q) && C46238a.m51546a(this.f64080r, jo32.f64080r) && C46238a.m51546a(this.f64081s, jo32.f64081s) && C46238a.m51546a(Integer.valueOf(this.f64082t), Integer.valueOf(jo32.f64082t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64069d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f64070e);
            aVar.mo74318e(3, this.f64071f);
            aVar.mo74321h(4, this.f64072g);
            aVar.mo74318e(5, this.f64073h);
            String str2 = this.f64074i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f64075j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f64076n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f64077o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f64078p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f64079q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            String str8 = this.f64080r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            String str9 = this.f64081s;
            if (str9 != null) {
                aVar.mo74323j(13, str9);
            }
            aVar.mo74318e(14, this.f64082t);
            return 0;
        } else if (i2 == 1) {
            String str10 = this.f64069d;
            if (str10 != null) {
                i3 = C52418a.m58683j(1, str10) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f64070e) + C52418a.m58678e(3, this.f64071f) + C52418a.m58681h(4, this.f64072g) + C52418a.m58678e(5, this.f64073h);
            String str11 = this.f64074i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f64075j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f64076n;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f64077o;
            if (str14 != null) {
                e += C52418a.m58683j(9, str14);
            }
            String str15 = this.f64078p;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            String str16 = this.f64079q;
            if (str16 != null) {
                e += C52418a.m58683j(11, str16);
            }
            String str17 = this.f64080r;
            if (str17 != null) {
                e += C52418a.m58683j(12, str17);
            }
            String str18 = this.f64081s;
            if (str18 != null) {
                e += C52418a.m58683j(13, str18);
            }
            return e + C52418a.m58678e(14, this.f64082t);
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
            C22503jo3 jo32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jo32.f64069d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jo32.f64070e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jo32.f64071f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jo32.f64072g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    jo32.f64073h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    jo32.f64074i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jo32.f64075j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jo32.f64076n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    jo32.f64077o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jo32.f64078p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    jo32.f64079q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    jo32.f64080r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    jo32.f64081s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    jo32.f64082t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
