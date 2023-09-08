package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xx4 extends C47465a {

    /* renamed from: d */
    public String f145014d;

    /* renamed from: e */
    public wx4 f145015e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xx4)) {
            return false;
        }
        xx4 xx4 = (xx4) aVar;
        return C46238a.m51546a(this.f145014d, xx4.f145014d) && C46238a.m51546a(this.f145015e, xx4.f145015e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145014d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            wx4 wx4 = this.f145015e;
            if (wx4 != null) {
                aVar.mo74322i(2, wx4.computeSize());
                this.f145015e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f145014d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            wx4 wx42 = this.f145015e;
            return wx42 != null ? i2 + C52418a.m58682i(2, wx42.computeSize()) : i2;
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
            xx4 xx4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xx4.f145014d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    wx4 wx43 = new wx4();
                    if (bArr != null && bArr.length > 0) {
                        wx43.parseFrom(bArr);
                    }
                    xx4.f145015e = wx43;
                }
                return 0;
            }
        }
    }
}
