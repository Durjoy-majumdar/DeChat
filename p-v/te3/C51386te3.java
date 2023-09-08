package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.te3 */
public class C51386te3 extends C47465a {

    /* renamed from: d */
    public String f142167d;

    /* renamed from: e */
    public float f142168e;

    /* renamed from: f */
    public String f142169f;

    /* renamed from: g */
    public String f142170g;

    /* renamed from: h */
    public String f142171h;

    /* renamed from: i */
    public String f142172i;

    /* renamed from: j */
    public String f142173j;

    /* renamed from: n */
    public String f142174n;

    /* renamed from: o */
    public String f142175o;

    /* renamed from: p */
    public String f142176p;

    /* renamed from: q */
    public float f142177q;

    /* renamed from: r */
    public int f142178r;

    /* renamed from: s */
    public String f142179s;

    /* renamed from: t */
    public LinkedList<String> f142180t = new LinkedList<>();

    /* renamed from: u */
    public String f142181u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51386te3)) {
            return false;
        }
        C51386te3 te32 = (C51386te3) aVar;
        return C46238a.m51546a(this.f142167d, te32.f142167d) && C46238a.m51546a(Float.valueOf(this.f142168e), Float.valueOf(te32.f142168e)) && C46238a.m51546a(this.f142169f, te32.f142169f) && C46238a.m51546a(this.f142170g, te32.f142170g) && C46238a.m51546a(this.f142171h, te32.f142171h) && C46238a.m51546a(this.f142172i, te32.f142172i) && C46238a.m51546a(this.f142173j, te32.f142173j) && C46238a.m51546a(this.f142174n, te32.f142174n) && C46238a.m51546a(this.f142175o, te32.f142175o) && C46238a.m51546a(this.f142176p, te32.f142176p) && C46238a.m51546a(Float.valueOf(this.f142177q), Float.valueOf(te32.f142177q)) && C46238a.m51546a(Integer.valueOf(this.f142178r), Integer.valueOf(te32.f142178r)) && C46238a.m51546a(this.f142179s, te32.f142179s) && C46238a.m51546a(this.f142180t, te32.f142180t) && C46238a.m51546a(this.f142181u, te32.f142181u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142167d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74317d(2, this.f142168e);
            String str2 = this.f142169f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f142170g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f142171h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f142172i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f142173j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f142174n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f142175o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f142176p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            aVar.mo74317d(11, this.f142177q);
            aVar.mo74318e(12, this.f142178r);
            String str10 = this.f142179s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            aVar.mo74320g(14, 1, this.f142180t);
            String str11 = this.f142181u;
            if (str11 != null) {
                aVar.mo74323j(101, str11);
            }
            return 0;
        } else if (i2 == 1) {
            String str12 = this.f142167d;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            int d = i3 + C52418a.m58677d(2, this.f142168e);
            String str13 = this.f142169f;
            if (str13 != null) {
                d += C52418a.m58683j(3, str13);
            }
            String str14 = this.f142170g;
            if (str14 != null) {
                d += C52418a.m58683j(4, str14);
            }
            String str15 = this.f142171h;
            if (str15 != null) {
                d += C52418a.m58683j(5, str15);
            }
            String str16 = this.f142172i;
            if (str16 != null) {
                d += C52418a.m58683j(6, str16);
            }
            String str17 = this.f142173j;
            if (str17 != null) {
                d += C52418a.m58683j(7, str17);
            }
            String str18 = this.f142174n;
            if (str18 != null) {
                d += C52418a.m58683j(8, str18);
            }
            String str19 = this.f142175o;
            if (str19 != null) {
                d += C52418a.m58683j(9, str19);
            }
            String str20 = this.f142176p;
            if (str20 != null) {
                d += C52418a.m58683j(10, str20);
            }
            int d2 = d + C52418a.m58677d(11, this.f142177q) + C52418a.m58678e(12, this.f142178r);
            String str21 = this.f142179s;
            if (str21 != null) {
                d2 += C52418a.m58683j(13, str21);
            }
            int g = d2 + C52418a.m58680g(14, 1, this.f142180t);
            String str22 = this.f142181u;
            return str22 != null ? g + C52418a.m58683j(101, str22) : g;
        } else if (i2 == 2) {
            this.f142180t.clear();
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
            C51386te3 te32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 101) {
                switch (intValue) {
                    case 1:
                        te32.f142167d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        te32.f142168e = aVar3.mo141628f(intValue);
                        return 0;
                    case 3:
                        te32.f142169f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        te32.f142170g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        te32.f142171h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        te32.f142172i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        te32.f142173j = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        te32.f142174n = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        te32.f142175o = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        te32.f142176p = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        te32.f142177q = aVar3.mo141628f(intValue);
                        return 0;
                    case 12:
                        te32.f142178r = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        te32.f142179s = aVar3.mo141633k(intValue);
                        return 0;
                    case 14:
                        te32.f142180t.add(aVar3.mo141633k(intValue));
                        return 0;
                    default:
                        return -1;
                }
            } else {
                te32.f142181u = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
