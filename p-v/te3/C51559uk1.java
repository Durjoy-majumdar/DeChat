package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uk1 */
public class C51559uk1 extends C47465a {

    /* renamed from: A */
    public String f142891A;

    /* renamed from: B */
    public int f142892B;

    /* renamed from: d */
    public String f142893d;

    /* renamed from: e */
    public String f142894e;

    /* renamed from: f */
    public int f142895f;

    /* renamed from: g */
    public int f142896g;

    /* renamed from: h */
    public int f142897h;

    /* renamed from: i */
    public String f142898i;

    /* renamed from: j */
    public long f142899j;

    /* renamed from: n */
    public long f142900n;

    /* renamed from: o */
    public String f142901o;

    /* renamed from: p */
    public C64370fp1 f142902p;

    /* renamed from: q */
    public long f142903q;

    /* renamed from: r */
    public int f142904r;

    /* renamed from: s */
    public int f142905s;

    /* renamed from: t */
    public String f142906t;

    /* renamed from: u */
    public int f142907u;

    /* renamed from: v */
    public C49488fz f142908v;

    /* renamed from: w */
    public long f142909w;

    /* renamed from: x */
    public String f142910x;

    /* renamed from: y */
    public String f142911y;

    /* renamed from: z */
    public C49359f1 f142912z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51559uk1)) {
            return false;
        }
        C51559uk1 uk12 = (C51559uk1) aVar;
        return C46238a.m51546a(this.f142893d, uk12.f142893d) && C46238a.m51546a(this.f142894e, uk12.f142894e) && C46238a.m51546a(Integer.valueOf(this.f142895f), Integer.valueOf(uk12.f142895f)) && C46238a.m51546a(Integer.valueOf(this.f142896g), Integer.valueOf(uk12.f142896g)) && C46238a.m51546a(Integer.valueOf(this.f142897h), Integer.valueOf(uk12.f142897h)) && C46238a.m51546a(this.f142898i, uk12.f142898i) && C46238a.m51546a(Long.valueOf(this.f142899j), Long.valueOf(uk12.f142899j)) && C46238a.m51546a(Long.valueOf(this.f142900n), Long.valueOf(uk12.f142900n)) && C46238a.m51546a(this.f142901o, uk12.f142901o) && C46238a.m51546a(this.f142902p, uk12.f142902p) && C46238a.m51546a(Long.valueOf(this.f142903q), Long.valueOf(uk12.f142903q)) && C46238a.m51546a(Integer.valueOf(this.f142904r), Integer.valueOf(uk12.f142904r)) && C46238a.m51546a(Integer.valueOf(this.f142905s), Integer.valueOf(uk12.f142905s)) && C46238a.m51546a(this.f142906t, uk12.f142906t) && C46238a.m51546a(Integer.valueOf(this.f142907u), Integer.valueOf(uk12.f142907u)) && C46238a.m51546a(this.f142908v, uk12.f142908v) && C46238a.m51546a(Long.valueOf(this.f142909w), Long.valueOf(uk12.f142909w)) && C46238a.m51546a(this.f142910x, uk12.f142910x) && C46238a.m51546a(this.f142911y, uk12.f142911y) && C46238a.m51546a(this.f142912z, uk12.f142912z) && C46238a.m51546a(this.f142891A, uk12.f142891A) && C46238a.m51546a(Integer.valueOf(this.f142892B), Integer.valueOf(uk12.f142892B));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142893d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f142894e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f142895f);
            aVar.mo74318e(4, this.f142896g);
            aVar.mo74318e(5, this.f142897h);
            String str3 = this.f142898i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f142899j);
            aVar.mo74321h(8, this.f142900n);
            String str4 = this.f142901o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            C64370fp1 fp12 = this.f142902p;
            if (fp12 != null) {
                aVar.mo74322i(10, fp12.computeSize());
                this.f142902p.writeFields(aVar);
            }
            aVar.mo74321h(11, this.f142903q);
            aVar.mo74318e(12, this.f142904r);
            aVar.mo74318e(13, this.f142905s);
            String str5 = this.f142906t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            aVar.mo74318e(15, this.f142907u);
            C49488fz fzVar = this.f142908v;
            if (fzVar != null) {
                aVar.mo74322i(16, fzVar.computeSize());
                this.f142908v.writeFields(aVar);
            }
            aVar.mo74321h(17, this.f142909w);
            String str6 = this.f142910x;
            if (str6 != null) {
                aVar.mo74323j(18, str6);
            }
            String str7 = this.f142911y;
            if (str7 != null) {
                aVar.mo74323j(19, str7);
            }
            C49359f1 f1Var = this.f142912z;
            if (f1Var != null) {
                aVar.mo74322i(20, f1Var.computeSize());
                this.f142912z.writeFields(aVar);
            }
            String str8 = this.f142891A;
            if (str8 != null) {
                aVar.mo74323j(21, str8);
            }
            aVar.mo74318e(22, this.f142892B);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f142893d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f142894e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            int e = i3 + C52418a.m58678e(3, this.f142895f) + C52418a.m58678e(4, this.f142896g) + C52418a.m58678e(5, this.f142897h);
            String str11 = this.f142898i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int h = e + C52418a.m58681h(7, this.f142899j) + C52418a.m58681h(8, this.f142900n);
            String str12 = this.f142901o;
            if (str12 != null) {
                h += C52418a.m58683j(9, str12);
            }
            C64370fp1 fp13 = this.f142902p;
            if (fp13 != null) {
                h += C52418a.m58682i(10, fp13.computeSize());
            }
            int h2 = h + C52418a.m58681h(11, this.f142903q) + C52418a.m58678e(12, this.f142904r) + C52418a.m58678e(13, this.f142905s);
            String str13 = this.f142906t;
            if (str13 != null) {
                h2 += C52418a.m58683j(14, str13);
            }
            int e2 = h2 + C52418a.m58678e(15, this.f142907u);
            C49488fz fzVar2 = this.f142908v;
            if (fzVar2 != null) {
                e2 += C52418a.m58682i(16, fzVar2.computeSize());
            }
            int h3 = e2 + C52418a.m58681h(17, this.f142909w);
            String str14 = this.f142910x;
            if (str14 != null) {
                h3 += C52418a.m58683j(18, str14);
            }
            String str15 = this.f142911y;
            if (str15 != null) {
                h3 += C52418a.m58683j(19, str15);
            }
            C49359f1 f1Var2 = this.f142912z;
            if (f1Var2 != null) {
                h3 += C52418a.m58682i(20, f1Var2.computeSize());
            }
            String str16 = this.f142891A;
            if (str16 != null) {
                h3 += C52418a.m58683j(21, str16);
            }
            return h3 + C52418a.m58678e(22, this.f142892B);
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
            C51559uk1 uk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uk12.f142893d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    uk12.f142894e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    uk12.f142895f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    uk12.f142896g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uk12.f142897h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    uk12.f142898i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    uk12.f142899j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    uk12.f142900n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    uk12.f142901o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64370fp1 fp14 = new C64370fp1();
                        if (bArr != null && bArr.length > 0) {
                            fp14.parseFrom(bArr);
                        }
                        uk12.f142902p = fp14;
                    }
                    return 0;
                case 11:
                    uk12.f142903q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    uk12.f142904r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    uk12.f142905s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    uk12.f142906t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    uk12.f142907u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49488fz fzVar3 = new C49488fz();
                        if (bArr2 != null && bArr2.length > 0) {
                            fzVar3.parseFrom(bArr2);
                        }
                        uk12.f142908v = fzVar3;
                    }
                    return 0;
                case 17:
                    uk12.f142909w = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    uk12.f142910x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    uk12.f142911y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49359f1 f1Var3 = new C49359f1();
                        if (bArr3 != null && bArr3.length > 0) {
                            f1Var3.parseFrom(bArr3);
                        }
                        uk12.f142912z = f1Var3;
                    }
                    return 0;
                case 21:
                    uk12.f142891A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    uk12.f142892B = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
