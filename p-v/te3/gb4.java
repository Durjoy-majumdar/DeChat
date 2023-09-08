package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class gb4 extends C49335eu3 {

    /* renamed from: d */
    public int f133954d;

    /* renamed from: e */
    public long f133955e;

    /* renamed from: f */
    public int f133956f;

    /* renamed from: g */
    public LinkedList<C48755as> f133957g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gb4)) {
            return false;
        }
        gb4 gb4 = (gb4) aVar;
        return C46238a.m51546a(this.BaseResponse, gb4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133954d), Integer.valueOf(gb4.f133954d)) && C46238a.m51546a(Long.valueOf(this.f133955e), Long.valueOf(gb4.f133955e)) && C46238a.m51546a(Integer.valueOf(this.f133956f), Integer.valueOf(gb4.f133956f)) && C46238a.m51546a(this.f133957g, gb4.f133957g);
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
                aVar.mo74318e(2, this.f133954d);
                aVar.mo74321h(3, this.f133955e);
                aVar.mo74318e(4, this.f133956f);
                aVar.mo74320g(5, 8, this.f133957g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f133954d) + C52418a.m58681h(3, this.f133955e) + C52418a.m58678e(4, this.f133956f) + C52418a.m58680g(5, 8, this.f133957g);
        } else if (i == 2) {
            this.f133957g.clear();
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
            gb4 gb4 = objArr[1];
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
                    gb4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                gb4.f133954d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                gb4.f133955e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                gb4.f133956f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48755as asVar = new C48755as();
                    if (bArr2 != null && bArr2.length > 0) {
                        asVar.parseFrom(bArr2);
                    }
                    gb4.f133957g.add(asVar);
                }
                return 0;
            }
        }
    }
}
