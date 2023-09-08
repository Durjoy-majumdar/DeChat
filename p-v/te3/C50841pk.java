package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pk */
public class C50841pk extends C47465a {

    /* renamed from: d */
    public String f139797d;

    /* renamed from: e */
    public String f139798e;

    /* renamed from: f */
    public String f139799f;

    /* renamed from: g */
    public String f139800g;

    /* renamed from: h */
    public int f139801h;

    /* renamed from: i */
    public String f139802i;

    /* renamed from: j */
    public int f139803j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50841pk)) {
            return false;
        }
        C50841pk pkVar = (C50841pk) aVar;
        return C46238a.m51546a(this.f139797d, pkVar.f139797d) && C46238a.m51546a(this.f139798e, pkVar.f139798e) && C46238a.m51546a(this.f139799f, pkVar.f139799f) && C46238a.m51546a(this.f139800g, pkVar.f139800g) && C46238a.m51546a(Integer.valueOf(this.f139801h), Integer.valueOf(pkVar.f139801h)) && C46238a.m51546a(this.f139802i, pkVar.f139802i) && C46238a.m51546a(Integer.valueOf(this.f139803j), Integer.valueOf(pkVar.f139803j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139797d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f139798e == null) {
                throw new C52419b("Not all required fields were included: Url");
            } else if (this.f139799f == null) {
                throw new C52419b("Not all required fields were included: Position");
            } else if (this.f139800g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f139798e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f139799f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f139800g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f139801h);
                String str5 = this.f139802i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                aVar.mo74318e(7, this.f139803j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DetailInfo");
            }
        } else if (i == 1) {
            String str6 = this.f139797d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f139798e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f139799f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f139800g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f139801h);
            String str10 = this.f139802i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            return e + C52418a.m58678e(7, this.f139803j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139797d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f139798e == null) {
                throw new C52419b("Not all required fields were included: Url");
            } else if (this.f139799f == null) {
                throw new C52419b("Not all required fields were included: Position");
            } else if (this.f139800g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DetailInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50841pk pkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pkVar.f139797d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pkVar.f139798e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pkVar.f139799f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pkVar.f139800g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pkVar.f139801h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pkVar.f139802i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pkVar.f139803j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f139797d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", str, false);
            aVar.mo71655d(jSONObject, "Url", this.f139798e, false);
            aVar.mo71655d(jSONObject, "Position", this.f139799f, false);
            aVar.mo71655d(jSONObject, "DetailInfo", this.f139800g, false);
            aVar.mo71655d(jSONObject, "StarLevel", Integer.valueOf(this.f139801h), false);
            aVar.mo71655d(jSONObject, "Average", this.f139802i, false);
            aVar.mo71655d(jSONObject, "PoiFlag", Integer.valueOf(this.f139803j), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
