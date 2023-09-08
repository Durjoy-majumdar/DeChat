package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g50 */
public class C49515g50 extends C47465a {

    /* renamed from: d */
    public int f133855d;

    /* renamed from: e */
    public int f133856e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49515g50)) {
            return false;
        }
        C49515g50 g502 = (C49515g50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133855d), Integer.valueOf(g502.f133855d)) && C46238a.m51546a(Integer.valueOf(this.f133856e), Integer.valueOf(g502.f133856e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133855d);
            aVar.mo74318e(2, this.f133856e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f133855d) + 0 + C52418a.m58678e(2, this.f133856e);
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
                C49515g50 g502 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    g502.f133855d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    g502.f133856e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
