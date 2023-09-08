package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class i54 extends C47465a {

    /* renamed from: d */
    public String f135120d;

    /* renamed from: e */
    public float f135121e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i54)) {
            return false;
        }
        i54 i54 = (i54) aVar;
        return C46238a.m51546a(this.f135120d, i54.f135120d) && C46238a.m51546a(Float.valueOf(this.f135121e), Float.valueOf(i54.f135121e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135120d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74317d(2, this.f135121e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f135120d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58677d(2, this.f135121e);
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
            i54 i54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i54.f135120d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                i54.f135121e = aVar3.mo141628f(intValue);
                return 0;
            }
        }
    }
}
