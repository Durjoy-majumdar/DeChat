package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gx3 */
public class C101784gx3 extends C47465a {

    /* renamed from: d */
    public String f298318d;

    /* renamed from: e */
    public String f298319e;

    /* renamed from: f */
    public String f298320f;

    /* renamed from: g */
    public String f298321g;

    /* renamed from: h */
    public String f298322h;

    /* renamed from: i */
    public String f298323i;

    /* renamed from: j */
    public String f298324j;

    /* renamed from: n */
    public String f298325n;

    /* renamed from: o */
    public int f298326o;

    /* renamed from: p */
    public int f298327p;

    /* renamed from: q */
    public C89349b f298328q;

    /* renamed from: r */
    public String f298329r;

    /* renamed from: s */
    public C89349b f298330s;

    /* renamed from: t */
    public C89349b f298331t;

    /* renamed from: u */
    public int f298332u;

    /* renamed from: v */
    public String f298333v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101784gx3)) {
            return false;
        }
        C101784gx3 gx32 = (C101784gx3) aVar;
        return C46238a.m51546a(this.f298318d, gx32.f298318d) && C46238a.m51546a(this.f298319e, gx32.f298319e) && C46238a.m51546a(this.f298320f, gx32.f298320f) && C46238a.m51546a(this.f298321g, gx32.f298321g) && C46238a.m51546a(this.f298322h, gx32.f298322h) && C46238a.m51546a(this.f298323i, gx32.f298323i) && C46238a.m51546a(this.f298324j, gx32.f298324j) && C46238a.m51546a(this.f298325n, gx32.f298325n) && C46238a.m51546a(Integer.valueOf(this.f298326o), Integer.valueOf(gx32.f298326o)) && C46238a.m51546a(Integer.valueOf(this.f298327p), Integer.valueOf(gx32.f298327p)) && C46238a.m51546a(this.f298328q, gx32.f298328q) && C46238a.m51546a(this.f298329r, gx32.f298329r) && C46238a.m51546a(this.f298330s, gx32.f298330s) && C46238a.m51546a(this.f298331t, gx32.f298331t) && C46238a.m51546a(Integer.valueOf(this.f298332u), Integer.valueOf(gx32.f298332u)) && C46238a.m51546a(this.f298333v, gx32.f298333v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298318d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298319e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f298320f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f298321g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f298322h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f298323i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f298324j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f298325n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            aVar.mo74318e(9, this.f298326o);
            aVar.mo74318e(10, this.f298327p);
            C89349b bVar = this.f298328q;
            if (bVar != null) {
                aVar.mo74315b(11, bVar);
            }
            String str9 = this.f298329r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            C89349b bVar2 = this.f298330s;
            if (bVar2 != null) {
                aVar.mo74315b(13, bVar2);
            }
            C89349b bVar3 = this.f298331t;
            if (bVar3 != null) {
                aVar.mo74315b(14, bVar3);
            }
            aVar.mo74318e(15, this.f298332u);
            String str10 = this.f298333v;
            if (str10 != null) {
                aVar.mo74323j(16, str10);
            }
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f298318d;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.f298319e;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f298320f;
            if (str13 != null) {
                i3 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f298321g;
            if (str14 != null) {
                i3 += C52418a.m58683j(4, str14);
            }
            String str15 = this.f298322h;
            if (str15 != null) {
                i3 += C52418a.m58683j(5, str15);
            }
            String str16 = this.f298323i;
            if (str16 != null) {
                i3 += C52418a.m58683j(6, str16);
            }
            String str17 = this.f298324j;
            if (str17 != null) {
                i3 += C52418a.m58683j(7, str17);
            }
            String str18 = this.f298325n;
            if (str18 != null) {
                i3 += C52418a.m58683j(8, str18);
            }
            int e = i3 + C52418a.m58678e(9, this.f298326o) + C52418a.m58678e(10, this.f298327p);
            C89349b bVar4 = this.f298328q;
            if (bVar4 != null) {
                e += C52418a.m58675b(11, bVar4);
            }
            String str19 = this.f298329r;
            if (str19 != null) {
                e += C52418a.m58683j(12, str19);
            }
            C89349b bVar5 = this.f298330s;
            if (bVar5 != null) {
                e += C52418a.m58675b(13, bVar5);
            }
            C89349b bVar6 = this.f298331t;
            if (bVar6 != null) {
                e += C52418a.m58675b(14, bVar6);
            }
            int e2 = e + C52418a.m58678e(15, this.f298332u);
            String str20 = this.f298333v;
            return str20 != null ? e2 + C52418a.m58683j(16, str20) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101784gx3 gx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gx32.f298318d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gx32.f298319e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gx32.f298320f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gx32.f298321g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gx32.f298322h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gx32.f298323i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gx32.f298324j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gx32.f298325n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gx32.f298326o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    gx32.f298327p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    gx32.f298328q = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    gx32.f298329r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    gx32.f298330s = aVar3.mo141626d(intValue);
                    return 0;
                case 14:
                    gx32.f298331t = aVar3.mo141626d(intValue);
                    return 0;
                case 15:
                    gx32.f298332u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    gx32.f298333v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f298318d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Username", str, false);
            aVar.mo71655d(jSONObject, "NickName", this.f298319e, false);
            aVar.mo71655d(jSONObject, "Fullpy", this.f298320f, false);
            aVar.mo71655d(jSONObject, "AliasName", this.f298321g, false);
            aVar.mo71655d(jSONObject, "Country", this.f298322h, false);
            aVar.mo71655d(jSONObject, "Province", this.f298323i, false);
            aVar.mo71655d(jSONObject, "City", this.f298324j, false);
            aVar.mo71655d(jSONObject, "Signature", this.f298325n, false);
            aVar.mo71655d(jSONObject, "Sex", Integer.valueOf(this.f298326o), false);
            aVar.mo71655d(jSONObject, "VerifyFlag", Integer.valueOf(this.f298327p), false);
            aVar.mo71655d(jSONObject, "CertInfo", this.f298328q, false);
            aVar.mo71655d(jSONObject, "BrandIconUrl", this.f298329r, false);
            aVar.mo71655d(jSONObject, "ExternalInfo", this.f298330s, false);
            aVar.mo71655d(jSONObject, "BrandInfo", this.f298331t, false);
            aVar.mo71655d(jSONObject, "BrandFlag", Integer.valueOf(this.f298332u), false);
            aVar.mo71655d(jSONObject, "HeadImgUrl", this.f298333v, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
