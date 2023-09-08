package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wn */
public class C51854wn extends C47465a {

    /* renamed from: d */
    public String f144151d;

    /* renamed from: e */
    public String f144152e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51854wn)) {
            return false;
        }
        C51854wn wnVar = (C51854wn) aVar;
        return C46238a.m51546a(this.f144151d, wnVar.f144151d) && C46238a.m51546a(this.f144152e, wnVar.f144152e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144151d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144152e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f144151d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f144152e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51854wn wnVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wnVar.f144151d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                wnVar.f144152e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
