package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fh2 */
public class C49423fh2 extends C47465a {

    /* renamed from: d */
    public String f133496d;

    /* renamed from: e */
    public int f133497e;

    /* renamed from: f */
    public int f133498f;

    /* renamed from: g */
    public double f133499g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49423fh2)) {
            return false;
        }
        C49423fh2 fh22 = (C49423fh2) aVar;
        return C46238a.m51546a(this.f133496d, fh22.f133496d) && C46238a.m51546a(Integer.valueOf(this.f133497e), Integer.valueOf(fh22.f133497e)) && C46238a.m51546a(Integer.valueOf(this.f133498f), Integer.valueOf(fh22.f133498f)) && C46238a.m51546a(Double.valueOf(this.f133499g), Double.valueOf(fh22.f133499g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133496d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f133497e);
            aVar.mo74318e(3, this.f133498f);
            aVar.mo74316c(4, this.f133499g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f133496d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f133497e) + C52418a.m58678e(3, this.f133498f) + C52418a.m58676c(4, this.f133499g);
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
            C49423fh2 fh22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fh22.f133496d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                fh22.f133497e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                fh22.f133498f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                fh22.f133499g = aVar3.mo141627e(intValue);
                return 0;
            }
        }
    }
}
