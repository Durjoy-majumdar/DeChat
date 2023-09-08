package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lj2 */
public class C50273lj2 extends C49335eu3 {

    /* renamed from: d */
    public String f137457d;

    /* renamed from: e */
    public LinkedList<C51933x7> f137458e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C51246sh3> f137459f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50273lj2)) {
            return false;
        }
        C50273lj2 lj22 = (C50273lj2) aVar;
        return C46238a.m51546a(this.BaseResponse, lj22.BaseResponse) && C46238a.m51546a(this.f137457d, lj22.f137457d) && C46238a.m51546a(this.f137458e, lj22.f137458e) && C46238a.m51546a(this.f137459f, lj22.f137459f);
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
                String str = this.f137457d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 8, this.f137458e);
                aVar.mo74320g(4, 8, this.f137459f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f137457d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 8, this.f137458e) + C52418a.m58680g(4, 8, this.f137459f);
        } else if (i == 2) {
            this.f137458e.clear();
            this.f137459f.clear();
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
            C50273lj2 lj22 = objArr[1];
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
                    lj22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                lj22.f137457d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51933x7 x7Var = new C51933x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var.parseFrom(bArr2);
                    }
                    lj22.f137458e.add(x7Var);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51246sh3 sh32 = new C51246sh3();
                    if (bArr3 != null && bArr3.length > 0) {
                        sh32.parseFrom(bArr3);
                    }
                    lj22.f137459f.add(sh32);
                }
                return 0;
            }
        }
    }
}
