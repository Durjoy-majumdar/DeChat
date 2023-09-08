package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.m */
public class C52433m extends C49335eu3 {

    /* renamed from: d */
    public int f146526d;

    /* renamed from: e */
    public String f146527e;

    /* renamed from: f */
    public C52425e f146528f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52433m)) {
            return false;
        }
        C52433m mVar = (C52433m) aVar;
        return C46238a.m51546a(this.BaseResponse, mVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f146526d), Integer.valueOf(mVar.f146526d)) && C46238a.m51546a(this.f146527e, mVar.f146527e) && C46238a.m51546a(this.f146528f, mVar.f146528f);
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
            aVar.mo74318e(2, this.f146526d);
            String str = this.f146527e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C52425e eVar = this.f146528f;
            if (eVar != null) {
                aVar.mo74322i(4, eVar.computeSize());
                this.f146528f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146526d);
            String str2 = this.f146527e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C52425e eVar2 = this.f146528f;
            return eVar2 != null ? e + C52418a.m58682i(4, eVar2.computeSize()) : e;
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
            C52433m mVar = objArr[1];
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
                    mVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mVar.f146526d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                mVar.f146527e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52425e eVar3 = new C52425e();
                    if (bArr2 != null && bArr2.length > 0) {
                        eVar3.parseFrom(bArr2);
                    }
                    mVar.f146528f = eVar3;
                }
                return 0;
            }
        }
    }
}
