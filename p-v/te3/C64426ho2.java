package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ho2 */
public class C64426ho2 extends C47465a {

    /* renamed from: d */
    public String f183521d;

    /* renamed from: e */
    public String f183522e;

    /* renamed from: f */
    public String f183523f;

    /* renamed from: g */
    public String f183524g;

    /* renamed from: h */
    public int f183525h;

    /* renamed from: i */
    public float f183526i;

    /* renamed from: j */
    public int f183527j;

    /* renamed from: n */
    public boolean f183528n;

    /* renamed from: o */
    public boolean f183529o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64426ho2)) {
            return false;
        }
        C64426ho2 ho22 = (C64426ho2) aVar;
        return C46238a.m51546a(this.f183521d, ho22.f183521d) && C46238a.m51546a(this.f183522e, ho22.f183522e) && C46238a.m51546a(this.f183523f, ho22.f183523f) && C46238a.m51546a(this.f183524g, ho22.f183524g) && C46238a.m51546a(Integer.valueOf(this.f183525h), Integer.valueOf(ho22.f183525h)) && C46238a.m51546a(Float.valueOf(this.f183526i), Float.valueOf(ho22.f183526i)) && C46238a.m51546a(Integer.valueOf(this.f183527j), Integer.valueOf(ho22.f183527j)) && C46238a.m51546a(Boolean.valueOf(this.f183528n), Boolean.valueOf(ho22.f183528n)) && C46238a.m51546a(Boolean.valueOf(this.f183529o), Boolean.valueOf(ho22.f183529o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183521d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183522e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183523f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183524g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f183525h);
            aVar.mo74317d(6, this.f183526i);
            aVar.mo74318e(7, this.f183527j);
            aVar.mo74314a(8, this.f183528n);
            aVar.mo74314a(9, this.f183529o);
            return 0;
        } else if (i == 1) {
            String str5 = this.f183521d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f183522e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f183523f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f183524g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f183525h) + C52418a.m58677d(6, this.f183526i) + C52418a.m58678e(7, this.f183527j) + C52418a.m58674a(8, this.f183528n) + C52418a.m58674a(9, this.f183529o);
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
            C64426ho2 ho22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ho22.f183521d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ho22.f183522e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ho22.f183523f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ho22.f183524g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ho22.f183525h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ho22.f183526i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    ho22.f183527j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ho22.f183528n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    ho22.f183529o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
