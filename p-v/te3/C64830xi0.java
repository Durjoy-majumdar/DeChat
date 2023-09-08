package te3;

import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xi0 */
public class C64830xi0 extends C101820nt3 {

    /* renamed from: A */
    public int f186302A;

    /* renamed from: B */
    public int f186303B;

    /* renamed from: C */
    public String f186304C;

    /* renamed from: D */
    public int f186305D;

    /* renamed from: d */
    public C49842ig0 f186306d;

    /* renamed from: e */
    public String f186307e;

    /* renamed from: f */
    public FinderMedia f186308f;

    /* renamed from: g */
    public String f186309g;

    /* renamed from: h */
    public C64311db1 f186310h;

    /* renamed from: i */
    public String f186311i;

    /* renamed from: j */
    public String f186312j;

    /* renamed from: n */
    public int f186313n;

    /* renamed from: o */
    public int f186314o;

    /* renamed from: p */
    public LinkedList<String> f186315p = new LinkedList<>();

    /* renamed from: q */
    public int f186316q;

    /* renamed from: r */
    public int f186317r;

    /* renamed from: s */
    public LinkedList<String> f186318s = new LinkedList<>();

    /* renamed from: t */
    public LinkedList<String> f186319t = new LinkedList<>();

    /* renamed from: u */
    public C50868ps1 f186320u;

    /* renamed from: v */
    public C50114kd1 f186321v;

    /* renamed from: w */
    public LinkedList<String> f186322w = new LinkedList<>();

    /* renamed from: x */
    public int f186323x;

    /* renamed from: y */
    public C89349b f186324y;

    /* renamed from: z */
    public int f186325z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64830xi0)) {
            return false;
        }
        C64830xi0 xi02 = (C64830xi0) aVar;
        return C46238a.m51546a(this.BaseRequest, xi02.BaseRequest) && C46238a.m51546a(this.f186306d, xi02.f186306d) && C46238a.m51546a(this.f186307e, xi02.f186307e) && C46238a.m51546a(this.f186308f, xi02.f186308f) && C46238a.m51546a(this.f186309g, xi02.f186309g) && C46238a.m51546a(this.f186310h, xi02.f186310h) && C46238a.m51546a(this.f186311i, xi02.f186311i) && C46238a.m51546a(this.f186312j, xi02.f186312j) && C46238a.m51546a(Integer.valueOf(this.f186313n), Integer.valueOf(xi02.f186313n)) && C46238a.m51546a(Integer.valueOf(this.f186314o), Integer.valueOf(xi02.f186314o)) && C46238a.m51546a(this.f186315p, xi02.f186315p) && C46238a.m51546a(Integer.valueOf(this.f186316q), Integer.valueOf(xi02.f186316q)) && C46238a.m51546a(Integer.valueOf(this.f186317r), Integer.valueOf(xi02.f186317r)) && C46238a.m51546a(this.f186318s, xi02.f186318s) && C46238a.m51546a(this.f186319t, xi02.f186319t) && C46238a.m51546a(this.f186320u, xi02.f186320u) && C46238a.m51546a(this.f186321v, xi02.f186321v) && C46238a.m51546a(this.f186322w, xi02.f186322w) && C46238a.m51546a(Integer.valueOf(this.f186323x), Integer.valueOf(xi02.f186323x)) && C46238a.m51546a(this.f186324y, xi02.f186324y) && C46238a.m51546a(Integer.valueOf(this.f186325z), Integer.valueOf(xi02.f186325z)) && C46238a.m51546a(Integer.valueOf(this.f186302A), Integer.valueOf(xi02.f186302A)) && C46238a.m51546a(Integer.valueOf(this.f186303B), Integer.valueOf(xi02.f186303B)) && C46238a.m51546a(this.f186304C, xi02.f186304C) && C46238a.m51546a(Integer.valueOf(this.f186305D), Integer.valueOf(xi02.f186305D));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f186306d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186306d.writeFields(aVar);
            }
            String str = this.f186307e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            FinderMedia finderMedia = this.f186308f;
            if (finderMedia != null) {
                aVar.mo74322i(4, finderMedia.computeSize());
                this.f186308f.writeFields(aVar);
            }
            String str2 = this.f186309g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C64311db1 db12 = this.f186310h;
            if (db12 != null) {
                aVar.mo74322i(6, db12.computeSize());
                this.f186310h.writeFields(aVar);
            }
            String str3 = this.f186311i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f186312j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f186313n);
            aVar.mo74318e(10, this.f186314o);
            aVar.mo74320g(11, 1, this.f186315p);
            aVar.mo74318e(12, this.f186316q);
            aVar.mo74318e(13, this.f186317r);
            aVar.mo74320g(14, 1, this.f186318s);
            aVar.mo74320g(15, 1, this.f186319t);
            C50868ps1 ps12 = this.f186320u;
            if (ps12 != null) {
                aVar.mo74322i(16, ps12.computeSize());
                this.f186320u.writeFields(aVar);
            }
            C50114kd1 kd12 = this.f186321v;
            if (kd12 != null) {
                aVar.mo74322i(17, kd12.computeSize());
                this.f186321v.writeFields(aVar);
            }
            aVar.mo74320g(18, 1, this.f186322w);
            aVar.mo74318e(19, this.f186323x);
            C89349b bVar = this.f186324y;
            if (bVar != null) {
                aVar.mo74315b(20, bVar);
            }
            aVar.mo74318e(21, this.f186325z);
            aVar.mo74318e(22, this.f186302A);
            aVar.mo74318e(23, this.f186303B);
            String str5 = this.f186304C;
            if (str5 != null) {
                aVar.mo74323j(24, str5);
            }
            aVar.mo74318e(26, this.f186305D);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f186306d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str6 = this.f186307e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            FinderMedia finderMedia2 = this.f186308f;
            if (finderMedia2 != null) {
                i3 += C52418a.m58682i(4, finderMedia2.computeSize());
            }
            String str7 = this.f186309g;
            if (str7 != null) {
                i3 += C52418a.m58683j(5, str7);
            }
            C64311db1 db13 = this.f186310h;
            if (db13 != null) {
                i3 += C52418a.m58682i(6, db13.computeSize());
            }
            String str8 = this.f186311i;
            if (str8 != null) {
                i3 += C52418a.m58683j(7, str8);
            }
            String str9 = this.f186312j;
            if (str9 != null) {
                i3 += C52418a.m58683j(8, str9);
            }
            int e = i3 + C52418a.m58678e(9, this.f186313n) + C52418a.m58678e(10, this.f186314o) + C52418a.m58680g(11, 1, this.f186315p) + C52418a.m58678e(12, this.f186316q) + C52418a.m58678e(13, this.f186317r) + C52418a.m58680g(14, 1, this.f186318s) + C52418a.m58680g(15, 1, this.f186319t);
            C50868ps1 ps13 = this.f186320u;
            if (ps13 != null) {
                e += C52418a.m58682i(16, ps13.computeSize());
            }
            C50114kd1 kd13 = this.f186321v;
            if (kd13 != null) {
                e += C52418a.m58682i(17, kd13.computeSize());
            }
            int g = e + C52418a.m58680g(18, 1, this.f186322w) + C52418a.m58678e(19, this.f186323x);
            C89349b bVar2 = this.f186324y;
            if (bVar2 != null) {
                g += C52418a.m58675b(20, bVar2);
            }
            int e2 = g + C52418a.m58678e(21, this.f186325z) + C52418a.m58678e(22, this.f186302A) + C52418a.m58678e(23, this.f186303B);
            String str10 = this.f186304C;
            if (str10 != null) {
                e2 += C52418a.m58683j(24, str10);
            }
            return e2 + C52418a.m58678e(26, this.f186305D);
        } else if (i2 == 2) {
            this.f186315p.clear();
            this.f186318s.clear();
            this.f186319t.clear();
            this.f186322w.clear();
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
            C64830xi0 xi02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        xi02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        xi02.f186306d = ig04;
                    }
                    return 0;
                case 3:
                    xi02.f186307e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        FinderMedia finderMedia3 = new FinderMedia();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderMedia3.parseFrom(bArr3);
                        }
                        xi02.f186308f = finderMedia3;
                    }
                    return 0;
                case 5:
                    xi02.f186309g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64311db1 db14 = new C64311db1();
                        if (bArr4 != null && bArr4.length > 0) {
                            db14.parseFrom(bArr4);
                        }
                        xi02.f186310h = db14;
                    }
                    return 0;
                case 7:
                    xi02.f186311i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xi02.f186312j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xi02.f186313n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    xi02.f186314o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    xi02.f186315p.add(aVar3.mo141633k(intValue));
                    return 0;
                case 12:
                    xi02.f186316q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    xi02.f186317r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    xi02.f186318s.add(aVar3.mo141633k(intValue));
                    return 0;
                case 15:
                    xi02.f186319t.add(aVar3.mo141633k(intValue));
                    return 0;
                case 16:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50868ps1 ps14 = new C50868ps1();
                        if (bArr5 != null && bArr5.length > 0) {
                            ps14.parseFrom(bArr5);
                        }
                        xi02.f186320u = ps14;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50114kd1 kd14 = new C50114kd1();
                        if (bArr6 != null && bArr6.length > 0) {
                            kd14.parseFrom(bArr6);
                        }
                        xi02.f186321v = kd14;
                    }
                    return 0;
                case 18:
                    xi02.f186322w.add(aVar3.mo141633k(intValue));
                    return 0;
                case 19:
                    xi02.f186323x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    xi02.f186324y = aVar3.mo141626d(intValue);
                    return 0;
                case 21:
                    xi02.f186325z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    xi02.f186302A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    xi02.f186303B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    xi02.f186304C = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    xi02.f186305D = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
