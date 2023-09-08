package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j43 */
public class C77950j43 extends C47465a {

    /* renamed from: d */
    public String f227640d;

    /* renamed from: e */
    public String f227641e;

    /* renamed from: f */
    public String f227642f;

    /* renamed from: g */
    public String f227643g;

    /* renamed from: h */
    public String f227644h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77950j43)) {
            return false;
        }
        C77950j43 j432 = (C77950j43) aVar;
        return C46238a.m51546a(this.f227640d, j432.f227640d) && C46238a.m51546a(this.f227641e, j432.f227641e) && C46238a.m51546a(this.f227642f, j432.f227642f) && C46238a.m51546a(this.f227643g, j432.f227643g) && C46238a.m51546a(this.f227644h, j432.f227644h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227640d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227641e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227642f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227643g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f227644h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f227640d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f227641e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f227642f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f227643g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f227644h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C77950j43 j432 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j432.f227640d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                j432.f227641e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                j432.f227642f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                j432.f227643g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                j432.f227644h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
