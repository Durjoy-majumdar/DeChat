package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lw2 */
public class C50319lw2 extends C47465a {

    /* renamed from: d */
    public String f137680d;

    /* renamed from: e */
    public String f137681e;

    /* renamed from: f */
    public int f137682f;

    /* renamed from: g */
    public boolean f137683g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50319lw2)) {
            return false;
        }
        C50319lw2 lw22 = (C50319lw2) aVar;
        return C46238a.m51546a(this.f137680d, lw22.f137680d) && C46238a.m51546a(this.f137681e, lw22.f137681e) && C46238a.m51546a(Integer.valueOf(this.f137682f), Integer.valueOf(lw22.f137682f)) && C46238a.m51546a(Boolean.valueOf(this.f137683g), Boolean.valueOf(lw22.f137683g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137680d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137681e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f137682f);
            aVar.mo74314a(4, this.f137683g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f137680d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f137681e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f137682f) + C52418a.m58674a(4, this.f137683g);
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
            C50319lw2 lw22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lw22.f137680d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lw22.f137681e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                lw22.f137682f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lw22.f137683g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
