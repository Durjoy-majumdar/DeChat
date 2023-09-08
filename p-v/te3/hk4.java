package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class hk4 extends C47465a {

    /* renamed from: d */
    public String f134708d;

    /* renamed from: e */
    public String f134709e;

    /* renamed from: f */
    public int f134710f;

    /* renamed from: g */
    public String f134711g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hk4)) {
            return false;
        }
        hk4 hk4 = (hk4) aVar;
        return C46238a.m51546a(this.f134708d, hk4.f134708d) && C46238a.m51546a(this.f134709e, hk4.f134709e) && C46238a.m51546a(Integer.valueOf(this.f134710f), Integer.valueOf(hk4.f134710f)) && C46238a.m51546a(this.f134711g, hk4.f134711g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134708d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134709e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f134710f);
            String str3 = this.f134711g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f134708d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f134709e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f134710f);
            String str6 = this.f134711g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            hk4 hk4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hk4.f134708d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hk4.f134709e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hk4.f134710f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hk4.f134711g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
