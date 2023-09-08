package cm2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.fts.p059ui.FTSConvMessageUI;
import com.tencent.p014mm.plugin.fts.p059ui.FTSConvTalkerMessageUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import p214om.C11502f;
import p227rn.C48053v;
import p248ug.C52558c;
import p255vr.C78469f;
import pv1.C100970d;
import pv1.C22019b;
import rb0.C47984k;
import xv1.C102758m;
import xv1.C102770t;
import xy1.C53475k;

/* renamed from: cm2.e */
public class C67405e implements C100970d {
    /* renamed from: d */
    public boolean mo91604d(Context context, View view, C22019b bVar, Object... objArr) {
        Context context2 = context;
        Class cls = C53475k.class;
        Class<FTSConvMessageUI> cls2 = FTSConvMessageUI.class;
        Class cls3 = C48053v.class;
        Class cls4 = C11502f.class;
        C102758m mVar = (C102758m) bVar;
        ((C78469f) C86312j.m106911c(C78469f.class)).Vs0(bVar.mo35139k());
        if (C72996z1.m85843n5(mVar.f303428r) || C72996z1.m85847r5(mVar.f303428r)) {
            if (!WeChatBrands.Business.Entries.GlobalWeCom.checkAvailable(view.getContext())) {
                return true;
            }
        } else if (C45628s0.m50738C(mVar.f303428r)) {
            if (!WeChatBrands.Business.Entries.SessionOa.checkAvailable(view.getContext())) {
                return true;
            }
        } else if (C72996z1.m85819U4(mVar.f303428r) && !WeChatBrands.Business.Entries.SessionOa.checkAvailable(view.getContext())) {
            return true;
        }
        int i = mVar.f303427q;
        if (i == 0) {
            Intent putExtra = new Intent(context2, cls2).putExtra("Search_Scene", mVar.f62330h).putExtra("key_conv", mVar.f303428r).putExtra("key_query", mVar.mo35139k()).putExtra("key_count", 1);
            C9556a aVar = new C9556a();
            aVar.mo10233c(putExtra);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        String str = "";
        String str2 = "key_count";
        Class<FTSConvMessageUI> cls5 = cls2;
        String str3 = "key_query";
        if (i == 1) {
            if (((C48053v) C86312j.m106911c(cls3)).mo72617gl(mVar.f303428r)) {
                ((C67654r1) ((C11502f) C86312j.m106911c(cls4)).mo11462yM()).mo93174g(new Intent().putExtra("Contact_User", mVar.f303428r), context2);
                return true;
            } else if (((C48053v) C86312j.m106911c(cls3)).mo72614OE(mVar.f303428r)) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", mVar.f303428r);
                intent.addFlags(67108864);
                intent.putExtra("biz_chat_from_scene", 5);
                C88144b.m109801s(context2, ".ui.bizchat.BizChatConversationUI", intent, (Bundle) null);
                return true;
            } else if (C47984k.m53339m(mVar.f303428r)) {
                C52558c b = C47984k.m53328b(mVar.f303428r);
                String B = b == null ? null : b.mo72807B();
                String str4 = B == null ? str : B;
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", str4);
                intent2.putExtra("useJs", true);
                intent2.putExtra("srcUsername", mVar.f303428r);
                intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent2.addFlags(67108864);
                C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                return true;
            } else if (C72996z1.m85808L4(mVar.f303428r)) {
                ArrayList<String> stringsToList = Util.stringsToList(mVar.f62327e.f292122c);
                Intent intent3 = new Intent();
                intent3.putExtra("Chat_User", mVar.f303426p.f292153g);
                intent3.putExtra("finish_direct", true);
                boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
                C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
                if (hVar != null) {
                    z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
                }
                Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
                if (!z) {
                    intent3.putExtra("key_need_send_video", false);
                }
                intent3.putExtra("from_global_search", true);
                intent3.putExtra("msg_local_id", mVar.f303426p.f292150d);
                intent3.putExtra("highlight_keyword_list", stringsToList);
                intent3.putExtra("app_brand_chatting_from_scene_new", 5);
                C88144b.m109801s(context2, ".ui.chatting.AppBrandServiceChattingUI", intent3, (Bundle) null);
                return true;
            } else if (C72996z1.m85832c5(mVar.f303428r)) {
                Intent putExtra2 = new Intent().putExtra("Chat_User", mVar.f303428r).putExtra("Chat_Self", ((C53475k) C86312j.m106911c(cls)).mo59160G2(mVar.f303428r).mo59158t1()).putExtra("finish_direct", true);
                putExtra2.putExtra("chat_from_scene", 5);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls4)).mo11462yM()).mo93173f(putExtra2, context2);
                return true;
            } else {
                Intent putExtra3 = new Intent().putExtra("Chat_User", mVar.f303428r).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", mVar.f303426p.f292150d).putExtra("highlight_keyword_list", Util.stringsToList(mVar.f62327e.f292122c));
                putExtra3.putExtra("chat_from_scene", 5);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls4)).mo11462yM()).mo93173f(putExtra3, context2);
                return true;
            }
        } else if (((C48053v) C86312j.m106911c(cls3)).mo72614OE(mVar.f303428r)) {
            Intent intent4 = new Intent();
            intent4.putExtra("Contact_User", mVar.f303428r);
            intent4.addFlags(67108864);
            intent4.putExtra("biz_chat_from_scene", 5);
            C88144b.m109801s(context2, ".ui.bizchat.BizChatConversationUI", intent4, (Bundle) null);
            return true;
        } else if (C47984k.m53339m(mVar.f303428r)) {
            C52558c b2 = C47984k.m53328b(mVar.f303428r);
            String B2 = b2 == null ? null : b2.mo72807B();
            String str5 = B2 == null ? str : B2;
            Intent intent5 = new Intent();
            intent5.putExtra("rawUrl", str5);
            intent5.putExtra("useJs", true);
            intent5.putExtra("srcUsername", mVar.f303428r);
            intent5.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            intent5.addFlags(67108864);
            C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent5, (Bundle) null);
            return true;
        } else if (C72996z1.m85832c5(mVar.f303428r)) {
            Intent putExtra4 = new Intent().putExtra("Chat_User", mVar.f303428r).putExtra("Chat_Self", ((C53475k) C86312j.m106911c(cls)).mo59160G2(mVar.f303428r).mo59158t1()).putExtra("finish_direct", true);
            putExtra4.putExtra("chat_from_scene", 5);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls4)).mo11462yM()).mo93173f(putExtra4, context2);
            return true;
        } else if (mVar instanceof C102770t) {
            C102770t tVar = (C102770t) mVar;
            Intent putExtra5 = new Intent(context2, FTSConvTalkerMessageUI.class).putExtra("Search_Scene", tVar.f62330h).putExtra("key_talker_query", tVar.f303460x.f292168v.f292120a).putExtra("key_talker", tVar.f303460x.f292151e).putExtra("key_conv", tVar.f303428r).putExtra(str3, tVar.mo35139k()).putExtra("detail_type", tVar.f303461y);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(putExtra5);
            C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else {
            Intent putExtra6 = new Intent(context2, cls5).putExtra("Search_Scene", mVar.f62330h).putExtra("key_conv", mVar.f303428r).putExtra(str3, mVar.mo35139k()).putExtra(str2, mVar.f303427q);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(putExtra6);
            C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/search/ui/item/handler/FTSMessageDataItemClickHandler", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }
}
