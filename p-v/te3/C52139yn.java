package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yn */
public class C52139yn extends C47465a {

    /* renamed from: d */
    public int f145413d;

    /* renamed from: e */
    public String f145414e;

    /* renamed from: f */
    public String f145415f;

    /* renamed from: g */
    public int f145416g;

    /* renamed from: h */
    public int f145417h;

    /* renamed from: i */
    public String f145418i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52139yn)) {
            return false;
        }
        C52139yn ynVar = (C52139yn) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145413d), Integer.valueOf(ynVar.f145413d)) && C46238a.m51546a(this.f145414e, ynVar.f145414e) && C46238a.m51546a(this.f145415f, ynVar.f145415f) && C46238a.m51546a(Integer.valueOf(this.f145416g), Integer.valueOf(ynVar.f145416g)) && C46238a.m51546a(Integer.valueOf(this.f145417h), Integer.valueOf(ynVar.f145417h)) && C46238a.m51546a(this.f145418i, ynVar.f145418i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145413d);
            String str = this.f145414e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145415f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f145416g);
            aVar.mo74318e(5, this.f145417h);
            String str3 = this.f145418i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145413d) + 0;
            String str4 = this.f145414e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f145415f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f145416g) + C52418a.m58678e(5, this.f145417h);
            String str6 = this.f145418i;
            return str6 != null ? e2 + C52418a.m58683j(6, str6) : e2;
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
            C52139yn ynVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ynVar.f145413d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ynVar.f145414e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ynVar.f145415f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ynVar.f145416g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ynVar.f145417h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ynVar.f145418i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
