package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yf1 */
public class C64855yf1 extends C47465a {

    /* renamed from: d */
    public String f186509d;

    /* renamed from: e */
    public String f186510e;

    /* renamed from: f */
    public String f186511f;

    /* renamed from: g */
    public String f186512g;

    /* renamed from: h */
    public String f186513h;

    /* renamed from: i */
    public int f186514i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64855yf1)) {
            return false;
        }
        C64855yf1 yf12 = (C64855yf1) aVar;
        return C46238a.m51546a(this.f186509d, yf12.f186509d) && C46238a.m51546a(this.f186510e, yf12.f186510e) && C46238a.m51546a(this.f186511f, yf12.f186511f) && C46238a.m51546a(this.f186512g, yf12.f186512g) && C46238a.m51546a(this.f186513h, yf12.f186513h) && C46238a.m51546a(Integer.valueOf(this.f186514i), Integer.valueOf(yf12.f186514i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186509d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186510e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186511f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186512g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f186513h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f186514i);
            return 0;
        } else if (i == 1) {
            String str6 = this.f186509d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f186510e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f186511f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f186512g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f186513h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f186514i);
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
            C64855yf1 yf12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yf12.f186509d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yf12.f186510e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yf12.f186511f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yf12.f186512g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yf12.f186513h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    yf12.f186514i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
