package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s41 */
public class C64698s41 extends C47465a {

    /* renamed from: d */
    public int f185335d;

    /* renamed from: e */
    public String f185336e;

    /* renamed from: f */
    public String f185337f;

    /* renamed from: g */
    public String f185338g;

    /* renamed from: h */
    public String f185339h;

    /* renamed from: i */
    public String f185340i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64698s41)) {
            return false;
        }
        C64698s41 s412 = (C64698s41) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185335d), Integer.valueOf(s412.f185335d)) && C46238a.m51546a(this.f185336e, s412.f185336e) && C46238a.m51546a(this.f185337f, s412.f185337f) && C46238a.m51546a(this.f185338g, s412.f185338g) && C46238a.m51546a(this.f185339h, s412.f185339h) && C46238a.m51546a(this.f185340i, s412.f185340i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185335d);
            String str = this.f185336e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185337f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185338g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f185339h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f185340i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185335d) + 0;
            String str6 = this.f185336e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f185337f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f185338g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f185339h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f185340i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            C64698s41 s412 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s412.f185335d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    s412.f185336e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s412.f185337f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s412.f185338g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s412.f185339h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    s412.f185340i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
