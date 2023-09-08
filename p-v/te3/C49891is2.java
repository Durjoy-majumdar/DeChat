package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.is2 */
public class C49891is2 extends C47465a {

    /* renamed from: d */
    public String f135638d;

    /* renamed from: e */
    public String f135639e;

    /* renamed from: f */
    public String f135640f;

    /* renamed from: g */
    public int f135641g;

    /* renamed from: h */
    public String f135642h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49891is2)) {
            return false;
        }
        C49891is2 is22 = (C49891is2) aVar;
        return C46238a.m51546a(this.f135638d, is22.f135638d) && C46238a.m51546a(this.f135639e, is22.f135639e) && C46238a.m51546a(this.f135640f, is22.f135640f) && C46238a.m51546a(Integer.valueOf(this.f135641g), Integer.valueOf(is22.f135641g)) && C46238a.m51546a(this.f135642h, is22.f135642h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135638d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135639e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135640f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f135641g);
            String str4 = this.f135642h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f135638d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f135639e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f135640f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f135641g);
            String str8 = this.f135642h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C49891is2 is22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                is22.f135638d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                is22.f135639e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                is22.f135640f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                is22.f135641g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                is22.f135642h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
