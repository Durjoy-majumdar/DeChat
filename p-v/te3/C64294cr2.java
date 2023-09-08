package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cr2 */
public class C64294cr2 extends C47465a {

    /* renamed from: d */
    public int f182558d;

    /* renamed from: e */
    public int f182559e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64294cr2)) {
            return false;
        }
        C64294cr2 cr22 = (C64294cr2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182558d), Integer.valueOf(cr22.f182558d)) && C46238a.m51546a(Integer.valueOf(this.f182559e), Integer.valueOf(cr22.f182559e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182558d);
            aVar.mo74318e(2, this.f182559e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182558d) + 0 + C52418a.m58678e(2, this.f182559e);
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
                C64294cr2 cr22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cr22.f182558d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    cr22.f182559e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
