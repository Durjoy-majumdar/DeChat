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

/* renamed from: py1.z1 */
public class C47712z1 extends C49335eu3 {

    /* renamed from: d */
    public C47699x0 f128175d;

    /* renamed from: e */
    public C47542a1 f128176e;

    /* renamed from: f */
    public C47549b1 f128177f;

    /* renamed from: g */
    public C47551b3 f128178g;

    /* renamed from: h */
    public C47581f5 f128179h;

    /* renamed from: i */
    public C47577f1 f128180i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47712z1)) {
            return false;
        }
        C47712z1 z1Var = (C47712z1) aVar;
        return C46238a.m51546a(this.BaseResponse, z1Var.BaseResponse) && C46238a.m51546a(this.f128175d, z1Var.f128175d) && C46238a.m51546a(this.f128176e, z1Var.f128176e) && C46238a.m51546a(this.f128177f, z1Var.f128177f) && C46238a.m51546a(this.f128178g, z1Var.f128178g) && C46238a.m51546a(this.f128179h, z1Var.f128179h) && C46238a.m51546a(this.f128180i, z1Var.f128180i);
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
                C47699x0 x0Var = this.f128175d;
                if (x0Var != null) {
                    aVar.mo74322i(3, x0Var.computeSize());
                    this.f128175d.writeFields(aVar);
                }
                C47542a1 a1Var = this.f128176e;
                if (a1Var != null) {
                    aVar.mo74322i(4, a1Var.computeSize());
                    this.f128176e.writeFields(aVar);
                }
                C47549b1 b1Var = this.f128177f;
                if (b1Var != null) {
                    aVar.mo74322i(5, b1Var.computeSize());
                    this.f128177f.writeFields(aVar);
                }
                C47551b3 b3Var = this.f128178g;
                if (b3Var != null) {
                    aVar.mo74322i(6, b3Var.computeSize());
                    this.f128178g.writeFields(aVar);
                }
                C47581f5 f5Var = this.f128179h;
                if (f5Var != null) {
                    aVar.mo74322i(8, f5Var.computeSize());
                    this.f128179h.writeFields(aVar);
                }
                C47577f1 f1Var = this.f128180i;
                if (f1Var != null) {
                    aVar.mo74322i(9, f1Var.computeSize());
                    this.f128180i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C47699x0 x0Var2 = this.f128175d;
            if (x0Var2 != null) {
                i2 += C52418a.m58682i(3, x0Var2.computeSize());
            }
            C47542a1 a1Var2 = this.f128176e;
            if (a1Var2 != null) {
                i2 += C52418a.m58682i(4, a1Var2.computeSize());
            }
            C47549b1 b1Var2 = this.f128177f;
            if (b1Var2 != null) {
                i2 += C52418a.m58682i(5, b1Var2.computeSize());
            }
            C47551b3 b3Var2 = this.f128178g;
            if (b3Var2 != null) {
                i2 += C52418a.m58682i(6, b3Var2.computeSize());
            }
            C47581f5 f5Var2 = this.f128179h;
            if (f5Var2 != null) {
                i2 += C52418a.m58682i(8, f5Var2.computeSize());
            }
            C47577f1 f1Var2 = this.f128180i;
            return f1Var2 != null ? i2 + C52418a.m58682i(9, f1Var2.computeSize()) : i2;
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
            C47712z1 z1Var = objArr[1];
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
                    z1Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47699x0 x0Var3 = new C47699x0();
                    if (bArr2 != null && bArr2.length > 0) {
                        x0Var3.parseFrom(bArr2);
                    }
                    z1Var.f128175d = x0Var3;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C47542a1 a1Var3 = new C47542a1();
                    if (bArr3 != null && bArr3.length > 0) {
                        a1Var3.parseFrom(bArr3);
                    }
                    z1Var.f128176e = a1Var3;
                }
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C47549b1 b1Var3 = new C47549b1();
                    if (bArr4 != null && bArr4.length > 0) {
                        b1Var3.parseFrom(bArr4);
                    }
                    z1Var.f128177f = b1Var3;
                }
                return 0;
            } else if (intValue == 6) {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C47551b3 b3Var3 = new C47551b3();
                    if (bArr5 != null && bArr5.length > 0) {
                        b3Var3.parseFrom(bArr5);
                    }
                    z1Var.f128178g = b3Var3;
                }
                return 0;
            } else if (intValue == 8) {
                LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                int size6 = j6.size();
                for (int i8 = 0; i8 < size6; i8++) {
                    byte[] bArr6 = j6.get(i8);
                    C47581f5 f5Var3 = new C47581f5();
                    if (bArr6 != null && bArr6.length > 0) {
                        f5Var3.parseFrom(bArr6);
                    }
                    z1Var.f128179h = f5Var3;
                }
                return 0;
            } else if (intValue != 9) {
                return -1;
            } else {
                LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                int size7 = j7.size();
                for (int i9 = 0; i9 < size7; i9++) {
                    byte[] bArr7 = j7.get(i9);
                    C47577f1 f1Var3 = new C47577f1();
                    if (bArr7 != null && bArr7.length > 0) {
                        f1Var3.parseFrom(bArr7);
                    }
                    z1Var.f128180i = f1Var3;
                }
                return 0;
            }
        }
    }
}
