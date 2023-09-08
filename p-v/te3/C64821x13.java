package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x13 */
public class C64821x13 extends C47465a {

    /* renamed from: d */
    public String f186251d;

    /* renamed from: e */
    public String f186252e;

    /* renamed from: f */
    public String f186253f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64821x13)) {
            return false;
        }
        C64821x13 x132 = (C64821x13) aVar;
        return C46238a.m51546a(this.f186251d, x132.f186251d) && C46238a.m51546a(this.f186252e, x132.f186252e) && C46238a.m51546a(this.f186253f, x132.f186253f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186251d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186252e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186253f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f186251d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f186252e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f186253f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
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
            C64821x13 x132 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x132.f186251d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                x132.f186252e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x132.f186253f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
