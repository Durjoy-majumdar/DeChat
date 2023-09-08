package v53;

import b63.C113146l;
import b63.C28271z;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import e63.C31432e;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p281yz.C79173v;
import te3.C77933g43;

/* renamed from: v53.g */
public class C37676g extends C75790l {
    public C37676g() {
        ((C79173v) C86312j.m106911c(C79173v.class)).Fx0().f84132d.execSQL("WalletBulletin", "delete from WalletBulletin");
        setRequestData(new HashMap());
    }

    public int getFuncId() {
        return 1679;
    }

    public int getTenpayCgicmd() {
        return 1679;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getbannerinfo";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C77933g43 g432;
        JSONArray jSONArray;
        int i2;
        int i3 = i;
        JSONObject jSONObject2 = jSONObject;
        Log.m105924i("MicroMsg.NetSceneGetBannerInfo", "NetSceneGetBannerInfo errCode = " + i3 + " " + jSONObject2);
        if (i3 == 0) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C28271z.f77842D;
            C31432e Fx0 = ((C79173v) C86312j.m106911c(C79173v.class)).Fx0();
            if (jSONObject2 == null || Fx0 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("json==null?");
                boolean z = true;
                sb.append(jSONObject2 == null);
                sb.append("  stg==null?");
                if (Fx0 != null) {
                    z = false;
                }
                sb.append(z);
                Log.m105920e("MicroMsg.WalletBulletin", sb.toString());
            } else {
                JSONArray optJSONArray = jSONObject2.optJSONArray("banner_map");
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("banner_content_array");
                JSONArray optJSONArray3 = jSONObject2.optJSONArray("notice_item_array");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i4 = 0;
                    while (i4 < length) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("banner_type");
                            String optString2 = optJSONObject.optString("banner_template_id");
                            jSONArray = optJSONArray;
                            StringBuilder sb4 = new StringBuilder();
                            i2 = length;
                            sb4.append("sceneid=");
                            sb4.append(optString);
                            sb4.append("; contentid=");
                            sb4.append(optString2);
                            Log.m105924i("MicroMsg.WalletBulletin", sb4.toString());
                            if (!Util.isNullOrNil(optString) && !Util.isNullOrNil(optString2)) {
                                hashMap.put(optString, optString2);
                                Log.m105924i("MicroMsg.WalletBulletin", "sceneid:" + optString + " map contentid:" + optString2);
                            }
                        } else {
                            jSONArray = optJSONArray;
                            i2 = length;
                        }
                        i4++;
                        optJSONArray = jSONArray;
                        length = i2;
                    }
                }
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i5 = 0; i5 < length2; i5++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i5);
                        if (optJSONObject2 != null) {
                            hashMap2.put(optJSONObject2.optString("banner_template_id"), Integer.valueOf(i5));
                        }
                    }
                }
                if (optJSONArray3 != null) {
                    for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                        C77933g43 b0 = C75228t.m90237b0(optJSONArray3.optJSONObject(i6));
                        if (b0 != null) {
                            hashMap3.put(b0.f227435h, b0);
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    for (String str2 : hashMap.keySet()) {
                        String str3 = (String) hashMap.get(str2);
                        C28271z zVar = new C28271z();
                        zVar.field_bulletin_scene = str2;
                        if (hashMap3.containsKey(str3) && (g432 = (C77933g43) hashMap3.get(str3)) != null) {
                            zVar.field_is_show_notice = g432.f227431d;
                            zVar.field_wording = g432.f227432e;
                            zVar.field_jump_url = g432.f227434g;
                            zVar.field_left_icon = g432.f227433f;
                            zVar.field_notice_id = g432.f227435h;
                            zVar.field_type = 2;
                        }
                        if (hashMap2.containsKey(str3)) {
                            Log.m105924i("MicroMsg.WalletBulletin", "find contentid:" + str3 + "in contentMap");
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(((Integer) hashMap2.get(str3)).intValue());
                            zVar.field_bulletin_content = optJSONObject3.optString("content");
                            zVar.field_bulletin_url = optJSONObject3.optString("url");
                            Fx0.insert(zVar);
                        }
                    }
                }
            }
            long optLong = jSONObject2.optLong("banner_update_interval", 0);
            Log.m105924i("MicroMsg.NetSceneGetBannerInfo", "update_interval=" + optLong);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BULLETIN_UPDATE_INTERVAL_LONG, Long.valueOf(optLong));
            JSONObject optJSONObject4 = jSONObject2.optJSONObject("lbs_info");
            if (optJSONObject4 != null) {
                JSONArray optJSONArray4 = optJSONObject4.optJSONArray("config_array");
                if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                    if (C113146l.f338559a == null) {
                        C113146l.f338559a = new C113146l();
                    }
                    C113146l.f338559a.getClass();
                    Log.m105918d("MicroMsg.GpsReportHelper", optJSONArray4.toString());
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LBS_REPORT_CONFIG_STRING_SYNC, optJSONArray4.toString());
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LBS_REPORT_DIALOG_TITLE_STRING_SYNC, optJSONObject4.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LBS_REPORT_DIALOG_CONTENT_STRING_SYNC, optJSONObject4.optString("content"));
            }
            JSONObject optJSONObject5 = jSONObject2.optJSONObject("realname_info");
            if (optJSONObject5 != null) {
                String optString3 = optJSONObject5.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                String optString4 = optJSONObject5.optString("balance_title");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, optString3);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, optString4);
            }
        }
    }
}
