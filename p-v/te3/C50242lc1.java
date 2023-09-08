package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lc1 */
public class C50242lc1 extends C47465a {

    /* renamed from: d */
    public String f137297d;

    /* renamed from: e */
    public String f137298e;

    /* renamed from: f */
    public String f137299f;

    /* renamed from: g */
    public String f137300g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50242lc1)) {
            return false;
        }
        C50242lc1 lc12 = (C50242lc1) aVar;
        return C46238a.m51546a(this.f137297d, lc12.f137297d) && C46238a.m51546a(this.f137298e, lc12.f137298e) && C46238a.m51546a(this.f137299f, lc12.f137299f) && C46238a.m51546a(this.f137300g, lc12.f137300g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137297d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137298e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137299f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f137300g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f137297d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f137298e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f137299f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f137300g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C50242lc1 lc12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lc12.f137297d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lc12.f137298e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                lc12.f137299f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lc12.f137300g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
