package wz0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import eb0.C45628s0;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import te3.C22498fy;

/* renamed from: wz0.b */
public class C53246b {
    /* renamed from: a */
    public static void m59669a(MMActivity mMActivity, int i, MMActivity.C6739d dVar) {
        Intent intent = new Intent();
        intent.putExtra("select_is_ret", false);
        intent.putExtra("Select_Conv_Type", 3);
        C88144b.m109803u(mMActivity, ".ui.transmit.SelectConversationUI", intent, i, dVar);
    }

    /* renamed from: b */
    public static void m59670b(MMActivity mMActivity, boolean z) {
        Intent intent = new Intent(mMActivity, CardNewMsgUI.class);
        intent.putExtra("from_menu", z);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/util/CardActivityHelper", "goCardNewMsgUI", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMActivity, "com/tencent/mm/plugin/card/util/CardActivityHelper", "goCardNewMsgUI", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Log.m105926v("MicroMsg.CardActivityHelper", "start CardNewMsgUI");
        C115669n.INSTANCE.mo160131h(11324, "CardMsgCenterView", 0, "", "", 0, 0, "", 0, "");
    }

    /* renamed from: c */
    public static void m59671c(MMActivity mMActivity, float f, float f2, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("map_view_type", 13);
        intent.putExtra("kwebmap_slat", (double) f);
        intent.putExtra("kwebmap_lng", (double) f2);
        intent.putExtra("kPoiName", str);
        intent.putExtra("Kwebmap_locaion", str2);
        C88144b.m109791i(mMActivity, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
    }

    /* renamed from: d */
    public static boolean m59672d(String str, String str2, String str3, int i, int i2) {
        if (Util.isNullOrNil(str2)) {
            Log.m105924i("MicroMsg.CardActivityHelper", "gotoAppBrand commField.app_brand_user_name is null");
            return false;
        }
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = str2;
        aVar.f9527b = Util.nullAs(str3, "");
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9528c = i2;
        if (i == 26) {
            aVar2.f9529d = 1029;
        } else {
            aVar2.f9529d = 1028;
        }
        aVar2.f9530e = str;
        aVar2.f9538m = true;
        startAppBrandUIFromOuterEvent.publish();
        StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
        Log.m105925i("MicroMsg.CardActivityHelper", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d", aVar3.f9526a, aVar3.f9527b, Integer.valueOf(aVar3.f9529d), Integer.valueOf(startAppBrandUIFromOuterEvent.f9522d.f9528c));
        return true;
    }

    /* renamed from: e */
    public static boolean m59673e(String str, C22498fy fyVar, int i, int i2) {
        if (fyVar != null) {
            return m59672d(str, fyVar.f63893p, fyVar.f63894q, i, i2);
        }
        Log.m105924i("MicroMsg.CardActivityHelper", "gotoAppBrand commField is null");
        return false;
    }

    /* renamed from: f */
    public static void m59674f(String str, String str2, int i) {
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = str;
        aVar.f9527b = Util.nullAs(str2, "");
        if (i > 0) {
            startAppBrandUIFromOuterEvent.f9522d.f9534i = i;
        }
        startAppBrandUIFromOuterEvent.f9522d.f9529d = 1028;
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: g */
    public static void m59675g(MMActivity mMActivity, int i, String str, boolean z, C20483c cVar) {
        Intent intent = new Intent();
        intent.putExtra("key_from_scene", 3);
        intent.putExtra("key_expire_time", i);
        intent.putExtra("key_begin_time", System.currentTimeMillis());
        intent.putExtra("key_card_tips", str);
        intent.putExtra("key_is_mark", z);
        intent.putExtra("key_card_id", cVar.mo23270R0());
        intent.putExtra("key_user_card_id", cVar.getCardId());
        intent.putExtra("key_card_code", cVar.mo23263J0().f63950o);
        C88144b.m109791i(mMActivity, "offline", ".ui.WalletOfflineEntranceUI", intent, (Bundle) null);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11850, 5, 0);
        nVar.mo160131h(19671, 1, cVar.getCardId());
    }

    /* renamed from: h */
    public static void m59676h(MMActivity mMActivity, String str) {
        Intent intent = new Intent();
        intent.putExtra("KEY_BRAND_NAME", str);
        C88144b.m109791i(mMActivity, "card", ".ui.CardShowWaringTransparentUI", intent, (Bundle) null);
    }

    /* renamed from: i */
    public static void m59677i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.CardActivityHelper", "username is null");
        } else if (context == null) {
            Log.m105920e("MicroMsg.CardActivityHelper", "context is null, err");
        } else {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("force_get_contact", true);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: j */
    public static void m59678j(MMActivity mMActivity, String str, int i) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("stastic_scene", i);
        C88144b.m109791i(mMActivity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: k */
    public static void m59679k(MMActivity mMActivity, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("stastic_scene", 0);
        intent.putExtra("rawUrl", str);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        C88144b.m109791i(mMActivity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: l */
    public static void m59680l(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.CardActivityHelper", "username is null");
        } else if (!C45628s0.m50740E(str)) {
            m59677i(context, str);
        } else if (TextUtils.isEmpty(str)) {
            Log.m105926v("MicroMsg.CardActivityHelper", "username is null");
        } else {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        }
    }
}
