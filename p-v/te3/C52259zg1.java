package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zg1 */
public class C52259zg1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145890d;

    /* renamed from: e */
    public C89349b f145891e;

    /* renamed from: f */
    public float f145892f;

    /* renamed from: g */
    public float f145893g;

    /* renamed from: h */
    public C49704hh0 f145894h;

    /* renamed from: i */
    public String f145895i;

    /* renamed from: j */
    public long f145896j;

    /* renamed from: n */
    public int f145897n;

    /* renamed from: o */
    public int f145898o;

    /* renamed from: p */
    public int f145899p;

    /* renamed from: q */
    public String f145900q;

    /* renamed from: r */
    public String f145901r;

    /* renamed from: s */
    public String f145902s;

    /* renamed from: t */
    public String f145903t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52259zg1)) {
            return false;
        }
        C52259zg1 zg12 = (C52259zg1) aVar;
        return C46238a.m51546a(this.BaseRequest, zg12.BaseRequest) && C46238a.m51546a(this.f145890d, zg12.f145890d) && C46238a.m51546a(this.f145891e, zg12.f145891e) && C46238a.m51546a(Float.valueOf(this.f145892f), Float.valueOf(zg12.f145892f)) && C46238a.m51546a(Float.valueOf(this.f145893g), Float.valueOf(zg12.f145893g)) && C46238a.m51546a(this.f145894h, zg12.f145894h) && C46238a.m51546a(this.f145895i, zg12.f145895i) && C46238a.m51546a(Long.valueOf(this.f145896j), Long.valueOf(zg12.f145896j)) && C46238a.m51546a(Integer.valueOf(this.f145897n), Integer.valueOf(zg12.f145897n)) && C46238a.m51546a(Integer.valueOf(this.f145898o), Integer.valueOf(zg12.f145898o)) && C46238a.m51546a(Integer.valueOf(this.f145899p), Integer.valueOf(zg12.f145899p)) && C46238a.m51546a(this.f145900q, zg12.f145900q) && C46238a.m51546a(this.f145901r, zg12.f145901r) && C46238a.m51546a(this.f145902s, zg12.f145902s) && C46238a.m51546a(this.f145903t, zg12.f145903t);
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
            C49842ig0 ig02 = this.f145890d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145890d.writeFields(aVar);
            }
            C89349b bVar = this.f145891e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74317d(4, this.f145892f);
            aVar.mo74317d(5, this.f145893g);
            C49704hh0 hh02 = this.f145894h;
            if (hh02 != null) {
                aVar.mo74322i(6, hh02.computeSize());
                this.f145894h.writeFields(aVar);
            }
            String str = this.f145895i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74321h(8, this.f145896j);
            aVar.mo74318e(9, this.f145897n);
            aVar.mo74318e(10, this.f145898o);
            aVar.mo74318e(11, this.f145899p);
            String str2 = this.f145900q;
            if (str2 != null) {
                aVar.mo74323j(12, str2);
            }
            String str3 = this.f145901r;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            String str4 = this.f145902s;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            String str5 = this.f145903t;
            if (str5 != null) {
                aVar.mo74323j(15, str5);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f145890d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f145891e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int d = i3 + C52418a.m58677d(4, this.f145892f) + C52418a.m58677d(5, this.f145893g);
            C49704hh0 hh03 = this.f145894h;
            if (hh03 != null) {
                d += C52418a.m58682i(6, hh03.computeSize());
            }
            String str6 = this.f145895i;
            if (str6 != null) {
                d += C52418a.m58683j(7, str6);
            }
            int h = d + C52418a.m58681h(8, this.f145896j) + C52418a.m58678e(9, this.f145897n) + C52418a.m58678e(10, this.f145898o) + C52418a.m58678e(11, this.f145899p);
            String str7 = this.f145900q;
            if (str7 != null) {
                h += C52418a.m58683j(12, str7);
            }
            String str8 = this.f145901r;
            if (str8 != null) {
                h += C52418a.m58683j(13, str8);
            }
            String str9 = this.f145902s;
            if (str9 != null) {
                h += C52418a.m58683j(14, str9);
            }
            String str10 = this.f145903t;
            return str10 != null ? h + C52418a.m58683j(15, str10) : h;
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
            C52259zg1 zg12 = objArr[1];
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
                        zg12.BaseRequest = iaVar3;
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
                        zg12.f145890d = ig04;
                    }
                    return 0;
                case 3:
                    zg12.f145891e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    zg12.f145892f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    zg12.f145893g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        zg12.f145894h = hh04;
                    }
                    return 0;
                case 7:
                    zg12.f145895i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zg12.f145896j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    zg12.f145897n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    zg12.f145898o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    zg12.f145899p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    zg12.f145900q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    zg12.f145901r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    zg12.f145902s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    zg12.f145903t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
