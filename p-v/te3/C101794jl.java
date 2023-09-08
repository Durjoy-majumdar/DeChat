package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jl */
public class C101794jl extends C47465a {

    /* renamed from: d */
    public String f298521d;

    /* renamed from: e */
    public int f298522e;

    /* renamed from: f */
    public String f298523f;

    /* renamed from: g */
    public int f298524g;

    /* renamed from: h */
    public int f298525h;

    /* renamed from: i */
    public int f298526i;

    /* renamed from: j */
    public int f298527j;

    /* renamed from: n */
    public int f298528n;

    /* renamed from: o */
    public String f298529o;

    /* renamed from: p */
    public int f298530p;

    /* renamed from: q */
    public int f298531q;

    /* renamed from: r */
    public int f298532r;

    /* renamed from: s */
    public int f298533s;

    /* renamed from: t */
    public int f298534t;

    /* renamed from: u */
    public int f298535u;

    /* renamed from: v */
    public int f298536v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101794jl)) {
            return false;
        }
        C101794jl jlVar = (C101794jl) aVar;
        return C46238a.m51546a(this.f298521d, jlVar.f298521d) && C46238a.m51546a(Integer.valueOf(this.f298522e), Integer.valueOf(jlVar.f298522e)) && C46238a.m51546a(this.f298523f, jlVar.f298523f) && C46238a.m51546a(Integer.valueOf(this.f298524g), Integer.valueOf(jlVar.f298524g)) && C46238a.m51546a(Integer.valueOf(this.f298525h), Integer.valueOf(jlVar.f298525h)) && C46238a.m51546a(Integer.valueOf(this.f298526i), Integer.valueOf(jlVar.f298526i)) && C46238a.m51546a(Integer.valueOf(this.f298527j), Integer.valueOf(jlVar.f298527j)) && C46238a.m51546a(Integer.valueOf(this.f298528n), Integer.valueOf(jlVar.f298528n)) && C46238a.m51546a(this.f298529o, jlVar.f298529o) && C46238a.m51546a(Integer.valueOf(this.f298530p), Integer.valueOf(jlVar.f298530p)) && C46238a.m51546a(Integer.valueOf(this.f298531q), Integer.valueOf(jlVar.f298531q)) && C46238a.m51546a(Integer.valueOf(this.f298532r), Integer.valueOf(jlVar.f298532r)) && C46238a.m51546a(Integer.valueOf(this.f298533s), Integer.valueOf(jlVar.f298533s)) && C46238a.m51546a(Integer.valueOf(this.f298534t), Integer.valueOf(jlVar.f298534t)) && C46238a.m51546a(Integer.valueOf(this.f298535u), Integer.valueOf(jlVar.f298535u)) && C46238a.m51546a(Integer.valueOf(this.f298536v), Integer.valueOf(jlVar.f298536v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298521d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f298522e);
            String str2 = this.f298523f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f298524g);
            aVar.mo74318e(5, this.f298525h);
            aVar.mo74318e(6, this.f298526i);
            aVar.mo74318e(7, this.f298527j);
            aVar.mo74318e(8, this.f298528n);
            String str3 = this.f298529o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f298530p);
            aVar.mo74318e(11, this.f298531q);
            aVar.mo74318e(12, this.f298532r);
            aVar.mo74318e(13, this.f298533s);
            aVar.mo74318e(14, this.f298534t);
            aVar.mo74318e(15, this.f298535u);
            aVar.mo74318e(16, this.f298536v);
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f298521d;
            if (str4 != null) {
                i3 = C52418a.m58683j(1, str4) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f298522e);
            String str5 = this.f298523f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f298524g) + C52418a.m58678e(5, this.f298525h) + C52418a.m58678e(6, this.f298526i) + C52418a.m58678e(7, this.f298527j) + C52418a.m58678e(8, this.f298528n);
            String str6 = this.f298529o;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            return e2 + C52418a.m58678e(10, this.f298530p) + C52418a.m58678e(11, this.f298531q) + C52418a.m58678e(12, this.f298532r) + C52418a.m58678e(13, this.f298533s) + C52418a.m58678e(14, this.f298534t) + C52418a.m58678e(15, this.f298535u) + C52418a.m58678e(16, this.f298536v);
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
            C101794jl jlVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jlVar.f298521d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jlVar.f298522e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jlVar.f298523f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jlVar.f298524g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jlVar.f298525h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    jlVar.f298526i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jlVar.f298527j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jlVar.f298528n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jlVar.f298529o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jlVar.f298530p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    jlVar.f298531q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    jlVar.f298532r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    jlVar.f298533s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    jlVar.f298534t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    jlVar.f298535u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    jlVar.f298536v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
