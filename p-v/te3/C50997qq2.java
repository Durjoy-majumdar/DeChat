package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qq2 */
public class C50997qq2 extends C47465a {

    /* renamed from: A */
    public int f140457A;

    /* renamed from: B */
    public C49300el1 f140458B;

    /* renamed from: C */
    public C49002ch0 f140459C;

    /* renamed from: D */
    public LinkedList<C89349b> f140460D = new LinkedList<>();

    /* renamed from: E */
    public C50687oi1 f140461E;

    /* renamed from: F */
    public boolean f140462F;

    /* renamed from: d */
    public C51018qv3 f140463d;

    /* renamed from: e */
    public int f140464e;

    /* renamed from: f */
    public int f140465f;

    /* renamed from: g */
    public LinkedList<C49027cn1> f140466g = new LinkedList<>();

    /* renamed from: h */
    public int f140467h;

    /* renamed from: i */
    public int f140468i;

    /* renamed from: j */
    public ly4 f140469j;

    /* renamed from: n */
    public LinkedList<C64373fs0> f140470n = new LinkedList<>();

    /* renamed from: o */
    public int f140471o;

    /* renamed from: p */
    public long f140472p;

    /* renamed from: q */
    public C49873in1 f140473q;

    /* renamed from: r */
    public LinkedList<String> f140474r = new LinkedList<>();

    /* renamed from: s */
    public String f140475s;

    /* renamed from: t */
    public int f140476t;

    /* renamed from: u */
    public C49728hn1 f140477u;

    /* renamed from: v */
    public LinkedList<C49161dl1> f140478v = new LinkedList<>();

    /* renamed from: w */
    public C50295lp1 f140479w;

    /* renamed from: x */
    public C50838pj1 f140480x;

    /* renamed from: y */
    public C51252sj0 f140481y;

    /* renamed from: z */
    public String f140482z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50997qq2)) {
            return false;
        }
        C50997qq2 qq22 = (C50997qq2) aVar;
        return C46238a.m51546a(this.f140463d, qq22.f140463d) && C46238a.m51546a(Integer.valueOf(this.f140464e), Integer.valueOf(qq22.f140464e)) && C46238a.m51546a(Integer.valueOf(this.f140465f), Integer.valueOf(qq22.f140465f)) && C46238a.m51546a(this.f140466g, qq22.f140466g) && C46238a.m51546a(Integer.valueOf(this.f140467h), Integer.valueOf(qq22.f140467h)) && C46238a.m51546a(Integer.valueOf(this.f140468i), Integer.valueOf(qq22.f140468i)) && C46238a.m51546a(this.f140469j, qq22.f140469j) && C46238a.m51546a(this.f140470n, qq22.f140470n) && C46238a.m51546a(Integer.valueOf(this.f140471o), Integer.valueOf(qq22.f140471o)) && C46238a.m51546a(Long.valueOf(this.f140472p), Long.valueOf(qq22.f140472p)) && C46238a.m51546a(this.f140473q, qq22.f140473q) && C46238a.m51546a(this.f140474r, qq22.f140474r) && C46238a.m51546a(this.f140475s, qq22.f140475s) && C46238a.m51546a(Integer.valueOf(this.f140476t), Integer.valueOf(qq22.f140476t)) && C46238a.m51546a(this.f140477u, qq22.f140477u) && C46238a.m51546a(this.f140478v, qq22.f140478v) && C46238a.m51546a(this.f140479w, qq22.f140479w) && C46238a.m51546a(this.f140480x, qq22.f140480x) && C46238a.m51546a(this.f140481y, qq22.f140481y) && C46238a.m51546a(this.f140482z, qq22.f140482z) && C46238a.m51546a(Integer.valueOf(this.f140457A), Integer.valueOf(qq22.f140457A)) && C46238a.m51546a(this.f140458B, qq22.f140458B) && C46238a.m51546a(this.f140459C, qq22.f140459C) && C46238a.m51546a(this.f140460D, qq22.f140460D) && C46238a.m51546a(this.f140461E, qq22.f140461E) && C46238a.m51546a(Boolean.valueOf(this.f140462F), Boolean.valueOf(qq22.f140462F));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f140463d;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f140463d.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f140464e);
            aVar.mo74318e(6, this.f140465f);
            aVar.mo74320g(7, 8, this.f140466g);
            aVar.mo74318e(8, this.f140467h);
            aVar.mo74318e(9, this.f140468i);
            ly4 ly4 = this.f140469j;
            if (ly4 != null) {
                aVar.mo74322i(10, ly4.computeSize());
                this.f140469j.writeFields(aVar);
            }
            aVar.mo74320g(11, 8, this.f140470n);
            aVar.mo74318e(12, this.f140471o);
            aVar.mo74321h(13, this.f140472p);
            C49873in1 in12 = this.f140473q;
            if (in12 != null) {
                aVar.mo74322i(14, in12.computeSize());
                this.f140473q.writeFields(aVar);
            }
            aVar.mo74320g(15, 1, this.f140474r);
            String str = this.f140475s;
            if (str != null) {
                aVar.mo74323j(16, str);
            }
            aVar.mo74318e(17, this.f140476t);
            C49728hn1 hn12 = this.f140477u;
            if (hn12 != null) {
                aVar.mo74322i(18, hn12.computeSize());
                this.f140477u.writeFields(aVar);
            }
            aVar.mo74320g(19, 8, this.f140478v);
            C50295lp1 lp12 = this.f140479w;
            if (lp12 != null) {
                aVar.mo74322i(20, lp12.computeSize());
                this.f140479w.writeFields(aVar);
            }
            C50838pj1 pj12 = this.f140480x;
            if (pj12 != null) {
                aVar.mo74322i(21, pj12.computeSize());
                this.f140480x.writeFields(aVar);
            }
            C51252sj0 sj02 = this.f140481y;
            if (sj02 != null) {
                aVar.mo74322i(22, sj02.computeSize());
                this.f140481y.writeFields(aVar);
            }
            String str2 = this.f140482z;
            if (str2 != null) {
                aVar.mo74323j(26, str2);
            }
            aVar.mo74318e(28, this.f140457A);
            C49300el1 el12 = this.f140458B;
            if (el12 != null) {
                aVar.mo74322i(29, el12.computeSize());
                this.f140458B.writeFields(aVar);
            }
            C49002ch0 ch02 = this.f140459C;
            if (ch02 != null) {
                aVar.mo74322i(30, ch02.computeSize());
                this.f140459C.writeFields(aVar);
            }
            aVar.mo74320g(33, 6, this.f140460D);
            C50687oi1 oi12 = this.f140461E;
            if (oi12 != null) {
                aVar.mo74322i(34, oi12.computeSize());
                this.f140461E.writeFields(aVar);
            }
            aVar.mo74314a(10000, this.f140462F);
            return 0;
        } else if (i2 == 1) {
            C51018qv3 qv33 = this.f140463d;
            if (qv33 != null) {
                i3 = C52418a.m58682i(3, qv33.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(5, this.f140464e) + C52418a.m58678e(6, this.f140465f) + C52418a.m58680g(7, 8, this.f140466g) + C52418a.m58678e(8, this.f140467h) + C52418a.m58678e(9, this.f140468i);
            ly4 ly42 = this.f140469j;
            if (ly42 != null) {
                e += C52418a.m58682i(10, ly42.computeSize());
            }
            int g = e + C52418a.m58680g(11, 8, this.f140470n) + C52418a.m58678e(12, this.f140471o) + C52418a.m58681h(13, this.f140472p);
            C49873in1 in13 = this.f140473q;
            if (in13 != null) {
                g += C52418a.m58682i(14, in13.computeSize());
            }
            int g2 = g + C52418a.m58680g(15, 1, this.f140474r);
            String str3 = this.f140475s;
            if (str3 != null) {
                g2 += C52418a.m58683j(16, str3);
            }
            int e2 = g2 + C52418a.m58678e(17, this.f140476t);
            C49728hn1 hn13 = this.f140477u;
            if (hn13 != null) {
                e2 += C52418a.m58682i(18, hn13.computeSize());
            }
            int g3 = e2 + C52418a.m58680g(19, 8, this.f140478v);
            C50295lp1 lp13 = this.f140479w;
            if (lp13 != null) {
                g3 += C52418a.m58682i(20, lp13.computeSize());
            }
            C50838pj1 pj13 = this.f140480x;
            if (pj13 != null) {
                g3 += C52418a.m58682i(21, pj13.computeSize());
            }
            C51252sj0 sj03 = this.f140481y;
            if (sj03 != null) {
                g3 += C52418a.m58682i(22, sj03.computeSize());
            }
            String str4 = this.f140482z;
            if (str4 != null) {
                g3 += C52418a.m58683j(26, str4);
            }
            int e3 = g3 + C52418a.m58678e(28, this.f140457A);
            C49300el1 el13 = this.f140458B;
            if (el13 != null) {
                e3 += C52418a.m58682i(29, el13.computeSize());
            }
            C49002ch0 ch03 = this.f140459C;
            if (ch03 != null) {
                e3 += C52418a.m58682i(30, ch03.computeSize());
            }
            int g4 = e3 + C52418a.m58680g(33, 6, this.f140460D);
            C50687oi1 oi13 = this.f140461E;
            if (oi13 != null) {
                g4 += C52418a.m58682i(34, oi13.computeSize());
            }
            return g4 + C52418a.m58674a(10000, this.f140462F);
        } else if (i2 == 2) {
            this.f140466g.clear();
            this.f140470n.clear();
            this.f140474r.clear();
            this.f140478v.clear();
            this.f140460D.clear();
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
            C50997qq2 qq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    qq22.f140463d = qv34;
                }
                return 0;
            } else if (intValue == 26) {
                qq22.f140482z = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 10000) {
                qq22.f140462F = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 33) {
                qq22.f140460D.add(aVar3.mo141626d(intValue));
                return 0;
            } else if (intValue != 34) {
                switch (intValue) {
                    case 5:
                        qq22.f140464e = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        qq22.f140465f = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C49027cn1 cn12 = new C49027cn1();
                            if (bArr2 != null && bArr2.length > 0) {
                                cn12.parseFrom(bArr2);
                            }
                            qq22.f140466g.add(cn12);
                        }
                        return 0;
                    case 8:
                        qq22.f140467h = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        qq22.f140468i = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            ly4 ly43 = new ly4();
                            if (bArr3 != null && bArr3.length > 0) {
                                ly43.parseFrom(bArr3);
                            }
                            qq22.f140469j = ly43;
                        }
                        return 0;
                    case 11:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C64373fs0 fs02 = new C64373fs0();
                            if (bArr4 != null && bArr4.length > 0) {
                                fs02.parseFrom(bArr4);
                            }
                            qq22.f140470n.add(fs02);
                        }
                        return 0;
                    case 12:
                        qq22.f140471o = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        qq22.f140472p = aVar3.mo141631i(intValue);
                        return 0;
                    case 14:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            byte[] bArr5 = j5.get(i8);
                            C49873in1 in14 = new C49873in1();
                            if (bArr5 != null && bArr5.length > 0) {
                                in14.parseFrom(bArr5);
                            }
                            qq22.f140473q = in14;
                        }
                        return 0;
                    case 15:
                        qq22.f140474r.add(aVar3.mo141633k(intValue));
                        return 0;
                    case 16:
                        qq22.f140475s = aVar3.mo141633k(intValue);
                        return 0;
                    case 17:
                        qq22.f140476t = aVar3.mo141629g(intValue);
                        return 0;
                    case 18:
                        LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                        int size6 = j6.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            byte[] bArr6 = j6.get(i9);
                            C49728hn1 hn14 = new C49728hn1();
                            if (bArr6 != null && bArr6.length > 0) {
                                hn14.parseFrom(bArr6);
                            }
                            qq22.f140477u = hn14;
                        }
                        return 0;
                    case 19:
                        LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                        int size7 = j7.size();
                        for (int i15 = 0; i15 < size7; i15++) {
                            byte[] bArr7 = j7.get(i15);
                            C49161dl1 dl12 = new C49161dl1();
                            if (bArr7 != null && bArr7.length > 0) {
                                dl12.parseFrom(bArr7);
                            }
                            qq22.f140478v.add(dl12);
                        }
                        return 0;
                    case 20:
                        LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                        int size8 = j8.size();
                        for (int i16 = 0; i16 < size8; i16++) {
                            byte[] bArr8 = j8.get(i16);
                            C50295lp1 lp14 = new C50295lp1();
                            if (bArr8 != null && bArr8.length > 0) {
                                lp14.parseFrom(bArr8);
                            }
                            qq22.f140479w = lp14;
                        }
                        return 0;
                    case 21:
                        LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                        int size9 = j9.size();
                        for (int i17 = 0; i17 < size9; i17++) {
                            byte[] bArr9 = j9.get(i17);
                            C50838pj1 pj14 = new C50838pj1();
                            if (bArr9 != null && bArr9.length > 0) {
                                pj14.parseFrom(bArr9);
                            }
                            qq22.f140480x = pj14;
                        }
                        return 0;
                    case 22:
                        LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                        int size10 = j15.size();
                        for (int i18 = 0; i18 < size10; i18++) {
                            byte[] bArr10 = j15.get(i18);
                            C51252sj0 sj04 = new C51252sj0();
                            if (bArr10 != null && bArr10.length > 0) {
                                sj04.parseFrom(bArr10);
                            }
                            qq22.f140481y = sj04;
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 28:
                                qq22.f140457A = aVar3.mo141629g(intValue);
                                return 0;
                            case 29:
                                LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                                int size11 = j16.size();
                                for (int i19 = 0; i19 < size11; i19++) {
                                    byte[] bArr11 = j16.get(i19);
                                    C49300el1 el14 = new C49300el1();
                                    if (bArr11 != null && bArr11.length > 0) {
                                        el14.parseFrom(bArr11);
                                    }
                                    qq22.f140458B = el14;
                                }
                                return 0;
                            case 30:
                                LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                                int size12 = j17.size();
                                for (int i25 = 0; i25 < size12; i25++) {
                                    byte[] bArr12 = j17.get(i25);
                                    C49002ch0 ch04 = new C49002ch0();
                                    if (bArr12 != null && bArr12.length > 0) {
                                        ch04.parseFrom(bArr12);
                                    }
                                    qq22.f140459C = ch04;
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                int size13 = j18.size();
                for (int i26 = 0; i26 < size13; i26++) {
                    byte[] bArr13 = j18.get(i26);
                    C50687oi1 oi14 = new C50687oi1();
                    if (bArr13 != null && bArr13.length > 0) {
                        oi14.parseFrom(bArr13);
                    }
                    qq22.f140461E = oi14;
                }
                return 0;
            }
        }
    }
}
