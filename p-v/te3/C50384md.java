package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.md */
public class C50384md extends C49335eu3 {

    /* renamed from: d */
    public C49697hf2 f137954d;

    /* renamed from: e */
    public C49840if2 f137955e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50384md)) {
            return false;
        }
        C50384md mdVar = (C50384md) aVar;
        return C46238a.m51546a(this.BaseResponse, mdVar.BaseResponse) && C46238a.m51546a(this.f137954d, mdVar.f137954d) && C46238a.m51546a(this.f137955e, mdVar.f137955e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f137954d == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f137955e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C49697hf2 hf22 = this.f137954d;
                if (hf22 != null) {
                    aVar.mo74322i(2, hf22.computeSize());
                    this.f137954d.writeFields(aVar);
                }
                C49840if2 if22 = this.f137955e;
                if (if22 != null) {
                    aVar.mo74322i(3, if22.computeSize());
                    this.f137955e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: HardDeviceAttr");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49697hf2 hf23 = this.f137954d;
            if (hf23 != null) {
                i2 += C52418a.m58682i(2, hf23.computeSize());
            }
            C49840if2 if23 = this.f137955e;
            return if23 != null ? i2 + C52418a.m58682i(3, if23.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f137954d == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f137955e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: HardDeviceAttr");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50384md mdVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    mdVar.BaseResponse = jaVar3;
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
                    mdVar.f137954d = hf24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49840if2 if24 = new C49840if2();
                    if (bArr3 != null && bArr3.length > 0) {
                        if24.parseFrom(bArr3);
                    }
                    mdVar.f137955e = if24;
                }
                return 0;
            }
        }
    }
}
