package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j5 */
public class C49944j5 extends C47465a {

    /* renamed from: d */
    public String f135865d;

    /* renamed from: e */
    public String f135866e;

    /* renamed from: f */
    public String f135867f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49944j5)) {
            return false;
        }
        C49944j5 j5Var = (C49944j5) aVar;
        return C46238a.m51546a(this.f135865d, j5Var.f135865d) && C46238a.m51546a(this.f135866e, j5Var.f135866e) && C46238a.m51546a(this.f135867f, j5Var.f135867f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135865d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f135866e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f135867f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: content");
        } else if (i == 1) {
            String str4 = this.f135865d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f135866e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f135867f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135865d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: content");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49944j5 j5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j5Var.f135865d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                j5Var.f135866e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                j5Var.f135867f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
