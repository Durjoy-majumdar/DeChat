package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mt2 */
public class C101816mt2 extends C47465a {

    /* renamed from: d */
    public String f298873d;

    /* renamed from: e */
    public int f298874e;

    /* renamed from: b */
    public C101816mt2 mo141223b(String str) {
        this.f298873d = str;
        return this;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101816mt2)) {
            return false;
        }
        C101816mt2 mt22 = (C101816mt2) aVar;
        return C46238a.m51546a(this.f298873d, mt22.f298873d) && C46238a.m51546a(Integer.valueOf(this.f298874e), Integer.valueOf(mt22.f298874e));
    }

    /* renamed from: d */
    public C101816mt2 mo141224d(int i) {
        this.f298874e = i;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298873d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f298874e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f298873d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f298874e);
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
            C101816mt2 mt22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mt22.f298873d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                mt22.f298874e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
