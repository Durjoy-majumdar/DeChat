package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u24 */
public class C51486u24 extends C47465a {

    /* renamed from: d */
    public String f142569d;

    /* renamed from: e */
    public long f142570e;

    /* renamed from: f */
    public long f142571f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51486u24)) {
            return false;
        }
        C51486u24 u242 = (C51486u24) aVar;
        return C46238a.m51546a(this.f142569d, u242.f142569d) && C46238a.m51546a(Long.valueOf(this.f142570e), Long.valueOf(u242.f142570e)) && C46238a.m51546a(Long.valueOf(this.f142571f), Long.valueOf(u242.f142571f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142569d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f142570e);
            aVar.mo74321h(3, this.f142571f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f142569d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f142570e) + C52418a.m58681h(3, this.f142571f);
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
            C51486u24 u242 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u242.f142569d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                u242.f142570e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                u242.f142571f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
