package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ug1 */
public class C51542ug1 extends C47465a {

    /* renamed from: d */
    public int f142847d;

    /* renamed from: e */
    public long f142848e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51542ug1)) {
            return false;
        }
        C51542ug1 ug12 = (C51542ug1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142847d), Integer.valueOf(ug12.f142847d)) && C46238a.m51546a(Long.valueOf(this.f142848e), Long.valueOf(ug12.f142848e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142847d);
            aVar.mo74321h(2, this.f142848e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142847d) + 0 + C52418a.m58681h(2, this.f142848e);
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
                C51542ug1 ug12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ug12.f142847d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ug12.f142848e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
