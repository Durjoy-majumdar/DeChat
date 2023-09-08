package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n30 */
public class C50488n30 extends C47465a {

    /* renamed from: d */
    public int f138362d;

    /* renamed from: e */
    public int f138363e;

    /* renamed from: f */
    public String f138364f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50488n30)) {
            return false;
        }
        C50488n30 n302 = (C50488n30) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138362d), Integer.valueOf(n302.f138362d)) && C46238a.m51546a(Integer.valueOf(this.f138363e), Integer.valueOf(n302.f138363e)) && C46238a.m51546a(this.f138364f, n302.f138364f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138362d);
            aVar.mo74318e(2, this.f138363e);
            String str = this.f138364f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138362d) + 0 + C52418a.m58678e(2, this.f138363e);
            String str2 = this.f138364f;
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
            C50488n30 n302 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n302.f138362d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                n302.f138363e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n302.f138364f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
