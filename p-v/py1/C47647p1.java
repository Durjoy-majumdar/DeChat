package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.p1 */
public class C47647p1 extends C47465a {

    /* renamed from: d */
    public int f127920d;

    /* renamed from: e */
    public long f127921e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47647p1)) {
            return false;
        }
        C47647p1 p1Var = (C47647p1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127920d), Integer.valueOf(p1Var.f127920d)) && C46238a.m51546a(Long.valueOf(this.f127921e), Long.valueOf(p1Var.f127921e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127920d);
            aVar.mo74321h(2, this.f127921e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f127920d) + 0 + C52418a.m58681h(2, this.f127921e);
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
                C47647p1 p1Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    p1Var.f127920d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    p1Var.f127921e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
