package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class gc4 extends C47465a {

    /* renamed from: d */
    public long f133968d;

    /* renamed from: e */
    public int f133969e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gc4)) {
            return false;
        }
        gc4 gc4 = (gc4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f133968d), Long.valueOf(gc4.f133968d)) && C46238a.m51546a(Integer.valueOf(this.f133969e), Integer.valueOf(gc4.f133969e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f133968d);
            aVar.mo74318e(2, this.f133969e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f133968d) + 0 + C52418a.m58678e(2, this.f133969e);
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
                gc4 gc4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    gc4.f133968d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    gc4.f133969e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
