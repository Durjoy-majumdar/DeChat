package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cw2 */
public class C64299cw2 extends C47465a {

    /* renamed from: A */
    public String f182571A;

    /* renamed from: B */
    public String f182572B;

    /* renamed from: C */
    public String f182573C;

    /* renamed from: D */
    public C64475jq0 f182574D;

    /* renamed from: E */
    public C48773aw3 f182575E;

    /* renamed from: d */
    public String f182576d;

    /* renamed from: e */
    public String f182577e;

    /* renamed from: f */
    public int f182578f;

    /* renamed from: g */
    public int f182579g;

    /* renamed from: h */
    public float f182580h;

    /* renamed from: i */
    public float f182581i;

    /* renamed from: j */
    public String f182582j;

    /* renamed from: n */
    public int f182583n;

    /* renamed from: o */
    public int f182584o;

    /* renamed from: p */
    public String f182585p;

    /* renamed from: q */
    public String f182586q;

    /* renamed from: r */
    public long f182587r;

    /* renamed from: s */
    public String f182588s;

    /* renamed from: t */
    public String f182589t;

    /* renamed from: u */
    public String f182590u;

    /* renamed from: v */
    public LinkedList<C64332dw2> f182591v = new LinkedList<>();

    /* renamed from: w */
    public C50435mq0 f182592w;

    /* renamed from: x */
    public C64876zb1 f182593x;

    /* renamed from: y */
    public int f182594y;

    /* renamed from: z */
    public C64450iq0 f182595z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64299cw2)) {
            return false;
        }
        C64299cw2 cw22 = (C64299cw2) aVar;
        return C46238a.m51546a(this.f182576d, cw22.f182576d) && C46238a.m51546a(this.f182577e, cw22.f182577e) && C46238a.m51546a(Integer.valueOf(this.f182578f), Integer.valueOf(cw22.f182578f)) && C46238a.m51546a(Integer.valueOf(this.f182579g), Integer.valueOf(cw22.f182579g)) && C46238a.m51546a(Float.valueOf(this.f182580h), Float.valueOf(cw22.f182580h)) && C46238a.m51546a(Float.valueOf(this.f182581i), Float.valueOf(cw22.f182581i)) && C46238a.m51546a(this.f182582j, cw22.f182582j) && C46238a.m51546a(Integer.valueOf(this.f182583n), Integer.valueOf(cw22.f182583n)) && C46238a.m51546a(Integer.valueOf(this.f182584o), Integer.valueOf(cw22.f182584o)) && C46238a.m51546a(this.f182585p, cw22.f182585p) && C46238a.m51546a(this.f182586q, cw22.f182586q) && C46238a.m51546a(Long.valueOf(this.f182587r), Long.valueOf(cw22.f182587r)) && C46238a.m51546a(this.f182588s, cw22.f182588s) && C46238a.m51546a(this.f182589t, cw22.f182589t) && C46238a.m51546a(this.f182590u, cw22.f182590u) && C46238a.m51546a(this.f182591v, cw22.f182591v) && C46238a.m51546a(this.f182592w, cw22.f182592w) && C46238a.m51546a(this.f182593x, cw22.f182593x) && C46238a.m51546a(Integer.valueOf(this.f182594y), Integer.valueOf(cw22.f182594y)) && C46238a.m51546a(this.f182595z, cw22.f182595z) && C46238a.m51546a(this.f182571A, cw22.f182571A) && C46238a.m51546a(this.f182572B, cw22.f182572B) && C46238a.m51546a(this.f182573C, cw22.f182573C) && C46238a.m51546a(this.f182574D, cw22.f182574D) && C46238a.m51546a(this.f182575E, cw22.f182575E);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182576d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182577e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f182578f);
            aVar.mo74318e(4, this.f182579g);
            aVar.mo74317d(5, this.f182580h);
            aVar.mo74317d(6, this.f182581i);
            String str3 = this.f182582j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f182583n);
            aVar.mo74318e(9, this.f182584o);
            String str4 = this.f182585p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            String str5 = this.f182586q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            aVar.mo74321h(12, this.f182587r);
            String str6 = this.f182588s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.f182589t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            String str8 = this.f182590u;
            if (str8 != null) {
                aVar.mo74323j(15, str8);
            }
            aVar.mo74320g(16, 8, this.f182591v);
            C50435mq0 mq02 = this.f182592w;
            if (mq02 != null) {
                aVar.mo74322i(17, mq02.computeSize());
                this.f182592w.writeFields(aVar);
            }
            C64876zb1 zb12 = this.f182593x;
            if (zb12 != null) {
                aVar.mo74322i(18, zb12.computeSize());
                this.f182593x.writeFields(aVar);
            }
            aVar.mo74318e(19, this.f182594y);
            C64450iq0 iq02 = this.f182595z;
            if (iq02 != null) {
                aVar.mo74322i(20, iq02.computeSize());
                this.f182595z.writeFields(aVar);
            }
            String str9 = this.f182571A;
            if (str9 != null) {
                aVar.mo74323j(21, str9);
            }
            String str10 = this.f182572B;
            if (str10 != null) {
                aVar.mo74323j(22, str10);
            }
            String str11 = this.f182573C;
            if (str11 != null) {
                aVar.mo74323j(23, str11);
            }
            C64475jq0 jq02 = this.f182574D;
            if (jq02 != null) {
                aVar.mo74322i(24, jq02.computeSize());
                this.f182574D.writeFields(aVar);
            }
            C48773aw3 aw32 = this.f182575E;
            if (aw32 != null) {
                aVar.mo74322i(25, aw32.computeSize());
                this.f182575E.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str12 = this.f182576d;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            String str13 = this.f182577e;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            int e = i3 + C52418a.m58678e(3, this.f182578f) + C52418a.m58678e(4, this.f182579g) + C52418a.m58677d(5, this.f182580h) + C52418a.m58677d(6, this.f182581i);
            String str14 = this.f182582j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            int e2 = e + C52418a.m58678e(8, this.f182583n) + C52418a.m58678e(9, this.f182584o);
            String str15 = this.f182585p;
            if (str15 != null) {
                e2 += C52418a.m58683j(10, str15);
            }
            String str16 = this.f182586q;
            if (str16 != null) {
                e2 += C52418a.m58683j(11, str16);
            }
            int h = e2 + C52418a.m58681h(12, this.f182587r);
            String str17 = this.f182588s;
            if (str17 != null) {
                h += C52418a.m58683j(13, str17);
            }
            String str18 = this.f182589t;
            if (str18 != null) {
                h += C52418a.m58683j(14, str18);
            }
            String str19 = this.f182590u;
            if (str19 != null) {
                h += C52418a.m58683j(15, str19);
            }
            int g = h + C52418a.m58680g(16, 8, this.f182591v);
            C50435mq0 mq03 = this.f182592w;
            if (mq03 != null) {
                g += C52418a.m58682i(17, mq03.computeSize());
            }
            C64876zb1 zb13 = this.f182593x;
            if (zb13 != null) {
                g += C52418a.m58682i(18, zb13.computeSize());
            }
            int e3 = g + C52418a.m58678e(19, this.f182594y);
            C64450iq0 iq03 = this.f182595z;
            if (iq03 != null) {
                e3 += C52418a.m58682i(20, iq03.computeSize());
            }
            String str20 = this.f182571A;
            if (str20 != null) {
                e3 += C52418a.m58683j(21, str20);
            }
            String str21 = this.f182572B;
            if (str21 != null) {
                e3 += C52418a.m58683j(22, str21);
            }
            String str22 = this.f182573C;
            if (str22 != null) {
                e3 += C52418a.m58683j(23, str22);
            }
            C64475jq0 jq03 = this.f182574D;
            if (jq03 != null) {
                e3 += C52418a.m58682i(24, jq03.computeSize());
            }
            C48773aw3 aw33 = this.f182575E;
            return aw33 != null ? e3 + C52418a.m58682i(25, aw33.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f182591v.clear();
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
            C64299cw2 cw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cw22.f182576d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cw22.f182577e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cw22.f182578f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    cw22.f182579g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cw22.f182580h = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    cw22.f182581i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    cw22.f182582j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cw22.f182583n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    cw22.f182584o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    cw22.f182585p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    cw22.f182586q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    cw22.f182587r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    cw22.f182588s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    cw22.f182589t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    cw22.f182590u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64332dw2 dw22 = new C64332dw2();
                        if (bArr != null && bArr.length > 0) {
                            dw22.parseFrom(bArr);
                        }
                        cw22.f182591v.add(dw22);
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50435mq0 mq04 = new C50435mq0();
                        if (bArr2 != null && bArr2.length > 0) {
                            mq04.parseFrom(bArr2);
                        }
                        cw22.f182592w = mq04;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64876zb1 zb14 = new C64876zb1();
                        if (bArr3 != null && bArr3.length > 0) {
                            zb14.parseFrom(bArr3);
                        }
                        cw22.f182593x = zb14;
                    }
                    return 0;
                case 19:
                    cw22.f182594y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64450iq0 iq04 = new C64450iq0();
                        if (bArr4 != null && bArr4.length > 0) {
                            iq04.parseFrom(bArr4);
                        }
                        cw22.f182595z = iq04;
                    }
                    return 0;
                case 21:
                    cw22.f182571A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    cw22.f182572B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    cw22.f182573C = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64475jq0 jq04 = new C64475jq0();
                        if (bArr5 != null && bArr5.length > 0) {
                            jq04.parseFrom(bArr5);
                        }
                        cw22.f182574D = jq04;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C48773aw3 aw34 = new C48773aw3();
                        if (bArr6 != null && bArr6.length > 0) {
                            aw34.parseFrom(bArr6);
                        }
                        cw22.f182575E = aw34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
