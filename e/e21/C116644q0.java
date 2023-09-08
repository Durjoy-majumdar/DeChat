package e21;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: e21.q0 */
public class C116644q0 extends C47465a {

    /* renamed from: d */
    public String f349753d;

    /* renamed from: e */
    public String f349754e;

    /* renamed from: f */
    public double f349755f;

    /* renamed from: g */
    public String f349756g;

    /* renamed from: h */
    public int f349757h;

    /* renamed from: i */
    public int f349758i;

    /* renamed from: j */
    public int f349759j;

    /* renamed from: n */
    public String f349760n;

    /* renamed from: o */
    public String f349761o;

    /* renamed from: p */
    public int f349762p;

    /* renamed from: q */
    public String f349763q;

    /* renamed from: r */
    public String f349764r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C116644q0)) {
            return false;
        }
        C116644q0 q0Var = (C116644q0) aVar;
        return C46238a.m51546a(this.f349753d, q0Var.f349753d) && C46238a.m51546a(this.f349754e, q0Var.f349754e) && C46238a.m51546a(Double.valueOf(this.f349755f), Double.valueOf(q0Var.f349755f)) && C46238a.m51546a(this.f349756g, q0Var.f349756g) && C46238a.m51546a(Integer.valueOf(this.f349757h), Integer.valueOf(q0Var.f349757h)) && C46238a.m51546a(Integer.valueOf(this.f349758i), Integer.valueOf(q0Var.f349758i)) && C46238a.m51546a(Integer.valueOf(this.f349759j), Integer.valueOf(q0Var.f349759j)) && C46238a.m51546a(this.f349760n, q0Var.f349760n) && C46238a.m51546a(this.f349761o, q0Var.f349761o) && C46238a.m51546a(Integer.valueOf(this.f349762p), Integer.valueOf(q0Var.f349762p)) && C46238a.m51546a(this.f349763q, q0Var.f349763q) && C46238a.m51546a(this.f349764r, q0Var.f349764r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f349753d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f349754e == null) {
                throw new C52419b("Not all required fields were included: transactionId");
            } else if (this.f349756g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f349754e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74316c(3, this.f349755f);
                String str3 = this.f349756g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f349757h);
                aVar.mo74318e(6, this.f349758i);
                aVar.mo74318e(7, this.f349759j);
                String str4 = this.f349760n;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f349761o;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                aVar.mo74318e(10, this.f349762p);
                String str6 = this.f349763q;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                String str7 = this.f349764r;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: feeType");
            }
        } else if (i2 == 1) {
            String str8 = this.f349753d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            String str9 = this.f349754e;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            int c = i3 + C52418a.m58676c(3, this.f349755f);
            String str10 = this.f349756g;
            if (str10 != null) {
                c += C52418a.m58683j(4, str10);
            }
            int e = c + C52418a.m58678e(5, this.f349757h) + C52418a.m58678e(6, this.f349758i) + C52418a.m58678e(7, this.f349759j);
            String str11 = this.f349760n;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f349761o;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            int e2 = e + C52418a.m58678e(10, this.f349762p);
            String str13 = this.f349763q;
            if (str13 != null) {
                e2 += C52418a.m58683j(11, str13);
            }
            String str14 = this.f349764r;
            return str14 != null ? e2 + C52418a.m58683j(12, str14) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f349753d == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f349754e == null) {
                throw new C52419b("Not all required fields were included: transactionId");
            } else if (this.f349756g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: feeType");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C116644q0 q0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q0Var.f349753d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    q0Var.f349754e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q0Var.f349755f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    q0Var.f349756g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    q0Var.f349757h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    q0Var.f349758i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    q0Var.f349759j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    q0Var.f349760n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    q0Var.f349761o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    q0Var.f349762p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    q0Var.f349763q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    q0Var.f349764r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
