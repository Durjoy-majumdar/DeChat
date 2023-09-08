package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pj2 */
public class C50839pj2 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50265li> f139790d = new LinkedList<>();

    /* renamed from: e */
    public int f139791e;

    /* renamed from: f */
    public LinkedList<String> f139792f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50839pj2)) {
            return false;
        }
        C50839pj2 pj22 = (C50839pj2) aVar;
        return C46238a.m51546a(this.BaseResponse, pj22.BaseResponse) && C46238a.m51546a(this.f139790d, pj22.f139790d) && C46238a.m51546a(Integer.valueOf(this.f139791e), Integer.valueOf(pj22.f139791e)) && C46238a.m51546a(this.f139792f, pj22.f139792f);
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
                aVar.mo74320g(2, 8, this.f139790d);
                aVar.mo74318e(3, this.f139791e);
                aVar.mo74320g(4, 1, this.f139792f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f139790d) + C52418a.m58678e(3, this.f139791e) + C52418a.m58680g(4, 1, this.f139792f);
        } else if (i == 2) {
            this.f139790d.clear();
            this.f139792f.clear();
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
            C50839pj2 pj22 = objArr[1];
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
                    pj22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50265li liVar = new C50265li();
                    if (bArr2 != null && bArr2.length > 0) {
                        liVar.parseFrom(bArr2);
                    }
                    pj22.f139790d.add(liVar);
                }
                return 0;
            } else if (intValue == 3) {
                pj22.f139791e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pj22.f139792f.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
