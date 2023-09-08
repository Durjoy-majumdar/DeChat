package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.i5 */
public class C47602i5 extends C47465a {

    /* renamed from: d */
    public String f127796d;

    /* renamed from: e */
    public String f127797e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47602i5)) {
            return false;
        }
        C47602i5 i5Var = (C47602i5) aVar;
        return C46238a.m51546a(this.f127796d, i5Var.f127796d) && C46238a.m51546a(this.f127797e, i5Var.f127797e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127796d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f127797e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127797e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: TimeDesc");
            }
        } else if (i == 1) {
            String str3 = this.f127796d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f127797e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127796d == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f127797e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: TimeDesc");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47602i5 i5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i5Var.f127796d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                i5Var.f127797e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
