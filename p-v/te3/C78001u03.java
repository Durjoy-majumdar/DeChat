package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u03 */
public class C78001u03 extends C47465a {

    /* renamed from: d */
    public String f228275d;

    /* renamed from: e */
    public String f228276e;

    /* renamed from: f */
    public String f228277f;

    /* renamed from: g */
    public boolean f228278g;

    /* renamed from: h */
    public String f228279h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78001u03)) {
            return false;
        }
        C78001u03 u032 = (C78001u03) aVar;
        return C46238a.m51546a(this.f228275d, u032.f228275d) && C46238a.m51546a(this.f228276e, u032.f228276e) && C46238a.m51546a(this.f228277f, u032.f228277f) && C46238a.m51546a(Boolean.valueOf(this.f228278g), Boolean.valueOf(u032.f228278g)) && C46238a.m51546a(this.f228279h, u032.f228279h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228275d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228276e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f228277f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74314a(4, this.f228278g);
            String str4 = this.f228279h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f228275d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f228276e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f228277f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int a = i2 + C52418a.m58674a(4, this.f228278g);
            String str8 = this.f228279h;
            return str8 != null ? a + C52418a.m58683j(5, str8) : a;
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
            C78001u03 u032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u032.f228275d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                u032.f228276e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                u032.f228277f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                u032.f228278g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                u032.f228279h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
