package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n00 */
public class C50473n00 extends C47465a {

    /* renamed from: d */
    public double f138302d;

    /* renamed from: e */
    public double f138303e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50473n00)) {
            return false;
        }
        C50473n00 n002 = (C50473n00) aVar;
        return C46238a.m51546a(Double.valueOf(this.f138302d), Double.valueOf(n002.f138302d)) && C46238a.m51546a(Double.valueOf(this.f138303e), Double.valueOf(n002.f138303e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f138302d);
            aVar.mo74316c(2, this.f138303e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58676c(1, this.f138302d) + 0 + C52418a.m58676c(2, this.f138303e);
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
                C50473n00 n002 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    n002.f138302d = aVar3.mo141627e(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    n002.f138303e = aVar3.mo141627e(intValue);
                    return 0;
                }
            }
        }
    }
}
