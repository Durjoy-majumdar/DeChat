package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hu0 */
public class C49752hu0 extends C47465a {

    /* renamed from: d */
    public C51420tn2 f134884d;

    /* renamed from: e */
    public LinkedList<C51420tn2> f134885e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49752hu0)) {
            return false;
        }
        C49752hu0 hu02 = (C49752hu0) aVar;
        return C46238a.m51546a(this.f134884d, hu02.f134884d) && C46238a.m51546a(this.f134885e, hu02.f134885e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51420tn2 tn22 = this.f134884d;
            if (tn22 != null) {
                aVar.mo74322i(1, tn22.computeSize());
                this.f134884d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f134885e);
            return 0;
        } else if (i == 1) {
            C51420tn2 tn23 = this.f134884d;
            if (tn23 != null) {
                i2 = 0 + C52418a.m58682i(1, tn23.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f134885e);
        } else if (i == 2) {
            this.f134885e.clear();
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
            C49752hu0 hu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51420tn2 tn24 = new C51420tn2();
                    if (bArr != null && bArr.length > 0) {
                        tn24.parseFrom(bArr);
                    }
                    hu02.f134884d = tn24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51420tn2 tn25 = new C51420tn2();
                    if (bArr2 != null && bArr2.length > 0) {
                        tn25.parseFrom(bArr2);
                    }
                    hu02.f134885e.add(tn25);
                }
                return 0;
            }
        }
    }
}
