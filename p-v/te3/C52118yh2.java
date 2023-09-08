package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yh2 */
public class C52118yh2 extends C47465a {

    /* renamed from: d */
    public String f145303d;

    /* renamed from: e */
    public int f145304e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52118yh2)) {
            return false;
        }
        C52118yh2 yh22 = (C52118yh2) aVar;
        return C46238a.m51546a(this.f145303d, yh22.f145303d) && C46238a.m51546a(Integer.valueOf(this.f145304e), Integer.valueOf(yh22.f145304e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145303d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145304e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f145303d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f145304e);
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
            C52118yh2 yh22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yh22.f145303d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                yh22.f145304e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
