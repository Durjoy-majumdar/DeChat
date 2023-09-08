package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cc0 */
public class C64282cc0 extends C47465a {

    /* renamed from: d */
    public String f182459d;

    /* renamed from: e */
    public String f182460e;

    /* renamed from: f */
    public String f182461f;

    /* renamed from: g */
    public int f182462g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64282cc0)) {
            return false;
        }
        C64282cc0 cc02 = (C64282cc0) aVar;
        return C46238a.m51546a(this.f182459d, cc02.f182459d) && C46238a.m51546a(this.f182460e, cc02.f182460e) && C46238a.m51546a(this.f182461f, cc02.f182461f) && C46238a.m51546a(Integer.valueOf(this.f182462g), Integer.valueOf(cc02.f182462g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182459d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: wording");
            } else if (this.f182460e == null) {
                throw new C52419b("Not all required fields were included: url");
            } else if (this.f182461f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f182460e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f182461f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74318e(4, this.f182462g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: url_wording");
            }
        } else if (i == 1) {
            String str4 = this.f182459d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f182460e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f182461f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f182462g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182459d == null) {
                throw new C52419b("Not all required fields were included: wording");
            } else if (this.f182460e == null) {
                throw new C52419b("Not all required fields were included: url");
            } else if (this.f182461f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: url_wording");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64282cc0 cc02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cc02.f182459d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cc02.f182460e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cc02.f182461f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cc02.f182462g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
