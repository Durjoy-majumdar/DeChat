package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ce0 */
public class C77912ce0 extends C47465a {

    /* renamed from: d */
    public long f227117d;

    /* renamed from: e */
    public long f227118e;

    /* renamed from: f */
    public long f227119f;

    /* renamed from: g */
    public String f227120g;

    /* renamed from: h */
    public long f227121h;

    /* renamed from: i */
    public String f227122i;

    /* renamed from: j */
    public String f227123j;

    /* renamed from: n */
    public String f227124n;

    /* renamed from: o */
    public String f227125o;

    /* renamed from: p */
    public String f227126p;

    /* renamed from: q */
    public String f227127q;

    /* renamed from: r */
    public int f227128r;

    /* renamed from: s */
    public String f227129s;

    /* renamed from: t */
    public int f227130t;

    /* renamed from: u */
    public String f227131u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77912ce0)) {
            return false;
        }
        C77912ce0 ce02 = (C77912ce0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f227117d), Long.valueOf(ce02.f227117d)) && C46238a.m51546a(Long.valueOf(this.f227118e), Long.valueOf(ce02.f227118e)) && C46238a.m51546a(Long.valueOf(this.f227119f), Long.valueOf(ce02.f227119f)) && C46238a.m51546a(this.f227120g, ce02.f227120g) && C46238a.m51546a(Long.valueOf(this.f227121h), Long.valueOf(ce02.f227121h)) && C46238a.m51546a(this.f227122i, ce02.f227122i) && C46238a.m51546a(this.f227123j, ce02.f227123j) && C46238a.m51546a(this.f227124n, ce02.f227124n) && C46238a.m51546a(this.f227125o, ce02.f227125o) && C46238a.m51546a(this.f227126p, ce02.f227126p) && C46238a.m51546a(this.f227127q, ce02.f227127q) && C46238a.m51546a(Integer.valueOf(this.f227128r), Integer.valueOf(ce02.f227128r)) && C46238a.m51546a(this.f227129s, ce02.f227129s) && C46238a.m51546a(Integer.valueOf(this.f227130t), Integer.valueOf(ce02.f227130t)) && C46238a.m51546a(this.f227131u, ce02.f227131u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f227117d);
            aVar.mo74321h(2, this.f227118e);
            aVar.mo74321h(3, this.f227119f);
            String str = this.f227120g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f227121h);
            String str2 = this.f227122i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f227123j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f227124n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f227125o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f227126p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f227127q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            aVar.mo74318e(12, this.f227128r);
            String str8 = this.f227129s;
            if (str8 != null) {
                aVar.mo74323j(13, str8);
            }
            aVar.mo74318e(14, this.f227130t);
            String str9 = this.f227131u;
            if (str9 != null) {
                aVar.mo74323j(15, str9);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f227117d) + 0 + C52418a.m58681h(2, this.f227118e) + C52418a.m58681h(3, this.f227119f);
            String str10 = this.f227120g;
            if (str10 != null) {
                h += C52418a.m58683j(4, str10);
            }
            int h2 = h + C52418a.m58681h(5, this.f227121h);
            String str11 = this.f227122i;
            if (str11 != null) {
                h2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f227123j;
            if (str12 != null) {
                h2 += C52418a.m58683j(7, str12);
            }
            String str13 = this.f227124n;
            if (str13 != null) {
                h2 += C52418a.m58683j(8, str13);
            }
            String str14 = this.f227125o;
            if (str14 != null) {
                h2 += C52418a.m58683j(9, str14);
            }
            String str15 = this.f227126p;
            if (str15 != null) {
                h2 += C52418a.m58683j(10, str15);
            }
            String str16 = this.f227127q;
            if (str16 != null) {
                h2 += C52418a.m58683j(11, str16);
            }
            int e = h2 + C52418a.m58678e(12, this.f227128r);
            String str17 = this.f227129s;
            if (str17 != null) {
                e += C52418a.m58683j(13, str17);
            }
            int e2 = e + C52418a.m58678e(14, this.f227130t);
            String str18 = this.f227131u;
            return str18 != null ? e2 + C52418a.m58683j(15, str18) : e2;
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
            C77912ce0 ce02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ce02.f227117d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ce02.f227118e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ce02.f227119f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    ce02.f227120g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ce02.f227121h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ce02.f227122i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ce02.f227123j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ce02.f227124n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ce02.f227125o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ce02.f227126p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ce02.f227127q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ce02.f227128r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    ce02.f227129s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ce02.f227130t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    ce02.f227131u = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
