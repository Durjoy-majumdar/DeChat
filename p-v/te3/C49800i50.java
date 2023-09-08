package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i50 */
public class C49800i50 extends C47465a {

    /* renamed from: d */
    public int f135107d;

    /* renamed from: e */
    public int f135108e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49800i50)) {
            return false;
        }
        C49800i50 i502 = (C49800i50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135107d), Integer.valueOf(i502.f135107d)) && C46238a.m51546a(Integer.valueOf(this.f135108e), Integer.valueOf(i502.f135108e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135107d);
            aVar.mo74318e(2, this.f135108e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135107d) + 0 + C52418a.m58678e(2, this.f135108e);
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
                C49800i50 i502 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    i502.f135107d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    i502.f135108e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
