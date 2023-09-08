package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wg0 */
public class C51828wg0 extends C47465a {

    /* renamed from: d */
    public String f144032d;

    /* renamed from: e */
    public String f144033e;

    /* renamed from: f */
    public int f144034f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51828wg0)) {
            return false;
        }
        C51828wg0 wg02 = (C51828wg0) aVar;
        return C46238a.m51546a(this.f144032d, wg02.f144032d) && C46238a.m51546a(this.f144033e, wg02.f144033e) && C46238a.m51546a(Integer.valueOf(this.f144034f), Integer.valueOf(wg02.f144034f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144032d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144033e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f144034f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f144032d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f144033e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f144034f);
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
            C51828wg0 wg02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wg02.f144032d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wg02.f144033e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                wg02.f144034f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
