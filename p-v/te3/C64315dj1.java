package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dj1 */
public class C64315dj1 extends C47465a {

    /* renamed from: d */
    public String f182742d;

    /* renamed from: e */
    public String f182743e;

    /* renamed from: f */
    public String f182744f;

    /* renamed from: g */
    public String f182745g;

    /* renamed from: h */
    public int f182746h;

    /* renamed from: i */
    public int f182747i;

    /* renamed from: j */
    public int f182748j;

    /* renamed from: n */
    public int f182749n;

    /* renamed from: o */
    public int f182750o;

    /* renamed from: p */
    public String f182751p;

    /* renamed from: q */
    public int f182752q;

    /* renamed from: r */
    public String f182753r;

    /* renamed from: s */
    public int f182754s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64315dj1)) {
            return false;
        }
        C64315dj1 dj12 = (C64315dj1) aVar;
        return C46238a.m51546a(this.f182742d, dj12.f182742d) && C46238a.m51546a(this.f182743e, dj12.f182743e) && C46238a.m51546a(this.f182744f, dj12.f182744f) && C46238a.m51546a(this.f182745g, dj12.f182745g) && C46238a.m51546a(Integer.valueOf(this.f182746h), Integer.valueOf(dj12.f182746h)) && C46238a.m51546a(Integer.valueOf(this.f182747i), Integer.valueOf(dj12.f182747i)) && C46238a.m51546a(Integer.valueOf(this.f182748j), Integer.valueOf(dj12.f182748j)) && C46238a.m51546a(Integer.valueOf(this.f182749n), Integer.valueOf(dj12.f182749n)) && C46238a.m51546a(Integer.valueOf(this.f182750o), Integer.valueOf(dj12.f182750o)) && C46238a.m51546a(this.f182751p, dj12.f182751p) && C46238a.m51546a(Integer.valueOf(this.f182752q), Integer.valueOf(dj12.f182752q)) && C46238a.m51546a(this.f182753r, dj12.f182753r) && C46238a.m51546a(Integer.valueOf(this.f182754s), Integer.valueOf(dj12.f182754s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182742d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182743e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182744f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f182745g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f182746h);
            aVar.mo74318e(6, this.f182747i);
            aVar.mo74318e(7, this.f182748j);
            aVar.mo74318e(8, this.f182749n);
            aVar.mo74318e(9, this.f182750o);
            String str5 = this.f182751p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            aVar.mo74318e(11, this.f182752q);
            String str6 = this.f182753r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            aVar.mo74318e(13, this.f182754s);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f182742d;
            int j = str7 != null ? 0 + C52418a.m58683j(1, str7) : 0;
            String str8 = this.f182743e;
            if (str8 != null) {
                j += C52418a.m58683j(2, str8);
            }
            String str9 = this.f182744f;
            if (str9 != null) {
                j += C52418a.m58683j(3, str9);
            }
            String str10 = this.f182745g;
            if (str10 != null) {
                j += C52418a.m58683j(4, str10);
            }
            int e = j + C52418a.m58678e(5, this.f182746h) + C52418a.m58678e(6, this.f182747i) + C52418a.m58678e(7, this.f182748j) + C52418a.m58678e(8, this.f182749n) + C52418a.m58678e(9, this.f182750o);
            String str11 = this.f182751p;
            if (str11 != null) {
                e += C52418a.m58683j(10, str11);
            }
            int e2 = e + C52418a.m58678e(11, this.f182752q);
            String str12 = this.f182753r;
            if (str12 != null) {
                e2 += C52418a.m58683j(12, str12);
            }
            return e2 + C52418a.m58678e(13, this.f182754s);
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
            C64315dj1 dj12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dj12.f182742d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dj12.f182743e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dj12.f182744f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dj12.f182745g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dj12.f182746h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dj12.f182747i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dj12.f182748j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    dj12.f182749n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    dj12.f182750o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    dj12.f182751p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    dj12.f182752q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    dj12.f182753r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    dj12.f182754s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
