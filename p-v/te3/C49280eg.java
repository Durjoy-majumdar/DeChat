package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eg */
public class C49280eg extends C47465a {

    /* renamed from: d */
    public String f132908d;

    /* renamed from: e */
    public String f132909e;

    /* renamed from: f */
    public String f132910f;

    /* renamed from: g */
    public String f132911g;

    /* renamed from: h */
    public int f132912h;

    /* renamed from: i */
    public int f132913i;

    /* renamed from: j */
    public int f132914j;

    /* renamed from: n */
    public String f132915n;

    /* renamed from: o */
    public int f132916o;

    /* renamed from: p */
    public int f132917p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49280eg)) {
            return false;
        }
        C49280eg egVar = (C49280eg) aVar;
        return C46238a.m51546a(this.f132908d, egVar.f132908d) && C46238a.m51546a(this.f132909e, egVar.f132909e) && C46238a.m51546a(this.f132910f, egVar.f132910f) && C46238a.m51546a(this.f132911g, egVar.f132911g) && C46238a.m51546a(Integer.valueOf(this.f132912h), Integer.valueOf(egVar.f132912h)) && C46238a.m51546a(Integer.valueOf(this.f132913i), Integer.valueOf(egVar.f132913i)) && C46238a.m51546a(Integer.valueOf(this.f132914j), Integer.valueOf(egVar.f132914j)) && C46238a.m51546a(this.f132915n, egVar.f132915n) && C46238a.m51546a(Integer.valueOf(this.f132916o), Integer.valueOf(egVar.f132916o)) && C46238a.m51546a(Integer.valueOf(this.f132917p), Integer.valueOf(egVar.f132917p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132908d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132909e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132910f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132911g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f132912h);
            aVar.mo74318e(6, this.f132913i);
            aVar.mo74318e(7, this.f132914j);
            String str5 = this.f132915n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f132916o);
            aVar.mo74318e(10, this.f132917p);
            return 0;
        } else if (i == 1) {
            String str6 = this.f132908d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f132909e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f132910f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f132911g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f132912h) + C52418a.m58678e(6, this.f132913i) + C52418a.m58678e(7, this.f132914j);
            String str10 = this.f132915n;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            return e + C52418a.m58678e(9, this.f132916o) + C52418a.m58678e(10, this.f132917p);
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
            C49280eg egVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    egVar.f132908d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    egVar.f132909e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    egVar.f132910f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    egVar.f132911g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    egVar.f132912h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    egVar.f132913i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    egVar.f132914j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    egVar.f132915n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    egVar.f132916o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    egVar.f132917p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
