package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x31 */
public class C51918x31 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144422d;

    /* renamed from: e */
    public int f144423e;

    /* renamed from: f */
    public C52173yv0 f144424f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51918x31)) {
            return false;
        }
        C51918x31 x312 = (C51918x31) aVar;
        return C46238a.m51546a(this.BaseRequest, x312.BaseRequest) && C46238a.m51546a(this.f144422d, x312.f144422d) && C46238a.m51546a(Integer.valueOf(this.f144423e), Integer.valueOf(x312.f144423e)) && C46238a.m51546a(this.f144424f, x312.f144424f);
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
            C49842ig0 ig02 = this.f144422d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144422d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f144423e);
            C52173yv0 yv02 = this.f144424f;
            if (yv02 != null) {
                aVar.mo74322i(4, yv02.computeSize());
                this.f144424f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f144422d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f144423e);
            C52173yv0 yv03 = this.f144424f;
            return yv03 != null ? e + C52418a.m58682i(4, yv03.computeSize()) : e;
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
            C51918x31 x312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    x312.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    x312.f144422d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                x312.f144423e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52173yv0 yv04 = new C52173yv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        yv04.parseFrom(bArr3);
                    }
                    x312.f144424f = yv04;
                }
                return 0;
            }
        }
    }
}
