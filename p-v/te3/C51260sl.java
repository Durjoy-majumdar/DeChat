package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sl */
public class C51260sl extends C47465a {

    /* renamed from: d */
    public int f141581d;

    /* renamed from: e */
    public long f141582e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51260sl)) {
            return false;
        }
        C51260sl slVar = (C51260sl) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141581d), Integer.valueOf(slVar.f141581d)) && C46238a.m51546a(Long.valueOf(this.f141582e), Long.valueOf(slVar.f141582e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141581d);
            aVar.mo74321h(2, this.f141582e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f141581d) + 0 + C52418a.m58681h(2, this.f141582e);
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
                C51260sl slVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    slVar.f141581d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    slVar.f141582e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
