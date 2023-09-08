package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.po3 */
public class C64635po3 extends C47465a {

    /* renamed from: d */
    public String f184868d;

    /* renamed from: e */
    public String f184869e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64635po3)) {
            return false;
        }
        C64635po3 po32 = (C64635po3) aVar;
        return C46238a.m51546a(this.f184868d, po32.f184868d) && C46238a.m51546a(this.f184869e, po32.f184869e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184868d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184869e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f184868d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f184869e;
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
            C64635po3 po32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                po32.f184868d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                po32.f184869e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
