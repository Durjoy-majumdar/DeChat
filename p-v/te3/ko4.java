package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ko4 extends C47465a {

    /* renamed from: d */
    public int f136919d;

    /* renamed from: e */
    public String f136920e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ko4)) {
            return false;
        }
        ko4 ko4 = (ko4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136919d), Integer.valueOf(ko4.f136919d)) && C46238a.m51546a(this.f136920e, ko4.f136920e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136919d);
            String str = this.f136920e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136919d) + 0;
            String str2 = this.f136920e;
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
            ko4 ko4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ko4.f136919d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ko4.f136920e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
