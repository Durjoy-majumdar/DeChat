package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uz3 */
public class C64762uz3 extends C47465a {

    /* renamed from: d */
    public String f185811d;

    /* renamed from: e */
    public String f185812e;

    /* renamed from: f */
    public String f185813f;

    /* renamed from: g */
    public int f185814g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64762uz3)) {
            return false;
        }
        C64762uz3 uz32 = (C64762uz3) aVar;
        return C46238a.m51546a(this.f185811d, uz32.f185811d) && C46238a.m51546a(this.f185812e, uz32.f185812e) && C46238a.m51546a(this.f185813f, uz32.f185813f) && C46238a.m51546a(Integer.valueOf(this.f185814g), Integer.valueOf(uz32.f185814g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185811d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185812e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185813f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f185814g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f185811d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185812e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f185813f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f185814g);
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
            C64762uz3 uz32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uz32.f185811d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                uz32.f185812e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                uz32.f185813f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                uz32.f185814g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
