package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qd1 */
public class C50946qd1 extends C47465a {

    /* renamed from: d */
    public int f140245d;

    /* renamed from: e */
    public String f140246e;

    /* renamed from: f */
    public String f140247f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50946qd1)) {
            return false;
        }
        C50946qd1 qd12 = (C50946qd1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140245d), Integer.valueOf(qd12.f140245d)) && C46238a.m51546a(this.f140246e, qd12.f140246e) && C46238a.m51546a(this.f140247f, qd12.f140247f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140245d);
            String str = this.f140246e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140247f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140245d) + 0;
            String str3 = this.f140246e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f140247f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C50946qd1 qd12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qd12.f140245d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                qd12.f140246e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qd12.f140247f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
