package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.im0 */
public class C49867im0 extends C101820nt3 {

    /* renamed from: A */
    public C49946j51 f135474A;

    /* renamed from: B */
    public C89349b f135475B;

    /* renamed from: C */
    public String f135476C;

    /* renamed from: D */
    public int f135477D;

    /* renamed from: d */
    public long f135478d;

    /* renamed from: e */
    public long f135479e;

    /* renamed from: f */
    public int f135480f;

    /* renamed from: g */
    public C89349b f135481g;

    /* renamed from: h */
    public long f135482h;

    /* renamed from: i */
    public String f135483i;

    /* renamed from: j */
    public long f135484j;

    /* renamed from: n */
    public int f135485n;

    /* renamed from: o */
    public int f135486o;

    /* renamed from: p */
    public String f135487p;

    /* renamed from: q */
    public String f135488q;

    /* renamed from: r */
    public C49842ig0 f135489r;

    /* renamed from: s */
    public int f135490s;

    /* renamed from: t */
    public int f135491t;

    /* renamed from: u */
    public C89349b f135492u;

    /* renamed from: v */
    public int f135493v;

    /* renamed from: w */
    public int f135494w;

    /* renamed from: x */
    public float f135495x;

    /* renamed from: y */
    public float f135496y;

    /* renamed from: z */
    public C49704hh0 f135497z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49867im0)) {
            return false;
        }
        C49867im0 im02 = (C49867im0) aVar;
        return C46238a.m51546a(this.BaseRequest, im02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f135478d), Long.valueOf(im02.f135478d)) && C46238a.m51546a(Long.valueOf(this.f135479e), Long.valueOf(im02.f135479e)) && C46238a.m51546a(Integer.valueOf(this.f135480f), Integer.valueOf(im02.f135480f)) && C46238a.m51546a(this.f135481g, im02.f135481g) && C46238a.m51546a(Long.valueOf(this.f135482h), Long.valueOf(im02.f135482h)) && C46238a.m51546a(this.f135483i, im02.f135483i) && C46238a.m51546a(Long.valueOf(this.f135484j), Long.valueOf(im02.f135484j)) && C46238a.m51546a(Integer.valueOf(this.f135485n), Integer.valueOf(im02.f135485n)) && C46238a.m51546a(Integer.valueOf(this.f135486o), Integer.valueOf(im02.f135486o)) && C46238a.m51546a(this.f135487p, im02.f135487p) && C46238a.m51546a(this.f135488q, im02.f135488q) && C46238a.m51546a(this.f135489r, im02.f135489r) && C46238a.m51546a(Integer.valueOf(this.f135490s), Integer.valueOf(im02.f135490s)) && C46238a.m51546a(Integer.valueOf(this.f135491t), Integer.valueOf(im02.f135491t)) && C46238a.m51546a(this.f135492u, im02.f135492u) && C46238a.m51546a(Integer.valueOf(this.f135493v), Integer.valueOf(im02.f135493v)) && C46238a.m51546a(Integer.valueOf(this.f135494w), Integer.valueOf(im02.f135494w)) && C46238a.m51546a(Float.valueOf(this.f135495x), Float.valueOf(im02.f135495x)) && C46238a.m51546a(Float.valueOf(this.f135496y), Float.valueOf(im02.f135496y)) && C46238a.m51546a(this.f135497z, im02.f135497z) && C46238a.m51546a(this.f135474A, im02.f135474A) && C46238a.m51546a(this.f135475B, im02.f135475B) && C46238a.m51546a(this.f135476C, im02.f135476C) && C46238a.m51546a(Integer.valueOf(this.f135477D), Integer.valueOf(im02.f135477D));
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
            aVar.mo74321h(2, this.f135478d);
            aVar.mo74321h(3, this.f135479e);
            aVar.mo74318e(4, this.f135480f);
            C89349b bVar = this.f135481g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f135482h);
            String str = this.f135483i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74321h(8, this.f135484j);
            aVar.mo74318e(9, this.f135485n);
            aVar.mo74318e(10, this.f135486o);
            String str2 = this.f135487p;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            String str3 = this.f135488q;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            C49842ig0 ig02 = this.f135489r;
            if (ig02 != null) {
                aVar.mo74322i(13, ig02.computeSize());
                this.f135489r.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f135490s);
            aVar.mo74318e(15, this.f135491t);
            C89349b bVar2 = this.f135492u;
            if (bVar2 != null) {
                aVar.mo74315b(16, bVar2);
            }
            aVar.mo74318e(17, this.f135493v);
            aVar.mo74318e(18, this.f135494w);
            aVar.mo74317d(19, this.f135495x);
            aVar.mo74317d(20, this.f135496y);
            C49704hh0 hh02 = this.f135497z;
            if (hh02 != null) {
                aVar.mo74322i(21, hh02.computeSize());
                this.f135497z.writeFields(aVar);
            }
            C49946j51 j512 = this.f135474A;
            if (j512 != null) {
                aVar.mo74322i(22, j512.computeSize());
                this.f135474A.writeFields(aVar);
            }
            C89349b bVar3 = this.f135475B;
            if (bVar3 != null) {
                aVar.mo74315b(23, bVar3);
            }
            String str4 = this.f135476C;
            if (str4 != null) {
                aVar.mo74323j(24, str4);
            }
            aVar.mo74318e(25, this.f135477D);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f135478d) + C52418a.m58681h(3, this.f135479e) + C52418a.m58678e(4, this.f135480f);
            C89349b bVar4 = this.f135481g;
            if (bVar4 != null) {
                h += C52418a.m58675b(5, bVar4);
            }
            int h2 = h + C52418a.m58681h(6, this.f135482h);
            String str5 = this.f135483i;
            if (str5 != null) {
                h2 += C52418a.m58683j(7, str5);
            }
            int h3 = h2 + C52418a.m58681h(8, this.f135484j) + C52418a.m58678e(9, this.f135485n) + C52418a.m58678e(10, this.f135486o);
            String str6 = this.f135487p;
            if (str6 != null) {
                h3 += C52418a.m58683j(11, str6);
            }
            String str7 = this.f135488q;
            if (str7 != null) {
                h3 += C52418a.m58683j(12, str7);
            }
            C49842ig0 ig03 = this.f135489r;
            if (ig03 != null) {
                h3 += C52418a.m58682i(13, ig03.computeSize());
            }
            int e = h3 + C52418a.m58678e(14, this.f135490s) + C52418a.m58678e(15, this.f135491t);
            C89349b bVar5 = this.f135492u;
            if (bVar5 != null) {
                e += C52418a.m58675b(16, bVar5);
            }
            int e2 = e + C52418a.m58678e(17, this.f135493v) + C52418a.m58678e(18, this.f135494w) + C52418a.m58677d(19, this.f135495x) + C52418a.m58677d(20, this.f135496y);
            C49704hh0 hh03 = this.f135497z;
            if (hh03 != null) {
                e2 += C52418a.m58682i(21, hh03.computeSize());
            }
            C49946j51 j513 = this.f135474A;
            if (j513 != null) {
                e2 += C52418a.m58682i(22, j513.computeSize());
            }
            C89349b bVar6 = this.f135475B;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(23, bVar6);
            }
            String str8 = this.f135476C;
            if (str8 != null) {
                e2 += C52418a.m58683j(24, str8);
            }
            return e2 + C52418a.m58678e(25, this.f135477D);
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
            C49867im0 im02 = objArr[1];
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
                        im02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    im02.f135478d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    im02.f135479e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    im02.f135480f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    im02.f135481g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    im02.f135482h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    im02.f135483i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    im02.f135484j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    im02.f135485n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    im02.f135486o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    im02.f135487p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    im02.f135488q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        im02.f135489r = ig04;
                    }
                    return 0;
                case 14:
                    im02.f135490s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    im02.f135491t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    im02.f135492u = aVar3.mo141626d(intValue);
                    return 0;
                case 17:
                    im02.f135493v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    im02.f135494w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    im02.f135495x = aVar3.mo141628f(intValue);
                    return 0;
                case 20:
                    im02.f135496y = aVar3.mo141628f(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        im02.f135497z = hh04;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49946j51 j514 = new C49946j51();
                        if (bArr4 != null && bArr4.length > 0) {
                            j514.parseFrom(bArr4);
                        }
                        im02.f135474A = j514;
                    }
                    return 0;
                case 23:
                    im02.f135475B = aVar3.mo141626d(intValue);
                    return 0;
                case 24:
                    im02.f135476C = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    im02.f135477D = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
