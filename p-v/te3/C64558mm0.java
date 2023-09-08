package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mm0 */
public class C64558mm0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f184342d;

    /* renamed from: e */
    public LinkedList<String> f184343e = new LinkedList<>();

    /* renamed from: f */
    public int f184344f;

    /* renamed from: g */
    public String f184345g;

    /* renamed from: h */
    public LinkedList<C50405mi0> f184346h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C64471ji0> f184347i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C64366fi0> f184348j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C64397gi0> f184349n = new LinkedList<>();

    /* renamed from: o */
    public int f184350o;

    /* renamed from: p */
    public LinkedList<C50833pi0> f184351p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<C50133ki0> f184352q = new LinkedList<>();

    /* renamed from: r */
    public String f184353r;

    /* renamed from: s */
    public C64423hi0 f184354s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64558mm0)) {
            return false;
        }
        C64558mm0 mm02 = (C64558mm0) aVar;
        return C46238a.m51546a(this.BaseRequest, mm02.BaseRequest) && C46238a.m51546a(this.f184342d, mm02.f184342d) && C46238a.m51546a(this.f184343e, mm02.f184343e) && C46238a.m51546a(Integer.valueOf(this.f184344f), Integer.valueOf(mm02.f184344f)) && C46238a.m51546a(this.f184345g, mm02.f184345g) && C46238a.m51546a(this.f184346h, mm02.f184346h) && C46238a.m51546a(this.f184347i, mm02.f184347i) && C46238a.m51546a(this.f184348j, mm02.f184348j) && C46238a.m51546a(this.f184349n, mm02.f184349n) && C46238a.m51546a(Integer.valueOf(this.f184350o), Integer.valueOf(mm02.f184350o)) && C46238a.m51546a(this.f184351p, mm02.f184351p) && C46238a.m51546a(this.f184352q, mm02.f184352q) && C46238a.m51546a(this.f184353r, mm02.f184353r) && C46238a.m51546a(this.f184354s, mm02.f184354s);
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
            C49842ig0 ig02 = this.f184342d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f184342d.writeFields(aVar);
            }
            aVar.mo74320g(3, 1, this.f184343e);
            aVar.mo74318e(4, this.f184344f);
            String str = this.f184345g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74320g(6, 8, this.f184346h);
            aVar.mo74320g(7, 8, this.f184347i);
            aVar.mo74320g(8, 8, this.f184348j);
            aVar.mo74320g(9, 8, this.f184349n);
            aVar.mo74318e(10, this.f184350o);
            aVar.mo74320g(11, 8, this.f184351p);
            aVar.mo74320g(12, 8, this.f184352q);
            String str2 = this.f184353r;
            if (str2 != null) {
                aVar.mo74323j(13, str2);
            }
            C64423hi0 hi02 = this.f184354s;
            if (hi02 != null) {
                aVar.mo74322i(14, hi02.computeSize());
                this.f184354s.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f184342d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            int g = i3 + C52418a.m58680g(3, 1, this.f184343e) + C52418a.m58678e(4, this.f184344f);
            String str3 = this.f184345g;
            if (str3 != null) {
                g += C52418a.m58683j(5, str3);
            }
            int g2 = g + C52418a.m58680g(6, 8, this.f184346h) + C52418a.m58680g(7, 8, this.f184347i) + C52418a.m58680g(8, 8, this.f184348j) + C52418a.m58680g(9, 8, this.f184349n) + C52418a.m58678e(10, this.f184350o) + C52418a.m58680g(11, 8, this.f184351p) + C52418a.m58680g(12, 8, this.f184352q);
            String str4 = this.f184353r;
            if (str4 != null) {
                g2 += C52418a.m58683j(13, str4);
            }
            C64423hi0 hi03 = this.f184354s;
            return hi03 != null ? g2 + C52418a.m58682i(14, hi03.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f184343e.clear();
            this.f184346h.clear();
            this.f184347i.clear();
            this.f184348j.clear();
            this.f184349n.clear();
            this.f184351p.clear();
            this.f184352q.clear();
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
            C64558mm0 mm02 = objArr[1];
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
                        mm02.BaseRequest = iaVar3;
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
                        mm02.f184342d = ig04;
                    }
                    return 0;
                case 3:
                    mm02.f184343e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    mm02.f184344f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mm02.f184345g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50405mi0 mi02 = new C50405mi0();
                        if (bArr3 != null && bArr3.length > 0) {
                            mi02.parseFrom(bArr3);
                        }
                        mm02.f184346h.add(mi02);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64471ji0 ji02 = new C64471ji0();
                        if (bArr4 != null && bArr4.length > 0) {
                            ji02.parseFrom(bArr4);
                        }
                        mm02.f184347i.add(ji02);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64366fi0 fi02 = new C64366fi0();
                        if (bArr5 != null && bArr5.length > 0) {
                            fi02.parseFrom(bArr5);
                        }
                        mm02.f184348j.add(fi02);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64397gi0 gi02 = new C64397gi0();
                        if (bArr6 != null && bArr6.length > 0) {
                            gi02.parseFrom(bArr6);
                        }
                        mm02.f184349n.add(gi02);
                    }
                    return 0;
                case 10:
                    mm02.f184350o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C50833pi0 pi02 = new C50833pi0();
                        if (bArr7 != null && bArr7.length > 0) {
                            pi02.parseFrom(bArr7);
                        }
                        mm02.f184351p.add(pi02);
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50133ki0 ki02 = new C50133ki0();
                        if (bArr8 != null && bArr8.length > 0) {
                            ki02.parseFrom(bArr8);
                        }
                        mm02.f184352q.add(ki02);
                    }
                    return 0;
                case 13:
                    mm02.f184353r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C64423hi0 hi04 = new C64423hi0();
                        if (bArr9 != null && bArr9.length > 0) {
                            hi04.parseFrom(bArr9);
                        }
                        mm02.f184354s = hi04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
