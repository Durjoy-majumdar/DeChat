package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m15 extends C47465a {

    /* renamed from: d */
    public LinkedList<i05> f137755d = new LinkedList<>();

    /* renamed from: e */
    public int f137756e;

    /* renamed from: f */
    public boolean f137757f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m15)) {
            return false;
        }
        m15 m15 = (m15) aVar;
        return C46238a.m51546a(this.f137755d, m15.f137755d) && C46238a.m51546a(Integer.valueOf(this.f137756e), Integer.valueOf(m15.f137756e)) && C46238a.m51546a(Boolean.valueOf(this.f137757f), Boolean.valueOf(m15.f137757f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f137755d);
            aVar.mo74318e(2, this.f137756e);
            aVar.mo74314a(3, this.f137757f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f137755d) + 0 + C52418a.m58678e(2, this.f137756e) + C52418a.m58674a(3, this.f137757f);
        } else {
            if (i == 2) {
                this.f137755d.clear();
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
                m15 m15 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        i05 i05 = new i05();
                        if (bArr != null && bArr.length > 0) {
                            i05.parseFrom(bArr);
                        }
                        m15.f137755d.add(i05);
                    }
                    return 0;
                } else if (intValue == 2) {
                    m15.f137756e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    m15.f137757f = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
