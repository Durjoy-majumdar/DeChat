package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class g05 extends C47465a {

    /* renamed from: d */
    public long f133770d;

    /* renamed from: e */
    public String f133771e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof g05)) {
            return false;
        }
        g05 g05 = (g05) aVar;
        return C46238a.m51546a(Long.valueOf(this.f133770d), Long.valueOf(g05.f133770d)) && C46238a.m51546a(this.f133771e, g05.f133771e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133771e != null) {
                aVar.mo74321h(1, this.f133770d);
                String str = this.f133771e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f133770d) + 0;
            String str2 = this.f133771e;
            return str2 != null ? h + C52418a.m58683j(2, str2) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133771e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            g05 g05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g05.f133770d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                g05.f133771e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
