package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jc3 */
public class C64466jc3 extends C49335eu3 {

    /* renamed from: d */
    public int f183782d;

    /* renamed from: e */
    public String f183783e;

    /* renamed from: f */
    public C64552mc3 f183784f;

    /* renamed from: g */
    public C64851yb3 f183785g;

    /* renamed from: h */
    public LinkedList<C78011xb3> f183786h = new LinkedList<>();

    /* renamed from: i */
    public int f183787i;

    /* renamed from: j */
    public LinkedList<a54> f183788j = new LinkedList<>();

    /* renamed from: n */
    public int f183789n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64466jc3)) {
            return false;
        }
        C64466jc3 jc32 = (C64466jc3) aVar;
        return C46238a.m51546a(this.BaseResponse, jc32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f183782d), Integer.valueOf(jc32.f183782d)) && C46238a.m51546a(this.f183783e, jc32.f183783e) && C46238a.m51546a(this.f183784f, jc32.f183784f) && C46238a.m51546a(this.f183785g, jc32.f183785g) && C46238a.m51546a(this.f183786h, jc32.f183786h) && C46238a.m51546a(Integer.valueOf(this.f183787i), Integer.valueOf(jc32.f183787i)) && C46238a.m51546a(this.f183788j, jc32.f183788j) && C46238a.m51546a(Integer.valueOf(this.f183789n), Integer.valueOf(jc32.f183789n));
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
                aVar.mo74318e(2, this.f183782d);
                String str = this.f183783e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C64552mc3 mc32 = this.f183784f;
                if (mc32 != null) {
                    aVar.mo74322i(4, mc32.computeSize());
                    this.f183784f.writeFields(aVar);
                }
                C64851yb3 yb32 = this.f183785g;
                if (yb32 != null) {
                    aVar.mo74322i(5, yb32.computeSize());
                    this.f183785g.writeFields(aVar);
                }
                aVar.mo74320g(6, 8, this.f183786h);
                aVar.mo74318e(7, this.f183787i);
                aVar.mo74320g(8, 8, this.f183788j);
                aVar.mo74318e(9, this.f183789n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f183782d);
            String str2 = this.f183783e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C64552mc3 mc33 = this.f183784f;
            if (mc33 != null) {
                e += C52418a.m58682i(4, mc33.computeSize());
            }
            C64851yb3 yb33 = this.f183785g;
            if (yb33 != null) {
                e += C52418a.m58682i(5, yb33.computeSize());
            }
            return e + C52418a.m58680g(6, 8, this.f183786h) + C52418a.m58678e(7, this.f183787i) + C52418a.m58680g(8, 8, this.f183788j) + C52418a.m58678e(9, this.f183789n);
        } else if (i == 2) {
            this.f183786h.clear();
            this.f183788j.clear();
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
            C64466jc3 jc32 = objArr[1];
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
                        jc32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    jc32.f183782d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jc32.f183783e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64552mc3 mc34 = new C64552mc3();
                        if (bArr2 != null && bArr2.length > 0) {
                            mc34.parseFrom(bArr2);
                        }
                        jc32.f183784f = mc34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64851yb3 yb34 = new C64851yb3();
                        if (bArr3 != null && bArr3.length > 0) {
                            yb34.parseFrom(bArr3);
                        }
                        jc32.f183785g = yb34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C78011xb3 xb32 = new C78011xb3();
                        if (bArr4 != null && bArr4.length > 0) {
                            xb32.parseFrom(bArr4);
                        }
                        jc32.f183786h.add(xb32);
                    }
                    return 0;
                case 7:
                    jc32.f183787i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        a54 a54 = new a54();
                        if (bArr5 != null && bArr5.length > 0) {
                            a54.parseFrom(bArr5);
                        }
                        jc32.f183788j.add(a54);
                    }
                    return 0;
                case 9:
                    jc32.f183789n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
