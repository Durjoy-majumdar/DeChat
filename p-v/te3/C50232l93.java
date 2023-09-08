package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l93 */
public class C50232l93 extends C47465a {

    /* renamed from: d */
    public String f137266d;

    /* renamed from: e */
    public String f137267e;

    /* renamed from: f */
    public String f137268f;

    /* renamed from: g */
    public String f137269g;

    /* renamed from: h */
    public String f137270h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50232l93)) {
            return false;
        }
        C50232l93 l932 = (C50232l93) aVar;
        return C46238a.m51546a(this.f137266d, l932.f137266d) && C46238a.m51546a(this.f137267e, l932.f137267e) && C46238a.m51546a(this.f137268f, l932.f137268f) && C46238a.m51546a(this.f137269g, l932.f137269g) && C46238a.m51546a(this.f137270h, l932.f137270h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137266d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137267e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137268f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f137269g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f137270h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f137266d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f137267e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f137268f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f137269g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f137270h;
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
            C50232l93 l932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l932.f137266d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                l932.f137267e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                l932.f137268f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                l932.f137269g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                l932.f137270h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
