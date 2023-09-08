package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d53 */
public class C49100d53 extends C47465a {

    /* renamed from: d */
    public long f132134d;

    /* renamed from: e */
    public String f132135e;

    /* renamed from: f */
    public long f132136f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49100d53)) {
            return false;
        }
        C49100d53 d532 = (C49100d53) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132134d), Long.valueOf(d532.f132134d)) && C46238a.m51546a(this.f132135e, d532.f132135e) && C46238a.m51546a(Long.valueOf(this.f132136f), Long.valueOf(d532.f132136f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132134d);
            String str = this.f132135e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f132136f);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f132134d) + 0;
            String str2 = this.f132135e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58681h(3, this.f132136f);
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
            C49100d53 d532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d532.f132134d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                d532.f132135e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                d532.f132136f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
