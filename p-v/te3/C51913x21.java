package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x21 */
public class C51913x21 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144412d;

    /* renamed from: e */
    public long f144413e;

    /* renamed from: f */
    public C89349b f144414f;

    /* renamed from: g */
    public String f144415g;

    /* renamed from: h */
    public C48914bw f144416h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51913x21)) {
            return false;
        }
        C51913x21 x212 = (C51913x21) aVar;
        return C46238a.m51546a(this.BaseRequest, x212.BaseRequest) && C46238a.m51546a(this.f144412d, x212.f144412d) && C46238a.m51546a(Long.valueOf(this.f144413e), Long.valueOf(x212.f144413e)) && C46238a.m51546a(this.f144414f, x212.f144414f) && C46238a.m51546a(this.f144415g, x212.f144415g) && C46238a.m51546a(this.f144416h, x212.f144416h);
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
            C49842ig0 ig02 = this.f144412d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144412d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f144413e);
            C89349b bVar = this.f144414f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str = this.f144415g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C48914bw bwVar = this.f144416h;
            if (bwVar != null) {
                aVar.mo74322i(6, bwVar.computeSize());
                this.f144416h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144412d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f144413e);
            C89349b bVar2 = this.f144414f;
            if (bVar2 != null) {
                h += C52418a.m58675b(4, bVar2);
            }
            String str2 = this.f144415g;
            if (str2 != null) {
                h += C52418a.m58683j(5, str2);
            }
            C48914bw bwVar2 = this.f144416h;
            return bwVar2 != null ? h + C52418a.m58682i(6, bwVar2.computeSize()) : h;
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
            C51913x21 x212 = objArr[1];
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
                        x212.BaseRequest = iaVar3;
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
                        x212.f144412d = ig04;
                    }
                    return 0;
                case 3:
                    x212.f144413e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    x212.f144414f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    x212.f144415g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48914bw bwVar3 = new C48914bw();
                        if (bArr3 != null && bArr3.length > 0) {
                            bwVar3.parseFrom(bArr3);
                        }
                        x212.f144416h = bwVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
