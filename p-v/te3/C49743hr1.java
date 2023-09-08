package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hr1 */
public class C49743hr1 extends C47465a {

    /* renamed from: d */
    public String f134826d;

    /* renamed from: e */
    public String f134827e;

    /* renamed from: f */
    public String f134828f;

    /* renamed from: g */
    public String f134829g;

    /* renamed from: h */
    public String f134830h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49743hr1)) {
            return false;
        }
        C49743hr1 hr12 = (C49743hr1) aVar;
        return C46238a.m51546a(this.f134826d, hr12.f134826d) && C46238a.m51546a(this.f134827e, hr12.f134827e) && C46238a.m51546a(this.f134828f, hr12.f134828f) && C46238a.m51546a(this.f134829g, hr12.f134829g) && C46238a.m51546a(this.f134830h, hr12.f134830h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134826d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134827e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134828f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f134829g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f134830h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f134826d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f134827e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f134828f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f134829g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f134830h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C49743hr1 hr12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hr12.f134826d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hr12.f134827e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hr12.f134828f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                hr12.f134829g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                hr12.f134830h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
