package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w42 */
public class C51783w42 extends C47465a {

    /* renamed from: d */
    public String f143854d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51783w42) && C46238a.m51546a(this.f143854d, ((C51783w42) aVar).f143854d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143854d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f143854d;
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
            C51783w42 w422 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            w422.f143854d = aVar3.mo141633k(intValue);
            return 0;
        }
    }
}
