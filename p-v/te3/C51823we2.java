package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.we2 */
public class C51823we2 extends C47465a {

    /* renamed from: d */
    public int f143991d;

    /* renamed from: e */
    public String f143992e;

    /* renamed from: f */
    public String f143993f;

    /* renamed from: g */
    public String f143994g;

    /* renamed from: h */
    public String f143995h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51823we2)) {
            return false;
        }
        C51823we2 we22 = (C51823we2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143991d), Integer.valueOf(we22.f143991d)) && C46238a.m51546a(this.f143992e, we22.f143992e) && C46238a.m51546a(this.f143993f, we22.f143993f) && C46238a.m51546a(this.f143994g, we22.f143994g) && C46238a.m51546a(this.f143995h, we22.f143995h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143991d);
            String str = this.f143992e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f143993f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143994g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f143995h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143991d) + 0;
            String str5 = this.f143992e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143993f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f143994g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f143995h;
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
            C51823we2 we22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                we22.f143991d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                we22.f143992e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                we22.f143993f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                we22.f143994g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                we22.f143995h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
