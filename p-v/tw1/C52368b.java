package tw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import v41.C52748g;
import z14.C53733a;

/* renamed from: tw1.b */
public class C52368b extends C49335eu3 {

    /* renamed from: d */
    public int f146354d;

    /* renamed from: e */
    public long f146355e;

    /* renamed from: f */
    public C52748g f146356f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52368b)) {
            return false;
        }
        C52368b bVar = (C52368b) aVar;
        return C46238a.m51546a(this.BaseResponse, bVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f146354d), Integer.valueOf(bVar.f146354d)) && C46238a.m51546a(Long.valueOf(this.f146355e), Long.valueOf(bVar.f146355e)) && C46238a.m51546a(this.f146356f, bVar.f146356f);
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
                aVar.mo74318e(2, this.f146354d);
                aVar.mo74321h(3, this.f146355e);
                C52748g gVar = this.f146356f;
                if (gVar != null) {
                    aVar.mo74322i(4, gVar.computeSize());
                    this.f146356f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f146354d) + C52418a.m58681h(3, this.f146355e);
            C52748g gVar2 = this.f146356f;
            return gVar2 != null ? e + C52418a.m58682i(4, gVar2.computeSize()) : e;
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
            C52368b bVar = objArr[1];
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
                    bVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bVar.f146354d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                bVar.f146355e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52748g gVar3 = new C52748g();
                    if (bArr2 != null && bArr2.length > 0) {
                        gVar3.parseFrom(bArr2);
                    }
                    bVar.f146356f = gVar3;
                }
                return 0;
            }
        }
    }
}
