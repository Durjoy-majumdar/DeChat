package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uj */
public class C78003uj extends C49335eu3 {

    /* renamed from: d */
    public int f228302d;

    /* renamed from: e */
    public String f228303e;

    /* renamed from: f */
    public C77995sj f228304f;

    /* renamed from: g */
    public C77927fb0 f228305g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78003uj)) {
            return false;
        }
        C78003uj ujVar = (C78003uj) aVar;
        return C46238a.m51546a(this.BaseResponse, ujVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228302d), Integer.valueOf(ujVar.f228302d)) && C46238a.m51546a(this.f228303e, ujVar.f228303e) && C46238a.m51546a(this.f228304f, ujVar.f228304f) && C46238a.m51546a(this.f228305g, ujVar.f228305g);
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
                aVar.mo74318e(2, this.f228302d);
                String str = this.f228303e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C77995sj sjVar = this.f228304f;
                if (sjVar != null) {
                    aVar.mo74322i(4, sjVar.computeSize());
                    this.f228304f.writeFields(aVar);
                }
                C77927fb0 fb02 = this.f228305g;
                if (fb02 != null) {
                    aVar.mo74322i(5, fb02.computeSize());
                    this.f228305g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f228302d);
            String str2 = this.f228303e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C77995sj sjVar2 = this.f228304f;
            if (sjVar2 != null) {
                e += C52418a.m58682i(4, sjVar2.computeSize());
            }
            C77927fb0 fb03 = this.f228305g;
            return fb03 != null ? e + C52418a.m58682i(5, fb03.computeSize()) : e;
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
            C78003uj ujVar = objArr[1];
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
                    ujVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ujVar.f228302d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ujVar.f228303e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77995sj sjVar3 = new C77995sj();
                    if (bArr2 != null && bArr2.length > 0) {
                        sjVar3.parseFrom(bArr2);
                    }
                    ujVar.f228304f = sjVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C77927fb0 fb04 = new C77927fb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        fb04.parseFrom(bArr3);
                    }
                    ujVar.f228305g = fb04;
                }
                return 0;
            }
        }
    }
}
