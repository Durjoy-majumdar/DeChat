package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qf4 extends C47465a {

    /* renamed from: d */
    public int f140285d;

    /* renamed from: e */
    public String f140286e;

    /* renamed from: f */
    public String f140287f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qf4)) {
            return false;
        }
        qf4 qf4 = (qf4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140285d), Integer.valueOf(qf4.f140285d)) && C46238a.m51546a(this.f140286e, qf4.f140286e) && C46238a.m51546a(this.f140287f, qf4.f140287f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140285d);
            String str = this.f140286e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140287f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140285d) + 0;
            String str3 = this.f140286e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f140287f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            qf4 qf4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qf4.f140285d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                qf4.f140286e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qf4.f140287f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
