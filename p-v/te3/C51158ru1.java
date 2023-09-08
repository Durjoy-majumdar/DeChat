package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ru1 */
public class C51158ru1 extends C47465a {

    /* renamed from: d */
    public String f141151d;

    /* renamed from: e */
    public int f141152e;

    /* renamed from: f */
    public int f141153f;

    /* renamed from: g */
    public int f141154g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51158ru1)) {
            return false;
        }
        C51158ru1 ru12 = (C51158ru1) aVar;
        return C46238a.m51546a(this.f141151d, ru12.f141151d) && C46238a.m51546a(Integer.valueOf(this.f141152e), Integer.valueOf(ru12.f141152e)) && C46238a.m51546a(Integer.valueOf(this.f141153f), Integer.valueOf(ru12.f141153f)) && C46238a.m51546a(Integer.valueOf(this.f141154g), Integer.valueOf(ru12.f141154g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141151d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f141152e);
            aVar.mo74318e(3, this.f141153f);
            aVar.mo74318e(4, this.f141154g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f141151d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f141152e) + C52418a.m58678e(3, this.f141153f) + C52418a.m58678e(4, this.f141154g);
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
            C51158ru1 ru12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ru12.f141151d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ru12.f141152e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ru12.f141153f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ru12.f141154g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
