package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class vp4 extends C49335eu3 {

    /* renamed from: d */
    public String f143617d;

    /* renamed from: e */
    public C49510g33 f143618e;

    /* renamed from: f */
    public int f143619f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vp4)) {
            return false;
        }
        vp4 vp4 = (vp4) aVar;
        return C46238a.m51546a(this.BaseResponse, vp4.BaseResponse) && C46238a.m51546a(this.f143617d, vp4.f143617d) && C46238a.m51546a(this.f143618e, vp4.f143618e) && C46238a.m51546a(Integer.valueOf(this.f143619f), Integer.valueOf(vp4.f143619f));
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
                String str = this.f143617d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C49510g33 g332 = this.f143618e;
                if (g332 != null) {
                    aVar.mo74322i(3, g332.computeSize());
                    this.f143618e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f143619f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f143617d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C49510g33 g333 = this.f143618e;
            if (g333 != null) {
                i2 += C52418a.m58682i(3, g333.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f143619f);
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
            vp4 vp4 = objArr[1];
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
                    vp4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                vp4.f143617d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49510g33 g334 = new C49510g33();
                    if (bArr2 != null && bArr2.length > 0) {
                        g334.parseFrom(bArr2);
                    }
                    vp4.f143618e = g334;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                vp4.f143619f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
