package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class b15 extends C47465a {

    /* renamed from: d */
    public String f130891d;

    /* renamed from: e */
    public long f130892e;

    /* renamed from: f */
    public boolean f130893f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b15)) {
            return false;
        }
        b15 b15 = (b15) aVar;
        return C46238a.m51546a(this.f130891d, b15.f130891d) && C46238a.m51546a(Long.valueOf(this.f130892e), Long.valueOf(b15.f130892e)) && C46238a.m51546a(Boolean.valueOf(this.f130893f), Boolean.valueOf(b15.f130893f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130891d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f130892e);
                aVar.mo74314a(3, this.f130893f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i == 1) {
            String str2 = this.f130891d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f130892e) + C52418a.m58674a(3, this.f130893f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130891d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            b15 b15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b15.f130891d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                b15.f130892e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                b15.f130893f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
