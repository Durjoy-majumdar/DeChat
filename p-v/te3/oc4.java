package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class oc4 extends C49335eu3 {

    /* renamed from: d */
    public C51024qx f139092d;

    /* renamed from: e */
    public int f139093e;

    /* renamed from: f */
    public C51018qv3 f139094f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oc4)) {
            return false;
        }
        oc4 oc4 = (oc4) aVar;
        return C46238a.m51546a(this.BaseResponse, oc4.BaseResponse) && C46238a.m51546a(this.f139092d, oc4.f139092d) && C46238a.m51546a(Integer.valueOf(this.f139093e), Integer.valueOf(oc4.f139093e)) && C46238a.m51546a(this.f139094f, oc4.f139094f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139092d == null) {
                throw new C52419b("Not all required fields were included: CmdList");
            } else if (this.f139094f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51024qx qxVar = this.f139092d;
                if (qxVar != null) {
                    aVar.mo74322i(2, qxVar.computeSize());
                    this.f139092d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f139093e);
                C51018qv3 qv32 = this.f139094f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f139094f.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51024qx qxVar2 = this.f139092d;
            if (qxVar2 != null) {
                i2 += C52418a.m58682i(2, qxVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f139093e);
            C51018qv3 qv33 = this.f139094f;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139092d == null) {
                throw new C52419b("Not all required fields were included: CmdList");
            } else if (this.f139094f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            oc4 oc4 = objArr[1];
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
                    oc4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51024qx qxVar3 = new C51024qx();
                    if (bArr2 != null && bArr2.length > 0) {
                        qxVar3.parseFrom(bArr2);
                    }
                    oc4.f139092d = qxVar3;
                }
                return 0;
            } else if (intValue == 3) {
                oc4.f139093e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv34.mo73348f(bArr3);
                    }
                    oc4.f139094f = qv34;
                }
                return 0;
            }
        }
    }
}
