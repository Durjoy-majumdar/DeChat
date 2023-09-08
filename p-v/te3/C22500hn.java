package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hn */
public class C22500hn extends C47465a {

    /* renamed from: A */
    public String f63934A;

    /* renamed from: B */
    public C22498fy f63935B;

    /* renamed from: C */
    public String f63936C;

    /* renamed from: D */
    public C22498fy f63937D;

    /* renamed from: E */
    public boolean f63938E;

    /* renamed from: F */
    public boolean f63939F;

    /* renamed from: G */
    public C22498fy f63940G;

    /* renamed from: H */
    public C22498fy f63941H;

    /* renamed from: d */
    public int f63942d;

    /* renamed from: e */
    public int f63943e;

    /* renamed from: f */
    public int f63944f;

    /* renamed from: g */
    public LinkedList<C22534xo> f63945g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C22534xo> f63946h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C22534xo> f63947i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<String> f63948j = new LinkedList<>();

    /* renamed from: n */
    public int f63949n;

    /* renamed from: o */
    public String f63950o;

    /* renamed from: p */
    public int f63951p;

    /* renamed from: q */
    public LinkedList<C22498fy> f63952q = new LinkedList<>();

    /* renamed from: r */
    public long f63953r;

    /* renamed from: s */
    public int f63954s;

    /* renamed from: t */
    public String f63955t;

    /* renamed from: u */
    public C22498fy f63956u;

    /* renamed from: v */
    public LinkedList<C22511m1> f63957v = new LinkedList<>();

    /* renamed from: w */
    public C22498fy f63958w;

    /* renamed from: x */
    public C22498fy f63959x;

    /* renamed from: y */
    public C22498fy f63960y;

    /* renamed from: z */
    public C77968n40 f63961z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22500hn)) {
            return false;
        }
        C22500hn hnVar = (C22500hn) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f63942d), Integer.valueOf(hnVar.f63942d)) && C46238a.m51546a(Integer.valueOf(this.f63943e), Integer.valueOf(hnVar.f63943e)) && C46238a.m51546a(Integer.valueOf(this.f63944f), Integer.valueOf(hnVar.f63944f)) && C46238a.m51546a(this.f63945g, hnVar.f63945g) && C46238a.m51546a(this.f63946h, hnVar.f63946h) && C46238a.m51546a(this.f63947i, hnVar.f63947i) && C46238a.m51546a(this.f63948j, hnVar.f63948j) && C46238a.m51546a(Integer.valueOf(this.f63949n), Integer.valueOf(hnVar.f63949n)) && C46238a.m51546a(this.f63950o, hnVar.f63950o) && C46238a.m51546a(Integer.valueOf(this.f63951p), Integer.valueOf(hnVar.f63951p)) && C46238a.m51546a(this.f63952q, hnVar.f63952q) && C46238a.m51546a(Long.valueOf(this.f63953r), Long.valueOf(hnVar.f63953r)) && C46238a.m51546a(Integer.valueOf(this.f63954s), Integer.valueOf(hnVar.f63954s)) && C46238a.m51546a(this.f63955t, hnVar.f63955t) && C46238a.m51546a(this.f63956u, hnVar.f63956u) && C46238a.m51546a(this.f63957v, hnVar.f63957v) && C46238a.m51546a(this.f63958w, hnVar.f63958w) && C46238a.m51546a(this.f63959x, hnVar.f63959x) && C46238a.m51546a(this.f63960y, hnVar.f63960y) && C46238a.m51546a(this.f63961z, hnVar.f63961z) && C46238a.m51546a(this.f63934A, hnVar.f63934A) && C46238a.m51546a(this.f63935B, hnVar.f63935B) && C46238a.m51546a(this.f63936C, hnVar.f63936C) && C46238a.m51546a(this.f63937D, hnVar.f63937D) && C46238a.m51546a(Boolean.valueOf(this.f63938E), Boolean.valueOf(hnVar.f63938E)) && C46238a.m51546a(Boolean.valueOf(this.f63939F), Boolean.valueOf(hnVar.f63939F)) && C46238a.m51546a(this.f63940G, hnVar.f63940G) && C46238a.m51546a(this.f63941H, hnVar.f63941H);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f63942d);
            aVar.mo74318e(2, this.f63943e);
            aVar.mo74318e(3, this.f63944f);
            aVar.mo74320g(4, 8, this.f63945g);
            aVar.mo74320g(5, 8, this.f63946h);
            aVar.mo74320g(6, 8, this.f63947i);
            aVar.mo74320g(7, 1, this.f63948j);
            aVar.mo74318e(8, this.f63949n);
            String str = this.f63950o;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            aVar.mo74318e(10, this.f63951p);
            aVar.mo74320g(11, 8, this.f63952q);
            aVar.mo74321h(12, this.f63953r);
            aVar.mo74318e(13, this.f63954s);
            String str2 = this.f63955t;
            if (str2 != null) {
                aVar.mo74323j(14, str2);
            }
            C22498fy fyVar = this.f63956u;
            if (fyVar != null) {
                aVar.mo74322i(15, fyVar.computeSize());
                this.f63956u.writeFields(aVar);
            }
            aVar.mo74320g(16, 8, this.f63957v);
            C22498fy fyVar2 = this.f63958w;
            if (fyVar2 != null) {
                aVar.mo74322i(17, fyVar2.computeSize());
                this.f63958w.writeFields(aVar);
            }
            C22498fy fyVar3 = this.f63959x;
            if (fyVar3 != null) {
                aVar.mo74322i(18, fyVar3.computeSize());
                this.f63959x.writeFields(aVar);
            }
            C22498fy fyVar4 = this.f63960y;
            if (fyVar4 != null) {
                aVar.mo74322i(19, fyVar4.computeSize());
                this.f63960y.writeFields(aVar);
            }
            C77968n40 n402 = this.f63961z;
            if (n402 != null) {
                aVar.mo74322i(20, n402.computeSize());
                this.f63961z.writeFields(aVar);
            }
            String str3 = this.f63934A;
            if (str3 != null) {
                aVar.mo74323j(21, str3);
            }
            C22498fy fyVar5 = this.f63935B;
            if (fyVar5 != null) {
                aVar.mo74322i(22, fyVar5.computeSize());
                this.f63935B.writeFields(aVar);
            }
            String str4 = this.f63936C;
            if (str4 != null) {
                aVar.mo74323j(23, str4);
            }
            C22498fy fyVar6 = this.f63937D;
            if (fyVar6 != null) {
                aVar.mo74322i(24, fyVar6.computeSize());
                this.f63937D.writeFields(aVar);
            }
            aVar.mo74314a(25, this.f63938E);
            aVar.mo74314a(26, this.f63939F);
            C22498fy fyVar7 = this.f63940G;
            if (fyVar7 != null) {
                aVar.mo74322i(29, fyVar7.computeSize());
                this.f63940G.writeFields(aVar);
            }
            C22498fy fyVar8 = this.f63941H;
            if (fyVar8 != null) {
                aVar.mo74322i(30, fyVar8.computeSize());
                this.f63941H.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f63942d) + 0 + C52418a.m58678e(2, this.f63943e) + C52418a.m58678e(3, this.f63944f) + C52418a.m58680g(4, 8, this.f63945g) + C52418a.m58680g(5, 8, this.f63946h) + C52418a.m58680g(6, 8, this.f63947i) + C52418a.m58680g(7, 1, this.f63948j) + C52418a.m58678e(8, this.f63949n);
            String str5 = this.f63950o;
            if (str5 != null) {
                e += C52418a.m58683j(9, str5);
            }
            int e2 = e + C52418a.m58678e(10, this.f63951p) + C52418a.m58680g(11, 8, this.f63952q) + C52418a.m58681h(12, this.f63953r) + C52418a.m58678e(13, this.f63954s);
            String str6 = this.f63955t;
            if (str6 != null) {
                e2 += C52418a.m58683j(14, str6);
            }
            C22498fy fyVar9 = this.f63956u;
            if (fyVar9 != null) {
                e2 += C52418a.m58682i(15, fyVar9.computeSize());
            }
            int g = e2 + C52418a.m58680g(16, 8, this.f63957v);
            C22498fy fyVar10 = this.f63958w;
            if (fyVar10 != null) {
                g += C52418a.m58682i(17, fyVar10.computeSize());
            }
            C22498fy fyVar11 = this.f63959x;
            if (fyVar11 != null) {
                g += C52418a.m58682i(18, fyVar11.computeSize());
            }
            C22498fy fyVar12 = this.f63960y;
            if (fyVar12 != null) {
                g += C52418a.m58682i(19, fyVar12.computeSize());
            }
            C77968n40 n403 = this.f63961z;
            if (n403 != null) {
                g += C52418a.m58682i(20, n403.computeSize());
            }
            String str7 = this.f63934A;
            if (str7 != null) {
                g += C52418a.m58683j(21, str7);
            }
            C22498fy fyVar13 = this.f63935B;
            if (fyVar13 != null) {
                g += C52418a.m58682i(22, fyVar13.computeSize());
            }
            String str8 = this.f63936C;
            if (str8 != null) {
                g += C52418a.m58683j(23, str8);
            }
            C22498fy fyVar14 = this.f63937D;
            if (fyVar14 != null) {
                g += C52418a.m58682i(24, fyVar14.computeSize());
            }
            int a = g + C52418a.m58674a(25, this.f63938E) + C52418a.m58674a(26, this.f63939F);
            C22498fy fyVar15 = this.f63940G;
            if (fyVar15 != null) {
                a += C52418a.m58682i(29, fyVar15.computeSize());
            }
            C22498fy fyVar16 = this.f63941H;
            return fyVar16 != null ? a + C52418a.m58682i(30, fyVar16.computeSize()) : a;
        } else if (i2 == 2) {
            this.f63945g.clear();
            this.f63946h.clear();
            this.f63947i.clear();
            this.f63948j.clear();
            this.f63952q.clear();
            this.f63957v.clear();
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
            C22500hn hnVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hnVar.f63942d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hnVar.f63943e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hnVar.f63944f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C22534xo xoVar = new C22534xo();
                        if (bArr != null && bArr.length > 0) {
                            xoVar.parseFrom(bArr);
                        }
                        hnVar.f63945g.add(xoVar);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22534xo xoVar2 = new C22534xo();
                        if (bArr2 != null && bArr2.length > 0) {
                            xoVar2.parseFrom(bArr2);
                        }
                        hnVar.f63946h.add(xoVar2);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C22534xo xoVar3 = new C22534xo();
                        if (bArr3 != null && bArr3.length > 0) {
                            xoVar3.parseFrom(bArr3);
                        }
                        hnVar.f63947i.add(xoVar3);
                    }
                    return 0;
                case 7:
                    hnVar.f63948j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    hnVar.f63949n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    hnVar.f63950o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hnVar.f63951p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C22498fy fyVar17 = new C22498fy();
                        if (bArr4 != null && bArr4.length > 0) {
                            fyVar17.parseFrom(bArr4);
                        }
                        hnVar.f63952q.add(fyVar17);
                    }
                    return 0;
                case 12:
                    hnVar.f63953r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    hnVar.f63954s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    hnVar.f63955t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C22498fy fyVar18 = new C22498fy();
                        if (bArr5 != null && bArr5.length > 0) {
                            fyVar18.parseFrom(bArr5);
                        }
                        hnVar.f63956u = fyVar18;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C22511m1 m1Var = new C22511m1();
                        if (bArr6 != null && bArr6.length > 0) {
                            m1Var.parseFrom(bArr6);
                        }
                        hnVar.f63957v.add(m1Var);
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C22498fy fyVar19 = new C22498fy();
                        if (bArr7 != null && bArr7.length > 0) {
                            fyVar19.parseFrom(bArr7);
                        }
                        hnVar.f63958w = fyVar19;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C22498fy fyVar20 = new C22498fy();
                        if (bArr8 != null && bArr8.length > 0) {
                            fyVar20.parseFrom(bArr8);
                        }
                        hnVar.f63959x = fyVar20;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C22498fy fyVar21 = new C22498fy();
                        if (bArr9 != null && bArr9.length > 0) {
                            fyVar21.parseFrom(bArr9);
                        }
                        hnVar.f63960y = fyVar21;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        C77968n40 n404 = new C77968n40();
                        if (bArr10 != null && bArr10.length > 0) {
                            n404.parseFrom(bArr10);
                        }
                        hnVar.f63961z = n404;
                    }
                    return 0;
                case 21:
                    hnVar.f63934A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i18 = 0; i18 < size11; i18++) {
                        byte[] bArr11 = j16.get(i18);
                        C22498fy fyVar22 = new C22498fy();
                        if (bArr11 != null && bArr11.length > 0) {
                            fyVar22.parseFrom(bArr11);
                        }
                        hnVar.f63935B = fyVar22;
                    }
                    return 0;
                case 23:
                    hnVar.f63936C = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i19 = 0; i19 < size12; i19++) {
                        byte[] bArr12 = j17.get(i19);
                        C22498fy fyVar23 = new C22498fy();
                        if (bArr12 != null && bArr12.length > 0) {
                            fyVar23.parseFrom(bArr12);
                        }
                        hnVar.f63937D = fyVar23;
                    }
                    return 0;
                case 25:
                    hnVar.f63938E = aVar3.mo141625c(intValue);
                    return 0;
                case 26:
                    hnVar.f63939F = aVar3.mo141625c(intValue);
                    return 0;
                case 29:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i25 = 0; i25 < size13; i25++) {
                        byte[] bArr13 = j18.get(i25);
                        C22498fy fyVar24 = new C22498fy();
                        if (bArr13 != null && bArr13.length > 0) {
                            fyVar24.parseFrom(bArr13);
                        }
                        hnVar.f63940G = fyVar24;
                    }
                    return 0;
                case 30:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i26 = 0; i26 < size14; i26++) {
                        byte[] bArr14 = j19.get(i26);
                        C22498fy fyVar25 = new C22498fy();
                        if (bArr14 != null && bArr14.length > 0) {
                            fyVar25.parseFrom(bArr14);
                        }
                        hnVar.f63941H = fyVar25;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
