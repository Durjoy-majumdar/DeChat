package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c1 */
public class C118422c1 extends C47465a {

    /* renamed from: d */
    public String f353929d;

    /* renamed from: e */
    public String f353930e;

    /* renamed from: f */
    public int f353931f;

    /* renamed from: g */
    public String f353932g;

    /* renamed from: h */
    public String f353933h;

    /* renamed from: i */
    public String f353934i;

    /* renamed from: j */
    public int f353935j;

    /* renamed from: n */
    public int f353936n;

    /* renamed from: o */
    public int f353937o;

    /* renamed from: p */
    public String f353938p;

    /* renamed from: q */
    public int f353939q;

    /* renamed from: r */
    public String f353940r;

    /* renamed from: s */
    public String f353941s;

    /* renamed from: t */
    public int f353942t;

    /* renamed from: u */
    public String f353943u;

    /* renamed from: v */
    public String f353944v;

    /* renamed from: w */
    public int f353945w;

    /* renamed from: x */
    public j85 f353946x;

    /* renamed from: y */
    public g85 f353947y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118422c1)) {
            return false;
        }
        C118422c1 c1Var = (C118422c1) aVar;
        return C46238a.m51546a(this.f353929d, c1Var.f353929d) && C46238a.m51546a(this.f353930e, c1Var.f353930e) && C46238a.m51546a(Integer.valueOf(this.f353931f), Integer.valueOf(c1Var.f353931f)) && C46238a.m51546a(this.f353932g, c1Var.f353932g) && C46238a.m51546a(this.f353933h, c1Var.f353933h) && C46238a.m51546a(this.f353934i, c1Var.f353934i) && C46238a.m51546a(Integer.valueOf(this.f353935j), Integer.valueOf(c1Var.f353935j)) && C46238a.m51546a(Integer.valueOf(this.f353936n), Integer.valueOf(c1Var.f353936n)) && C46238a.m51546a(Integer.valueOf(this.f353937o), Integer.valueOf(c1Var.f353937o)) && C46238a.m51546a(this.f353938p, c1Var.f353938p) && C46238a.m51546a(Integer.valueOf(this.f353939q), Integer.valueOf(c1Var.f353939q)) && C46238a.m51546a(this.f353940r, c1Var.f353940r) && C46238a.m51546a(this.f353941s, c1Var.f353941s) && C46238a.m51546a(Integer.valueOf(this.f353942t), Integer.valueOf(c1Var.f353942t)) && C46238a.m51546a(this.f353943u, c1Var.f353943u) && C46238a.m51546a(this.f353944v, c1Var.f353944v) && C46238a.m51546a(Integer.valueOf(this.f353945w), Integer.valueOf(c1Var.f353945w)) && C46238a.m51546a(this.f353946x, c1Var.f353946x) && C46238a.m51546a(this.f353947y, c1Var.f353947y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353929d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f353930e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f353931f);
            String str3 = this.f353932g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f353933h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f353934i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(8, this.f353935j);
            aVar.mo74318e(9, this.f353936n);
            aVar.mo74318e(10, this.f353937o);
            String str6 = this.f353938p;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74318e(12, this.f353939q);
            String str7 = this.f353940r;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            String str8 = this.f353941s;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            aVar.mo74318e(15, this.f353942t);
            String str9 = this.f353943u;
            if (str9 != null) {
                aVar.mo74323j(16, str9);
            }
            String str10 = this.f353944v;
            if (str10 != null) {
                aVar.mo74323j(17, str10);
            }
            aVar.mo74318e(18, this.f353945w);
            j85 j85 = this.f353946x;
            if (j85 != null) {
                aVar.mo74322i(19, j85.computeSize());
                this.f353946x.writeFields(aVar);
            }
            g85 g85 = this.f353947y;
            if (g85 != null) {
                aVar.mo74322i(20, g85.computeSize());
                this.f353947y.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f353929d;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.f353930e;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            int e = i3 + C52418a.m58678e(3, this.f353931f);
            String str13 = this.f353932g;
            if (str13 != null) {
                e += C52418a.m58683j(4, str13);
            }
            String str14 = this.f353933h;
            if (str14 != null) {
                e += C52418a.m58683j(5, str14);
            }
            String str15 = this.f353934i;
            if (str15 != null) {
                e += C52418a.m58683j(6, str15);
            }
            int e2 = e + C52418a.m58678e(8, this.f353935j) + C52418a.m58678e(9, this.f353936n) + C52418a.m58678e(10, this.f353937o);
            String str16 = this.f353938p;
            if (str16 != null) {
                e2 += C52418a.m58683j(11, str16);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f353939q);
            String str17 = this.f353940r;
            if (str17 != null) {
                e3 += C52418a.m58683j(13, str17);
            }
            String str18 = this.f353941s;
            if (str18 != null) {
                e3 += C52418a.m58683j(14, str18);
            }
            int e4 = e3 + C52418a.m58678e(15, this.f353942t);
            String str19 = this.f353943u;
            if (str19 != null) {
                e4 += C52418a.m58683j(16, str19);
            }
            String str20 = this.f353944v;
            if (str20 != null) {
                e4 += C52418a.m58683j(17, str20);
            }
            int e5 = e4 + C52418a.m58678e(18, this.f353945w);
            j85 j852 = this.f353946x;
            if (j852 != null) {
                e5 += C52418a.m58682i(19, j852.computeSize());
            }
            g85 g852 = this.f353947y;
            return g852 != null ? e5 + C52418a.m58682i(20, g852.computeSize()) : e5;
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
            C118422c1 c1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c1Var.f353929d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    c1Var.f353930e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c1Var.f353931f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    c1Var.f353932g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c1Var.f353933h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    c1Var.f353934i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    c1Var.f353935j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    c1Var.f353936n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    c1Var.f353937o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    c1Var.f353938p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    c1Var.f353939q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    c1Var.f353940r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    c1Var.f353941s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    c1Var.f353942t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    c1Var.f353943u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    c1Var.f353944v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    c1Var.f353945w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        j85 j853 = new j85();
                        if (bArr != null && bArr.length > 0) {
                            j853.parseFrom(bArr);
                        }
                        c1Var.f353946x = j853;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        g85 g853 = new g85();
                        if (bArr2 != null && bArr2.length > 0) {
                            g853.parseFrom(bArr2);
                        }
                        c1Var.f353947y = g853;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
