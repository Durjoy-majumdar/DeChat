package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ue4 extends C47465a {

    /* renamed from: d */
    public C52206z23 f142817d;

    /* renamed from: e */
    public LinkedList<C49009cj2> f142818e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<zf4> f142819f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ue4)) {
            return false;
        }
        ue4 ue4 = (ue4) aVar;
        return C46238a.m51546a(this.f142817d, ue4.f142817d) && C46238a.m51546a(this.f142818e, ue4.f142818e) && C46238a.m51546a(this.f142819f, ue4.f142819f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52206z23 z232 = this.f142817d;
            if (z232 != null) {
                aVar.mo74322i(1, z232.computeSize());
                this.f142817d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f142818e);
            aVar.mo74320g(3, 8, this.f142819f);
            return 0;
        } else if (i == 1) {
            C52206z23 z233 = this.f142817d;
            if (z233 != null) {
                i2 = 0 + C52418a.m58682i(1, z233.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f142818e) + C52418a.m58680g(3, 8, this.f142819f);
        } else if (i == 2) {
            this.f142818e.clear();
            this.f142819f.clear();
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
            ue4 ue4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52206z23 z234 = new C52206z23();
                    if (bArr != null && bArr.length > 0) {
                        z234.parseFrom(bArr);
                    }
                    ue4.f142817d = z234;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49009cj2 cj22 = new C49009cj2();
                    if (bArr2 != null && bArr2.length > 0) {
                        cj22.parseFrom(bArr2);
                    }
                    ue4.f142818e.add(cj22);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    zf4 zf4 = new zf4();
                    if (bArr3 != null && bArr3.length > 0) {
                        zf4.parseFrom(bArr3);
                    }
                    ue4.f142819f.add(zf4);
                }
                return 0;
            }
        }
    }
}
