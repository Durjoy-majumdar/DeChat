package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.h */
public class C47589h extends C47465a {

    /* renamed from: A */
    public int f127723A;

    /* renamed from: B */
    public C47707y2 f127724B;

    /* renamed from: C */
    public LinkedList<String> f127725C = new LinkedList<>();

    /* renamed from: d */
    public String f127726d;

    /* renamed from: e */
    public String f127727e;

    /* renamed from: f */
    public String f127728f;

    /* renamed from: g */
    public String f127729g;

    /* renamed from: h */
    public String f127730h;

    /* renamed from: i */
    public String f127731i;

    /* renamed from: j */
    public String f127732j;

    /* renamed from: n */
    public int f127733n;

    /* renamed from: o */
    public C47548b0 f127734o;

    /* renamed from: p */
    public int f127735p;

    /* renamed from: q */
    public int f127736q;

    /* renamed from: r */
    public String f127737r;

    /* renamed from: s */
    public boolean f127738s;

    /* renamed from: t */
    public LinkedList<String> f127739t = new LinkedList<>();

    /* renamed from: u */
    public boolean f127740u;

    /* renamed from: v */
    public int f127741v;

    /* renamed from: w */
    public boolean f127742w;

    /* renamed from: x */
    public boolean f127743x;

    /* renamed from: y */
    public boolean f127744y;

    /* renamed from: z */
    public C47635n3 f127745z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47589h)) {
            return false;
        }
        C47589h hVar = (C47589h) aVar;
        return C46238a.m51546a(this.f127726d, hVar.f127726d) && C46238a.m51546a(this.f127727e, hVar.f127727e) && C46238a.m51546a(this.f127728f, hVar.f127728f) && C46238a.m51546a(this.f127729g, hVar.f127729g) && C46238a.m51546a(this.f127730h, hVar.f127730h) && C46238a.m51546a(this.f127731i, hVar.f127731i) && C46238a.m51546a(this.f127732j, hVar.f127732j) && C46238a.m51546a(Integer.valueOf(this.f127733n), Integer.valueOf(hVar.f127733n)) && C46238a.m51546a(this.f127734o, hVar.f127734o) && C46238a.m51546a(Integer.valueOf(this.f127735p), Integer.valueOf(hVar.f127735p)) && C46238a.m51546a(Integer.valueOf(this.f127736q), Integer.valueOf(hVar.f127736q)) && C46238a.m51546a(this.f127737r, hVar.f127737r) && C46238a.m51546a(Boolean.valueOf(this.f127738s), Boolean.valueOf(hVar.f127738s)) && C46238a.m51546a(this.f127739t, hVar.f127739t) && C46238a.m51546a(Boolean.valueOf(this.f127740u), Boolean.valueOf(hVar.f127740u)) && C46238a.m51546a(Integer.valueOf(this.f127741v), Integer.valueOf(hVar.f127741v)) && C46238a.m51546a(Boolean.valueOf(this.f127742w), Boolean.valueOf(hVar.f127742w)) && C46238a.m51546a(Boolean.valueOf(this.f127743x), Boolean.valueOf(hVar.f127743x)) && C46238a.m51546a(Boolean.valueOf(this.f127744y), Boolean.valueOf(hVar.f127744y)) && C46238a.m51546a(this.f127745z, hVar.f127745z) && C46238a.m51546a(Integer.valueOf(this.f127723A), Integer.valueOf(hVar.f127723A)) && C46238a.m51546a(this.f127724B, hVar.f127724B) && C46238a.m51546a(this.f127725C, hVar.f127725C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127726d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f127727e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127727e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127728f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f127729g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f127730h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                String str6 = this.f127731i;
                if (str6 != null) {
                    aVar.mo74323j(6, str6);
                }
                String str7 = this.f127732j;
                if (str7 != null) {
                    aVar.mo74323j(7, str7);
                }
                aVar.mo74318e(8, this.f127733n);
                C47548b0 b0Var = this.f127734o;
                if (b0Var != null) {
                    aVar.mo74322i(9, b0Var.computeSize());
                    this.f127734o.writeFields(aVar);
                }
                aVar.mo74318e(10, this.f127735p);
                aVar.mo74318e(11, this.f127736q);
                String str8 = this.f127737r;
                if (str8 != null) {
                    aVar.mo74323j(12, str8);
                }
                aVar.mo74314a(13, this.f127738s);
                aVar.mo74320g(14, 1, this.f127739t);
                aVar.mo74314a(15, this.f127740u);
                aVar.mo74318e(16, this.f127741v);
                aVar.mo74314a(17, this.f127742w);
                aVar.mo74314a(18, this.f127743x);
                aVar.mo74314a(19, this.f127744y);
                C47635n3 n3Var = this.f127745z;
                if (n3Var != null) {
                    aVar.mo74322i(20, n3Var.computeSize());
                    this.f127745z.writeFields(aVar);
                }
                aVar.mo74318e(21, this.f127723A);
                C47707y2 y2Var = this.f127724B;
                if (y2Var != null) {
                    aVar.mo74322i(22, y2Var.computeSize());
                    this.f127724B.writeFields(aVar);
                }
                aVar.mo74320g(23, 1, this.f127725C);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: IconURL");
            }
        } else if (i2 == 1) {
            String str9 = this.f127726d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f127727e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f127728f;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f127729g;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f127730h;
            if (str13 != null) {
                i3 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f127731i;
            if (str14 != null) {
                i3 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f127732j;
            if (str15 != null) {
                i3 += C52418a.m58683j(7, str15);
            }
            int e = i3 + C52418a.m58678e(8, this.f127733n);
            C47548b0 b0Var2 = this.f127734o;
            if (b0Var2 != null) {
                e += C52418a.m58682i(9, b0Var2.computeSize());
            }
            int e2 = e + C52418a.m58678e(10, this.f127735p) + C52418a.m58678e(11, this.f127736q);
            String str16 = this.f127737r;
            if (str16 != null) {
                e2 += C52418a.m58683j(12, str16);
            }
            int a = e2 + C52418a.m58674a(13, this.f127738s) + C52418a.m58680g(14, 1, this.f127739t) + C52418a.m58674a(15, this.f127740u) + C52418a.m58678e(16, this.f127741v) + C52418a.m58674a(17, this.f127742w) + C52418a.m58674a(18, this.f127743x) + C52418a.m58674a(19, this.f127744y);
            C47635n3 n3Var2 = this.f127745z;
            if (n3Var2 != null) {
                a += C52418a.m58682i(20, n3Var2.computeSize());
            }
            int e3 = a + C52418a.m58678e(21, this.f127723A);
            C47707y2 y2Var2 = this.f127724B;
            if (y2Var2 != null) {
                e3 += C52418a.m58682i(22, y2Var2.computeSize());
            }
            return e3 + C52418a.m58680g(23, 1, this.f127725C);
        } else if (i2 == 2) {
            this.f127739t.clear();
            this.f127725C.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127726d == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f127727e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: IconURL");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47589h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hVar.f127726d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hVar.f127727e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hVar.f127728f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hVar.f127729g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hVar.f127730h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hVar.f127731i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hVar.f127732j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hVar.f127733n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C47548b0 b0Var3 = new C47548b0();
                        if (bArr != null && bArr.length > 0) {
                            b0Var3.parseFrom(bArr);
                        }
                        hVar.f127734o = b0Var3;
                    }
                    return 0;
                case 10:
                    hVar.f127735p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    hVar.f127736q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    hVar.f127737r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    hVar.f127738s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    hVar.f127739t.add(aVar3.mo141633k(intValue));
                    return 0;
                case 15:
                    hVar.f127740u = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    hVar.f127741v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    hVar.f127742w = aVar3.mo141625c(intValue);
                    return 0;
                case 18:
                    hVar.f127743x = aVar3.mo141625c(intValue);
                    return 0;
                case 19:
                    hVar.f127744y = aVar3.mo141625c(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C47635n3 n3Var3 = new C47635n3();
                        if (bArr2 != null && bArr2.length > 0) {
                            n3Var3.parseFrom(bArr2);
                        }
                        hVar.f127745z = n3Var3;
                    }
                    return 0;
                case 21:
                    hVar.f127723A = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C47707y2 y2Var3 = new C47707y2();
                        if (bArr3 != null && bArr3.length > 0) {
                            y2Var3.parseFrom(bArr3);
                        }
                        hVar.f127724B = y2Var3;
                    }
                    return 0;
                case 23:
                    hVar.f127725C.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
