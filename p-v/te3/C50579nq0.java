package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nq0 */
public class C50579nq0 extends C47465a {

    /* renamed from: d */
    public int f138717d;

    /* renamed from: e */
    public int f138718e;

    /* renamed from: f */
    public String f138719f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50579nq0)) {
            return false;
        }
        C50579nq0 nq02 = (C50579nq0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138717d), Integer.valueOf(nq02.f138717d)) && C46238a.m51546a(Integer.valueOf(this.f138718e), Integer.valueOf(nq02.f138718e)) && C46238a.m51546a(this.f138719f, nq02.f138719f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138717d);
            aVar.mo74318e(2, this.f138718e);
            String str = this.f138719f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138717d) + 0 + C52418a.m58678e(2, this.f138718e);
            String str2 = this.f138719f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C50579nq0 nq02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nq02.f138717d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nq02.f138718e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nq02.f138719f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
