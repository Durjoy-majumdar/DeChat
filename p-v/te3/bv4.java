package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class bv4 extends C101820nt3 {

    /* renamed from: d */
    public String f331895d;

    /* renamed from: e */
    public int f331896e;

    /* renamed from: f */
    public LinkedList<C51163rv3> f331897f = new LinkedList<>();

    /* renamed from: g */
    public pv4 f331898g;

    /* renamed from: h */
    public pv4 f331899h;

    /* renamed from: i */
    public int f331900i;

    /* renamed from: j */
    public int f331901j;

    /* renamed from: n */
    public int f331902n;

    /* renamed from: o */
    public long f331903o;

    /* renamed from: p */
    public int f331904p;

    /* renamed from: q */
    public long f331905q;

    /* renamed from: r */
    public int f331906r;

    /* renamed from: s */
    public int f331907s;

    /* renamed from: t */
    public int f331908t;

    /* renamed from: u */
    public int f331909u;

    /* renamed from: v */
    public LinkedList<C101864x23> f331910v = new LinkedList<>();

    /* renamed from: w */
    public int f331911w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bv4)) {
            return false;
        }
        bv4 bv4 = (bv4) aVar;
        return C46238a.m51546a(this.BaseRequest, bv4.BaseRequest) && C46238a.m51546a(this.f331895d, bv4.f331895d) && C46238a.m51546a(Integer.valueOf(this.f331896e), Integer.valueOf(bv4.f331896e)) && C46238a.m51546a(this.f331897f, bv4.f331897f) && C46238a.m51546a(this.f331898g, bv4.f331898g) && C46238a.m51546a(this.f331899h, bv4.f331899h) && C46238a.m51546a(Integer.valueOf(this.f331900i), Integer.valueOf(bv4.f331900i)) && C46238a.m51546a(Integer.valueOf(this.f331901j), Integer.valueOf(bv4.f331901j)) && C46238a.m51546a(Integer.valueOf(this.f331902n), Integer.valueOf(bv4.f331902n)) && C46238a.m51546a(Long.valueOf(this.f331903o), Long.valueOf(bv4.f331903o)) && C46238a.m51546a(Integer.valueOf(this.f331904p), Integer.valueOf(bv4.f331904p)) && C46238a.m51546a(Long.valueOf(this.f331905q), Long.valueOf(bv4.f331905q)) && C46238a.m51546a(Integer.valueOf(this.f331906r), Integer.valueOf(bv4.f331906r)) && C46238a.m51546a(Integer.valueOf(this.f331907s), Integer.valueOf(bv4.f331907s)) && C46238a.m51546a(Integer.valueOf(this.f331908t), Integer.valueOf(bv4.f331908t)) && C46238a.m51546a(Integer.valueOf(this.f331909u), Integer.valueOf(bv4.f331909u)) && C46238a.m51546a(this.f331910v, bv4.f331910v) && C46238a.m51546a(Integer.valueOf(this.f331911w), Integer.valueOf(bv4.f331911w));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f331898g == null) {
                throw new C52419b("Not all required fields were included: PeerId");
            } else if (this.f331899h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f331895d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f331896e);
                aVar.mo74320g(4, 8, this.f331897f);
                pv4 pv4 = this.f331898g;
                if (pv4 != null) {
                    aVar.mo74322i(6, pv4.computeSize());
                    this.f331898g.writeFields(aVar);
                }
                pv4 pv42 = this.f331899h;
                if (pv42 != null) {
                    aVar.mo74322i(7, pv42.computeSize());
                    this.f331899h.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f331900i);
                aVar.mo74318e(9, this.f331901j);
                aVar.mo74318e(10, this.f331902n);
                aVar.mo74321h(11, this.f331903o);
                aVar.mo74318e(12, this.f331904p);
                aVar.mo74321h(13, this.f331905q);
                aVar.mo74318e(14, this.f331906r);
                aVar.mo74318e(15, this.f331907s);
                aVar.mo74318e(16, this.f331908t);
                aVar.mo74318e(17, this.f331909u);
                aVar.mo74320g(18, 8, this.f331910v);
                aVar.mo74318e(19, this.f331911w);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CapInfo");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str2 = this.f331895d;
            if (str2 != null) {
                i3 += C52418a.m58683j(2, str2);
            }
            int e = i3 + C52418a.m58678e(3, this.f331896e) + C52418a.m58680g(4, 8, this.f331897f);
            pv4 pv43 = this.f331898g;
            if (pv43 != null) {
                e += C52418a.m58682i(6, pv43.computeSize());
            }
            pv4 pv44 = this.f331899h;
            if (pv44 != null) {
                e += C52418a.m58682i(7, pv44.computeSize());
            }
            return e + C52418a.m58678e(8, this.f331900i) + C52418a.m58678e(9, this.f331901j) + C52418a.m58678e(10, this.f331902n) + C52418a.m58681h(11, this.f331903o) + C52418a.m58678e(12, this.f331904p) + C52418a.m58681h(13, this.f331905q) + C52418a.m58678e(14, this.f331906r) + C52418a.m58678e(15, this.f331907s) + C52418a.m58678e(16, this.f331908t) + C52418a.m58678e(17, this.f331909u) + C52418a.m58680g(18, 8, this.f331910v) + C52418a.m58678e(19, this.f331911w);
        } else if (i2 == 2) {
            this.f331897f.clear();
            this.f331910v.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f331898g == null) {
                throw new C52419b("Not all required fields were included: PeerId");
            } else if (this.f331899h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CapInfo");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            bv4 bv4 = objArr[1];
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
                        bv4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bv4.f331895d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bv4.f331896e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        bv4.f331897f.add(rv32);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        pv4 pv45 = new pv4();
                        if (bArr3 != null && bArr3.length > 0) {
                            pv45.parseFrom(bArr3);
                        }
                        bv4.f331898g = pv45;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        pv4 pv46 = new pv4();
                        if (bArr4 != null && bArr4.length > 0) {
                            pv46.parseFrom(bArr4);
                        }
                        bv4.f331899h = pv46;
                    }
                    return 0;
                case 8:
                    bv4.f331900i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    bv4.f331901j = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    bv4.f331902n = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    bv4.f331903o = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    bv4.f331904p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    bv4.f331905q = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    bv4.f331906r = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    bv4.f331907s = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    bv4.f331908t = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    bv4.f331909u = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C101864x23 x232 = new C101864x23();
                        if (bArr5 != null && bArr5.length > 0) {
                            x232.parseFrom(bArr5);
                        }
                        bv4.f331910v.add(x232);
                    }
                    return 0;
                case 19:
                    bv4.f331911w = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
