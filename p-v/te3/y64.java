package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class y64 extends C49335eu3 {

    /* renamed from: d */
    public SnsObject f145146d;

    /* renamed from: e */
    public w84 f145147e;

    /* renamed from: f */
    public int f145148f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y64)) {
            return false;
        }
        y64 y64 = (y64) aVar;
        return C46238a.m51546a(this.BaseResponse, y64.BaseResponse) && C46238a.m51546a(this.f145146d, y64.f145146d) && C46238a.m51546a(this.f145147e, y64.f145147e) && C46238a.m51546a(Integer.valueOf(this.f145148f), Integer.valueOf(y64.f145148f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145146d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                SnsObject snsObject = this.f145146d;
                if (snsObject != null) {
                    aVar.mo74322i(2, snsObject.computeSize());
                    this.f145146d.writeFields(aVar);
                }
                w84 w84 = this.f145147e;
                if (w84 != null) {
                    aVar.mo74322i(3, w84.computeSize());
                    this.f145147e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f145148f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SnsObject");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            SnsObject snsObject2 = this.f145146d;
            if (snsObject2 != null) {
                i2 += C52418a.m58682i(2, snsObject2.computeSize());
            }
            w84 w842 = this.f145147e;
            if (w842 != null) {
                i2 += C52418a.m58682i(3, w842.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f145148f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145146d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SnsObject");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            y64 y64 = objArr[1];
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
                    y64.BaseResponse = jaVar3;
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
                    y64.f145146d = snsObject3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    w84 w843 = new w84();
                    if (bArr3 != null && bArr3.length > 0) {
                        w843.parseFrom(bArr3);
                    }
                    y64.f145147e = w843;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                y64.f145148f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
