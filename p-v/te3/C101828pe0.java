package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.internal.ConstValue;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pe0 */
public class C101828pe0 extends C47465a {

    /* renamed from: A */
    public String f299150A;

    /* renamed from: B */
    public String f299151B;

    /* renamed from: C */
    public int f299152C;

    /* renamed from: D */
    public String f299153D;

    /* renamed from: E */
    public int f299154E;

    /* renamed from: F */
    public String f299155F;

    /* renamed from: G */
    public long f299156G;

    /* renamed from: H */
    public String f299157H;

    /* renamed from: I */
    public String f299158I;

    /* renamed from: J */
    public long f299159J;

    /* renamed from: d */
    public boolean f299160d;

    /* renamed from: e */
    public String f299161e;

    /* renamed from: f */
    public String f299162f;

    /* renamed from: g */
    public String f299163g;

    /* renamed from: h */
    public String f299164h;

    /* renamed from: i */
    public int f299165i;

    /* renamed from: j */
    public boolean f299166j;

    /* renamed from: n */
    public long f299167n;

    /* renamed from: o */
    public String f299168o;

    /* renamed from: p */
    public String f299169p;

    /* renamed from: q */
    public long f299170q;

    /* renamed from: r */
    public boolean f299171r;

    /* renamed from: s */
    public int f299172s;

    /* renamed from: t */
    public String f299173t;

    /* renamed from: u */
    public String f299174u;

    /* renamed from: v */
    public String f299175v;

    /* renamed from: w */
    public int f299176w;

    /* renamed from: x */
    public String f299177x;

    /* renamed from: y */
    public String f299178y;

    /* renamed from: z */
    public String f299179z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101828pe0)) {
            return false;
        }
        C101828pe0 pe02 = (C101828pe0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f299160d), Boolean.valueOf(pe02.f299160d)) && C46238a.m51546a(this.f299161e, pe02.f299161e) && C46238a.m51546a(this.f299162f, pe02.f299162f) && C46238a.m51546a(this.f299163g, pe02.f299163g) && C46238a.m51546a(this.f299164h, pe02.f299164h) && C46238a.m51546a(Integer.valueOf(this.f299165i), Integer.valueOf(pe02.f299165i)) && C46238a.m51546a(Boolean.valueOf(this.f299166j), Boolean.valueOf(pe02.f299166j)) && C46238a.m51546a(Long.valueOf(this.f299167n), Long.valueOf(pe02.f299167n)) && C46238a.m51546a(this.f299168o, pe02.f299168o) && C46238a.m51546a(this.f299169p, pe02.f299169p) && C46238a.m51546a(Long.valueOf(this.f299170q), Long.valueOf(pe02.f299170q)) && C46238a.m51546a(Boolean.valueOf(this.f299171r), Boolean.valueOf(pe02.f299171r)) && C46238a.m51546a(Integer.valueOf(this.f299172s), Integer.valueOf(pe02.f299172s)) && C46238a.m51546a(this.f299173t, pe02.f299173t) && C46238a.m51546a(this.f299174u, pe02.f299174u) && C46238a.m51546a(this.f299175v, pe02.f299175v) && C46238a.m51546a(Integer.valueOf(this.f299176w), Integer.valueOf(pe02.f299176w)) && C46238a.m51546a(this.f299177x, pe02.f299177x) && C46238a.m51546a(this.f299178y, pe02.f299178y) && C46238a.m51546a(this.f299179z, pe02.f299179z) && C46238a.m51546a(this.f299150A, pe02.f299150A) && C46238a.m51546a(this.f299151B, pe02.f299151B) && C46238a.m51546a(Integer.valueOf(this.f299152C), Integer.valueOf(pe02.f299152C)) && C46238a.m51546a(this.f299153D, pe02.f299153D) && C46238a.m51546a(Integer.valueOf(this.f299154E), Integer.valueOf(pe02.f299154E)) && C46238a.m51546a(this.f299155F, pe02.f299155F) && C46238a.m51546a(Long.valueOf(this.f299156G), Long.valueOf(pe02.f299156G)) && C46238a.m51546a(this.f299157H, pe02.f299157H) && C46238a.m51546a(this.f299158I, pe02.f299158I) && C46238a.m51546a(Long.valueOf(this.f299159J), Long.valueOf(pe02.f299159J));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f299160d);
            String str = this.f299161e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f299162f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f299163g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299164h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f299165i);
            aVar.mo74314a(7, this.f299166j);
            aVar.mo74321h(8, this.f299167n);
            String str5 = this.f299168o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f299169p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            aVar.mo74321h(11, this.f299170q);
            aVar.mo74314a(12, this.f299171r);
            aVar.mo74318e(13, this.f299172s);
            String str7 = this.f299173t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            String str8 = this.f299174u;
            if (str8 != null) {
                aVar.mo74323j(15, str8);
            }
            String str9 = this.f299175v;
            if (str9 != null) {
                aVar.mo74323j(16, str9);
            }
            aVar.mo74318e(17, this.f299176w);
            String str10 = this.f299177x;
            if (str10 != null) {
                aVar.mo74323j(18, str10);
            }
            String str11 = this.f299178y;
            if (str11 != null) {
                aVar.mo74323j(19, str11);
            }
            String str12 = this.f299179z;
            if (str12 != null) {
                aVar.mo74323j(20, str12);
            }
            String str13 = this.f299150A;
            if (str13 != null) {
                aVar.mo74323j(21, str13);
            }
            String str14 = this.f299151B;
            if (str14 != null) {
                aVar.mo74323j(22, str14);
            }
            aVar.mo74318e(23, this.f299152C);
            String str15 = this.f299153D;
            if (str15 != null) {
                aVar.mo74323j(24, str15);
            }
            aVar.mo74318e(25, this.f299154E);
            String str16 = this.f299155F;
            if (str16 != null) {
                aVar.mo74323j(26, str16);
            }
            aVar.mo74321h(27, this.f299156G);
            String str17 = this.f299157H;
            if (str17 != null) {
                aVar.mo74323j(28, str17);
            }
            String str18 = this.f299158I;
            if (str18 != null) {
                aVar.mo74323j(29, str18);
            }
            aVar.mo74321h(30, this.f299159J);
            return 0;
        } else if (i2 == 1) {
            int a = C52418a.m58674a(1, this.f299160d) + 0;
            String str19 = this.f299161e;
            if (str19 != null) {
                a += C52418a.m58683j(2, str19);
            }
            String str20 = this.f299162f;
            if (str20 != null) {
                a += C52418a.m58683j(3, str20);
            }
            String str21 = this.f299163g;
            if (str21 != null) {
                a += C52418a.m58683j(4, str21);
            }
            String str22 = this.f299164h;
            if (str22 != null) {
                a += C52418a.m58683j(5, str22);
            }
            int e = a + C52418a.m58678e(6, this.f299165i) + C52418a.m58674a(7, this.f299166j) + C52418a.m58681h(8, this.f299167n);
            String str23 = this.f299168o;
            if (str23 != null) {
                e += C52418a.m58683j(9, str23);
            }
            String str24 = this.f299169p;
            if (str24 != null) {
                e += C52418a.m58683j(10, str24);
            }
            int h = e + C52418a.m58681h(11, this.f299170q) + C52418a.m58674a(12, this.f299171r) + C52418a.m58678e(13, this.f299172s);
            String str25 = this.f299173t;
            if (str25 != null) {
                h += C52418a.m58683j(14, str25);
            }
            String str26 = this.f299174u;
            if (str26 != null) {
                h += C52418a.m58683j(15, str26);
            }
            String str27 = this.f299175v;
            if (str27 != null) {
                h += C52418a.m58683j(16, str27);
            }
            int e2 = h + C52418a.m58678e(17, this.f299176w);
            String str28 = this.f299177x;
            if (str28 != null) {
                e2 += C52418a.m58683j(18, str28);
            }
            String str29 = this.f299178y;
            if (str29 != null) {
                e2 += C52418a.m58683j(19, str29);
            }
            String str30 = this.f299179z;
            if (str30 != null) {
                e2 += C52418a.m58683j(20, str30);
            }
            String str31 = this.f299150A;
            if (str31 != null) {
                e2 += C52418a.m58683j(21, str31);
            }
            String str32 = this.f299151B;
            if (str32 != null) {
                e2 += C52418a.m58683j(22, str32);
            }
            int e3 = e2 + C52418a.m58678e(23, this.f299152C);
            String str33 = this.f299153D;
            if (str33 != null) {
                e3 += C52418a.m58683j(24, str33);
            }
            int e4 = e3 + C52418a.m58678e(25, this.f299154E);
            String str34 = this.f299155F;
            if (str34 != null) {
                e4 += C52418a.m58683j(26, str34);
            }
            int h2 = e4 + C52418a.m58681h(27, this.f299156G);
            String str35 = this.f299157H;
            if (str35 != null) {
                h2 += C52418a.m58683j(28, str35);
            }
            String str36 = this.f299158I;
            if (str36 != null) {
                h2 += C52418a.m58683j(29, str36);
            }
            return h2 + C52418a.m58681h(30, this.f299159J);
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
            C101828pe0 pe02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pe02.f299160d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    pe02.f299161e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pe02.f299162f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pe02.f299163g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pe02.f299164h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pe02.f299165i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pe02.f299166j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    pe02.f299167n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    pe02.f299168o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    pe02.f299169p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    pe02.f299170q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    pe02.f299171r = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    pe02.f299172s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    pe02.f299173t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    pe02.f299174u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    pe02.f299175v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    pe02.f299176w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    pe02.f299177x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    pe02.f299178y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    pe02.f299179z = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    pe02.f299150A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    pe02.f299151B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    pe02.f299152C = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    pe02.f299153D = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    pe02.f299154E = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    pe02.f299155F = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    pe02.f299156G = aVar3.mo141631i(intValue);
                    return 0;
                case 28:
                    pe02.f299157H = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    pe02.f299158I = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    pe02.f299159J = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean valueOf = Boolean.valueOf(this.f299160d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ifAppAttachDownloadUI", valueOf, false);
            aVar.mo71655d(jSONObject, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f299161e, false);
            aVar.mo71655d(jSONObject, "fileExt", this.f299162f, false);
            aVar.mo71655d(jSONObject, "appId", this.f299163g, false);
            aVar.mo71655d(jSONObject, ConstValue.INIT_CONFIG_KEY_PROCESSNAME, this.f299164h, false);
            aVar.mo71655d(jSONObject, "sence", Integer.valueOf(this.f299165i), false);
            aVar.mo71655d(jSONObject, "showMenu", Boolean.valueOf(this.f299166j), false);
            aVar.mo71655d(jSONObject, "fileLen", Long.valueOf(this.f299167n), false);
            aVar.mo71655d(jSONObject, "app_type", this.f299168o, false);
            aVar.mo71655d(jSONObject, "app_media_id", this.f299169p, false);
            aVar.mo71655d(jSONObject, "app_msg_id", Long.valueOf(this.f299170q), false);
            aVar.mo71655d(jSONObject, "app_show_share", Boolean.valueOf(this.f299171r), false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f299172s), false);
            aVar.mo71655d(jSONObject, "choose_way", this.f299173t, false);
            aVar.mo71655d(jSONObject, "msg_type", this.f299174u, false);
            aVar.mo71655d(jSONObject, "handoff_md5", this.f299175v, false);
            aVar.mo71655d(jSONObject, "handoff_source", Integer.valueOf(this.f299176w), false);
            aVar.mo71655d(jSONObject, "handoff_svrId", this.f299177x, false);
            aVar.mo71655d(jSONObject, "handoff_extId", this.f299178y, false);
            aVar.mo71655d(jSONObject, "handoff_cdnUrl", this.f299179z, false);
            aVar.mo71655d(jSONObject, "handoff_aesKey", this.f299150A, false);
            aVar.mo71655d(jSONObject, "handoff_authKey", this.f299151B, false);
            aVar.mo71655d(jSONObject, "handoff_fileStatus", Integer.valueOf(this.f299152C), false);
            aVar.mo71655d(jSONObject, "handoff_appId", this.f299153D, false);
            aVar.mo71655d(jSONObject, "handoff_sdkVersion", Integer.valueOf(this.f299154E), false);
            aVar.mo71655d(jSONObject, "handoff_mediaId", this.f299155F, false);
            aVar.mo71655d(jSONObject, "handoff_uploadedSize", Long.valueOf(this.f299156G), false);
            aVar.mo71655d(jSONObject, "handoff_from", this.f299157H, false);
            aVar.mo71655d(jSONObject, "handoff_to", this.f299158I, false);
            aVar.mo71655d(jSONObject, "handoff_size", Long.valueOf(this.f299159J), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
