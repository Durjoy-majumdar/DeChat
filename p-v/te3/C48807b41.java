package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b41 */
public class C48807b41 extends C47465a {

    /* renamed from: d */
    public int f130930d;

    /* renamed from: e */
    public int f130931e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48807b41)) {
            return false;
        }
        C48807b41 b412 = (C48807b41) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130930d), Integer.valueOf(b412.f130930d)) && C46238a.m51546a(Integer.valueOf(this.f130931e), Integer.valueOf(b412.f130931e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130930d);
            aVar.mo74318e(2, this.f130931e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f130930d) + 0 + C52418a.m58678e(2, this.f130931e);
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
                C48807b41 b412 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    b412.f130930d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    b412.f130931e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
