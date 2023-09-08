package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ju4 extends C49335eu3 {

    /* renamed from: d */
    public long f136346d;

    /* renamed from: e */
    public long f136347e;

    /* renamed from: f */
    public LinkedList<au4> f136348f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ju4)) {
            return false;
        }
        ju4 ju4 = (ju4) aVar;
        return C46238a.m51546a(this.BaseResponse, ju4.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f136346d), Long.valueOf(ju4.f136346d)) && C46238a.m51546a(Long.valueOf(this.f136347e), Long.valueOf(ju4.f136347e)) && C46238a.m51546a(this.f136348f, ju4.f136348f);
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
                aVar.mo74321h(2, this.f136346d);
                aVar.mo74321h(3, this.f136347e);
                aVar.mo74320g(4, 8, this.f136348f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f136346d) + C52418a.m58681h(3, this.f136347e) + C52418a.m58680g(4, 8, this.f136348f);
        } else if (i == 2) {
            this.f136348f.clear();
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
            ju4 ju4 = objArr[1];
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
                    ju4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ju4.f136346d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                ju4.f136347e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    au4 au4 = new au4();
                    if (bArr2 != null && bArr2.length > 0) {
                        au4.parseFrom(bArr2);
                    }
                    ju4.f136348f.add(au4);
                }
                return 0;
            }
        }
    }
}
