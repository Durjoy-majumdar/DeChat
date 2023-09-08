package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tg1 */
public class C51393tg1 extends C47465a {

    /* renamed from: d */
    public int f142211d;

    /* renamed from: e */
    public int f142212e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51393tg1)) {
            return false;
        }
        C51393tg1 tg12 = (C51393tg1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142211d), Integer.valueOf(tg12.f142211d)) && C46238a.m51546a(Integer.valueOf(this.f142212e), Integer.valueOf(tg12.f142212e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142211d);
            aVar.mo74318e(2, this.f142212e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142211d) + 0 + C52418a.m58678e(2, this.f142212e);
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
                C51393tg1 tg12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tg12.f142211d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    tg12.f142212e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
