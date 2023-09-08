package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.l */
public class C102299l extends C47465a {

    /* renamed from: d */
    public boolean f301295d;

    /* renamed from: e */
    public boolean f301296e;

    /* renamed from: f */
    public boolean f301297f;

    /* renamed from: g */
    public String f301298g;

    /* renamed from: h */
    public String f301299h;

    /* renamed from: i */
    public String f301300i;

    /* renamed from: j */
    public String f301301j;

    /* renamed from: n */
    public String f301302n;

    /* renamed from: o */
    public LinkedList<C53008c0> f301303o = new LinkedList<>();

    /* renamed from: p */
    public long f301304p;

    /* renamed from: q */
    public long f301305q;

    /* renamed from: r */
    public long f301306r;

    /* renamed from: s */
    public String f301307s;

    /* renamed from: t */
    public String f301308t;

    /* renamed from: u */
    public int f301309u;

    /* renamed from: v */
    public String f301310v;

    /* renamed from: w */
    public String f301311w;

    /* renamed from: x */
    public String f301312x;

    /* renamed from: y */
    public String f301313y;

    /* renamed from: z */
    public C53016g0 f301314z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C102299l)) {
            return false;
        }
        C102299l lVar = (C102299l) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f301295d), Boolean.valueOf(lVar.f301295d)) && C46238a.m51546a(Boolean.valueOf(this.f301296e), Boolean.valueOf(lVar.f301296e)) && C46238a.m51546a(Boolean.valueOf(this.f301297f), Boolean.valueOf(lVar.f301297f)) && C46238a.m51546a(this.f301298g, lVar.f301298g) && C46238a.m51546a(this.f301299h, lVar.f301299h) && C46238a.m51546a(this.f301300i, lVar.f301300i) && C46238a.m51546a(this.f301301j, lVar.f301301j) && C46238a.m51546a(this.f301302n, lVar.f301302n) && C46238a.m51546a(this.f301303o, lVar.f301303o) && C46238a.m51546a(Long.valueOf(this.f301304p), Long.valueOf(lVar.f301304p)) && C46238a.m51546a(Long.valueOf(this.f301305q), Long.valueOf(lVar.f301305q)) && C46238a.m51546a(Long.valueOf(this.f301306r), Long.valueOf(lVar.f301306r)) && C46238a.m51546a(this.f301307s, lVar.f301307s) && C46238a.m51546a(this.f301308t, lVar.f301308t) && C46238a.m51546a(Integer.valueOf(this.f301309u), Integer.valueOf(lVar.f301309u)) && C46238a.m51546a(this.f301310v, lVar.f301310v) && C46238a.m51546a(this.f301311w, lVar.f301311w) && C46238a.m51546a(this.f301312x, lVar.f301312x) && C46238a.m51546a(this.f301313y, lVar.f301313y) && C46238a.m51546a(this.f301314z, lVar.f301314z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f301295d);
            aVar.mo74314a(2, this.f301296e);
            aVar.mo74314a(3, this.f301297f);
            String str = this.f301298g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f301299h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f301300i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f301301j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f301302n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74320g(9, 8, this.f301303o);
            aVar.mo74321h(10, this.f301304p);
            aVar.mo74321h(11, this.f301305q);
            aVar.mo74321h(12, this.f301306r);
            String str6 = this.f301307s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.f301308t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            aVar.mo74318e(15, this.f301309u);
            String str8 = this.f301310v;
            if (str8 != null) {
                aVar.mo74323j(16, str8);
            }
            String str9 = this.f301311w;
            if (str9 != null) {
                aVar.mo74323j(17, str9);
            }
            String str10 = this.f301312x;
            if (str10 != null) {
                aVar.mo74323j(18, str10);
            }
            String str11 = this.f301313y;
            if (str11 != null) {
                aVar.mo74323j(19, str11);
            }
            C53016g0 g0Var = this.f301314z;
            if (g0Var != null) {
                aVar.mo74322i(20, g0Var.computeSize());
                this.f301314z.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int a = C52418a.m58674a(1, this.f301295d) + 0 + C52418a.m58674a(2, this.f301296e) + C52418a.m58674a(3, this.f301297f);
            String str12 = this.f301298g;
            if (str12 != null) {
                a += C52418a.m58683j(4, str12);
            }
            String str13 = this.f301299h;
            if (str13 != null) {
                a += C52418a.m58683j(5, str13);
            }
            String str14 = this.f301300i;
            if (str14 != null) {
                a += C52418a.m58683j(6, str14);
            }
            String str15 = this.f301301j;
            if (str15 != null) {
                a += C52418a.m58683j(7, str15);
            }
            String str16 = this.f301302n;
            if (str16 != null) {
                a += C52418a.m58683j(8, str16);
            }
            int g = a + C52418a.m58680g(9, 8, this.f301303o) + C52418a.m58681h(10, this.f301304p) + C52418a.m58681h(11, this.f301305q) + C52418a.m58681h(12, this.f301306r);
            String str17 = this.f301307s;
            if (str17 != null) {
                g += C52418a.m58683j(13, str17);
            }
            String str18 = this.f301308t;
            if (str18 != null) {
                g += C52418a.m58683j(14, str18);
            }
            int e = g + C52418a.m58678e(15, this.f301309u);
            String str19 = this.f301310v;
            if (str19 != null) {
                e += C52418a.m58683j(16, str19);
            }
            String str20 = this.f301311w;
            if (str20 != null) {
                e += C52418a.m58683j(17, str20);
            }
            String str21 = this.f301312x;
            if (str21 != null) {
                e += C52418a.m58683j(18, str21);
            }
            String str22 = this.f301313y;
            if (str22 != null) {
                e += C52418a.m58683j(19, str22);
            }
            C53016g0 g0Var2 = this.f301314z;
            return g0Var2 != null ? e + C52418a.m58682i(20, g0Var2.computeSize()) : e;
        } else if (i2 == 2) {
            this.f301303o.clear();
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
            C102299l lVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lVar.f301295d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    lVar.f301296e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    lVar.f301297f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    lVar.f301298g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lVar.f301299h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lVar.f301300i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lVar.f301301j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lVar.f301302n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C53008c0 c0Var = new C53008c0();
                        if (bArr != null && bArr.length > 0) {
                            c0Var.parseFrom(bArr);
                        }
                        lVar.f301303o.add(c0Var);
                    }
                    return 0;
                case 10:
                    lVar.f301304p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    lVar.f301305q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    lVar.f301306r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    lVar.f301307s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    lVar.f301308t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    lVar.f301309u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    lVar.f301310v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    lVar.f301311w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    lVar.f301312x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    lVar.f301313y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C53016g0 g0Var3 = new C53016g0();
                        if (bArr2 != null && bArr2.length > 0) {
                            g0Var3.parseFrom(bArr2);
                        }
                        lVar.f301314z = g0Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
