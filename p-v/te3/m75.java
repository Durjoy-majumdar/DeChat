package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m75 extends C47465a {

    /* renamed from: d */
    public e75 f137895d;

    /* renamed from: e */
    public String f137896e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m75)) {
            return false;
        }
        m75 m75 = (m75) aVar;
        return C46238a.m51546a(this.f137895d, m75.f137895d) && C46238a.m51546a(this.f137896e, m75.f137896e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f137895d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f137895d.writeFields(aVar);
            }
            String str = this.f137896e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f137895d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            String str2 = this.f137896e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            m75 m75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    e75 e753 = new e75();
                    if (bArr != null && bArr.length > 0) {
                        e753.parseFrom(bArr);
                    }
                    m75.f137895d = e753;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                m75.f137896e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
