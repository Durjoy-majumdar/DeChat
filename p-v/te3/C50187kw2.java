package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kw2 */
public class C50187kw2 extends C47465a {

    /* renamed from: d */
    public int f137069d;

    /* renamed from: e */
    public String f137070e;

    /* renamed from: f */
    public String f137071f;

    /* renamed from: g */
    public int f137072g;

    /* renamed from: h */
    public String f137073h;

    /* renamed from: i */
    public int f137074i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50187kw2)) {
            return false;
        }
        C50187kw2 kw22 = (C50187kw2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137069d), Integer.valueOf(kw22.f137069d)) && C46238a.m51546a(this.f137070e, kw22.f137070e) && C46238a.m51546a(this.f137071f, kw22.f137071f) && C46238a.m51546a(Integer.valueOf(this.f137072g), Integer.valueOf(kw22.f137072g)) && C46238a.m51546a(this.f137073h, kw22.f137073h) && C46238a.m51546a(Integer.valueOf(this.f137074i), Integer.valueOf(kw22.f137074i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137070e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f137071f != null) {
                aVar.mo74318e(1, this.f137069d);
                String str = this.f137070e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f137071f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f137072g);
                String str3 = this.f137073h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f137074i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThumbUrl");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137069d) + 0;
            String str4 = this.f137070e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f137071f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f137072g);
            String str6 = this.f137073h;
            if (str6 != null) {
                e2 += C52418a.m58683j(5, str6);
            }
            return e2 + C52418a.m58678e(6, this.f137074i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137070e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f137071f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ThumbUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50187kw2 kw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kw22.f137069d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    kw22.f137070e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kw22.f137071f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kw22.f137072g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kw22.f137073h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kw22.f137074i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
