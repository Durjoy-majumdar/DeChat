package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z50 */
public class C52219z50 extends C47465a {

    /* renamed from: d */
    public long f145706d;

    /* renamed from: e */
    public long f145707e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52219z50)) {
            return false;
        }
        C52219z50 z502 = (C52219z50) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145706d), Long.valueOf(z502.f145706d)) && C46238a.m51546a(Long.valueOf(this.f145707e), Long.valueOf(z502.f145707e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145706d);
            aVar.mo74321h(2, this.f145707e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f145706d) + 0 + C52418a.m58681h(2, this.f145707e);
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
                C52219z50 z502 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    z502.f145706d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    z502.f145707e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
