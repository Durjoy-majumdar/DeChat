package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

public class fw4 extends C47465a {

    /* renamed from: d */
    public boolean f133719d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof fw4) && C46238a.m51546a(Boolean.valueOf(this.f133719d), Boolean.valueOf(((fw4) aVar).f133719d));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74314a(1, this.f133719d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f133719d) + 0;
        } else {
            if (i == 2) {
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                fw4 fw4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                fw4.f133719d = aVar2.mo141625c(intValue);
                return 0;
            }
        }
    }
}
