package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class f64 extends C49335eu3 {

    /* renamed from: d */
    public h64 f133319d;

    /* renamed from: e */
    public g84 f133320e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof f64)) {
            return false;
        }
        f64 f64 = (f64) aVar;
        return C46238a.m51546a(this.BaseResponse, f64.BaseResponse) && C46238a.m51546a(this.f133319d, f64.f133319d) && C46238a.m51546a(this.f133320e, f64.f133320e);
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
                h64 h64 = this.f133319d;
                if (h64 != null) {
                    aVar.mo74322i(2, h64.computeSize());
                    this.f133319d.writeFields(aVar);
                }
                g84 g84 = this.f133320e;
                if (g84 != null) {
                    aVar.mo74322i(3, g84.computeSize());
                    this.f133320e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            h64 h642 = this.f133319d;
            if (h642 != null) {
                i2 += C52418a.m58682i(2, h642.computeSize());
            }
            g84 g842 = this.f133320e;
            return g842 != null ? i2 + C52418a.m58682i(3, g842.computeSize()) : i2;
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
            f64 f64 = objArr[1];
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
                    f64.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    h64 h643 = new h64();
                    if (bArr2 != null && bArr2.length > 0) {
                        h643.parseFrom(bArr2);
                    }
                    f64.f133319d = h643;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    g84 g843 = new g84();
                    if (bArr3 != null && bArr3.length > 0) {
                        g843.parseFrom(bArr3);
                    }
                    f64.f133320e = g843;
                }
                return 0;
            }
        }
    }
}
