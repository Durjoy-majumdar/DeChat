package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fx3 */
public class C49485fx3 extends C49335eu3 {

    /* renamed from: d */
    public C49697hf2 f133729d;

    /* renamed from: e */
    public C49840if2 f133730e;

    /* renamed from: f */
    public String f133731f;

    /* renamed from: g */
    public C50052jy2 f133732g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49485fx3)) {
            return false;
        }
        C49485fx3 fx32 = (C49485fx3) aVar;
        return C46238a.m51546a(this.BaseResponse, fx32.BaseResponse) && C46238a.m51546a(this.f133729d, fx32.f133729d) && C46238a.m51546a(this.f133730e, fx32.f133730e) && C46238a.m51546a(this.f133731f, fx32.f133731f) && C46238a.m51546a(this.f133732g, fx32.f133732g);
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
                C49697hf2 hf22 = this.f133729d;
                if (hf22 != null) {
                    aVar.mo74322i(2, hf22.computeSize());
                    this.f133729d.writeFields(aVar);
                }
                C49840if2 if22 = this.f133730e;
                if (if22 != null) {
                    aVar.mo74322i(3, if22.computeSize());
                    this.f133730e.writeFields(aVar);
                }
                String str = this.f133731f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                C50052jy2 jy22 = this.f133732g;
                if (jy22 != null) {
                    aVar.mo74322i(5, jy22.computeSize());
                    this.f133732g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49697hf2 hf23 = this.f133729d;
            if (hf23 != null) {
                i2 += C52418a.m58682i(2, hf23.computeSize());
            }
            C49840if2 if23 = this.f133730e;
            if (if23 != null) {
                i2 += C52418a.m58682i(3, if23.computeSize());
            }
            String str2 = this.f133731f;
            if (str2 != null) {
                i2 += C52418a.m58683j(4, str2);
            }
            C50052jy2 jy23 = this.f133732g;
            return jy23 != null ? i2 + C52418a.m58682i(5, jy23.computeSize()) : i2;
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
            C49485fx3 fx32 = objArr[1];
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
                    fx32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hf24.parseFrom(bArr2);
                    }
                    fx32.f133729d = hf24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49840if2 if24 = new C49840if2();
                    if (bArr3 != null && bArr3.length > 0) {
                        if24.parseFrom(bArr3);
                    }
                    fx32.f133730e = if24;
                }
                return 0;
            } else if (intValue == 4) {
                fx32.f133731f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50052jy2 jy24 = new C50052jy2();
                    if (bArr4 != null && bArr4.length > 0) {
                        jy24.parseFrom(bArr4);
                    }
                    fx32.f133732g = jy24;
                }
                return 0;
            }
        }
    }
}
