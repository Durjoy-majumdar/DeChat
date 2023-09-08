package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.ar2 */
public class C64241ar2 extends C47465a {

    /* renamed from: d */
    public int f182140d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C64241ar2) && C46238a.m51546a(Integer.valueOf(this.f182140d), Integer.valueOf(((C64241ar2) aVar).f182140d));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74318e(1, this.f182140d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182140d) + 0;
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
                C64241ar2 ar22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                ar22.f182140d = aVar2.mo141629g(intValue);
                return 0;
            }
        }
    }
}
