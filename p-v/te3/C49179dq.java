package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dq */
public class C49179dq extends C49335eu3 {

    /* renamed from: d */
    public int f132472d;

    /* renamed from: e */
    public String f132473e;

    /* renamed from: f */
    public C89349b f132474f;

    /* renamed from: g */
    public int f132475g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49179dq)) {
            return false;
        }
        C49179dq dqVar = (C49179dq) aVar;
        return C46238a.m51546a(this.BaseResponse, dqVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132472d), Integer.valueOf(dqVar.f132472d)) && C46238a.m51546a(this.f132473e, dqVar.f132473e) && C46238a.m51546a(this.f132474f, dqVar.f132474f) && C46238a.m51546a(Integer.valueOf(this.f132475g), Integer.valueOf(dqVar.f132475g));
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
                aVar.mo74318e(2, this.f132472d);
                String str = this.f132473e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C89349b bVar = this.f132474f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74318e(5, this.f132475g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132472d);
            String str2 = this.f132473e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f132474f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f132475g);
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
            C49179dq dqVar = objArr[1];
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
                    dqVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dqVar.f132472d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                dqVar.f132473e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                dqVar.f132474f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dqVar.f132475g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
