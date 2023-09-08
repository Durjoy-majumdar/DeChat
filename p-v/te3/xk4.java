package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class xk4 extends C49335eu3 {

    /* renamed from: d */
    public int f354537d;

    /* renamed from: e */
    public C118481y7 f354538e;

    /* renamed from: f */
    public C118422c1 f354539f;

    /* renamed from: g */
    public C49510g33 f354540g;

    /* renamed from: h */
    public C64747u8 f354541h;

    /* renamed from: i */
    public C51971xg2 f354542i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xk4)) {
            return false;
        }
        xk4 xk4 = (xk4) aVar;
        return C46238a.m51546a(this.BaseResponse, xk4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f354537d), Integer.valueOf(xk4.f354537d)) && C46238a.m51546a(this.f354538e, xk4.f354538e) && C46238a.m51546a(this.f354539f, xk4.f354539f) && C46238a.m51546a(this.f354540g, xk4.f354540g) && C46238a.m51546a(this.f354541h, xk4.f354541h) && C46238a.m51546a(this.f354542i, xk4.f354542i);
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
                aVar.mo74318e(2, this.f354537d);
                C118481y7 y7Var = this.f354538e;
                if (y7Var != null) {
                    aVar.mo74322i(3, y7Var.computeSize());
                    this.f354538e.writeFields(aVar);
                }
                C118422c1 c1Var = this.f354539f;
                if (c1Var != null) {
                    aVar.mo74322i(4, c1Var.computeSize());
                    this.f354539f.writeFields(aVar);
                }
                C49510g33 g332 = this.f354540g;
                if (g332 != null) {
                    aVar.mo74322i(5, g332.computeSize());
                    this.f354540g.writeFields(aVar);
                }
                C64747u8 u8Var = this.f354541h;
                if (u8Var != null) {
                    aVar.mo74322i(6, u8Var.computeSize());
                    this.f354541h.writeFields(aVar);
                }
                C51971xg2 xg22 = this.f354542i;
                if (xg22 != null) {
                    aVar.mo74322i(7, xg22.computeSize());
                    this.f354542i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f354537d);
            C118481y7 y7Var2 = this.f354538e;
            if (y7Var2 != null) {
                e += C52418a.m58682i(3, y7Var2.computeSize());
            }
            C118422c1 c1Var2 = this.f354539f;
            if (c1Var2 != null) {
                e += C52418a.m58682i(4, c1Var2.computeSize());
            }
            C49510g33 g333 = this.f354540g;
            if (g333 != null) {
                e += C52418a.m58682i(5, g333.computeSize());
            }
            C64747u8 u8Var2 = this.f354541h;
            if (u8Var2 != null) {
                e += C52418a.m58682i(6, u8Var2.computeSize());
            }
            C51971xg2 xg23 = this.f354542i;
            return xg23 != null ? e + C52418a.m58682i(7, xg23.computeSize()) : e;
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
            xk4 xk4 = objArr[1];
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
                        xk4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    xk4.f354537d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C118481y7 y7Var3 = new C118481y7();
                        if (bArr2 != null && bArr2.length > 0) {
                            y7Var3.parseFrom(bArr2);
                        }
                        xk4.f354538e = y7Var3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C118422c1 c1Var3 = new C118422c1();
                        if (bArr3 != null && bArr3.length > 0) {
                            c1Var3.parseFrom(bArr3);
                        }
                        xk4.f354539f = c1Var3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49510g33 g334 = new C49510g33();
                        if (bArr4 != null && bArr4.length > 0) {
                            g334.parseFrom(bArr4);
                        }
                        xk4.f354540g = g334;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C64747u8 u8Var3 = new C64747u8();
                        if (bArr5 != null && bArr5.length > 0) {
                            u8Var3.parseFrom(bArr5);
                        }
                        xk4.f354541h = u8Var3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51971xg2 xg24 = new C51971xg2();
                        if (bArr6 != null && bArr6.length > 0) {
                            xg24.parseFrom(bArr6);
                        }
                        xk4.f354542i = xg24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
