package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.au3 */
public class C64245au3 extends C47465a {

    /* renamed from: d */
    public int f182162d;

    /* renamed from: e */
    public int f182163e;

    /* renamed from: f */
    public int f182164f;

    /* renamed from: g */
    public int f182165g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64245au3)) {
            return false;
        }
        C64245au3 au32 = (C64245au3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182162d), Integer.valueOf(au32.f182162d)) && C46238a.m51546a(Integer.valueOf(this.f182163e), Integer.valueOf(au32.f182163e)) && C46238a.m51546a(Integer.valueOf(this.f182164f), Integer.valueOf(au32.f182164f)) && C46238a.m51546a(Integer.valueOf(this.f182165g), Integer.valueOf(au32.f182165g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182162d);
            aVar.mo74318e(2, this.f182163e);
            aVar.mo74318e(3, this.f182164f);
            aVar.mo74318e(4, this.f182165g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182162d) + 0 + C52418a.m58678e(2, this.f182163e) + C52418a.m58678e(3, this.f182164f) + C52418a.m58678e(4, this.f182165g);
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
                C64245au3 au32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    au32.f182162d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    au32.f182163e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    au32.f182164f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    au32.f182165g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
