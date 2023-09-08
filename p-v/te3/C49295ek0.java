package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ek0 */
public class C49295ek0 extends C47465a {

    /* renamed from: d */
    public String f132969d;

    /* renamed from: e */
    public String f132970e;

    /* renamed from: f */
    public String f132971f;

    /* renamed from: g */
    public String f132972g;

    /* renamed from: h */
    public String f132973h;

    /* renamed from: i */
    public boolean f132974i;

    /* renamed from: j */
    public boolean f132975j;

    /* renamed from: n */
    public String f132976n;

    /* renamed from: o */
    public String f132977o;

    /* renamed from: p */
    public String f132978p;

    /* renamed from: q */
    public String f132979q;

    /* renamed from: r */
    public String f132980r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49295ek0)) {
            return false;
        }
        C49295ek0 ek02 = (C49295ek0) aVar;
        return C46238a.m51546a(this.f132969d, ek02.f132969d) && C46238a.m51546a(this.f132970e, ek02.f132970e) && C46238a.m51546a(this.f132971f, ek02.f132971f) && C46238a.m51546a(this.f132972g, ek02.f132972g) && C46238a.m51546a(this.f132973h, ek02.f132973h) && C46238a.m51546a(Boolean.valueOf(this.f132974i), Boolean.valueOf(ek02.f132974i)) && C46238a.m51546a(Boolean.valueOf(this.f132975j), Boolean.valueOf(ek02.f132975j)) && C46238a.m51546a(this.f132976n, ek02.f132976n) && C46238a.m51546a(this.f132977o, ek02.f132977o) && C46238a.m51546a(this.f132978p, ek02.f132978p) && C46238a.m51546a(this.f132979q, ek02.f132979q) && C46238a.m51546a(this.f132980r, ek02.f132980r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132969d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132970e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132971f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132972g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f132973h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74314a(6, this.f132974i);
            aVar.mo74314a(7, this.f132975j);
            String str6 = this.f132976n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f132977o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f132978p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f132979q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f132980r;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            return 0;
        } else if (i == 1) {
            String str11 = this.f132969d;
            if (str11 != null) {
                i2 = 0 + C52418a.m58683j(1, str11);
            }
            String str12 = this.f132970e;
            if (str12 != null) {
                i2 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f132971f;
            if (str13 != null) {
                i2 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f132972g;
            if (str14 != null) {
                i2 += C52418a.m58683j(4, str14);
            }
            String str15 = this.f132973h;
            if (str15 != null) {
                i2 += C52418a.m58683j(5, str15);
            }
            int a = i2 + C52418a.m58674a(6, this.f132974i) + C52418a.m58674a(7, this.f132975j);
            String str16 = this.f132976n;
            if (str16 != null) {
                a += C52418a.m58683j(8, str16);
            }
            String str17 = this.f132977o;
            if (str17 != null) {
                a += C52418a.m58683j(9, str17);
            }
            String str18 = this.f132978p;
            if (str18 != null) {
                a += C52418a.m58683j(10, str18);
            }
            String str19 = this.f132979q;
            if (str19 != null) {
                a += C52418a.m58683j(11, str19);
            }
            String str20 = this.f132980r;
            return str20 != null ? a + C52418a.m58683j(12, str20) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49295ek0 ek02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ek02.f132969d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ek02.f132970e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ek02.f132971f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ek02.f132972g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ek02.f132973h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ek02.f132974i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    ek02.f132975j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    ek02.f132976n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ek02.f132977o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ek02.f132978p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ek02.f132979q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ek02.f132980r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
