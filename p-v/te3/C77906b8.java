package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b8 */
public class C77906b8 extends C47465a {

    /* renamed from: d */
    public boolean f226987d;

    /* renamed from: e */
    public int f226988e;

    /* renamed from: f */
    public String f226989f;

    /* renamed from: g */
    public String f226990g;

    /* renamed from: h */
    public String f226991h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77906b8)) {
            return false;
        }
        C77906b8 b8Var = (C77906b8) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f226987d), Boolean.valueOf(b8Var.f226987d)) && C46238a.m51546a(Integer.valueOf(this.f226988e), Integer.valueOf(b8Var.f226988e)) && C46238a.m51546a(this.f226989f, b8Var.f226989f) && C46238a.m51546a(this.f226990g, b8Var.f226990g) && C46238a.m51546a(this.f226991h, b8Var.f226991h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f226987d);
            aVar.mo74318e(2, this.f226988e);
            String str = this.f226989f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f226990g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f226991h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f226987d) + 0 + C52418a.m58678e(2, this.f226988e);
            String str4 = this.f226989f;
            if (str4 != null) {
                a += C52418a.m58683j(3, str4);
            }
            String str5 = this.f226990g;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.f226991h;
            return str6 != null ? a + C52418a.m58683j(5, str6) : a;
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
            C77906b8 b8Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b8Var.f226987d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                b8Var.f226988e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b8Var.f226989f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                b8Var.f226990g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b8Var.f226991h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
