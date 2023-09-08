package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s1 */
public class C118463s1 extends C47465a {

    /* renamed from: d */
    public C118467t1 f354323d;

    /* renamed from: e */
    public C118467t1 f354324e;

    /* renamed from: f */
    public C118467t1 f354325f;

    /* renamed from: g */
    public C118467t1 f354326g;

    /* renamed from: h */
    public C118467t1 f354327h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118463s1)) {
            return false;
        }
        C118463s1 s1Var = (C118463s1) aVar;
        return C46238a.m51546a(this.f354323d, s1Var.f354323d) && C46238a.m51546a(this.f354324e, s1Var.f354324e) && C46238a.m51546a(this.f354325f, s1Var.f354325f) && C46238a.m51546a(this.f354326g, s1Var.f354326g) && C46238a.m51546a(this.f354327h, s1Var.f354327h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C118467t1 t1Var = this.f354323d;
            if (t1Var != null) {
                aVar.mo74322i(1, t1Var.computeSize());
                this.f354323d.writeFields(aVar);
            }
            C118467t1 t1Var2 = this.f354324e;
            if (t1Var2 != null) {
                aVar.mo74322i(2, t1Var2.computeSize());
                this.f354324e.writeFields(aVar);
            }
            C118467t1 t1Var3 = this.f354325f;
            if (t1Var3 != null) {
                aVar.mo74322i(3, t1Var3.computeSize());
                this.f354325f.writeFields(aVar);
            }
            C118467t1 t1Var4 = this.f354326g;
            if (t1Var4 != null) {
                aVar.mo74322i(4, t1Var4.computeSize());
                this.f354326g.writeFields(aVar);
            }
            C118467t1 t1Var5 = this.f354327h;
            if (t1Var5 != null) {
                aVar.mo74322i(5, t1Var5.computeSize());
                this.f354327h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C118467t1 t1Var6 = this.f354323d;
            if (t1Var6 != null) {
                i2 = 0 + C52418a.m58682i(1, t1Var6.computeSize());
            }
            C118467t1 t1Var7 = this.f354324e;
            if (t1Var7 != null) {
                i2 += C52418a.m58682i(2, t1Var7.computeSize());
            }
            C118467t1 t1Var8 = this.f354325f;
            if (t1Var8 != null) {
                i2 += C52418a.m58682i(3, t1Var8.computeSize());
            }
            C118467t1 t1Var9 = this.f354326g;
            if (t1Var9 != null) {
                i2 += C52418a.m58682i(4, t1Var9.computeSize());
            }
            C118467t1 t1Var10 = this.f354327h;
            return t1Var10 != null ? i2 + C52418a.m58682i(5, t1Var10.computeSize()) : i2;
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
            C118463s1 s1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118467t1 t1Var11 = new C118467t1();
                    if (bArr != null && bArr.length > 0) {
                        t1Var11.parseFrom(bArr);
                    }
                    s1Var.f354323d = t1Var11;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118467t1 t1Var12 = new C118467t1();
                    if (bArr2 != null && bArr2.length > 0) {
                        t1Var12.parseFrom(bArr2);
                    }
                    s1Var.f354324e = t1Var12;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C118467t1 t1Var13 = new C118467t1();
                    if (bArr3 != null && bArr3.length > 0) {
                        t1Var13.parseFrom(bArr3);
                    }
                    s1Var.f354325f = t1Var13;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C118467t1 t1Var14 = new C118467t1();
                    if (bArr4 != null && bArr4.length > 0) {
                        t1Var14.parseFrom(bArr4);
                    }
                    s1Var.f354326g = t1Var14;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C118467t1 t1Var15 = new C118467t1();
                    if (bArr5 != null && bArr5.length > 0) {
                        t1Var15.parseFrom(bArr5);
                    }
                    s1Var.f354327h = t1Var15;
                }
                return 0;
            }
        }
    }
}
