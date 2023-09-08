package p83;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import e00.C7575o0;
import ei3.C86522b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C86522b
/* renamed from: p83.b */
public class C11873b extends C86301e implements C7575o0 {
    /* renamed from: Aa */
    public void mo8677Aa(int i, String str, String str2, int i2, String str3) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_id", str2);
        bundle.putString("fts_key_json_data", str);
        bundle.putString("fts_key_err_msg", str3);
        bundle.putInt("fts_key_ret_code", i2);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(153, bundle);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: FH */
    public void mo8678FH(int i, Map<String, Object> map) {
        boolean z;
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        String f = C43471q.m46982f(map, "action");
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_data", f);
        if (TextUtils.equals("controlExit", f) && map.containsKey("leftBarButtonType")) {
            bundle.putString("fts_key_leftBar_button_type", C43471q.m46982f(map, "leftBarButtonType"));
        }
        if (TextUtils.equals("configNavBar", f)) {
            int i2 = 0;
            if (map.containsKey("nativeConfig")) {
                String f2 = C43471q.m46982f(map, "nativeConfig");
                if (!Util.isNullOrNil(f2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(f2);
                        if (jSONObject.has(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                            bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
                        }
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.MsgHandler", e, "", new Object[0]);
                    }
                }
                String str = null;
                if (!Util.isNullOrNil(f2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(f2);
                        if (jSONObject2.has("searchBarTextColor")) {
                            str = jSONObject2.optString("searchBarTextColor");
                        }
                    } catch (JSONException e2) {
                        Log.printErrStackTrace("MicroMsg.MsgHandler", e2, "", new Object[0]);
                    }
                }
                bundle.putString("key_search_bar_text_color", str);
                if (!Util.isNullOrNil(f2)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(f2);
                        if (jSONObject3.has("hideNavBottomLine")) {
                            z = jSONObject3.optBoolean("hideNavBottomLine");
                            bundle.putBoolean("key_search_hide_nav_bottom_line", z);
                            Log.m105924i("MicroMsg.MsgHandler", "searchBarTextColor = " + str);
                        }
                    } catch (JSONException e3) {
                        Log.printErrStackTrace("MicroMsg.MsgHandler", e3, "", new Object[0]);
                    }
                }
                z = false;
                bundle.putBoolean("key_search_hide_nav_bottom_line", z);
                Log.m105924i("MicroMsg.MsgHandler", "searchBarTextColor = " + str);
            }
            if (map.containsKey("ftsNeedHideKeyBoard")) {
                bundle.putInt("ftsneedkeyboard", C43471q.m46981e(map, "ftsNeedHideKeyBoard", 0));
            }
            if (map.containsKey("hideSearchBar")) {
                bundle.putInt("hideSearchInput", C43471q.m46980d(map, "hideSearchBar", false) ? 1 : 2);
            }
            if (map.containsKey("recommendSearchQuery")) {
                bundle.putString("recommendSearchQuery", C43471q.m46982f(map, "recommendSearchQuery"));
            }
            String str2 = (String) map.get("navButtonConfig");
            if (!Util.isNullOrNil(str2)) {
                try {
                    String optString = new JSONObject(str2).optString("leftBarButtonType", "back");
                    if (optString.equals("exit")) {
                        i2 = 1;
                    } else if (optString.equals("none")) {
                        i2 = 2;
                    } else if (optString.equals("back")) {
                        i2 = 3;
                    }
                } catch (JSONException e4) {
                    Log.printErrStackTrace("MicroMsg.MsgHandler", e4, "", new Object[0]);
                }
                bundle.putInt("key_back_btn_type", i2);
            }
        }
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(154, bundle);
            }
        } catch (RemoteException e5) {
            Log.m105928w("MicroMsg.MsgHandler", "onNavControl exception" + e5.getMessage());
        }
    }

    /* renamed from: KJ */
    public Bundle mo8679KJ(int i) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = null;
        try {
            bundle = a.f22715x.mo7031V5(33, (Bundle) null);
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.MsgHandler", e, "", new Object[0]);
        }
        Log.m105925i("MicroMsg.MsgHandler", "getWebViewIntentExtras(%s)", bundle);
        return bundle;
    }

    /* renamed from: Kh */
    public void mo8680Kh(int i, int i2, String str, int i3, String str2) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("fts_key_teach_request_type", i2);
        bundle.putString("fts_key_json_data", str);
        bundle.putInt("fts_key_is_cache_data", i3);
        bundle.putString("requestId", str2);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(121, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onTeachSearchDataReady exception" + e.getMessage());
        }
    }

    /* renamed from: Of */
    public void mo8681Of(int i, String str, String str2, boolean z, String str3, boolean z2) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_new_query", str);
        bundle.putString("fts_key_custom_query", str2);
        bundle.putBoolean("fts_key_need_keyboard", z);
        bundle.putString("fts_key_tag_list", str3);
        bundle.putBoolean("fts_key_cache", z2);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(122, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onFTSSearchQueryChange exception" + e.getMessage());
        }
    }

    public void Si0(int i, String str, String str2, String str3) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("searchId", str);
        bundle.putString("poiId", str2);
        bundle.putString("json", str3);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(145, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onGetPoiReady exception" + e.getMessage());
        }
    }

    public void T50(int i, String str, int i2, int i3, int i4) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_json_data", str);
        bundle.putInt("fts_key_is_cache_data", i2);
        bundle.putInt("fts_key_is_expired", i3);
        bundle.putInt("fts_key_is_preload", i4);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, bundle);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: U7 */
    public void mo8684U7(int i, String str) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("data", str);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(TPOptionalID.f349338xc9bdf6cd, bundle);
            } else {
                Log.m105924i("MicroMsg.MsgHandler", "callbacker is null");
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onGetSearchHistory exception" + e.getMessage());
        }
    }

    /* renamed from: ZG */
    public void mo8685ZG(int i, String str, String str2) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_json_data", str);
        bundle.putString("fts_key_req_id", str2);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(127, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onChatSearchDataReady exception" + e.getMessage());
        }
    }

    /* renamed from: fP */
    public void mo8686fP(int i, String str, int i2, String str2) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_json_data", str);
        bundle.putString("fts_key_err_msg", str2);
        bundle.putInt("fts_key_ret_code", i2);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(152, bundle);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: iT */
    public void mo8687iT(int i, String str) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_json_data", str);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(124, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e.getMessage());
        }
    }

    public void mb0(int i, String str, int i2) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_sns_id", str);
        bundle.putInt("fts_key_status", i2);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(125, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onMusicStatusChanged exception" + e.getMessage());
        }
    }

    public void qj0(int i, int i2, String str, Map<String, Object> map) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("FTS_KEY_onStartWebSearch_type", i2);
        bundle.putString("FTS_KEY_onStartWebSearch_query", str);
        bundle.putSerializable("FTS_KEY_onStartWebSearch_params", new HashMap(map));
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(135, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onSearchDataReady exception" + e.getMessage());
        }
    }

    /* renamed from: rd */
    public void mo8690rd(int i, JSONObject jSONObject) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_json_data", jSONObject.toString());
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(137, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e.getMessage());
        }
    }

    public void s80(int i, int i2, String str) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Log.m105925i("MicroMsg.MsgHandler", "onSearchImageListReady ret %d data %s", Integer.valueOf(i2), str);
        Bundle bundle = new Bundle();
        bundle.putInt("fts_key_ret", i2);
        bundle.putString("fts_key_data", str);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(120, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onSearchImageListReady exception" + e.getMessage());
        }
    }

    public void s90(int i, String str, boolean z, String str2, Bundle bundle) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("fts_key_req_id", str2);
        bundle2.putString("fts_key_json_data", str);
        bundle2.putBoolean("fts_key_new_query", z);
        if (bundle != null) {
            bundle2.putBundle("fts_key_data", bundle);
        }
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(119, bundle2);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onSearchDataReady exception" + e.getMessage());
        }
    }

    /* renamed from: vf */
    public void mo8693vf(int i, String str) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_json_data", str);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(128, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e.getMessage());
        }
    }

    /* renamed from: vg */
    public void mo8694vg(int i, Map<String, Object> map) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        int e = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String f = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        if (e != 20 || Util.isNullOrNil(f)) {
            Log.m105929w("MicroMsg.MsgHandler", "doSearchHotWordOperation warning, scene=%d, query=%s", Integer.valueOf(e), f);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fts_key_new_query", f);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(136, bundle);
            }
        } catch (Exception e2) {
            Log.m105928w("MicroMsg.MsgHandler", "doSearchHotWordOperation exception" + e2.getMessage());
        }
    }

    public void we0(int i, int i2, int i3) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("fts_key_data", i2);
        bundle.putInt("fts_key_cache", i3);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(155, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "showNavBarShadow exception" + e.getMessage());
        }
    }

    /* renamed from: wq */
    public void mo8696wq(int i, boolean z) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("fts_key_interactivepopgesture_enabled", z);
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(161, bundle);
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "onGestrueOnPressBackControl exception" + e.getMessage());
        }
    }

    /* renamed from: yx */
    public void mo8697yx(int i) {
        MsgHandler a = C44040v3.m48330a(i);
        a.getClass();
        try {
            C6107m mVar = a.f22715x;
            if (mVar != null) {
                mVar.callback(156, new Bundle());
            }
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.MsgHandler", "hideNavBarShadow exception" + e.getMessage());
        }
    }
}
