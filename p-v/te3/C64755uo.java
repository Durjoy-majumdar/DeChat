package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uo */
public class C64755uo extends C47465a {

    /* renamed from: d */
    public String f185780d;

    /* renamed from: e */
    public long f185781e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64755uo)) {
            return false;
        }
        C64755uo uoVar = (C64755uo) aVar;
        return C46238a.m51546a(this.f185780d, uoVar.f185780d) && C46238a.m51546a(Long.valueOf(this.f185781e), Long.valueOf(uoVar.f185781e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185780d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f185781e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f185780d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f185781e);
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
            C64755uo uoVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uoVar.f185780d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                uoVar.f185781e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
