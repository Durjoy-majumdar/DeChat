package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: pv0.i */
public class C62561i extends C47465a {

    /* renamed from: d */
    public long f177692d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C62561i) && C46238a.m51546a(Long.valueOf(this.f177692d), Long.valueOf(((C62561i) aVar).f177692d));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74321h(1, this.f177692d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f177692d) + 0;
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
                C62561i iVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                iVar.f177692d = aVar2.mo141631i(intValue);
                return 0;
            }
        }
    }
}
