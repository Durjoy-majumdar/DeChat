package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.e1 */
public class C47570e1 extends C47465a {

    /* renamed from: d */
    public String f127652d;

    /* renamed from: e */
    public String f127653e;

    /* renamed from: f */
    public String f127654f;

    /* renamed from: g */
    public boolean f127655g;

    /* renamed from: h */
    public boolean f127656h;

    /* renamed from: i */
    public String f127657i;

    /* renamed from: j */
    public String f127658j;

    /* renamed from: n */
    public int f127659n;

    /* renamed from: o */
    public int f127660o;

    /* renamed from: p */
    public String f127661p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47570e1)) {
            return false;
        }
        C47570e1 e1Var = (C47570e1) aVar;
        return C46238a.m51546a(this.f127652d, e1Var.f127652d) && C46238a.m51546a(this.f127653e, e1Var.f127653e) && C46238a.m51546a(this.f127654f, e1Var.f127654f) && C46238a.m51546a(Boolean.valueOf(this.f127655g), Boolean.valueOf(e1Var.f127655g)) && C46238a.m51546a(Boolean.valueOf(this.f127656h), Boolean.valueOf(e1Var.f127656h)) && C46238a.m51546a(this.f127657i, e1Var.f127657i) && C46238a.m51546a(this.f127658j, e1Var.f127658j) && C46238a.m51546a(Integer.valueOf(this.f127659n), Integer.valueOf(e1Var.f127659n)) && C46238a.m51546a(Integer.valueOf(this.f127660o), Integer.valueOf(e1Var.f127660o)) && C46238a.m51546a(this.f127661p, e1Var.f127661p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127652d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f127653e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127653e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127654f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74314a(4, this.f127655g);
                aVar.mo74314a(5, this.f127656h);
                String str4 = this.f127657i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f127658j;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                aVar.mo74318e(8, this.f127659n);
                aVar.mo74318e(9, this.f127660o);
                String str6 = this.f127661p;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NavKey");
            }
        } else if (i == 1) {
            String str7 = this.f127652d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f127653e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f127654f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int a = i2 + C52418a.m58674a(4, this.f127655g) + C52418a.m58674a(5, this.f127656h);
            String str10 = this.f127657i;
            if (str10 != null) {
                a += C52418a.m58683j(6, str10);
            }
            String str11 = this.f127658j;
            if (str11 != null) {
                a += C52418a.m58683j(7, str11);
            }
            int e = a + C52418a.m58678e(8, this.f127659n) + C52418a.m58678e(9, this.f127660o);
            String str12 = this.f127661p;
            return str12 != null ? e + C52418a.m58683j(10, str12) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127652d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f127653e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NavKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47570e1 e1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e1Var.f127652d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e1Var.f127653e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e1Var.f127654f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e1Var.f127655g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    e1Var.f127656h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    e1Var.f127657i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e1Var.f127658j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e1Var.f127659n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    e1Var.f127660o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    e1Var.f127661p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
