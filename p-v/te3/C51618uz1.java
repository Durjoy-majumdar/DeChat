package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uz1 */
public class C51618uz1 extends C47465a {

    /* renamed from: d */
    public String f143199d;

    /* renamed from: e */
    public int f143200e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51618uz1)) {
            return false;
        }
        C51618uz1 uz12 = (C51618uz1) aVar;
        return C46238a.m51546a(this.f143199d, uz12.f143199d) && C46238a.m51546a(Integer.valueOf(this.f143200e), Integer.valueOf(uz12.f143200e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143199d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f143200e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ProductID");
        } else if (i == 1) {
            String str2 = this.f143199d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f143200e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143199d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ProductID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51618uz1 uz12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uz12.f143199d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                uz12.f143200e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
