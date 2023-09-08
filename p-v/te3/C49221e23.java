package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e23 */
public class C49221e23 extends C47465a {

    /* renamed from: d */
    public String f132646d;

    /* renamed from: e */
    public C89349b f132647e;

    /* renamed from: f */
    public boolean f132648f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49221e23)) {
            return false;
        }
        C49221e23 e232 = (C49221e23) aVar;
        return C46238a.m51546a(this.f132646d, e232.f132646d) && C46238a.m51546a(this.f132647e, e232.f132647e) && C46238a.m51546a(Boolean.valueOf(this.f132648f), Boolean.valueOf(e232.f132648f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132646d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C89349b bVar = this.f132647e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74314a(3, this.f132648f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f132646d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C89349b bVar2 = this.f132647e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58674a(3, this.f132648f);
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
            C49221e23 e232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e232.f132646d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e232.f132647e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                e232.f132648f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
