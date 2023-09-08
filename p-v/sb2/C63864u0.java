package sb2;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59833q;
import java.util.LinkedList;
import ke3.C88144b;
import o40.C61926c;
import te3.C64488kb1;
import wd3.C65953v0;

/* renamed from: sb2.u0 */
public final class C63864u0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C63849t0 f181039a;

    /* renamed from: b */
    public final /* synthetic */ String f181040b;

    /* renamed from: c */
    public final /* synthetic */ String f181041c;

    /* renamed from: d */
    public final /* synthetic */ C8479f0<String> f181042d;

    /* renamed from: e */
    public final /* synthetic */ C59822f f181043e;

    /* renamed from: f */
    public final /* synthetic */ C64488kb1 f181044f;

    /* renamed from: sb2.u0$a */
    public static final class C63865a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C59822f f181045d;

        /* renamed from: e */
        public final /* synthetic */ C63849t0 f181046e;

        /* renamed from: f */
        public final /* synthetic */ String f181047f;

        /* renamed from: g */
        public final /* synthetic */ C64488kb1 f181048g;

        public C63865a(C59822f fVar, C63849t0 t0Var, String str, C64488kb1 kb12) {
            this.f181045d = fVar;
            this.f181046e = t0Var;
            this.f181047f = str;
            this.f181048g = kb12;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            FinderObject d;
            if (i == 1 && i2 == -1 && (d = C59822f.f170752A.mo84779d(this.f181045d)) != null) {
                C63849t0 t0Var = this.f181046e;
                String str = this.f181047f;
                C64488kb1 kb12 = this.f181048g;
                C59822f fVar = this.f181045d;
                LinkedList linkedList = new LinkedList();
                String p = C61926c.m72691p(d.f164794id);
                String str2 = d.objectNonceId;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                linkedList.add(new Pair(p, str2));
                ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Tr0(linkedList, false);
                StringBuilder sb = new StringBuilder();
                sb.append("share mv success ");
                sb.append(C61926c.m72691p(d.f164794id));
                sb.append(' ');
                String str4 = d.objectNonceId;
                if (str4 != null) {
                    str3 = str4;
                }
                sb.append(str3);
                Log.m105924i("MicroMsg.Mv.MusicMvShareUIC", sb.toString());
                C63796j1 j1Var = t0Var.f180994d;
                if (j1Var != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C87412m.m108594g(str, "toUser");
                    j1Var.mo88590a(currentTimeMillis, 3, "2", 10, str);
                }
                String listToString = Util.listToString(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
                ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(str);
                C59833q qVar = C59833q.f170832a;
                Activity context = t0Var.getContext();
                C87412m.m108593f(listToString, "userListStr");
                qVar.mo84801m(context, kb12, fVar, 2, 2, listToString, 2);
            }
        }
    }

    public C63864u0(C63849t0 t0Var, String str, String str2, C8479f0<String> f0Var, C59822f fVar, C64488kb1 kb12) {
        this.f181039a = t0Var;
        this.f181040b = str;
        this.f181041c = str2;
        this.f181042d = f0Var;
        this.f181043e = fVar;
        this.f181044f = kb12;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        C63796j1 j1Var;
        if (!z && (j1Var = this.f181039a.f180994d) != null) {
            j1Var.mo88590a(System.currentTimeMillis(), 1, "2", 10, (String) null);
        }
        if (z && !Util.isNullOrNil(this.f181040b)) {
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("content_type_forward_to_wework", 11);
            intent.putExtra("Retr_Msg_content", this.f181041c);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", (String) this.f181042d.f27484d);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", this.f181040b);
            Activity context = this.f181039a.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C88144b.m109803u((MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1, new C63865a(this.f181043e, this.f181039a, this.f181040b, this.f181044f));
        }
    }
}
