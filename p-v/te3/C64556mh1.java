package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mh1 */
public class C64556mh1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f184328d;

    /* renamed from: e */
    public C89349b f184329e;

    /* renamed from: f */
    public C64674r41 f184330f;

    /* renamed from: g */
    public long f184331g;

    /* renamed from: h */
    public String f184332h;

    /* renamed from: i */
    public long f184333i;

    /* renamed from: j */
    public String f184334j;

    /* renamed from: n */
    public String f184335n;

    /* renamed from: o */
    public C50263lh1 f184336o;

    /* renamed from: p */
    public C64414h71 f184337p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64556mh1)) {
            return false;
        }
        C64556mh1 mh12 = (C64556mh1) aVar;
        return C46238a.m51546a(this.BaseRequest, mh12.BaseRequest) && C46238a.m51546a(this.f184328d, mh12.f184328d) && C46238a.m51546a(this.f184329e, mh12.f184329e) && C46238a.m51546a(this.f184330f, mh12.f184330f) && C46238a.m51546a(Long.valueOf(this.f184331g), Long.valueOf(mh12.f184331g)) && C46238a.m51546a(this.f184332h, mh12.f184332h) && C46238a.m51546a(Long.valueOf(this.f184333i), Long.valueOf(mh12.f184333i)) && C46238a.m51546a(this.f184334j, mh12.f184334j) && C46238a.m51546a(this.f184335n, mh12.f184335n) && C46238a.m51546a(this.f184336o, mh12.f184336o) && C46238a.m51546a(this.f184337p, mh12.f184337p);
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
            C49842ig0 ig02 = this.f184328d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f184328d.writeFields(aVar);
            }
            C89349b bVar = this.f184329e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C64674r41 r412 = this.f184330f;
            if (r412 != null) {
                aVar.mo74322i(4, r412.computeSize());
                this.f184330f.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f184331g);
            String str = this.f184332h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74321h(7, this.f184333i);
            String str2 = this.f184334j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f184335n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            C50263lh1 lh12 = this.f184336o;
            if (lh12 != null) {
                aVar.mo74322i(10, lh12.computeSize());
                this.f184336o.writeFields(aVar);
            }
            C64414h71 h712 = this.f184337p;
            if (h712 != null) {
                aVar.mo74322i(11, h712.computeSize());
                this.f184337p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f184328d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f184329e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C64674r41 r413 = this.f184330f;
            if (r413 != null) {
                i2 += C52418a.m58682i(4, r413.computeSize());
            }
            int h = i2 + C52418a.m58681h(5, this.f184331g);
            String str4 = this.f184332h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            int h2 = h + C52418a.m58681h(7, this.f184333i);
            String str5 = this.f184334j;
            if (str5 != null) {
                h2 += C52418a.m58683j(8, str5);
            }
            String str6 = this.f184335n;
            if (str6 != null) {
                h2 += C52418a.m58683j(9, str6);
            }
            C50263lh1 lh13 = this.f184336o;
            if (lh13 != null) {
                h2 += C52418a.m58682i(10, lh13.computeSize());
            }
            C64414h71 h713 = this.f184337p;
            return h713 != null ? h2 + C52418a.m58682i(11, h713.computeSize()) : h2;
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
            C64556mh1 mh12 = objArr[1];
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
                        mh12.BaseRequest = iaVar3;
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
                        mh12.f184328d = ig04;
                    }
                    return 0;
                case 3:
                    mh12.f184329e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64674r41 r414 = new C64674r41();
                        if (bArr3 != null && bArr3.length > 0) {
                            r414.parseFrom(bArr3);
                        }
                        mh12.f184330f = r414;
                    }
                    return 0;
                case 5:
                    mh12.f184331g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    mh12.f184332h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mh12.f184333i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    mh12.f184334j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    mh12.f184335n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50263lh1 lh14 = new C50263lh1();
                        if (bArr4 != null && bArr4.length > 0) {
                            lh14.parseFrom(bArr4);
                        }
                        mh12.f184336o = lh14;
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
                        mh12.f184337p = h714;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
