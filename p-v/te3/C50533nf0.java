package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nf0 */
public class C50533nf0 extends C47465a {

    /* renamed from: d */
    public String f138579d;

    /* renamed from: e */
    public String f138580e;

    /* renamed from: f */
    public int f138581f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50533nf0)) {
            return false;
        }
        C50533nf0 nf02 = (C50533nf0) aVar;
        return C46238a.m51546a(this.f138579d, nf02.f138579d) && C46238a.m51546a(this.f138580e, nf02.f138580e) && C46238a.m51546a(Integer.valueOf(this.f138581f), Integer.valueOf(nf02.f138581f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138579d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138580e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f138581f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f138579d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138580e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f138581f);
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
            C50533nf0 nf02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nf02.f138579d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nf02.f138580e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nf02.f138581f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
