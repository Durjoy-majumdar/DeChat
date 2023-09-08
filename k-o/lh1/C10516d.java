package lh1;

import ak1.C54067f0;
import ak1.C54116w;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import di3.C7335d;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import org.json.JSONObject;
import pc0.C100765f;
import wd3.C65953v0;

/* renamed from: lh1.d */
public final class C10516d implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f31758a;

    /* renamed from: b */
    public final /* synthetic */ ShellView f31759b;

    /* renamed from: c */
    public final /* synthetic */ String f31760c;

    public C10516d(String str, ShellView shellView, String str2) {
        this.f31758a = str;
        this.f31759b = shellView;
        this.f31760c = str2;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        if (z && !Util.isNullOrNil(this.f31758a)) {
            String str2 = this.f31758a;
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = str2;
                aVar.f9498b = str;
                aVar.f9499c = C45628s0.m50810y(str2);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            C7250m.m7431a().mo136256TG(this.f31759b.getContext(), this.f31758a, this.f31760c, 0, "", "", (C100765f) null);
            ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f31758a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_username", this.f31758a);
            jSONObject.put("type", 6);
            jSONObject.put("share_type", 1);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…             }.toString()");
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }
}
