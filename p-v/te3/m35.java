package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m35 extends C47465a {

    /* renamed from: d */
    public String f137822d;

    /* renamed from: e */
    public boolean f137823e;

    /* renamed from: f */
    public int f137824f;

    /* renamed from: g */
    public int f137825g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m35)) {
            return false;
        }
        m35 m35 = (m35) aVar;
        return C46238a.m51546a(this.f137822d, m35.f137822d) && C46238a.m51546a(Boolean.valueOf(this.f137823e), Boolean.valueOf(m35.f137823e)) && C46238a.m51546a(Integer.valueOf(this.f137824f), Integer.valueOf(m35.f137824f)) && C46238a.m51546a(Integer.valueOf(this.f137825g), Integer.valueOf(m35.f137825g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137822d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f137823e);
            aVar.mo74318e(3, this.f137824f);
            aVar.mo74318e(4, this.f137825g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f137822d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58674a(2, this.f137823e) + C52418a.m58678e(3, this.f137824f) + C52418a.m58678e(4, this.f137825g);
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
            m35 m35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m35.f137822d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                m35.f137823e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                m35.f137824f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                m35.f137825g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
