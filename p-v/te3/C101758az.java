package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.az */
public class C101758az extends C47465a {

    /* renamed from: A */
    public C64573n93 f297894A;

    /* renamed from: B */
    public boolean f297895B;

    /* renamed from: d */
    public String f297896d;

    /* renamed from: e */
    public int f297897e;

    /* renamed from: f */
    public int f297898f;

    /* renamed from: g */
    public C64346ep3 f297899g;

    /* renamed from: h */
    public float f297900h;

    /* renamed from: i */
    public int f297901i;

    /* renamed from: j */
    public int f297902j;

    /* renamed from: n */
    public int f297903n;

    /* renamed from: o */
    public int f297904o;

    /* renamed from: p */
    public int f297905p;

    /* renamed from: q */
    public int f297906q;

    /* renamed from: r */
    public int f297907r;

    /* renamed from: s */
    public int f297908s;

    /* renamed from: t */
    public LinkedList<Integer> f297909t = new LinkedList<>();

    /* renamed from: u */
    public int f297910u;

    /* renamed from: v */
    public boolean f297911v;

    /* renamed from: w */
    public int f297912w;

    /* renamed from: x */
    public boolean f297913x;

    /* renamed from: y */
    public C64346ep3 f297914y;

    /* renamed from: z */
    public C64573n93 f297915z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101758az)) {
            return false;
        }
        C101758az azVar = (C101758az) aVar;
        return C46238a.m51546a(this.f297896d, azVar.f297896d) && C46238a.m51546a(Integer.valueOf(this.f297897e), Integer.valueOf(azVar.f297897e)) && C46238a.m51546a(Integer.valueOf(this.f297898f), Integer.valueOf(azVar.f297898f)) && C46238a.m51546a(this.f297899g, azVar.f297899g) && C46238a.m51546a(Float.valueOf(this.f297900h), Float.valueOf(azVar.f297900h)) && C46238a.m51546a(Integer.valueOf(this.f297901i), Integer.valueOf(azVar.f297901i)) && C46238a.m51546a(Integer.valueOf(this.f297902j), Integer.valueOf(azVar.f297902j)) && C46238a.m51546a(Integer.valueOf(this.f297903n), Integer.valueOf(azVar.f297903n)) && C46238a.m51546a(Integer.valueOf(this.f297904o), Integer.valueOf(azVar.f297904o)) && C46238a.m51546a(Integer.valueOf(this.f297905p), Integer.valueOf(azVar.f297905p)) && C46238a.m51546a(Integer.valueOf(this.f297906q), Integer.valueOf(azVar.f297906q)) && C46238a.m51546a(Integer.valueOf(this.f297907r), Integer.valueOf(azVar.f297907r)) && C46238a.m51546a(Integer.valueOf(this.f297908s), Integer.valueOf(azVar.f297908s)) && C46238a.m51546a(this.f297909t, azVar.f297909t) && C46238a.m51546a(Integer.valueOf(this.f297910u), Integer.valueOf(azVar.f297910u)) && C46238a.m51546a(Boolean.valueOf(this.f297911v), Boolean.valueOf(azVar.f297911v)) && C46238a.m51546a(Integer.valueOf(this.f297912w), Integer.valueOf(azVar.f297912w)) && C46238a.m51546a(Boolean.valueOf(this.f297913x), Boolean.valueOf(azVar.f297913x)) && C46238a.m51546a(this.f297914y, azVar.f297914y) && C46238a.m51546a(this.f297915z, azVar.f297915z) && C46238a.m51546a(this.f297894A, azVar.f297894A) && C46238a.m51546a(Boolean.valueOf(this.f297895B), Boolean.valueOf(azVar.f297895B));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f297896d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(4, this.f297897e);
            aVar.mo74318e(5, this.f297898f);
            C64346ep3 ep32 = this.f297899g;
            if (ep32 != null) {
                aVar.mo74322i(6, ep32.computeSize());
                this.f297899g.writeFields(aVar);
            }
            aVar.mo74317d(7, this.f297900h);
            aVar.mo74318e(8, this.f297901i);
            aVar.mo74318e(9, this.f297902j);
            aVar.mo74318e(10, this.f297903n);
            aVar.mo74318e(11, this.f297904o);
            aVar.mo74318e(12, this.f297905p);
            aVar.mo74318e(13, this.f297906q);
            aVar.mo74318e(14, this.f297907r);
            aVar.mo74318e(15, this.f297908s);
            aVar.mo74320g(16, 2, this.f297909t);
            aVar.mo74318e(17, this.f297910u);
            aVar.mo74314a(18, this.f297911v);
            aVar.mo74318e(19, this.f297912w);
            aVar.mo74314a(20, this.f297913x);
            C64346ep3 ep33 = this.f297914y;
            if (ep33 != null) {
                aVar.mo74322i(21, ep33.computeSize());
                this.f297914y.writeFields(aVar);
            }
            C64573n93 n932 = this.f297915z;
            if (n932 != null) {
                aVar.mo74322i(22, n932.computeSize());
                this.f297915z.writeFields(aVar);
            }
            C64573n93 n933 = this.f297894A;
            if (n933 != null) {
                aVar.mo74322i(23, n933.computeSize());
                this.f297894A.writeFields(aVar);
            }
            aVar.mo74314a(24, this.f297895B);
            return 0;
        } else if (i2 == 1) {
            String str2 = this.f297896d;
            if (str2 != null) {
                i3 = C52418a.m58683j(1, str2) + 0;
            }
            int e = i3 + C52418a.m58678e(4, this.f297897e) + C52418a.m58678e(5, this.f297898f);
            C64346ep3 ep34 = this.f297899g;
            if (ep34 != null) {
                e += C52418a.m58682i(6, ep34.computeSize());
            }
            int d = e + C52418a.m58677d(7, this.f297900h) + C52418a.m58678e(8, this.f297901i) + C52418a.m58678e(9, this.f297902j) + C52418a.m58678e(10, this.f297903n) + C52418a.m58678e(11, this.f297904o) + C52418a.m58678e(12, this.f297905p) + C52418a.m58678e(13, this.f297906q) + C52418a.m58678e(14, this.f297907r) + C52418a.m58678e(15, this.f297908s) + C52418a.m58680g(16, 2, this.f297909t) + C52418a.m58678e(17, this.f297910u) + C52418a.m58674a(18, this.f297911v) + C52418a.m58678e(19, this.f297912w) + C52418a.m58674a(20, this.f297913x);
            C64346ep3 ep35 = this.f297914y;
            if (ep35 != null) {
                d += C52418a.m58682i(21, ep35.computeSize());
            }
            C64573n93 n934 = this.f297915z;
            if (n934 != null) {
                d += C52418a.m58682i(22, n934.computeSize());
            }
            C64573n93 n935 = this.f297894A;
            if (n935 != null) {
                d += C52418a.m58682i(23, n935.computeSize());
            }
            return d + C52418a.m58674a(24, this.f297895B);
        } else if (i2 == 2) {
            this.f297909t.clear();
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
            C101758az azVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                switch (intValue) {
                    case 4:
                        azVar.f297897e = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        azVar.f297898f = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C64346ep3 ep36 = new C64346ep3();
                            if (bArr != null && bArr.length > 0) {
                                ep36.parseFrom(bArr);
                            }
                            azVar.f297899g = ep36;
                        }
                        return 0;
                    case 7:
                        azVar.f297900h = aVar3.mo141628f(intValue);
                        return 0;
                    case 8:
                        azVar.f297901i = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        azVar.f297902j = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        azVar.f297903n = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        azVar.f297904o = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        azVar.f297905p = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        azVar.f297906q = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        azVar.f297907r = aVar3.mo141629g(intValue);
                        return 0;
                    case 15:
                        azVar.f297908s = aVar3.mo141629g(intValue);
                        return 0;
                    case 16:
                        azVar.f297909t.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 17:
                        azVar.f297910u = aVar3.mo141629g(intValue);
                        return 0;
                    case 18:
                        azVar.f297911v = aVar3.mo141625c(intValue);
                        return 0;
                    case 19:
                        azVar.f297912w = aVar3.mo141629g(intValue);
                        return 0;
                    case 20:
                        azVar.f297913x = aVar3.mo141625c(intValue);
                        return 0;
                    case 21:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C64346ep3 ep37 = new C64346ep3();
                            if (bArr2 != null && bArr2.length > 0) {
                                ep37.parseFrom(bArr2);
                            }
                            azVar.f297914y = ep37;
                        }
                        return 0;
                    case 22:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C64573n93 n936 = new C64573n93();
                            if (bArr3 != null && bArr3.length > 0) {
                                n936.parseFrom(bArr3);
                            }
                            azVar.f297915z = n936;
                        }
                        return 0;
                    case 23:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C64573n93 n937 = new C64573n93();
                            if (bArr4 != null && bArr4.length > 0) {
                                n937.parseFrom(bArr4);
                            }
                            azVar.f297894A = n937;
                        }
                        return 0;
                    case 24:
                        azVar.f297895B = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                azVar.f297896d = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
