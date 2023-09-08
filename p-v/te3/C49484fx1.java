package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fx1 */
public class C49484fx1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<String> f133725d = new LinkedList<>();

    /* renamed from: e */
    public int f133726e;

    /* renamed from: f */
    public int f133727f;

    /* renamed from: g */
    public int f133728g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49484fx1)) {
            return false;
        }
        C49484fx1 fx12 = (C49484fx1) aVar;
        return C46238a.m51546a(this.BaseResponse, fx12.BaseResponse) && C46238a.m51546a(this.f133725d, fx12.f133725d) && C46238a.m51546a(Integer.valueOf(this.f133726e), Integer.valueOf(fx12.f133726e)) && C46238a.m51546a(Integer.valueOf(this.f133727f), Integer.valueOf(fx12.f133727f)) && C46238a.m51546a(Integer.valueOf(this.f133728g), Integer.valueOf(fx12.f133728g));
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
                aVar.mo74320g(2, 1, this.f133725d);
                aVar.mo74318e(3, this.f133726e);
                aVar.mo74318e(4, this.f133727f);
                aVar.mo74318e(5, this.f133728g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.f133725d) + C52418a.m58678e(3, this.f133726e) + C52418a.m58678e(4, this.f133727f) + C52418a.m58678e(5, this.f133728g);
        } else if (i == 2) {
            this.f133725d.clear();
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
            C49484fx1 fx12 = objArr[1];
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
                    fx12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fx12.f133725d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                fx12.f133726e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                fx12.f133727f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                fx12.f133728g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
