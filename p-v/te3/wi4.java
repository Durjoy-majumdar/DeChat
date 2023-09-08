package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wi4 extends C49335eu3 {

    /* renamed from: d */
    public boolean f186127d;

    /* renamed from: e */
    public C64454it2 f186128e;

    /* renamed from: f */
    public C64478jt2 f186129f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wi4)) {
            return false;
        }
        wi4 wi4 = (wi4) aVar;
        return C46238a.m51546a(this.BaseResponse, wi4.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f186127d), Boolean.valueOf(wi4.f186127d)) && C46238a.m51546a(this.f186128e, wi4.f186128e) && C46238a.m51546a(this.f186129f, wi4.f186129f);
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
            aVar.mo74314a(2, this.f186127d);
            C64454it2 it22 = this.f186128e;
            if (it22 != null) {
                aVar.mo74322i(3, it22.computeSize());
                this.f186128e.writeFields(aVar);
            }
            C64478jt2 jt22 = this.f186129f;
            if (jt22 != null) {
                aVar.mo74322i(4, jt22.computeSize());
                this.f186129f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f186127d);
            C64454it2 it23 = this.f186128e;
            if (it23 != null) {
                a += C52418a.m58682i(3, it23.computeSize());
            }
            C64478jt2 jt23 = this.f186129f;
            return jt23 != null ? a + C52418a.m58682i(4, jt23.computeSize()) : a;
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
            wi4 wi4 = objArr[1];
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
                    wi4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                wi4.f186127d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64454it2 it24 = new C64454it2();
                    if (bArr2 != null && bArr2.length > 0) {
                        it24.parseFrom(bArr2);
                    }
                    wi4.f186128e = it24;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64478jt2 jt24 = new C64478jt2();
                    if (bArr3 != null && bArr3.length > 0) {
                        jt24.parseFrom(bArr3);
                    }
                    wi4.f186129f = jt24;
                }
                return 0;
            }
        }
    }
}
