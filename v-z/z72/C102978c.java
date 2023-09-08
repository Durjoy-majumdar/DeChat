package z72;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: z72.c */
public class C102978c extends C47465a {

    /* renamed from: A */
    public String f303879A;

    /* renamed from: B */
    public C89349b f303880B;

    /* renamed from: C */
    public LinkedList<C53755a> f303881C = new LinkedList<>();

    /* renamed from: d */
    public long f303882d;

    /* renamed from: e */
    public int f303883e;

    /* renamed from: f */
    public int f303884f;

    /* renamed from: g */
    public long f303885g;

    /* renamed from: h */
    public String f303886h;

    /* renamed from: i */
    public String f303887i;

    /* renamed from: j */
    public String f303888j;

    /* renamed from: n */
    public String f303889n;

    /* renamed from: o */
    public String f303890o;

    /* renamed from: p */
    public long f303891p;

    /* renamed from: q */
    public int f303892q;

    /* renamed from: r */
    public int f303893r;

    /* renamed from: s */
    public String f303894s;

    /* renamed from: t */
    public int f303895t;

    /* renamed from: u */
    public int f303896u;

    /* renamed from: v */
    public int f303897v;

    /* renamed from: w */
    public String f303898w;

    /* renamed from: x */
    public String f303899x;

    /* renamed from: y */
    public String f303900y;

    /* renamed from: z */
    public int f303901z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C102978c)) {
            return false;
        }
        C102978c cVar = (C102978c) aVar;
        return C46238a.m51546a(Long.valueOf(this.f303882d), Long.valueOf(cVar.f303882d)) && C46238a.m51546a(Integer.valueOf(this.f303883e), Integer.valueOf(cVar.f303883e)) && C46238a.m51546a(Integer.valueOf(this.f303884f), Integer.valueOf(cVar.f303884f)) && C46238a.m51546a(Long.valueOf(this.f303885g), Long.valueOf(cVar.f303885g)) && C46238a.m51546a(this.f303886h, cVar.f303886h) && C46238a.m51546a(this.f303887i, cVar.f303887i) && C46238a.m51546a(this.f303888j, cVar.f303888j) && C46238a.m51546a(this.f303889n, cVar.f303889n) && C46238a.m51546a(this.f303890o, cVar.f303890o) && C46238a.m51546a(Long.valueOf(this.f303891p), Long.valueOf(cVar.f303891p)) && C46238a.m51546a(Integer.valueOf(this.f303892q), Integer.valueOf(cVar.f303892q)) && C46238a.m51546a(Integer.valueOf(this.f303893r), Integer.valueOf(cVar.f303893r)) && C46238a.m51546a(this.f303894s, cVar.f303894s) && C46238a.m51546a(Integer.valueOf(this.f303895t), Integer.valueOf(cVar.f303895t)) && C46238a.m51546a(Integer.valueOf(this.f303896u), Integer.valueOf(cVar.f303896u)) && C46238a.m51546a(Integer.valueOf(this.f303897v), Integer.valueOf(cVar.f303897v)) && C46238a.m51546a(this.f303898w, cVar.f303898w) && C46238a.m51546a(this.f303899x, cVar.f303899x) && C46238a.m51546a(this.f303900y, cVar.f303900y) && C46238a.m51546a(Integer.valueOf(this.f303901z), Integer.valueOf(cVar.f303901z)) && C46238a.m51546a(this.f303879A, cVar.f303879A) && C46238a.m51546a(this.f303880B, cVar.f303880B) && C46238a.m51546a(this.f303881C, cVar.f303881C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f303882d);
            aVar.mo74318e(2, this.f303883e);
            aVar.mo74318e(3, this.f303884f);
            aVar.mo74321h(4, this.f303885g);
            String str = this.f303886h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f303887i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f303888j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f303889n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f303890o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74321h(10, this.f303891p);
            aVar.mo74318e(11, this.f303892q);
            aVar.mo74318e(12, this.f303893r);
            String str6 = this.f303894s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            aVar.mo74318e(14, this.f303895t);
            aVar.mo74318e(15, this.f303896u);
            aVar.mo74318e(16, this.f303897v);
            String str7 = this.f303898w;
            if (str7 != null) {
                aVar.mo74323j(17, str7);
            }
            String str8 = this.f303899x;
            if (str8 != null) {
                aVar.mo74323j(18, str8);
            }
            String str9 = this.f303900y;
            if (str9 != null) {
                aVar.mo74323j(19, str9);
            }
            aVar.mo74318e(20, this.f303901z);
            String str10 = this.f303879A;
            if (str10 != null) {
                aVar.mo74323j(21, str10);
            }
            C89349b bVar = this.f303880B;
            if (bVar != null) {
                aVar.mo74315b(22, bVar);
            }
            aVar.mo74320g(23, 8, this.f303881C);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f303882d) + 0 + C52418a.m58678e(2, this.f303883e) + C52418a.m58678e(3, this.f303884f) + C52418a.m58681h(4, this.f303885g);
            String str11 = this.f303886h;
            if (str11 != null) {
                h += C52418a.m58683j(5, str11);
            }
            String str12 = this.f303887i;
            if (str12 != null) {
                h += C52418a.m58683j(6, str12);
            }
            String str13 = this.f303888j;
            if (str13 != null) {
                h += C52418a.m58683j(7, str13);
            }
            String str14 = this.f303889n;
            if (str14 != null) {
                h += C52418a.m58683j(8, str14);
            }
            String str15 = this.f303890o;
            if (str15 != null) {
                h += C52418a.m58683j(9, str15);
            }
            int h2 = h + C52418a.m58681h(10, this.f303891p) + C52418a.m58678e(11, this.f303892q) + C52418a.m58678e(12, this.f303893r);
            String str16 = this.f303894s;
            if (str16 != null) {
                h2 += C52418a.m58683j(13, str16);
            }
            int e = h2 + C52418a.m58678e(14, this.f303895t) + C52418a.m58678e(15, this.f303896u) + C52418a.m58678e(16, this.f303897v);
            String str17 = this.f303898w;
            if (str17 != null) {
                e += C52418a.m58683j(17, str17);
            }
            String str18 = this.f303899x;
            if (str18 != null) {
                e += C52418a.m58683j(18, str18);
            }
            String str19 = this.f303900y;
            if (str19 != null) {
                e += C52418a.m58683j(19, str19);
            }
            int e2 = e + C52418a.m58678e(20, this.f303901z);
            String str20 = this.f303879A;
            if (str20 != null) {
                e2 += C52418a.m58683j(21, str20);
            }
            C89349b bVar2 = this.f303880B;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(22, bVar2);
            }
            return e2 + C52418a.m58680g(23, 8, this.f303881C);
        } else if (i2 == 2) {
            this.f303881C.clear();
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
            C102978c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f303882d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    cVar.f303883e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cVar.f303884f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    cVar.f303885g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    cVar.f303886h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cVar.f303887i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cVar.f303888j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cVar.f303889n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cVar.f303890o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    cVar.f303891p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    cVar.f303892q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    cVar.f303893r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    cVar.f303894s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    cVar.f303895t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    cVar.f303896u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    cVar.f303897v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    cVar.f303898w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    cVar.f303899x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    cVar.f303900y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    cVar.f303901z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    cVar.f303879A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    cVar.f303880B = aVar3.mo141626d(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C53755a aVar4 = new C53755a();
                        if (bArr != null && bArr.length > 0) {
                            aVar4.parseFrom(bArr);
                        }
                        cVar.f303881C.add(aVar4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
