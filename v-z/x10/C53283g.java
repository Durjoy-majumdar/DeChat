package x10;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: x10.g */
public class C53283g extends C47465a {

    /* renamed from: d */
    public String f148874d;

    /* renamed from: e */
    public long f148875e;

    /* renamed from: f */
    public boolean f148876f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53283g)) {
            return false;
        }
        C53283g gVar = (C53283g) aVar;
        return C46238a.m51546a(this.f148874d, gVar.f148874d) && C46238a.m51546a(Long.valueOf(this.f148875e), Long.valueOf(gVar.f148875e)) && C46238a.m51546a(Boolean.valueOf(this.f148876f), Boolean.valueOf(gVar.f148876f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f148874d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f148875e);
            aVar.mo74314a(3, this.f148876f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f148874d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f148875e) + C52418a.m58674a(3, this.f148876f);
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
            C53283g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gVar.f148874d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gVar.f148875e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                gVar.f148876f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
