package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tn0 */
public class C51418tn0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48797b21> f142294d = new LinkedList<>();

    /* renamed from: e */
    public String f142295e;

    /* renamed from: f */
    public boolean f142296f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51418tn0)) {
            return false;
        }
        C51418tn0 tn02 = (C51418tn0) aVar;
        return C46238a.m51546a(this.BaseResponse, tn02.BaseResponse) && C46238a.m51546a(this.f142294d, tn02.f142294d) && C46238a.m51546a(this.f142295e, tn02.f142295e) && C46238a.m51546a(Boolean.valueOf(this.f142296f), Boolean.valueOf(tn02.f142296f));
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
            aVar.mo74320g(2, 8, this.f142294d);
            String str = this.f142295e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74314a(4, this.f142296f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f142294d);
            String str2 = this.f142295e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            return g + C52418a.m58674a(4, this.f142296f);
        } else if (i == 2) {
            this.f142294d.clear();
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
            C51418tn0 tn02 = objArr[1];
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
                    tn02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48797b21 b212 = new C48797b21();
                    if (bArr2 != null && bArr2.length > 0) {
                        b212.parseFrom(bArr2);
                    }
                    tn02.f142294d.add(b212);
                }
                return 0;
            } else if (intValue == 3) {
                tn02.f142295e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                tn02.f142296f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
