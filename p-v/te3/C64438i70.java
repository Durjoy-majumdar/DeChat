package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i70 */
public class C64438i70 extends C49335eu3 {

    /* renamed from: d */
    public String f183629d;

    /* renamed from: e */
    public C50270lj f183630e;

    /* renamed from: f */
    public C52114yg2 f183631f;

    /* renamed from: g */
    public d54 f183632g;

    /* renamed from: h */
    public C49227e33 f183633h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64438i70)) {
            return false;
        }
        C64438i70 i702 = (C64438i70) aVar;
        return C46238a.m51546a(this.BaseResponse, i702.BaseResponse) && C46238a.m51546a(this.f183629d, i702.f183629d) && C46238a.m51546a(this.f183630e, i702.f183630e) && C46238a.m51546a(this.f183631f, i702.f183631f) && C46238a.m51546a(this.f183632g, i702.f183632g) && C46238a.m51546a(this.f183633h, i702.f183633h);
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
                String str = this.f183629d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C50270lj ljVar = this.f183630e;
                if (ljVar != null) {
                    aVar.mo74322i(3, ljVar.computeSize());
                    this.f183630e.writeFields(aVar);
                }
                C52114yg2 yg22 = this.f183631f;
                if (yg22 != null) {
                    aVar.mo74322i(4, yg22.computeSize());
                    this.f183631f.writeFields(aVar);
                }
                d54 d54 = this.f183632g;
                if (d54 != null) {
                    aVar.mo74322i(5, d54.computeSize());
                    this.f183632g.writeFields(aVar);
                }
                C49227e33 e332 = this.f183633h;
                if (e332 != null) {
                    aVar.mo74322i(6, e332.computeSize());
                    this.f183633h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f183629d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C50270lj ljVar2 = this.f183630e;
            if (ljVar2 != null) {
                i2 += C52418a.m58682i(3, ljVar2.computeSize());
            }
            C52114yg2 yg23 = this.f183631f;
            if (yg23 != null) {
                i2 += C52418a.m58682i(4, yg23.computeSize());
            }
            d54 d542 = this.f183632g;
            if (d542 != null) {
                i2 += C52418a.m58682i(5, d542.computeSize());
            }
            C49227e33 e333 = this.f183633h;
            return e333 != null ? i2 + C52418a.m58682i(6, e333.computeSize()) : i2;
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
            C64438i70 i702 = objArr[1];
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
                        i702.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    i702.f183629d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50270lj ljVar3 = new C50270lj();
                        if (bArr2 != null && bArr2.length > 0) {
                            ljVar3.parseFrom(bArr2);
                        }
                        i702.f183630e = ljVar3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52114yg2 yg24 = new C52114yg2();
                        if (bArr3 != null && bArr3.length > 0) {
                            yg24.parseFrom(bArr3);
                        }
                        i702.f183631f = yg24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        d54 d543 = new d54();
                        if (bArr4 != null && bArr4.length > 0) {
                            d543.parseFrom(bArr4);
                        }
                        i702.f183632g = d543;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49227e33 e334 = new C49227e33();
                        if (bArr5 != null && bArr5.length > 0) {
                            e334.parseFrom(bArr5);
                        }
                        i702.f183633h = e334;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
