package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w0 */
public class C110973w0 extends C47465a {

    /* renamed from: d */
    public String f332310d;

    /* renamed from: e */
    public String f332311e;

    /* renamed from: f */
    public String f332312f;

    /* renamed from: g */
    public String f332313g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110973w0)) {
            return false;
        }
        C110973w0 w0Var = (C110973w0) aVar;
        return C46238a.m51546a(this.f332310d, w0Var.f332310d) && C46238a.m51546a(this.f332311e, w0Var.f332311e) && C46238a.m51546a(this.f332312f, w0Var.f332312f) && C46238a.m51546a(this.f332313g, w0Var.f332313g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332310d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f332311e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f332312f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f332313g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f332310d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f332311e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f332312f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f332313g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C110973w0 w0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w0Var.f332310d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                w0Var.f332311e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                w0Var.f332312f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                w0Var.f332313g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
