package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ec4 extends C47465a {

    /* renamed from: d */
    public long f132866d;

    /* renamed from: e */
    public int f132867e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ec4)) {
            return false;
        }
        ec4 ec4 = (ec4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132866d), Long.valueOf(ec4.f132866d)) && C46238a.m51546a(Integer.valueOf(this.f132867e), Integer.valueOf(ec4.f132867e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132866d);
            aVar.mo74318e(2, this.f132867e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f132866d) + 0 + C52418a.m58678e(2, this.f132867e);
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
                ec4 ec4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ec4.f132866d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ec4.f132867e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
