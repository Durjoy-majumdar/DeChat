package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l2 */
public class C64509l2 extends C47465a {

    /* renamed from: d */
    public int f184021d;

    /* renamed from: e */
    public int f184022e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64509l2)) {
            return false;
        }
        C64509l2 l2Var = (C64509l2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184021d), Integer.valueOf(l2Var.f184021d)) && C46238a.m51546a(Integer.valueOf(this.f184022e), Integer.valueOf(l2Var.f184022e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184021d);
            aVar.mo74318e(2, this.f184022e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184021d) + 0 + C52418a.m58678e(2, this.f184022e);
        } else {
            if (i == 2) {
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
                C64509l2 l2Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    l2Var.f184021d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    l2Var.f184022e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
