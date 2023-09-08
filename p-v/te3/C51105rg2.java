package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rg2 */
public class C51105rg2 extends C47465a {

    /* renamed from: d */
    public String f140894d;

    /* renamed from: e */
    public String f140895e;

    /* renamed from: f */
    public long f140896f;

    /* renamed from: g */
    public int f140897g;

    /* renamed from: h */
    public int f140898h;

    /* renamed from: i */
    public int f140899i;

    /* renamed from: j */
    public int f140900j;

    /* renamed from: n */
    public int f140901n;

    /* renamed from: o */
    public String f140902o;

    /* renamed from: p */
    public String f140903p;

    /* renamed from: q */
    public String f140904q;

    /* renamed from: r */
    public String f140905r;

    /* renamed from: s */
    public String f140906s;

    /* renamed from: t */
    public String f140907t;

    /* renamed from: u */
    public int f140908u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51105rg2)) {
            return false;
        }
        C51105rg2 rg22 = (C51105rg2) aVar;
        return C46238a.m51546a(this.f140894d, rg22.f140894d) && C46238a.m51546a(this.f140895e, rg22.f140895e) && C46238a.m51546a(Long.valueOf(this.f140896f), Long.valueOf(rg22.f140896f)) && C46238a.m51546a(Integer.valueOf(this.f140897g), Integer.valueOf(rg22.f140897g)) && C46238a.m51546a(Integer.valueOf(this.f140898h), Integer.valueOf(rg22.f140898h)) && C46238a.m51546a(Integer.valueOf(this.f140899i), Integer.valueOf(rg22.f140899i)) && C46238a.m51546a(Integer.valueOf(this.f140900j), Integer.valueOf(rg22.f140900j)) && C46238a.m51546a(Integer.valueOf(this.f140901n), Integer.valueOf(rg22.f140901n)) && C46238a.m51546a(this.f140902o, rg22.f140902o) && C46238a.m51546a(this.f140903p, rg22.f140903p) && C46238a.m51546a(this.f140904q, rg22.f140904q) && C46238a.m51546a(this.f140905r, rg22.f140905r) && C46238a.m51546a(this.f140906s, rg22.f140906s) && C46238a.m51546a(this.f140907t, rg22.f140907t) && C46238a.m51546a(Integer.valueOf(this.f140908u), Integer.valueOf(rg22.f140908u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140894d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140895e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f140896f);
            aVar.mo74318e(4, this.f140897g);
            aVar.mo74318e(5, this.f140898h);
            aVar.mo74318e(6, this.f140899i);
            aVar.mo74318e(7, this.f140900j);
            aVar.mo74318e(8, this.f140901n);
            String str3 = this.f140902o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            String str4 = this.f140903p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            String str5 = this.f140904q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            String str6 = this.f140905r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            String str7 = this.f140906s;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            String str8 = this.f140907t;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            aVar.mo74318e(15, this.f140908u);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f140894d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f140895e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            int h = i3 + C52418a.m58681h(3, this.f140896f) + C52418a.m58678e(4, this.f140897g) + C52418a.m58678e(5, this.f140898h) + C52418a.m58678e(6, this.f140899i) + C52418a.m58678e(7, this.f140900j) + C52418a.m58678e(8, this.f140901n);
            String str11 = this.f140902o;
            if (str11 != null) {
                h += C52418a.m58683j(9, str11);
            }
            String str12 = this.f140903p;
            if (str12 != null) {
                h += C52418a.m58683j(10, str12);
            }
            String str13 = this.f140904q;
            if (str13 != null) {
                h += C52418a.m58683j(11, str13);
            }
            String str14 = this.f140905r;
            if (str14 != null) {
                h += C52418a.m58683j(12, str14);
            }
            String str15 = this.f140906s;
            if (str15 != null) {
                h += C52418a.m58683j(13, str15);
            }
            String str16 = this.f140907t;
            if (str16 != null) {
                h += C52418a.m58683j(14, str16);
            }
            return h + C52418a.m58678e(15, this.f140908u);
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
            C51105rg2 rg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rg22.f140894d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rg22.f140895e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rg22.f140896f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    rg22.f140897g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rg22.f140898h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rg22.f140899i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rg22.f140900j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rg22.f140901n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rg22.f140902o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    rg22.f140903p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    rg22.f140904q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    rg22.f140905r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    rg22.f140906s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    rg22.f140907t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    rg22.f140908u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
