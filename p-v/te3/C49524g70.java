package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g70 */
public class C49524g70 extends C47465a {

    /* renamed from: d */
    public long f133901d;

    /* renamed from: e */
    public long f133902e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49524g70)) {
            return false;
        }
        C49524g70 g702 = (C49524g70) aVar;
        return C46238a.m51546a(Long.valueOf(this.f133901d), Long.valueOf(g702.f133901d)) && C46238a.m51546a(Long.valueOf(this.f133902e), Long.valueOf(g702.f133902e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f133901d);
            aVar.mo74321h(2, this.f133902e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f133901d) + 0 + C52418a.m58681h(2, this.f133902e);
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
                C49524g70 g702 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    g702.f133901d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    g702.f133902e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
