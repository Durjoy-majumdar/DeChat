package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.go3 */
public class C49588go3 extends C47465a {

    /* renamed from: d */
    public int f134177d;

    /* renamed from: e */
    public int f134178e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49588go3)) {
            return false;
        }
        C49588go3 go32 = (C49588go3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134177d), Integer.valueOf(go32.f134177d)) && C46238a.m51546a(Integer.valueOf(this.f134178e), Integer.valueOf(go32.f134178e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134177d);
            aVar.mo74318e(2, this.f134178e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f134177d) + 0 + C52418a.m58678e(2, this.f134178e);
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
                C49588go3 go32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    go32.f134177d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    go32.f134178e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
