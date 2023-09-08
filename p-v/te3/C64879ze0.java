package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ze0 */
public class C64879ze0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f186686d;

    /* renamed from: e */
    public C89349b f186687e;

    /* renamed from: f */
    public long f186688f;

    /* renamed from: g */
    public long f186689g;

    /* renamed from: h */
    public String f186690h;

    /* renamed from: i */
    public int f186691i;

    /* renamed from: j */
    public String f186692j;

    /* renamed from: n */
    public String f186693n;

    /* renamed from: o */
    public int f186694o;

    /* renamed from: p */
    public LinkedList<C64785vw2> f186695p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<C64785vw2> f186696q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<C64781vp2> f186697r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<C64785vw2> f186698s = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64879ze0)) {
            return false;
        }
        C64879ze0 ze02 = (C64879ze0) aVar;
        return C46238a.m51546a(this.BaseRequest, ze02.BaseRequest) && C46238a.m51546a(this.f186686d, ze02.f186686d) && C46238a.m51546a(this.f186687e, ze02.f186687e) && C46238a.m51546a(Long.valueOf(this.f186688f), Long.valueOf(ze02.f186688f)) && C46238a.m51546a(Long.valueOf(this.f186689g), Long.valueOf(ze02.f186689g)) && C46238a.m51546a(this.f186690h, ze02.f186690h) && C46238a.m51546a(Integer.valueOf(this.f186691i), Integer.valueOf(ze02.f186691i)) && C46238a.m51546a(this.f186692j, ze02.f186692j) && C46238a.m51546a(this.f186693n, ze02.f186693n) && C46238a.m51546a(Integer.valueOf(this.f186694o), Integer.valueOf(ze02.f186694o)) && C46238a.m51546a(this.f186695p, ze02.f186695p) && C46238a.m51546a(this.f186696q, ze02.f186696q) && C46238a.m51546a(this.f186697r, ze02.f186697r) && C46238a.m51546a(this.f186698s, ze02.f186698s);
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
            C49842ig0 ig02 = this.f186686d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186686d.writeFields(aVar);
            }
            C89349b bVar = this.f186687e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f186688f);
            aVar.mo74321h(5, this.f186689g);
            String str = this.f186690h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f186691i);
            String str2 = this.f186692j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f186693n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f186694o);
            aVar.mo74320g(11, 8, this.f186695p);
            aVar.mo74320g(12, 8, this.f186696q);
            aVar.mo74320g(13, 8, this.f186697r);
            aVar.mo74320g(14, 8, this.f186698s);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f186686d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f186687e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int h = i3 + C52418a.m58681h(4, this.f186688f) + C52418a.m58681h(5, this.f186689g);
            String str4 = this.f186690h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            int e = h + C52418a.m58678e(7, this.f186691i);
            String str5 = this.f186692j;
            if (str5 != null) {
                e += C52418a.m58683j(8, str5);
            }
            String str6 = this.f186693n;
            if (str6 != null) {
                e += C52418a.m58683j(9, str6);
            }
            return e + C52418a.m58678e(10, this.f186694o) + C52418a.m58680g(11, 8, this.f186695p) + C52418a.m58680g(12, 8, this.f186696q) + C52418a.m58680g(13, 8, this.f186697r) + C52418a.m58680g(14, 8, this.f186698s);
        } else if (i2 == 2) {
            this.f186695p.clear();
            this.f186696q.clear();
            this.f186697r.clear();
            this.f186698s.clear();
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
            C64879ze0 ze02 = objArr[1];
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
                        ze02.BaseRequest = iaVar3;
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
                        ze02.f186686d = ig04;
                    }
                    return 0;
                case 3:
                    ze02.f186687e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ze02.f186688f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ze02.f186689g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ze02.f186690h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ze02.f186691i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ze02.f186692j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ze02.f186693n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ze02.f186694o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64785vw2 vw22 = new C64785vw2();
                        if (bArr3 != null && bArr3.length > 0) {
                            vw22.parseFrom(bArr3);
                        }
                        ze02.f186695p.add(vw22);
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64785vw2 vw23 = new C64785vw2();
                        if (bArr4 != null && bArr4.length > 0) {
                            vw23.parseFrom(bArr4);
                        }
                        ze02.f186696q.add(vw23);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64781vp2 vp22 = new C64781vp2();
                        if (bArr5 != null && bArr5.length > 0) {
                            vp22.parseFrom(bArr5);
                        }
                        ze02.f186697r.add(vp22);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64785vw2 vw24 = new C64785vw2();
                        if (bArr6 != null && bArr6.length > 0) {
                            vw24.parseFrom(bArr6);
                        }
                        ze02.f186698s.add(vw24);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
