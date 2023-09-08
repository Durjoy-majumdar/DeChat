package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p70 */
public class C50791p70 extends C47465a {

    /* renamed from: d */
    public int f139614d;

    /* renamed from: e */
    public String f139615e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50791p70)) {
            return false;
        }
        C50791p70 p702 = (C50791p70) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139614d), Integer.valueOf(p702.f139614d)) && C46238a.m51546a(this.f139615e, p702.f139615e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f139615e != null) {
                aVar.mo74318e(1, this.f139614d);
                String str = this.f139615e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: TagDesc");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139614d) + 0;
            String str2 = this.f139615e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139615e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: TagDesc");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50791p70 p702 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p702.f139614d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                p702.f139615e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
