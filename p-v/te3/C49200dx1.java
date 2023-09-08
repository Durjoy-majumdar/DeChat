package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dx1 */
public class C49200dx1 extends C49335eu3 {

    /* renamed from: d */
    public int f132559d;

    /* renamed from: e */
    public String f132560e;

    /* renamed from: f */
    public C22514mn f132561f;

    /* renamed from: g */
    public int f132562g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49200dx1)) {
            return false;
        }
        C49200dx1 dx12 = (C49200dx1) aVar;
        return C46238a.m51546a(this.BaseResponse, dx12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132559d), Integer.valueOf(dx12.f132559d)) && C46238a.m51546a(this.f132560e, dx12.f132560e) && C46238a.m51546a(this.f132561f, dx12.f132561f) && C46238a.m51546a(Integer.valueOf(this.f132562g), Integer.valueOf(dx12.f132562g));
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
                aVar.mo74318e(2, this.f132559d);
                String str = this.f132560e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C22514mn mnVar = this.f132561f;
                if (mnVar != null) {
                    aVar.mo74322i(4, mnVar.computeSize());
                    this.f132561f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f132562g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132559d);
            String str2 = this.f132560e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C22514mn mnVar2 = this.f132561f;
            if (mnVar2 != null) {
                e += C52418a.m58682i(4, mnVar2.computeSize());
            }
            return e + C52418a.m58678e(5, this.f132562g);
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
            C49200dx1 dx12 = objArr[1];
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
                    dx12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dx12.f132559d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                dx12.f132560e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C22514mn mnVar3 = new C22514mn();
                    if (bArr2 != null && bArr2.length > 0) {
                        mnVar3.parseFrom(bArr2);
                    }
                    dx12.f132561f = mnVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dx12.f132562g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
