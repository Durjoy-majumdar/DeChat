package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class s15 extends C47465a {

    /* renamed from: d */
    public int f141275d;

    /* renamed from: e */
    public int f141276e;

    /* renamed from: f */
    public long f141277f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s15)) {
            return false;
        }
        s15 s15 = (s15) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141275d), Integer.valueOf(s15.f141275d)) && C46238a.m51546a(Integer.valueOf(this.f141276e), Integer.valueOf(s15.f141276e)) && C46238a.m51546a(Long.valueOf(this.f141277f), Long.valueOf(s15.f141277f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141275d);
            aVar.mo74318e(2, this.f141276e);
            aVar.mo74321h(3, this.f141277f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f141275d) + 0 + C52418a.m58678e(2, this.f141276e) + C52418a.m58681h(3, this.f141277f);
        } else {
            if (i == 2) {
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
                s15 s15 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    s15.f141275d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    s15.f141276e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    s15.f141277f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
