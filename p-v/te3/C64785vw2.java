package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vw2 */
public class C64785vw2 extends C47465a {

    /* renamed from: d */
    public String f185994d;

    /* renamed from: e */
    public String f185995e;

    /* renamed from: f */
    public boolean f185996f;

    /* renamed from: g */
    public boolean f185997g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64785vw2)) {
            return false;
        }
        C64785vw2 vw22 = (C64785vw2) aVar;
        return C46238a.m51546a(this.f185994d, vw22.f185994d) && C46238a.m51546a(this.f185995e, vw22.f185995e) && C46238a.m51546a(Boolean.valueOf(this.f185996f), Boolean.valueOf(vw22.f185996f)) && C46238a.m51546a(Boolean.valueOf(this.f185997g), Boolean.valueOf(vw22.f185997g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185994d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185995e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f185996f);
            aVar.mo74314a(4, this.f185997g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f185994d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185995e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f185996f) + C52418a.m58674a(4, this.f185997g);
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
            C64785vw2 vw22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vw22.f185994d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vw22.f185995e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vw22.f185996f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                vw22.f185997g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
