package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hq3 */
public class C118437hq3 extends C47465a {

    /* renamed from: d */
    public String f354039d;

    /* renamed from: e */
    public String f354040e;

    /* renamed from: f */
    public String f354041f;

    /* renamed from: g */
    public String f354042g;

    /* renamed from: h */
    public String f354043h;

    /* renamed from: i */
    public String f354044i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118437hq3)) {
            return false;
        }
        C118437hq3 hq32 = (C118437hq3) aVar;
        return C46238a.m51546a(this.f354039d, hq32.f354039d) && C46238a.m51546a(this.f354040e, hq32.f354040e) && C46238a.m51546a(this.f354041f, hq32.f354041f) && C46238a.m51546a(this.f354042g, hq32.f354042g) && C46238a.m51546a(this.f354043h, hq32.f354043h) && C46238a.m51546a(this.f354044i, hq32.f354044i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354039d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354040e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354041f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f354042g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f354043h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f354044i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f354039d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f354040e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f354041f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f354042g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f354043h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f354044i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            C118437hq3 hq32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hq32.f354039d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hq32.f354040e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hq32.f354041f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hq32.f354042g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hq32.f354043h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hq32.f354044i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f354039d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "NickName", str, false);
            aVar.mo71655d(jSONObject, "PwdHash", this.f354040e, false);
            aVar.mo71655d(jSONObject, "HeadImgMd5", this.f354041f, false);
            aVar.mo71655d(jSONObject, "PhoneNumber", this.f354042g, false);
            aVar.mo71655d(jSONObject, "TimeZone", this.f354043h, false);
            aVar.mo71655d(jSONObject, "TimeZoneName", this.f354044i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
