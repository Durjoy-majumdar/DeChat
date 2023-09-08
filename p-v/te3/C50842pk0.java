package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pk0 */
public class C50842pk0 extends C49335eu3 {

    /* renamed from: d */
    public C49710hi2 f139804d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50842pk0)) {
            return false;
        }
        C50842pk0 pk02 = (C50842pk0) aVar;
        return C46238a.m51546a(this.BaseResponse, pk02.BaseResponse) && C46238a.m51546a(this.f139804d, pk02.f139804d);
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
            C49710hi2 hi22 = this.f139804d;
            if (hi22 != null) {
                aVar.mo74322i(2, hi22.computeSize());
                this.f139804d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49710hi2 hi23 = this.f139804d;
            return hi23 != null ? i2 + C52418a.m58682i(2, hi23.computeSize()) : i2;
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
            C50842pk0 pk02 = objArr[1];
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
                    pk02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49710hi2 hi24 = new C49710hi2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hi24.parseFrom(bArr2);
                    }
                    pk02.f139804d = hi24;
                }
                return 0;
            }
        }
    }
}
