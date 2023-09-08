package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class od4 extends C47465a {

    /* renamed from: d */
    public int f332187d;

    /* renamed from: e */
    public int f332188e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof od4)) {
            return false;
        }
        od4 od4 = (od4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f332187d), Integer.valueOf(od4.f332187d)) && C46238a.m51546a(Integer.valueOf(this.f332188e), Integer.valueOf(od4.f332188e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f332187d);
            aVar.mo74318e(2, this.f332188e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f332187d) + 0 + C52418a.m58678e(2, this.f332188e);
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
                od4 od4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    od4.f332187d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    od4.f332188e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
