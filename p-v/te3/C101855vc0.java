package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vc0 */
public class C101855vc0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C101836ry2> f299663d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C101854uy2> f299664e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101855vc0)) {
            return false;
        }
        C101855vc0 vc02 = (C101855vc0) aVar;
        return C46238a.m51546a(this.f299663d, vc02.f299663d) && C46238a.m51546a(this.f299664e, vc02.f299664e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f299663d);
            aVar.mo74320g(2, 8, this.f299664e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f299663d) + 0 + C52418a.m58680g(2, 8, this.f299664e);
        } else {
            if (i == 2) {
                this.f299663d.clear();
                this.f299664e.clear();
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
                C101855vc0 vc02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C101836ry2 ry22 = new C101836ry2();
                        if (bArr != null && bArr.length > 0) {
                            ry22.parseFrom(bArr);
                        }
                        vc02.f299663d.add(ry22);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C101854uy2 uy22 = new C101854uy2();
                        if (bArr2 != null && bArr2.length > 0) {
                            uy22.parseFrom(bArr2);
                        }
                        vc02.f299664e.add(uy22);
                    }
                    return 0;
                }
            }
        }
    }
}
