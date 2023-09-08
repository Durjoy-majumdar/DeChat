package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fo2 */
public class C49453fo2 extends C49335eu3 {

    /* renamed from: d */
    public String f133614d;

    /* renamed from: e */
    public int f133615e;

    /* renamed from: f */
    public LinkedList<C49174do2> f133616f = new LinkedList<>();

    /* renamed from: g */
    public int f133617g;

    /* renamed from: h */
    public LinkedList<C49174do2> f133618h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49453fo2)) {
            return false;
        }
        C49453fo2 fo22 = (C49453fo2) aVar;
        return C46238a.m51546a(this.BaseResponse, fo22.BaseResponse) && C46238a.m51546a(this.f133614d, fo22.f133614d) && C46238a.m51546a(Integer.valueOf(this.f133615e), Integer.valueOf(fo22.f133615e)) && C46238a.m51546a(this.f133616f, fo22.f133616f) && C46238a.m51546a(Integer.valueOf(this.f133617g), Integer.valueOf(fo22.f133617g)) && C46238a.m51546a(this.f133618h, fo22.f133618h);
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
                String str = this.f133614d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f133615e);
                aVar.mo74320g(4, 8, this.f133616f);
                aVar.mo74318e(5, this.f133617g);
                aVar.mo74320g(6, 8, this.f133618h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f133614d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f133615e) + C52418a.m58680g(4, 8, this.f133616f) + C52418a.m58678e(5, this.f133617g) + C52418a.m58680g(6, 8, this.f133618h);
        } else if (i == 2) {
            this.f133616f.clear();
            this.f133618h.clear();
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
            C49453fo2 fo22 = objArr[1];
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
                        fo22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fo22.f133614d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fo22.f133615e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49174do2 do22 = new C49174do2();
                        if (bArr2 != null && bArr2.length > 0) {
                            do22.parseFrom(bArr2);
                        }
                        fo22.f133616f.add(do22);
                    }
                    return 0;
                case 5:
                    fo22.f133617g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49174do2 do23 = new C49174do2();
                        if (bArr3 != null && bArr3.length > 0) {
                            do23.parseFrom(bArr3);
                        }
                        fo22.f133618h.add(do23);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
