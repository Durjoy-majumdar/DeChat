package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class y65 extends C47465a {

    /* renamed from: d */
    public int f145149d;

    /* renamed from: e */
    public boolean f145150e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y65)) {
            return false;
        }
        y65 y65 = (y65) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145149d), Integer.valueOf(y65.f145149d)) && C46238a.m51546a(Boolean.valueOf(this.f145150e), Boolean.valueOf(y65.f145150e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145149d);
            aVar.mo74314a(2, this.f145150e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f145149d) + 0 + C52418a.m58674a(2, this.f145150e);
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
                y65 y65 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    y65.f145149d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    y65.f145150e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
