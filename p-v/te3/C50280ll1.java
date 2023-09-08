package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ll1 */
public class C50280ll1 extends C47465a {

    /* renamed from: d */
    public int f137500d;

    /* renamed from: e */
    public String f137501e;

    /* renamed from: f */
    public int f137502f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50280ll1)) {
            return false;
        }
        C50280ll1 ll12 = (C50280ll1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137500d), Integer.valueOf(ll12.f137500d)) && C46238a.m51546a(this.f137501e, ll12.f137501e) && C46238a.m51546a(Integer.valueOf(this.f137502f), Integer.valueOf(ll12.f137502f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137500d);
            String str = this.f137501e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f137502f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137500d) + 0;
            String str2 = this.f137501e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f137502f);
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
            C50280ll1 ll12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ll12.f137500d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ll12.f137501e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ll12.f137502f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
