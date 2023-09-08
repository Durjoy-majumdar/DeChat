package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cf0 */
public class C48995cf0 extends C47465a {

    /* renamed from: d */
    public String f131688d;

    /* renamed from: e */
    public String f131689e;

    /* renamed from: f */
    public int f131690f;

    /* renamed from: g */
    public int f131691g;

    /* renamed from: h */
    public int f131692h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48995cf0)) {
            return false;
        }
        C48995cf0 cf02 = (C48995cf0) aVar;
        return C46238a.m51546a(this.f131688d, cf02.f131688d) && C46238a.m51546a(this.f131689e, cf02.f131689e) && C46238a.m51546a(Integer.valueOf(this.f131690f), Integer.valueOf(cf02.f131690f)) && C46238a.m51546a(Integer.valueOf(this.f131691g), Integer.valueOf(cf02.f131691g)) && C46238a.m51546a(Integer.valueOf(this.f131692h), Integer.valueOf(cf02.f131692h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131688d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131689e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f131690f);
            aVar.mo74318e(4, this.f131691g);
            aVar.mo74318e(5, this.f131692h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f131688d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f131689e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f131690f) + C52418a.m58678e(4, this.f131691g) + C52418a.m58678e(5, this.f131692h);
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
            C48995cf0 cf02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cf02.f131688d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cf02.f131689e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cf02.f131690f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                cf02.f131691g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cf02.f131692h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
