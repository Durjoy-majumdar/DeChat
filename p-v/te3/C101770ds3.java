package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ds3 */
public class C101770ds3 extends C47465a {

    /* renamed from: d */
    public String f298122d;

    /* renamed from: e */
    public String f298123e;

    /* renamed from: f */
    public String f298124f;

    /* renamed from: g */
    public String f298125g;

    /* renamed from: h */
    public String f298126h;

    /* renamed from: i */
    public String f298127i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101770ds3)) {
            return false;
        }
        C101770ds3 ds32 = (C101770ds3) aVar;
        return C46238a.m51546a(this.f298122d, ds32.f298122d) && C46238a.m51546a(this.f298123e, ds32.f298123e) && C46238a.m51546a(this.f298124f, ds32.f298124f) && C46238a.m51546a(this.f298125g, ds32.f298125g) && C46238a.m51546a(this.f298126h, ds32.f298126h) && C46238a.m51546a(this.f298127i, ds32.f298127i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298122d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: FileID");
            } else if (this.f298123e == null) {
                throw new C52419b("Not all required fields were included: AesKey");
            } else if (this.f298124f == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f298125g == null) {
                throw new C52419b("Not all required fields were included: OriginFileID");
            } else if (this.f298126h == null) {
                throw new C52419b("Not all required fields were included: OriginAesKey");
            } else if (this.f298127i != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f298123e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f298124f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f298125g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f298126h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                String str6 = this.f298127i;
                if (str6 != null) {
                    aVar.mo74323j(6, str6);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OriginMD5");
            }
        } else if (i == 1) {
            String str7 = this.f298122d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f298123e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f298124f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f298125g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f298126h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f298127i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298122d == null) {
                throw new C52419b("Not all required fields were included: FileID");
            } else if (this.f298123e == null) {
                throw new C52419b("Not all required fields were included: AesKey");
            } else if (this.f298124f == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f298125g == null) {
                throw new C52419b("Not all required fields were included: OriginFileID");
            } else if (this.f298126h == null) {
                throw new C52419b("Not all required fields were included: OriginAesKey");
            } else if (this.f298127i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OriginMD5");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101770ds3 ds32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ds32.f298122d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ds32.f298123e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ds32.f298124f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ds32.f298125g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ds32.f298126h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ds32.f298127i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
