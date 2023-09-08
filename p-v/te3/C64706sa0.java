package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sa0 */
public class C64706sa0 extends C49335eu3 {

    /* renamed from: d */
    public C64769va0 f185391d;

    /* renamed from: e */
    public C64624pa0 f185392e;

    /* renamed from: f */
    public C64652qa0 f185393f;

    /* renamed from: g */
    public String f185394g;

    /* renamed from: h */
    public int f185395h;

    /* renamed from: i */
    public int f185396i;

    /* renamed from: j */
    public String f185397j;

    /* renamed from: n */
    public boolean f185398n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64706sa0)) {
            return false;
        }
        C64706sa0 sa02 = (C64706sa0) aVar;
        return C46238a.m51546a(this.BaseResponse, sa02.BaseResponse) && C46238a.m51546a(this.f185391d, sa02.f185391d) && C46238a.m51546a(this.f185392e, sa02.f185392e) && C46238a.m51546a(this.f185393f, sa02.f185393f) && C46238a.m51546a(this.f185394g, sa02.f185394g) && C46238a.m51546a(Integer.valueOf(this.f185395h), Integer.valueOf(sa02.f185395h)) && C46238a.m51546a(Integer.valueOf(this.f185396i), Integer.valueOf(sa02.f185396i)) && C46238a.m51546a(this.f185397j, sa02.f185397j) && C46238a.m51546a(Boolean.valueOf(this.f185398n), Boolean.valueOf(sa02.f185398n));
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
                C64769va0 va02 = this.f185391d;
                if (va02 != null) {
                    aVar.mo74322i(2, va02.computeSize());
                    this.f185391d.writeFields(aVar);
                }
                C64624pa0 pa02 = this.f185392e;
                if (pa02 != null) {
                    aVar.mo74322i(3, pa02.computeSize());
                    this.f185392e.writeFields(aVar);
                }
                C64652qa0 qa02 = this.f185393f;
                if (qa02 != null) {
                    aVar.mo74322i(4, qa02.computeSize());
                    this.f185393f.writeFields(aVar);
                }
                String str = this.f185394g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74318e(6, this.f185395h);
                aVar.mo74318e(7, this.f185396i);
                String str2 = this.f185397j;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                aVar.mo74314a(9, this.f185398n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C64769va0 va03 = this.f185391d;
            if (va03 != null) {
                i2 += C52418a.m58682i(2, va03.computeSize());
            }
            C64624pa0 pa03 = this.f185392e;
            if (pa03 != null) {
                i2 += C52418a.m58682i(3, pa03.computeSize());
            }
            C64652qa0 qa03 = this.f185393f;
            if (qa03 != null) {
                i2 += C52418a.m58682i(4, qa03.computeSize());
            }
            String str3 = this.f185394g;
            if (str3 != null) {
                i2 += C52418a.m58683j(5, str3);
            }
            int e = i2 + C52418a.m58678e(6, this.f185395h) + C52418a.m58678e(7, this.f185396i);
            String str4 = this.f185397j;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            return e + C52418a.m58674a(9, this.f185398n);
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
            C64706sa0 sa02 = objArr[1];
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
                        sa02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64769va0 va04 = new C64769va0();
                        if (bArr2 != null && bArr2.length > 0) {
                            va04.parseFrom(bArr2);
                        }
                        sa02.f185391d = va04;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64624pa0 pa04 = new C64624pa0();
                        if (bArr3 != null && bArr3.length > 0) {
                            pa04.parseFrom(bArr3);
                        }
                        sa02.f185392e = pa04;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64652qa0 qa04 = new C64652qa0();
                        if (bArr4 != null && bArr4.length > 0) {
                            qa04.parseFrom(bArr4);
                        }
                        sa02.f185393f = qa04;
                    }
                    return 0;
                case 5:
                    sa02.f185394g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sa02.f185395h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    sa02.f185396i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    sa02.f185397j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    sa02.f185398n = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
