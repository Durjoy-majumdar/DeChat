package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ez4 extends C47465a {

    /* renamed from: d */
    public String f133210d;

    /* renamed from: e */
    public cz4 f133211e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ez4)) {
            return false;
        }
        ez4 ez4 = (ez4) aVar;
        return C46238a.m51546a(this.f133210d, ez4.f133210d) && C46238a.m51546a(this.f133211e, ez4.f133211e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133210d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            cz4 cz4 = this.f133211e;
            if (cz4 != null) {
                aVar.mo74322i(2, cz4.computeSize());
                this.f133211e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f133210d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            cz4 cz42 = this.f133211e;
            return cz42 != null ? i2 + C52418a.m58682i(2, cz42.computeSize()) : i2;
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
            ez4 ez4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ez4.f133210d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    cz4 cz43 = new cz4();
                    if (bArr != null && bArr.length > 0) {
                        cz43.parseFrom(bArr);
                    }
                    ez4.f133211e = cz43;
                }
                return 0;
            }
        }
    }
}
