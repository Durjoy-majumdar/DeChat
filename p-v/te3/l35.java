package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class l35 extends C47465a {

    /* renamed from: d */
    public boolean f137158d;

    /* renamed from: e */
    public boolean f137159e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof l35)) {
            return false;
        }
        l35 l35 = (l35) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f137158d), Boolean.valueOf(l35.f137158d)) && C46238a.m51546a(Boolean.valueOf(this.f137159e), Boolean.valueOf(l35.f137159e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f137158d);
            aVar.mo74314a(2, this.f137159e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f137158d) + 0 + C52418a.m58674a(2, this.f137159e);
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
                l35 l35 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    l35.f137158d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    l35.f137159e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
