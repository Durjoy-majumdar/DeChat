package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

public class p54 extends C47465a {

    /* renamed from: d */
    public long f139592d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof p54) && C46238a.m51546a(Long.valueOf(this.f139592d), Long.valueOf(((p54) aVar).f139592d));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74321h(1, this.f139592d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f139592d) + 0;
        } else {
            if (i == 2) {
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                p54 p54 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                p54.f139592d = aVar2.mo141631i(intValue);
                return 0;
            }
        }
    }
}