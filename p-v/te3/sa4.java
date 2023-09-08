package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class sa4 extends C47465a {

    /* renamed from: d */
    public ra4 f185399d;

    /* renamed from: e */
    public ra4 f185400e;

    /* renamed from: f */
    public ra4 f185401f;

    /* renamed from: g */
    public int f185402g;

    /* renamed from: h */
    public int f185403h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sa4)) {
            return false;
        }
        sa4 sa4 = (sa4) aVar;
        return C46238a.m51546a(this.f185399d, sa4.f185399d) && C46238a.m51546a(this.f185400e, sa4.f185400e) && C46238a.m51546a(this.f185401f, sa4.f185401f) && C46238a.m51546a(Integer.valueOf(this.f185402g), Integer.valueOf(sa4.f185402g)) && C46238a.m51546a(Integer.valueOf(this.f185403h), Integer.valueOf(sa4.f185403h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ra4 ra4 = this.f185399d;
            if (ra4 != null) {
                aVar.mo74322i(1, ra4.computeSize());
                this.f185399d.writeFields(aVar);
            }
            ra4 ra42 = this.f185400e;
            if (ra42 != null) {
                aVar.mo74322i(2, ra42.computeSize());
                this.f185400e.writeFields(aVar);
            }
            ra4 ra43 = this.f185401f;
            if (ra43 != null) {
                aVar.mo74322i(3, ra43.computeSize());
                this.f185401f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f185402g);
            aVar.mo74318e(5, this.f185403h);
            return 0;
        } else if (i == 1) {
            ra4 ra44 = this.f185399d;
            if (ra44 != null) {
                i2 = 0 + C52418a.m58682i(1, ra44.computeSize());
            }
            ra4 ra45 = this.f185400e;
            if (ra45 != null) {
                i2 += C52418a.m58682i(2, ra45.computeSize());
            }
            ra4 ra46 = this.f185401f;
            if (ra46 != null) {
                i2 += C52418a.m58682i(3, ra46.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f185402g) + C52418a.m58678e(5, this.f185403h);
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
            sa4 sa4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ra4 ra47 = new ra4();
                    if (bArr != null && bArr.length > 0) {
                        ra47.parseFrom(bArr);
                    }
                    sa4.f185399d = ra47;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ra4 ra48 = new ra4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ra48.parseFrom(bArr2);
                    }
                    sa4.f185400e = ra48;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    ra4 ra49 = new ra4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ra49.parseFrom(bArr3);
                    }
                    sa4.f185401f = ra49;
                }
                return 0;
            } else if (intValue == 4) {
                sa4.f185402g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sa4.f185403h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
