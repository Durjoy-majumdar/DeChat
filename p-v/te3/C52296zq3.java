package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zq3 */
public class C52296zq3 extends C47465a {

    /* renamed from: d */
    public String f146182d;

    /* renamed from: e */
    public C77935gl2 f146183e;

    /* renamed from: f */
    public C77935gl2 f146184f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52296zq3)) {
            return false;
        }
        C52296zq3 zq32 = (C52296zq3) aVar;
        return C46238a.m51546a(this.f146182d, zq32.f146182d) && C46238a.m51546a(this.f146183e, zq32.f146183e) && C46238a.m51546a(this.f146184f, zq32.f146184f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146182d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C77935gl2 gl22 = this.f146183e;
            if (gl22 != null) {
                aVar.mo74322i(2, gl22.computeSize());
                this.f146183e.writeFields(aVar);
            }
            C77935gl2 gl23 = this.f146184f;
            if (gl23 != null) {
                aVar.mo74322i(3, gl23.computeSize());
                this.f146184f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f146182d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C77935gl2 gl24 = this.f146183e;
            if (gl24 != null) {
                i2 += C52418a.m58682i(2, gl24.computeSize());
            }
            C77935gl2 gl25 = this.f146184f;
            return gl25 != null ? i2 + C52418a.m58682i(3, gl25.computeSize()) : i2;
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
            C52296zq3 zq32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zq32.f146182d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C77935gl2 gl26 = new C77935gl2();
                    if (bArr != null && bArr.length > 0) {
                        gl26.parseFrom(bArr);
                    }
                    zq32.f146183e = gl26;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77935gl2 gl27 = new C77935gl2();
                    if (bArr2 != null && bArr2.length > 0) {
                        gl27.parseFrom(bArr2);
                    }
                    zq32.f146184f = gl27;
                }
                return 0;
            }
        }
    }
}
