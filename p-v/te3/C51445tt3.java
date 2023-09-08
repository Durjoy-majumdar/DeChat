package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tt3 */
public class C51445tt3 extends C47465a {

    /* renamed from: d */
    public int f142405d;

    /* renamed from: e */
    public int f142406e;

    /* renamed from: f */
    public int f142407f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51445tt3)) {
            return false;
        }
        C51445tt3 tt32 = (C51445tt3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142405d), Integer.valueOf(tt32.f142405d)) && C46238a.m51546a(Integer.valueOf(this.f142406e), Integer.valueOf(tt32.f142406e)) && C46238a.m51546a(Integer.valueOf(this.f142407f), Integer.valueOf(tt32.f142407f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142405d);
            aVar.mo74318e(2, this.f142406e);
            aVar.mo74318e(3, this.f142407f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142405d) + 0 + C52418a.m58678e(2, this.f142406e) + C52418a.m58678e(3, this.f142407f);
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
                C51445tt3 tt32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tt32.f142405d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    tt32.f142406e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    tt32.f142407f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
