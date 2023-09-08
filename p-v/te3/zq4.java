package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zq4 extends C47465a {

    /* renamed from: d */
    public int f186837d;

    /* renamed from: e */
    public int f186838e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zq4)) {
            return false;
        }
        zq4 zq4 = (zq4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186837d), Integer.valueOf(zq4.f186837d)) && C46238a.m51546a(Integer.valueOf(this.f186838e), Integer.valueOf(zq4.f186838e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186837d);
            aVar.mo74318e(2, this.f186838e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f186837d) + 0 + C52418a.m58678e(2, this.f186838e);
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
                zq4 zq4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    zq4.f186837d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    zq4.f186838e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
