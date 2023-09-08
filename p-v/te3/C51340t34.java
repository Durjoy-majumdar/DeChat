package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t34 */
public class C51340t34 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f141927d;

    /* renamed from: e */
    public int f141928e;

    /* renamed from: f */
    public int f141929f;

    /* renamed from: g */
    public int f141930g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51340t34)) {
            return false;
        }
        C51340t34 t342 = (C51340t34) aVar;
        return C46238a.m51546a(this.BaseResponse, t342.BaseResponse) && C46238a.m51546a(this.f141927d, t342.f141927d) && C46238a.m51546a(Integer.valueOf(this.f141928e), Integer.valueOf(t342.f141928e)) && C46238a.m51546a(Integer.valueOf(this.f141929f), Integer.valueOf(t342.f141929f)) && C46238a.m51546a(Integer.valueOf(this.f141930g), Integer.valueOf(t342.f141930g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f141927d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f141927d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f141927d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f141928e);
                aVar.mo74318e(4, this.f141929f);
                aVar.mo74318e(5, this.f141930g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buffer");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f141927d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f141928e) + C52418a.m58678e(4, this.f141929f) + C52418a.m58678e(5, this.f141930g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f141927d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buffer");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51340t34 t342 = objArr[1];
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
                    t342.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    t342.f141927d = qv34;
                }
                return 0;
            } else if (intValue == 3) {
                t342.f141928e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                t342.f141929f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                t342.f141930g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
