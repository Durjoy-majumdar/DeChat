package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pc0 */
public class C90431pc0 extends C47465a {

    /* renamed from: d */
    public String f259741d;

    /* renamed from: e */
    public String f259742e;

    /* renamed from: f */
    public int f259743f;

    /* renamed from: g */
    public String f259744g;

    /* renamed from: h */
    public int f259745h;

    /* renamed from: i */
    public String f259746i;

    /* renamed from: j */
    public String f259747j;

    /* renamed from: n */
    public int f259748n;

    /* renamed from: o */
    public int f259749o;

    /* renamed from: p */
    public int f259750p;

    /* renamed from: q */
    public String f259751q;

    /* renamed from: r */
    public int f259752r;

    /* renamed from: s */
    public int f259753s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90431pc0)) {
            return false;
        }
        C90431pc0 pc02 = (C90431pc0) aVar;
        return C46238a.m51546a(this.f259741d, pc02.f259741d) && C46238a.m51546a(this.f259742e, pc02.f259742e) && C46238a.m51546a(Integer.valueOf(this.f259743f), Integer.valueOf(pc02.f259743f)) && C46238a.m51546a(this.f259744g, pc02.f259744g) && C46238a.m51546a(Integer.valueOf(this.f259745h), Integer.valueOf(pc02.f259745h)) && C46238a.m51546a(this.f259746i, pc02.f259746i) && C46238a.m51546a(this.f259747j, pc02.f259747j) && C46238a.m51546a(Integer.valueOf(this.f259748n), Integer.valueOf(pc02.f259748n)) && C46238a.m51546a(Integer.valueOf(this.f259749o), Integer.valueOf(pc02.f259749o)) && C46238a.m51546a(Integer.valueOf(this.f259750p), Integer.valueOf(pc02.f259750p)) && C46238a.m51546a(this.f259751q, pc02.f259751q) && C46238a.m51546a(Integer.valueOf(this.f259752r), Integer.valueOf(pc02.f259752r)) && C46238a.m51546a(Integer.valueOf(this.f259753s), Integer.valueOf(pc02.f259753s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259741d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259742e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f259743f);
            String str3 = this.f259744g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f259745h);
            String str4 = this.f259746i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f259747j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f259748n);
            aVar.mo74318e(9, this.f259749o);
            aVar.mo74318e(10, this.f259750p);
            String str6 = this.f259751q;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74318e(12, this.f259752r);
            aVar.mo74318e(13, this.f259753s);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f259741d;
            int j = str7 != null ? 0 + C52418a.m58683j(1, str7) : 0;
            String str8 = this.f259742e;
            if (str8 != null) {
                j += C52418a.m58683j(2, str8);
            }
            int e = j + C52418a.m58678e(3, this.f259743f);
            String str9 = this.f259744g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            int e2 = e + C52418a.m58678e(5, this.f259745h);
            String str10 = this.f259746i;
            if (str10 != null) {
                e2 += C52418a.m58683j(6, str10);
            }
            String str11 = this.f259747j;
            if (str11 != null) {
                e2 += C52418a.m58683j(7, str11);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f259748n) + C52418a.m58678e(9, this.f259749o) + C52418a.m58678e(10, this.f259750p);
            String str12 = this.f259751q;
            if (str12 != null) {
                e3 += C52418a.m58683j(11, str12);
            }
            return e3 + C52418a.m58678e(12, this.f259752r) + C52418a.m58678e(13, this.f259753s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90431pc0 pc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pc02.f259741d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pc02.f259742e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pc02.f259743f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pc02.f259744g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pc02.f259745h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pc02.f259746i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pc02.f259747j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pc02.f259748n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pc02.f259749o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    pc02.f259750p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    pc02.f259751q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    pc02.f259752r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    pc02.f259753s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
