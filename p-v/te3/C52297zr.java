package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zr */
public class C52297zr extends C47465a {

    /* renamed from: d */
    public boolean f146185d;

    /* renamed from: e */
    public boolean f146186e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52297zr)) {
            return false;
        }
        C52297zr zrVar = (C52297zr) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f146185d), Boolean.valueOf(zrVar.f146185d)) && C46238a.m51546a(Boolean.valueOf(this.f146186e), Boolean.valueOf(zrVar.f146186e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f146185d);
            aVar.mo74314a(2, this.f146186e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f146185d) + 0 + C52418a.m58674a(2, this.f146186e);
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
                C52297zr zrVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    zrVar.f146185d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    zrVar.f146186e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}