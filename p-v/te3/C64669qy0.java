package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qy0 */
public class C64669qy0 extends C47465a {

    /* renamed from: d */
    public C64460j21 f185093d;

    /* renamed from: e */
    public C64460j21 f185094e;

    /* renamed from: f */
    public String f185095f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64669qy0)) {
            return false;
        }
        C64669qy0 qy02 = (C64669qy0) aVar;
        return C46238a.m51546a(this.f185093d, qy02.f185093d) && C46238a.m51546a(this.f185094e, qy02.f185094e) && C46238a.m51546a(this.f185095f, qy02.f185095f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64460j21 j212 = this.f185093d;
            if (j212 != null) {
                aVar.mo74322i(1, j212.computeSize());
                this.f185093d.writeFields(aVar);
            }
            C64460j21 j213 = this.f185094e;
            if (j213 != null) {
                aVar.mo74322i(2, j213.computeSize());
                this.f185094e.writeFields(aVar);
            }
            String str = this.f185095f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C64460j21 j214 = this.f185093d;
            if (j214 != null) {
                i2 = 0 + C52418a.m58682i(1, j214.computeSize());
            }
            C64460j21 j215 = this.f185094e;
            if (j215 != null) {
                i2 += C52418a.m58682i(2, j215.computeSize());
            }
            String str2 = this.f185095f;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C64669qy0 qy02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64460j21 j216 = new C64460j21();
                    if (bArr != null && bArr.length > 0) {
                        j216.parseFrom(bArr);
                    }
                    qy02.f185093d = j216;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64460j21 j217 = new C64460j21();
                    if (bArr2 != null && bArr2.length > 0) {
                        j217.parseFrom(bArr2);
                    }
                    qy02.f185094e = j217;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qy02.f185095f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
