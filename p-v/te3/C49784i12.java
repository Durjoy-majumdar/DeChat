package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i12 */
public class C49784i12 extends C49335eu3 {

    /* renamed from: d */
    public String f135023d;

    /* renamed from: e */
    public C49878io2 f135024e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49784i12)) {
            return false;
        }
        C49784i12 i122 = (C49784i12) aVar;
        return C46238a.m51546a(this.BaseResponse, i122.BaseResponse) && C46238a.m51546a(this.f135023d, i122.f135023d) && C46238a.m51546a(this.f135024e, i122.f135024e);
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
            String str = this.f135023d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C49878io2 io22 = this.f135024e;
            if (io22 != null) {
                aVar.mo74322i(3, io22.computeSize());
                this.f135024e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f135023d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C49878io2 io23 = this.f135024e;
            return io23 != null ? i2 + C52418a.m58682i(3, io23.computeSize()) : i2;
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
            C49784i12 i122 = objArr[1];
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
                    i122.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                i122.f135023d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49878io2 io24 = new C49878io2();
                    if (bArr2 != null && bArr2.length > 0) {
                        io24.parseFrom(bArr2);
                    }
                    i122.f135024e = io24;
                }
                return 0;
            }
        }
    }
}
