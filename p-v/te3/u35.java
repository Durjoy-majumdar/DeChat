package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class u35 extends C47465a {

    /* renamed from: d */
    public C49698hf3 f142581d;

    /* renamed from: e */
    public C49698hf3 f142582e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u35)) {
            return false;
        }
        u35 u35 = (u35) aVar;
        return C46238a.m51546a(this.f142581d, u35.f142581d) && C46238a.m51546a(this.f142582e, u35.f142582e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49698hf3 hf32 = this.f142581d;
            if (hf32 != null) {
                aVar.mo74322i(1, hf32.computeSize());
                this.f142581d.writeFields(aVar);
            }
            C49698hf3 hf33 = this.f142582e;
            if (hf33 != null) {
                aVar.mo74322i(2, hf33.computeSize());
                this.f142582e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49698hf3 hf34 = this.f142581d;
            if (hf34 != null) {
                i2 = 0 + C52418a.m58682i(1, hf34.computeSize());
            }
            C49698hf3 hf35 = this.f142582e;
            return hf35 != null ? i2 + C52418a.m58682i(2, hf35.computeSize()) : i2;
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
            u35 u35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49698hf3 hf36 = new C49698hf3();
                    if (bArr != null && bArr.length > 0) {
                        hf36.parseFrom(bArr);
                    }
                    u35.f142581d = hf36;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49698hf3 hf37 = new C49698hf3();
                    if (bArr2 != null && bArr2.length > 0) {
                        hf37.parseFrom(bArr2);
                    }
                    u35.f142582e = hf37;
                }
                return 0;
            }
        }
    }
}
