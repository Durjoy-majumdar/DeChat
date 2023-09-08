package yy1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: yy1.i */
public class C53647i extends C49335eu3 {

    /* renamed from: d */
    public String f150700d;

    /* renamed from: e */
    public C53641c f150701e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53647i)) {
            return false;
        }
        C53647i iVar = (C53647i) aVar;
        return C46238a.m51546a(this.BaseResponse, iVar.BaseResponse) && C46238a.m51546a(this.f150700d, iVar.f150700d) && C46238a.m51546a(this.f150701e, iVar.f150701e);
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
            String str = this.f150700d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C53641c cVar = this.f150701e;
            if (cVar != null) {
                aVar.mo74322i(3, cVar.computeSize());
                this.f150701e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f150700d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C53641c cVar2 = this.f150701e;
            return cVar2 != null ? i2 + C52418a.m58682i(3, cVar2.computeSize()) : i2;
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
            C53647i iVar = objArr[1];
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
                    iVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                iVar.f150700d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53641c cVar3 = new C53641c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar3.parseFrom(bArr2);
                    }
                    iVar.f150701e = cVar3;
                }
                return 0;
            }
        }
    }
}
