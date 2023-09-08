package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ld1 */
public class C50247ld1 extends C47465a {

    /* renamed from: d */
    public C89349b f137314d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50247ld1) && C46238a.m51546a(this.f137314d, ((C50247ld1) aVar).f137314d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f137314d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f137314d;
            if (bVar2 != null) {
                return 0 + C52418a.m58675b(1, bVar2);
            }
            return 0;
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
            C50247ld1 ld12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            ld12.f137314d = aVar3.mo141626d(intValue);
            return 0;
        }
    }
}
