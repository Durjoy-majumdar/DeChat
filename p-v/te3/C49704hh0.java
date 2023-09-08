package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hh0 */
public class C49704hh0 extends C47465a {

    /* renamed from: d */
    public int f134634d;

    /* renamed from: e */
    public String f134635e;

    /* renamed from: f */
    public int f134636f;

    /* renamed from: g */
    public LinkedList<C64728tj0> f134637g = new LinkedList<>();

    /* renamed from: h */
    public String f134638h;

    /* renamed from: i */
    public String f134639i;

    /* renamed from: j */
    public String f134640j;

    /* renamed from: n */
    public String f134641n;

    /* renamed from: o */
    public LinkedList<String> f134642o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C22489al0> f134643p = new LinkedList<>();

    /* renamed from: q */
    public int f134644q;

    /* renamed from: r */
    public int f134645r;

    /* renamed from: s */
    public String f134646s;

    /* renamed from: t */
    public LinkedList<C51058r50> f134647t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<C51058r50> f134648u = new LinkedList<>();

    /* renamed from: v */
    public LinkedList<C64728tj0> f134649v = new LinkedList<>();

    /* renamed from: w */
    public LinkedList<C51058r50> f134650w = new LinkedList<>();

    /* renamed from: x */
    public LinkedList<C51058r50> f134651x = new LinkedList<>();

    /* renamed from: y */
    public LinkedList<C64728tj0> f134652y = new LinkedList<>();

    /* renamed from: z */
    public C49560gh0 f134653z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49704hh0)) {
            return false;
        }
        C49704hh0 hh02 = (C49704hh0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134634d), Integer.valueOf(hh02.f134634d)) && C46238a.m51546a(this.f134635e, hh02.f134635e) && C46238a.m51546a(Integer.valueOf(this.f134636f), Integer.valueOf(hh02.f134636f)) && C46238a.m51546a(this.f134637g, hh02.f134637g) && C46238a.m51546a(this.f134638h, hh02.f134638h) && C46238a.m51546a(this.f134639i, hh02.f134639i) && C46238a.m51546a(this.f134640j, hh02.f134640j) && C46238a.m51546a(this.f134641n, hh02.f134641n) && C46238a.m51546a(this.f134642o, hh02.f134642o) && C46238a.m51546a(this.f134643p, hh02.f134643p) && C46238a.m51546a(Integer.valueOf(this.f134644q), Integer.valueOf(hh02.f134644q)) && C46238a.m51546a(Integer.valueOf(this.f134645r), Integer.valueOf(hh02.f134645r)) && C46238a.m51546a(this.f134646s, hh02.f134646s) && C46238a.m51546a(this.f134647t, hh02.f134647t) && C46238a.m51546a(this.f134648u, hh02.f134648u) && C46238a.m51546a(this.f134649v, hh02.f134649v) && C46238a.m51546a(this.f134650w, hh02.f134650w) && C46238a.m51546a(this.f134651x, hh02.f134651x) && C46238a.m51546a(this.f134652y, hh02.f134652y) && C46238a.m51546a(this.f134653z, hh02.f134653z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134634d);
            String str = this.f134635e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f134636f);
            aVar.mo74320g(4, 8, this.f134637g);
            String str2 = this.f134638h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f134639i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f134640j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f134641n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74320g(9, 1, this.f134642o);
            aVar.mo74320g(10, 8, this.f134643p);
            aVar.mo74318e(11, this.f134644q);
            aVar.mo74318e(12, this.f134645r);
            String str6 = this.f134646s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            aVar.mo74320g(14, 8, this.f134647t);
            aVar.mo74320g(15, 8, this.f134648u);
            aVar.mo74320g(16, 8, this.f134649v);
            aVar.mo74320g(17, 8, this.f134650w);
            aVar.mo74320g(18, 8, this.f134651x);
            aVar.mo74320g(19, 8, this.f134652y);
            C49560gh0 gh02 = this.f134653z;
            if (gh02 != null) {
                aVar.mo74322i(20, gh02.computeSize());
                this.f134653z.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f134634d) + 0;
            String str7 = this.f134635e;
            if (str7 != null) {
                e += C52418a.m58683j(2, str7);
            }
            int e2 = e + C52418a.m58678e(3, this.f134636f) + C52418a.m58680g(4, 8, this.f134637g);
            String str8 = this.f134638h;
            if (str8 != null) {
                e2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f134639i;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f134640j;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            String str11 = this.f134641n;
            if (str11 != null) {
                e2 += C52418a.m58683j(8, str11);
            }
            int g = e2 + C52418a.m58680g(9, 1, this.f134642o) + C52418a.m58680g(10, 8, this.f134643p) + C52418a.m58678e(11, this.f134644q) + C52418a.m58678e(12, this.f134645r);
            String str12 = this.f134646s;
            if (str12 != null) {
                g += C52418a.m58683j(13, str12);
            }
            int g2 = g + C52418a.m58680g(14, 8, this.f134647t) + C52418a.m58680g(15, 8, this.f134648u) + C52418a.m58680g(16, 8, this.f134649v) + C52418a.m58680g(17, 8, this.f134650w) + C52418a.m58680g(18, 8, this.f134651x) + C52418a.m58680g(19, 8, this.f134652y);
            C49560gh0 gh03 = this.f134653z;
            return gh03 != null ? g2 + C52418a.m58682i(20, gh03.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f134637g.clear();
            this.f134642o.clear();
            this.f134643p.clear();
            this.f134647t.clear();
            this.f134648u.clear();
            this.f134649v.clear();
            this.f134650w.clear();
            this.f134651x.clear();
            this.f134652y.clear();
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
            C49704hh0 hh02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hh02.f134634d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hh02.f134635e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hh02.f134636f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64728tj0 tj02 = new C64728tj0();
                        if (bArr != null && bArr.length > 0) {
                            tj02.parseFrom(bArr);
                        }
                        hh02.f134637g.add(tj02);
                    }
                    return 0;
                case 5:
                    hh02.f134638h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hh02.f134639i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hh02.f134640j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hh02.f134641n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hh02.f134642o.add(aVar3.mo141633k(intValue));
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22489al0 al02 = new C22489al0();
                        if (bArr2 != null && bArr2.length > 0) {
                            al02.parseFrom(bArr2);
                        }
                        hh02.f134643p.add(al02);
                    }
                    return 0;
                case 11:
                    hh02.f134644q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    hh02.f134645r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    hh02.f134646s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51058r50 r502 = new C51058r50();
                        if (bArr3 != null && bArr3.length > 0) {
                            r502.parseFrom(bArr3);
                        }
                        hh02.f134647t.add(r502);
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51058r50 r503 = new C51058r50();
                        if (bArr4 != null && bArr4.length > 0) {
                            r503.parseFrom(bArr4);
                        }
                        hh02.f134648u.add(r503);
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C64728tj0 tj03 = new C64728tj0();
                        if (bArr5 != null && bArr5.length > 0) {
                            tj03.parseFrom(bArr5);
                        }
                        hh02.f134649v.add(tj03);
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51058r50 r504 = new C51058r50();
                        if (bArr6 != null && bArr6.length > 0) {
                            r504.parseFrom(bArr6);
                        }
                        hh02.f134650w.add(r504);
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C51058r50 r505 = new C51058r50();
                        if (bArr7 != null && bArr7.length > 0) {
                            r505.parseFrom(bArr7);
                        }
                        hh02.f134651x.add(r505);
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C64728tj0 tj04 = new C64728tj0();
                        if (bArr8 != null && bArr8.length > 0) {
                            tj04.parseFrom(bArr8);
                        }
                        hh02.f134652y.add(tj04);
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C49560gh0 gh04 = new C49560gh0();
                        if (bArr9 != null && bArr9.length > 0) {
                            gh04.parseFrom(bArr9);
                        }
                        hh02.f134653z = gh04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
