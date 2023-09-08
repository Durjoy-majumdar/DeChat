package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hx3 */
public class C49767hx3 extends C47465a {

    /* renamed from: d */
    public String f134938d;

    /* renamed from: e */
    public String f134939e;

    /* renamed from: f */
    public String f134940f;

    /* renamed from: g */
    public String f134941g;

    /* renamed from: h */
    public int f134942h;

    /* renamed from: i */
    public String f134943i;

    /* renamed from: j */
    public String f134944j;

    /* renamed from: n */
    public String f134945n;

    /* renamed from: o */
    public int f134946o;

    /* renamed from: p */
    public int f134947p;

    /* renamed from: q */
    public int f134948q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49767hx3)) {
            return false;
        }
        C49767hx3 hx32 = (C49767hx3) aVar;
        return C46238a.m51546a(this.f134938d, hx32.f134938d) && C46238a.m51546a(this.f134939e, hx32.f134939e) && C46238a.m51546a(this.f134940f, hx32.f134940f) && C46238a.m51546a(this.f134941g, hx32.f134941g) && C46238a.m51546a(Integer.valueOf(this.f134942h), Integer.valueOf(hx32.f134942h)) && C46238a.m51546a(this.f134943i, hx32.f134943i) && C46238a.m51546a(this.f134944j, hx32.f134944j) && C46238a.m51546a(this.f134945n, hx32.f134945n) && C46238a.m51546a(Integer.valueOf(this.f134946o), Integer.valueOf(hx32.f134946o)) && C46238a.m51546a(Integer.valueOf(this.f134947p), Integer.valueOf(hx32.f134947p)) && C46238a.m51546a(Integer.valueOf(this.f134948q), Integer.valueOf(hx32.f134948q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134938d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134939e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134940f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f134941g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f134942h);
            String str5 = this.f134943i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f134944j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f134945n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f134946o);
            aVar.mo74318e(10, this.f134947p);
            aVar.mo74318e(11, this.f134948q);
            return 0;
        } else if (i == 1) {
            String str8 = this.f134938d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f134939e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f134940f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f134941g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            int e = i2 + C52418a.m58678e(5, this.f134942h);
            String str12 = this.f134943i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f134944j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f134945n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            return e + C52418a.m58678e(9, this.f134946o) + C52418a.m58678e(10, this.f134947p) + C52418a.m58678e(11, this.f134948q);
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
            C49767hx3 hx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hx32.f134938d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hx32.f134939e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hx32.f134940f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hx32.f134941g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hx32.f134942h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hx32.f134943i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hx32.f134944j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hx32.f134945n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hx32.f134946o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    hx32.f134947p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    hx32.f134948q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f134938d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", str, false);
            aVar.mo71655d(jSONObject, "Desc", this.f134939e, false);
            aVar.mo71655d(jSONObject, "ThumbUrl", this.f134940f, false);
            aVar.mo71655d(jSONObject, "Link", this.f134941g, false);
            aVar.mo71655d(jSONObject, "ItemShowType", Integer.valueOf(this.f134942h), false);
            aVar.mo71655d(jSONObject, "SourceUsername", this.f134943i, false);
            aVar.mo71655d(jSONObject, "SourceDisplayName", this.f134944j, false);
            aVar.mo71655d(jSONObject, "Vid", this.f134945n, false);
            aVar.mo71655d(jSONObject, "Duraion", Integer.valueOf(this.f134946o), false);
            aVar.mo71655d(jSONObject, "Width", Integer.valueOf(this.f134947p), false);
            aVar.mo71655d(jSONObject, "Height", Integer.valueOf(this.f134948q), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
