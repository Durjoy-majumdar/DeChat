package kf1;

import ak1.C54067f0;
import ak1.C54108o;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C7250m;
import di3.C7335d;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.HashMap;
import pc0.C100765f;
import te3.C49352ez;
import wd3.C65953v0;

/* renamed from: kf1.k4 */
public final class C9825k4 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f30374a;

    /* renamed from: b */
    public final /* synthetic */ C9765h4 f30375b;

    public C9825k4(String str, C9765h4 h4Var) {
        this.f30374a = str;
        this.f30375b = h4Var;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        String str2;
        String str3;
        if (z && !Util.isNullOrNil(this.f30374a)) {
            C9765h4 h4Var = this.f30375b;
            AppCompatActivity activity = h4Var.getActivity();
            String str4 = this.f30374a;
            C87412m.m108591d(str4);
            h4Var.getClass();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (!TextUtils.isEmpty(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = str4;
                aVar.f9498b = str;
                aVar.f9499c = C45628s0.m50810y(str4);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            h4Var.mo10369l3();
            C7250m.m7431a().mo136256TG(activity, str4, h4Var.f30251L, 0, "", "", (C100765f) null);
            C75026b.m89951a(activity, "已发送");
            ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f30374a);
            HashMap hashMap = new HashMap();
            C9765h4 h4Var2 = this.f30375b;
            String str5 = this.f30374a;
            C49352ez ezVar = h4Var2.f30249J;
            String str6 = "";
            if (ezVar == null || (str2 = ezVar.f133182d) == null) {
                str2 = str6;
            }
            hashMap.put("activityId", str2);
            hashMap.put("is_fast_share", "1");
            hashMap.put("share_type", "1");
            hashMap.put("share_wx_username", str5);
            C49352ez ezVar2 = h4Var2.f30249J;
            if (!(ezVar2 == null || (str3 = ezVar2.f133179B) == null)) {
                str6 = str3;
            }
            hashMap.put("resource_id", str6);
            hashMap.put("enter_sence", h4Var2.f30245F);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_CONCERT_TICKET_PAGE_SHARE_SUCC;
            C9765h4 h4Var3 = this.f30375b;
            C8777j5.C8778a.m8607h((C8777j5) c, mVar, hashMap, h4Var3.f30255Q, h4Var3.f30256R, (String) null, 16, (Object) null);
        }
    }
}
