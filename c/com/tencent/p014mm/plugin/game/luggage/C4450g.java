package com.tencent.p014mm.plugin.game.luggage;

import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import dy1.C45493h;
import dy1.C45494s;
import dy1.C7536a;
import dy1.C7543c;
import dy1.C7545d;
import dy1.C7546e;
import dy1.C7547f;
import dy1.C7548g;
import dy1.C7550i;
import dy1.C7552j;
import dy1.C7554k;
import dy1.C7558l;
import dy1.C7559m;
import dy1.C7560n;
import dy1.C7561o;
import dy1.C7563p;
import dy1.C7567r;
import dy1.C7568t;
import ei3.C86522b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import k83.C9566b;
import ky1.C10427g;
import org.json.JSONArray;
import p166hy.C8829f0;
import p828wa.C53096b;
import q20.C89449a;
import yx1.C53635c;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.game.luggage.g */
public class C4450g extends C86301e implements C53635c {

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.g$a */
    public static class C4451a implements C80883e<IPCString, Bundle> {
        private C4451a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C4450g.vx0(((IPCString) obj).f10315d);
        }
    }

    public static void vx0(String str) {
        Log.m105925i("MicroMsg.LuggageGameService", "clearGameCache key:%s", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        C9566b.m9247c().mo10245d().mo10248Lo("wx62d9035fd4fd2059", jSONArray);
    }

    public Map<String, Class> Wc0() {
        Class cls = C8829f0.class;
        Class<C7568t> cls2 = C7568t.class;
        HashMap hashMap = new HashMap();
        hashMap.put(JsApiAddDownloadTaskStraight.NAME, C7536a.class);
        hashMap.put("bookDownloadGame", C7543c.class);
        hashMap.put(JsApiCancelDownloadTask.NAME, C7545d.class);
        hashMap.put("getDownloadWidgetTaskInfos", C7547f.class);
        hashMap.put(JsApiGetInstallState.NAME, C7548g.class);
        hashMap.put(JsApiInstallDownloadTask.NAME, C7550i.class);
        hashMap.put("jumpDownloaderWidget", C7552j.class);
        hashMap.put("launchApplication", C7554k.class);
        hashMap.put(JsApiPauseDownloadTask.NAME, C7560n.class);
        hashMap.put(JsApiQueryDownloadTask.NAME, C7561o.class);
        hashMap.put(JsApiResumeDownloadTask.NAME, C7563p.class);
        hashMap.put("startGameWebview", cls2);
        hashMap.put("startGameWebView", cls2);
        hashMap.put("openGameCenter", C7558l.class);
        hashMap.put("openGameTabHome", C7559m.class);
        hashMap.put(((C8829f0) C86312j.m106911c(cls)).r20(), ((C8829f0) C86312j.m106911c(cls)).Q00());
        hashMap.put("sendGameShareCard", C7567r.class);
        hashMap.put("gameShareTimeline", C7546e.class);
        hashMap.put("showInputToolView", C45494s.class);
        hashMap.put("initGameLiteApp", C45493h.class);
        return hashMap;
    }

    /* renamed from: Wf */
    public String mo5379Wf(String str) {
        return C9566b.m9247c().mo10244b(str);
    }

    public boolean Yj0(String str) {
        if (MMApplicationContext.isMainProcess()) {
            vx0(str);
            return false;
        }
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str), C4451a.class, (C1256g) null);
        return false;
    }

    public LinkedList<Class> dj0() {
        LinkedList<Class<? extends C53096b>> linkedList;
        synchronized (C10427g.class) {
            C10427g.f31646a = new LinkedList<>();
            C10427g.m10362b();
            linkedList = C10427g.f31646a;
        }
        return new LinkedList<>(linkedList);
    }
}
