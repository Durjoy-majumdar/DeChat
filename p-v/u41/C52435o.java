package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.o */
public class C52435o extends C49335eu3 {

    /* renamed from: d */
    public C52423c f146533d;

    /* renamed from: e */
    public LinkedList<C52445y> f146534e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52435o)) {
            return false;
        }
        C52435o oVar = (C52435o) aVar;
        return C46238a.m51546a(this.BaseResponse, oVar.BaseResponse) && C46238a.m51546a(this.f146533d, oVar.f146533d) && C46238a.m51546a(this.f146534e, oVar.f146534e);
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
            C52423c cVar = this.f146533d;
            if (cVar != null) {
                aVar.mo74322i(2, cVar.computeSize());
                this.f146533d.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f146534e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52423c cVar2 = this.f146533d;
            if (cVar2 != null) {
                i2 += C52418a.m58682i(2, cVar2.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f146534e);
        } else if (i == 2) {
            this.f146534e.clear();
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
            C52435o oVar = objArr[1];
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
                    oVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52423c cVar3 = new C52423c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar3.parseFrom(bArr2);
                    }
                    oVar.f146533d = cVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52445y yVar = new C52445y();
                    if (bArr3 != null && bArr3.length > 0) {
                        yVar.parseFrom(bArr3);
                    }
                    oVar.f146534e.add(yVar);
                }
                return 0;
            }
        }
    }
}
