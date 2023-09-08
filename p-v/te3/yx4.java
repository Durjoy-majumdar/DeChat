package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yx4 extends C47465a {

    /* renamed from: d */
    public String f145566d;

    /* renamed from: e */
    public int f145567e;

    /* renamed from: f */
    public int f145568f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yx4)) {
            return false;
        }
        yx4 yx4 = (yx4) aVar;
        return C46238a.m51546a(this.f145566d, yx4.f145566d) && C46238a.m51546a(Integer.valueOf(this.f145567e), Integer.valueOf(yx4.f145567e)) && C46238a.m51546a(Integer.valueOf(this.f145568f), Integer.valueOf(yx4.f145568f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145566d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145567e);
            aVar.mo74318e(3, this.f145568f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f145566d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f145567e) + C52418a.m58678e(3, this.f145568f);
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
            yx4 yx4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yx4.f145566d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                yx4.f145567e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                yx4.f145568f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
