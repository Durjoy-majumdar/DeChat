package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m01 */
public class C50334m01 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48659a31> f137739d = new LinkedList<>();

    /* renamed from: e */
    public int f137740e;

    /* renamed from: f */
    public int f137741f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50334m01)) {
            return false;
        }
        C50334m01 m012 = (C50334m01) aVar;
        return C46238a.m51546a(this.BaseResponse, m012.BaseResponse) && C46238a.m51546a(this.f137739d, m012.f137739d) && C46238a.m51546a(Integer.valueOf(this.f137740e), Integer.valueOf(m012.f137740e)) && C46238a.m51546a(Integer.valueOf(this.f137741f), Integer.valueOf(m012.f137741f));
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
            aVar.mo74320g(2, 8, this.f137739d);
            aVar.mo74318e(3, this.f137740e);
            aVar.mo74318e(4, this.f137741f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f137739d) + C52418a.m58678e(3, this.f137740e) + C52418a.m58678e(4, this.f137741f);
        } else if (i == 2) {
            this.f137739d.clear();
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
            C50334m01 m012 = objArr[1];
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
                    m012.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48659a31 a312 = new C48659a31();
                    if (bArr2 != null && bArr2.length > 0) {
                        a312.parseFrom(bArr2);
                    }
                    m012.f137739d.add(a312);
                }
                return 0;
            } else if (intValue == 3) {
                m012.f137740e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                m012.f137741f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
