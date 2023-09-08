package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ct3 */
public class C101767ct3 extends C47465a {

    /* renamed from: d */
    public String f298056d;

    /* renamed from: e */
    public String f298057e;

    /* renamed from: f */
    public String f298058f;

    /* renamed from: g */
    public String f298059g;

    /* renamed from: h */
    public float f298060h;

    /* renamed from: i */
    public String f298061i;

    /* renamed from: j */
    public String f298062j;

    /* renamed from: n */
    public String f298063n;

    /* renamed from: o */
    public String f298064o;

    /* renamed from: p */
    public String f298065p;

    /* renamed from: q */
    public String f298066q;

    /* renamed from: r */
    public String f298067r;

    /* renamed from: s */
    public String f298068s;

    /* renamed from: t */
    public float f298069t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101767ct3)) {
            return false;
        }
        C101767ct3 ct32 = (C101767ct3) aVar;
        return C46238a.m51546a(this.f298056d, ct32.f298056d) && C46238a.m51546a(this.f298057e, ct32.f298057e) && C46238a.m51546a(this.f298058f, ct32.f298058f) && C46238a.m51546a(this.f298059g, ct32.f298059g) && C46238a.m51546a(Float.valueOf(this.f298060h), Float.valueOf(ct32.f298060h)) && C46238a.m51546a(this.f298061i, ct32.f298061i) && C46238a.m51546a(this.f298062j, ct32.f298062j) && C46238a.m51546a(this.f298063n, ct32.f298063n) && C46238a.m51546a(this.f298064o, ct32.f298064o) && C46238a.m51546a(this.f298065p, ct32.f298065p) && C46238a.m51546a(this.f298066q, ct32.f298066q) && C46238a.m51546a(this.f298067r, ct32.f298067r) && C46238a.m51546a(this.f298068s, ct32.f298068s) && C46238a.m51546a(Float.valueOf(this.f298069t), Float.valueOf(ct32.f298069t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298056d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: FileID");
            } else if (this.f298057e == null) {
                throw new C52419b("Not all required fields were included: AesKey");
            } else if (this.f298061i == null) {
                throw new C52419b("Not all required fields were included: ThumbFileID");
            } else if (this.f298062j == null) {
                throw new C52419b("Not all required fields were included: ThumbAesKey");
            } else if (this.f298063n == null) {
                throw new C52419b("Not all required fields were included: ThumbMD5");
            } else if (this.f298066q == null) {
                throw new C52419b("Not all required fields were included: OriginThumbFileID");
            } else if (this.f298067r == null) {
                throw new C52419b("Not all required fields were included: OriginThumbAesKey");
            } else if (this.f298068s != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f298057e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f298058f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f298059g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74317d(5, this.f298060h);
                String str5 = this.f298061i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                String str6 = this.f298062j;
                if (str6 != null) {
                    aVar.mo74323j(7, str6);
                }
                String str7 = this.f298063n;
                if (str7 != null) {
                    aVar.mo74323j(8, str7);
                }
                String str8 = this.f298064o;
                if (str8 != null) {
                    aVar.mo74323j(9, str8);
                }
                String str9 = this.f298065p;
                if (str9 != null) {
                    aVar.mo74323j(10, str9);
                }
                String str10 = this.f298066q;
                if (str10 != null) {
                    aVar.mo74323j(11, str10);
                }
                String str11 = this.f298067r;
                if (str11 != null) {
                    aVar.mo74323j(12, str11);
                }
                String str12 = this.f298068s;
                if (str12 != null) {
                    aVar.mo74323j(13, str12);
                }
                aVar.mo74317d(14, this.f298069t);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OriginThumbMD5");
            }
        } else if (i2 == 1) {
            String str13 = this.f298056d;
            if (str13 != null) {
                i3 = C52418a.m58683j(1, str13) + 0;
            }
            String str14 = this.f298057e;
            if (str14 != null) {
                i3 += C52418a.m58683j(2, str14);
            }
            String str15 = this.f298058f;
            if (str15 != null) {
                i3 += C52418a.m58683j(3, str15);
            }
            String str16 = this.f298059g;
            if (str16 != null) {
                i3 += C52418a.m58683j(4, str16);
            }
            int d = i3 + C52418a.m58677d(5, this.f298060h);
            String str17 = this.f298061i;
            if (str17 != null) {
                d += C52418a.m58683j(6, str17);
            }
            String str18 = this.f298062j;
            if (str18 != null) {
                d += C52418a.m58683j(7, str18);
            }
            String str19 = this.f298063n;
            if (str19 != null) {
                d += C52418a.m58683j(8, str19);
            }
            String str20 = this.f298064o;
            if (str20 != null) {
                d += C52418a.m58683j(9, str20);
            }
            String str21 = this.f298065p;
            if (str21 != null) {
                d += C52418a.m58683j(10, str21);
            }
            String str22 = this.f298066q;
            if (str22 != null) {
                d += C52418a.m58683j(11, str22);
            }
            String str23 = this.f298067r;
            if (str23 != null) {
                d += C52418a.m58683j(12, str23);
            }
            String str24 = this.f298068s;
            if (str24 != null) {
                d += C52418a.m58683j(13, str24);
            }
            return d + C52418a.m58677d(14, this.f298069t);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298056d == null) {
                throw new C52419b("Not all required fields were included: FileID");
            } else if (this.f298057e == null) {
                throw new C52419b("Not all required fields were included: AesKey");
            } else if (this.f298061i == null) {
                throw new C52419b("Not all required fields were included: ThumbFileID");
            } else if (this.f298062j == null) {
                throw new C52419b("Not all required fields were included: ThumbAesKey");
            } else if (this.f298063n == null) {
                throw new C52419b("Not all required fields were included: ThumbMD5");
            } else if (this.f298066q == null) {
                throw new C52419b("Not all required fields were included: OriginThumbFileID");
            } else if (this.f298067r == null) {
                throw new C52419b("Not all required fields were included: OriginThumbAesKey");
            } else if (this.f298068s != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OriginThumbMD5");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101767ct3 ct32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ct32.f298056d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ct32.f298057e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ct32.f298058f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ct32.f298059g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ct32.f298060h = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    ct32.f298061i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ct32.f298062j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ct32.f298063n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ct32.f298064o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ct32.f298065p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ct32.f298066q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ct32.f298067r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ct32.f298068s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ct32.f298069t = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
