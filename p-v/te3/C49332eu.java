package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eu */
public class C49332eu extends C49335eu3 {

    /* renamed from: d */
    public int f133118d;

    /* renamed from: e */
    public String f133119e;

    /* renamed from: f */
    public long f133120f;

    /* renamed from: g */
    public C50059k00 f133121g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49332eu)) {
            return false;
        }
        C49332eu euVar = (C49332eu) aVar;
        return C46238a.m51546a(this.BaseResponse, euVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133118d), Integer.valueOf(euVar.f133118d)) && C46238a.m51546a(this.f133119e, euVar.f133119e) && C46238a.m51546a(Long.valueOf(this.f133120f), Long.valueOf(euVar.f133120f)) && C46238a.m51546a(this.f133121g, euVar.f133121g);
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
                aVar.mo74318e(2, this.f133118d);
                String str = this.f133119e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74321h(4, this.f133120f);
                C50059k00 k002 = this.f133121g;
                if (k002 != null) {
                    aVar.mo74322i(5, k002.computeSize());
                    this.f133121g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133118d);
            String str2 = this.f133119e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int h = e + C52418a.m58681h(4, this.f133120f);
            C50059k00 k003 = this.f133121g;
            return k003 != null ? h + C52418a.m58682i(5, k003.computeSize()) : h;
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
            C49332eu euVar = objArr[1];
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
                    euVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                euVar.f133118d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                euVar.f133119e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                euVar.f133120f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50059k00 k004 = new C50059k00();
                    if (bArr2 != null && bArr2.length > 0) {
                        k004.parseFrom(bArr2);
                    }
                    euVar.f133121g = k004;
                }
                return 0;
            }
        }
    }
}
