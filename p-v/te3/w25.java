package te3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w25 extends C47465a {

    /* renamed from: d */
    public String f259899d;

    /* renamed from: e */
    public String f259900e;

    /* renamed from: f */
    public String f259901f;

    /* renamed from: g */
    public String f259902g;

    /* renamed from: h */
    public long f259903h;

    /* renamed from: i */
    public String f259904i;

    /* renamed from: j */
    public String f259905j;

    /* renamed from: n */
    public String f259906n;

    /* renamed from: o */
    public String f259907o;

    /* renamed from: p */
    public String f259908p;

    /* renamed from: q */
    public String f259909q;

    /* renamed from: r */
    public String f259910r;

    /* renamed from: s */
    public String f259911s;

    /* renamed from: t */
    public String f259912t;

    /* renamed from: u */
    public String f259913u;

    /* renamed from: v */
    public String f259914v;

    /* renamed from: w */
    public String f259915w;

    /* renamed from: x */
    public long f259916x;

    /* renamed from: y */
    public String f259917y;

    /* renamed from: z */
    public String f259918z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w25)) {
            return false;
        }
        w25 w25 = (w25) aVar;
        return C46238a.m51546a(this.f259899d, w25.f259899d) && C46238a.m51546a(this.f259900e, w25.f259900e) && C46238a.m51546a(this.f259901f, w25.f259901f) && C46238a.m51546a(this.f259902g, w25.f259902g) && C46238a.m51546a(Long.valueOf(this.f259903h), Long.valueOf(w25.f259903h)) && C46238a.m51546a(this.f259904i, w25.f259904i) && C46238a.m51546a(this.f259905j, w25.f259905j) && C46238a.m51546a(this.f259906n, w25.f259906n) && C46238a.m51546a(this.f259907o, w25.f259907o) && C46238a.m51546a(this.f259908p, w25.f259908p) && C46238a.m51546a(this.f259909q, w25.f259909q) && C46238a.m51546a(this.f259910r, w25.f259910r) && C46238a.m51546a(this.f259911s, w25.f259911s) && C46238a.m51546a(this.f259912t, w25.f259912t) && C46238a.m51546a(this.f259913u, w25.f259913u) && C46238a.m51546a(this.f259914v, w25.f259914v) && C46238a.m51546a(this.f259915w, w25.f259915w) && C46238a.m51546a(Long.valueOf(this.f259916x), Long.valueOf(w25.f259916x)) && C46238a.m51546a(this.f259917y, w25.f259917y) && C46238a.m51546a(this.f259918z, w25.f259918z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259899d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259900e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f259901f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f259902g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f259903h);
            String str5 = this.f259904i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f259905j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f259906n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f259907o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f259908p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            String str10 = this.f259909q;
            if (str10 != null) {
                aVar.mo74323j(11, str10);
            }
            String str11 = this.f259910r;
            if (str11 != null) {
                aVar.mo74323j(12, str11);
            }
            String str12 = this.f259911s;
            if (str12 != null) {
                aVar.mo74323j(13, str12);
            }
            String str13 = this.f259912t;
            if (str13 != null) {
                aVar.mo74323j(14, str13);
            }
            String str14 = this.f259913u;
            if (str14 != null) {
                aVar.mo74323j(15, str14);
            }
            String str15 = this.f259914v;
            if (str15 != null) {
                aVar.mo74323j(16, str15);
            }
            String str16 = this.f259915w;
            if (str16 != null) {
                aVar.mo74323j(17, str16);
            }
            aVar.mo74321h(18, this.f259916x);
            String str17 = this.f259917y;
            if (str17 != null) {
                aVar.mo74323j(19, str17);
            }
            String str18 = this.f259918z;
            if (str18 != null) {
                aVar.mo74323j(20, str18);
            }
            return 0;
        } else if (i2 == 1) {
            String str19 = this.f259899d;
            if (str19 != null) {
                i3 = C52418a.m58683j(1, str19) + 0;
            }
            String str20 = this.f259900e;
            if (str20 != null) {
                i3 += C52418a.m58683j(2, str20);
            }
            String str21 = this.f259901f;
            if (str21 != null) {
                i3 += C52418a.m58683j(3, str21);
            }
            String str22 = this.f259902g;
            if (str22 != null) {
                i3 += C52418a.m58683j(4, str22);
            }
            int h = i3 + C52418a.m58681h(5, this.f259903h);
            String str23 = this.f259904i;
            if (str23 != null) {
                h += C52418a.m58683j(6, str23);
            }
            String str24 = this.f259905j;
            if (str24 != null) {
                h += C52418a.m58683j(7, str24);
            }
            String str25 = this.f259906n;
            if (str25 != null) {
                h += C52418a.m58683j(8, str25);
            }
            String str26 = this.f259907o;
            if (str26 != null) {
                h += C52418a.m58683j(9, str26);
            }
            String str27 = this.f259908p;
            if (str27 != null) {
                h += C52418a.m58683j(10, str27);
            }
            String str28 = this.f259909q;
            if (str28 != null) {
                h += C52418a.m58683j(11, str28);
            }
            String str29 = this.f259910r;
            if (str29 != null) {
                h += C52418a.m58683j(12, str29);
            }
            String str30 = this.f259911s;
            if (str30 != null) {
                h += C52418a.m58683j(13, str30);
            }
            String str31 = this.f259912t;
            if (str31 != null) {
                h += C52418a.m58683j(14, str31);
            }
            String str32 = this.f259913u;
            if (str32 != null) {
                h += C52418a.m58683j(15, str32);
            }
            String str33 = this.f259914v;
            if (str33 != null) {
                h += C52418a.m58683j(16, str33);
            }
            String str34 = this.f259915w;
            if (str34 != null) {
                h += C52418a.m58683j(17, str34);
            }
            int h2 = h + C52418a.m58681h(18, this.f259916x);
            String str35 = this.f259917y;
            if (str35 != null) {
                h2 += C52418a.m58683j(19, str35);
            }
            String str36 = this.f259918z;
            return str36 != null ? h2 + C52418a.m58683j(20, str36) : h2;
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
            w25 w25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w25.f259899d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w25.f259900e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w25.f259901f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    w25.f259902g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w25.f259903h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    w25.f259904i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    w25.f259905j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    w25.f259906n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    w25.f259907o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    w25.f259908p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    w25.f259909q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    w25.f259910r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    w25.f259911s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    w25.f259912t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    w25.f259913u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    w25.f259914v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    w25.f259915w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    w25.f259916x = aVar3.mo141631i(intValue);
                    return 0;
                case 19:
                    w25.f259917y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    w25.f259918z = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f259899d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "relevant_vid", str, false);
            aVar.mo71655d(jSONObject, "relevant_expand", this.f259900e, false);
            aVar.mo71655d(jSONObject, "relevant_pre_searchid", this.f259901f, false);
            aVar.mo71655d(jSONObject, "relevant_shared_openid", this.f259902g, false);
            aVar.mo71655d(jSONObject, "rec_category", Long.valueOf(this.f259903h), false);
            aVar.mo71655d(jSONObject, "strPlayCount", this.f259904i, false);
            aVar.mo71655d(jSONObject, "shareUrl", this.f259905j, false);
            aVar.mo71655d(jSONObject, "shareTitle", this.f259906n, false);
            aVar.mo71655d(jSONObject, "shareDesc", this.f259907o, false);
            aVar.mo71655d(jSONObject, "shareImgUrl", this.f259908p, false);
            aVar.mo71655d(jSONObject, "shareString", this.f259909q, false);
            aVar.mo71655d(jSONObject, "shareStringUrl", this.f259910r, false);
            aVar.mo71655d(jSONObject, FirebaseAnalytics.C113379b.SOURCE, this.f259911s, false);
            aVar.mo71655d(jSONObject, "sourceUrl", this.f259912t, false);
            aVar.mo71655d(jSONObject, "titleUrl", this.f259913u, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f259914v, false);
            aVar.mo71655d(jSONObject, "tagList", this.f259915w, false);
            aVar.mo71655d(jSONObject, AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, Long.valueOf(this.f259916x), false);
            aVar.mo71655d(jSONObject, "thumbUrl", this.f259917y, false);
            aVar.mo71655d(jSONObject, "shareTag", this.f259918z, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
