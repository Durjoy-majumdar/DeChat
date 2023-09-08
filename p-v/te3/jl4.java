package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class jl4 extends C101820nt3 {

    /* renamed from: d */
    public C50422mm2 f136182d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jl4)) {
            return false;
        }
        jl4 jl4 = (jl4) aVar;
        return C46238a.m51546a(this.BaseRequest, jl4.BaseRequest) && C46238a.m51546a(this.f136182d, jl4.f136182d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f136182d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C50422mm2 mm22 = this.f136182d;
                if (mm22 != null) {
                    aVar.mo74322i(2, mm22.computeSize());
                    this.f136182d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: LabelPair");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C50422mm2 mm23 = this.f136182d;
            return mm23 != null ? i2 + C52418a.m58682i(2, mm23.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136182d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: LabelPair");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            jl4 jl4 = objArr[1];
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
                    jl4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50422mm2 mm24 = new C50422mm2();
                    if (bArr2 != null && bArr2.length > 0) {
                        mm24.parseFrom(bArr2);
                    }
                    jl4.f136182d = mm24;
                }
                return 0;
            }
        }
    }
}
