package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gh2 */
public class C49561gh2 extends C47465a {

    /* renamed from: d */
    public double f134050d;

    /* renamed from: e */
    public double f134051e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49561gh2)) {
            return false;
        }
        C49561gh2 gh22 = (C49561gh2) aVar;
        return C46238a.m51546a(Double.valueOf(this.f134050d), Double.valueOf(gh22.f134050d)) && C46238a.m51546a(Double.valueOf(this.f134051e), Double.valueOf(gh22.f134051e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f134050d);
            aVar.mo74316c(2, this.f134051e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58676c(1, this.f134050d) + 0 + C52418a.m58676c(2, this.f134051e);
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
                C49561gh2 gh22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    gh22.f134050d = aVar3.mo141627e(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    gh22.f134051e = aVar3.mo141627e(intValue);
                    return 0;
                }
            }
        }
    }
}
