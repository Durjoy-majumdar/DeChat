package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q82 */
public class C50927q82 extends C49335eu3 {

    /* renamed from: d */
    public boolean f140182d;

    /* renamed from: e */
    public LinkedList<C49930j14> f140183e = new LinkedList<>();

    /* renamed from: f */
    public boolean f140184f;

    /* renamed from: g */
    public LinkedList<C49930j14> f140185g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50927q82)) {
            return false;
        }
        C50927q82 q822 = (C50927q82) aVar;
        return C46238a.m51546a(this.BaseResponse, q822.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f140182d), Boolean.valueOf(q822.f140182d)) && C46238a.m51546a(this.f140183e, q822.f140183e) && C46238a.m51546a(Boolean.valueOf(this.f140184f), Boolean.valueOf(q822.f140184f)) && C46238a.m51546a(this.f140185g, q822.f140185g);
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
                aVar.mo74314a(2, this.f140182d);
                aVar.mo74320g(3, 8, this.f140183e);
                aVar.mo74314a(4, this.f140184f);
                aVar.mo74320g(5, 8, this.f140185g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f140182d) + C52418a.m58680g(3, 8, this.f140183e) + C52418a.m58674a(4, this.f140184f) + C52418a.m58680g(5, 8, this.f140185g);
        } else if (i == 2) {
            this.f140183e.clear();
            this.f140185g.clear();
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
            C50927q82 q822 = objArr[1];
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
                    q822.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                q822.f140182d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49930j14 j142 = new C49930j14();
                    if (bArr2 != null && bArr2.length > 0) {
                        j142.parseFrom(bArr2);
                    }
                    q822.f140183e.add(j142);
                }
                return 0;
            } else if (intValue == 4) {
                q822.f140184f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49930j14 j143 = new C49930j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j143.parseFrom(bArr3);
                    }
                    q822.f140185g.add(j143);
                }
                return 0;
            }
        }
    }
}
