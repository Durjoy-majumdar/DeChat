package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bh0 */
public class C64259bh0 extends C47465a {

    /* renamed from: d */
    public int f182286d;

    /* renamed from: e */
    public int f182287e;

    /* renamed from: f */
    public int f182288f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64259bh0)) {
            return false;
        }
        C64259bh0 bh02 = (C64259bh0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182286d), Integer.valueOf(bh02.f182286d)) && C46238a.m51546a(Integer.valueOf(this.f182287e), Integer.valueOf(bh02.f182287e)) && C46238a.m51546a(Integer.valueOf(this.f182288f), Integer.valueOf(bh02.f182288f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182286d);
            aVar.mo74318e(2, this.f182287e);
            aVar.mo74318e(3, this.f182288f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182286d) + 0 + C52418a.m58678e(2, this.f182287e) + C52418a.m58678e(3, this.f182288f);
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
                C64259bh0 bh02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    bh02.f182286d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    bh02.f182287e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    bh02.f182288f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
