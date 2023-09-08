package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class k35 extends C47465a {

    /* renamed from: d */
    public n35 f136536d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof k35) && C46238a.m51546a(this.f136536d, ((k35) aVar).f136536d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            n35 n35 = this.f136536d;
            if (n35 != null) {
                if (n35 != null) {
                    aVar.mo74322i(4, n35.computeSize());
                    this.f136536d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: DownloadInfo");
        } else if (i == 1) {
            n35 n352 = this.f136536d;
            if (n352 != null) {
                return 0 + C52418a.m58682i(4, n352.computeSize());
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136536d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DownloadInfo");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            k35 k35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 4) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                n35 n353 = new n35();
                if (bArr != null && bArr.length > 0) {
                    n353.parseFrom(bArr);
                }
                k35.f136536d = n353;
            }
            return 0;
        }
    }
}
