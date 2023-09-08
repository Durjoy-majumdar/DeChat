package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zg3 */
public class C52261zg3 extends C47465a {

    /* renamed from: A */
    public int f145907A;

    /* renamed from: B */
    public int f145908B;

    /* renamed from: C */
    public long f145909C;

    /* renamed from: D */
    public C50019jp1 f145910D;

    /* renamed from: E */
    public String f145911E;

    /* renamed from: F */
    public String f145912F;

    /* renamed from: G */
    public String f145913G;

    /* renamed from: H */
    public String f145914H;

    /* renamed from: I */
    public C52170yu2 f145915I;

    /* renamed from: J */
    public C49701hg1 f145916J;

    /* renamed from: d */
    public C50251le1 f145917d;

    /* renamed from: e */
    public FinderContact f145918e;

    /* renamed from: f */
    public int f145919f;

    /* renamed from: g */
    public C51627v10 f145920g;

    /* renamed from: h */
    public C50019jp1 f145921h;

    /* renamed from: i */
    public C50019jp1 f145922i;

    /* renamed from: j */
    public C51967xf3 f145923j;

    /* renamed from: n */
    public int f145924n;

    /* renamed from: o */
    public String f145925o;

    /* renamed from: p */
    public String f145926p;

    /* renamed from: q */
    public C51901x0 f145927q;

    /* renamed from: r */
    public int f145928r;

    /* renamed from: s */
    public String f145929s;

    /* renamed from: t */
    public String f145930t;

    /* renamed from: u */
    public C50075k34 f145931u;

    /* renamed from: v */
    public C51275so1 f145932v;

    /* renamed from: w */
    public C49512g4 f145933w;

    /* renamed from: x */
    public C48833bb1 f145934x;

    /* renamed from: y */
    public C49236e51 f145935y;

    /* renamed from: z */
    public String f145936z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52261zg3)) {
            return false;
        }
        C52261zg3 zg32 = (C52261zg3) aVar;
        return C46238a.m51546a(this.f145917d, zg32.f145917d) && C46238a.m51546a(this.f145918e, zg32.f145918e) && C46238a.m51546a(Integer.valueOf(this.f145919f), Integer.valueOf(zg32.f145919f)) && C46238a.m51546a(this.f145920g, zg32.f145920g) && C46238a.m51546a(this.f145921h, zg32.f145921h) && C46238a.m51546a(this.f145922i, zg32.f145922i) && C46238a.m51546a(this.f145923j, zg32.f145923j) && C46238a.m51546a(Integer.valueOf(this.f145924n), Integer.valueOf(zg32.f145924n)) && C46238a.m51546a(this.f145925o, zg32.f145925o) && C46238a.m51546a(this.f145926p, zg32.f145926p) && C46238a.m51546a(this.f145927q, zg32.f145927q) && C46238a.m51546a(Integer.valueOf(this.f145928r), Integer.valueOf(zg32.f145928r)) && C46238a.m51546a(this.f145929s, zg32.f145929s) && C46238a.m51546a(this.f145930t, zg32.f145930t) && C46238a.m51546a(this.f145931u, zg32.f145931u) && C46238a.m51546a(this.f145932v, zg32.f145932v) && C46238a.m51546a(this.f145933w, zg32.f145933w) && C46238a.m51546a(this.f145934x, zg32.f145934x) && C46238a.m51546a(this.f145935y, zg32.f145935y) && C46238a.m51546a(this.f145936z, zg32.f145936z) && C46238a.m51546a(Integer.valueOf(this.f145907A), Integer.valueOf(zg32.f145907A)) && C46238a.m51546a(Integer.valueOf(this.f145908B), Integer.valueOf(zg32.f145908B)) && C46238a.m51546a(Long.valueOf(this.f145909C), Long.valueOf(zg32.f145909C)) && C46238a.m51546a(this.f145910D, zg32.f145910D) && C46238a.m51546a(this.f145911E, zg32.f145911E) && C46238a.m51546a(this.f145912F, zg32.f145912F) && C46238a.m51546a(this.f145913G, zg32.f145913G) && C46238a.m51546a(this.f145914H, zg32.f145914H) && C46238a.m51546a(this.f145915I, zg32.f145915I) && C46238a.m51546a(this.f145916J, zg32.f145916J);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C50251le1 le12 = this.f145917d;
            if (le12 != null) {
                aVar.mo74322i(1, le12.computeSize());
                this.f145917d.writeFields(aVar);
            }
            FinderContact finderContact = this.f145918e;
            if (finderContact != null) {
                aVar.mo74322i(2, finderContact.computeSize());
                this.f145918e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f145919f);
            C51627v10 v102 = this.f145920g;
            if (v102 != null) {
                aVar.mo74322i(4, v102.computeSize());
                this.f145920g.writeFields(aVar);
            }
            C50019jp1 jp12 = this.f145921h;
            if (jp12 != null) {
                aVar.mo74322i(5, jp12.computeSize());
                this.f145921h.writeFields(aVar);
            }
            C50019jp1 jp13 = this.f145922i;
            if (jp13 != null) {
                aVar.mo74322i(6, jp13.computeSize());
                this.f145922i.writeFields(aVar);
            }
            C51967xf3 xf32 = this.f145923j;
            if (xf32 != null) {
                aVar.mo74322i(7, xf32.computeSize());
                this.f145923j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f145924n);
            String str = this.f145925o;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            String str2 = this.f145926p;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            C51901x0 x0Var = this.f145927q;
            if (x0Var != null) {
                aVar.mo74322i(11, x0Var.computeSize());
                this.f145927q.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f145928r);
            String str3 = this.f145929s;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            String str4 = this.f145930t;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            C50075k34 k342 = this.f145931u;
            if (k342 != null) {
                aVar.mo74322i(15, k342.computeSize());
                this.f145931u.writeFields(aVar);
            }
            C51275so1 so12 = this.f145932v;
            if (so12 != null) {
                aVar.mo74322i(16, so12.computeSize());
                this.f145932v.writeFields(aVar);
            }
            C49512g4 g4Var = this.f145933w;
            if (g4Var != null) {
                aVar.mo74322i(17, g4Var.computeSize());
                this.f145933w.writeFields(aVar);
            }
            C48833bb1 bb12 = this.f145934x;
            if (bb12 != null) {
                aVar.mo74322i(19, bb12.computeSize());
                this.f145934x.writeFields(aVar);
            }
            C49236e51 e512 = this.f145935y;
            if (e512 != null) {
                aVar.mo74322i(20, e512.computeSize());
                this.f145935y.writeFields(aVar);
            }
            String str5 = this.f145936z;
            if (str5 != null) {
                aVar.mo74323j(21, str5);
            }
            aVar.mo74318e(22, this.f145907A);
            aVar.mo74318e(23, this.f145908B);
            aVar.mo74321h(24, this.f145909C);
            C50019jp1 jp14 = this.f145910D;
            if (jp14 != null) {
                aVar.mo74322i(25, jp14.computeSize());
                this.f145910D.writeFields(aVar);
            }
            String str6 = this.f145911E;
            if (str6 != null) {
                aVar.mo74323j(26, str6);
            }
            String str7 = this.f145912F;
            if (str7 != null) {
                aVar.mo74323j(27, str7);
            }
            String str8 = this.f145913G;
            if (str8 != null) {
                aVar.mo74323j(28, str8);
            }
            String str9 = this.f145914H;
            if (str9 != null) {
                aVar.mo74323j(29, str9);
            }
            C52170yu2 yu22 = this.f145915I;
            if (yu22 != null) {
                aVar.mo74322i(30, yu22.computeSize());
                this.f145915I.writeFields(aVar);
            }
            C49701hg1 hg12 = this.f145916J;
            if (hg12 != null) {
                aVar.mo74322i(31, hg12.computeSize());
                this.f145916J.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C50251le1 le13 = this.f145917d;
            if (le13 != null) {
                i3 = C52418a.m58682i(1, le13.computeSize()) + 0;
            }
            FinderContact finderContact2 = this.f145918e;
            if (finderContact2 != null) {
                i3 += C52418a.m58682i(2, finderContact2.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f145919f);
            C51627v10 v103 = this.f145920g;
            if (v103 != null) {
                e += C52418a.m58682i(4, v103.computeSize());
            }
            C50019jp1 jp15 = this.f145921h;
            if (jp15 != null) {
                e += C52418a.m58682i(5, jp15.computeSize());
            }
            C50019jp1 jp16 = this.f145922i;
            if (jp16 != null) {
                e += C52418a.m58682i(6, jp16.computeSize());
            }
            C51967xf3 xf33 = this.f145923j;
            if (xf33 != null) {
                e += C52418a.m58682i(7, xf33.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f145924n);
            String str10 = this.f145925o;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            String str11 = this.f145926p;
            if (str11 != null) {
                e2 += C52418a.m58683j(10, str11);
            }
            C51901x0 x0Var2 = this.f145927q;
            if (x0Var2 != null) {
                e2 += C52418a.m58682i(11, x0Var2.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(12, this.f145928r);
            String str12 = this.f145929s;
            if (str12 != null) {
                e3 += C52418a.m58683j(13, str12);
            }
            String str13 = this.f145930t;
            if (str13 != null) {
                e3 += C52418a.m58683j(14, str13);
            }
            C50075k34 k343 = this.f145931u;
            if (k343 != null) {
                e3 += C52418a.m58682i(15, k343.computeSize());
            }
            C51275so1 so13 = this.f145932v;
            if (so13 != null) {
                e3 += C52418a.m58682i(16, so13.computeSize());
            }
            C49512g4 g4Var2 = this.f145933w;
            if (g4Var2 != null) {
                e3 += C52418a.m58682i(17, g4Var2.computeSize());
            }
            C48833bb1 bb13 = this.f145934x;
            if (bb13 != null) {
                e3 += C52418a.m58682i(19, bb13.computeSize());
            }
            C49236e51 e513 = this.f145935y;
            if (e513 != null) {
                e3 += C52418a.m58682i(20, e513.computeSize());
            }
            String str14 = this.f145936z;
            if (str14 != null) {
                e3 += C52418a.m58683j(21, str14);
            }
            int e4 = e3 + C52418a.m58678e(22, this.f145907A) + C52418a.m58678e(23, this.f145908B) + C52418a.m58681h(24, this.f145909C);
            C50019jp1 jp17 = this.f145910D;
            if (jp17 != null) {
                e4 += C52418a.m58682i(25, jp17.computeSize());
            }
            String str15 = this.f145911E;
            if (str15 != null) {
                e4 += C52418a.m58683j(26, str15);
            }
            String str16 = this.f145912F;
            if (str16 != null) {
                e4 += C52418a.m58683j(27, str16);
            }
            String str17 = this.f145913G;
            if (str17 != null) {
                e4 += C52418a.m58683j(28, str17);
            }
            String str18 = this.f145914H;
            if (str18 != null) {
                e4 += C52418a.m58683j(29, str18);
            }
            C52170yu2 yu23 = this.f145915I;
            if (yu23 != null) {
                e4 += C52418a.m58682i(30, yu23.computeSize());
            }
            C49701hg1 hg13 = this.f145916J;
            return hg13 != null ? e4 + C52418a.m58682i(31, hg13.computeSize()) : e4;
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
            C52261zg3 zg32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C50251le1 le14 = new C50251le1();
                        if (bArr != null && bArr.length > 0) {
                            le14.parseFrom(bArr);
                        }
                        zg32.f145917d = le14;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderContact3.parseFrom(bArr2);
                        }
                        zg32.f145918e = finderContact3;
                    }
                    return 0;
                case 3:
                    zg32.f145919f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51627v10 v104 = new C51627v10();
                        if (bArr3 != null && bArr3.length > 0) {
                            v104.parseFrom(bArr3);
                        }
                        zg32.f145920g = v104;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50019jp1 jp18 = new C50019jp1();
                        if (bArr4 != null && bArr4.length > 0) {
                            jp18.parseFrom(bArr4);
                        }
                        zg32.f145921h = jp18;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50019jp1 jp19 = new C50019jp1();
                        if (bArr5 != null && bArr5.length > 0) {
                            jp19.parseFrom(bArr5);
                        }
                        zg32.f145922i = jp19;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51967xf3 xf34 = new C51967xf3();
                        if (bArr6 != null && bArr6.length > 0) {
                            xf34.parseFrom(bArr6);
                        }
                        zg32.f145923j = xf34;
                    }
                    return 0;
                case 8:
                    zg32.f145924n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    zg32.f145925o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    zg32.f145926p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51901x0 x0Var3 = new C51901x0();
                        if (bArr7 != null && bArr7.length > 0) {
                            x0Var3.parseFrom(bArr7);
                        }
                        zg32.f145927q = x0Var3;
                    }
                    return 0;
                case 12:
                    zg32.f145928r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    zg32.f145929s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    zg32.f145930t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50075k34 k344 = new C50075k34();
                        if (bArr8 != null && bArr8.length > 0) {
                            k344.parseFrom(bArr8);
                        }
                        zg32.f145931u = k344;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51275so1 so14 = new C51275so1();
                        if (bArr9 != null && bArr9.length > 0) {
                            so14.parseFrom(bArr9);
                        }
                        zg32.f145932v = so14;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C49512g4 g4Var3 = new C49512g4();
                        if (bArr10 != null && bArr10.length > 0) {
                            g4Var3.parseFrom(bArr10);
                        }
                        zg32.f145933w = g4Var3;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C48833bb1 bb14 = new C48833bb1();
                        if (bArr11 != null && bArr11.length > 0) {
                            bb14.parseFrom(bArr11);
                        }
                        zg32.f145934x = bb14;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C49236e51 e514 = new C49236e51();
                        if (bArr12 != null && bArr12.length > 0) {
                            e514.parseFrom(bArr12);
                        }
                        zg32.f145935y = e514;
                    }
                    return 0;
                case 21:
                    zg32.f145936z = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    zg32.f145907A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    zg32.f145908B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    zg32.f145909C = aVar3.mo141631i(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C50019jp1 jp110 = new C50019jp1();
                        if (bArr13 != null && bArr13.length > 0) {
                            jp110.parseFrom(bArr13);
                        }
                        zg32.f145910D = jp110;
                    }
                    return 0;
                case 26:
                    zg32.f145911E = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    zg32.f145912F = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    zg32.f145913G = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    zg32.f145914H = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C52170yu2 yu24 = new C52170yu2();
                        if (bArr14 != null && bArr14.length > 0) {
                            yu24.parseFrom(bArr14);
                        }
                        zg32.f145915I = yu24;
                    }
                    return 0;
                case 31:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49701hg1 hg14 = new C49701hg1();
                        if (bArr15 != null && bArr15.length > 0) {
                            hg14.parseFrom(bArr15);
                        }
                        zg32.f145916J = hg14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
