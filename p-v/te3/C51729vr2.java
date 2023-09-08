package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vr2 */
public class C51729vr2 extends C47465a {

    /* renamed from: d */
    public int f143633d;

    /* renamed from: e */
    public C52204z21 f143634e;

    /* renamed from: f */
    public C50191kx2 f143635f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51729vr2)) {
            return false;
        }
        C51729vr2 vr22 = (C51729vr2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143633d), Integer.valueOf(vr22.f143633d)) && C46238a.m51546a(this.f143634e, vr22.f143634e) && C46238a.m51546a(this.f143635f, vr22.f143635f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143633d);
            C52204z21 z212 = this.f143634e;
            if (z212 != null) {
                aVar.mo74322i(2, z212.computeSize());
                this.f143634e.writeFields(aVar);
            }
            C50191kx2 kx22 = this.f143635f;
            if (kx22 != null) {
                aVar.mo74322i(3, kx22.computeSize());
                this.f143635f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143633d) + 0;
            C52204z21 z213 = this.f143634e;
            if (z213 != null) {
                e += C52418a.m58682i(2, z213.computeSize());
            }
            C50191kx2 kx23 = this.f143635f;
            return kx23 != null ? e + C52418a.m58682i(3, kx23.computeSize()) : e;
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
            C51729vr2 vr22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vr22.f143633d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52204z21 z214 = new C52204z21();
                    if (bArr != null && bArr.length > 0) {
                        z214.parseFrom(bArr);
                    }
                    vr22.f143634e = z214;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50191kx2 kx24 = new C50191kx2();
                    if (bArr2 != null && bArr2.length > 0) {
                        kx24.parseFrom(bArr2);
                    }
                    vr22.f143635f = kx24;
                }
                return 0;
            }
        }
    }
}
