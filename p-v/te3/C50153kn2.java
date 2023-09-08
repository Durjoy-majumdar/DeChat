package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kn2 */
public class C50153kn2 extends C47465a {

    /* renamed from: d */
    public String f136896d;

    /* renamed from: e */
    public String f136897e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50153kn2)) {
            return false;
        }
        C50153kn2 kn22 = (C50153kn2) aVar;
        return C46238a.m51546a(this.f136896d, kn22.f136896d) && C46238a.m51546a(this.f136897e, kn22.f136897e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136896d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136897e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f136896d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f136897e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
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
            C50153kn2 kn22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kn22.f136896d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                kn22.f136897e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
