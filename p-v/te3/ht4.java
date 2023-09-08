package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ht4 extends C49335eu3 {

    /* renamed from: d */
    public int f134871d;

    /* renamed from: e */
    public int f134872e;

    /* renamed from: f */
    public LinkedList<C51163rv3> f134873f = new LinkedList<>();

    /* renamed from: g */
    public String f134874g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ht4)) {
            return false;
        }
        ht4 ht4 = (ht4) aVar;
        return C46238a.m51546a(this.BaseResponse, ht4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134871d), Integer.valueOf(ht4.f134871d)) && C46238a.m51546a(Integer.valueOf(this.f134872e), Integer.valueOf(ht4.f134872e)) && C46238a.m51546a(this.f134873f, ht4.f134873f) && C46238a.m51546a(this.f134874g, ht4.f134874g);
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
                aVar.mo74318e(2, this.f134871d);
                aVar.mo74318e(3, this.f134872e);
                aVar.mo74320g(4, 8, this.f134873f);
                String str = this.f134874g;
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
            int e = i2 + C52418a.m58678e(2, this.f134871d) + C52418a.m58678e(3, this.f134872e) + C52418a.m58680g(4, 8, this.f134873f);
            String str2 = this.f134874g;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
        } else if (i == 2) {
            this.f134873f.clear();
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
            ht4 ht4 = objArr[1];
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
                    ht4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ht4.f134871d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ht4.f134872e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv32 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv32.mo73356d(bArr2);
                    }
                    ht4.f134873f.add(rv32);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ht4.f134874g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
