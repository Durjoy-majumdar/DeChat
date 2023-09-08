package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zl3 */
public class C52281zl3 extends C47465a {

    /* renamed from: d */
    public int f146089d;

    /* renamed from: e */
    public long f146090e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52281zl3)) {
            return false;
        }
        C52281zl3 zl32 = (C52281zl3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146089d), Integer.valueOf(zl32.f146089d)) && C46238a.m51546a(Long.valueOf(this.f146090e), Long.valueOf(zl32.f146090e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146089d);
            aVar.mo74321h(2, this.f146090e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f146089d) + 0 + C52418a.m58681h(2, this.f146090e);
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
                C52281zl3 zl32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    zl32.f146089d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    zl32.f146090e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
