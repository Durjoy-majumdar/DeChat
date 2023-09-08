package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gu2 */
public class C101783gu2 extends C47465a {

    /* renamed from: d */
    public boolean f298308d;

    /* renamed from: e */
    public boolean f298309e;

    /* renamed from: f */
    public int f298310f;

    /* renamed from: g */
    public int f298311g;

    /* renamed from: h */
    public String f298312h;

    /* renamed from: i */
    public boolean f298313i;

    /* renamed from: j */
    public String f298314j;

    /* renamed from: n */
    public boolean f298315n;

    /* renamed from: o */
    public String f298316o;

    /* renamed from: p */
    public boolean f298317p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101783gu2)) {
            return false;
        }
        C101783gu2 gu22 = (C101783gu2) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f298308d), Boolean.valueOf(gu22.f298308d)) && C46238a.m51546a(Boolean.valueOf(this.f298309e), Boolean.valueOf(gu22.f298309e)) && C46238a.m51546a(Integer.valueOf(this.f298310f), Integer.valueOf(gu22.f298310f)) && C46238a.m51546a(Integer.valueOf(this.f298311g), Integer.valueOf(gu22.f298311g)) && C46238a.m51546a(this.f298312h, gu22.f298312h) && C46238a.m51546a(Boolean.valueOf(this.f298313i), Boolean.valueOf(gu22.f298313i)) && C46238a.m51546a(this.f298314j, gu22.f298314j) && C46238a.m51546a(Boolean.valueOf(this.f298315n), Boolean.valueOf(gu22.f298315n)) && C46238a.m51546a(this.f298316o, gu22.f298316o) && C46238a.m51546a(Boolean.valueOf(this.f298317p), Boolean.valueOf(gu22.f298317p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f298308d);
            aVar.mo74314a(2, this.f298309e);
            aVar.mo74318e(3, this.f298310f);
            aVar.mo74318e(4, this.f298311g);
            String str = this.f298312h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74314a(6, this.f298313i);
            String str2 = this.f298314j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74314a(8, this.f298315n);
            String str3 = this.f298316o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74314a(10, this.f298317p);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f298308d) + 0 + C52418a.m58674a(2, this.f298309e) + C52418a.m58678e(3, this.f298310f) + C52418a.m58678e(4, this.f298311g);
            String str4 = this.f298312h;
            if (str4 != null) {
                a += C52418a.m58683j(5, str4);
            }
            int a2 = a + C52418a.m58674a(6, this.f298313i);
            String str5 = this.f298314j;
            if (str5 != null) {
                a2 += C52418a.m58683j(7, str5);
            }
            int a3 = a2 + C52418a.m58674a(8, this.f298315n);
            String str6 = this.f298316o;
            if (str6 != null) {
                a3 += C52418a.m58683j(9, str6);
            }
            return a3 + C52418a.m58674a(10, this.f298317p);
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
            C101783gu2 gu22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gu22.f298308d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    gu22.f298309e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    gu22.f298310f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gu22.f298311g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gu22.f298312h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gu22.f298313i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    gu22.f298314j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gu22.f298315n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    gu22.f298316o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    gu22.f298317p = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
