package ok1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.LinkedList;
import ke3.C88144b;
import kr0.C76629w0;
import sf0.C77691f;
import sk1.C63965x;
import te3.C50019jp1;
import te3.C50926q81;

/* renamed from: ok1.f */
public final class C62062f implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C50926q81 f176434a;

    /* renamed from: b */
    public final /* synthetic */ C63965x f176435b;

    /* renamed from: c */
    public final /* synthetic */ Context f176436c;

    public C62062f(C50926q81 q812, C63965x xVar, Context context) {
        this.f176434a = q812;
        this.f176435b = xVar;
        this.f176436c = context;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        String str;
        String str2;
        String str3;
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f176434a.f140178e);
        if (z1Var == null || z1Var.f108320R1 == 0) {
            Log.m105928w("FinderLiveUtil", "weapp contact not found, mock and insert: " + this.f176434a.f140178e + ' ' + wxaAttributes.field_nickname);
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni();
            C72996z1 z1Var2 = new C72996z1();
            z1Var2.setUsername(this.f176434a.f140178e);
            z1Var2.mo62878U2(wxaAttributes.field_nickname);
            try {
                z1Var2.mo62882W2(C77691f.m93687b(z1Var2.getNickname()));
                z1Var2.mo62884X2(C77691f.m93686a(z1Var2.getNickname()));
            } catch (UnsatisfiedLinkError unused) {
            }
            Ni.mo69704i3(z1Var2);
        }
        C50019jp1 jp12 = this.f176434a.f140179f;
        String str4 = "";
        if (jp12 == null || (str = jp12.f136237d) == null) {
            str = str4;
        }
        Intent intent = new Intent();
        C50926q81 q812 = this.f176434a;
        C63965x xVar = this.f176435b;
        Context context = this.f176436c;
        intent.putExtra("Chat_User", q812.f140178e);
        intent.putExtra("app_brand_chatting_from_scene", 4);
        intent.putExtra("key_temp_session_from", str);
        intent.putExtra("finish_direct", true);
        boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
        C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
        if (hVar != null) {
            z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
        }
        Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
        if (!z) {
            intent.putExtra("key_need_send_video", false);
        }
        intent.putExtra("enableAnimation", true);
        intent.putExtra("app_brand_chatting_from_scene_new", 6);
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        bVar.f239557a = str;
        bVar.f239560d = q812.f140178e;
        bVar.f239564h = 0;
        intent.putExtra("app_brand_chatting_expose_params", bVar.mo113977a());
        String str5 = null;
        if (xVar != null) {
            intent.putExtra("sendMessageTitle", xVar.f181348u);
            C50019jp1 jp13 = q812.f140179f;
            if (jp13 == null || (str3 = jp13.f136238e) == null) {
                str3 = str4;
            }
            intent.putExtra("sendMessagePath", str3);
            LinkedList<String> linkedList = xVar.f181349v;
            String first = linkedList != null ? linkedList.getFirst() : null;
            if (first == null) {
                first = str4;
            }
            intent.putExtra("sendMessageImg", first);
            intent.putExtra("showMessageCard", true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("enter wxa shop service with: ");
        sb.append(q812.f140178e);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        if (xVar != null) {
            str5 = xVar.f181348u;
        }
        sb.append(str5);
        sb.append(' ');
        C50019jp1 jp14 = q812.f140179f;
        if (!(jp14 == null || (str2 = jp14.f136238e) == null)) {
            str4 = str2;
        }
        sb.append(str4);
        Log.m105924i("FinderLiveUtil", sb.toString());
        C88144b.m109802t(context, ".ui.chatting.AppBrandServiceChattingUI", intent, 0);
    }
}
