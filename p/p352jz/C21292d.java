package p352jz;

import android.content.Context;
import c30.C104289g;
import com.tencent.p014mm.autogen.events.HaoKanActionEvent;
import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19391e;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19392f;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import hc0.C20937c;
import o03.C21723h;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import s03.C36614d;
import t03.C22420e;
import t03.C22422f;
import t03.C22426h;
import t03.C36929i;

/* renamed from: jz.d */
public class C21292d extends IStaticListener<HaoKanActionEvent> {
    public boolean callback(IEvent iEvent) {
        C22420e.C22421a aVar;
        HaoKanActionEvent haoKanActionEvent = (HaoKanActionEvent) iEvent;
        HaoKanActionEvent.C1088a aVar2 = haoKanActionEvent.f9314d;
        if (aVar2 == null) {
            return false;
        }
        Log.m105925i("MicroMsg.HaoKanActionEventIListener", "recv HaoKanActionEvent, serverData:%s, clientData:%s", aVar2.f9315a, aVar2.f9316b);
        if (!Util.isNullOrNil(haoKanActionEvent.f9314d.f9315a) && (aVar = ((C22422f) C86312j.m106911c(C22422f.class)).f63535g) != null) {
            String str = haoKanActionEvent.f9314d.f9315a;
            C19391e eVar = TopStoryHomeUIComponentImpl.this.f54512j;
            if (eVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("params", str);
                } catch (JSONException e) {
                    Log.m105928w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebRecommendInfoUpdate json exception: " + e.getMessage());
                }
                MMHandlerThread.postToMainThread(new C19392f(eVar, jSONObject.toString()));
            }
        }
        if (Util.isNullOrNil(haoKanActionEvent.f9314d.f9316b)) {
            return true;
        }
        try {
            C104289g gVar = new C104289g(haoKanActionEvent.f9314d.f9316b);
            String string = gVar.getString("action");
            C104289g k = gVar.getJSONObject("params");
            if (string.equals("updateNumReddot")) {
                String optString = k.optString("msgId");
                int i = k.getInt("latestTimeStamp");
                int i2 = k.getInt(TPReportKeys.Common.COMMON_SEQ);
                ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33997h(optString, (long) i, true, i2, true);
                return true;
            } else if (string.equals("openProfile")) {
                String string2 = k.getString("openId");
                Context context = MMApplicationContext.getContext();
                C20937c cVar = C22426h.f63540a;
                C36614d dVar = new C36614d(string2);
                C86709a0.m107524d().mo123455a(2830, new C36929i(dVar, context));
                C86709a0.m107524d().mo123460f(dVar);
                return true;
            } else if (!string.equals("openWowColikeSetting")) {
                return true;
            } else {
                C22426h.m26108j(MMApplicationContext.getContext());
                return true;
            }
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.HaoKanActionEventIListener", "HaoKanActionEvent error");
            Log.printErrStackTrace("MicroMsg.HaoKanActionEventIListener", e2, "", new Object[0]);
            return true;
        }
    }
}
