package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.i0 */
public class C47597i0 extends C47465a {

    /* renamed from: d */
    public long f127775d;

    /* renamed from: e */
    public long f127776e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47597i0)) {
            return false;
        }
        C47597i0 i0Var = (C47597i0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f127775d), Long.valueOf(i0Var.f127775d)) && C46238a.m51546a(Long.valueOf(this.f127776e), Long.valueOf(i0Var.f127776e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f127775d);
            aVar.mo74321h(2, this.f127776e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f127775d) + 0 + C52418a.m58681h(2, this.f127776e);
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
                C47597i0 i0Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    i0Var.f127775d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    i0Var.f127776e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
