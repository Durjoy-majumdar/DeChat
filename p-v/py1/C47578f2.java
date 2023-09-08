package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.f2 */
public class C47578f2 extends C49335eu3 {

    /* renamed from: d */
    public C47556c1 f127689d;

    /* renamed from: e */
    public C47633n1 f127690e;

    /* renamed from: f */
    public C47645p f127691f;

    /* renamed from: g */
    public C47586g3 f127692g;

    /* renamed from: h */
    public C47649p3 f127693h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47578f2)) {
            return false;
        }
        C47578f2 f2Var = (C47578f2) aVar;
        return C46238a.m51546a(this.BaseResponse, f2Var.BaseResponse) && C46238a.m51546a(this.f127689d, f2Var.f127689d) && C46238a.m51546a(this.f127690e, f2Var.f127690e) && C46238a.m51546a(this.f127691f, f2Var.f127691f) && C46238a.m51546a(this.f127692g, f2Var.f127692g) && C46238a.m51546a(this.f127693h, f2Var.f127693h);
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
                C47556c1 c1Var = this.f127689d;
                if (c1Var != null) {
                    aVar.mo74322i(2, c1Var.computeSize());
                    this.f127689d.writeFields(aVar);
                }
                C47633n1 n1Var = this.f127690e;
                if (n1Var != null) {
                    aVar.mo74322i(3, n1Var.computeSize());
                    this.f127690e.writeFields(aVar);
                }
                C47645p pVar = this.f127691f;
                if (pVar != null) {
                    aVar.mo74322i(4, pVar.computeSize());
                    this.f127691f.writeFields(aVar);
                }
                C47586g3 g3Var = this.f127692g;
                if (g3Var != null) {
                    aVar.mo74322i(5, g3Var.computeSize());
                    this.f127692g.writeFields(aVar);
                }
                C47649p3 p3Var = this.f127693h;
                if (p3Var != null) {
                    aVar.mo74322i(6, p3Var.computeSize());
                    this.f127693h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C47556c1 c1Var2 = this.f127689d;
            if (c1Var2 != null) {
                i2 += C52418a.m58682i(2, c1Var2.computeSize());
            }
            C47633n1 n1Var2 = this.f127690e;
            if (n1Var2 != null) {
                i2 += C52418a.m58682i(3, n1Var2.computeSize());
            }
            C47645p pVar2 = this.f127691f;
            if (pVar2 != null) {
                i2 += C52418a.m58682i(4, pVar2.computeSize());
            }
            C47586g3 g3Var2 = this.f127692g;
            if (g3Var2 != null) {
                i2 += C52418a.m58682i(5, g3Var2.computeSize());
            }
            C47649p3 p3Var2 = this.f127693h;
            return p3Var2 != null ? i2 + C52418a.m58682i(6, p3Var2.computeSize()) : i2;
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
            C47578f2 f2Var = objArr[1];
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
                        f2Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47556c1 c1Var3 = new C47556c1();
                        if (bArr2 != null && bArr2.length > 0) {
                            c1Var3.parseFrom(bArr2);
                        }
                        f2Var.f127689d = c1Var3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C47633n1 n1Var3 = new C47633n1();
                        if (bArr3 != null && bArr3.length > 0) {
                            n1Var3.parseFrom(bArr3);
                        }
                        f2Var.f127690e = n1Var3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C47645p pVar3 = new C47645p();
                        if (bArr4 != null && bArr4.length > 0) {
                            pVar3.parseFrom(bArr4);
                        }
                        f2Var.f127691f = pVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C47586g3 g3Var3 = new C47586g3();
                        if (bArr5 != null && bArr5.length > 0) {
                            g3Var3.parseFrom(bArr5);
                        }
                        f2Var.f127692g = g3Var3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C47649p3 p3Var3 = new C47649p3();
                        if (bArr6 != null && bArr6.length > 0) {
                            p3Var3.parseFrom(bArr6);
                        }
                        f2Var.f127693h = p3Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
