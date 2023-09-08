package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d44 extends C47465a {

    /* renamed from: d */
    public String f132109d;

    /* renamed from: e */
    public int f132110e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d44)) {
            return false;
        }
        d44 d44 = (d44) aVar;
        return C46238a.m51546a(this.f132109d, d44.f132109d) && C46238a.m51546a(Integer.valueOf(this.f132110e), Integer.valueOf(d44.f132110e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132109d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132110e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f132109d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f132110e);
        } else if (i == 2) {
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
            d44 d44 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d44.f132109d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                d44.f132110e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
