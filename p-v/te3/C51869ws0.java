package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ws0 */
public class C51869ws0 extends C47465a {

    /* renamed from: d */
    public int f144240d;

    /* renamed from: e */
    public long f144241e;

    /* renamed from: f */
    public int f144242f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51869ws0)) {
            return false;
        }
        C51869ws0 ws02 = (C51869ws0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144240d), Integer.valueOf(ws02.f144240d)) && C46238a.m51546a(Long.valueOf(this.f144241e), Long.valueOf(ws02.f144241e)) && C46238a.m51546a(Integer.valueOf(this.f144242f), Integer.valueOf(ws02.f144242f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144240d);
            aVar.mo74321h(2, this.f144241e);
            aVar.mo74318e(3, this.f144242f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f144240d) + 0 + C52418a.m58681h(2, this.f144241e) + C52418a.m58678e(3, this.f144242f);
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
                C51869ws0 ws02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ws02.f144240d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ws02.f144241e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    ws02.f144242f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
