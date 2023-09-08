package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ix0 */
public class C64456ix0 extends C47465a {

    /* renamed from: d */
    public int f183745d;

    /* renamed from: e */
    public String f183746e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64456ix0)) {
            return false;
        }
        C64456ix0 ix02 = (C64456ix0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183745d), Integer.valueOf(ix02.f183745d)) && C46238a.m51546a(this.f183746e, ix02.f183746e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183745d);
            String str = this.f183746e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183745d) + 0;
            String str2 = this.f183746e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C64456ix0 ix02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ix02.f183745d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ix02.f183746e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
