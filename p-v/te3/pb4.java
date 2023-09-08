package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class pb4 extends C47465a {

    /* renamed from: d */
    public long f299117d;

    /* renamed from: e */
    public int f299118e;

    /* renamed from: f */
    public String f299119f;

    /* renamed from: g */
    public String f299120g;

    /* renamed from: h */
    public String f299121h;

    /* renamed from: i */
    public int f299122i;

    /* renamed from: j */
    public String f299123j;

    /* renamed from: n */
    public int f299124n;

    /* renamed from: o */
    public int f299125o;

    /* renamed from: p */
    public int f299126p;

    /* renamed from: q */
    public int f299127q;

    /* renamed from: r */
    public String f299128r;

    /* renamed from: s */
    public String f299129s;

    /* renamed from: t */
    public int f299130t;

    /* renamed from: u */
    public int f299131u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pb4)) {
            return false;
        }
        pb4 pb4 = (pb4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f299117d), Long.valueOf(pb4.f299117d)) && C46238a.m51546a(Integer.valueOf(this.f299118e), Integer.valueOf(pb4.f299118e)) && C46238a.m51546a(this.f299119f, pb4.f299119f) && C46238a.m51546a(this.f299120g, pb4.f299120g) && C46238a.m51546a(this.f299121h, pb4.f299121h) && C46238a.m51546a(Integer.valueOf(this.f299122i), Integer.valueOf(pb4.f299122i)) && C46238a.m51546a(this.f299123j, pb4.f299123j) && C46238a.m51546a(Integer.valueOf(this.f299124n), Integer.valueOf(pb4.f299124n)) && C46238a.m51546a(Integer.valueOf(this.f299125o), Integer.valueOf(pb4.f299125o)) && C46238a.m51546a(Integer.valueOf(this.f299126p), Integer.valueOf(pb4.f299126p)) && C46238a.m51546a(Integer.valueOf(this.f299127q), Integer.valueOf(pb4.f299127q)) && C46238a.m51546a(this.f299128r, pb4.f299128r) && C46238a.m51546a(this.f299129s, pb4.f299129s) && C46238a.m51546a(Integer.valueOf(this.f299130t), Integer.valueOf(pb4.f299130t)) && C46238a.m51546a(Integer.valueOf(this.f299131u), Integer.valueOf(pb4.f299131u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299119f == null) {
                throw new C52419b("Not all required fields were included: fromUser");
            } else if (this.f299120g != null) {
                aVar.mo74321h(1, this.f299117d);
                aVar.mo74318e(2, this.f299118e);
                String str = this.f299119f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f299120g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f299121h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f299122i);
                String str4 = this.f299123j;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74318e(8, this.f299124n);
                aVar.mo74318e(9, this.f299125o);
                aVar.mo74318e(10, this.f299126p);
                aVar.mo74318e(11, this.f299127q);
                String str5 = this.f299128r;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
                }
                String str6 = this.f299129s;
                if (str6 != null) {
                    aVar.mo74323j(13, str6);
                }
                aVar.mo74318e(14, this.f299130t);
                aVar.mo74318e(15, this.f299131u);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: toUser");
            }
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f299117d) + 0 + C52418a.m58678e(2, this.f299118e);
            String str7 = this.f299119f;
            if (str7 != null) {
                h += C52418a.m58683j(3, str7);
            }
            String str8 = this.f299120g;
            if (str8 != null) {
                h += C52418a.m58683j(4, str8);
            }
            String str9 = this.f299121h;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            int e = h + C52418a.m58678e(6, this.f299122i);
            String str10 = this.f299123j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            int e2 = e + C52418a.m58678e(8, this.f299124n) + C52418a.m58678e(9, this.f299125o) + C52418a.m58678e(10, this.f299126p) + C52418a.m58678e(11, this.f299127q);
            String str11 = this.f299128r;
            if (str11 != null) {
                e2 += C52418a.m58683j(12, str11);
            }
            String str12 = this.f299129s;
            if (str12 != null) {
                e2 += C52418a.m58683j(13, str12);
            }
            return e2 + C52418a.m58678e(14, this.f299130t) + C52418a.m58678e(15, this.f299131u);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299119f == null) {
                throw new C52419b("Not all required fields were included: fromUser");
            } else if (this.f299120g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: toUser");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            pb4 pb4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pb4.f299117d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    pb4.f299118e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    pb4.f299119f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pb4.f299120g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pb4.f299121h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pb4.f299122i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pb4.f299123j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pb4.f299124n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pb4.f299125o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    pb4.f299126p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    pb4.f299127q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    pb4.f299128r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    pb4.f299129s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    pb4.f299130t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    pb4.f299131u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
