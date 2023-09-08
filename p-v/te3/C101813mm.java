package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mm */
public class C101813mm extends C101820nt3 {

    /* renamed from: A */
    public String f298833A;

    /* renamed from: B */
    public String f298834B;

    /* renamed from: C */
    public String f298835C;

    /* renamed from: D */
    public String f298836D;

    /* renamed from: E */
    public String f298837E;

    /* renamed from: F */
    public String f298838F;

    /* renamed from: G */
    public String f298839G;

    /* renamed from: H */
    public String f298840H;

    /* renamed from: I */
    public int f298841I;

    /* renamed from: d */
    public String f298842d;

    /* renamed from: e */
    public String f298843e;

    /* renamed from: f */
    public String f298844f;

    /* renamed from: g */
    public int f298845g;

    /* renamed from: h */
    public int f298846h;

    /* renamed from: i */
    public String f298847i;

    /* renamed from: j */
    public C51018qv3 f298848j;

    /* renamed from: n */
    public int f298849n;

    /* renamed from: o */
    public float f298850o;

    /* renamed from: p */
    public float f298851p;

    /* renamed from: q */
    public String f298852q;

    /* renamed from: r */
    public int f298853r;

    /* renamed from: s */
    public int f298854s;

    /* renamed from: t */
    public int f298855t;

    /* renamed from: u */
    public int f298856u;

    /* renamed from: v */
    public String f298857v;

    /* renamed from: w */
    public int f298858w;

    /* renamed from: x */
    public int f298859x;

    /* renamed from: y */
    public int f298860y;

    /* renamed from: z */
    public int f298861z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101813mm)) {
            return false;
        }
        C101813mm mmVar = (C101813mm) aVar;
        return C46238a.m51546a(this.f298842d, mmVar.f298842d) && C46238a.m51546a(this.f298843e, mmVar.f298843e) && C46238a.m51546a(this.f298844f, mmVar.f298844f) && C46238a.m51546a(Integer.valueOf(this.f298845g), Integer.valueOf(mmVar.f298845g)) && C46238a.m51546a(Integer.valueOf(this.f298846h), Integer.valueOf(mmVar.f298846h)) && C46238a.m51546a(this.f298847i, mmVar.f298847i) && C46238a.m51546a(this.f298848j, mmVar.f298848j) && C46238a.m51546a(Integer.valueOf(this.f298849n), Integer.valueOf(mmVar.f298849n)) && C46238a.m51546a(Float.valueOf(this.f298850o), Float.valueOf(mmVar.f298850o)) && C46238a.m51546a(Float.valueOf(this.f298851p), Float.valueOf(mmVar.f298851p)) && C46238a.m51546a(this.f298852q, mmVar.f298852q) && C46238a.m51546a(Integer.valueOf(this.f298853r), Integer.valueOf(mmVar.f298853r)) && C46238a.m51546a(Integer.valueOf(this.f298854s), Integer.valueOf(mmVar.f298854s)) && C46238a.m51546a(Integer.valueOf(this.f298855t), Integer.valueOf(mmVar.f298855t)) && C46238a.m51546a(Integer.valueOf(this.f298856u), Integer.valueOf(mmVar.f298856u)) && C46238a.m51546a(this.f298857v, mmVar.f298857v) && C46238a.m51546a(Integer.valueOf(this.f298858w), Integer.valueOf(mmVar.f298858w)) && C46238a.m51546a(Integer.valueOf(this.f298859x), Integer.valueOf(mmVar.f298859x)) && C46238a.m51546a(Integer.valueOf(this.f298860y), Integer.valueOf(mmVar.f298860y)) && C46238a.m51546a(Integer.valueOf(this.f298861z), Integer.valueOf(mmVar.f298861z)) && C46238a.m51546a(this.f298833A, mmVar.f298833A) && C46238a.m51546a(this.f298834B, mmVar.f298834B) && C46238a.m51546a(this.f298835C, mmVar.f298835C) && C46238a.m51546a(this.f298836D, mmVar.f298836D) && C46238a.m51546a(this.f298837E, mmVar.f298837E) && C46238a.m51546a(this.f298838F, mmVar.f298838F) && C46238a.m51546a(this.f298839G, mmVar.f298839G) && C46238a.m51546a(this.f298840H, mmVar.f298840H) && C46238a.m51546a(Integer.valueOf(this.f298841I), Integer.valueOf(mmVar.f298841I));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298842d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298843e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f298844f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f298845g);
            aVar.mo74318e(5, this.f298846h);
            String str4 = this.f298847i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C51018qv3 qv32 = this.f298848j;
            if (qv32 != null) {
                aVar.mo74322i(7, qv32.computeSize());
                this.f298848j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f298849n);
            aVar.mo74317d(9, this.f298850o);
            aVar.mo74317d(10, this.f298851p);
            String str5 = this.f298852q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            aVar.mo74318e(12, this.f298853r);
            aVar.mo74318e(13, this.f298854s);
            aVar.mo74318e(14, this.f298855t);
            aVar.mo74318e(15, this.f298856u);
            String str6 = this.f298857v;
            if (str6 != null) {
                aVar.mo74323j(16, str6);
            }
            aVar.mo74318e(17, this.f298858w);
            aVar.mo74318e(18, this.f298859x);
            aVar.mo74318e(19, this.f298860y);
            aVar.mo74318e(20, this.f298861z);
            String str7 = this.f298833A;
            if (str7 != null) {
                aVar.mo74323j(21, str7);
            }
            String str8 = this.f298834B;
            if (str8 != null) {
                aVar.mo74323j(22, str8);
            }
            String str9 = this.f298835C;
            if (str9 != null) {
                aVar.mo74323j(23, str9);
            }
            String str10 = this.f298836D;
            if (str10 != null) {
                aVar.mo74323j(24, str10);
            }
            String str11 = this.f298837E;
            if (str11 != null) {
                aVar.mo74323j(25, str11);
            }
            String str12 = this.f298838F;
            if (str12 != null) {
                aVar.mo74323j(26, str12);
            }
            String str13 = this.f298839G;
            if (str13 != null) {
                aVar.mo74323j(27, str13);
            }
            String str14 = this.f298840H;
            if (str14 != null) {
                aVar.mo74323j(28, str14);
            }
            aVar.mo74318e(29, this.f298841I);
            return 0;
        } else if (i2 == 1) {
            String str15 = this.f298842d;
            if (str15 != null) {
                i3 = C52418a.m58683j(1, str15) + 0;
            }
            String str16 = this.f298843e;
            if (str16 != null) {
                i3 += C52418a.m58683j(2, str16);
            }
            String str17 = this.f298844f;
            if (str17 != null) {
                i3 += C52418a.m58683j(3, str17);
            }
            int e = i3 + C52418a.m58678e(4, this.f298845g) + C52418a.m58678e(5, this.f298846h);
            String str18 = this.f298847i;
            if (str18 != null) {
                e += C52418a.m58683j(6, str18);
            }
            C51018qv3 qv33 = this.f298848j;
            if (qv33 != null) {
                e += C52418a.m58682i(7, qv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f298849n) + C52418a.m58677d(9, this.f298850o) + C52418a.m58677d(10, this.f298851p);
            String str19 = this.f298852q;
            if (str19 != null) {
                e2 += C52418a.m58683j(11, str19);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f298853r) + C52418a.m58678e(13, this.f298854s) + C52418a.m58678e(14, this.f298855t) + C52418a.m58678e(15, this.f298856u);
            String str20 = this.f298857v;
            if (str20 != null) {
                e3 += C52418a.m58683j(16, str20);
            }
            int e4 = e3 + C52418a.m58678e(17, this.f298858w) + C52418a.m58678e(18, this.f298859x) + C52418a.m58678e(19, this.f298860y) + C52418a.m58678e(20, this.f298861z);
            String str21 = this.f298833A;
            if (str21 != null) {
                e4 += C52418a.m58683j(21, str21);
            }
            String str22 = this.f298834B;
            if (str22 != null) {
                e4 += C52418a.m58683j(22, str22);
            }
            String str23 = this.f298835C;
            if (str23 != null) {
                e4 += C52418a.m58683j(23, str23);
            }
            String str24 = this.f298836D;
            if (str24 != null) {
                e4 += C52418a.m58683j(24, str24);
            }
            String str25 = this.f298837E;
            if (str25 != null) {
                e4 += C52418a.m58683j(25, str25);
            }
            String str26 = this.f298838F;
            if (str26 != null) {
                e4 += C52418a.m58683j(26, str26);
            }
            String str27 = this.f298839G;
            if (str27 != null) {
                e4 += C52418a.m58683j(27, str27);
            }
            String str28 = this.f298840H;
            if (str28 != null) {
                e4 += C52418a.m58683j(28, str28);
            }
            return e4 + C52418a.m58678e(29, this.f298841I);
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
            C101813mm mmVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mmVar.f298842d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    mmVar.f298843e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mmVar.f298844f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mmVar.f298845g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mmVar.f298846h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mmVar.f298847i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        mmVar.f298848j = qv34;
                    }
                    return 0;
                case 8:
                    mmVar.f298849n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mmVar.f298850o = aVar3.mo141628f(intValue);
                    return 0;
                case 10:
                    mmVar.f298851p = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    mmVar.f298852q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    mmVar.f298853r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    mmVar.f298854s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    mmVar.f298855t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    mmVar.f298856u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    mmVar.f298857v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    mmVar.f298858w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    mmVar.f298859x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    mmVar.f298860y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    mmVar.f298861z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    mmVar.f298833A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    mmVar.f298834B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    mmVar.f298835C = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    mmVar.f298836D = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    mmVar.f298837E = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    mmVar.f298838F = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    mmVar.f298839G = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    mmVar.f298840H = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    mmVar.f298841I = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
