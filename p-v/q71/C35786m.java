package q71;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.RtosWatchSaveQuickReplyEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hk2.C32939b;
import java.util.ArrayList;
import ok2.C35183a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: q71.m */
public class C35786m extends IStaticListener<RtosWatchSaveQuickReplyEvent> {
    public boolean callback(IEvent iEvent) {
        RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = (RtosWatchSaveQuickReplyEvent) iEvent;
        try {
            JSONArray jSONArray = new JSONObject(rtosWatchSaveQuickReplyEvent.f78957d.f78959a).getJSONArray("replyList");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                C35183a aVar = new C35183a();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                aVar.field_orderIndex = jSONObject.getInt(FirebaseAnalytics.C113379b.INDEX);
                aVar.field_quickMsg = jSONObject.getString("msg");
                arrayList.add(aVar);
            }
            if (!arrayList.isEmpty()) {
                C41166r1.Jx0().mo59902jo();
                C41166r1.Jx0().mo59903qq(arrayList);
                rtosWatchSaveQuickReplyEvent.f78958e.f78960a = "ok";
            } else {
                C41166r1.Jx0().mo59902jo();
                rtosWatchSaveQuickReplyEvent.f78958e.f78960a = "ok";
            }
            ((C32939b) C86312j.m106911c(C32939b.class)).mo33891Ir();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("RtosOnSaveQuickReplyListener", e, e.toString(), new Object[0]);
            rtosWatchSaveQuickReplyEvent.f78958e.f78960a = "fail";
            return true;
        }
    }
}
