package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.db0 */
public class C49119db0 extends C47465a {

    /* renamed from: d */
    public C89349b f132215d;

    /* renamed from: e */
    public int f132216e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49119db0)) {
            return false;
        }
        C49119db0 db02 = (C49119db0) aVar;
        return C46238a.m51546a(this.f132215d, db02.f132215d) && C46238a.m51546a(Integer.valueOf(this.f132216e), Integer.valueOf(db02.f132216e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f132215d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74318e(2, this.f132216e);
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f132215d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            return i2 + C52418a.m58678e(2, this.f132216e);
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
            C49119db0 db02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                db02.f132215d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                db02.f132216e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
