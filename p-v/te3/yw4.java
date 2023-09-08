package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yw4 extends C47465a {

    /* renamed from: d */
    public boolean f145551d;

    /* renamed from: e */
    public String f145552e;

    /* renamed from: f */
    public String f145553f;

    /* renamed from: g */
    public int f145554g;

    /* renamed from: h */
    public int f145555h;

    /* renamed from: i */
    public int f145556i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yw4)) {
            return false;
        }
        yw4 yw4 = (yw4) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f145551d), Boolean.valueOf(yw4.f145551d)) && C46238a.m51546a(this.f145552e, yw4.f145552e) && C46238a.m51546a(this.f145553f, yw4.f145553f) && C46238a.m51546a(Integer.valueOf(this.f145554g), Integer.valueOf(yw4.f145554g)) && C46238a.m51546a(Integer.valueOf(this.f145555h), Integer.valueOf(yw4.f145555h)) && C46238a.m51546a(Integer.valueOf(this.f145556i), Integer.valueOf(yw4.f145556i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f145551d);
            String str = this.f145552e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145553f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f145554g);
            aVar.mo74318e(5, this.f145555h);
            aVar.mo74318e(6, this.f145556i);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f145551d) + 0;
            String str3 = this.f145552e;
            if (str3 != null) {
                a += C52418a.m58683j(2, str3);
            }
            String str4 = this.f145553f;
            if (str4 != null) {
                a += C52418a.m58683j(3, str4);
            }
            return a + C52418a.m58678e(4, this.f145554g) + C52418a.m58678e(5, this.f145555h) + C52418a.m58678e(6, this.f145556i);
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
            yw4 yw4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yw4.f145551d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    yw4.f145552e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yw4.f145553f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yw4.f145554g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yw4.f145555h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yw4.f145556i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
