package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xh0 */
public class C64829xh0 extends C47465a {

    /* renamed from: d */
    public C89349b f186300d;

    /* renamed from: e */
    public String f186301e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64829xh0)) {
            return false;
        }
        C64829xh0 xh02 = (C64829xh0) aVar;
        return C46238a.m51546a(this.f186300d, xh02.f186300d) && C46238a.m51546a(this.f186301e, xh02.f186301e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f186300d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            String str = this.f186301e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f186300d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            String str2 = this.f186301e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C64829xh0 xh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xh02.f186300d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                xh02.f186301e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
