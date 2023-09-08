package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fl1 */
public class C49439fl1 extends C47465a {

    /* renamed from: d */
    public long f133577d;

    /* renamed from: e */
    public int f133578e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49439fl1)) {
            return false;
        }
        C49439fl1 fl12 = (C49439fl1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f133577d), Long.valueOf(fl12.f133577d)) && C46238a.m51546a(Integer.valueOf(this.f133578e), Integer.valueOf(fl12.f133578e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f133577d);
            aVar.mo74318e(2, this.f133578e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f133577d) + 0 + C52418a.m58678e(2, this.f133578e);
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
                C49439fl1 fl12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    fl12.f133577d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    fl12.f133578e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
