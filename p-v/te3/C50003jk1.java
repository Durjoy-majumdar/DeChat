package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jk1 */
public class C50003jk1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<sd4> f136168d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f136169e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50003jk1)) {
            return false;
        }
        C50003jk1 jk12 = (C50003jk1) aVar;
        return C46238a.m51546a(this.BaseResponse, jk12.BaseResponse) && C46238a.m51546a(this.f136168d, jk12.f136168d) && C46238a.m51546a(this.f136169e, jk12.f136169e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f136168d);
            C89349b bVar = this.f136169e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f136168d);
            C89349b bVar2 = this.f136169e;
            return bVar2 != null ? g + C52418a.m58675b(3, bVar2) : g;
        } else if (i == 2) {
            this.f136168d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50003jk1 jk12 = objArr[1];
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
                    jk12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    sd4 sd4 = new sd4();
                    if (bArr2 != null && bArr2.length > 0) {
                        sd4.parseFrom(bArr2);
                    }
                    jk12.f136168d.add(sd4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                jk12.f136169e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
