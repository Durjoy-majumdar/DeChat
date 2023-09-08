package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nz1 */
public class C50614nz1 extends C49335eu3 {

    /* renamed from: d */
    public int f138856d;

    /* renamed from: e */
    public LinkedList<C49109d80> f138857e = new LinkedList<>();

    /* renamed from: f */
    public int f138858f;

    /* renamed from: g */
    public String f138859g;

    /* renamed from: h */
    public int f138860h;

    /* renamed from: i */
    public int f138861i;

    /* renamed from: j */
    public C101792j80 f138862j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50614nz1)) {
            return false;
        }
        C50614nz1 nz12 = (C50614nz1) aVar;
        return C46238a.m51546a(this.BaseResponse, nz12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138856d), Integer.valueOf(nz12.f138856d)) && C46238a.m51546a(this.f138857e, nz12.f138857e) && C46238a.m51546a(Integer.valueOf(this.f138858f), Integer.valueOf(nz12.f138858f)) && C46238a.m51546a(this.f138859g, nz12.f138859g) && C46238a.m51546a(Integer.valueOf(this.f138860h), Integer.valueOf(nz12.f138860h)) && C46238a.m51546a(Integer.valueOf(this.f138861i), Integer.valueOf(nz12.f138861i)) && C46238a.m51546a(this.f138862j, nz12.f138862j);
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
                aVar.mo74318e(2, this.f138856d);
                aVar.mo74320g(3, 8, this.f138857e);
                aVar.mo74318e(4, this.f138858f);
                String str = this.f138859g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74318e(6, this.f138860h);
                aVar.mo74318e(8, this.f138861i);
                C101792j80 j802 = this.f138862j;
                if (j802 != null) {
                    aVar.mo74322i(9, j802.computeSize());
                    this.f138862j.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138856d) + C52418a.m58680g(3, 8, this.f138857e) + C52418a.m58678e(4, this.f138858f);
            String str2 = this.f138859g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            int e2 = e + C52418a.m58678e(6, this.f138860h) + C52418a.m58678e(8, this.f138861i);
            C101792j80 j803 = this.f138862j;
            return j803 != null ? e2 + C52418a.m58682i(9, j803.computeSize()) : e2;
        } else if (i == 2) {
            this.f138857e.clear();
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
            C50614nz1 nz12 = objArr[1];
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
                        nz12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    nz12.f138856d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49109d80 d802 = new C49109d80();
                        if (bArr2 != null && bArr2.length > 0) {
                            d802.parseFrom(bArr2);
                        }
                        nz12.f138857e.add(d802);
                    }
                    return 0;
                case 4:
                    nz12.f138858f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nz12.f138859g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    nz12.f138860h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    nz12.f138861i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101792j80 j804 = new C101792j80();
                        if (bArr3 != null && bArr3.length > 0) {
                            j804.parseFrom(bArr3);
                        }
                        nz12.f138862j = j804;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
