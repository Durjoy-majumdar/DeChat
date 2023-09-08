package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kt3 */
public class C90424kt3 extends C47465a {

    /* renamed from: d */
    public String f259653d;

    /* renamed from: e */
    public String f259654e;

    /* renamed from: f */
    public String f259655f;

    /* renamed from: g */
    public int f259656g;

    /* renamed from: h */
    public int f259657h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90424kt3)) {
            return false;
        }
        C90424kt3 kt32 = (C90424kt3) aVar;
        return C46238a.m51546a(this.f259653d, kt32.f259653d) && C46238a.m51546a(this.f259654e, kt32.f259654e) && C46238a.m51546a(this.f259655f, kt32.f259655f) && C46238a.m51546a(Integer.valueOf(this.f259656g), Integer.valueOf(kt32.f259656g)) && C46238a.m51546a(Integer.valueOf(this.f259657h), Integer.valueOf(kt32.f259657h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259653d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259654e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f259655f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f259656g);
            aVar.mo74318e(5, this.f259657h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f259653d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f259654e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f259655f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f259656g) + C52418a.m58678e(5, this.f259657h);
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
            C90424kt3 kt32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kt32.f259653d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                kt32.f259654e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kt32.f259655f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                kt32.f259656g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kt32.f259657h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
