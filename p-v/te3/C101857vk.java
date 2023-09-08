package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vk */
public class C101857vk extends C47465a {

    /* renamed from: d */
    public String f299675d;

    /* renamed from: e */
    public String f299676e;

    /* renamed from: f */
    public String f299677f;

    /* renamed from: g */
    public String f299678g;

    /* renamed from: h */
    public int f299679h;

    /* renamed from: i */
    public String f299680i;

    /* renamed from: j */
    public int f299681j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101857vk)) {
            return false;
        }
        C101857vk vkVar = (C101857vk) aVar;
        return C46238a.m51546a(this.f299675d, vkVar.f299675d) && C46238a.m51546a(this.f299676e, vkVar.f299676e) && C46238a.m51546a(this.f299677f, vkVar.f299677f) && C46238a.m51546a(this.f299678g, vkVar.f299678g) && C46238a.m51546a(Integer.valueOf(this.f299679h), Integer.valueOf(vkVar.f299679h)) && C46238a.m51546a(this.f299680i, vkVar.f299680i) && C46238a.m51546a(Integer.valueOf(this.f299681j), Integer.valueOf(vkVar.f299681j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299675d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299676e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299677f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299678g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f299679h);
            String str5 = this.f299680i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f299681j);
            return 0;
        } else if (i == 1) {
            String str6 = this.f299675d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f299676e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f299677f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f299678g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f299679h);
            String str10 = this.f299680i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            return e + C52418a.m58678e(7, this.f299681j);
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
            C101857vk vkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vkVar.f299675d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    vkVar.f299676e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    vkVar.f299677f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vkVar.f299678g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vkVar.f299679h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vkVar.f299680i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    vkVar.f299681j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
