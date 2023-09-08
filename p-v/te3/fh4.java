package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fh4 extends C47465a {

    /* renamed from: d */
    public String f354001d = "";

    /* renamed from: e */
    public int f354002e = 0;

    /* renamed from: f */
    public long f354003f = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fh4)) {
            return false;
        }
        fh4 fh4 = (fh4) aVar;
        return C46238a.m51546a(this.f354001d, fh4.f354001d) && C46238a.m51546a(Integer.valueOf(this.f354002e), Integer.valueOf(fh4.f354002e)) && C46238a.m51546a(Long.valueOf(this.f354003f), Long.valueOf(fh4.f354003f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354001d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f354002e);
            aVar.mo74321h(3, this.f354003f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f354001d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f354002e) + C52418a.m58681h(3, this.f354003f);
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
            fh4 fh4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fh4.f354001d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                fh4.f354002e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                fh4.f354003f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
