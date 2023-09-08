package bf2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.h */
public class C39765h extends C47465a {

    /* renamed from: d */
    public String f106715d;

    /* renamed from: e */
    public String f106716e;

    /* renamed from: f */
    public boolean f106717f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39765h)) {
            return false;
        }
        C39765h hVar = (C39765h) aVar;
        return C46238a.m51546a(this.f106715d, hVar.f106715d) && C46238a.m51546a(this.f106716e, hVar.f106716e) && C46238a.m51546a(Boolean.valueOf(this.f106717f), Boolean.valueOf(hVar.f106717f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106715d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f106716e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f106717f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f106715d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f106716e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f106717f);
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
            C39765h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hVar.f106715d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hVar.f106716e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                hVar.f106717f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
