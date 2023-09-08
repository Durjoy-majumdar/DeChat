package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vi1 */
public class C51697vi1 extends C47465a {

    /* renamed from: d */
    public long f143490d;

    /* renamed from: e */
    public int f143491e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51697vi1)) {
            return false;
        }
        C51697vi1 vi12 = (C51697vi1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f143490d), Long.valueOf(vi12.f143490d)) && C46238a.m51546a(Integer.valueOf(this.f143491e), Integer.valueOf(vi12.f143491e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f143490d);
            aVar.mo74318e(2, this.f143491e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f143490d) + 0 + C52418a.m58678e(2, this.f143491e);
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
                C51697vi1 vi12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vi12.f143490d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    vi12.f143491e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
