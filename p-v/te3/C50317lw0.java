package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lw0 */
public class C50317lw0 extends C47465a {

    /* renamed from: d */
    public int f137676d;

    /* renamed from: e */
    public String f137677e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50317lw0)) {
            return false;
        }
        C50317lw0 lw02 = (C50317lw0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137676d), Integer.valueOf(lw02.f137676d)) && C46238a.m51546a(this.f137677e, lw02.f137677e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137676d);
            String str = this.f137677e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137676d) + 0;
            String str2 = this.f137677e;
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
            C50317lw0 lw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lw02.f137676d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                lw02.f137677e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
