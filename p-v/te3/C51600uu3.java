package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uu3 */
public class C51600uu3 extends C47465a {

    /* renamed from: d */
    public C89349b f143147d;

    /* renamed from: e */
    public int f143148e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51600uu3)) {
            return false;
        }
        C51600uu3 uu32 = (C51600uu3) aVar;
        return C46238a.m51546a(this.f143147d, uu32.f143147d) && C46238a.m51546a(Integer.valueOf(this.f143148e), Integer.valueOf(uu32.f143148e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f143147d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74318e(2, this.f143148e);
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f143147d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            return i2 + C52418a.m58678e(2, this.f143148e);
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
            C51600uu3 uu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uu32.f143147d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                uu32.f143148e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
