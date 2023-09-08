package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wx0 */
public class C51890wx0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144331d;

    /* renamed from: e */
    public long f144332e;

    /* renamed from: f */
    public String f144333f;

    /* renamed from: g */
    public float f144334g;

    /* renamed from: h */
    public float f144335h;

    /* renamed from: i */
    public String f144336i;

    /* renamed from: j */
    public C89349b f144337j;

    /* renamed from: n */
    public C49704hh0 f144338n;

    /* renamed from: o */
    public C64840xw0 f144339o;

    /* renamed from: p */
    public C64414h71 f144340p;

    /* renamed from: q */
    public C89349b f144341q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51890wx0)) {
            return false;
        }
        C51890wx0 wx02 = (C51890wx0) aVar;
        return C46238a.m51546a(this.BaseRequest, wx02.BaseRequest) && C46238a.m51546a(this.f144331d, wx02.f144331d) && C46238a.m51546a(Long.valueOf(this.f144332e), Long.valueOf(wx02.f144332e)) && C46238a.m51546a(this.f144333f, wx02.f144333f) && C46238a.m51546a(Float.valueOf(this.f144334g), Float.valueOf(wx02.f144334g)) && C46238a.m51546a(Float.valueOf(this.f144335h), Float.valueOf(wx02.f144335h)) && C46238a.m51546a(this.f144336i, wx02.f144336i) && C46238a.m51546a(this.f144337j, wx02.f144337j) && C46238a.m51546a(this.f144338n, wx02.f144338n) && C46238a.m51546a(this.f144339o, wx02.f144339o) && C46238a.m51546a(this.f144340p, wx02.f144340p) && C46238a.m51546a(this.f144341q, wx02.f144341q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f144331d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144331d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f144332e);
            String str = this.f144333f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74317d(5, this.f144334g);
            aVar.mo74317d(6, this.f144335h);
            String str2 = this.f144336i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar = this.f144337j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            C49704hh0 hh02 = this.f144338n;
            if (hh02 != null) {
                aVar.mo74322i(9, hh02.computeSize());
                this.f144338n.writeFields(aVar);
            }
            C64840xw0 xw02 = this.f144339o;
            if (xw02 != null) {
                aVar.mo74322i(10, xw02.computeSize());
                this.f144339o.writeFields(aVar);
            }
            C64414h71 h712 = this.f144340p;
            if (h712 != null) {
                aVar.mo74322i(11, h712.computeSize());
                this.f144340p.writeFields(aVar);
            }
            C89349b bVar2 = this.f144341q;
            if (bVar2 != null) {
                aVar.mo74315b(12, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144331d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f144332e);
            String str3 = this.f144333f;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            int d = h + C52418a.m58677d(5, this.f144334g) + C52418a.m58677d(6, this.f144335h);
            String str4 = this.f144336i;
            if (str4 != null) {
                d += C52418a.m58683j(7, str4);
            }
            C89349b bVar3 = this.f144337j;
            if (bVar3 != null) {
                d += C52418a.m58675b(8, bVar3);
            }
            C49704hh0 hh03 = this.f144338n;
            if (hh03 != null) {
                d += C52418a.m58682i(9, hh03.computeSize());
            }
            C64840xw0 xw03 = this.f144339o;
            if (xw03 != null) {
                d += C52418a.m58682i(10, xw03.computeSize());
            }
            C64414h71 h713 = this.f144340p;
            if (h713 != null) {
                d += C52418a.m58682i(11, h713.computeSize());
            }
            C89349b bVar4 = this.f144341q;
            return bVar4 != null ? d + C52418a.m58675b(12, bVar4) : d;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51890wx0 wx02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        wx02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        wx02.f144331d = ig04;
                    }
                    return 0;
                case 3:
                    wx02.f144332e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    wx02.f144333f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wx02.f144334g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    wx02.f144335h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    wx02.f144336i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wx02.f144337j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        wx02.f144338n = hh04;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr4 != null && bArr4.length > 0) {
                            xw04.parseFrom(bArr4);
                        }
                        wx02.f144339o = xw04;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C64414h71 h714 = new C64414h71();
                        if (bArr5 != null && bArr5.length > 0) {
                            h714.parseFrom(bArr5);
                        }
                        wx02.f144340p = h714;
                    }
                    return 0;
                case 12:
                    wx02.f144341q = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
