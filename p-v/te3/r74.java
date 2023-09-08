package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class r74 extends C49335eu3 {

    /* renamed from: d */
    public SnsObject f140749d;

    /* renamed from: e */
    public int f140750e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof r74)) {
            return false;
        }
        r74 r74 = (r74) aVar;
        return C46238a.m51546a(this.BaseResponse, r74.BaseResponse) && C46238a.m51546a(this.f140749d, r74.f140749d) && C46238a.m51546a(Integer.valueOf(this.f140750e), Integer.valueOf(r74.f140750e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f140749d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                SnsObject snsObject = this.f140749d;
                if (snsObject != null) {
                    aVar.mo74322i(2, snsObject.computeSize());
                    this.f140749d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f140750e);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Object");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            SnsObject snsObject2 = this.f140749d;
            if (snsObject2 != null) {
                i2 += C52418a.m58682i(2, snsObject2.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f140750e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f140749d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Object");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            r74 r74 = objArr[1];
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
                    r74.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    SnsObject snsObject3 = new SnsObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        snsObject3.parseFrom(bArr2);
                    }
                    r74.f140749d = snsObject3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                r74.f140750e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
