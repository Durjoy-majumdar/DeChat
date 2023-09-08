package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.v0 */
public class C47687v0 extends C47465a {

    /* renamed from: d */
    public int f128069d;

    /* renamed from: e */
    public String f128070e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47687v0)) {
            return false;
        }
        C47687v0 v0Var = (C47687v0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f128069d), Integer.valueOf(v0Var.f128069d)) && C46238a.m51546a(this.f128070e, v0Var.f128070e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f128069d);
            String str = this.f128070e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f128069d) + 0;
            String str2 = this.f128070e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C47687v0 v0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v0Var.f128069d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                v0Var.f128070e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
