package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.c1 */
public class C47556c1 extends C47465a {

    /* renamed from: d */
    public C47579f3 f127614d;

    /* renamed from: e */
    public C47579f3 f127615e;

    /* renamed from: f */
    public C47579f3 f127616f;

    /* renamed from: g */
    public C47636n4 f127617g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47556c1)) {
            return false;
        }
        C47556c1 c1Var = (C47556c1) aVar;
        return C46238a.m51546a(this.f127614d, c1Var.f127614d) && C46238a.m51546a(this.f127615e, c1Var.f127615e) && C46238a.m51546a(this.f127616f, c1Var.f127616f) && C46238a.m51546a(this.f127617g, c1Var.f127617g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47579f3 f3Var = this.f127614d;
            if (f3Var != null) {
                aVar.mo74322i(1, f3Var.computeSize());
                this.f127614d.writeFields(aVar);
            }
            C47579f3 f3Var2 = this.f127615e;
            if (f3Var2 != null) {
                aVar.mo74322i(2, f3Var2.computeSize());
                this.f127615e.writeFields(aVar);
            }
            C47579f3 f3Var3 = this.f127616f;
            if (f3Var3 != null) {
                aVar.mo74322i(3, f3Var3.computeSize());
                this.f127616f.writeFields(aVar);
            }
            C47636n4 n4Var = this.f127617g;
            if (n4Var != null) {
                aVar.mo74322i(4, n4Var.computeSize());
                this.f127617g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47579f3 f3Var4 = this.f127614d;
            if (f3Var4 != null) {
                i2 = 0 + C52418a.m58682i(1, f3Var4.computeSize());
            }
            C47579f3 f3Var5 = this.f127615e;
            if (f3Var5 != null) {
                i2 += C52418a.m58682i(2, f3Var5.computeSize());
            }
            C47579f3 f3Var6 = this.f127616f;
            if (f3Var6 != null) {
                i2 += C52418a.m58682i(3, f3Var6.computeSize());
            }
            C47636n4 n4Var2 = this.f127617g;
            return n4Var2 != null ? i2 + C52418a.m58682i(4, n4Var2.computeSize()) : i2;
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
            C47556c1 c1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47579f3 f3Var7 = new C47579f3();
                    if (bArr != null && bArr.length > 0) {
                        f3Var7.parseFrom(bArr);
                    }
                    c1Var.f127614d = f3Var7;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47579f3 f3Var8 = new C47579f3();
                    if (bArr2 != null && bArr2.length > 0) {
                        f3Var8.parseFrom(bArr2);
                    }
                    c1Var.f127615e = f3Var8;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C47579f3 f3Var9 = new C47579f3();
                    if (bArr3 != null && bArr3.length > 0) {
                        f3Var9.parseFrom(bArr3);
                    }
                    c1Var.f127616f = f3Var9;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C47636n4 n4Var3 = new C47636n4();
                    if (bArr4 != null && bArr4.length > 0) {
                        n4Var3.parseFrom(bArr4);
                    }
                    c1Var.f127617g = n4Var3;
                }
                return 0;
            }
        }
    }
}
