package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ke1 */
public class C50119ke1 extends C49335eu3 {

    /* renamed from: A */
    public String f136684A;

    /* renamed from: B */
    public String f136685B;

    /* renamed from: C */
    public LinkedList<hk4> f136686C = new LinkedList<>();

    /* renamed from: D */
    public C51141rq3 f136687D;

    /* renamed from: E */
    public int f136688E;

    /* renamed from: F */
    public int f136689F;

    /* renamed from: d */
    public String f136690d;

    /* renamed from: e */
    public String f136691e;

    /* renamed from: f */
    public String f136692f;

    /* renamed from: g */
    public int f136693g;

    /* renamed from: h */
    public int f136694h;

    /* renamed from: i */
    public int f136695i;

    /* renamed from: j */
    public int f136696j;

    /* renamed from: n */
    public int f136697n;

    /* renamed from: o */
    public int f136698o;

    /* renamed from: p */
    public int f136699p;

    /* renamed from: q */
    public int f136700q;

    /* renamed from: r */
    public int f136701r;

    /* renamed from: s */
    public C49890is1 f136702s;

    /* renamed from: t */
    public C48718ai1 f136703t;

    /* renamed from: u */
    public LinkedList<C64373fs0> f136704u = new LinkedList<>();

    /* renamed from: v */
    public int f136705v;

    /* renamed from: w */
    public long f136706w;

    /* renamed from: x */
    public C52110yf3 f136707x;

    /* renamed from: y */
    public int f136708y;

    /* renamed from: z */
    public LinkedList<C52261zg3> f136709z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50119ke1)) {
            return false;
        }
        C50119ke1 ke12 = (C50119ke1) aVar;
        return C46238a.m51546a(this.BaseResponse, ke12.BaseResponse) && C46238a.m51546a(this.f136690d, ke12.f136690d) && C46238a.m51546a(this.f136691e, ke12.f136691e) && C46238a.m51546a(this.f136692f, ke12.f136692f) && C46238a.m51546a(Integer.valueOf(this.f136693g), Integer.valueOf(ke12.f136693g)) && C46238a.m51546a(Integer.valueOf(this.f136694h), Integer.valueOf(ke12.f136694h)) && C46238a.m51546a(Integer.valueOf(this.f136695i), Integer.valueOf(ke12.f136695i)) && C46238a.m51546a(Integer.valueOf(this.f136696j), Integer.valueOf(ke12.f136696j)) && C46238a.m51546a(Integer.valueOf(this.f136697n), Integer.valueOf(ke12.f136697n)) && C46238a.m51546a(Integer.valueOf(this.f136698o), Integer.valueOf(ke12.f136698o)) && C46238a.m51546a(Integer.valueOf(this.f136699p), Integer.valueOf(ke12.f136699p)) && C46238a.m51546a(Integer.valueOf(this.f136700q), Integer.valueOf(ke12.f136700q)) && C46238a.m51546a(Integer.valueOf(this.f136701r), Integer.valueOf(ke12.f136701r)) && C46238a.m51546a(this.f136702s, ke12.f136702s) && C46238a.m51546a(this.f136703t, ke12.f136703t) && C46238a.m51546a(this.f136704u, ke12.f136704u) && C46238a.m51546a(Integer.valueOf(this.f136705v), Integer.valueOf(ke12.f136705v)) && C46238a.m51546a(Long.valueOf(this.f136706w), Long.valueOf(ke12.f136706w)) && C46238a.m51546a(this.f136707x, ke12.f136707x) && C46238a.m51546a(Integer.valueOf(this.f136708y), Integer.valueOf(ke12.f136708y)) && C46238a.m51546a(this.f136709z, ke12.f136709z) && C46238a.m51546a(this.f136684A, ke12.f136684A) && C46238a.m51546a(this.f136685B, ke12.f136685B) && C46238a.m51546a(this.f136686C, ke12.f136686C) && C46238a.m51546a(this.f136687D, ke12.f136687D) && C46238a.m51546a(Integer.valueOf(this.f136688E), Integer.valueOf(ke12.f136688E)) && C46238a.m51546a(Integer.valueOf(this.f136689F), Integer.valueOf(ke12.f136689F));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            String str = this.f136690d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136691e;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f136692f;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f136693g);
            aVar.mo74318e(7, this.f136694h);
            aVar.mo74318e(8, this.f136695i);
            aVar.mo74318e(9, this.f136696j);
            aVar.mo74318e(11, this.f136697n);
            aVar.mo74318e(12, this.f136698o);
            aVar.mo74318e(13, this.f136699p);
            aVar.mo74318e(14, this.f136700q);
            aVar.mo74318e(15, this.f136701r);
            C49890is1 is12 = this.f136702s;
            if (is12 != null) {
                aVar.mo74322i(16, is12.computeSize());
                this.f136702s.writeFields(aVar);
            }
            C48718ai1 ai12 = this.f136703t;
            if (ai12 != null) {
                aVar.mo74322i(17, ai12.computeSize());
                this.f136703t.writeFields(aVar);
            }
            aVar.mo74320g(18, 8, this.f136704u);
            aVar.mo74318e(19, this.f136705v);
            aVar.mo74321h(20, this.f136706w);
            C52110yf3 yf32 = this.f136707x;
            if (yf32 != null) {
                aVar.mo74322i(21, yf32.computeSize());
                this.f136707x.writeFields(aVar);
            }
            aVar.mo74318e(22, this.f136708y);
            aVar.mo74320g(30, 8, this.f136709z);
            String str4 = this.f136684A;
            if (str4 != null) {
                aVar.mo74323j(32, str4);
            }
            String str5 = this.f136685B;
            if (str5 != null) {
                aVar.mo74323j(33, str5);
            }
            aVar.mo74320g(35, 8, this.f136686C);
            C51141rq3 rq32 = this.f136687D;
            if (rq32 != null) {
                aVar.mo74322i(36, rq32.computeSize());
                this.f136687D.writeFields(aVar);
            }
            aVar.mo74318e(37, this.f136688E);
            aVar.mo74318e(38, this.f136689F);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str6 = this.f136690d;
            if (str6 != null) {
                i3 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f136691e;
            if (str7 != null) {
                i3 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f136692f;
            if (str8 != null) {
                i3 += C52418a.m58683j(5, str8);
            }
            int e = i3 + C52418a.m58678e(6, this.f136693g) + C52418a.m58678e(7, this.f136694h) + C52418a.m58678e(8, this.f136695i) + C52418a.m58678e(9, this.f136696j) + C52418a.m58678e(11, this.f136697n) + C52418a.m58678e(12, this.f136698o) + C52418a.m58678e(13, this.f136699p) + C52418a.m58678e(14, this.f136700q) + C52418a.m58678e(15, this.f136701r);
            C49890is1 is13 = this.f136702s;
            if (is13 != null) {
                e += C52418a.m58682i(16, is13.computeSize());
            }
            C48718ai1 ai13 = this.f136703t;
            if (ai13 != null) {
                e += C52418a.m58682i(17, ai13.computeSize());
            }
            int g = e + C52418a.m58680g(18, 8, this.f136704u) + C52418a.m58678e(19, this.f136705v) + C52418a.m58681h(20, this.f136706w);
            C52110yf3 yf33 = this.f136707x;
            if (yf33 != null) {
                g += C52418a.m58682i(21, yf33.computeSize());
            }
            int e2 = g + C52418a.m58678e(22, this.f136708y) + C52418a.m58680g(30, 8, this.f136709z);
            String str9 = this.f136684A;
            if (str9 != null) {
                e2 += C52418a.m58683j(32, str9);
            }
            String str10 = this.f136685B;
            if (str10 != null) {
                e2 += C52418a.m58683j(33, str10);
            }
            int g2 = e2 + C52418a.m58680g(35, 8, this.f136686C);
            C51141rq3 rq33 = this.f136687D;
            if (rq33 != null) {
                g2 += C52418a.m58682i(36, rq33.computeSize());
            }
            return g2 + C52418a.m58678e(37, this.f136688E) + C52418a.m58678e(38, this.f136689F);
        } else if (i2 == 2) {
            this.f136704u.clear();
            this.f136709z.clear();
            this.f136686C.clear();
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
            C50119ke1 ke12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ke12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ke12.f136690d = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ke12.f136691e = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ke12.f136692f = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ke12.f136693g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ke12.f136694h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ke12.f136695i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ke12.f136696j = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ke12.f136697n = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ke12.f136698o = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    ke12.f136699p = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    ke12.f136700q = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    ke12.f136701r = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49890is1 is14 = new C49890is1();
                        if (bArr2 != null && bArr2.length > 0) {
                            is14.parseFrom(bArr2);
                        }
                        ke12.f136702s = is14;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48718ai1 ai14 = new C48718ai1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ai14.parseFrom(bArr3);
                        }
                        ke12.f136703t = ai14;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64373fs0 fs02 = new C64373fs0();
                        if (bArr4 != null && bArr4.length > 0) {
                            fs02.parseFrom(bArr4);
                        }
                        ke12.f136704u.add(fs02);
                    }
                    return 0;
                case 19:
                    ke12.f136705v = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    ke12.f136706w = aVar3.mo141631i(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C52110yf3 yf34 = new C52110yf3();
                        if (bArr5 != null && bArr5.length > 0) {
                            yf34.parseFrom(bArr5);
                        }
                        ke12.f136707x = yf34;
                    }
                    return 0;
                case 22:
                    ke12.f136708y = aVar3.mo141629g(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C52261zg3 zg32 = new C52261zg3();
                        if (bArr6 != null && bArr6.length > 0) {
                            zg32.parseFrom(bArr6);
                        }
                        ke12.f136709z.add(zg32);
                    }
                    return 0;
                case 32:
                    ke12.f136684A = aVar3.mo141633k(intValue);
                    return 0;
                case 33:
                    ke12.f136685B = aVar3.mo141633k(intValue);
                    return 0;
                case 35:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        hk4 hk4 = new hk4();
                        if (bArr7 != null && bArr7.length > 0) {
                            hk4.parseFrom(bArr7);
                        }
                        ke12.f136686C.add(hk4);
                    }
                    return 0;
                case 36:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51141rq3 rq34 = new C51141rq3();
                        if (bArr8 != null && bArr8.length > 0) {
                            rq34.parseFrom(bArr8);
                        }
                        ke12.f136687D = rq34;
                    }
                    return 0;
                case 37:
                    ke12.f136688E = aVar3.mo141629g(intValue);
                    return 0;
                case 38:
                    ke12.f136689F = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
