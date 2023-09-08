package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ep4 extends C47465a {

    /* renamed from: d */
    public String f353978d;

    /* renamed from: e */
    public C118475vf3 f353979e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ep4)) {
            return false;
        }
        ep4 ep4 = (ep4) aVar;
        return C46238a.m51546a(this.f353978d, ep4.f353978d) && C46238a.m51546a(this.f353979e, ep4.f353979e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f353979e != null) {
                String str = this.f353978d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C118475vf3 vf32 = this.f353979e;
                if (vf32 != null) {
                    aVar.mo74322i(2, vf32.computeSize());
                    this.f353979e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Position");
        } else if (i == 1) {
            String str2 = this.f353978d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C118475vf3 vf33 = this.f353979e;
            return vf33 != null ? i2 + C52418a.m58682i(2, vf33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f353979e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Position");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ep4 ep4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ep4.f353978d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118475vf3 vf34 = new C118475vf3();
                    if (bArr != null && bArr.length > 0) {
                        vf34.parseFrom(bArr);
                    }
                    ep4.f353979e = vf34;
                }
                return 0;
            }
        }
    }
}
