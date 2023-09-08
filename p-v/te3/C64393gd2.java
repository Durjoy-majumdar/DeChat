package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gd2 */
public class C64393gd2 extends C49335eu3 {

    /* renamed from: d */
    public c65 f183304d;

    /* renamed from: e */
    public d65 f183305e;

    /* renamed from: f */
    public a65 f183306f;

    /* renamed from: g */
    public c85 f183307g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64393gd2)) {
            return false;
        }
        C64393gd2 gd22 = (C64393gd2) aVar;
        return C46238a.m51546a(this.BaseResponse, gd22.BaseResponse) && C46238a.m51546a(this.f183304d, gd22.f183304d) && C46238a.m51546a(this.f183305e, gd22.f183305e) && C46238a.m51546a(this.f183306f, gd22.f183306f) && C46238a.m51546a(this.f183307g, gd22.f183307g);
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
                c65 c65 = this.f183304d;
                if (c65 != null) {
                    aVar.mo74322i(2, c65.computeSize());
                    this.f183304d.writeFields(aVar);
                }
                d65 d65 = this.f183305e;
                if (d65 != null) {
                    aVar.mo74322i(3, d65.computeSize());
                    this.f183305e.writeFields(aVar);
                }
                a65 a65 = this.f183306f;
                if (a65 != null) {
                    aVar.mo74322i(4, a65.computeSize());
                    this.f183306f.writeFields(aVar);
                }
                c85 c85 = this.f183307g;
                if (c85 != null) {
                    aVar.mo74322i(5, c85.computeSize());
                    this.f183307g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            c65 c652 = this.f183304d;
            if (c652 != null) {
                i2 += C52418a.m58682i(2, c652.computeSize());
            }
            d65 d652 = this.f183305e;
            if (d652 != null) {
                i2 += C52418a.m58682i(3, d652.computeSize());
            }
            a65 a652 = this.f183306f;
            if (a652 != null) {
                i2 += C52418a.m58682i(4, a652.computeSize());
            }
            c85 c852 = this.f183307g;
            return c852 != null ? i2 + C52418a.m58682i(5, c852.computeSize()) : i2;
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
            C64393gd2 gd22 = objArr[1];
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
                    gd22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    c65 c653 = new c65();
                    if (bArr2 != null && bArr2.length > 0) {
                        c653.parseFrom(bArr2);
                    }
                    gd22.f183304d = c653;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    d65 d653 = new d65();
                    if (bArr3 != null && bArr3.length > 0) {
                        d653.parseFrom(bArr3);
                    }
                    gd22.f183305e = d653;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    a65 a653 = new a65();
                    if (bArr4 != null && bArr4.length > 0) {
                        a653.parseFrom(bArr4);
                    }
                    gd22.f183306f = a653;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    c85 c853 = new c85();
                    if (bArr5 != null && bArr5.length > 0) {
                        c853.parseFrom(bArr5);
                    }
                    gd22.f183307g = c853;
                }
                return 0;
            }
        }
    }
}
