package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nz4 extends C49335eu3 {

    /* renamed from: d */
    public oz4 f138864d;

    /* renamed from: e */
    public oz4 f138865e;

    /* renamed from: f */
    public oz4 f138866f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nz4)) {
            return false;
        }
        nz4 nz4 = (nz4) aVar;
        return C46238a.m51546a(this.BaseResponse, nz4.BaseResponse) && C46238a.m51546a(this.f138864d, nz4.f138864d) && C46238a.m51546a(this.f138865e, nz4.f138865e) && C46238a.m51546a(this.f138866f, nz4.f138866f);
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
            oz4 oz4 = this.f138864d;
            if (oz4 != null) {
                aVar.mo74322i(2, oz4.computeSize());
                this.f138864d.writeFields(aVar);
            }
            oz4 oz42 = this.f138865e;
            if (oz42 != null) {
                aVar.mo74322i(3, oz42.computeSize());
                this.f138865e.writeFields(aVar);
            }
            oz4 oz43 = this.f138866f;
            if (oz43 != null) {
                aVar.mo74322i(4, oz43.computeSize());
                this.f138866f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            oz4 oz44 = this.f138864d;
            if (oz44 != null) {
                i2 += C52418a.m58682i(2, oz44.computeSize());
            }
            oz4 oz45 = this.f138865e;
            if (oz45 != null) {
                i2 += C52418a.m58682i(3, oz45.computeSize());
            }
            oz4 oz46 = this.f138866f;
            return oz46 != null ? i2 + C52418a.m58682i(4, oz46.computeSize()) : i2;
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
            nz4 nz4 = objArr[1];
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
                    nz4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    oz4 oz47 = new oz4();
                    if (bArr2 != null && bArr2.length > 0) {
                        oz47.parseFrom(bArr2);
                    }
                    nz4.f138864d = oz47;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    oz4 oz48 = new oz4();
                    if (bArr3 != null && bArr3.length > 0) {
                        oz48.parseFrom(bArr3);
                    }
                    nz4.f138865e = oz48;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    oz4 oz49 = new oz4();
                    if (bArr4 != null && bArr4.length > 0) {
                        oz49.parseFrom(bArr4);
                    }
                    nz4.f138866f = oz49;
                }
                return 0;
            }
        }
    }
}
