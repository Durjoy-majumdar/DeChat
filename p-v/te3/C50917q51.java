package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q51 */
public class C50917q51 extends C47465a {

    /* renamed from: d */
    public boolean f140152d;

    /* renamed from: e */
    public int f140153e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50917q51)) {
            return false;
        }
        C50917q51 q512 = (C50917q51) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f140152d), Boolean.valueOf(q512.f140152d)) && C46238a.m51546a(Integer.valueOf(this.f140153e), Integer.valueOf(q512.f140153e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f140152d);
            aVar.mo74318e(2, this.f140153e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f140152d) + 0 + C52418a.m58678e(2, this.f140153e);
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
                C50917q51 q512 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    q512.f140152d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    q512.f140153e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
