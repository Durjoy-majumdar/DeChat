package pp0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import ev1.C58838a;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import ke3.C88144b;
import p285zh.C119114c;
import p687sr.C64152d;
import p687sr.C64153e;
import p687sr.C64156g;
import p687sr.C64159i;
import rx3.C13598b0;

/* renamed from: pp0.a */
public final class C62421a {

    /* renamed from: a */
    public static final C62421a f177387a = new C62421a();

    /* renamed from: pp0.a$a */
    public static final class C62422a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f177388d;

        /* renamed from: e */
        public final /* synthetic */ String f177389e;

        /* renamed from: f */
        public final /* synthetic */ int f177390f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62422a(String str, String str2, int i) {
            super(1);
            this.f177388d = str;
            this.f177389e = str2;
            this.f177390f = i;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            ArrayList<C58838a> msgList = ((C64159i) C86312j.m106911c(C64159i.class)).sq0().getMsgList();
            ArrayList arrayList = new ArrayList();
            for (T next : msgList) {
                if (next instanceof C64152d) {
                    arrayList.add(next);
                }
            }
            ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(1, 3, this.f177388d, arrayList.size(), this.f177389e);
            C62421a.f177387a.mo87473a(this.f177390f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pp0.a$b */
    public static final class C62423b extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f177391d;

        /* renamed from: e */
        public final /* synthetic */ String f177392e;

        /* renamed from: f */
        public final /* synthetic */ Map<String, String> f177393f;

        /* renamed from: g */
        public final /* synthetic */ int f177394g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62423b(int i, String str, Map<String, String> map, int i2) {
            super(1);
            this.f177391d = i;
            this.f177392e = str;
            this.f177393f = map;
            this.f177394g = i2;
        }

        public Object invoke(Object obj) {
            String str;
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "on force notify click, jump type: " + this.f177391d);
            ArrayList<C58838a> msgList = ((C64159i) C86312j.m106911c(C64159i.class)).sq0().getMsgList();
            ArrayList arrayList = new ArrayList();
            for (T next : msgList) {
                if (next instanceof C64152d) {
                    arrayList.add(next);
                }
            }
            ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(1, 5, "", arrayList.size(), this.f177392e);
            int i = this.f177391d;
            if (i == 0) {
                C62421a.f177387a.mo87473a(this.f177394g);
            } else if (i != 2) {
                C62421a.f177387a.mo87473a(this.f177394g);
            } else {
                C62421a aVar = C62421a.f177387a;
                Map<String, String> map = this.f177393f;
                C87412m.m108593f(map, "values");
                int i2 = this.f177394g;
                Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "handleGameForcePushJump2H5");
                String str2 = map.get(".msgsource.forcepushinfov2.forcepushinfocontent.jumpinfo");
                if (!Util.isNullOrNil(str2)) {
                    try {
                        str = new C104289g(str2).optString("url");
                    } catch (C79923f e) {
                        Log.m105921e("MicroMsg.DyeingTemplateMsgHandler", "parse json fail", e);
                    }
                } else {
                    Log.m105920e("MicroMsg.DyeingTemplateMsgHandler", "jump info is empty");
                    str = null;
                }
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.DyeingTemplateMsgHandler", "handleGameForcePushJump2H5 jumpUrl illegal, fallback to jump to service notify");
                    aVar.mo87473a(i2);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    C119114c.m167923h(intent, "forcePushJumpToH5");
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo87473a(int i) {
        Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "handleForcePushJump2ServiceNotify");
        Intent intent = new Intent();
        intent.setClassName(MMApplicationContext.getApplicationId(), "com.tencent.mm.ui.LauncherUI");
        intent.putExtra("Main_User", "notifymessage");
        intent.putExtra("force_notify_type", "force_notify_wxa_subscribemsg");
        intent.putExtra("MainUI_User_Last_Msg_Type", i);
        intent.putExtra("MainUI_FromFinderNotification", false);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        C119114c.m167923h(intent, "forcePushJumpToServiceNotify");
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/msg/dyeingtemplate/DyeingTemplateMsgHandler", "handleForcePushJump2ServiceNotify", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/msg/dyeingtemplate/DyeingTemplateMsgHandler", "handleForcePushJump2ServiceNotify", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: b */
    public final C64152d mo87474b(String str, int i) {
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.is_accept_with_force_push"), 0) != 1) {
            return null;
        }
        String str2 = parseXml.get(".msg.appmsg.mmreader.category.item.weapp_username");
        if (str2 == null) {
            str2 = "";
        }
        C104289g gVar = new C104289g(parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.force_push_info"));
        String optString = gVar.optString("description");
        String optString2 = gVar.optString("forcePushId");
        String optString3 = gVar.optString("nickName");
        HashMap hashMap = new HashMap();
        hashMap.put("weAppUsername", str2);
        C7335d c = C86312j.m106911c(C64153e.class);
        C87412m.m108593f(c, "getService(IForceNotifyFeatureService::class.java)");
        C87412m.m108593f(optString2, "forcePushId");
        C87412m.m108593f(optString, "description");
        C87412m.m108593f(optString3, "nickName");
        return C64153e.C64154a.m75480a((C64153e) c, optString2, optString, optString3, hashMap, MMApplicationContext.getContext().getResources().getString(C0966R.string.f1p), (Drawable) null, 0, false, false, new C62422a(str2, optString2, i), 480, (Object) null);
    }

    /* renamed from: c */
    public final C64152d mo87475c(String str, int i) {
        Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "parseGameForceNotifyInfo");
        Map<String, String> parseXml = XmlParser.parseXml(str, "msgsource", (String) null);
        String str2 = parseXml.get(".msgsource.forcepushinfov2.forcepushinfoid");
        int i2 = Util.getInt(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.expiretime"), Integer.MAX_VALUE);
        int e = C31543z5.m39455e();
        int i3 = Util.getInt(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.jumptype"), 0);
        boolean z = Util.getInt(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.soundflag"), 1) > 0;
        boolean z2 = Util.getInt(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.vibrateflag"), 1) > 0;
        if (Util.isNullOrNil(str2) || e >= i2) {
            Log.m105920e("MicroMsg.DyeingTemplateMsgHandler", "parseGameForceNotifyInfo fail, infoId: " + str2 + ", expireTime: " + i2 + ", nowSecond: " + e);
            return null;
        }
        C64153e eVar = (C64153e) C86312j.m106911c(C64153e.class);
        C87412m.m108591d(str2);
        String nullAsNil = Util.nullAsNil(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.title"));
        String nullAsNil2 = Util.nullAsNil(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.introduce"));
        String nullAsNil3 = Util.nullAsNil(parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.topictitle"));
        C87412m.m108593f(eVar, "getService(IForceNotifyFeatureService::class.java)");
        C87412m.m108593f(nullAsNil, "nullAsNil(values[PATH_GA…PUSH_INFO_CONTENT_TITLE])");
        C87412m.m108593f(nullAsNil2, "nullAsNil(values[PATH_GA…PUSH_INFO_CONTENT_INTRO])");
        C64152d a = C64153e.C64154a.m75480a(eVar, str2, nullAsNil, nullAsNil2, (Map) null, nullAsNil3, (Drawable) null, 1, z, z2, new C62423b(i3, str2, parseXml, i), 40, (Object) null);
        Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "build force notify item finish, infoId: " + str2 + ", expireTime: " + i2 + ", jumpType: " + i3 + ", jumpInfo: " + parseXml.get(".msgsource.forcepushinfov2.forcepushinfocontent.jumpinfo"));
        return a;
    }

    /* renamed from: d */
    public final String mo87476d(String str) {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, true);
        Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler]  subscribeMsgVoiceBroadcastEnable=" + g);
        String str2 = "";
        if (!g) {
            return str2;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.is_audio_template"), 0) == 1) {
            String str3 = parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.audio_template_url");
            if (str3 != null) {
                str2 = str3;
            }
            Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "DyeingTemplateMsgReceiveEvent  audio_template_url=" + str2);
        }
        return str2;
    }
}
