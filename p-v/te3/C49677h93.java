package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h93 */
public class C49677h93 extends C47465a {

    /* renamed from: d */
    public String f134516d;

    /* renamed from: e */
    public String f134517e;

    /* renamed from: f */
    public String f134518f;

    /* renamed from: g */
    public int f134519g;

    /* renamed from: h */
    public boolean f134520h;

    /* renamed from: i */
    public String f134521i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49677h93)) {
            return false;
        }
        C49677h93 h932 = (C49677h93) aVar;
        return C46238a.m51546a(this.f134516d, h932.f134516d) && C46238a.m51546a(this.f134517e, h932.f134517e) && C46238a.m51546a(this.f134518f, h932.f134518f) && C46238a.m51546a(Integer.valueOf(this.f134519g), Integer.valueOf(h932.f134519g)) && C46238a.m51546a(Boolean.valueOf(this.f134520h), Boolean.valueOf(h932.f134520h)) && C46238a.m51546a(this.f134521i, h932.f134521i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134516d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134517e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134518f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f134519g);
            aVar.mo74314a(5, this.f134520h);
            String str4 = this.f134521i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f134516d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f134517e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f134518f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f134519g) + C52418a.m58674a(5, this.f134520h);
            String str8 = this.f134521i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C49677h93 h932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    h932.f134516d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    h932.f134517e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    h932.f134518f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    h932.f134519g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    h932.f134520h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    h932.f134521i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
