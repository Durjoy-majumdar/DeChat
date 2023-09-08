package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class s75 extends C47465a {

    /* renamed from: d */
    public int f141361d;

    /* renamed from: e */
    public String f141362e;

    /* renamed from: f */
    public String f141363f;

    /* renamed from: g */
    public String f141364g;

    /* renamed from: h */
    public int f141365h;

    /* renamed from: i */
    public int f141366i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s75)) {
            return false;
        }
        s75 s75 = (s75) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141361d), Integer.valueOf(s75.f141361d)) && C46238a.m51546a(this.f141362e, s75.f141362e) && C46238a.m51546a(this.f141363f, s75.f141363f) && C46238a.m51546a(this.f141364g, s75.f141364g) && C46238a.m51546a(Integer.valueOf(this.f141365h), Integer.valueOf(s75.f141365h)) && C46238a.m51546a(Integer.valueOf(this.f141366i), Integer.valueOf(s75.f141366i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141361d);
            String str = this.f141362e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141363f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141364g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f141365h);
            aVar.mo74318e(6, this.f141366i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141361d) + 0;
            String str4 = this.f141362e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f141363f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f141364g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f141365h) + C52418a.m58678e(6, this.f141366i);
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
            s75 s75 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s75.f141361d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    s75.f141362e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s75.f141363f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s75.f141364g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s75.f141365h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s75.f141366i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
