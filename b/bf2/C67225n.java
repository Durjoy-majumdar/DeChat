package bf2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.n */
public class C67225n extends C47465a {

    /* renamed from: d */
    public String f193042d;

    /* renamed from: e */
    public String f193043e;

    /* renamed from: f */
    public String f193044f;

    /* renamed from: g */
    public String f193045g;

    /* renamed from: h */
    public int f193046h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67225n)) {
            return false;
        }
        C67225n nVar = (C67225n) aVar;
        return C46238a.m51546a(this.f193042d, nVar.f193042d) && C46238a.m51546a(this.f193043e, nVar.f193043e) && C46238a.m51546a(this.f193044f, nVar.f193044f) && C46238a.m51546a(this.f193045g, nVar.f193045g) && C46238a.m51546a(Integer.valueOf(this.f193046h), Integer.valueOf(nVar.f193046h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f193042d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f193043e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f193044f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f193045g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f193046h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f193042d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f193043e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f193044f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f193045g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f193046h);
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
            C67225n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nVar.f193042d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nVar.f193043e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                nVar.f193044f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                nVar.f193045g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                nVar.f193046h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
