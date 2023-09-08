package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x72 */
public class C51935x72 extends C47465a {

    /* renamed from: d */
    public int f144504d;

    /* renamed from: e */
    public int f144505e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51935x72)) {
            return false;
        }
        C51935x72 x722 = (C51935x72) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144504d), Integer.valueOf(x722.f144504d)) && C46238a.m51546a(Integer.valueOf(this.f144505e), Integer.valueOf(x722.f144505e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144504d);
            aVar.mo74318e(2, this.f144505e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f144504d) + 0 + C52418a.m58678e(2, this.f144505e);
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
                C51935x72 x722 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    x722.f144504d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    x722.f144505e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
