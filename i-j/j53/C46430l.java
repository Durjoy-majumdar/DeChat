package j53;

import b63.C39735i0;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75790l;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import p281yz.C79173v;
import te3.C50456mv3;
import te3.C52219z50;
import te3.sg4;
import te3.vf4;
import te3.zf4;

/* renamed from: j53.l */
public class C46430l extends C75790l {

    /* renamed from: j */
    public static final /* synthetic */ int f125051j = 0;

    /* renamed from: d */
    public int f125052d;

    /* renamed from: e */
    public String f125053e;

    /* renamed from: f */
    public int f125054f;

    /* renamed from: g */
    public String f125055g;

    /* renamed from: h */
    public String f125056h;

    /* renamed from: i */
    public String f125057i;

    /* renamed from: j53.l$a */
    public static class C46431a {

        /* renamed from: a */
        public LinkedList<C39735i0> f125058a = new LinkedList<>();

        /* renamed from: b */
        public zf4 f125059b;

        /* renamed from: c */
        public zf4 f125060c;

        /* renamed from: a */
        public static C46431a m51738a(JSONObject jSONObject) {
            C46431a aVar = new C46431a();
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("extra_labels");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        aVar.f125058a.add(m51739b(optJSONArray.getJSONObject(i)));
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("header");
                if (optJSONObject != null) {
                    aVar.f125059b = m51741d(optJSONObject);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
                if (optJSONObject2 != null) {
                    aVar.f125060c = m51741d(optJSONObject2);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.NetSceneTenpayPayManager", " PayManageExtraSectionsData dcreateFromJSONObject Exception:%s", e.getMessage());
            }
            return aVar;
        }

        /* renamed from: b */
        public static C39735i0 m51739b(JSONObject jSONObject) {
            Class cls = C79173v.class;
            C39735i0 i0Var = new C39735i0();
            if (jSONObject != null) {
                i0Var.field_is_show = jSONObject.optInt("show_label", 0);
                String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                i0Var.field_pref_title = optString;
                i0Var.field_pref_key = optString;
                i0Var.field_pref_desc = jSONObject.optString("desc");
                i0Var.field_logo_url = jSONObject.optString("logo_url");
                i0Var.field_jump_type = jSONObject.optInt("jump_type");
                i0Var.field_pref_url = jSONObject.optString("jump_h5_url");
                i0Var.field_tinyapp_username = jSONObject.optString("tinyapp_username");
                i0Var.field_tinyapp_path = jSONObject.optString("tinyapp_path");
                ((C79173v) C86312j.m106911c(cls)).Ax0().mo71053jo(i0Var.field_pref_key);
                ((C79173v) C86312j.m106911c(cls)).Ax0().insert(i0Var);
            }
            return i0Var;
        }

        /* renamed from: c */
        public static vf4 m51740c(JSONObject jSONObject) {
            vf4 vf4 = new vf4();
            if (jSONObject != null) {
                vf4.f143461d = jSONObject.optLong("color");
                vf4.f143462e = jSONObject.optString("font");
                vf4.f143463f = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
                vf4.f143464g = (float) jSONObject.optLong("size");
                vf4.f143466i = jSONObject.optInt("text_attr");
                vf4.f143467j = jSONObject.optString("view_id");
                C50456mv3 mv32 = new C50456mv3();
                JSONObject optJSONObject = jSONObject.optJSONObject("route_info");
                if (optJSONObject != null) {
                    mv32.f138230d = optJSONObject.optInt("type");
                    mv32.f138231e = optJSONObject.optString("url");
                    sg4 sg4 = new sg4();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("tiny_app_uri");
                    if (optJSONObject2 != null) {
                        sg4.f141503d = optJSONObject2.optString("username");
                        sg4.f141504e = optJSONObject2.optString("path");
                        sg4.f141505f = optJSONObject2.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                        mv32.f138232f = sg4;
                    }
                }
                vf4.f143465h = mv32;
                C52219z50 z502 = new C52219z50();
                JSONObject optJSONObject3 = jSONObject.optJSONObject("dynamic_color");
                if (optJSONObject3 != null) {
                    z502.f145706d = optJSONObject3.optLong("normal_color");
                    z502.f145707e = optJSONObject3.optLong("dark_mode_color");
                    vf4.f143468n = z502;
                }
            }
            return vf4;
        }

        /* renamed from: d */
        public static zf4 m51741d(JSONObject jSONObject) {
            zf4 zf4 = new zf4();
            if (jSONObject != null) {
                zf4.f145864e = jSONObject.optString("view_id");
                JSONArray optJSONArray = jSONObject.optJSONArray(MimeTypes.BASE_TYPE_TEXT);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            zf4.f145863d.add(m51740c(optJSONArray.getJSONObject(i)));
                        } catch (JSONException e) {
                            Log.m105921e("MicroMsg.NetSceneTenpayPayManager", "parseTextViewData Exception:%s", e.getMessage());
                        }
                    }
                }
            }
            return zf4;
        }
    }

    public C46430l() {
        HashMap hashMap = new HashMap();
        hashMap.put("deviceid", C87203t.m108270f(false));
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1654;
    }

    public int getPayCgicmd() {
        return 100000;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/paymanage";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0010 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012  */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71830j1(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r5.length()
        L_0x000c:
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x0012
            r5 = 1
            return r5
        L_0x0012:
            char r2 = r5.charAt(r0)
            r3 = 48
            if (r2 < r3) goto L_0x001e
            r3 = 57
            if (r2 <= r3) goto L_0x000c
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j53.C46430l.mo71830j1(java.lang.String):boolean");
    }

    /* renamed from: k1 */
    public final C39735i0 mo71831k1(JSONObject jSONObject, String str) {
        C39735i0 i0Var = new C39735i0();
        i0Var.field_is_show = jSONObject.optInt("show_label", 0);
        i0Var.field_pref_key = str;
        i0Var.field_pref_title = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        i0Var.field_pref_desc = jSONObject.optString("desc");
        i0Var.field_logo_url = jSONObject.optString("logo_url");
        i0Var.field_jump_type = jSONObject.optInt("jump_type");
        i0Var.field_pref_url = jSONObject.optString("jump_h5_url");
        i0Var.field_tinyapp_username = jSONObject.optString("tinyapp_username");
        i0Var.field_tinyapp_path = jSONObject.optString("tinyapp_path");
        return i0Var;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC;
        Class cls = C79173v.class;
        Log.m105924i("MicroMsg.NetSceneTenpayPayManager", "errCode:" + i + ";errMsg:" + str);
        Log.m105919d("MicroMsg.NetSceneTenpayPayManager", "json: %s", jSONObject.toString());
        if (i == 0) {
            String str2 = "0";
            String optString = jSONObject.optString("is_show_deduct", str2);
            if (mo71830j1(optString)) {
                str2 = optString;
            }
            this.f125052d = Util.getInt(str2, 0);
            this.f125053e = jSONObject.optString("deduct_show_url", "");
            String optString2 = jSONObject.optString("deduct_cache_time", "");
            if (!mo71830j1(optString2)) {
                optString2 = "84600";
            }
            this.f125054f = Util.getInt(optString2, 0);
            this.f125055g = jSONObject.optString("deduct_title", "");
            this.f125056h = jSONObject.optString("realname_url", "");
            this.f125057i = jSONObject.optString("forget_pwd_url", "");
            String optString3 = jSONObject.optString("payway_select_wording", "");
            String optString4 = jSONObject.optString("payway_change_wording", "");
            C39735i0 i0Var = new C39735i0();
            i0Var.field_is_show = this.f125052d;
            i0Var.field_pref_key = "wallet_open_auto_pay";
            i0Var.field_pref_title = this.f125055g;
            i0Var.field_pref_url = this.f125053e;
            i0Var.field_jump_type = 1;
            ((C79173v) C86312j.m106911c(cls)).Ax0().mo71053jo("wallet_open_auto_pay");
            Log.m105925i("MicroMsg.NetSceneTenpayPayManager", "deductCacheTime %s forget_pwd_url %s", Integer.valueOf(this.f125054f), this.f125057i);
            ((C79173v) C86312j.m106911c(cls)).Ax0().insert(i0Var);
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC;
            JSONObject optJSONObject = jSONObject.optJSONObject("switch_wallet");
            if (optJSONObject != null) {
                C39735i0 k1 = mo71831k1(optJSONObject, "wallet_switch_currency");
                ((C79173v) C86312j.m106911c(cls)).Ax0().mo71053jo("wallet_switch_currency");
                ((C79173v) C86312j.m106911c(cls)).Ax0().insert(k1);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("im_mch");
            if (optJSONObject2 != null) {
                C39735i0 k15 = mo71831k1(optJSONObject2, "wallet_im_mch");
                ((C79173v) C86312j.m106911c(cls)).Ax0().mo71053jo("wallet_im_mch");
                ((C79173v) C86312j.m106911c(cls)).Ax0().insert(k15);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("deduct_manage");
            if (optJSONObject3 != null) {
                C39735i0 k16 = mo71831k1(optJSONObject3, "wallet_open_auto_pay");
                ((C79173v) C86312j.m106911c(cls)).Ax0().mo71053jo("wallet_open_auto_pay");
                ((C79173v) C86312j.m106911c(cls)).Ax0().insert(k16);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("extra_sections");
            if (optJSONArray != null) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar3, optJSONArray.toString());
            } else {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar3, " ");
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("unreg_info");
            if (optJSONObject4 != null) {
                String optString5 = optJSONObject4.optString("unreg_title", "");
                String optString6 = optJSONObject4.optString("unreg_url", "");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, optString5);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, optString6);
            } else {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_PREF_INFO_CACHE_TIME_LONG_SYNC, Long.valueOf(new Date().getTime() / 1000));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_PREF_INFO_EXPIRES_INT_SYNC, Integer.valueOf(this.f125054f));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REALNAME_URL_STRING_SYNC, this.f125056h);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_FORGET_URL_STRING, this.f125057i);
            if (!Util.isNullOrNil(optString3)) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, optString3);
            }
            if (!Util.isNullOrNil(optString4)) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, optString4);
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }
}
