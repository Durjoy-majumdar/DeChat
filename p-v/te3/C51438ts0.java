package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ts0 */
public class C51438ts0 extends C47465a {

    /* renamed from: d */
    public boolean f142380d = false;

    /* renamed from: e */
    public String f142381e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51438ts0)) {
            return false;
        }
        C51438ts0 ts02 = (C51438ts0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f142380d), Boolean.valueOf(ts02.f142380d)) && C46238a.m51546a(this.f142381e, ts02.f142381e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f142380d);
            String str = this.f142381e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f142380d) + 0;
            String str2 = this.f142381e;
            return str2 != null ? a + C52418a.m58683j(2, str2) : a;
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
            C51438ts0 ts02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ts02.f142380d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ts02.f142381e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
