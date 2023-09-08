package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sb2 */
public class C51221sb2 extends C49335eu3 {

    /* renamed from: d */
    public rt4 f141424d;

    /* renamed from: e */
    public C50147kl3 f141425e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51221sb2)) {
            return false;
        }
        C51221sb2 sb22 = (C51221sb2) aVar;
        return C46238a.m51546a(this.BaseResponse, sb22.BaseResponse) && C46238a.m51546a(this.f141424d, sb22.f141424d) && C46238a.m51546a(this.f141425e, sb22.f141425e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f141424d == null) {
                throw new C52419b("Not all required fields were included: TransRes");
            } else if (this.f141425e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                rt4 rt4 = this.f141424d;
                if (rt4 != null) {
                    aVar.mo74322i(2, rt4.computeSize());
                    this.f141424d.writeFields(aVar);
                }
                C50147kl3 kl32 = this.f141425e;
                if (kl32 != null) {
                    aVar.mo74322i(3, kl32.computeSize());
                    this.f141425e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: QueryCtx");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            rt4 rt42 = this.f141424d;
            if (rt42 != null) {
                i2 += C52418a.m58682i(2, rt42.computeSize());
            }
            C50147kl3 kl33 = this.f141425e;
            return kl33 != null ? i2 + C52418a.m58682i(3, kl33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f141424d == null) {
                throw new C52419b("Not all required fields were included: TransRes");
            } else if (this.f141425e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: QueryCtx");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51221sb2 sb22 = objArr[1];
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
                    sb22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    rt4 rt43 = new rt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        rt43.parseFrom(bArr2);
                    }
                    sb22.f141424d = rt43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50147kl3 kl34 = new C50147kl3();
                    if (bArr3 != null && bArr3.length > 0) {
                        kl34.parseFrom(bArr3);
                    }
                    sb22.f141425e = kl34;
                }
                return 0;
            }
        }
    }
}
