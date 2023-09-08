package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.l */
public class C47617l extends C47465a {

    /* renamed from: d */
    public int f127845d;

    /* renamed from: e */
    public int f127846e;

    /* renamed from: f */
    public int f127847f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47617l)) {
            return false;
        }
        C47617l lVar = (C47617l) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127845d), Integer.valueOf(lVar.f127845d)) && C46238a.m51546a(Integer.valueOf(this.f127846e), Integer.valueOf(lVar.f127846e)) && C46238a.m51546a(Integer.valueOf(this.f127847f), Integer.valueOf(lVar.f127847f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127845d);
            aVar.mo74318e(2, this.f127846e);
            aVar.mo74318e(3, this.f127847f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f127845d) + 0 + C52418a.m58678e(2, this.f127846e) + C52418a.m58678e(3, this.f127847f);
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
                C47617l lVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    lVar.f127845d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    lVar.f127846e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    lVar.f127847f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
