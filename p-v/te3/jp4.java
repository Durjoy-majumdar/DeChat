package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class jp4 extends C47465a {

    /* renamed from: d */
    public int f136245d;

    /* renamed from: e */
    public int f136246e;

    /* renamed from: f */
    public int f136247f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jp4)) {
            return false;
        }
        jp4 jp4 = (jp4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136245d), Integer.valueOf(jp4.f136245d)) && C46238a.m51546a(Integer.valueOf(this.f136246e), Integer.valueOf(jp4.f136246e)) && C46238a.m51546a(Integer.valueOf(this.f136247f), Integer.valueOf(jp4.f136247f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136245d);
            aVar.mo74318e(2, this.f136246e);
            aVar.mo74318e(3, this.f136247f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136245d) + 0 + C52418a.m58678e(2, this.f136246e) + C52418a.m58678e(3, this.f136247f);
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
                jp4 jp4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jp4.f136245d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    jp4.f136246e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    jp4.f136247f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
