package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p8 */
public class C101826p8 extends C47465a {

    /* renamed from: d */
    public String f299087d;

    /* renamed from: e */
    public String f299088e;

    /* renamed from: f */
    public String f299089f;

    /* renamed from: g */
    public int f299090g;

    /* renamed from: h */
    public long f299091h;

    /* renamed from: i */
    public int f299092i;

    /* renamed from: j */
    public int f299093j;

    /* renamed from: n */
    public long f299094n;

    /* renamed from: o */
    public long f299095o;

    /* renamed from: p */
    public long f299096p;

    /* renamed from: q */
    public String f299097q;

    /* renamed from: r */
    public long f299098r;

    /* renamed from: s */
    public double f299099s;

    /* renamed from: t */
    public int f299100t;

    /* renamed from: u */
    public String f299101u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101826p8)) {
            return false;
        }
        C101826p8 p8Var = (C101826p8) aVar;
        return C46238a.m51546a(this.f299087d, p8Var.f299087d) && C46238a.m51546a(this.f299088e, p8Var.f299088e) && C46238a.m51546a(this.f299089f, p8Var.f299089f) && C46238a.m51546a(Integer.valueOf(this.f299090g), Integer.valueOf(p8Var.f299090g)) && C46238a.m51546a(Long.valueOf(this.f299091h), Long.valueOf(p8Var.f299091h)) && C46238a.m51546a(Integer.valueOf(this.f299092i), Integer.valueOf(p8Var.f299092i)) && C46238a.m51546a(Integer.valueOf(this.f299093j), Integer.valueOf(p8Var.f299093j)) && C46238a.m51546a(Long.valueOf(this.f299094n), Long.valueOf(p8Var.f299094n)) && C46238a.m51546a(Long.valueOf(this.f299095o), Long.valueOf(p8Var.f299095o)) && C46238a.m51546a(Long.valueOf(this.f299096p), Long.valueOf(p8Var.f299096p)) && C46238a.m51546a(this.f299097q, p8Var.f299097q) && C46238a.m51546a(Long.valueOf(this.f299098r), Long.valueOf(p8Var.f299098r)) && C46238a.m51546a(Double.valueOf(this.f299099s), Double.valueOf(p8Var.f299099s)) && C46238a.m51546a(Integer.valueOf(this.f299100t), Integer.valueOf(p8Var.f299100t)) && C46238a.m51546a(this.f299101u, p8Var.f299101u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299087d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299088e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299089f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f299090g);
            aVar.mo74321h(5, this.f299091h);
            aVar.mo74318e(6, this.f299092i);
            aVar.mo74318e(7, this.f299093j);
            aVar.mo74321h(8, this.f299094n);
            aVar.mo74321h(9, this.f299095o);
            aVar.mo74321h(10, this.f299096p);
            String str4 = this.f299097q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            aVar.mo74321h(12, this.f299098r);
            aVar.mo74316c(13, this.f299099s);
            aVar.mo74318e(14, this.f299100t);
            String str5 = this.f299101u;
            if (str5 != null) {
                aVar.mo74323j(15, str5);
            }
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f299087d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            String str7 = this.f299088e;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f299089f;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            int e = i3 + C52418a.m58678e(4, this.f299090g) + C52418a.m58681h(5, this.f299091h) + C52418a.m58678e(6, this.f299092i) + C52418a.m58678e(7, this.f299093j) + C52418a.m58681h(8, this.f299094n) + C52418a.m58681h(9, this.f299095o) + C52418a.m58681h(10, this.f299096p);
            String str9 = this.f299097q;
            if (str9 != null) {
                e += C52418a.m58683j(11, str9);
            }
            int h = e + C52418a.m58681h(12, this.f299098r) + C52418a.m58676c(13, this.f299099s) + C52418a.m58678e(14, this.f299100t);
            String str10 = this.f299101u;
            return str10 != null ? h + C52418a.m58683j(15, str10) : h;
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
            C101826p8 p8Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p8Var.f299087d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    p8Var.f299088e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p8Var.f299089f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p8Var.f299090g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    p8Var.f299091h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    p8Var.f299092i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    p8Var.f299093j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    p8Var.f299094n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    p8Var.f299095o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    p8Var.f299096p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    p8Var.f299097q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    p8Var.f299098r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    p8Var.f299099s = aVar3.mo141627e(intValue);
                    return 0;
                case 14:
                    p8Var.f299100t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    p8Var.f299101u = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
