package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yx2 */
public class C64868yx2 extends C47465a {

    /* renamed from: d */
    public String f186609d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C64868yx2) && C46238a.m51546a(this.f186609d, ((C64868yx2) aVar).f186609d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186609d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f186609d;
            if (str2 != null) {
                return 0 + C52418a.m58683j(1, str2);
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
            C64868yx2 yx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            yx22.f186609d = aVar3.mo141633k(intValue);
            return 0;
        }
    }
}
