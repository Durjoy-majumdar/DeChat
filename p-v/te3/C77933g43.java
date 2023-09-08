package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g43 */
public class C77933g43 extends C47465a {

    /* renamed from: d */
    public int f227431d;

    /* renamed from: e */
    public String f227432e;

    /* renamed from: f */
    public String f227433f;

    /* renamed from: g */
    public String f227434g;

    /* renamed from: h */
    public String f227435h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77933g43)) {
            return false;
        }
        C77933g43 g432 = (C77933g43) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227431d), Integer.valueOf(g432.f227431d)) && C46238a.m51546a(this.f227432e, g432.f227432e) && C46238a.m51546a(this.f227433f, g432.f227433f) && C46238a.m51546a(this.f227434g, g432.f227434g) && C46238a.m51546a(this.f227435h, g432.f227435h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f227431d);
            String str = this.f227432e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227433f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227434g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f227435h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f227431d) + 0;
            String str5 = this.f227432e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f227433f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f227434g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f227435h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C77933g43 g432 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g432.f227431d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                g432.f227432e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                g432.f227433f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                g432.f227434g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                g432.f227435h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
