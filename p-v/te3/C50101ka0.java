package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ka0 */
public class C50101ka0 extends C47465a {

    /* renamed from: d */
    public int f136630d;

    /* renamed from: e */
    public int f136631e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50101ka0)) {
            return false;
        }
        C50101ka0 ka02 = (C50101ka0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136630d), Integer.valueOf(ka02.f136630d)) && C46238a.m51546a(Integer.valueOf(this.f136631e), Integer.valueOf(ka02.f136631e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136630d);
            aVar.mo74318e(2, this.f136631e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136630d) + 0 + C52418a.m58678e(2, this.f136631e);
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
                C50101ka0 ka02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ka02.f136630d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ka02.f136631e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
