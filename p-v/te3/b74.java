package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class b74 extends C49335eu3 {

    /* renamed from: d */
    public int f130997d;

    /* renamed from: e */
    public int f130998e;

    /* renamed from: f */
    public C51018qv3 f130999f;

    /* renamed from: g */
    public String f131000g;

    /* renamed from: h */
    public int f131001h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b74)) {
            return false;
        }
        b74 b74 = (b74) aVar;
        return C46238a.m51546a(this.BaseResponse, b74.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130997d), Integer.valueOf(b74.f130997d)) && C46238a.m51546a(Integer.valueOf(this.f130998e), Integer.valueOf(b74.f130998e)) && C46238a.m51546a(this.f130999f, b74.f130999f) && C46238a.m51546a(this.f131000g, b74.f131000g) && C46238a.m51546a(Integer.valueOf(this.f131001h), Integer.valueOf(b74.f131001h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f130999f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f130997d);
                aVar.mo74318e(3, this.f130998e);
                C51018qv3 qv32 = this.f130999f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f130999f.writeFields(aVar);
                }
                String str = this.f131000g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74318e(6, this.f131001h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buffer");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130997d) + C52418a.m58678e(3, this.f130998e);
            C51018qv3 qv33 = this.f130999f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            String str2 = this.f131000g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            return e + C52418a.m58678e(6, this.f131001h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f130999f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buffer");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            b74 b74 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        b74.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    b74.f130997d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    b74.f130998e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        b74.f130999f = qv34;
                    }
                    return 0;
                case 5:
                    b74.f131000g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    b74.f131001h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
