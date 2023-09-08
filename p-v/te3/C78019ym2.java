package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ym2 */
public class C78019ym2 extends C47465a {

    /* renamed from: A */
    public String f228617A;

    /* renamed from: B */
    public C51043r10 f228618B;

    /* renamed from: C */
    public String f228619C;

    /* renamed from: D */
    public int f228620D;

    /* renamed from: E */
    public int f228621E;

    /* renamed from: d */
    public String f228622d;

    /* renamed from: e */
    public String f228623e;

    /* renamed from: f */
    public String f228624f;

    /* renamed from: g */
    public String f228625g;

    /* renamed from: h */
    public String f228626h;

    /* renamed from: i */
    public String f228627i;

    /* renamed from: j */
    public int f228628j;

    /* renamed from: n */
    public int f228629n;

    /* renamed from: o */
    public int f228630o;

    /* renamed from: p */
    public String f228631p;

    /* renamed from: q */
    public String f228632q;

    /* renamed from: r */
    public String f228633r;

    /* renamed from: s */
    public String f228634s;

    /* renamed from: t */
    public String f228635t;

    /* renamed from: u */
    public int f228636u;

    /* renamed from: v */
    public int f228637v;

    /* renamed from: w */
    public a94 f228638w;

    /* renamed from: x */
    public String f228639x;

    /* renamed from: y */
    public String f228640y;

    /* renamed from: z */
    public String f228641z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78019ym2)) {
            return false;
        }
        C78019ym2 ym22 = (C78019ym2) aVar;
        return C46238a.m51546a(this.f228622d, ym22.f228622d) && C46238a.m51546a(this.f228623e, ym22.f228623e) && C46238a.m51546a(this.f228624f, ym22.f228624f) && C46238a.m51546a(this.f228625g, ym22.f228625g) && C46238a.m51546a(this.f228626h, ym22.f228626h) && C46238a.m51546a(this.f228627i, ym22.f228627i) && C46238a.m51546a(Integer.valueOf(this.f228628j), Integer.valueOf(ym22.f228628j)) && C46238a.m51546a(Integer.valueOf(this.f228629n), Integer.valueOf(ym22.f228629n)) && C46238a.m51546a(Integer.valueOf(this.f228630o), Integer.valueOf(ym22.f228630o)) && C46238a.m51546a(this.f228631p, ym22.f228631p) && C46238a.m51546a(this.f228632q, ym22.f228632q) && C46238a.m51546a(this.f228633r, ym22.f228633r) && C46238a.m51546a(this.f228634s, ym22.f228634s) && C46238a.m51546a(this.f228635t, ym22.f228635t) && C46238a.m51546a(Integer.valueOf(this.f228636u), Integer.valueOf(ym22.f228636u)) && C46238a.m51546a(Integer.valueOf(this.f228637v), Integer.valueOf(ym22.f228637v)) && C46238a.m51546a(this.f228638w, ym22.f228638w) && C46238a.m51546a(this.f228639x, ym22.f228639x) && C46238a.m51546a(this.f228640y, ym22.f228640y) && C46238a.m51546a(this.f228641z, ym22.f228641z) && C46238a.m51546a(this.f228617A, ym22.f228617A) && C46238a.m51546a(this.f228618B, ym22.f228618B) && C46238a.m51546a(this.f228619C, ym22.f228619C) && C46238a.m51546a(Integer.valueOf(this.f228620D), Integer.valueOf(ym22.f228620D)) && C46238a.m51546a(Integer.valueOf(this.f228621E), Integer.valueOf(ym22.f228621E));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228622d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228623e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f228624f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f228625g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f228626h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f228627i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f228628j);
            aVar.mo74318e(8, this.f228629n);
            aVar.mo74318e(9, this.f228630o);
            String str7 = this.f228631p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f228632q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f228633r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f228634s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f228635t;
            if (str11 != null) {
                aVar.mo74323j(14, str11);
            }
            aVar.mo74318e(15, this.f228636u);
            aVar.mo74318e(19, this.f228637v);
            a94 a94 = this.f228638w;
            if (a94 != null) {
                aVar.mo74322i(20, a94.computeSize());
                this.f228638w.writeFields(aVar);
            }
            String str12 = this.f228639x;
            if (str12 != null) {
                aVar.mo74323j(21, str12);
            }
            String str13 = this.f228640y;
            if (str13 != null) {
                aVar.mo74323j(22, str13);
            }
            String str14 = this.f228641z;
            if (str14 != null) {
                aVar.mo74323j(23, str14);
            }
            String str15 = this.f228617A;
            if (str15 != null) {
                aVar.mo74323j(24, str15);
            }
            C51043r10 r102 = this.f228618B;
            if (r102 != null) {
                aVar.mo74322i(25, r102.computeSize());
                this.f228618B.writeFields(aVar);
            }
            String str16 = this.f228619C;
            if (str16 != null) {
                aVar.mo74323j(26, str16);
            }
            aVar.mo74318e(27, this.f228620D);
            aVar.mo74318e(28, this.f228621E);
            return 0;
        } else if (i2 == 1) {
            String str17 = this.f228622d;
            if (str17 != null) {
                i3 = C52418a.m58683j(1, str17) + 0;
            }
            String str18 = this.f228623e;
            if (str18 != null) {
                i3 += C52418a.m58683j(2, str18);
            }
            String str19 = this.f228624f;
            if (str19 != null) {
                i3 += C52418a.m58683j(3, str19);
            }
            String str20 = this.f228625g;
            if (str20 != null) {
                i3 += C52418a.m58683j(4, str20);
            }
            String str21 = this.f228626h;
            if (str21 != null) {
                i3 += C52418a.m58683j(5, str21);
            }
            String str22 = this.f228627i;
            if (str22 != null) {
                i3 += C52418a.m58683j(6, str22);
            }
            int e = i3 + C52418a.m58678e(7, this.f228628j) + C52418a.m58678e(8, this.f228629n) + C52418a.m58678e(9, this.f228630o);
            String str23 = this.f228631p;
            if (str23 != null) {
                e += C52418a.m58683j(10, str23);
            }
            String str24 = this.f228632q;
            if (str24 != null) {
                e += C52418a.m58683j(11, str24);
            }
            String str25 = this.f228633r;
            if (str25 != null) {
                e += C52418a.m58683j(12, str25);
            }
            String str26 = this.f228634s;
            if (str26 != null) {
                e += C52418a.m58683j(13, str26);
            }
            String str27 = this.f228635t;
            if (str27 != null) {
                e += C52418a.m58683j(14, str27);
            }
            int e2 = e + C52418a.m58678e(15, this.f228636u) + C52418a.m58678e(19, this.f228637v);
            a94 a942 = this.f228638w;
            if (a942 != null) {
                e2 += C52418a.m58682i(20, a942.computeSize());
            }
            String str28 = this.f228639x;
            if (str28 != null) {
                e2 += C52418a.m58683j(21, str28);
            }
            String str29 = this.f228640y;
            if (str29 != null) {
                e2 += C52418a.m58683j(22, str29);
            }
            String str30 = this.f228641z;
            if (str30 != null) {
                e2 += C52418a.m58683j(23, str30);
            }
            String str31 = this.f228617A;
            if (str31 != null) {
                e2 += C52418a.m58683j(24, str31);
            }
            C51043r10 r103 = this.f228618B;
            if (r103 != null) {
                e2 += C52418a.m58682i(25, r103.computeSize());
            }
            String str32 = this.f228619C;
            if (str32 != null) {
                e2 += C52418a.m58683j(26, str32);
            }
            return e2 + C52418a.m58678e(27, this.f228620D) + C52418a.m58678e(28, this.f228621E);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C78019ym2 ym22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ym22.f228622d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ym22.f228623e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ym22.f228624f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ym22.f228625g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ym22.f228626h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ym22.f228627i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ym22.f228628j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ym22.f228629n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ym22.f228630o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ym22.f228631p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ym22.f228632q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ym22.f228633r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ym22.f228634s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ym22.f228635t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ym22.f228636u = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    ym22.f228637v = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        a94 a943 = new a94();
                        if (bArr != null && bArr.length > 0) {
                            a943.parseFrom(bArr);
                        }
                        ym22.f228638w = a943;
                    }
                    return 0;
                case 21:
                    ym22.f228639x = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    ym22.f228640y = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    ym22.f228641z = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    ym22.f228617A = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51043r10 r104 = new C51043r10();
                        if (bArr2 != null && bArr2.length > 0) {
                            r104.parseFrom(bArr2);
                        }
                        ym22.f228618B = r104;
                    }
                    return 0;
                case 26:
                    ym22.f228619C = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    ym22.f228620D = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    ym22.f228621E = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
