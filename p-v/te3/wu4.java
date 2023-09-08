package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class wu4 extends C49335eu3 {

    /* renamed from: d */
    public int f144296d;

    /* renamed from: e */
    public long f144297e;

    /* renamed from: f */
    public int f144298f;

    /* renamed from: g */
    public int f144299g;

    /* renamed from: h */
    public int f144300h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wu4)) {
            return false;
        }
        wu4 wu4 = (wu4) aVar;
        return C46238a.m51546a(this.BaseResponse, wu4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144296d), Integer.valueOf(wu4.f144296d)) && C46238a.m51546a(Long.valueOf(this.f144297e), Long.valueOf(wu4.f144297e)) && C46238a.m51546a(Integer.valueOf(this.f144298f), Integer.valueOf(wu4.f144298f)) && C46238a.m51546a(Integer.valueOf(this.f144299g), Integer.valueOf(wu4.f144299g)) && C46238a.m51546a(Integer.valueOf(this.f144300h), Integer.valueOf(wu4.f144300h));
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
                aVar.mo74318e(2, this.f144296d);
                aVar.mo74321h(3, this.f144297e);
                aVar.mo74318e(4, this.f144298f);
                aVar.mo74318e(5, this.f144299g);
                aVar.mo74318e(6, this.f144300h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f144296d) + C52418a.m58681h(3, this.f144297e) + C52418a.m58678e(4, this.f144298f) + C52418a.m58678e(5, this.f144299g) + C52418a.m58678e(6, this.f144300h);
        } else if (i == 2) {
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
            wu4 wu4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        wu4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    wu4.f144296d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wu4.f144297e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    wu4.f144298f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wu4.f144299g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wu4.f144300h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
