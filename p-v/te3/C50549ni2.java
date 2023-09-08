package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ni2 */
public class C50549ni2 extends C47465a {

    /* renamed from: d */
    public int f138615d;

    /* renamed from: e */
    public int f138616e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50549ni2)) {
            return false;
        }
        C50549ni2 ni22 = (C50549ni2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138615d), Integer.valueOf(ni22.f138615d)) && C46238a.m51546a(Integer.valueOf(this.f138616e), Integer.valueOf(ni22.f138616e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138615d);
            aVar.mo74318e(2, this.f138616e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f138615d) + 0 + C52418a.m58678e(2, this.f138616e);
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
                C50549ni2 ni22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ni22.f138615d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ni22.f138616e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
