package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g12 */
public class C49499g12 extends C47465a {

    /* renamed from: d */
    public String f133783d;

    /* renamed from: e */
    public String f133784e;

    /* renamed from: f */
    public int f133785f;

    /* renamed from: g */
    public String f133786g;

    /* renamed from: h */
    public String f133787h;

    /* renamed from: i */
    public String f133788i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49499g12)) {
            return false;
        }
        C49499g12 g122 = (C49499g12) aVar;
        return C46238a.m51546a(this.f133783d, g122.f133783d) && C46238a.m51546a(this.f133784e, g122.f133784e) && C46238a.m51546a(Integer.valueOf(this.f133785f), Integer.valueOf(g122.f133785f)) && C46238a.m51546a(this.f133786g, g122.f133786g) && C46238a.m51546a(this.f133787h, g122.f133787h) && C46238a.m51546a(this.f133788i, g122.f133788i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133783d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133784e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f133785f);
            String str3 = this.f133786g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f133787h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f133788i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f133783d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f133784e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f133785f);
            String str8 = this.f133786g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f133787h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f133788i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            C49499g12 g122 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    g122.f133783d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    g122.f133784e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    g122.f133785f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    g122.f133786g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    g122.f133787h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    g122.f133788i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
