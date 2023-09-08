package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ez */
public class C49352ez extends C47465a {

    /* renamed from: A */
    public LinkedList<C49821ia3> f133178A = new LinkedList<>();

    /* renamed from: B */
    public String f133179B;

    /* renamed from: C */
    public LinkedList<C49204dz> f133180C = new LinkedList<>();

    /* renamed from: D */
    public boolean f133181D;

    /* renamed from: d */
    public String f133182d;

    /* renamed from: e */
    public String f133183e;

    /* renamed from: f */
    public String f133184f;

    /* renamed from: g */
    public LinkedList<String> f133185g = new LinkedList<>();

    /* renamed from: h */
    public long f133186h;

    /* renamed from: i */
    public String f133187i;

    /* renamed from: j */
    public boolean f133188j;

    /* renamed from: n */
    public C49765hx0 f133189n;

    /* renamed from: o */
    public long f133190o;

    /* renamed from: p */
    public String f133191p;

    /* renamed from: q */
    public String f133192q;

    /* renamed from: r */
    public String f133193r;

    /* renamed from: s */
    public String f133194s;

    /* renamed from: t */
    public boolean f133195t;

    /* renamed from: u */
    public int f133196u;

    /* renamed from: v */
    public String f133197v;

    /* renamed from: w */
    public String f133198w;

    /* renamed from: x */
    public LinkedList<String> f133199x = new LinkedList<>();

    /* renamed from: y */
    public LinkedList<String> f133200y = new LinkedList<>();

    /* renamed from: z */
    public LinkedList<String> f133201z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49352ez)) {
            return false;
        }
        C49352ez ezVar = (C49352ez) aVar;
        return C46238a.m51546a(this.f133182d, ezVar.f133182d) && C46238a.m51546a(this.f133183e, ezVar.f133183e) && C46238a.m51546a(this.f133184f, ezVar.f133184f) && C46238a.m51546a(this.f133185g, ezVar.f133185g) && C46238a.m51546a(Long.valueOf(this.f133186h), Long.valueOf(ezVar.f133186h)) && C46238a.m51546a(this.f133187i, ezVar.f133187i) && C46238a.m51546a(Boolean.valueOf(this.f133188j), Boolean.valueOf(ezVar.f133188j)) && C46238a.m51546a(this.f133189n, ezVar.f133189n) && C46238a.m51546a(Long.valueOf(this.f133190o), Long.valueOf(ezVar.f133190o)) && C46238a.m51546a(this.f133191p, ezVar.f133191p) && C46238a.m51546a(this.f133192q, ezVar.f133192q) && C46238a.m51546a(this.f133193r, ezVar.f133193r) && C46238a.m51546a(this.f133194s, ezVar.f133194s) && C46238a.m51546a(Boolean.valueOf(this.f133195t), Boolean.valueOf(ezVar.f133195t)) && C46238a.m51546a(Integer.valueOf(this.f133196u), Integer.valueOf(ezVar.f133196u)) && C46238a.m51546a(this.f133197v, ezVar.f133197v) && C46238a.m51546a(this.f133198w, ezVar.f133198w) && C46238a.m51546a(this.f133199x, ezVar.f133199x) && C46238a.m51546a(this.f133200y, ezVar.f133200y) && C46238a.m51546a(this.f133201z, ezVar.f133201z) && C46238a.m51546a(this.f133178A, ezVar.f133178A) && C46238a.m51546a(this.f133179B, ezVar.f133179B) && C46238a.m51546a(this.f133180C, ezVar.f133180C) && C46238a.m51546a(Boolean.valueOf(this.f133181D), Boolean.valueOf(ezVar.f133181D));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133182d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133183e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133184f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74320g(4, 1, this.f133185g);
            aVar.mo74321h(5, this.f133186h);
            String str4 = this.f133187i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74314a(7, this.f133188j);
            C49765hx0 hx02 = this.f133189n;
            if (hx02 != null) {
                aVar.mo74322i(8, hx02.computeSize());
                this.f133189n.writeFields(aVar);
            }
            aVar.mo74321h(9, this.f133190o);
            String str5 = this.f133191p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.f133192q;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            String str7 = this.f133193r;
            if (str7 != null) {
                aVar.mo74323j(12, str7);
            }
            String str8 = this.f133194s;
            if (str8 != null) {
                aVar.mo74323j(13, str8);
            }
            aVar.mo74314a(14, this.f133195t);
            aVar.mo74318e(15, this.f133196u);
            String str9 = this.f133197v;
            if (str9 != null) {
                aVar.mo74323j(16, str9);
            }
            String str10 = this.f133198w;
            if (str10 != null) {
                aVar.mo74323j(17, str10);
            }
            aVar.mo74320g(18, 1, this.f133199x);
            aVar.mo74320g(19, 1, this.f133200y);
            aVar.mo74320g(20, 1, this.f133201z);
            aVar.mo74320g(24, 8, this.f133178A);
            String str11 = this.f133179B;
            if (str11 != null) {
                aVar.mo74323j(25, str11);
            }
            aVar.mo74320g(26, 8, this.f133180C);
            aVar.mo74314a(27, this.f133181D);
            return 0;
        } else if (i2 == 1) {
            String str12 = this.f133182d;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            String str13 = this.f133183e;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f133184f;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            int g = i3 + C52418a.m58680g(4, 1, this.f133185g) + C52418a.m58681h(5, this.f133186h);
            String str15 = this.f133187i;
            if (str15 != null) {
                g += C52418a.m58683j(6, str15);
            }
            int a = g + C52418a.m58674a(7, this.f133188j);
            C49765hx0 hx03 = this.f133189n;
            if (hx03 != null) {
                a += C52418a.m58682i(8, hx03.computeSize());
            }
            int h = a + C52418a.m58681h(9, this.f133190o);
            String str16 = this.f133191p;
            if (str16 != null) {
                h += C52418a.m58683j(10, str16);
            }
            String str17 = this.f133192q;
            if (str17 != null) {
                h += C52418a.m58683j(11, str17);
            }
            String str18 = this.f133193r;
            if (str18 != null) {
                h += C52418a.m58683j(12, str18);
            }
            String str19 = this.f133194s;
            if (str19 != null) {
                h += C52418a.m58683j(13, str19);
            }
            int a2 = h + C52418a.m58674a(14, this.f133195t) + C52418a.m58678e(15, this.f133196u);
            String str20 = this.f133197v;
            if (str20 != null) {
                a2 += C52418a.m58683j(16, str20);
            }
            String str21 = this.f133198w;
            if (str21 != null) {
                a2 += C52418a.m58683j(17, str21);
            }
            int g2 = a2 + C52418a.m58680g(18, 1, this.f133199x) + C52418a.m58680g(19, 1, this.f133200y) + C52418a.m58680g(20, 1, this.f133201z) + C52418a.m58680g(24, 8, this.f133178A);
            String str22 = this.f133179B;
            if (str22 != null) {
                g2 += C52418a.m58683j(25, str22);
            }
            return g2 + C52418a.m58680g(26, 8, this.f133180C) + C52418a.m58674a(27, this.f133181D);
        } else if (i2 == 2) {
            this.f133185g.clear();
            this.f133199x.clear();
            this.f133200y.clear();
            this.f133201z.clear();
            this.f133178A.clear();
            this.f133180C.clear();
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
            C49352ez ezVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ezVar.f133182d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ezVar.f133183e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ezVar.f133184f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ezVar.f133185g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    ezVar.f133186h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ezVar.f133187i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ezVar.f133188j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49765hx0 hx04 = new C49765hx0();
                        if (bArr != null && bArr.length > 0) {
                            hx04.parseFrom(bArr);
                        }
                        ezVar.f133189n = hx04;
                    }
                    return 0;
                case 9:
                    ezVar.f133190o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    ezVar.f133191p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ezVar.f133192q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ezVar.f133193r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ezVar.f133194s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ezVar.f133195t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    ezVar.f133196u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    ezVar.f133197v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    ezVar.f133198w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    ezVar.f133199x.add(aVar3.mo141633k(intValue));
                    return 0;
                case 19:
                    ezVar.f133200y.add(aVar3.mo141633k(intValue));
                    return 0;
                case 20:
                    ezVar.f133201z.add(aVar3.mo141633k(intValue));
                    return 0;
                case 24:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49821ia3 ia32 = new C49821ia3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ia32.parseFrom(bArr2);
                        }
                        ezVar.f133178A.add(ia32);
                    }
                    return 0;
                case 25:
                    ezVar.f133179B = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49204dz dzVar = new C49204dz();
                        if (bArr3 != null && bArr3.length > 0) {
                            dzVar.parseFrom(bArr3);
                        }
                        ezVar.f133180C.add(dzVar);
                    }
                    return 0;
                case 27:
                    ezVar.f133181D = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
