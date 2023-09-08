package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mb4 extends C47465a {

    /* renamed from: d */
    public int f137943d;

    /* renamed from: e */
    public boolean f137944e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mb4)) {
            return false;
        }
        mb4 mb4 = (mb4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137943d), Integer.valueOf(mb4.f137943d)) && C46238a.m51546a(Boolean.valueOf(this.f137944e), Boolean.valueOf(mb4.f137944e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137943d);
            aVar.mo74314a(2, this.f137944e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f137943d) + 0 + C52418a.m58674a(2, this.f137944e);
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
                mb4 mb4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mb4.f137943d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    mb4.f137944e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
