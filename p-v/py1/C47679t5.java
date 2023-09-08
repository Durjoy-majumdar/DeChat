package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.t5 */
public class C47679t5 extends C47465a {

    /* renamed from: d */
    public String f128035d;

    /* renamed from: e */
    public String f128036e;

    /* renamed from: f */
    public String f128037f;

    /* renamed from: g */
    public String f128038g;

    /* renamed from: h */
    public String f128039h;

    /* renamed from: i */
    public int f128040i;

    /* renamed from: j */
    public String f128041j;

    /* renamed from: n */
    public String f128042n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47679t5)) {
            return false;
        }
        C47679t5 t5Var = (C47679t5) aVar;
        return C46238a.m51546a(this.f128035d, t5Var.f128035d) && C46238a.m51546a(this.f128036e, t5Var.f128036e) && C46238a.m51546a(this.f128037f, t5Var.f128037f) && C46238a.m51546a(this.f128038g, t5Var.f128038g) && C46238a.m51546a(this.f128039h, t5Var.f128039h) && C46238a.m51546a(Integer.valueOf(this.f128040i), Integer.valueOf(t5Var.f128040i)) && C46238a.m51546a(this.f128041j, t5Var.f128041j) && C46238a.m51546a(this.f128042n, t5Var.f128042n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128035d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f128036e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f128037f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f128038g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f128039h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f128040i);
            String str6 = this.f128041j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f128042n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f128035d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f128036e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f128037f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f128038g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f128039h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            int e = i2 + C52418a.m58678e(6, this.f128040i);
            String str13 = this.f128041j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f128042n;
            return str14 != null ? e + C52418a.m58683j(8, str14) : e;
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
            C47679t5 t5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t5Var.f128035d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    t5Var.f128036e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t5Var.f128037f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t5Var.f128038g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t5Var.f128039h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t5Var.f128040i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    t5Var.f128041j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    t5Var.f128042n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
