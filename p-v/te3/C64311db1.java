package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.db1 */
public class C64311db1 extends C47465a {

    /* renamed from: d */
    public float f182661d;

    /* renamed from: e */
    public float f182662e;

    /* renamed from: f */
    public String f182663f;

    /* renamed from: g */
    public String f182664g;

    /* renamed from: h */
    public String f182665h;

    /* renamed from: i */
    public String f182666i;

    /* renamed from: j */
    public int f182667j;

    /* renamed from: n */
    public String f182668n;

    /* renamed from: o */
    public String f182669o;

    /* renamed from: p */
    public String f182670p;

    /* renamed from: q */
    public int f182671q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64311db1)) {
            return false;
        }
        C64311db1 db12 = (C64311db1) aVar;
        return C46238a.m51546a(Float.valueOf(this.f182661d), Float.valueOf(db12.f182661d)) && C46238a.m51546a(Float.valueOf(this.f182662e), Float.valueOf(db12.f182662e)) && C46238a.m51546a(this.f182663f, db12.f182663f) && C46238a.m51546a(this.f182664g, db12.f182664g) && C46238a.m51546a(this.f182665h, db12.f182665h) && C46238a.m51546a(this.f182666i, db12.f182666i) && C46238a.m51546a(Integer.valueOf(this.f182667j), Integer.valueOf(db12.f182667j)) && C46238a.m51546a(this.f182668n, db12.f182668n) && C46238a.m51546a(this.f182669o, db12.f182669o) && C46238a.m51546a(this.f182670p, db12.f182670p) && C46238a.m51546a(Integer.valueOf(this.f182671q), Integer.valueOf(db12.f182671q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f182661d);
            aVar.mo74317d(2, this.f182662e);
            String str = this.f182663f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f182664g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f182665h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f182666i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f182667j);
            String str5 = this.f182668n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f182669o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f182670p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f182671q);
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f182661d) + 0 + C52418a.m58677d(2, this.f182662e);
            String str8 = this.f182663f;
            if (str8 != null) {
                d += C52418a.m58683j(3, str8);
            }
            String str9 = this.f182664g;
            if (str9 != null) {
                d += C52418a.m58683j(4, str9);
            }
            String str10 = this.f182665h;
            if (str10 != null) {
                d += C52418a.m58683j(5, str10);
            }
            String str11 = this.f182666i;
            if (str11 != null) {
                d += C52418a.m58683j(6, str11);
            }
            int e = d + C52418a.m58678e(7, this.f182667j);
            String str12 = this.f182668n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            String str13 = this.f182669o;
            if (str13 != null) {
                e += C52418a.m58683j(9, str13);
            }
            String str14 = this.f182670p;
            if (str14 != null) {
                e += C52418a.m58683j(10, str14);
            }
            return e + C52418a.m58678e(11, this.f182671q);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64311db1 db12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    db12.f182661d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    db12.f182662e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    db12.f182663f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    db12.f182664g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    db12.f182665h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    db12.f182666i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    db12.f182667j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    db12.f182668n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    db12.f182669o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    db12.f182670p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    db12.f182671q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
