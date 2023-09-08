package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yx3 */
public class C52182yx3 extends C49335eu3 {

    /* renamed from: d */
    public C50052jy2 f145560d;

    /* renamed from: e */
    public C49697hf2 f145561e;

    /* renamed from: f */
    public C49840if2 f145562f;

    /* renamed from: g */
    public String f145563g;

    /* renamed from: h */
    public int f145564h;

    /* renamed from: i */
    public C50076k4 f145565i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52182yx3)) {
            return false;
        }
        C52182yx3 yx32 = (C52182yx3) aVar;
        return C46238a.m51546a(this.BaseResponse, yx32.BaseResponse) && C46238a.m51546a(this.f145560d, yx32.f145560d) && C46238a.m51546a(this.f145561e, yx32.f145561e) && C46238a.m51546a(this.f145562f, yx32.f145562f) && C46238a.m51546a(this.f145563g, yx32.f145563g) && C46238a.m51546a(Integer.valueOf(this.f145564h), Integer.valueOf(yx32.f145564h)) && C46238a.m51546a(this.f145565i, yx32.f145565i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145560d == null) {
                throw new C52419b("Not all required fields were included: Contact");
            } else if (this.f145561e == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f145562f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C50052jy2 jy22 = this.f145560d;
                if (jy22 != null) {
                    aVar.mo74322i(2, jy22.computeSize());
                    this.f145560d.writeFields(aVar);
                }
                C49697hf2 hf22 = this.f145561e;
                if (hf22 != null) {
                    aVar.mo74322i(3, hf22.computeSize());
                    this.f145561e.writeFields(aVar);
                }
                C49840if2 if22 = this.f145562f;
                if (if22 != null) {
                    aVar.mo74322i(4, if22.computeSize());
                    this.f145562f.writeFields(aVar);
                }
                String str = this.f145563g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74318e(6, this.f145564h);
                C50076k4 k4Var = this.f145565i;
                if (k4Var != null) {
                    aVar.mo74322i(7, k4Var.computeSize());
                    this.f145565i.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: HardDeviceAttr");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50052jy2 jy23 = this.f145560d;
            if (jy23 != null) {
                i2 += C52418a.m58682i(2, jy23.computeSize());
            }
            C49697hf2 hf23 = this.f145561e;
            if (hf23 != null) {
                i2 += C52418a.m58682i(3, hf23.computeSize());
            }
            C49840if2 if23 = this.f145562f;
            if (if23 != null) {
                i2 += C52418a.m58682i(4, if23.computeSize());
            }
            String str2 = this.f145563g;
            if (str2 != null) {
                i2 += C52418a.m58683j(5, str2);
            }
            int e = i2 + C52418a.m58678e(6, this.f145564h);
            C50076k4 k4Var2 = this.f145565i;
            return k4Var2 != null ? e + C52418a.m58682i(7, k4Var2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f145560d == null) {
                throw new C52419b("Not all required fields were included: Contact");
            } else if (this.f145561e == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f145562f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: HardDeviceAttr");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52182yx3 yx32 = objArr[1];
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
                        yx32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50052jy2 jy24 = new C50052jy2();
                        if (bArr2 != null && bArr2.length > 0) {
                            jy24.parseFrom(bArr2);
                        }
                        yx32.f145560d = jy24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49697hf2 hf24 = new C49697hf2();
                        if (bArr3 != null && bArr3.length > 0) {
                            hf24.parseFrom(bArr3);
                        }
                        yx32.f145561e = hf24;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49840if2 if24 = new C49840if2();
                        if (bArr4 != null && bArr4.length > 0) {
                            if24.parseFrom(bArr4);
                        }
                        yx32.f145562f = if24;
                    }
                    return 0;
                case 5:
                    yx32.f145563g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    yx32.f145564h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50076k4 k4Var3 = new C50076k4();
                        if (bArr5 != null && bArr5.length > 0) {
                            k4Var3.parseFrom(bArr5);
                        }
                        yx32.f145565i = k4Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
