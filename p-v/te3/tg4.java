package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class tg4 extends C47465a {

    /* renamed from: d */
    public int f354435d;

    /* renamed from: e */
    public String f354436e;

    /* renamed from: f */
    public String f354437f;

    /* renamed from: g */
    public LinkedList<String> f354438g = new LinkedList<>();

    /* renamed from: h */
    public String f354439h;

    /* renamed from: i */
    public String f354440i;

    /* renamed from: j */
    public String f354441j;

    /* renamed from: n */
    public String f354442n;

    /* renamed from: o */
    public boolean f354443o;

    /* renamed from: p */
    public String f354444p;

    /* renamed from: q */
    public int f354445q;

    /* renamed from: r */
    public String f354446r;

    /* renamed from: s */
    public String f354447s;

    /* renamed from: t */
    public String f354448t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tg4)) {
            return false;
        }
        tg4 tg4 = (tg4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354435d), Integer.valueOf(tg4.f354435d)) && C46238a.m51546a(this.f354436e, tg4.f354436e) && C46238a.m51546a(this.f354437f, tg4.f354437f) && C46238a.m51546a(this.f354438g, tg4.f354438g) && C46238a.m51546a(this.f354439h, tg4.f354439h) && C46238a.m51546a(this.f354440i, tg4.f354440i) && C46238a.m51546a(this.f354441j, tg4.f354441j) && C46238a.m51546a(this.f354442n, tg4.f354442n) && C46238a.m51546a(Boolean.valueOf(this.f354443o), Boolean.valueOf(tg4.f354443o)) && C46238a.m51546a(this.f354444p, tg4.f354444p) && C46238a.m51546a(Integer.valueOf(this.f354445q), Integer.valueOf(tg4.f354445q)) && C46238a.m51546a(this.f354446r, tg4.f354446r) && C46238a.m51546a(this.f354447s, tg4.f354447s) && C46238a.m51546a(this.f354448t, tg4.f354448t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f354435d);
            String str = this.f354436e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f354437f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 1, this.f354438g);
            String str3 = this.f354439h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f354440i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f354441j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f354442n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74314a(9, this.f354443o);
            String str7 = this.f354444p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f354445q);
            String str8 = this.f354446r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            String str9 = this.f354447s;
            if (str9 != null) {
                aVar.mo74323j(13, str9);
            }
            String str10 = this.f354448t;
            if (str10 != null) {
                aVar.mo74323j(14, str10);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f354435d) + 0;
            String str11 = this.f354436e;
            if (str11 != null) {
                e += C52418a.m58683j(2, str11);
            }
            String str12 = this.f354437f;
            if (str12 != null) {
                e += C52418a.m58683j(3, str12);
            }
            int g = e + C52418a.m58680g(4, 1, this.f354438g);
            String str13 = this.f354439h;
            if (str13 != null) {
                g += C52418a.m58683j(5, str13);
            }
            String str14 = this.f354440i;
            if (str14 != null) {
                g += C52418a.m58683j(6, str14);
            }
            String str15 = this.f354441j;
            if (str15 != null) {
                g += C52418a.m58683j(7, str15);
            }
            String str16 = this.f354442n;
            if (str16 != null) {
                g += C52418a.m58683j(8, str16);
            }
            int a = g + C52418a.m58674a(9, this.f354443o);
            String str17 = this.f354444p;
            if (str17 != null) {
                a += C52418a.m58683j(10, str17);
            }
            int e2 = a + C52418a.m58678e(11, this.f354445q);
            String str18 = this.f354446r;
            if (str18 != null) {
                e2 += C52418a.m58683j(12, str18);
            }
            String str19 = this.f354447s;
            if (str19 != null) {
                e2 += C52418a.m58683j(13, str19);
            }
            String str20 = this.f354448t;
            return str20 != null ? e2 + C52418a.m58683j(14, str20) : e2;
        } else if (i2 == 2) {
            this.f354438g.clear();
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
            tg4 tg4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tg4.f354435d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    tg4.f354436e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tg4.f354437f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tg4.f354438g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    tg4.f354439h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tg4.f354440i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tg4.f354441j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tg4.f354442n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    tg4.f354443o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    tg4.f354444p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    tg4.f354445q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    tg4.f354446r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    tg4.f354447s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    tg4.f354448t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
