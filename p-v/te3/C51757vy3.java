package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vy3 */
public class C51757vy3 extends C49335eu3 {

    /* renamed from: d */
    public C50052jy2 f143773d;

    /* renamed from: e */
    public C49697hf2 f143774e;

    /* renamed from: f */
    public C49840if2 f143775f;

    /* renamed from: g */
    public String f143776g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51757vy3)) {
            return false;
        }
        C51757vy3 vy32 = (C51757vy3) aVar;
        return C46238a.m51546a(this.BaseResponse, vy32.BaseResponse) && C46238a.m51546a(this.f143773d, vy32.f143773d) && C46238a.m51546a(this.f143774e, vy32.f143774e) && C46238a.m51546a(this.f143775f, vy32.f143775f) && C46238a.m51546a(this.f143776g, vy32.f143776g);
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
                C50052jy2 jy22 = this.f143773d;
                if (jy22 != null) {
                    aVar.mo74322i(2, jy22.computeSize());
                    this.f143773d.writeFields(aVar);
                }
                C49697hf2 hf22 = this.f143774e;
                if (hf22 != null) {
                    aVar.mo74322i(3, hf22.computeSize());
                    this.f143774e.writeFields(aVar);
                }
                C49840if2 if22 = this.f143775f;
                if (if22 != null) {
                    aVar.mo74322i(4, if22.computeSize());
                    this.f143775f.writeFields(aVar);
                }
                String str = this.f143776g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50052jy2 jy23 = this.f143773d;
            if (jy23 != null) {
                i2 += C52418a.m58682i(2, jy23.computeSize());
            }
            C49697hf2 hf23 = this.f143774e;
            if (hf23 != null) {
                i2 += C52418a.m58682i(3, hf23.computeSize());
            }
            C49840if2 if23 = this.f143775f;
            if (if23 != null) {
                i2 += C52418a.m58682i(4, if23.computeSize());
            }
            String str2 = this.f143776g;
            return str2 != null ? i2 + C52418a.m58683j(5, str2) : i2;
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
            C51757vy3 vy32 = objArr[1];
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
                    vy32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50052jy2 jy24 = new C50052jy2();
                    if (bArr2 != null && bArr2.length > 0) {
                        jy24.parseFrom(bArr2);
                    }
                    vy32.f143773d = jy24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr3 != null && bArr3.length > 0) {
                        hf24.parseFrom(bArr3);
                    }
                    vy32.f143774e = hf24;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C49840if2 if24 = new C49840if2();
                    if (bArr4 != null && bArr4.length > 0) {
                        if24.parseFrom(bArr4);
                    }
                    vy32.f143775f = if24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vy32.f143776g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
