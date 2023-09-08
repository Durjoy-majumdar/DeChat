package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zn0 */
public class C52285zn0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f146111d;

    /* renamed from: e */
    public C89349b f146112e;

    /* renamed from: f */
    public long f146113f;

    /* renamed from: g */
    public String f146114g;

    /* renamed from: h */
    public int f146115h;

    /* renamed from: i */
    public long f146116i;

    /* renamed from: j */
    public boolean f146117j;

    /* renamed from: n */
    public String f146118n;

    /* renamed from: o */
    public C64840xw0 f146119o;

    /* renamed from: p */
    public C89349b f146120p;

    /* renamed from: q */
    public String f146121q;

    /* renamed from: r */
    public LinkedList<C50317lw0> f146122r = new LinkedList<>();

    /* renamed from: s */
    public C50317lw0 f146123s;

    /* renamed from: t */
    public C64414h71 f146124t;

    /* renamed from: u */
    public int f146125u;

    /* renamed from: v */
    public C52140yn0 f146126v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52285zn0)) {
            return false;
        }
        C52285zn0 zn02 = (C52285zn0) aVar;
        return C46238a.m51546a(this.BaseRequest, zn02.BaseRequest) && C46238a.m51546a(this.f146111d, zn02.f146111d) && C46238a.m51546a(this.f146112e, zn02.f146112e) && C46238a.m51546a(Long.valueOf(this.f146113f), Long.valueOf(zn02.f146113f)) && C46238a.m51546a(this.f146114g, zn02.f146114g) && C46238a.m51546a(Integer.valueOf(this.f146115h), Integer.valueOf(zn02.f146115h)) && C46238a.m51546a(Long.valueOf(this.f146116i), Long.valueOf(zn02.f146116i)) && C46238a.m51546a(Boolean.valueOf(this.f146117j), Boolean.valueOf(zn02.f146117j)) && C46238a.m51546a(this.f146118n, zn02.f146118n) && C46238a.m51546a(this.f146119o, zn02.f146119o) && C46238a.m51546a(this.f146120p, zn02.f146120p) && C46238a.m51546a(this.f146121q, zn02.f146121q) && C46238a.m51546a(this.f146122r, zn02.f146122r) && C46238a.m51546a(this.f146123s, zn02.f146123s) && C46238a.m51546a(this.f146124t, zn02.f146124t) && C46238a.m51546a(Integer.valueOf(this.f146125u), Integer.valueOf(zn02.f146125u)) && C46238a.m51546a(this.f146126v, zn02.f146126v);
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
            C49842ig0 ig02 = this.f146111d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f146111d.writeFields(aVar);
            }
            C89349b bVar = this.f146112e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f146113f);
            String str = this.f146114g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f146115h);
            aVar.mo74321h(7, this.f146116i);
            aVar.mo74314a(8, this.f146117j);
            String str2 = this.f146118n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            C64840xw0 xw02 = this.f146119o;
            if (xw02 != null) {
                aVar.mo74322i(10, xw02.computeSize());
                this.f146119o.writeFields(aVar);
            }
            C89349b bVar2 = this.f146120p;
            if (bVar2 != null) {
                aVar.mo74315b(11, bVar2);
            }
            String str3 = this.f146121q;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            aVar.mo74320g(13, 8, this.f146122r);
            C50317lw0 lw02 = this.f146123s;
            if (lw02 != null) {
                aVar.mo74322i(14, lw02.computeSize());
                this.f146123s.writeFields(aVar);
            }
            C64414h71 h712 = this.f146124t;
            if (h712 != null) {
                aVar.mo74322i(15, h712.computeSize());
                this.f146124t.writeFields(aVar);
            }
            aVar.mo74318e(18, this.f146125u);
            C52140yn0 yn02 = this.f146126v;
            if (yn02 != null) {
                aVar.mo74322i(19, yn02.computeSize());
                this.f146126v.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f146111d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar3 = this.f146112e;
            if (bVar3 != null) {
                i3 += C52418a.m58675b(3, bVar3);
            }
            int h = i3 + C52418a.m58681h(4, this.f146113f);
            String str4 = this.f146114g;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            int e = h + C52418a.m58678e(6, this.f146115h) + C52418a.m58681h(7, this.f146116i) + C52418a.m58674a(8, this.f146117j);
            String str5 = this.f146118n;
            if (str5 != null) {
                e += C52418a.m58683j(9, str5);
            }
            C64840xw0 xw03 = this.f146119o;
            if (xw03 != null) {
                e += C52418a.m58682i(10, xw03.computeSize());
            }
            C89349b bVar4 = this.f146120p;
            if (bVar4 != null) {
                e += C52418a.m58675b(11, bVar4);
            }
            String str6 = this.f146121q;
            if (str6 != null) {
                e += C52418a.m58683j(12, str6);
            }
            int g = e + C52418a.m58680g(13, 8, this.f146122r);
            C50317lw0 lw03 = this.f146123s;
            if (lw03 != null) {
                g += C52418a.m58682i(14, lw03.computeSize());
            }
            C64414h71 h713 = this.f146124t;
            if (h713 != null) {
                g += C52418a.m58682i(15, h713.computeSize());
            }
            int e2 = g + C52418a.m58678e(18, this.f146125u);
            C52140yn0 yn03 = this.f146126v;
            return yn03 != null ? e2 + C52418a.m58682i(19, yn03.computeSize()) : e2;
        } else if (i2 == 2) {
            this.f146122r.clear();
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
            C52285zn0 zn02 = objArr[1];
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
                        zn02.BaseRequest = iaVar3;
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
                        zn02.f146111d = ig04;
                    }
                    return 0;
                case 3:
                    zn02.f146112e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    zn02.f146113f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    zn02.f146114g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zn02.f146115h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zn02.f146116i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    zn02.f146117j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    zn02.f146118n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr3 != null && bArr3.length > 0) {
                            xw04.parseFrom(bArr3);
                        }
                        zn02.f146119o = xw04;
                    }
                    return 0;
                case 11:
                    zn02.f146120p = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    zn02.f146121q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50317lw0 lw04 = new C50317lw0();
                        if (bArr4 != null && bArr4.length > 0) {
                            lw04.parseFrom(bArr4);
                        }
                        zn02.f146122r.add(lw04);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50317lw0 lw05 = new C50317lw0();
                        if (bArr5 != null && bArr5.length > 0) {
                            lw05.parseFrom(bArr5);
                        }
                        zn02.f146123s = lw05;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64414h71 h714 = new C64414h71();
                        if (bArr6 != null && bArr6.length > 0) {
                            h714.parseFrom(bArr6);
                        }
                        zn02.f146124t = h714;
                    }
                    return 0;
                case 18:
                    zn02.f146125u = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C52140yn0 yn04 = new C52140yn0();
                        if (bArr7 != null && bArr7.length > 0) {
                            yn04.parseFrom(bArr7);
                        }
                        zn02.f146126v = yn04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
