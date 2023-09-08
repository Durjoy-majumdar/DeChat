package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f23 */
public class C49368f23 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f133251d;

    /* renamed from: e */
    public LinkedList<C64482k23> f133252e = new LinkedList<>();

    /* renamed from: f */
    public int f133253f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49368f23)) {
            return false;
        }
        C49368f23 f232 = (C49368f23) aVar;
        return C46238a.m51546a(this.BaseResponse, f232.BaseResponse) && C46238a.m51546a(this.f133251d, f232.f133251d) && C46238a.m51546a(this.f133252e, f232.f133252e) && C46238a.m51546a(Integer.valueOf(this.f133253f), Integer.valueOf(f232.f133253f));
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
            C89349b bVar = this.f133251d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74320g(3, 8, this.f133252e);
            aVar.mo74318e(4, this.f133253f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f133251d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58680g(3, 8, this.f133252e) + C52418a.m58678e(4, this.f133253f);
        } else if (i == 2) {
            this.f133252e.clear();
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
            C49368f23 f232 = objArr[1];
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
                    f232.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                f232.f133251d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64482k23 k232 = new C64482k23();
                    if (bArr2 != null && bArr2.length > 0) {
                        k232.parseFrom(bArr2);
                    }
                    f232.f133252e.add(k232);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                f232.f133253f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
