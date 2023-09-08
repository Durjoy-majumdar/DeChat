package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.f0 */
public class C39578f0 extends C47465a {

    /* renamed from: d */
    public String f106242d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C39578f0) && C46238a.m51546a(this.f106242d, ((C39578f0) aVar).f106242d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106242d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: subject");
        } else if (i == 1) {
            String str2 = this.f106242d;
            if (str2 != null) {
                return 0 + C52418a.m58683j(1, str2);
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f106242d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: subject");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C39578f0 f0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            f0Var.f106242d = aVar3.mo141633k(intValue);
            return 0;
        }
    }
}
