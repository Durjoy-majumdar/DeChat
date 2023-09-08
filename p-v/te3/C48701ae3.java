package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ae3 */
public class C48701ae3 extends C47465a {

    /* renamed from: d */
    public String f130472d;

    /* renamed from: e */
    public long f130473e;

    /* renamed from: f */
    public int f130474f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48701ae3)) {
            return false;
        }
        C48701ae3 ae32 = (C48701ae3) aVar;
        return C46238a.m51546a(this.f130472d, ae32.f130472d) && C46238a.m51546a(Long.valueOf(this.f130473e), Long.valueOf(ae32.f130473e)) && C46238a.m51546a(Integer.valueOf(this.f130474f), Integer.valueOf(ae32.f130474f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130472d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f130473e);
            aVar.mo74318e(3, this.f130474f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f130472d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f130473e) + C52418a.m58678e(3, this.f130474f);
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
            C48701ae3 ae32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ae32.f130472d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ae32.f130473e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ae32.f130474f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
