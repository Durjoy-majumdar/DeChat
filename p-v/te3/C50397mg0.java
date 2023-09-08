package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mg0 */
public class C50397mg0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51533ue1> f138011d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C49288ei0> f138012e = new LinkedList<>();

    /* renamed from: f */
    public int f138013f;

    /* renamed from: g */
    public int f138014g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50397mg0)) {
            return false;
        }
        C50397mg0 mg02 = (C50397mg0) aVar;
        return C46238a.m51546a(this.BaseResponse, mg02.BaseResponse) && C46238a.m51546a(this.f138011d, mg02.f138011d) && C46238a.m51546a(this.f138012e, mg02.f138012e) && C46238a.m51546a(Integer.valueOf(this.f138013f), Integer.valueOf(mg02.f138013f)) && C46238a.m51546a(Integer.valueOf(this.f138014g), Integer.valueOf(mg02.f138014g));
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
            aVar.mo74320g(2, 8, this.f138011d);
            aVar.mo74320g(3, 8, this.f138012e);
            aVar.mo74318e(4, this.f138013f);
            aVar.mo74318e(5, this.f138014g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f138011d) + C52418a.m58680g(3, 8, this.f138012e) + C52418a.m58678e(4, this.f138013f) + C52418a.m58678e(5, this.f138014g);
        } else if (i == 2) {
            this.f138011d.clear();
            this.f138012e.clear();
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
            C50397mg0 mg02 = objArr[1];
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
                    mg02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51533ue1 ue12 = new C51533ue1();
                    if (bArr2 != null && bArr2.length > 0) {
                        ue12.parseFrom(bArr2);
                    }
                    mg02.f138011d.add(ue12);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49288ei0 ei02 = new C49288ei0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ei02.parseFrom(bArr3);
                    }
                    mg02.f138012e.add(ei02);
                }
                return 0;
            } else if (intValue == 4) {
                mg02.f138013f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mg02.f138014g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
