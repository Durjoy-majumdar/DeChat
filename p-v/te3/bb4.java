package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bb4 extends C47465a {

    /* renamed from: d */
    public cb4 f226992d;

    /* renamed from: e */
    public ab4 f226993e;

    /* renamed from: f */
    public za4 f226994f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bb4)) {
            return false;
        }
        bb4 bb4 = (bb4) aVar;
        return C46238a.m51546a(this.f226992d, bb4.f226992d) && C46238a.m51546a(this.f226993e, bb4.f226993e) && C46238a.m51546a(this.f226994f, bb4.f226994f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            cb4 cb4 = this.f226992d;
            if (cb4 != null) {
                aVar.mo74322i(1, cb4.computeSize());
                this.f226992d.writeFields(aVar);
            }
            ab4 ab4 = this.f226993e;
            if (ab4 != null) {
                aVar.mo74322i(2, ab4.computeSize());
                this.f226993e.writeFields(aVar);
            }
            za4 za4 = this.f226994f;
            if (za4 != null) {
                aVar.mo74322i(3, za4.computeSize());
                this.f226994f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            cb4 cb42 = this.f226992d;
            if (cb42 != null) {
                i2 = 0 + C52418a.m58682i(1, cb42.computeSize());
            }
            ab4 ab42 = this.f226993e;
            if (ab42 != null) {
                i2 += C52418a.m58682i(2, ab42.computeSize());
            }
            za4 za42 = this.f226994f;
            return za42 != null ? i2 + C52418a.m58682i(3, za42.computeSize()) : i2;
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
            bb4 bb4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    cb4 cb43 = new cb4();
                    if (bArr != null && bArr.length > 0) {
                        cb43.parseFrom(bArr);
                    }
                    bb4.f226992d = cb43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ab4 ab43 = new ab4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ab43.parseFrom(bArr2);
                    }
                    bb4.f226993e = ab43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    za4 za43 = new za4();
                    if (bArr3 != null && bArr3.length > 0) {
                        za43.parseFrom(bArr3);
                    }
                    bb4.f226994f = za43;
                }
                return 0;
            }
        }
    }
}
