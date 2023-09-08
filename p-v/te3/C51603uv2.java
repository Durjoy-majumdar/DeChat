package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uv2 */
public class C51603uv2 extends C49335eu3 {

    /* renamed from: d */
    public C50882pv2 f143156d;

    /* renamed from: e */
    public FinderContact f143157e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51603uv2)) {
            return false;
        }
        C51603uv2 uv22 = (C51603uv2) aVar;
        return C46238a.m51546a(this.BaseResponse, uv22.BaseResponse) && C46238a.m51546a(this.f143156d, uv22.f143156d) && C46238a.m51546a(this.f143157e, uv22.f143157e);
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
                C50882pv2 pv22 = this.f143156d;
                if (pv22 != null) {
                    aVar.mo74322i(2, pv22.computeSize());
                    this.f143156d.writeFields(aVar);
                }
                FinderContact finderContact = this.f143157e;
                if (finderContact != null) {
                    aVar.mo74322i(3, finderContact.computeSize());
                    this.f143157e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50882pv2 pv23 = this.f143156d;
            if (pv23 != null) {
                i2 += C52418a.m58682i(2, pv23.computeSize());
            }
            FinderContact finderContact2 = this.f143157e;
            return finderContact2 != null ? i2 + C52418a.m58682i(3, finderContact2.computeSize()) : i2;
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
            C51603uv2 uv22 = objArr[1];
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
                    uv22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50882pv2 pv24 = new C50882pv2();
                    if (bArr2 != null && bArr2.length > 0) {
                        pv24.parseFrom(bArr2);
                    }
                    uv22.f143156d = pv24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderContact3.parseFrom(bArr3);
                    }
                    uv22.f143157e = finderContact3;
                }
                return 0;
            }
        }
    }
}
