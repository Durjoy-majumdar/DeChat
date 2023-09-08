package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tf3 */
public class C51390tf3 extends C47465a {

    /* renamed from: d */
    public float f142199d;

    /* renamed from: e */
    public float f142200e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51390tf3)) {
            return false;
        }
        C51390tf3 tf32 = (C51390tf3) aVar;
        return C46238a.m51546a(Float.valueOf(this.f142199d), Float.valueOf(tf32.f142199d)) && C46238a.m51546a(Float.valueOf(this.f142200e), Float.valueOf(tf32.f142200e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f142199d);
            aVar.mo74317d(2, this.f142200e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f142199d) + 0 + C52418a.m58677d(2, this.f142200e);
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
                C51390tf3 tf32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tf32.f142199d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    tf32.f142200e = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
