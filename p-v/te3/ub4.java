package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ub4 extends C49335eu3 {

    /* renamed from: d */
    public int f142725d;

    /* renamed from: e */
    public LinkedList<hc4> f142726e = new LinkedList<>();

    /* renamed from: f */
    public long f142727f;

    /* renamed from: g */
    public int f142728g;

    /* renamed from: h */
    public int f142729h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ub4)) {
            return false;
        }
        ub4 ub4 = (ub4) aVar;
        return C46238a.m51546a(this.BaseResponse, ub4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142725d), Integer.valueOf(ub4.f142725d)) && C46238a.m51546a(this.f142726e, ub4.f142726e) && C46238a.m51546a(Long.valueOf(this.f142727f), Long.valueOf(ub4.f142727f)) && C46238a.m51546a(Integer.valueOf(this.f142728g), Integer.valueOf(ub4.f142728g)) && C46238a.m51546a(Integer.valueOf(this.f142729h), Integer.valueOf(ub4.f142729h));
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
                aVar.mo74318e(2, this.f142725d);
                aVar.mo74320g(3, 8, this.f142726e);
                aVar.mo74321h(4, this.f142727f);
                aVar.mo74318e(5, this.f142728g);
                aVar.mo74318e(6, this.f142729h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f142725d) + C52418a.m58680g(3, 8, this.f142726e) + C52418a.m58681h(4, this.f142727f) + C52418a.m58678e(5, this.f142728g) + C52418a.m58678e(6, this.f142729h);
        } else if (i == 2) {
            this.f142726e.clear();
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
            ub4 ub4 = objArr[1];
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
                        ub4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ub4.f142725d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        hc4 hc4 = new hc4();
                        if (bArr2 != null && bArr2.length > 0) {
                            hc4.parseFrom(bArr2);
                        }
                        ub4.f142726e.add(hc4);
                    }
                    return 0;
                case 4:
                    ub4.f142727f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ub4.f142728g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ub4.f142729h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
