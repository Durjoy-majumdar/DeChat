package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wj2 */
public class C51842wj2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f144090d;

    /* renamed from: e */
    public LinkedList<wp4> f144091e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f144092f = new LinkedList<>();

    /* renamed from: g */
    public String f144093g;

    /* renamed from: h */
    public LinkedList<C48869bk2> f144094h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51842wj2)) {
            return false;
        }
        C51842wj2 wj22 = (C51842wj2) aVar;
        return C46238a.m51546a(this.BaseResponse, wj22.BaseResponse) && C46238a.m51546a(this.f144090d, wj22.f144090d) && C46238a.m51546a(this.f144091e, wj22.f144091e) && C46238a.m51546a(this.f144092f, wj22.f144092f) && C46238a.m51546a(this.f144093g, wj22.f144093g) && C46238a.m51546a(this.f144094h, wj22.f144094h);
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
                C49713hj2 hj22 = this.f144090d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f144090d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f144091e);
                aVar.mo74320g(4, 1, this.f144092f);
                String str = this.f144093g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74320g(6, 8, this.f144094h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49713hj2 hj23 = this.f144090d;
            if (hj23 != null) {
                i2 += C52418a.m58682i(2, hj23.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f144091e) + C52418a.m58680g(4, 1, this.f144092f);
            String str2 = this.f144093g;
            if (str2 != null) {
                g += C52418a.m58683j(5, str2);
            }
            return g + C52418a.m58680g(6, 8, this.f144094h);
        } else if (i == 2) {
            this.f144091e.clear();
            this.f144092f.clear();
            this.f144094h.clear();
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
            C51842wj2 wj22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        wj22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49713hj2 hj24 = new C49713hj2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hj24.parseFrom(bArr2);
                        }
                        wj22.f144090d = hj24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        wp4 wp4 = new wp4();
                        if (bArr3 != null && bArr3.length > 0) {
                            wp4.parseFrom(bArr3);
                        }
                        wj22.f144091e.add(wp4);
                    }
                    return 0;
                case 4:
                    wj22.f144092f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    wj22.f144093g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C48869bk2 bk22 = new C48869bk2();
                        if (bArr4 != null && bArr4.length > 0) {
                            bk22.parseFrom(bArr4);
                        }
                        wj22.f144094h.add(bk22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
