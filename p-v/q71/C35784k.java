package q71;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.RtosWatchGetQuickReplyEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import ok2.C35183a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: q71.k */
public class C35784k extends IStaticListener<RtosWatchGetQuickReplyEvent> {
    public boolean callback(IEvent iEvent) {
        RtosWatchGetQuickReplyEvent rtosWatchGetQuickReplyEvent = (RtosWatchGetQuickReplyEvent) iEvent;
        ArrayList<C35183a> Lo = C41166r1.Jx0().mo59900Lo();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < Lo.size()) {
            try {
                C35183a aVar = Lo.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(aVar.field_orderIndex));
                jSONObject.putOpt("msg", aVar.field_quickMsg);
                jSONArray.put(jSONObject);
                i++;
            } catch (Exception e) {
                Log.printErrStackTrace("RtosOnGetQuickReplyListener", e, e.toString(), new Object[0]);
            }
        }
        if (jSONArray.length() > 0) {
            rtosWatchGetQuickReplyEvent.f78954d.f78955a = "success";
        } else {
            rtosWatchGetQuickReplyEvent.f78954d.f78955a = "fail";
        }
        rtosWatchGetQuickReplyEvent.f78954d.f78956b = jSONArray.toString();
        return true;
    }
}
