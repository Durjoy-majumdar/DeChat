package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m41 */
public class C50351m41 extends C47465a {

    /* renamed from: d */
    public int f137829d;

    /* renamed from: e */
    public int f137830e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50351m41)) {
            return false;
        }
        C50351m41 m412 = (C50351m41) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137829d), Integer.valueOf(m412.f137829d)) && C46238a.m51546a(Integer.valueOf(this.f137830e), Integer.valueOf(m412.f137830e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137829d);
            aVar.mo74318e(2, this.f137830e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f137829d) + 0 + C52418a.m58678e(2, this.f137830e);
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
                C50351m41 m412 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    m412.f137829d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    m412.f137830e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
