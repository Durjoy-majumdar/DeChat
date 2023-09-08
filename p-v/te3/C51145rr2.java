package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rr2 */
public class C51145rr2 extends C47465a {

    /* renamed from: d */
    public String f141096d;

    /* renamed from: e */
    public String f141097e;

    /* renamed from: f */
    public String f141098f;

    /* renamed from: g */
    public int f141099g;

    /* renamed from: h */
    public boolean f141100h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51145rr2)) {
            return false;
        }
        C51145rr2 rr22 = (C51145rr2) aVar;
        return C46238a.m51546a(this.f141096d, rr22.f141096d) && C46238a.m51546a(this.f141097e, rr22.f141097e) && C46238a.m51546a(this.f141098f, rr22.f141098f) && C46238a.m51546a(Integer.valueOf(this.f141099g), Integer.valueOf(rr22.f141099g)) && C46238a.m51546a(Boolean.valueOf(this.f141100h), Boolean.valueOf(rr22.f141100h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141096d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141097e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141098f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f141099g);
            aVar.mo74314a(5, this.f141100h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f141096d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f141097e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f141098f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f141099g) + C52418a.m58674a(5, this.f141100h);
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
            C51145rr2 rr22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rr22.f141096d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rr22.f141097e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rr22.f141098f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                rr22.f141099g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                rr22.f141100h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
