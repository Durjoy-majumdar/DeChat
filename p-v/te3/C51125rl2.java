package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rl2 */
public class C51125rl2 extends C47465a {

    /* renamed from: d */
    public String f141006d;

    /* renamed from: e */
    public String f141007e;

    /* renamed from: f */
    public String f141008f;

    /* renamed from: g */
    public String f141009g;

    /* renamed from: h */
    public String f141010h;

    /* renamed from: i */
    public int f141011i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51125rl2)) {
            return false;
        }
        C51125rl2 rl22 = (C51125rl2) aVar;
        return C46238a.m51546a(this.f141006d, rl22.f141006d) && C46238a.m51546a(this.f141007e, rl22.f141007e) && C46238a.m51546a(this.f141008f, rl22.f141008f) && C46238a.m51546a(this.f141009g, rl22.f141009g) && C46238a.m51546a(this.f141010h, rl22.f141010h) && C46238a.m51546a(Integer.valueOf(this.f141011i), Integer.valueOf(rl22.f141011i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141006d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141007e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141008f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f141009g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f141010h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f141011i);
            return 0;
        } else if (i == 1) {
            String str6 = this.f141006d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f141007e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f141008f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f141009g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f141010h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f141011i);
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
            C51125rl2 rl22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rl22.f141006d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rl22.f141007e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rl22.f141008f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rl22.f141009g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rl22.f141010h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rl22.f141011i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
