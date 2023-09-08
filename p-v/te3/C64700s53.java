package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s53 */
public class C64700s53 extends C47465a {

    /* renamed from: d */
    public int f185345d;

    /* renamed from: e */
    public String f185346e;

    /* renamed from: f */
    public String f185347f;

    /* renamed from: g */
    public String f185348g;

    /* renamed from: h */
    public int f185349h;

    /* renamed from: i */
    public boolean f185350i;

    /* renamed from: j */
    public int f185351j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64700s53)) {
            return false;
        }
        C64700s53 s532 = (C64700s53) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185345d), Integer.valueOf(s532.f185345d)) && C46238a.m51546a(this.f185346e, s532.f185346e) && C46238a.m51546a(this.f185347f, s532.f185347f) && C46238a.m51546a(this.f185348g, s532.f185348g) && C46238a.m51546a(Integer.valueOf(this.f185349h), Integer.valueOf(s532.f185349h)) && C46238a.m51546a(Boolean.valueOf(this.f185350i), Boolean.valueOf(s532.f185350i)) && C46238a.m51546a(Integer.valueOf(this.f185351j), Integer.valueOf(s532.f185351j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185345d);
            String str = this.f185346e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185347f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185348g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f185349h);
            aVar.mo74314a(6, this.f185350i);
            aVar.mo74318e(7, this.f185351j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185345d) + 0;
            String str4 = this.f185346e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f185347f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f185348g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f185349h) + C52418a.m58674a(6, this.f185350i) + C52418a.m58678e(7, this.f185351j);
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
            C64700s53 s532 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s532.f185345d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    s532.f185346e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s532.f185347f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s532.f185348g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s532.f185349h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    s532.f185350i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    s532.f185351j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
