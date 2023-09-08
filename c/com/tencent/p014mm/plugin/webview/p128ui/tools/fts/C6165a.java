package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.content.Intent;
import android.text.TextUtils;
import c00.C0405n;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6221c4;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.a */
public class C6165a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Map f22631d;

    /* renamed from: e */
    public final /* synthetic */ BaseSOSWebViewUI f22632e;

    public C6165a(BaseSOSWebViewUI baseSOSWebViewUI, Map map) {
        this.f22632e = baseSOSWebViewUI;
        this.f22631d = map;
    }

    public void run() {
        BaseSOSWebViewUI baseSOSWebViewUI = this.f22632e;
        Map map = this.f22631d;
        baseSOSWebViewUI.getClass();
        Class cls = C0405n.class;
        Log.m105925i("MicroMsg.WebSearch.BaseSOSWebViewUI", "openSearchWebView %s", map.toString());
        int e = C43471q.m46981e(map, "type", 0);
        HashMap hashMap = new HashMap();
        hashMap.put("toViewType", "suggestion");
        String b = C6221c4.m6515b(new JSONObject(hashMap).toString());
        String str = (String) map.get("tagId");
        String str2 = (String) map.get("sessionId");
        int e2 = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String inEditTextQuery = baseSOSWebViewUI.f118812u3.getInEditTextQuery();
        String f = C43471q.m46982f(map, "searchId");
        Intent intent = new Intent();
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("key_load_js_without_delay", true);
        intent.putExtra("ftsQuery", inEditTextQuery);
        intent.putExtra("ftsType", e);
        intent.putExtra("ftsbizscene", e2);
        Map<String, String> H80 = ((C0405n) C86312j.m106911c(cls)).H80(e2, false, e, b);
        H80.put(SearchIntents.EXTRA_QUERY, C6221c4.m6515b(inEditTextQuery));
        H80.put("searchId", f);
        H80.put("isHomePage", String.valueOf(1));
        H80.put("isSug", "1");
        if (!TextUtils.isEmpty(str2)) {
            H80.put("sessionId", str2);
            intent.putExtra("sessionId", str2);
        }
        String str3 = (String) map.get("subSessionId");
        H80.put("subSessionId", str3);
        intent.putExtra("subSessionId", str3);
        intent.putExtra("rawUrl", ((C0405n) C86312j.m106911c(cls)).mo277Vw(H80));
        intent.putExtra("ftsQuery", inEditTextQuery);
        intent.putExtra("tabId", str);
        intent.putExtra("key_load_js_without_delay", true);
        intent.putExtra("ftsneedkeyboard", true);
        intent.putExtra("key_search_icon_and_hint_fix_default", true);
        intent.putExtra("ftsInitToSearch", true);
        intent.putExtra("hideSearchInput", false);
        C88144b.m109805w(MMApplicationContext.getContext(), intent);
    }
}
