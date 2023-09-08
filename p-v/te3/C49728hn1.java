package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hn1 */
public class C49728hn1 extends C47465a {

    /* renamed from: d */
    public int f134747d;

    /* renamed from: e */
    public boolean f134748e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49728hn1)) {
            return false;
        }
        C49728hn1 hn12 = (C49728hn1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134747d), Integer.valueOf(hn12.f134747d)) && C46238a.m51546a(Boolean.valueOf(this.f134748e), Boolean.valueOf(hn12.f134748e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134747d);
            aVar.mo74314a(2, this.f134748e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f134747d) + 0 + C52418a.m58674a(2, this.f134748e);
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
                C49728hn1 hn12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    hn12.f134747d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    hn12.f134748e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
