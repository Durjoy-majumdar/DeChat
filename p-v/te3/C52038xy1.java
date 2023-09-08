package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xy1 */
public class C52038xy1 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f145019d;

    /* renamed from: e */
    public LinkedList<C101787i40> f145020e = new LinkedList<>();

    /* renamed from: f */
    public int f145021f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52038xy1)) {
            return false;
        }
        C52038xy1 xy12 = (C52038xy1) aVar;
        return C46238a.m51546a(this.BaseResponse, xy12.BaseResponse) && C46238a.m51546a(this.f145019d, xy12.f145019d) && C46238a.m51546a(this.f145020e, xy12.f145020e) && C46238a.m51546a(Integer.valueOf(this.f145021f), Integer.valueOf(xy12.f145021f));
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
                C89349b bVar = this.f145019d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74320g(3, 8, this.f145020e);
                aVar.mo74318e(4, this.f145021f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f145019d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58680g(3, 8, this.f145020e) + C52418a.m58678e(4, this.f145021f);
        } else if (i == 2) {
            this.f145020e.clear();
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
            C52038xy1 xy12 = objArr[1];
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
                    xy12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xy12.f145019d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101787i40 i402 = new C101787i40();
                    if (bArr2 != null && bArr2.length > 0) {
                        i402.parseFrom(bArr2);
                    }
                    xy12.f145020e.add(i402);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xy12.f145021f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
