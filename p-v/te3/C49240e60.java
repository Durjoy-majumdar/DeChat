package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e60 */
public class C49240e60 extends C47465a {

    /* renamed from: d */
    public String f132725d;

    /* renamed from: e */
    public String f132726e;

    /* renamed from: f */
    public String f132727f;

    /* renamed from: g */
    public String f132728g;

    /* renamed from: h */
    public String f132729h;

    /* renamed from: i */
    public String f132730i;

    /* renamed from: j */
    public String f132731j;

    /* renamed from: n */
    public String f132732n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49240e60)) {
            return false;
        }
        C49240e60 e602 = (C49240e60) aVar;
        return C46238a.m51546a(this.f132725d, e602.f132725d) && C46238a.m51546a(this.f132726e, e602.f132726e) && C46238a.m51546a(this.f132727f, e602.f132727f) && C46238a.m51546a(this.f132728g, e602.f132728g) && C46238a.m51546a(this.f132729h, e602.f132729h) && C46238a.m51546a(this.f132730i, e602.f132730i) && C46238a.m51546a(this.f132731j, e602.f132731j) && C46238a.m51546a(this.f132732n, e602.f132732n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132725d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132726e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132727f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132728g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f132729h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f132730i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f132731j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f132732n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f132725d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f132726e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f132727f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f132728g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f132729h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f132730i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f132731j;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f132732n;
            return str16 != null ? i2 + C52418a.m58683j(8, str16) : i2;
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
            C49240e60 e602 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e602.f132725d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e602.f132726e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e602.f132727f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e602.f132728g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e602.f132729h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e602.f132730i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e602.f132731j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e602.f132732n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
