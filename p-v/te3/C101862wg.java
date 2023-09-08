package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wg */
public class C101862wg extends C47465a {

    /* renamed from: d */
    public long f299740d = 0;

    /* renamed from: e */
    public LinkedList<C101777fg2> f299741e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101862wg)) {
            return false;
        }
        C101862wg wgVar = (C101862wg) aVar;
        return C46238a.m51546a(Long.valueOf(this.f299740d), Long.valueOf(wgVar.f299740d)) && C46238a.m51546a(this.f299741e, wgVar.f299741e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f299740d);
            aVar.mo74320g(2, 8, this.f299741e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f299740d) + 0 + C52418a.m58680g(2, 8, this.f299741e);
        } else {
            if (i == 2) {
                this.f299741e.clear();
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
                C101862wg wgVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wgVar.f299740d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C101777fg2 fg22 = new C101777fg2();
                        if (bArr != null && bArr.length > 0) {
                            fg22.parseFrom(bArr);
                        }
                        wgVar.f299741e.add(fg22);
                    }
                    return 0;
                }
            }
        }
    }
}
