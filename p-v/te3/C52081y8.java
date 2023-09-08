package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y8 */
public class C52081y8 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<String> f145166d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C101800k70> f145167e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52081y8)) {
            return false;
        }
        C52081y8 y8Var = (C52081y8) aVar;
        return C46238a.m51546a(this.BaseResponse, y8Var.BaseResponse) && C46238a.m51546a(this.f145166d, y8Var.f145166d) && C46238a.m51546a(this.f145167e, y8Var.f145167e);
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
                aVar.mo74320g(2, 1, this.f145166d);
                aVar.mo74320g(3, 8, this.f145167e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.f145166d) + C52418a.m58680g(3, 8, this.f145167e);
        } else if (i == 2) {
            this.f145166d.clear();
            this.f145167e.clear();
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
            C52081y8 y8Var = objArr[1];
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
                    y8Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                y8Var.f145166d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101800k70 k702 = new C101800k70();
                    if (bArr2 != null && bArr2.length > 0) {
                        k702.parseFrom(bArr2);
                    }
                    y8Var.f145167e.add(k702);
                }
                return 0;
            }
        }
    }
}
