package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d70 */
public class C101769d70 extends C47465a {

    /* renamed from: d */
    public long f298084d;

    /* renamed from: e */
    public long f298085e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101769d70)) {
            return false;
        }
        C101769d70 d702 = (C101769d70) aVar;
        return C46238a.m51546a(Long.valueOf(this.f298084d), Long.valueOf(d702.f298084d)) && C46238a.m51546a(Long.valueOf(this.f298085e), Long.valueOf(d702.f298085e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f298084d);
            aVar.mo74321h(2, this.f298085e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f298084d) + 0 + C52418a.m58681h(2, this.f298085e);
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
                C101769d70 d702 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    d702.f298084d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    d702.f298085e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
