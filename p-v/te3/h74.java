package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h74 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f134477d;

    /* renamed from: e */
    public int f134478e;

    /* renamed from: f */
    public int f134479f;

    /* renamed from: g */
    public int f134480g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h74)) {
            return false;
        }
        h74 h74 = (h74) aVar;
        return C46238a.m51546a(this.BaseResponse, h74.BaseResponse) && C46238a.m51546a(this.f134477d, h74.f134477d) && C46238a.m51546a(Integer.valueOf(this.f134478e), Integer.valueOf(h74.f134478e)) && C46238a.m51546a(Integer.valueOf(this.f134479f), Integer.valueOf(h74.f134479f)) && C46238a.m51546a(Integer.valueOf(this.f134480g), Integer.valueOf(h74.f134480g));
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
            C89349b bVar = this.f134477d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f134478e);
            aVar.mo74318e(4, this.f134479f);
            aVar.mo74318e(5, this.f134480g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f134477d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58678e(3, this.f134478e) + C52418a.m58678e(4, this.f134479f) + C52418a.m58678e(5, this.f134480g);
        } else if (i == 2) {
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
            h74 h74 = objArr[1];
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
                    h74.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                h74.f134477d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                h74.f134478e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                h74.f134479f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                h74.f134480g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
