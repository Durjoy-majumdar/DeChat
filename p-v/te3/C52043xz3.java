package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xz3 */
public class C52043xz3 extends C101820nt3 {

    /* renamed from: d */
    public C49697hf2 f145041d;

    /* renamed from: e */
    public C50257lf2 f145042e;

    /* renamed from: f */
    public C51018qv3 f145043f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52043xz3)) {
            return false;
        }
        C52043xz3 xz32 = (C52043xz3) aVar;
        return C46238a.m51546a(this.BaseRequest, xz32.BaseRequest) && C46238a.m51546a(this.f145041d, xz32.f145041d) && C46238a.m51546a(this.f145042e, xz32.f145042e) && C46238a.m51546a(this.f145043f, xz32.f145043f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f145041d == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f145042e == null) {
                throw new C52419b("Not all required fields were included: HardDeviceMsg");
            } else if (this.f145043f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C49697hf2 hf22 = this.f145041d;
                if (hf22 != null) {
                    aVar.mo74322i(2, hf22.computeSize());
                    this.f145041d.writeFields(aVar);
                }
                C50257lf2 lf22 = this.f145042e;
                if (lf22 != null) {
                    aVar.mo74322i(3, lf22.computeSize());
                    this.f145042e.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f145043f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f145043f.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SessionBuffer");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49697hf2 hf23 = this.f145041d;
            if (hf23 != null) {
                i2 += C52418a.m58682i(2, hf23.computeSize());
            }
            C50257lf2 lf23 = this.f145042e;
            if (lf23 != null) {
                i2 += C52418a.m58682i(3, lf23.computeSize());
            }
            C51018qv3 qv33 = this.f145043f;
            return qv33 != null ? i2 + C52418a.m58682i(4, qv33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145041d == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f145042e == null) {
                throw new C52419b("Not all required fields were included: HardDeviceMsg");
            } else if (this.f145043f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SessionBuffer");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52043xz3 xz32 = objArr[1];
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
                    xz32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hf24.parseFrom(bArr2);
                    }
                    xz32.f145041d = hf24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50257lf2 lf24 = new C50257lf2();
                    if (bArr3 != null && bArr3.length > 0) {
                        lf24.parseFrom(bArr3);
                    }
                    xz32.f145042e = lf24;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr4 != null && bArr4.length > 0) {
                        qv34.mo73348f(bArr4);
                    }
                    xz32.f145043f = qv34;
                }
                return 0;
            }
        }
    }
}
