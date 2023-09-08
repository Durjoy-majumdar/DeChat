package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a3 */
public class C48657a3 extends C49335eu3 {

    /* renamed from: d */
    public int f130262d;

    /* renamed from: e */
    public LinkedList<C49908iw2> f130263e = new LinkedList<>();

    /* renamed from: f */
    public String f130264f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48657a3)) {
            return false;
        }
        C48657a3 a3Var = (C48657a3) aVar;
        return C46238a.m51546a(this.BaseResponse, a3Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130262d), Integer.valueOf(a3Var.f130262d)) && C46238a.m51546a(this.f130263e, a3Var.f130263e) && C46238a.m51546a(this.f130264f, a3Var.f130264f);
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
                aVar.mo74318e(2, this.f130262d);
                aVar.mo74320g(3, 8, this.f130263e);
                String str = this.f130264f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130262d) + C52418a.m58680g(3, 8, this.f130263e);
            String str2 = this.f130264f;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            this.f130263e.clear();
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
            C48657a3 a3Var = objArr[1];
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
                    a3Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                a3Var.f130262d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49908iw2 iw22 = new C49908iw2();
                    if (bArr2 != null && bArr2.length > 0) {
                        iw22.parseFrom(bArr2);
                    }
                    a3Var.f130263e.add(iw22);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                a3Var.f130264f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
