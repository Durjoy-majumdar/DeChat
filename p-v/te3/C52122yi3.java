package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yi3 */
public class C52122yi3 extends C49335eu3 {

    /* renamed from: d */
    public int f145313d;

    /* renamed from: e */
    public long f145314e;

    /* renamed from: f */
    public LinkedList<C50550ni3> f145315f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C50550ni3> f145316g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52122yi3)) {
            return false;
        }
        C52122yi3 yi32 = (C52122yi3) aVar;
        return C46238a.m51546a(this.BaseResponse, yi32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f145313d), Integer.valueOf(yi32.f145313d)) && C46238a.m51546a(Long.valueOf(this.f145314e), Long.valueOf(yi32.f145314e)) && C46238a.m51546a(this.f145315f, yi32.f145315f) && C46238a.m51546a(this.f145316g, yi32.f145316g);
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
                aVar.mo74318e(2, this.f145313d);
                aVar.mo74321h(3, this.f145314e);
                aVar.mo74320g(4, 8, this.f145315f);
                aVar.mo74320g(5, 8, this.f145316g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f145313d) + C52418a.m58681h(3, this.f145314e) + C52418a.m58680g(4, 8, this.f145315f) + C52418a.m58680g(5, 8, this.f145316g);
        } else if (i == 2) {
            this.f145315f.clear();
            this.f145316g.clear();
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
            C52122yi3 yi32 = objArr[1];
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
                    yi32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                yi32.f145313d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                yi32.f145314e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50550ni3 ni32 = new C50550ni3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ni32.parseFrom(bArr2);
                    }
                    yi32.f145315f.add(ni32);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50550ni3 ni33 = new C50550ni3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ni33.parseFrom(bArr3);
                    }
                    yi32.f145316g.add(ni33);
                }
                return 0;
            }
        }
    }
}
