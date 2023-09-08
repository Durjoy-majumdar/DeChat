package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e05 extends C47465a {

    /* renamed from: d */
    public String f182913d;

    /* renamed from: e */
    public String f182914e;

    /* renamed from: f */
    public int f182915f;

    /* renamed from: g */
    public C89349b f182916g;

    /* renamed from: h */
    public String f182917h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e05)) {
            return false;
        }
        e05 e05 = (e05) aVar;
        return C46238a.m51546a(this.f182913d, e05.f182913d) && C46238a.m51546a(this.f182914e, e05.f182914e) && C46238a.m51546a(Integer.valueOf(this.f182915f), Integer.valueOf(e05.f182915f)) && C46238a.m51546a(this.f182916g, e05.f182916g) && C46238a.m51546a(this.f182917h, e05.f182917h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182913d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182914e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f182915f);
            C89349b bVar = this.f182916g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str3 = this.f182917h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f182913d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f182914e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f182915f);
            C89349b bVar2 = this.f182916g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            String str6 = this.f182917h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            e05 e05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e05.f182913d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e05.f182914e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e05.f182915f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                e05.f182916g = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                e05.f182917h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
