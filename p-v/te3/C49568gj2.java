package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gj2 */
public class C49568gj2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f134074d;

    /* renamed from: e */
    public LinkedList<C49293ej2> f134075e = new LinkedList<>();

    /* renamed from: f */
    public String f134076f;

    /* renamed from: g */
    public LinkedList<C50696ok2> f134077g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49568gj2)) {
            return false;
        }
        C49568gj2 gj22 = (C49568gj2) aVar;
        return C46238a.m51546a(this.BaseResponse, gj22.BaseResponse) && C46238a.m51546a(this.f134074d, gj22.f134074d) && C46238a.m51546a(this.f134075e, gj22.f134075e) && C46238a.m51546a(this.f134076f, gj22.f134076f) && C46238a.m51546a(this.f134077g, gj22.f134077g);
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
                C49713hj2 hj22 = this.f134074d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f134074d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f134075e);
                String str = this.f134076f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74320g(5, 8, this.f134077g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49713hj2 hj23 = this.f134074d;
            if (hj23 != null) {
                i2 += C52418a.m58682i(2, hj23.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f134075e);
            String str2 = this.f134076f;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            return g + C52418a.m58680g(5, 8, this.f134077g);
        } else if (i == 2) {
            this.f134075e.clear();
            this.f134077g.clear();
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
            C49568gj2 gj22 = objArr[1];
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
                    gj22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49713hj2 hj24 = new C49713hj2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hj24.parseFrom(bArr2);
                    }
                    gj22.f134074d = hj24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49293ej2 ej22 = new C49293ej2();
                    if (bArr3 != null && bArr3.length > 0) {
                        ej22.parseFrom(bArr3);
                    }
                    gj22.f134075e.add(ej22);
                }
                return 0;
            } else if (intValue == 4) {
                gj22.f134076f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50696ok2 ok22 = new C50696ok2();
                    if (bArr4 != null && bArr4.length > 0) {
                        ok22.parseFrom(bArr4);
                    }
                    gj22.f134077g.add(ok22);
                }
                return 0;
            }
        }
    }
}
