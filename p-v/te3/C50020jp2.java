package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jp2 */
public class C50020jp2 extends C47465a {

    /* renamed from: d */
    public String f136240d;

    /* renamed from: e */
    public String f136241e;

    /* renamed from: f */
    public int f136242f;

    /* renamed from: g */
    public String f136243g;

    /* renamed from: h */
    public int f136244h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50020jp2)) {
            return false;
        }
        C50020jp2 jp22 = (C50020jp2) aVar;
        return C46238a.m51546a(this.f136240d, jp22.f136240d) && C46238a.m51546a(this.f136241e, jp22.f136241e) && C46238a.m51546a(Integer.valueOf(this.f136242f), Integer.valueOf(jp22.f136242f)) && C46238a.m51546a(this.f136243g, jp22.f136243g) && C46238a.m51546a(Integer.valueOf(this.f136244h), Integer.valueOf(jp22.f136244h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136240d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136241e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f136242f);
            String str3 = this.f136243g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f136244h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f136240d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f136241e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f136242f);
            String str6 = this.f136243g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f136244h);
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
            C50020jp2 jp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jp22.f136240d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                jp22.f136241e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                jp22.f136242f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                jp22.f136243g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                jp22.f136244h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
