package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n31 */
public class C50489n31 extends C47465a {

    /* renamed from: d */
    public String f138365d;

    /* renamed from: e */
    public long f138366e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50489n31)) {
            return false;
        }
        C50489n31 n312 = (C50489n31) aVar;
        return C46238a.m51546a(this.f138365d, n312.f138365d) && C46238a.m51546a(Long.valueOf(this.f138366e), Long.valueOf(n312.f138366e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138365d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f138366e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f138365d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f138366e);
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
            C50489n31 n312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n312.f138365d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                n312.f138366e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
