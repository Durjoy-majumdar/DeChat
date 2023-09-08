package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l60 */
public class C50221l60 extends C47465a {

    /* renamed from: A */
    public String f137193A;

    /* renamed from: B */
    public p54 f137194B;

    /* renamed from: C */
    public int f137195C;

    /* renamed from: D */
    public LinkedList<C50831ph3> f137196D = new LinkedList<>();

    /* renamed from: d */
    public String f137197d;

    /* renamed from: e */
    public s44 f137198e;

    /* renamed from: f */
    public LinkedList<v54> f137199f = new LinkedList<>();

    /* renamed from: g */
    public m54 f137200g;

    /* renamed from: h */
    public long f137201h;

    /* renamed from: i */
    public C51883wv3 f137202i;

    /* renamed from: j */
    public int f137203j;

    /* renamed from: n */
    public long f137204n;

    /* renamed from: o */
    public long f137205o;

    /* renamed from: p */
    public int f137206p;

    /* renamed from: q */
    public String f137207q;

    /* renamed from: r */
    public String f137208r;

    /* renamed from: s */
    public String f137209s;

    /* renamed from: t */
    public String f137210t;

    /* renamed from: u */
    public String f137211u;

    /* renamed from: v */
    public int f137212v;

    /* renamed from: w */
    public String f137213w;

    /* renamed from: x */
    public String f137214x;

    /* renamed from: y */
    public int f137215y;

    /* renamed from: z */
    public int f137216z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50221l60)) {
            return false;
        }
        C50221l60 l602 = (C50221l60) aVar;
        return C46238a.m51546a(this.f137197d, l602.f137197d) && C46238a.m51546a(this.f137198e, l602.f137198e) && C46238a.m51546a(this.f137199f, l602.f137199f) && C46238a.m51546a(this.f137200g, l602.f137200g) && C46238a.m51546a(Long.valueOf(this.f137201h), Long.valueOf(l602.f137201h)) && C46238a.m51546a(this.f137202i, l602.f137202i) && C46238a.m51546a(Integer.valueOf(this.f137203j), Integer.valueOf(l602.f137203j)) && C46238a.m51546a(Long.valueOf(this.f137204n), Long.valueOf(l602.f137204n)) && C46238a.m51546a(Long.valueOf(this.f137205o), Long.valueOf(l602.f137205o)) && C46238a.m51546a(Integer.valueOf(this.f137206p), Integer.valueOf(l602.f137206p)) && C46238a.m51546a(this.f137207q, l602.f137207q) && C46238a.m51546a(this.f137208r, l602.f137208r) && C46238a.m51546a(this.f137209s, l602.f137209s) && C46238a.m51546a(this.f137210t, l602.f137210t) && C46238a.m51546a(this.f137211u, l602.f137211u) && C46238a.m51546a(Integer.valueOf(this.f137212v), Integer.valueOf(l602.f137212v)) && C46238a.m51546a(this.f137213w, l602.f137213w) && C46238a.m51546a(this.f137214x, l602.f137214x) && C46238a.m51546a(Integer.valueOf(this.f137215y), Integer.valueOf(l602.f137215y)) && C46238a.m51546a(Integer.valueOf(this.f137216z), Integer.valueOf(l602.f137216z)) && C46238a.m51546a(this.f137193A, l602.f137193A) && C46238a.m51546a(this.f137194B, l602.f137194B) && C46238a.m51546a(Integer.valueOf(this.f137195C), Integer.valueOf(l602.f137195C)) && C46238a.m51546a(this.f137196D, l602.f137196D);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137197d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            s44 s44 = this.f137198e;
            if (s44 != null) {
                aVar.mo74322i(2, s44.computeSize());
                this.f137198e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f137199f);
            m54 m54 = this.f137200g;
            if (m54 != null) {
                aVar.mo74322i(4, m54.computeSize());
                this.f137200g.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f137201h);
            C51883wv3 wv32 = this.f137202i;
            if (wv32 != null) {
                aVar.mo74322i(6, wv32.computeSize());
                this.f137202i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f137203j);
            aVar.mo74321h(8, this.f137204n);
            aVar.mo74321h(9, this.f137205o);
            aVar.mo74318e(10, this.f137206p);
            String str2 = this.f137207q;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            String str3 = this.f137208r;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            String str4 = this.f137209s;
            if (str4 != null) {
                aVar.mo74323j(13, str4);
            }
            String str5 = this.f137210t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            String str6 = this.f137211u;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            aVar.mo74318e(16, this.f137212v);
            String str7 = this.f137213w;
            if (str7 != null) {
                aVar.mo74323j(17, str7);
            }
            String str8 = this.f137214x;
            if (str8 != null) {
                aVar.mo74323j(18, str8);
            }
            aVar.mo74318e(19, this.f137215y);
            aVar.mo74318e(20, this.f137216z);
            String str9 = this.f137193A;
            if (str9 != null) {
                aVar.mo74323j(21, str9);
            }
            p54 p54 = this.f137194B;
            if (p54 != null) {
                aVar.mo74322i(22, p54.computeSize());
                this.f137194B.writeFields(aVar);
            }
            aVar.mo74318e(23, this.f137195C);
            aVar.mo74320g(24, 8, this.f137196D);
            return 0;
        } else if (i2 == 1) {
            String str10 = this.f137197d;
            if (str10 != null) {
                i3 = C52418a.m58683j(1, str10) + 0;
            }
            s44 s442 = this.f137198e;
            if (s442 != null) {
                i3 += C52418a.m58682i(2, s442.computeSize());
            }
            int g = i3 + C52418a.m58680g(3, 8, this.f137199f);
            m54 m542 = this.f137200g;
            if (m542 != null) {
                g += C52418a.m58682i(4, m542.computeSize());
            }
            int h = g + C52418a.m58681h(5, this.f137201h);
            C51883wv3 wv33 = this.f137202i;
            if (wv33 != null) {
                h += C52418a.m58682i(6, wv33.computeSize());
            }
            int e = h + C52418a.m58678e(7, this.f137203j) + C52418a.m58681h(8, this.f137204n) + C52418a.m58681h(9, this.f137205o) + C52418a.m58678e(10, this.f137206p);
            String str11 = this.f137207q;
            if (str11 != null) {
                e += C52418a.m58683j(11, str11);
            }
            String str12 = this.f137208r;
            if (str12 != null) {
                e += C52418a.m58683j(12, str12);
            }
            String str13 = this.f137209s;
            if (str13 != null) {
                e += C52418a.m58683j(13, str13);
            }
            String str14 = this.f137210t;
            if (str14 != null) {
                e += C52418a.m58683j(14, str14);
            }
            String str15 = this.f137211u;
            if (str15 != null) {
                e += C52418a.m58683j(15, str15);
            }
            int e2 = e + C52418a.m58678e(16, this.f137212v);
            String str16 = this.f137213w;
            if (str16 != null) {
                e2 += C52418a.m58683j(17, str16);
            }
            String str17 = this.f137214x;
            if (str17 != null) {
                e2 += C52418a.m58683j(18, str17);
            }
            int e3 = e2 + C52418a.m58678e(19, this.f137215y) + C52418a.m58678e(20, this.f137216z);
            String str18 = this.f137193A;
            if (str18 != null) {
                e3 += C52418a.m58683j(21, str18);
            }
            p54 p542 = this.f137194B;
            if (p542 != null) {
                e3 += C52418a.m58682i(22, p542.computeSize());
            }
            return e3 + C52418a.m58678e(23, this.f137195C) + C52418a.m58680g(24, 8, this.f137196D);
        } else if (i2 == 2) {
            this.f137199f.clear();
            this.f137196D.clear();
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
            C50221l60 l602 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l602.f137197d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        s44 s443 = new s44();
                        if (bArr != null && bArr.length > 0) {
                            s443.parseFrom(bArr);
                        }
                        l602.f137198e = s443;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        v54 v54 = new v54();
                        if (bArr2 != null && bArr2.length > 0) {
                            v54.parseFrom(bArr2);
                        }
                        l602.f137199f.add(v54);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        m54 m543 = new m54();
                        if (bArr3 != null && bArr3.length > 0) {
                            m543.parseFrom(bArr3);
                        }
                        l602.f137200g = m543;
                    }
                    return 0;
                case 5:
                    l602.f137201h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51883wv3 wv34 = new C51883wv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            wv34.parseFrom(bArr4);
                        }
                        l602.f137202i = wv34;
                    }
                    return 0;
                case 7:
                    l602.f137203j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    l602.f137204n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    l602.f137205o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    l602.f137206p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    l602.f137207q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    l602.f137208r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    l602.f137209s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    l602.f137210t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    l602.f137211u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    l602.f137212v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    l602.f137213w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    l602.f137214x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    l602.f137215y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    l602.f137216z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    l602.f137193A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        p54 p543 = new p54();
                        if (bArr5 != null && bArr5.length > 0) {
                            p543.parseFrom(bArr5);
                        }
                        l602.f137194B = p543;
                    }
                    return 0;
                case 23:
                    l602.f137195C = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50831ph3 ph32 = new C50831ph3();
                        if (bArr6 != null && bArr6.length > 0) {
                            ph32.parseFrom(bArr6);
                        }
                        l602.f137196D.add(ph32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
