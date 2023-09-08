package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.px3 */
public class C77981px3 extends C47465a {

    /* renamed from: d */
    public String f228046d;

    /* renamed from: e */
    public int f228047e;

    /* renamed from: f */
    public String f228048f;

    /* renamed from: g */
    public String f228049g;

    /* renamed from: h */
    public String f228050h;

    /* renamed from: i */
    public String f228051i;

    /* renamed from: j */
    public String f228052j;

    /* renamed from: n */
    public String f228053n;

    /* renamed from: o */
    public String f228054o;

    /* renamed from: p */
    public int f228055p;

    /* renamed from: q */
    public int f228056q;

    /* renamed from: r */
    public String f228057r;

    /* renamed from: s */
    public String f228058s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77981px3)) {
            return false;
        }
        C77981px3 px32 = (C77981px3) aVar;
        return C46238a.m51546a(this.f228046d, px32.f228046d) && C46238a.m51546a(Integer.valueOf(this.f228047e), Integer.valueOf(px32.f228047e)) && C46238a.m51546a(this.f228048f, px32.f228048f) && C46238a.m51546a(this.f228049g, px32.f228049g) && C46238a.m51546a(this.f228050h, px32.f228050h) && C46238a.m51546a(this.f228051i, px32.f228051i) && C46238a.m51546a(this.f228052j, px32.f228052j) && C46238a.m51546a(this.f228053n, px32.f228053n) && C46238a.m51546a(this.f228054o, px32.f228054o) && C46238a.m51546a(Integer.valueOf(this.f228055p), Integer.valueOf(px32.f228055p)) && C46238a.m51546a(Integer.valueOf(this.f228056q), Integer.valueOf(px32.f228056q)) && C46238a.m51546a(this.f228057r, px32.f228057r) && C46238a.m51546a(this.f228058s, px32.f228058s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228046d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f228047e);
            String str2 = this.f228048f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f228049g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f228050h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f228051i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f228052j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f228053n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f228054o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f228055p);
            aVar.mo74318e(11, this.f228056q);
            String str9 = this.f228057r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f228058s;
            if (str10 == null) {
                return 0;
            }
            aVar.mo74323j(13, str10);
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f228046d;
            int j = (str11 != null ? 0 + C52418a.m58683j(1, str11) : 0) + C52418a.m58678e(2, this.f228047e);
            String str12 = this.f228048f;
            if (str12 != null) {
                j += C52418a.m58683j(3, str12);
            }
            String str13 = this.f228049g;
            if (str13 != null) {
                j += C52418a.m58683j(4, str13);
            }
            String str14 = this.f228050h;
            if (str14 != null) {
                j += C52418a.m58683j(5, str14);
            }
            String str15 = this.f228051i;
            if (str15 != null) {
                j += C52418a.m58683j(6, str15);
            }
            String str16 = this.f228052j;
            if (str16 != null) {
                j += C52418a.m58683j(7, str16);
            }
            String str17 = this.f228053n;
            if (str17 != null) {
                j += C52418a.m58683j(8, str17);
            }
            String str18 = this.f228054o;
            if (str18 != null) {
                j += C52418a.m58683j(9, str18);
            }
            int e = j + C52418a.m58678e(10, this.f228055p) + C52418a.m58678e(11, this.f228056q);
            String str19 = this.f228057r;
            if (str19 != null) {
                e += C52418a.m58683j(12, str19);
            }
            String str20 = this.f228058s;
            return str20 != null ? e + C52418a.m58683j(13, str20) : e;
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
            C77981px3 px32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    px32.f228046d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    px32.f228047e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    px32.f228048f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    px32.f228049g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    px32.f228050h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    px32.f228051i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    px32.f228052j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    px32.f228053n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    px32.f228054o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    px32.f228055p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    px32.f228056q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    px32.f228057r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    px32.f228058s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f228046d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "EmoticonMD5", str, false);
            aVar.mo71655d(jSONObject, "EmoticonType", Integer.valueOf(this.f228047e), false);
            aVar.mo71655d(jSONObject, "EmoticonProductId", this.f228048f, false);
            aVar.mo71655d(jSONObject, "ThumbImgUrl", this.f228049g, false);
            aVar.mo71655d(jSONObject, "DesignerId", this.f228050h, false);
            aVar.mo71655d(jSONObject, "ActivityId", this.f228051i, false);
            aVar.mo71655d(jSONObject, "AttachedText", this.f228052j, false);
            aVar.mo71655d(jSONObject, "AttachedTextColor", this.f228053n, false);
            aVar.mo71655d(jSONObject, "LensId", this.f228054o, false);
            aVar.mo71655d(jSONObject, "EmoticonWidth", Integer.valueOf(this.f228055p), false);
            aVar.mo71655d(jSONObject, "EmoticonHeight", Integer.valueOf(this.f228056q), false);
            aVar.mo71655d(jSONObject, "EncryptUrl", this.f228057r, false);
            aVar.mo71655d(jSONObject, "AesKey", this.f228058s, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
