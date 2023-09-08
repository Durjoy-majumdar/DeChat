package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v10 */
public class C51627v10 extends C47465a {

    /* renamed from: d */
    public boolean f143237d;

    /* renamed from: e */
    public int f143238e;

    /* renamed from: f */
    public String f143239f;

    /* renamed from: g */
    public String f143240g;

    /* renamed from: h */
    public String f143241h;

    /* renamed from: i */
    public String f143242i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51627v10)) {
            return false;
        }
        C51627v10 v102 = (C51627v10) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f143237d), Boolean.valueOf(v102.f143237d)) && C46238a.m51546a(Integer.valueOf(this.f143238e), Integer.valueOf(v102.f143238e)) && C46238a.m51546a(this.f143239f, v102.f143239f) && C46238a.m51546a(this.f143240g, v102.f143240g) && C46238a.m51546a(this.f143241h, v102.f143241h) && C46238a.m51546a(this.f143242i, v102.f143242i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f143237d);
            aVar.mo74318e(2, this.f143238e);
            String str = this.f143239f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f143240g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f143241h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f143242i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f143237d) + 0 + C52418a.m58678e(2, this.f143238e);
            String str5 = this.f143239f;
            if (str5 != null) {
                a += C52418a.m58683j(3, str5);
            }
            String str6 = this.f143240g;
            if (str6 != null) {
                a += C52418a.m58683j(4, str6);
            }
            String str7 = this.f143241h;
            if (str7 != null) {
                a += C52418a.m58683j(5, str7);
            }
            String str8 = this.f143242i;
            return str8 != null ? a + C52418a.m58683j(6, str8) : a;
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
            C51627v10 v102 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v102.f143237d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    v102.f143238e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    v102.f143239f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    v102.f143240g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    v102.f143241h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v102.f143242i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
