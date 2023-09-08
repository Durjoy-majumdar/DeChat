package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bh3 */
public class C48858bh3 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f131122d;

    /* renamed from: e */
    public g45 f131123e;

    /* renamed from: f */
    public C49851ii2 f131124f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48858bh3)) {
            return false;
        }
        C48858bh3 bh32 = (C48858bh3) aVar;
        return C46238a.m51546a(this.BaseResponse, bh32.BaseResponse) && C46238a.m51546a(this.f131122d, bh32.f131122d) && C46238a.m51546a(this.f131123e, bh32.f131123e) && C46238a.m51546a(this.f131124f, bh32.f131124f);
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
                C89349b bVar = this.f131122d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                g45 g45 = this.f131123e;
                if (g45 != null) {
                    aVar.mo74322i(3, g45.computeSize());
                    this.f131123e.writeFields(aVar);
                }
                C49851ii2 ii22 = this.f131124f;
                if (ii22 != null) {
                    aVar.mo74322i(100, ii22.computeSize());
                    this.f131124f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f131122d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            g45 g452 = this.f131123e;
            if (g452 != null) {
                i2 += C52418a.m58682i(3, g452.computeSize());
            }
            C49851ii2 ii23 = this.f131124f;
            return ii23 != null ? i2 + C52418a.m58682i(100, ii23.computeSize()) : i2;
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
            C48858bh3 bh32 = objArr[1];
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
                    bh32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bh32.f131122d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    g45 g453 = new g45();
                    if (bArr2 != null && bArr2.length > 0) {
                        g453.parseFrom(bArr2);
                    }
                    bh32.f131123e = g453;
                }
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49851ii2 ii24 = new C49851ii2();
                    if (bArr3 != null && bArr3.length > 0) {
                        ii24.parseFrom(bArr3);
                    }
                    bh32.f131124f = ii24;
                }
                return 0;
            }
        }
    }
}
