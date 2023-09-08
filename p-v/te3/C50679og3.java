package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.og3 */
public class C50679og3 extends C47465a {

    /* renamed from: d */
    public int f139164d;

    /* renamed from: e */
    public String f139165e;

    /* renamed from: f */
    public String f139166f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50679og3)) {
            return false;
        }
        C50679og3 og32 = (C50679og3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139164d), Integer.valueOf(og32.f139164d)) && C46238a.m51546a(this.f139165e, og32.f139165e) && C46238a.m51546a(this.f139166f, og32.f139166f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139164d);
            String str = this.f139165e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139166f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139164d) + 0;
            String str3 = this.f139165e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f139166f;
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
            C50679og3 og32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                og32.f139164d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                og32.f139165e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                og32.f139166f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
