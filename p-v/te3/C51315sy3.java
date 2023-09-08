package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sy3 */
public class C51315sy3 extends C47465a {

    /* renamed from: d */
    public String f141834d;

    /* renamed from: e */
    public String f141835e;

    /* renamed from: f */
    public String f141836f;

    /* renamed from: g */
    public String f141837g;

    /* renamed from: h */
    public int f141838h;

    /* renamed from: i */
    public int f141839i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51315sy3)) {
            return false;
        }
        C51315sy3 sy32 = (C51315sy3) aVar;
        return C46238a.m51546a(this.f141834d, sy32.f141834d) && C46238a.m51546a(this.f141835e, sy32.f141835e) && C46238a.m51546a(this.f141836f, sy32.f141836f) && C46238a.m51546a(this.f141837g, sy32.f141837g) && C46238a.m51546a(Integer.valueOf(this.f141838h), Integer.valueOf(sy32.f141838h)) && C46238a.m51546a(Integer.valueOf(this.f141839i), Integer.valueOf(sy32.f141839i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141834d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141835e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141836f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f141837g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f141838h);
            aVar.mo74318e(6, this.f141839i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f141834d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f141835e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f141836f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f141837g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f141838h) + C52418a.m58678e(6, this.f141839i);
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
            C51315sy3 sy32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sy32.f141834d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sy32.f141835e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sy32.f141836f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sy32.f141837g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sy32.f141838h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sy32.f141839i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f141834d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "UserName", str, false);
            aVar.mo71655d(jSONObject, "SourceDisplayName", this.f141835e, false);
            aVar.mo71655d(jSONObject, "ThumbUrl", this.f141836f, false);
            aVar.mo71655d(jSONObject, "AppID", this.f141837g, false);
            aVar.mo71655d(jSONObject, "TradingGuaranteeFlag", Integer.valueOf(this.f141838h), false);
            aVar.mo71655d(jSONObject, "BrandOfficialFlag", Integer.valueOf(this.f141839i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
