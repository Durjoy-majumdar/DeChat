package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t63 */
public class C51351t63 extends C47465a {

    /* renamed from: d */
    public String f141989d;

    /* renamed from: e */
    public String f141990e;

    /* renamed from: f */
    public String f141991f;

    /* renamed from: g */
    public String f141992g;

    /* renamed from: h */
    public String f141993h;

    /* renamed from: i */
    public String f141994i;

    /* renamed from: j */
    public String f141995j;

    /* renamed from: n */
    public boolean f141996n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51351t63)) {
            return false;
        }
        C51351t63 t632 = (C51351t63) aVar;
        return C46238a.m51546a(this.f141989d, t632.f141989d) && C46238a.m51546a(this.f141990e, t632.f141990e) && C46238a.m51546a(this.f141991f, t632.f141991f) && C46238a.m51546a(this.f141992g, t632.f141992g) && C46238a.m51546a(this.f141993h, t632.f141993h) && C46238a.m51546a(this.f141994i, t632.f141994i) && C46238a.m51546a(this.f141995j, t632.f141995j) && C46238a.m51546a(Boolean.valueOf(this.f141996n), Boolean.valueOf(t632.f141996n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141989d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141990e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141991f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f141992g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f141993h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f141994i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f141995j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74314a(8, this.f141996n);
            return 0;
        } else if (i == 1) {
            String str8 = this.f141989d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f141990e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f141991f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f141992g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f141993h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f141994i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f141995j;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            return i2 + C52418a.m58674a(8, this.f141996n);
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
            C51351t63 t632 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t632.f141989d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    t632.f141990e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t632.f141991f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t632.f141992g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t632.f141993h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t632.f141994i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t632.f141995j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    t632.f141996n = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f141989d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, false);
            aVar.mo71655d(jSONObject, "heading", this.f141990e, false);
            aVar.mo71655d(jSONObject, "desp", this.f141991f, false);
            aVar.mo71655d(jSONObject, "approve_button_wording", this.f141992g, false);
            aVar.mo71655d(jSONObject, "reject_button_wording", this.f141993h, false);
            aVar.mo71655d(jSONObject, "privacy_agreement_wording", this.f141994i, false);
            aVar.mo71655d(jSONObject, "privacy_agreement_url", this.f141995j, false);
            aVar.mo71655d(jSONObject, "is_force_archived", Boolean.valueOf(this.f141996n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
