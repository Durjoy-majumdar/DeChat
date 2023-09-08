package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.po1 */
public class C50856po1 extends C101820nt3 {

    /* renamed from: d */
    public String f139867d;

    /* renamed from: e */
    public long f139868e;

    /* renamed from: f */
    public String f139869f;

    /* renamed from: g */
    public String f139870g;

    /* renamed from: h */
    public int f139871h;

    /* renamed from: i */
    public C49842ig0 f139872i;

    /* renamed from: j */
    public C89349b f139873j;

    /* renamed from: n */
    public int f139874n;

    /* renamed from: o */
    public C49704hh0 f139875o;

    /* renamed from: p */
    public long f139876p;

    /* renamed from: q */
    public int f139877q;

    /* renamed from: r */
    public long f139878r;

    /* renamed from: s */
    public String f139879s;

    /* renamed from: t */
    public float f139880t;

    /* renamed from: u */
    public float f139881u;

    /* renamed from: v */
    public int f139882v;

    /* renamed from: w */
    public long f139883w;

    /* renamed from: x */
    public String f139884x;

    /* renamed from: y */
    public String f139885y;

    /* renamed from: z */
    public long f139886z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50856po1)) {
            return false;
        }
        C50856po1 po12 = (C50856po1) aVar;
        return C46238a.m51546a(this.BaseRequest, po12.BaseRequest) && C46238a.m51546a(this.f139867d, po12.f139867d) && C46238a.m51546a(Long.valueOf(this.f139868e), Long.valueOf(po12.f139868e)) && C46238a.m51546a(this.f139869f, po12.f139869f) && C46238a.m51546a(this.f139870g, po12.f139870g) && C46238a.m51546a(Integer.valueOf(this.f139871h), Integer.valueOf(po12.f139871h)) && C46238a.m51546a(this.f139872i, po12.f139872i) && C46238a.m51546a(this.f139873j, po12.f139873j) && C46238a.m51546a(Integer.valueOf(this.f139874n), Integer.valueOf(po12.f139874n)) && C46238a.m51546a(this.f139875o, po12.f139875o) && C46238a.m51546a(Long.valueOf(this.f139876p), Long.valueOf(po12.f139876p)) && C46238a.m51546a(Integer.valueOf(this.f139877q), Integer.valueOf(po12.f139877q)) && C46238a.m51546a(Long.valueOf(this.f139878r), Long.valueOf(po12.f139878r)) && C46238a.m51546a(this.f139879s, po12.f139879s) && C46238a.m51546a(Float.valueOf(this.f139880t), Float.valueOf(po12.f139880t)) && C46238a.m51546a(Float.valueOf(this.f139881u), Float.valueOf(po12.f139881u)) && C46238a.m51546a(Integer.valueOf(this.f139882v), Integer.valueOf(po12.f139882v)) && C46238a.m51546a(Long.valueOf(this.f139883w), Long.valueOf(po12.f139883w)) && C46238a.m51546a(this.f139884x, po12.f139884x) && C46238a.m51546a(this.f139885y, po12.f139885y) && C46238a.m51546a(Long.valueOf(this.f139886z), Long.valueOf(po12.f139886z));
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
            String str = this.f139867d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f139868e);
            String str2 = this.f139869f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f139870g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f139871h);
            C49842ig0 ig02 = this.f139872i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f139872i.writeFields(aVar);
            }
            C89349b bVar = this.f139873j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            aVar.mo74318e(9, this.f139874n);
            C49704hh0 hh02 = this.f139875o;
            if (hh02 != null) {
                aVar.mo74322i(10, hh02.computeSize());
                this.f139875o.writeFields(aVar);
            }
            aVar.mo74321h(11, this.f139876p);
            aVar.mo74318e(12, this.f139877q);
            aVar.mo74321h(13, this.f139878r);
            String str4 = this.f139879s;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            aVar.mo74317d(15, this.f139880t);
            aVar.mo74317d(16, this.f139881u);
            aVar.mo74318e(17, this.f139882v);
            aVar.mo74321h(18, this.f139883w);
            String str5 = this.f139884x;
            if (str5 != null) {
                aVar.mo74323j(19, str5);
            }
            String str6 = this.f139885y;
            if (str6 != null) {
                aVar.mo74323j(20, str6);
            }
            aVar.mo74321h(21, this.f139886z);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str7 = this.f139867d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            int h = i3 + C52418a.m58681h(3, this.f139868e);
            String str8 = this.f139869f;
            if (str8 != null) {
                h += C52418a.m58683j(4, str8);
            }
            String str9 = this.f139870g;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            int e = h + C52418a.m58678e(6, this.f139871h);
            C49842ig0 ig03 = this.f139872i;
            if (ig03 != null) {
                e += C52418a.m58682i(7, ig03.computeSize());
            }
            C89349b bVar2 = this.f139873j;
            if (bVar2 != null) {
                e += C52418a.m58675b(8, bVar2);
            }
            int e2 = e + C52418a.m58678e(9, this.f139874n);
            C49704hh0 hh03 = this.f139875o;
            if (hh03 != null) {
                e2 += C52418a.m58682i(10, hh03.computeSize());
            }
            int h2 = e2 + C52418a.m58681h(11, this.f139876p) + C52418a.m58678e(12, this.f139877q) + C52418a.m58681h(13, this.f139878r);
            String str10 = this.f139879s;
            if (str10 != null) {
                h2 += C52418a.m58683j(14, str10);
            }
            int d = h2 + C52418a.m58677d(15, this.f139880t) + C52418a.m58677d(16, this.f139881u) + C52418a.m58678e(17, this.f139882v) + C52418a.m58681h(18, this.f139883w);
            String str11 = this.f139884x;
            if (str11 != null) {
                d += C52418a.m58683j(19, str11);
            }
            String str12 = this.f139885y;
            if (str12 != null) {
                d += C52418a.m58683j(20, str12);
            }
            return d + C52418a.m58681h(21, this.f139886z);
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
            C50856po1 po12 = objArr[1];
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
                        po12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    po12.f139867d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    po12.f139868e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    po12.f139869f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    po12.f139870g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    po12.f139871h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        po12.f139872i = ig04;
                    }
                    return 0;
                case 8:
                    po12.f139873j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    po12.f139874n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        po12.f139875o = hh04;
                    }
                    return 0;
                case 11:
                    po12.f139876p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    po12.f139877q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    po12.f139878r = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    po12.f139879s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    po12.f139880t = aVar3.mo141628f(intValue);
                    return 0;
                case 16:
                    po12.f139881u = aVar3.mo141628f(intValue);
                    return 0;
                case 17:
                    po12.f139882v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    po12.f139883w = aVar3.mo141631i(intValue);
                    return 0;
                case 19:
                    po12.f139884x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    po12.f139885y = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    po12.f139886z = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
