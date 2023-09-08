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

/* renamed from: u41.q */
public class C52437q extends C49335eu3 {

    /* renamed from: d */
    public C52425e f146538d;

    /* renamed from: e */
    public int f146539e;

    /* renamed from: f */
    public int f146540f;

    /* renamed from: g */
    public String f146541g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52437q)) {
            return false;
        }
        C52437q qVar = (C52437q) aVar;
        return C46238a.m51546a(this.BaseResponse, qVar.BaseResponse) && C46238a.m51546a(this.f146538d, qVar.f146538d) && C46238a.m51546a(Integer.valueOf(this.f146539e), Integer.valueOf(qVar.f146539e)) && C46238a.m51546a(Integer.valueOf(this.f146540f), Integer.valueOf(qVar.f146540f)) && C46238a.m51546a(this.f146541g, qVar.f146541g);
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
                C52425e eVar = this.f146538d;
                if (eVar != null) {
                    aVar.mo74322i(2, eVar.computeSize());
                    this.f146538d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f146539e);
                aVar.mo74318e(4, this.f146540f);
                String str = this.f146541g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52425e eVar2 = this.f146538d;
            if (eVar2 != null) {
                i2 += C52418a.m58682i(2, eVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f146539e) + C52418a.m58678e(4, this.f146540f);
            String str2 = this.f146541g;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
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
            C52437q qVar = objArr[1];
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
                    qVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52425e eVar3 = new C52425e();
                    if (bArr2 != null && bArr2.length > 0) {
                        eVar3.parseFrom(bArr2);
                    }
                    qVar.f146538d = eVar3;
                }
                return 0;
            } else if (intValue == 3) {
                qVar.f146539e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                qVar.f146540f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                qVar.f146541g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
