package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b35 extends C47465a {

    /* renamed from: d */
    public int f130928d;

    /* renamed from: e */
    public String f130929e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b35)) {
            return false;
        }
        b35 b35 = (b35) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130928d), Integer.valueOf(b35.f130928d)) && C46238a.m51546a(this.f130929e, b35.f130929e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130928d);
            String str = this.f130929e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130928d) + 0;
            String str2 = this.f130929e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            b35 b35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b35.f130928d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                b35.f130929e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
