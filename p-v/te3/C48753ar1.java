package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ar1 */
public class C48753ar1 extends C47465a {

    /* renamed from: d */
    public sy4 f130741d;

    /* renamed from: e */
    public LinkedList<C64891zq1> f130742e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48753ar1)) {
            return false;
        }
        C48753ar1 ar12 = (C48753ar1) aVar;
        return C46238a.m51546a(this.f130741d, ar12.f130741d) && C46238a.m51546a(this.f130742e, ar12.f130742e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            sy4 sy4 = this.f130741d;
            if (sy4 != null) {
                aVar.mo74322i(1, sy4.computeSize());
                this.f130741d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f130742e);
            return 0;
        } else if (i == 1) {
            sy4 sy42 = this.f130741d;
            if (sy42 != null) {
                i2 = 0 + C52418a.m58682i(1, sy42.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f130742e);
        } else if (i == 2) {
            this.f130742e.clear();
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
            C48753ar1 ar12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    sy4 sy43 = new sy4();
                    if (bArr != null && bArr.length > 0) {
                        sy43.parseFrom(bArr);
                    }
                    ar12.f130741d = sy43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64891zq1 zq12 = new C64891zq1();
                    if (bArr2 != null && bArr2.length > 0) {
                        zq12.parseFrom(bArr2);
                    }
                    ar12.f130742e.add(zq12);
                }
                return 0;
            }
        }
    }
}
