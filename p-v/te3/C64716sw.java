package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sw */
public class C64716sw extends C47465a {

    /* renamed from: d */
    public String f185450d;

    /* renamed from: e */
    public double f185451e;

    /* renamed from: f */
    public double f185452f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64716sw)) {
            return false;
        }
        C64716sw swVar = (C64716sw) aVar;
        return C46238a.m51546a(this.f185450d, swVar.f185450d) && C46238a.m51546a(Double.valueOf(this.f185451e), Double.valueOf(swVar.f185451e)) && C46238a.m51546a(Double.valueOf(this.f185452f), Double.valueOf(swVar.f185452f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185450d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74316c(2, this.f185451e);
            aVar.mo74316c(3, this.f185452f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f185450d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58676c(2, this.f185451e) + C52418a.m58676c(3, this.f185452f);
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
            C64716sw swVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                swVar.f185450d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                swVar.f185451e = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                swVar.f185452f = aVar3.mo141627e(intValue);
                return 0;
            }
        }
    }
}
