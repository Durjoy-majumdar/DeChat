package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class q44 extends C49335eu3 {

    /* renamed from: d */
    public o44 f140137d;

    /* renamed from: e */
    public String f140138e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q44)) {
            return false;
        }
        q44 q44 = (q44) aVar;
        return C46238a.m51546a(this.BaseResponse, q44.BaseResponse) && C46238a.m51546a(this.f140137d, q44.f140137d) && C46238a.m51546a(this.f140138e, q44.f140138e);
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
                o44 o44 = this.f140137d;
                if (o44 != null) {
                    aVar.mo74322i(2, o44.computeSize());
                    this.f140137d.writeFields(aVar);
                }
                String str = this.f140138e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            o44 o442 = this.f140137d;
            if (o442 != null) {
                i2 += C52418a.m58682i(2, o442.computeSize());
            }
            String str2 = this.f140138e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            q44 q44 = objArr[1];
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
                    q44.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    o44 o443 = new o44();
                    if (bArr2 != null && bArr2.length > 0) {
                        o443.parseFrom(bArr2);
                    }
                    q44.f140137d = o443;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                q44.f140138e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
