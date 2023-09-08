package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.s */
public class C52439s extends C49335eu3 {

    /* renamed from: d */
    public C52440t f146544d;

    /* renamed from: e */
    public C52431k f146545e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52439s)) {
            return false;
        }
        C52439s sVar = (C52439s) aVar;
        return C46238a.m51546a(this.BaseResponse, sVar.BaseResponse) && C46238a.m51546a(this.f146544d, sVar.f146544d) && C46238a.m51546a(this.f146545e, sVar.f146545e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C52440t tVar = this.f146544d;
                if (tVar != null) {
                    aVar.mo74322i(2, tVar.computeSize());
                    this.f146544d.writeFields(aVar);
                }
                C52431k kVar = this.f146545e;
                if (kVar != null) {
                    aVar.mo74322i(3, kVar.computeSize());
                    this.f146545e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52440t tVar2 = this.f146544d;
            if (tVar2 != null) {
                i2 += C52418a.m58682i(2, tVar2.computeSize());
            }
            C52431k kVar2 = this.f146545e;
            return kVar2 != null ? i2 + C52418a.m58682i(3, kVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52439s sVar = objArr[1];
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
                    sVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52440t tVar3 = new C52440t();
                    if (bArr2 != null && bArr2.length > 0) {
                        tVar3.parseFrom(bArr2);
                    }
                    sVar.f146544d = tVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52431k kVar3 = new C52431k();
                    if (bArr3 != null && bArr3.length > 0) {
                        kVar3.parseFrom(bArr3);
                    }
                    sVar.f146545e = kVar3;
                }
                return 0;
            }
        }
    }
}
