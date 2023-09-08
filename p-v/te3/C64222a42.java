package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a42 */
public class C64222a42 extends C49335eu3 {

    /* renamed from: d */
    public int f182018d;

    /* renamed from: e */
    public String f182019e;

    /* renamed from: f */
    public C64713sn f182020f;

    /* renamed from: g */
    public int f182021g;

    /* renamed from: h */
    public int f182022h;

    /* renamed from: i */
    public C64632pn f182023i;

    /* renamed from: j */
    public C22517nn f182024j;

    /* renamed from: n */
    public String f182025n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64222a42)) {
            return false;
        }
        C64222a42 a422 = (C64222a42) aVar;
        return C46238a.m51546a(this.BaseResponse, a422.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182018d), Integer.valueOf(a422.f182018d)) && C46238a.m51546a(this.f182019e, a422.f182019e) && C46238a.m51546a(this.f182020f, a422.f182020f) && C46238a.m51546a(Integer.valueOf(this.f182021g), Integer.valueOf(a422.f182021g)) && C46238a.m51546a(Integer.valueOf(this.f182022h), Integer.valueOf(a422.f182022h)) && C46238a.m51546a(this.f182023i, a422.f182023i) && C46238a.m51546a(this.f182024j, a422.f182024j) && C46238a.m51546a(this.f182025n, a422.f182025n);
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
                aVar.mo74318e(2, this.f182018d);
                String str = this.f182019e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C64713sn snVar = this.f182020f;
                if (snVar != null) {
                    aVar.mo74322i(4, snVar.computeSize());
                    this.f182020f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f182021g);
                aVar.mo74318e(6, this.f182022h);
                C64632pn pnVar = this.f182023i;
                if (pnVar != null) {
                    aVar.mo74322i(7, pnVar.computeSize());
                    this.f182023i.writeFields(aVar);
                }
                C22517nn nnVar = this.f182024j;
                if (nnVar != null) {
                    aVar.mo74322i(8, nnVar.computeSize());
                    this.f182024j.writeFields(aVar);
                }
                String str2 = this.f182025n;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182018d);
            String str3 = this.f182019e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C64713sn snVar2 = this.f182020f;
            if (snVar2 != null) {
                e += C52418a.m58682i(4, snVar2.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f182021g) + C52418a.m58678e(6, this.f182022h);
            C64632pn pnVar2 = this.f182023i;
            if (pnVar2 != null) {
                e2 += C52418a.m58682i(7, pnVar2.computeSize());
            }
            C22517nn nnVar2 = this.f182024j;
            if (nnVar2 != null) {
                e2 += C52418a.m58682i(8, nnVar2.computeSize());
            }
            String str4 = this.f182025n;
            return str4 != null ? e2 + C52418a.m58683j(9, str4) : e2;
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
            C64222a42 a422 = objArr[1];
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
                        a422.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    a422.f182018d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    a422.f182019e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64713sn snVar3 = new C64713sn();
                        if (bArr2 != null && bArr2.length > 0) {
                            snVar3.parseFrom(bArr2);
                        }
                        a422.f182020f = snVar3;
                    }
                    return 0;
                case 5:
                    a422.f182021g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a422.f182022h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64632pn pnVar3 = new C64632pn();
                        if (bArr3 != null && bArr3.length > 0) {
                            pnVar3.parseFrom(bArr3);
                        }
                        a422.f182023i = pnVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C22517nn nnVar3 = new C22517nn();
                        if (bArr4 != null && bArr4.length > 0) {
                            nnVar3.parseFrom(bArr4);
                        }
                        a422.f182024j = nnVar3;
                    }
                    return 0;
                case 9:
                    a422.f182025n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
