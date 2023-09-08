package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pv2 */
public class C50882pv2 extends C47465a {

    /* renamed from: A */
    public String f140002A;

    /* renamed from: B */
    public int f140003B;

    /* renamed from: C */
    public int f140004C;

    /* renamed from: D */
    public int f140005D;

    /* renamed from: E */
    public String f140006E;

    /* renamed from: d */
    public long f140007d;

    /* renamed from: e */
    public int f140008e;

    /* renamed from: f */
    public C51305sv2 f140009f;

    /* renamed from: g */
    public int f140010g;

    /* renamed from: h */
    public int f140011h;

    /* renamed from: i */
    public int f140012i;

    /* renamed from: j */
    public int f140013j;

    /* renamed from: n */
    public int f140014n;

    /* renamed from: o */
    public int f140015o;

    /* renamed from: p */
    public String f140016p;

    /* renamed from: q */
    public boolean f140017q;

    /* renamed from: r */
    public int f140018r;

    /* renamed from: s */
    public String f140019s;

    /* renamed from: t */
    public int f140020t;

    /* renamed from: u */
    public int f140021u;

    /* renamed from: v */
    public int f140022v;

    /* renamed from: w */
    public String f140023w;

    /* renamed from: x */
    public int f140024x;

    /* renamed from: y */
    public C52028xv2 f140025y;

    /* renamed from: z */
    public int f140026z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50882pv2)) {
            return false;
        }
        C50882pv2 pv22 = (C50882pv2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140007d), Long.valueOf(pv22.f140007d)) && C46238a.m51546a(Integer.valueOf(this.f140008e), Integer.valueOf(pv22.f140008e)) && C46238a.m51546a(this.f140009f, pv22.f140009f) && C46238a.m51546a(Integer.valueOf(this.f140010g), Integer.valueOf(pv22.f140010g)) && C46238a.m51546a(Integer.valueOf(this.f140011h), Integer.valueOf(pv22.f140011h)) && C46238a.m51546a(Integer.valueOf(this.f140012i), Integer.valueOf(pv22.f140012i)) && C46238a.m51546a(Integer.valueOf(this.f140013j), Integer.valueOf(pv22.f140013j)) && C46238a.m51546a(Integer.valueOf(this.f140014n), Integer.valueOf(pv22.f140014n)) && C46238a.m51546a(Integer.valueOf(this.f140015o), Integer.valueOf(pv22.f140015o)) && C46238a.m51546a(this.f140016p, pv22.f140016p) && C46238a.m51546a(Boolean.valueOf(this.f140017q), Boolean.valueOf(pv22.f140017q)) && C46238a.m51546a(Integer.valueOf(this.f140018r), Integer.valueOf(pv22.f140018r)) && C46238a.m51546a(this.f140019s, pv22.f140019s) && C46238a.m51546a(Integer.valueOf(this.f140020t), Integer.valueOf(pv22.f140020t)) && C46238a.m51546a(Integer.valueOf(this.f140021u), Integer.valueOf(pv22.f140021u)) && C46238a.m51546a(Integer.valueOf(this.f140022v), Integer.valueOf(pv22.f140022v)) && C46238a.m51546a(this.f140023w, pv22.f140023w) && C46238a.m51546a(Integer.valueOf(this.f140024x), Integer.valueOf(pv22.f140024x)) && C46238a.m51546a(this.f140025y, pv22.f140025y) && C46238a.m51546a(Integer.valueOf(this.f140026z), Integer.valueOf(pv22.f140026z)) && C46238a.m51546a(this.f140002A, pv22.f140002A) && C46238a.m51546a(Integer.valueOf(this.f140003B), Integer.valueOf(pv22.f140003B)) && C46238a.m51546a(Integer.valueOf(this.f140004C), Integer.valueOf(pv22.f140004C)) && C46238a.m51546a(Integer.valueOf(this.f140005D), Integer.valueOf(pv22.f140005D)) && C46238a.m51546a(this.f140006E, pv22.f140006E);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140007d);
            aVar.mo74318e(2, this.f140008e);
            C51305sv2 sv22 = this.f140009f;
            if (sv22 != null) {
                aVar.mo74322i(3, sv22.computeSize());
                this.f140009f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f140010g);
            aVar.mo74318e(5, this.f140011h);
            aVar.mo74318e(6, this.f140012i);
            aVar.mo74318e(7, this.f140013j);
            aVar.mo74318e(8, this.f140014n);
            aVar.mo74318e(9, this.f140015o);
            String str = this.f140016p;
            if (str != null) {
                aVar.mo74323j(10, str);
            }
            aVar.mo74314a(11, this.f140017q);
            aVar.mo74318e(12, this.f140018r);
            String str2 = this.f140019s;
            if (str2 != null) {
                aVar.mo74323j(13, str2);
            }
            aVar.mo74318e(14, this.f140020t);
            aVar.mo74318e(15, this.f140021u);
            aVar.mo74318e(16, this.f140022v);
            String str3 = this.f140023w;
            if (str3 != null) {
                aVar.mo74323j(17, str3);
            }
            aVar.mo74318e(18, this.f140024x);
            C52028xv2 xv22 = this.f140025y;
            if (xv22 != null) {
                aVar.mo74322i(19, xv22.computeSize());
                this.f140025y.writeFields(aVar);
            }
            aVar.mo74318e(20, this.f140026z);
            String str4 = this.f140002A;
            if (str4 != null) {
                aVar.mo74323j(21, str4);
            }
            aVar.mo74318e(22, this.f140003B);
            aVar.mo74318e(23, this.f140004C);
            aVar.mo74318e(24, this.f140005D);
            String str5 = this.f140006E;
            if (str5 != null) {
                aVar.mo74323j(25, str5);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f140007d) + 0 + C52418a.m58678e(2, this.f140008e);
            C51305sv2 sv23 = this.f140009f;
            if (sv23 != null) {
                h += C52418a.m58682i(3, sv23.computeSize());
            }
            int e = h + C52418a.m58678e(4, this.f140010g) + C52418a.m58678e(5, this.f140011h) + C52418a.m58678e(6, this.f140012i) + C52418a.m58678e(7, this.f140013j) + C52418a.m58678e(8, this.f140014n) + C52418a.m58678e(9, this.f140015o);
            String str6 = this.f140016p;
            if (str6 != null) {
                e += C52418a.m58683j(10, str6);
            }
            int a = e + C52418a.m58674a(11, this.f140017q) + C52418a.m58678e(12, this.f140018r);
            String str7 = this.f140019s;
            if (str7 != null) {
                a += C52418a.m58683j(13, str7);
            }
            int e2 = a + C52418a.m58678e(14, this.f140020t) + C52418a.m58678e(15, this.f140021u) + C52418a.m58678e(16, this.f140022v);
            String str8 = this.f140023w;
            if (str8 != null) {
                e2 += C52418a.m58683j(17, str8);
            }
            int e3 = e2 + C52418a.m58678e(18, this.f140024x);
            C52028xv2 xv23 = this.f140025y;
            if (xv23 != null) {
                e3 += C52418a.m58682i(19, xv23.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(20, this.f140026z);
            String str9 = this.f140002A;
            if (str9 != null) {
                e4 += C52418a.m58683j(21, str9);
            }
            int e5 = e4 + C52418a.m58678e(22, this.f140003B) + C52418a.m58678e(23, this.f140004C) + C52418a.m58678e(24, this.f140005D);
            String str10 = this.f140006E;
            return str10 != null ? e5 + C52418a.m58683j(25, str10) : e5;
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
            C50882pv2 pv22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pv22.f140007d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    pv22.f140008e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51305sv2 sv24 = new C51305sv2();
                        if (bArr != null && bArr.length > 0) {
                            sv24.parseFrom(bArr);
                        }
                        pv22.f140009f = sv24;
                    }
                    return 0;
                case 4:
                    pv22.f140010g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    pv22.f140011h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pv22.f140012i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pv22.f140013j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pv22.f140014n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pv22.f140015o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    pv22.f140016p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    pv22.f140017q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    pv22.f140018r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    pv22.f140019s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    pv22.f140020t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    pv22.f140021u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    pv22.f140022v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    pv22.f140023w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    pv22.f140024x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52028xv2 xv24 = new C52028xv2();
                        if (bArr2 != null && bArr2.length > 0) {
                            xv24.parseFrom(bArr2);
                        }
                        pv22.f140025y = xv24;
                    }
                    return 0;
                case 20:
                    pv22.f140026z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    pv22.f140002A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    pv22.f140003B = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    pv22.f140004C = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    pv22.f140005D = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    pv22.f140006E = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
