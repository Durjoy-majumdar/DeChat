package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class j64 extends C49335eu3 {

    /* renamed from: d */
    public h64 f135902d;

    /* renamed from: e */
    public C51018qv3 f135903e;

    /* renamed from: f */
    public g84 f135904f;

    /* renamed from: g */
    public C51018qv3 f135905g;

    /* renamed from: h */
    public C48952c4 f135906h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j64)) {
            return false;
        }
        j64 j64 = (j64) aVar;
        return C46238a.m51546a(this.BaseResponse, j64.BaseResponse) && C46238a.m51546a(this.f135902d, j64.f135902d) && C46238a.m51546a(this.f135903e, j64.f135903e) && C46238a.m51546a(this.f135904f, j64.f135904f) && C46238a.m51546a(this.f135905g, j64.f135905g) && C46238a.m51546a(this.f135906h, j64.f135906h);
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
                h64 h64 = this.f135902d;
                if (h64 != null) {
                    aVar.mo74322i(2, h64.computeSize());
                    this.f135902d.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f135903e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f135903e.writeFields(aVar);
                }
                g84 g84 = this.f135904f;
                if (g84 != null) {
                    aVar.mo74322i(4, g84.computeSize());
                    this.f135904f.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f135905g;
                if (qv33 != null) {
                    aVar.mo74322i(5, qv33.computeSize());
                    this.f135905g.writeFields(aVar);
                }
                C48952c4 c4Var = this.f135906h;
                if (c4Var != null) {
                    aVar.mo74322i(6, c4Var.computeSize());
                    this.f135906h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            h64 h642 = this.f135902d;
            if (h642 != null) {
                i2 += C52418a.m58682i(2, h642.computeSize());
            }
            C51018qv3 qv34 = this.f135903e;
            if (qv34 != null) {
                i2 += C52418a.m58682i(3, qv34.computeSize());
            }
            g84 g842 = this.f135904f;
            if (g842 != null) {
                i2 += C52418a.m58682i(4, g842.computeSize());
            }
            C51018qv3 qv35 = this.f135905g;
            if (qv35 != null) {
                i2 += C52418a.m58682i(5, qv35.computeSize());
            }
            C48952c4 c4Var2 = this.f135906h;
            return c4Var2 != null ? i2 + C52418a.m58682i(6, c4Var2.computeSize()) : i2;
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
            j64 j64 = objArr[1];
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
                        j64.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        h64 h643 = new h64();
                        if (bArr2 != null && bArr2.length > 0) {
                            h643.parseFrom(bArr2);
                        }
                        j64.f135902d = h643;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv36.mo73348f(bArr3);
                        }
                        j64.f135903e = qv36;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        g84 g843 = new g84();
                        if (bArr4 != null && bArr4.length > 0) {
                            g843.parseFrom(bArr4);
                        }
                        j64.f135904f = g843;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv37.mo73348f(bArr5);
                        }
                        j64.f135905g = qv37;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C48952c4 c4Var3 = new C48952c4();
                        if (bArr6 != null && bArr6.length > 0) {
                            c4Var3.parseFrom(bArr6);
                        }
                        j64.f135906h = c4Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
