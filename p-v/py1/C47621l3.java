package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.l3 */
public class C47621l3 extends C47465a {

    /* renamed from: d */
    public int f127855d;

    /* renamed from: e */
    public String f127856e;

    /* renamed from: f */
    public C47637n5 f127857f;

    /* renamed from: g */
    public C47713z2 f127858g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47621l3)) {
            return false;
        }
        C47621l3 l3Var = (C47621l3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127855d), Integer.valueOf(l3Var.f127855d)) && C46238a.m51546a(this.f127856e, l3Var.f127856e) && C46238a.m51546a(this.f127857f, l3Var.f127857f) && C46238a.m51546a(this.f127858g, l3Var.f127858g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127855d);
            String str = this.f127856e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C47637n5 n5Var = this.f127857f;
            if (n5Var != null) {
                aVar.mo74322i(3, n5Var.computeSize());
                this.f127857f.writeFields(aVar);
            }
            C47713z2 z2Var = this.f127858g;
            if (z2Var != null) {
                aVar.mo74322i(4, z2Var.computeSize());
                this.f127858g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127855d) + 0;
            String str2 = this.f127856e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C47637n5 n5Var2 = this.f127857f;
            if (n5Var2 != null) {
                e += C52418a.m58682i(3, n5Var2.computeSize());
            }
            C47713z2 z2Var2 = this.f127858g;
            return z2Var2 != null ? e + C52418a.m58682i(4, z2Var2.computeSize()) : e;
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
            C47621l3 l3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l3Var.f127855d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                l3Var.f127856e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47637n5 n5Var3 = new C47637n5();
                    if (bArr != null && bArr.length > 0) {
                        n5Var3.parseFrom(bArr);
                    }
                    l3Var.f127857f = n5Var3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C47713z2 z2Var3 = new C47713z2();
                    if (bArr2 != null && bArr2.length > 0) {
                        z2Var3.parseFrom(bArr2);
                    }
                    l3Var.f127858g = z2Var3;
                }
                return 0;
            }
        }
    }
}
