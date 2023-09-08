package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.j1 */
public class C47605j1 extends C47465a {

    /* renamed from: d */
    public C47583g0 f127800d;

    /* renamed from: e */
    public C47544a3 f127801e;

    /* renamed from: f */
    public C47573e4 f127802f;

    /* renamed from: g */
    public boolean f127803g;

    /* renamed from: h */
    public C47655q2 f127804h;

    /* renamed from: i */
    public C47624m f127805i;

    /* renamed from: j */
    public C47569e0 f127806j;

    /* renamed from: n */
    public C47680u f127807n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47605j1)) {
            return false;
        }
        C47605j1 j1Var = (C47605j1) aVar;
        return C46238a.m51546a(this.f127800d, j1Var.f127800d) && C46238a.m51546a(this.f127801e, j1Var.f127801e) && C46238a.m51546a(this.f127802f, j1Var.f127802f) && C46238a.m51546a(Boolean.valueOf(this.f127803g), Boolean.valueOf(j1Var.f127803g)) && C46238a.m51546a(this.f127804h, j1Var.f127804h) && C46238a.m51546a(this.f127805i, j1Var.f127805i) && C46238a.m51546a(this.f127806j, j1Var.f127806j) && C46238a.m51546a(this.f127807n, j1Var.f127807n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47583g0 g0Var = this.f127800d;
            if (g0Var != null) {
                aVar.mo74322i(1, g0Var.computeSize());
                this.f127800d.writeFields(aVar);
            }
            C47544a3 a3Var = this.f127801e;
            if (a3Var != null) {
                aVar.mo74322i(2, a3Var.computeSize());
                this.f127801e.writeFields(aVar);
            }
            C47573e4 e4Var = this.f127802f;
            if (e4Var != null) {
                aVar.mo74322i(3, e4Var.computeSize());
                this.f127802f.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f127803g);
            C47655q2 q2Var = this.f127804h;
            if (q2Var != null) {
                aVar.mo74322i(5, q2Var.computeSize());
                this.f127804h.writeFields(aVar);
            }
            C47624m mVar = this.f127805i;
            if (mVar != null) {
                aVar.mo74322i(6, mVar.computeSize());
                this.f127805i.writeFields(aVar);
            }
            C47569e0 e0Var = this.f127806j;
            if (e0Var != null) {
                aVar.mo74322i(7, e0Var.computeSize());
                this.f127806j.writeFields(aVar);
            }
            C47680u uVar = this.f127807n;
            if (uVar != null) {
                aVar.mo74322i(8, uVar.computeSize());
                this.f127807n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47583g0 g0Var2 = this.f127800d;
            if (g0Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, g0Var2.computeSize());
            }
            C47544a3 a3Var2 = this.f127801e;
            if (a3Var2 != null) {
                i2 += C52418a.m58682i(2, a3Var2.computeSize());
            }
            C47573e4 e4Var2 = this.f127802f;
            if (e4Var2 != null) {
                i2 += C52418a.m58682i(3, e4Var2.computeSize());
            }
            int a = i2 + C52418a.m58674a(4, this.f127803g);
            C47655q2 q2Var2 = this.f127804h;
            if (q2Var2 != null) {
                a += C52418a.m58682i(5, q2Var2.computeSize());
            }
            C47624m mVar2 = this.f127805i;
            if (mVar2 != null) {
                a += C52418a.m58682i(6, mVar2.computeSize());
            }
            C47569e0 e0Var2 = this.f127806j;
            if (e0Var2 != null) {
                a += C52418a.m58682i(7, e0Var2.computeSize());
            }
            C47680u uVar2 = this.f127807n;
            return uVar2 != null ? a + C52418a.m58682i(8, uVar2.computeSize()) : a;
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
            C47605j1 j1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47583g0 g0Var3 = new C47583g0();
                        if (bArr != null && bArr.length > 0) {
                            g0Var3.parseFrom(bArr);
                        }
                        j1Var.f127800d = g0Var3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47544a3 a3Var3 = new C47544a3();
                        if (bArr2 != null && bArr2.length > 0) {
                            a3Var3.parseFrom(bArr2);
                        }
                        j1Var.f127801e = a3Var3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C47573e4 e4Var3 = new C47573e4();
                        if (bArr3 != null && bArr3.length > 0) {
                            e4Var3.parseFrom(bArr3);
                        }
                        j1Var.f127802f = e4Var3;
                    }
                    return 0;
                case 4:
                    j1Var.f127803g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C47655q2 q2Var3 = new C47655q2();
                        if (bArr4 != null && bArr4.length > 0) {
                            q2Var3.parseFrom(bArr4);
                        }
                        j1Var.f127804h = q2Var3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C47624m mVar3 = new C47624m();
                        if (bArr5 != null && bArr5.length > 0) {
                            mVar3.parseFrom(bArr5);
                        }
                        j1Var.f127805i = mVar3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C47569e0 e0Var3 = new C47569e0();
                        if (bArr6 != null && bArr6.length > 0) {
                            e0Var3.parseFrom(bArr6);
                        }
                        j1Var.f127806j = e0Var3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C47680u uVar3 = new C47680u();
                        if (bArr7 != null && bArr7.length > 0) {
                            uVar3.parseFrom(bArr7);
                        }
                        j1Var.f127807n = uVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
