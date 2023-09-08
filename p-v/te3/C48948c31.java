package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c31 */
public class C48948c31 extends C47465a {

    /* renamed from: d */
    public boolean f131477d;

    /* renamed from: e */
    public String f131478e;

    /* renamed from: f */
    public boolean f131479f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48948c31)) {
            return false;
        }
        C48948c31 c312 = (C48948c31) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f131477d), Boolean.valueOf(c312.f131477d)) && C46238a.m51546a(this.f131478e, c312.f131478e) && C46238a.m51546a(Boolean.valueOf(this.f131479f), Boolean.valueOf(c312.f131479f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f131477d);
            String str = this.f131478e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f131479f);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f131477d) + 0;
            String str2 = this.f131478e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            return a + C52418a.m58674a(3, this.f131479f);
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
            C48948c31 c312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c312.f131477d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                c312.f131478e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c312.f131479f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
