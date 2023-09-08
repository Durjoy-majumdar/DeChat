package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lu2 */
public class C64536lu2 extends C47465a {

    /* renamed from: d */
    public String f184157d;

    /* renamed from: e */
    public long f184158e;

    /* renamed from: f */
    public long f184159f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64536lu2)) {
            return false;
        }
        C64536lu2 lu22 = (C64536lu2) aVar;
        return C46238a.m51546a(this.f184157d, lu22.f184157d) && C46238a.m51546a(Long.valueOf(this.f184158e), Long.valueOf(lu22.f184158e)) && C46238a.m51546a(Long.valueOf(this.f184159f), Long.valueOf(lu22.f184159f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184157d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f184158e);
                aVar.mo74321h(3, this.f184159f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i == 1) {
            String str2 = this.f184157d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f184158e) + C52418a.m58681h(3, this.f184159f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184157d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64536lu2 lu22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lu22.f184157d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lu22.f184158e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lu22.f184159f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
