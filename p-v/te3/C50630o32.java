package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o32 */
public class C50630o32 extends C49335eu3 {

    /* renamed from: d */
    public int f138928d;

    /* renamed from: e */
    public LinkedList<C77924es2> f138929e = new LinkedList<>();

    /* renamed from: f */
    public String f138930f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50630o32)) {
            return false;
        }
        C50630o32 o322 = (C50630o32) aVar;
        return C46238a.m51546a(this.BaseResponse, o322.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138928d), Integer.valueOf(o322.f138928d)) && C46238a.m51546a(this.f138929e, o322.f138929e) && C46238a.m51546a(this.f138930f, o322.f138930f);
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
                aVar.mo74318e(2, this.f138928d);
                aVar.mo74320g(3, 8, this.f138929e);
                String str = this.f138930f;
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
            int e = i2 + C52418a.m58678e(2, this.f138928d) + C52418a.m58680g(3, 8, this.f138929e);
            String str2 = this.f138930f;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            this.f138929e.clear();
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
            C50630o32 o322 = objArr[1];
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
                    o322.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                o322.f138928d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77924es2 es22 = new C77924es2();
                    if (bArr2 != null && bArr2.length > 0) {
                        es22.parseFrom(bArr2);
                    }
                    o322.f138929e.add(es22);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                o322.f138930f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
