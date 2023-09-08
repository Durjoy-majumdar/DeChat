package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.d0 */
public class C79030d0 extends C47465a {

    /* renamed from: d */
    public int f232045d;

    /* renamed from: e */
    public int f232046e;

    /* renamed from: f */
    public long f232047f;

    /* renamed from: g */
    public String f232048g;

    /* renamed from: h */
    public String f232049h;

    /* renamed from: i */
    public String f232050i;

    /* renamed from: j */
    public String f232051j;

    /* renamed from: n */
    public String f232052n;

    /* renamed from: o */
    public String f232053o;

    /* renamed from: p */
    public double f232054p;

    /* renamed from: q */
    public double f232055q;

    /* renamed from: r */
    public int f232056r;

    /* renamed from: s */
    public String f232057s;

    /* renamed from: t */
    public String f232058t;

    /* renamed from: u */
    public String f232059u;

    /* renamed from: v */
    public LinkedList<C89349b> f232060v = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C79030d0)) {
            return false;
        }
        C79030d0 d0Var = (C79030d0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f232045d), Integer.valueOf(d0Var.f232045d)) && C46238a.m51546a(Integer.valueOf(this.f232046e), Integer.valueOf(d0Var.f232046e)) && C46238a.m51546a(Long.valueOf(this.f232047f), Long.valueOf(d0Var.f232047f)) && C46238a.m51546a(this.f232048g, d0Var.f232048g) && C46238a.m51546a(this.f232049h, d0Var.f232049h) && C46238a.m51546a(this.f232050i, d0Var.f232050i) && C46238a.m51546a(this.f232051j, d0Var.f232051j) && C46238a.m51546a(this.f232052n, d0Var.f232052n) && C46238a.m51546a(this.f232053o, d0Var.f232053o) && C46238a.m51546a(Double.valueOf(this.f232054p), Double.valueOf(d0Var.f232054p)) && C46238a.m51546a(Double.valueOf(this.f232055q), Double.valueOf(d0Var.f232055q)) && C46238a.m51546a(Integer.valueOf(this.f232056r), Integer.valueOf(d0Var.f232056r)) && C46238a.m51546a(this.f232057s, d0Var.f232057s) && C46238a.m51546a(this.f232058t, d0Var.f232058t) && C46238a.m51546a(this.f232059u, d0Var.f232059u) && C46238a.m51546a(this.f232060v, d0Var.f232060v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f232045d);
            aVar.mo74318e(2, this.f232046e);
            aVar.mo74321h(3, this.f232047f);
            String str = this.f232048g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f232049h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f232050i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f232051j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f232052n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f232053o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74316c(10, this.f232054p);
            aVar.mo74316c(11, this.f232055q);
            aVar.mo74318e(12, this.f232056r);
            String str7 = this.f232057s;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            String str8 = this.f232058t;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            String str9 = this.f232059u;
            if (str9 != null) {
                aVar.mo74323j(16, str9);
            }
            aVar.mo74320g(17, 6, this.f232060v);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f232045d) + 0 + C52418a.m58678e(2, this.f232046e) + C52418a.m58681h(3, this.f232047f);
            String str10 = this.f232048g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f232049h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f232050i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f232051j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f232052n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            String str15 = this.f232053o;
            if (str15 != null) {
                e += C52418a.m58683j(9, str15);
            }
            int c = e + C52418a.m58676c(10, this.f232054p) + C52418a.m58676c(11, this.f232055q) + C52418a.m58678e(12, this.f232056r);
            String str16 = this.f232057s;
            if (str16 != null) {
                c += C52418a.m58683j(13, str16);
            }
            String str17 = this.f232058t;
            if (str17 != null) {
                c += C52418a.m58683j(14, str17);
            }
            String str18 = this.f232059u;
            if (str18 != null) {
                c += C52418a.m58683j(16, str18);
            }
            return c + C52418a.m58680g(17, 6, this.f232060v);
        } else if (i2 == 2) {
            this.f232060v.clear();
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
            C79030d0 d0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d0Var.f232045d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    d0Var.f232046e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    d0Var.f232047f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    d0Var.f232048g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d0Var.f232049h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d0Var.f232050i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    d0Var.f232051j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    d0Var.f232052n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    d0Var.f232053o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    d0Var.f232054p = aVar3.mo141627e(intValue);
                    return 0;
                case 11:
                    d0Var.f232055q = aVar3.mo141627e(intValue);
                    return 0;
                case 12:
                    d0Var.f232056r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    d0Var.f232057s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    d0Var.f232058t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    d0Var.f232059u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    d0Var.f232060v.add(aVar3.mo141626d(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
