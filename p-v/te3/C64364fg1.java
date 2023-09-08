package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fg1 */
public class C64364fg1 extends C47465a {

    /* renamed from: d */
    public int f183130d;

    /* renamed from: e */
    public String f183131e;

    /* renamed from: f */
    public String f183132f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64364fg1)) {
            return false;
        }
        C64364fg1 fg12 = (C64364fg1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183130d), Integer.valueOf(fg12.f183130d)) && C46238a.m51546a(this.f183131e, fg12.f183131e) && C46238a.m51546a(this.f183132f, fg12.f183132f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183130d);
            String str = this.f183131e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f183132f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183130d) + 0;
            String str3 = this.f183131e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f183132f;
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
            C64364fg1 fg12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fg12.f183130d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                fg12.f183131e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                fg12.f183132f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
