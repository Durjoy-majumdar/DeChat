package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xe */
public class C51960xe extends C47465a {

    /* renamed from: d */
    public String f144611d;

    /* renamed from: e */
    public int f144612e;

    /* renamed from: f */
    public String f144613f;

    /* renamed from: g */
    public String f144614g;

    /* renamed from: h */
    public int f144615h;

    /* renamed from: i */
    public int f144616i;

    /* renamed from: j */
    public int f144617j;

    /* renamed from: n */
    public String f144618n;

    /* renamed from: o */
    public String f144619o;

    /* renamed from: p */
    public int f144620p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51960xe)) {
            return false;
        }
        C51960xe xeVar = (C51960xe) aVar;
        return C46238a.m51546a(this.f144611d, xeVar.f144611d) && C46238a.m51546a(Integer.valueOf(this.f144612e), Integer.valueOf(xeVar.f144612e)) && C46238a.m51546a(this.f144613f, xeVar.f144613f) && C46238a.m51546a(this.f144614g, xeVar.f144614g) && C46238a.m51546a(Integer.valueOf(this.f144615h), Integer.valueOf(xeVar.f144615h)) && C46238a.m51546a(Integer.valueOf(this.f144616i), Integer.valueOf(xeVar.f144616i)) && C46238a.m51546a(Integer.valueOf(this.f144617j), Integer.valueOf(xeVar.f144617j)) && C46238a.m51546a(this.f144618n, xeVar.f144618n) && C46238a.m51546a(this.f144619o, xeVar.f144619o) && C46238a.m51546a(Integer.valueOf(this.f144620p), Integer.valueOf(xeVar.f144620p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144611d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f144612e);
            String str2 = this.f144613f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144614g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f144615h);
            aVar.mo74318e(6, this.f144616i);
            aVar.mo74318e(7, this.f144617j);
            String str4 = this.f144618n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f144619o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f144620p);
            return 0;
        } else if (i == 1) {
            String str6 = this.f144611d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f144612e);
            String str7 = this.f144613f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f144614g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            int e2 = e + C52418a.m58678e(5, this.f144615h) + C52418a.m58678e(6, this.f144616i) + C52418a.m58678e(7, this.f144617j);
            String str9 = this.f144618n;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            String str10 = this.f144619o;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            return e2 + C52418a.m58678e(10, this.f144620p);
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
            C51960xe xeVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xeVar.f144611d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xeVar.f144612e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    xeVar.f144613f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xeVar.f144614g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xeVar.f144615h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xeVar.f144616i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xeVar.f144617j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    xeVar.f144618n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xeVar.f144619o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xeVar.f144620p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
