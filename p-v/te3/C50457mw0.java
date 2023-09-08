package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mw0 */
public class C50457mw0 extends C47465a {

    /* renamed from: d */
    public String f138243d;

    /* renamed from: e */
    public String f138244e;

    /* renamed from: f */
    public boolean f138245f;

    /* renamed from: g */
    public long f138246g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50457mw0)) {
            return false;
        }
        C50457mw0 mw02 = (C50457mw0) aVar;
        return C46238a.m51546a(this.f138243d, mw02.f138243d) && C46238a.m51546a(this.f138244e, mw02.f138244e) && C46238a.m51546a(Boolean.valueOf(this.f138245f), Boolean.valueOf(mw02.f138245f)) && C46238a.m51546a(Long.valueOf(this.f138246g), Long.valueOf(mw02.f138246g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138243d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138244e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f138245f);
            aVar.mo74321h(4, this.f138246g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f138243d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138244e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f138245f) + C52418a.m58681h(4, this.f138246g);
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
            C50457mw0 mw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mw02.f138243d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                mw02.f138244e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mw02.f138245f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                mw02.f138246g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
