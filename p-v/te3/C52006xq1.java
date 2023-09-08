package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xq1 */
public class C52006xq1 extends C47465a {

    /* renamed from: d */
    public int f144874d;

    /* renamed from: e */
    public String f144875e;

    /* renamed from: f */
    public String f144876f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52006xq1)) {
            return false;
        }
        C52006xq1 xq12 = (C52006xq1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144874d), Integer.valueOf(xq12.f144874d)) && C46238a.m51546a(this.f144875e, xq12.f144875e) && C46238a.m51546a(this.f144876f, xq12.f144876f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144874d);
            String str = this.f144875e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144876f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144874d) + 0;
            String str3 = this.f144875e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f144876f;
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
            C52006xq1 xq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xq12.f144874d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                xq12.f144875e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xq12.f144876f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
