package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c43 */
public class C48956c43 extends C47465a {

    /* renamed from: d */
    public String f131503d;

    /* renamed from: e */
    public String f131504e;

    /* renamed from: f */
    public String f131505f;

    /* renamed from: g */
    public int f131506g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48956c43)) {
            return false;
        }
        C48956c43 c432 = (C48956c43) aVar;
        return C46238a.m51546a(this.f131503d, c432.f131503d) && C46238a.m51546a(this.f131504e, c432.f131504e) && C46238a.m51546a(this.f131505f, c432.f131505f) && C46238a.m51546a(Integer.valueOf(this.f131506g), Integer.valueOf(c432.f131506g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131503d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131504e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131505f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f131506g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f131503d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f131504e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f131505f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f131506g);
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
            C48956c43 c432 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c432.f131503d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                c432.f131504e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                c432.f131505f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                c432.f131506g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
