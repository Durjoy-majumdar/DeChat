package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z63 */
public class C52224z63 extends C47465a {

    /* renamed from: d */
    public String f145718d;

    /* renamed from: e */
    public String f145719e;

    /* renamed from: f */
    public String f145720f;

    /* renamed from: g */
    public String f145721g;

    /* renamed from: h */
    public String f145722h;

    /* renamed from: i */
    public int f145723i;

    /* renamed from: j */
    public String f145724j;

    /* renamed from: n */
    public String f145725n;

    /* renamed from: o */
    public String f145726o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52224z63)) {
            return false;
        }
        C52224z63 z632 = (C52224z63) aVar;
        return C46238a.m51546a(this.f145718d, z632.f145718d) && C46238a.m51546a(this.f145719e, z632.f145719e) && C46238a.m51546a(this.f145720f, z632.f145720f) && C46238a.m51546a(this.f145721g, z632.f145721g) && C46238a.m51546a(this.f145722h, z632.f145722h) && C46238a.m51546a(Integer.valueOf(this.f145723i), Integer.valueOf(z632.f145723i)) && C46238a.m51546a(this.f145724j, z632.f145724j) && C46238a.m51546a(this.f145725n, z632.f145725n) && C46238a.m51546a(this.f145726o, z632.f145726o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145718d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145719e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f145720f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f145721g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f145722h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f145723i);
            String str6 = this.f145724j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f145725n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f145726o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f145718d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f145719e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f145720f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f145721g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f145722h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            int e = i2 + C52418a.m58678e(6, this.f145723i);
            String str14 = this.f145724j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f145725n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f145726o;
            return str16 != null ? e + C52418a.m58683j(9, str16) : e;
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
            C52224z63 z632 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    z632.f145718d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    z632.f145719e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    z632.f145720f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    z632.f145721g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    z632.f145722h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    z632.f145723i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    z632.f145724j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    z632.f145725n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    z632.f145726o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
