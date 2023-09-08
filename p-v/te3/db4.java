package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class db4 extends C47465a {

    /* renamed from: A */
    public LinkedList<Long> f182672A = new LinkedList<>();

    /* renamed from: B */
    public boolean f182673B;

    /* renamed from: C */
    public long f182674C;

    /* renamed from: D */
    public long f182675D;

    /* renamed from: d */
    public long f182676d;

    /* renamed from: e */
    public C64654qd f182677e;

    /* renamed from: f */
    public op4 f182678f;

    /* renamed from: g */
    public C64441i93 f182679g;

    /* renamed from: h */
    public String f182680h;

    /* renamed from: i */
    public String f182681i;

    /* renamed from: j */
    public long f182682j;

    /* renamed from: n */
    public int f182683n;

    /* renamed from: o */
    public String f182684o;

    /* renamed from: p */
    public long f182685p;

    /* renamed from: q */
    public int f182686q;

    /* renamed from: r */
    public long f182687r;

    /* renamed from: s */
    public C89349b f182688s;

    /* renamed from: t */
    public int f182689t;

    /* renamed from: u */
    public long f182690u;

    /* renamed from: v */
    public String f182691v;

    /* renamed from: w */
    public long f182692w;

    /* renamed from: x */
    public int f182693x;

    /* renamed from: y */
    public long f182694y;

    /* renamed from: z */
    public long f182695z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof db4)) {
            return false;
        }
        db4 db4 = (db4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f182676d), Long.valueOf(db4.f182676d)) && C46238a.m51546a(this.f182677e, db4.f182677e) && C46238a.m51546a(this.f182678f, db4.f182678f) && C46238a.m51546a(this.f182679g, db4.f182679g) && C46238a.m51546a(this.f182680h, db4.f182680h) && C46238a.m51546a(this.f182681i, db4.f182681i) && C46238a.m51546a(Long.valueOf(this.f182682j), Long.valueOf(db4.f182682j)) && C46238a.m51546a(Integer.valueOf(this.f182683n), Integer.valueOf(db4.f182683n)) && C46238a.m51546a(this.f182684o, db4.f182684o) && C46238a.m51546a(Long.valueOf(this.f182685p), Long.valueOf(db4.f182685p)) && C46238a.m51546a(Integer.valueOf(this.f182686q), Integer.valueOf(db4.f182686q)) && C46238a.m51546a(Long.valueOf(this.f182687r), Long.valueOf(db4.f182687r)) && C46238a.m51546a(this.f182688s, db4.f182688s) && C46238a.m51546a(Integer.valueOf(this.f182689t), Integer.valueOf(db4.f182689t)) && C46238a.m51546a(Long.valueOf(this.f182690u), Long.valueOf(db4.f182690u)) && C46238a.m51546a(this.f182691v, db4.f182691v) && C46238a.m51546a(Long.valueOf(this.f182692w), Long.valueOf(db4.f182692w)) && C46238a.m51546a(Integer.valueOf(this.f182693x), Integer.valueOf(db4.f182693x)) && C46238a.m51546a(Long.valueOf(this.f182694y), Long.valueOf(db4.f182694y)) && C46238a.m51546a(Long.valueOf(this.f182695z), Long.valueOf(db4.f182695z)) && C46238a.m51546a(this.f182672A, db4.f182672A) && C46238a.m51546a(Boolean.valueOf(this.f182673B), Boolean.valueOf(db4.f182673B)) && C46238a.m51546a(Long.valueOf(this.f182674C), Long.valueOf(db4.f182674C)) && C46238a.m51546a(Long.valueOf(this.f182675D), Long.valueOf(db4.f182675D));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f182676d);
            C64654qd qdVar = this.f182677e;
            if (qdVar != null) {
                aVar.mo74322i(2, qdVar.computeSize());
                this.f182677e.writeFields(aVar);
            }
            op4 op4 = this.f182678f;
            if (op4 != null) {
                aVar.mo74322i(3, op4.computeSize());
                this.f182678f.writeFields(aVar);
            }
            C64441i93 i932 = this.f182679g;
            if (i932 != null) {
                aVar.mo74322i(4, i932.computeSize());
                this.f182679g.writeFields(aVar);
            }
            String str = this.f182680h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f182681i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74321h(7, this.f182682j);
            aVar.mo74318e(8, this.f182683n);
            String str3 = this.f182684o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74321h(10, this.f182685p);
            aVar.mo74318e(11, this.f182686q);
            aVar.mo74321h(12, this.f182687r);
            C89349b bVar = this.f182688s;
            if (bVar != null) {
                aVar.mo74315b(13, bVar);
            }
            aVar.mo74318e(14, this.f182689t);
            aVar.mo74321h(15, this.f182690u);
            String str4 = this.f182691v;
            if (str4 != null) {
                aVar.mo74323j(16, str4);
            }
            aVar.mo74321h(17, this.f182692w);
            aVar.mo74318e(18, this.f182693x);
            aVar.mo74321h(19, this.f182694y);
            aVar.mo74321h(20, this.f182695z);
            aVar.mo74320g(23, 3, this.f182672A);
            aVar.mo74314a(24, this.f182673B);
            aVar.mo74321h(25, this.f182674C);
            aVar.mo74321h(26, this.f182675D);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f182676d) + 0;
            C64654qd qdVar2 = this.f182677e;
            if (qdVar2 != null) {
                h += C52418a.m58682i(2, qdVar2.computeSize());
            }
            op4 op42 = this.f182678f;
            if (op42 != null) {
                h += C52418a.m58682i(3, op42.computeSize());
            }
            C64441i93 i933 = this.f182679g;
            if (i933 != null) {
                h += C52418a.m58682i(4, i933.computeSize());
            }
            String str5 = this.f182680h;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f182681i;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            int h2 = h + C52418a.m58681h(7, this.f182682j) + C52418a.m58678e(8, this.f182683n);
            String str7 = this.f182684o;
            if (str7 != null) {
                h2 += C52418a.m58683j(9, str7);
            }
            int h3 = h2 + C52418a.m58681h(10, this.f182685p) + C52418a.m58678e(11, this.f182686q) + C52418a.m58681h(12, this.f182687r);
            C89349b bVar2 = this.f182688s;
            if (bVar2 != null) {
                h3 += C52418a.m58675b(13, bVar2);
            }
            int e = h3 + C52418a.m58678e(14, this.f182689t) + C52418a.m58681h(15, this.f182690u);
            String str8 = this.f182691v;
            if (str8 != null) {
                e += C52418a.m58683j(16, str8);
            }
            return e + C52418a.m58681h(17, this.f182692w) + C52418a.m58678e(18, this.f182693x) + C52418a.m58681h(19, this.f182694y) + C52418a.m58681h(20, this.f182695z) + C52418a.m58680g(23, 3, this.f182672A) + C52418a.m58674a(24, this.f182673B) + C52418a.m58681h(25, this.f182674C) + C52418a.m58681h(26, this.f182675D);
        } else if (i2 == 2) {
            this.f182672A.clear();
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
            db4 db4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    db4.f182676d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64654qd qdVar3 = new C64654qd();
                        if (bArr != null && bArr.length > 0) {
                            qdVar3.parseFrom(bArr);
                        }
                        db4.f182677e = qdVar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        op4 op43 = new op4();
                        if (bArr2 != null && bArr2.length > 0) {
                            op43.parseFrom(bArr2);
                        }
                        db4.f182678f = op43;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64441i93 i934 = new C64441i93();
                        if (bArr3 != null && bArr3.length > 0) {
                            i934.parseFrom(bArr3);
                        }
                        db4.f182679g = i934;
                    }
                    return 0;
                case 5:
                    db4.f182680h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    db4.f182681i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    db4.f182682j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    db4.f182683n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    db4.f182684o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    db4.f182685p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    db4.f182686q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    db4.f182687r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    db4.f182688s = aVar3.mo141626d(intValue);
                    return 0;
                case 14:
                    db4.f182689t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    db4.f182690u = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    db4.f182691v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    db4.f182692w = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    db4.f182693x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    db4.f182694y = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    db4.f182695z = aVar3.mo141631i(intValue);
                    return 0;
                case 23:
                    db4.f182672A.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 24:
                    db4.f182673B = aVar3.mo141625c(intValue);
                    return 0;
                case 25:
                    db4.f182674C = aVar3.mo141631i(intValue);
                    return 0;
                case 26:
                    db4.f182675D = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
