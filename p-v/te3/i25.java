package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class i25 extends C47465a {

    /* renamed from: A */
    public int f135041A;

    /* renamed from: B */
    public long f135042B;

    /* renamed from: C */
    public int f135043C;

    /* renamed from: D */
    public long f135044D;

    /* renamed from: E */
    public String f135045E;

    /* renamed from: F */
    public String f135046F;

    /* renamed from: G */
    public boolean f135047G;

    /* renamed from: H */
    public String f135048H;

    /* renamed from: I */
    public String f135049I;

    /* renamed from: d */
    public String f135050d;

    /* renamed from: e */
    public String f135051e;

    /* renamed from: f */
    public String f135052f;

    /* renamed from: g */
    public int f135053g;

    /* renamed from: h */
    public String f135054h;

    /* renamed from: i */
    public String f135055i;

    /* renamed from: j */
    public boolean f135056j;

    /* renamed from: n */
    public boolean f135057n;

    /* renamed from: o */
    public String f135058o;

    /* renamed from: p */
    public String f135059p;

    /* renamed from: q */
    public int f135060q;

    /* renamed from: r */
    public String f135061r;

    /* renamed from: s */
    public String f135062s;

    /* renamed from: t */
    public int f135063t;

    /* renamed from: u */
    public int f135064u;

    /* renamed from: v */
    public int f135065v;

    /* renamed from: w */
    public int f135066w;

    /* renamed from: x */
    public int f135067x;

    /* renamed from: y */
    public String f135068y;

    /* renamed from: z */
    public int f135069z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i25)) {
            return false;
        }
        i25 i25 = (i25) aVar;
        return C46238a.m51546a(this.f135050d, i25.f135050d) && C46238a.m51546a(this.f135051e, i25.f135051e) && C46238a.m51546a(this.f135052f, i25.f135052f) && C46238a.m51546a(Integer.valueOf(this.f135053g), Integer.valueOf(i25.f135053g)) && C46238a.m51546a(this.f135054h, i25.f135054h) && C46238a.m51546a(this.f135055i, i25.f135055i) && C46238a.m51546a(Boolean.valueOf(this.f135056j), Boolean.valueOf(i25.f135056j)) && C46238a.m51546a(Boolean.valueOf(this.f135057n), Boolean.valueOf(i25.f135057n)) && C46238a.m51546a(this.f135058o, i25.f135058o) && C46238a.m51546a(this.f135059p, i25.f135059p) && C46238a.m51546a(Integer.valueOf(this.f135060q), Integer.valueOf(i25.f135060q)) && C46238a.m51546a(this.f135061r, i25.f135061r) && C46238a.m51546a(this.f135062s, i25.f135062s) && C46238a.m51546a(Integer.valueOf(this.f135063t), Integer.valueOf(i25.f135063t)) && C46238a.m51546a(Integer.valueOf(this.f135064u), Integer.valueOf(i25.f135064u)) && C46238a.m51546a(Integer.valueOf(this.f135065v), Integer.valueOf(i25.f135065v)) && C46238a.m51546a(Integer.valueOf(this.f135066w), Integer.valueOf(i25.f135066w)) && C46238a.m51546a(Integer.valueOf(this.f135067x), Integer.valueOf(i25.f135067x)) && C46238a.m51546a(this.f135068y, i25.f135068y) && C46238a.m51546a(Integer.valueOf(this.f135069z), Integer.valueOf(i25.f135069z)) && C46238a.m51546a(Integer.valueOf(this.f135041A), Integer.valueOf(i25.f135041A)) && C46238a.m51546a(Long.valueOf(this.f135042B), Long.valueOf(i25.f135042B)) && C46238a.m51546a(Integer.valueOf(this.f135043C), Integer.valueOf(i25.f135043C)) && C46238a.m51546a(Long.valueOf(this.f135044D), Long.valueOf(i25.f135044D)) && C46238a.m51546a(this.f135045E, i25.f135045E) && C46238a.m51546a(this.f135046F, i25.f135046F) && C46238a.m51546a(Boolean.valueOf(this.f135047G), Boolean.valueOf(i25.f135047G)) && C46238a.m51546a(this.f135048H, i25.f135048H) && C46238a.m51546a(this.f135049I, i25.f135049I);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135050d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135051e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135052f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f135053g);
            String str4 = this.f135054h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f135055i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74314a(7, this.f135056j);
            aVar.mo74314a(8, this.f135057n);
            String str6 = this.f135058o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f135059p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f135060q);
            String str8 = this.f135061r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            String str9 = this.f135062s;
            if (str9 != null) {
                aVar.mo74323j(13, str9);
            }
            aVar.mo74318e(14, this.f135063t);
            aVar.mo74318e(15, this.f135064u);
            aVar.mo74318e(16, this.f135065v);
            aVar.mo74318e(17, this.f135066w);
            aVar.mo74318e(18, this.f135067x);
            String str10 = this.f135068y;
            if (str10 != null) {
                aVar.mo74323j(19, str10);
            }
            aVar.mo74318e(20, this.f135069z);
            aVar.mo74318e(21, this.f135041A);
            aVar.mo74321h(22, this.f135042B);
            aVar.mo74318e(23, this.f135043C);
            aVar.mo74321h(24, this.f135044D);
            String str11 = this.f135045E;
            if (str11 != null) {
                aVar.mo74323j(25, str11);
            }
            String str12 = this.f135046F;
            if (str12 != null) {
                aVar.mo74323j(26, str12);
            }
            aVar.mo74314a(27, this.f135047G);
            String str13 = this.f135048H;
            if (str13 != null) {
                aVar.mo74323j(28, str13);
            }
            String str14 = this.f135049I;
            if (str14 != null) {
                aVar.mo74323j(29, str14);
            }
            return 0;
        } else if (i2 == 1) {
            String str15 = this.f135050d;
            if (str15 != null) {
                i3 = C52418a.m58683j(1, str15) + 0;
            }
            String str16 = this.f135051e;
            if (str16 != null) {
                i3 += C52418a.m58683j(2, str16);
            }
            String str17 = this.f135052f;
            if (str17 != null) {
                i3 += C52418a.m58683j(3, str17);
            }
            int e = i3 + C52418a.m58678e(4, this.f135053g);
            String str18 = this.f135054h;
            if (str18 != null) {
                e += C52418a.m58683j(5, str18);
            }
            String str19 = this.f135055i;
            if (str19 != null) {
                e += C52418a.m58683j(6, str19);
            }
            int a = e + C52418a.m58674a(7, this.f135056j) + C52418a.m58674a(8, this.f135057n);
            String str20 = this.f135058o;
            if (str20 != null) {
                a += C52418a.m58683j(9, str20);
            }
            String str21 = this.f135059p;
            if (str21 != null) {
                a += C52418a.m58683j(10, str21);
            }
            int e2 = a + C52418a.m58678e(11, this.f135060q);
            String str22 = this.f135061r;
            if (str22 != null) {
                e2 += C52418a.m58683j(12, str22);
            }
            String str23 = this.f135062s;
            if (str23 != null) {
                e2 += C52418a.m58683j(13, str23);
            }
            int e3 = e2 + C52418a.m58678e(14, this.f135063t) + C52418a.m58678e(15, this.f135064u) + C52418a.m58678e(16, this.f135065v) + C52418a.m58678e(17, this.f135066w) + C52418a.m58678e(18, this.f135067x);
            String str24 = this.f135068y;
            if (str24 != null) {
                e3 += C52418a.m58683j(19, str24);
            }
            int e4 = e3 + C52418a.m58678e(20, this.f135069z) + C52418a.m58678e(21, this.f135041A) + C52418a.m58681h(22, this.f135042B) + C52418a.m58678e(23, this.f135043C) + C52418a.m58681h(24, this.f135044D);
            String str25 = this.f135045E;
            if (str25 != null) {
                e4 += C52418a.m58683j(25, str25);
            }
            String str26 = this.f135046F;
            if (str26 != null) {
                e4 += C52418a.m58683j(26, str26);
            }
            int a2 = e4 + C52418a.m58674a(27, this.f135047G);
            String str27 = this.f135048H;
            if (str27 != null) {
                a2 += C52418a.m58683j(28, str27);
            }
            String str28 = this.f135049I;
            return str28 != null ? a2 + C52418a.m58683j(29, str28) : a2;
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
            i25 i25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    i25.f135050d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    i25.f135051e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    i25.f135052f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i25.f135053g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    i25.f135054h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i25.f135055i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    i25.f135056j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    i25.f135057n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    i25.f135058o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    i25.f135059p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    i25.f135060q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    i25.f135061r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    i25.f135062s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    i25.f135063t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    i25.f135064u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    i25.f135065v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    i25.f135066w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    i25.f135067x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    i25.f135068y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    i25.f135069z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    i25.f135041A = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    i25.f135042B = aVar3.mo141631i(intValue);
                    return 0;
                case 23:
                    i25.f135043C = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    i25.f135044D = aVar3.mo141631i(intValue);
                    return 0;
                case 25:
                    i25.f135045E = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    i25.f135046F = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    i25.f135047G = aVar3.mo141625c(intValue);
                    return 0;
                case 28:
                    i25.f135048H = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    i25.f135049I = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f135050d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "id", str, false);
            aVar.mo71655d(jSONObject, "rawUrl", this.f135051e, false);
            aVar.mo71655d(jSONObject, "handoff_shareUrl", this.f135052f, false);
            aVar.mo71655d(jSONObject, "BizVideoPlayTime", Integer.valueOf(this.f135053g), false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f135054h, false);
            aVar.mo71655d(jSONObject, "webpageTitle", this.f135055i, false);
            aVar.mo71655d(jSONObject, "hide_option_menu", Boolean.valueOf(this.f135056j), false);
            aVar.mo71655d(jSONObject, "translate_webview", Boolean.valueOf(this.f135057n), false);
            aVar.mo71655d(jSONObject, "srcUsername", this.f135058o, false);
            aVar.mo71655d(jSONObject, "srcDisplayname", this.f135059p, false);
            aVar.mo71655d(jSONObject, "mode", Integer.valueOf(this.f135060q), false);
            aVar.mo71655d(jSONObject, "KTemplateId", this.f135061r, false);
            aVar.mo71655d(jSONObject, "KPublisherId", this.f135062s, false);
            aVar.mo71655d(jSONObject, "k_tmpl_scene", Integer.valueOf(this.f135063t), false);
            aVar.mo71655d(jSONObject, "k_tmpl_sub_scene", Integer.valueOf(this.f135064u), false);
            aVar.mo71655d(jSONObject, "pay_channel", Integer.valueOf(this.f135065v), false);
            aVar.mo71655d(jSONObject, "key_download_restrict", Integer.valueOf(this.f135066w), false);
            aVar.mo71655d(jSONObject, "key_wallet_region", Integer.valueOf(this.f135067x), false);
            aVar.mo71655d(jSONObject, "key_function_id", this.f135068y, false);
            aVar.mo71655d(jSONObject, "k_tmpl_item_show_type", Integer.valueOf(this.f135069z), false);
            aVar.mo71655d(jSONObject, "geta8key_scene", Integer.valueOf(this.f135041A), false);
            aVar.mo71655d(jSONObject, "biz_video_msg_id", Long.valueOf(this.f135042B), false);
            aVar.mo71655d(jSONObject, "biz_video_msg_index", Integer.valueOf(this.f135043C), false);
            aVar.mo71655d(jSONObject, "biz_video_msg_svr_id", Long.valueOf(this.f135044D), false);
            aVar.mo71655d(jSONObject, "biz_mp_msg_info", this.f135045E, false);
            aVar.mo71655d(jSONObject, "ad_ux_info_for_jsapi_pay", this.f135046F, false);
            aVar.mo71655d(jSONObject, "key_menu_hide_expose", Boolean.valueOf(this.f135047G), false);
            aVar.mo71655d(jSONObject, "webviewCurrentProcess", this.f135048H, false);
            aVar.mo71655d(jSONObject, "coverUrl", this.f135049I, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
