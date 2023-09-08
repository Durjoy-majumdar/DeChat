package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s11 */
public class C51188s11 extends C47465a {

    /* renamed from: d */
    public int f141264d;

    /* renamed from: e */
    public String f141265e;

    /* renamed from: f */
    public String f141266f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51188s11)) {
            return false;
        }
        C51188s11 s112 = (C51188s11) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141264d), Integer.valueOf(s112.f141264d)) && C46238a.m51546a(this.f141265e, s112.f141265e) && C46238a.m51546a(this.f141266f, s112.f141266f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141264d);
            String str = this.f141265e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141266f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141264d) + 0;
            String str3 = this.f141265e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f141266f;
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
            C51188s11 s112 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s112.f141264d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                s112.f141265e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                s112.f141266f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
