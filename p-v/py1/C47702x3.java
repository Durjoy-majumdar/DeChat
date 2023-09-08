package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.x3 */
public class C47702x3 extends C47465a {

    /* renamed from: d */
    public C47708y3 f128143d;

    /* renamed from: e */
    public C47708y3 f128144e;

    /* renamed from: f */
    public C47708y3 f128145f;

    /* renamed from: g */
    public C47708y3 f128146g;

    /* renamed from: h */
    public C47708y3 f128147h;

    /* renamed from: i */
    public String f128148i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47702x3)) {
            return false;
        }
        C47702x3 x3Var = (C47702x3) aVar;
        return C46238a.m51546a(this.f128143d, x3Var.f128143d) && C46238a.m51546a(this.f128144e, x3Var.f128144e) && C46238a.m51546a(this.f128145f, x3Var.f128145f) && C46238a.m51546a(this.f128146g, x3Var.f128146g) && C46238a.m51546a(this.f128147h, x3Var.f128147h) && C46238a.m51546a(this.f128148i, x3Var.f128148i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47708y3 y3Var = this.f128143d;
            if (y3Var != null) {
                aVar.mo74322i(1, y3Var.computeSize());
                this.f128143d.writeFields(aVar);
            }
            C47708y3 y3Var2 = this.f128144e;
            if (y3Var2 != null) {
                aVar.mo74322i(2, y3Var2.computeSize());
                this.f128144e.writeFields(aVar);
            }
            C47708y3 y3Var3 = this.f128145f;
            if (y3Var3 != null) {
                aVar.mo74322i(3, y3Var3.computeSize());
                this.f128145f.writeFields(aVar);
            }
            C47708y3 y3Var4 = this.f128146g;
            if (y3Var4 != null) {
                aVar.mo74322i(4, y3Var4.computeSize());
                this.f128146g.writeFields(aVar);
            }
            C47708y3 y3Var5 = this.f128147h;
            if (y3Var5 != null) {
                aVar.mo74322i(6, y3Var5.computeSize());
                this.f128147h.writeFields(aVar);
            }
            String str = this.f128148i;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            C47708y3 y3Var6 = this.f128143d;
            if (y3Var6 != null) {
                i2 = 0 + C52418a.m58682i(1, y3Var6.computeSize());
            }
            C47708y3 y3Var7 = this.f128144e;
            if (y3Var7 != null) {
                i2 += C52418a.m58682i(2, y3Var7.computeSize());
            }
            C47708y3 y3Var8 = this.f128145f;
            if (y3Var8 != null) {
                i2 += C52418a.m58682i(3, y3Var8.computeSize());
            }
            C47708y3 y3Var9 = this.f128146g;
            if (y3Var9 != null) {
                i2 += C52418a.m58682i(4, y3Var9.computeSize());
            }
            C47708y3 y3Var10 = this.f128147h;
            if (y3Var10 != null) {
                i2 += C52418a.m58682i(6, y3Var10.computeSize());
            }
            String str2 = this.f128148i;
            return str2 != null ? i2 + C52418a.m58683j(5, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47702x3 x3Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47708y3 y3Var11 = new C47708y3();
                        if (bArr != null && bArr.length > 0) {
                            y3Var11.parseFrom(bArr);
                        }
                        x3Var.f128143d = y3Var11;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47708y3 y3Var12 = new C47708y3();
                        if (bArr2 != null && bArr2.length > 0) {
                            y3Var12.parseFrom(bArr2);
                        }
                        x3Var.f128144e = y3Var12;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C47708y3 y3Var13 = new C47708y3();
                        if (bArr3 != null && bArr3.length > 0) {
                            y3Var13.parseFrom(bArr3);
                        }
                        x3Var.f128145f = y3Var13;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C47708y3 y3Var14 = new C47708y3();
                        if (bArr4 != null && bArr4.length > 0) {
                            y3Var14.parseFrom(bArr4);
                        }
                        x3Var.f128146g = y3Var14;
                    }
                    return 0;
                case 5:
                    x3Var.f128148i = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C47708y3 y3Var15 = new C47708y3();
                        if (bArr5 != null && bArr5.length > 0) {
                            y3Var15.parseFrom(bArr5);
                        }
                        x3Var.f128147h = y3Var15;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
