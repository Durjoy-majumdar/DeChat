package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z55 extends C47465a {

    /* renamed from: d */
    public boolean f186627d;

    /* renamed from: e */
    public boolean f186628e;

    /* renamed from: f */
    public int f186629f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z55)) {
            return false;
        }
        z55 z55 = (z55) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f186627d), Boolean.valueOf(z55.f186627d)) && C46238a.m51546a(Boolean.valueOf(this.f186628e), Boolean.valueOf(z55.f186628e)) && C46238a.m51546a(Integer.valueOf(this.f186629f), Integer.valueOf(z55.f186629f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f186627d);
            aVar.mo74314a(2, this.f186628e);
            aVar.mo74318e(3, this.f186629f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f186627d) + 0 + C52418a.m58674a(2, this.f186628e) + C52418a.m58678e(3, this.f186629f);
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
                z55 z55 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    z55.f186627d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    z55.f186628e = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    z55.f186629f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
