package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jv2 */
public class C50043jv2 extends C47465a {

    /* renamed from: d */
    public int f136353d;

    /* renamed from: e */
    public int f136354e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50043jv2)) {
            return false;
        }
        C50043jv2 jv22 = (C50043jv2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136353d), Integer.valueOf(jv22.f136353d)) && C46238a.m51546a(Integer.valueOf(this.f136354e), Integer.valueOf(jv22.f136354e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136353d);
            aVar.mo74318e(2, this.f136354e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136353d) + 0 + C52418a.m58678e(2, this.f136354e);
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
                C50043jv2 jv22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jv22.f136353d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    jv22.f136354e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
