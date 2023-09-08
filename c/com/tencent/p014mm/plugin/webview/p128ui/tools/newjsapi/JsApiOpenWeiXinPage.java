package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c00.C39885s;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChangeTabbarToEvent;
import com.tencent.p014mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent;
import com.tencent.p014mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C45607c2;
import eb0.C45608d2;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import kr0.C76633z0;
import ky2.C10432i;
import lc3.C10485b;
import na3.C76846i;
import na3.C88908g;
import nc0.C76850a;
import o03.C21723h;
import p167hz.C8835h;
import p167hz.C8837n;
import p170ic.C87687a;
import p255vr.C65873e;
import p272xq.C102712e;
import p773yy.C79168k;
import q20.C89449a;
import qo3.C47883u;
import qo3.C77426q;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import u73.C22613h1;
import w83.C15053a;
import z04.C112551y;
import zb3.C66782d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage */
public final class JsApiOpenWeiXinPage extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenWeiXinPage f249480d = new JsApiOpenWeiXinPage();

    /* renamed from: e */
    public static final int f249481e = 396;

    /* renamed from: f */
    public static final String f249482f = "openWeiXinPage";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage$c */
    public static final class C6395c<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23355d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23356e;

        public C6395c(C13855j jVar, C13851h1 h1Var) {
            this.f23355d = jVar;
            this.f23356e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            if (((IPCBoolean) obj).f10312d) {
                C13849g gVar = this.f23355d.f39001d;
                String str = this.f23356e.f38990c;
                gVar.mo10774a(str, this.f23356e.f38996i + ":ok", (Map<String, Object>) null);
                return;
            }
            C13849g gVar2 = this.f23355d.f39001d;
            String str2 = this.f23356e.f38990c;
            gVar2.mo10774a(str2, this.f23356e.f38996i + ":fail", (Map<String, Object>) null);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage$OpenWeiXinPageData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage$a */
    public static final class C30606a implements C80883e<OpenWeiXinPageData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            OpenWeiXinPageData openWeiXinPageData = (OpenWeiXinPageData) obj;
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(JsApiOpenWeiXinPage.f249480d.mo119013V(openWeiXinPageData != null ? openWeiXinPageData.f82421d : null, false)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage$b */
    public static final class C44099b implements Runnable {

        /* renamed from: d */
        public static final C44099b f119463d = new C44099b();

        public final void run() {
            ChangeTabbarToEvent changeTabbarToEvent = new ChangeTabbarToEvent();
            changeTabbarToEvent.f107395d.f107396a = 1;
            changeTabbarToEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage$d */
    public static final class C44100d implements C47883u {

        /* renamed from: a */
        public static final C44100d f119464a = new C44100d();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "showErrorDialog, has shown tip");
        }
    }

    /* renamed from: A */
    public final void mo118992A(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageMessageNotificationUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageMessageNotificationUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: B */
    public final void mo118993B(Context context) {
        Class cls = C10485b.class;
        if (Util.isNullOrNil(C75592q0.m90773c()) && C72996z1.m85814Q4(C75592q0.m90789s()) && ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI");
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageModifyAliaseUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageModifyAliaseUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) != 0) {
            Intent intent2 = new Intent();
            intent2.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI");
            intent2.putExtra("WizardRootClass", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI");
            intent2.addFlags(268435456);
            MMWizardActivity.m7017L7(context, intent2);
        }
    }

    /* renamed from: C */
    public final void mo118994C(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageMyqrcodeUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageMyqrcodeUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: D */
    public final void mo118995D(Context context) {
        C88144b.m109791i(context, "subapp", ".ui.friend.FMessageConversationUI", new Intent(), (Bundle) null);
    }

    /* renamed from: E */
    public final void mo118996E(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPagePhoneNumberBindsSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPagePhoneNumberBindsSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: F */
    public final void mo118997F(Context context) {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        arrayList.add("labs_browse");
        intent.putStringArrayListExtra("key_exclude_apps", arrayList);
        intent.addFlags(268435456);
        ((C76846i) C86312j.m106911c(C76846i.class)).Hv0(context, intent);
    }

    /* renamed from: G */
    public final void mo118998G(Context context) {
        Intent intent = new Intent();
        intent.putExtra("k_sns_tag_id", 4);
        intent.putExtra("k_sns_from_settings_about_sns", 1);
        intent.addFlags(268435456);
        intent.setClassName(context, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPagePrivacyManageTimeLineBlockListUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPagePrivacyManageTimeLineBlockListUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: H */
    public final void mo118999H(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        C88144b.m109791i(context, "setting", ".ui.setting.SettingsSnsPrivacyUI", intent, (Bundle) null);
    }

    /* renamed from: I */
    public final void mo119000I(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        C88144b.m109791i(context, "setting", ".ui.setting.SettingsPrivacyUI", intent, (Bundle) null);
    }

    /* renamed from: J */
    public final void mo119001J(Context context) {
        Intent intent = new Intent();
        intent.putExtra("Contact_User", "qqmail");
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    /* renamed from: K */
    public final void mo119002K(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg");
        intent.putExtra("need_show_menu_choose", true);
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSetheadportraitUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSetheadportraitUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: L */
    public final void mo119003L(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSettingsActiveTimeUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSettingsActiveTimeUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: M */
    public final void mo119004M(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageShakeSettingsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageShakeSettingsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: N */
    public final void mo119005N(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.shake.ui.ShakeReportUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageShakeUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageShakeUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: O */
    public final void mo119006O(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageStorageManageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageStorageManageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: P */
    public final void mo119007P(Context context) {
        boolean z = (C75592q0.m90785o() & 32768) == 0;
        if (z) {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("sns_timeline_NeedShowPushlistDialog", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix, enable = " + z);
    }

    /* renamed from: Q */
    public final void mo119008Q(Context context) {
        boolean z = (C75592q0.m90785o() & 32768) == 0;
        if (z) {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("sns_timeline_NeedShowPulistText", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelinePublishTextUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelinePublishTextUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix, enable = " + z);
    }

    /* renamed from: R */
    public final void mo119009R(Context context) {
        boolean z = (C75592q0.m90785o() & 32768) == 0;
        if (z) {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("sns_timeline_NeedShowChangeAlbumDialog", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelineSetbackgroundCoverUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelineSetbackgroundCoverUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix, enable = " + z);
    }

    /* renamed from: S */
    public final void mo119010S(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
        intent.addFlags(268435456);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageToolRecoverSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageToolRecoverSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: T */
    public final void mo119011T(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageVersionUpdateSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageVersionUpdateSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: U */
    public final void mo119012U(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToSetPatSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToSetPatSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: V */
    public final boolean mo119013V(String str, boolean z) {
        boolean z2;
        Class cls = C60200t1.class;
        Class cls2 = C10432i.class;
        try {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            String str2 = "";
            if (z) {
                if (str != null) {
                    str2 = str;
                }
                Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "handlePageUrl pagePath:" + str2);
            } else {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                str2 = parse.getHost() + parse.getPath();
                Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "handlePageUrl scheme:" + scheme + " pagePath:" + str2);
            }
            if (C112551y.m153809i(str2, "page/wesport", true)) {
                mo119015X(context, "gh_43f2581f6fd6");
            } else if (C112551y.m153809i(str2, "page/wechatteam", true)) {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", "weixin");
                intent.putExtra("finish_direct", true);
                intent.putExtra("specific_chat_from_scene", 3);
                intent.putExtra("preChatTYPE", 9);
                intent.putExtra("chat_from_scene", 5);
                C88144b.m109800r(context, ".ui.chatting.ChattingUI", intent);
            } else if (C112551y.m153809i(str2, "page/masssend", true)) {
                if (C75592q0.m90756D()) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("finish_direct", true);
                    C88144b.m109790h(context, "masssend", ".ui.MassSendHistoryUI", intent2);
                } else {
                    C88144b.m109790h(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", "masssendapp"));
                }
            } else if (C112551y.m153809i(str2, "page/groups", true)) {
                Intent intent3 = new Intent();
                intent3.setClassName(context, "com.tencent.mm.ui.contact.ChatroomContactUI");
                intent3.addFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent3);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/textsize", true)) {
                Intent intent4 = new Intent();
                intent4.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
                intent4.addFlags(268435456);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent4);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/securitycenter", true)) {
                mo119018g(context);
            } else if (C112551y.m153809i(str2, "page/contactblacklist", true)) {
                mo119016e(context);
            } else if (C112551y.m153809i(str2, "page/darkmode", true)) {
                mo119017f(context);
            } else if (C112551y.m153809i(str2, "page/aboutversion", true)) {
                mo119019h(context);
            } else if (C112551y.m153809i(str2, "page/globalsearch", true)) {
                ((C65873e) C86312j.m106911c(C65873e.class)).mo89919mw(context, ".ui.FTSMainUI", new Intent(), (Bundle) null);
            } else if (C112551y.m153809i(str2, "page/chatlogmigrate", true)) {
                Intent intent5 = new Intent();
                intent5.setClassName(context, "com.tencent.mm.plugin.backup.backupmoveui.BackupUI");
                MMWizardActivity.m7017L7(context, intent5);
            } else if (C112551y.m153809i(str2, "page/chatlog", true)) {
                Intent className = new Intent().setClassName(context, "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI");
                C87412m.m108593f(className, "Intent().setClassName(co…ackupChooseBackupModeUI\")");
                className.addFlags(268435456);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(className);
                C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/chatbackground", true)) {
                Intent intent6 = new Intent();
                intent6.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI");
                intent6.addFlags(268435456);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent6);
                C117292a.m165358d(context, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/setpat", true)) {
                mo119012U(context);
            } else if (C112551y.m153809i(str2, "page/channel/publish", true)) {
                mo119026o(context);
            } else if (C112551y.m153809i(str2, "page/tool/recover", true)) {
                mo119010S(context);
            } else if (C112551y.m153809i(str2, "page/fileHelper", true)) {
                mo119033v(context);
            } else if (C112551y.m153809i(str2, "page/contact/faceToFaceCreateRoom", true)) {
                mo119031t(context);
            } else if (C112551y.m153809i(str2, "page/deeplink/groupchat", true)) {
                mo119028q(context);
            } else if (C112551y.m153809i(str2, "page/tool/discoverPageManage", true)) {
                mo119034w(context);
            } else if (C112551y.m153809i(str2, "page/contacts", true)) {
                mo119020i(context);
            } else if (C112551y.m153809i(str2, "page/tool/bindPhoneNumber", true)) {
                mo118996E(context);
            } else if (C112551y.m153809i(str2, "page/deeplink/setname", true)) {
                mo119029r(context);
            } else if (C112551y.m153809i(str2, "page/versionUpdate", true)) {
                mo119011T(context);
            } else if (C112551y.m153809i(str2, "page/timeline/publish", true)) {
                mo119007P(context);
            } else if (C112551y.m153809i(str2, "page/contact/tagList", true)) {
                mo119027p(context);
            } else if (C112551y.m153809i(str2, "page/contact/addFriend", true)) {
                mo119022k(context);
            } else if (C112551y.m153809i(str2, "page/channel/auth", true)) {
                mo119025n(context);
            } else if (C112551y.m153809i(str2, "page/favorites", true)) {
                mo119032u(context);
            } else if (C112551y.m153809i(str2, "page/modifyAliase", true)) {
                mo118993B(context);
            } else if (C112551y.m153809i(str2, "page/setHeadPortrait", true)) {
                mo119002K(context);
            } else if (C112551y.m153809i(str2, "page/storageManage", true)) {
                mo119006O(context);
            } else if (C112551y.m153809i(str2, "page/newFriends", true)) {
                mo118995D(context);
            } else if (C112551y.m153809i(str2, "page/settingsActiveTimeUI", true)) {
                mo119003L(context);
            } else if (C112551y.m153809i(str2, "page/privacyManage", true)) {
                mo119000I(context);
            } else if (C112551y.m153809i(str2, "page/privacyManage/timeline", true)) {
                mo118999H(context);
            } else if (C112551y.m153809i(str2, "page/privacyManage/timeline/blackList", true)) {
                mo118998G(context);
            } else if (C112551y.m153809i(str2, "page/deeplink/settings", true)) {
                mo119030s(context);
            } else if (C112551y.m153809i(str2, "page/messageNotification", true)) {
                mo118992A(context);
            } else if (C112551y.m153809i(str2, "page/bindPhoneInfo", true)) {
                mo119024m(context);
            } else if (C112551y.m153809i(str2, "page/timeline/publishText", true)) {
                mo119008Q(context);
            } else if (C112551y.m153809i(str2, "page/loginDeviceManage", true)) {
                mo119036y(context);
            } else if (C112551y.m153809i(str2, "page/bindQQ", true)) {
                mo119023l(context);
            } else if (C112551y.m153809i(str2, "page/shake", true)) {
                if (((long) (C75592q0.m90785o() & 256)) == 0) {
                    mo119005N(context);
                } else {
                    mo119034w(context);
                }
            } else if (C112551y.m153809i(str2, "page/shake/setting", true)) {
                mo119004M(context);
            } else if (C112551y.m153809i(str2, "page/miniProgram", true)) {
                ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new ShouldShowAppBrandEntranceInFindMoreEvent();
                shouldShowAppBrandEntranceInFindMoreEvent.f236288d.f236290a = true;
                shouldShowAppBrandEntranceInFindMoreEvent.publish();
                boolean z3 = shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236291a;
                boolean z4 = ((C10432i) C86312j.m106911c(cls2)).mo10750e() && ((C10432i) C86312j.m106911c(cls2)).mo10740Mn() == 2;
                Log.m105925i("MicroMsg.JsApiOpenWeiXinPage", "shouldShowMiniProgram %s, isTeenModeAndNotAccessRight:%s", Boolean.valueOf(z3), Boolean.valueOf(z4));
                if (z3 && !z4) {
                    if ((C75592q0.m90781k() & 16777216) == 0) {
                        mo119037z(context);
                    } else {
                        mo119034w(context);
                    }
                }
            } else if (C112551y.m153809i(str2, "page/qqMailReminder", true)) {
                mo119001J(context);
            } else if (C112551y.m153809i(str2, "page/plugin", true)) {
                mo118997F(context);
            } else if (C112551y.m153809i(str2, "page/MyQRCode", true)) {
                mo118994C(context);
            } else if (C112551y.m153809i(str2, "page/TopStories", true)) {
                boolean z5 = (C75592q0.m90781k() & 67108864) == 0;
                Object d = C86709a0.m107535s().mo121142i().mo119683d(274436);
                C87412m.m108592e(d, "null cannot be cast to non-null type kotlin.String");
                if (C76850a.m92639k((String) d)) {
                    Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "european user");
                    z5 = false;
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean e = ((C10432i) C86312j.m106911c(cls2)).mo10750e();
                Log.m105925i("MicroMsg.JsApiOpenWeiXinPage", "isInExperiment %s ,openLook %s, isTeenMode:%s", Boolean.valueOf(z2), Boolean.valueOf(z5), Boolean.valueOf(e));
                if (!z2 || !z5 || e) {
                    mo119034w(context);
                } else {
                    mo119021j(context);
                }
            } else if (C112551y.m153809i(str2, "page/language", true)) {
                mo119035x(context);
            } else if (C112551y.m153809i(str2, "page/timeline/setBackgroundCover", true)) {
                mo119009R(context);
            } else if (C112551y.m153809i(str2, "page/channel", true)) {
                if (context instanceof Activity) {
                    Bundle bundle = new Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83766M5());
                    bundle.putString("realname_verify_process_jump_plugin", "finder");
                    ((C66782d) C86312j.m106911c(C66782d.class)).mo72982Co((Activity) context, bundle);
                } else {
                    Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "context is no activity.");
                    Intent intent7 = new Intent();
                    intent7.setClassName(context, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83783b6());
                    intent7.addFlags(268435456);
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(intent7);
                    C117292a.m165358d(context, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar5.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (C112551y.m153809i(str2, "page/RegByMobileSetPwdUI", true)) {
                Intent intent8 = new Intent();
                intent8.setClassName(context, "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI");
                intent8.addFlags(268435456);
                intent8.putExtra("kintent_hint", context.getResources().getString(C0966R.string.iul));
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(intent8);
                C117292a.m165358d(context, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar6.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/ContactMgrOnlyChatUI", true)) {
                Intent intent9 = new Intent();
                intent9.setClassName(context, "com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI");
                intent9.addFlags(268435456);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(intent9);
                C117292a.m165358d(context, aVar7.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar7.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/CardHomePageV3UI", true)) {
                Intent intent10 = new Intent();
                intent10.setClassName(context, "com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI");
                intent10.addFlags(268435456);
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(intent10);
                C117292a.m165358d(context, aVar8.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar8.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/SettingsPersonalMoreUI", true)) {
                Intent intent11 = new Intent();
                intent11.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI");
                intent11.addFlags(268435456);
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(intent11);
                C117292a.m165358d(context, aVar9.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar9.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/systemCapabilityAuthorization", true)) {
                Intent intent12 = new Intent();
                intent12.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI");
                intent12.addFlags(268435456);
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(intent12);
                C117292a.m165358d(context, aVar10.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar10.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/jumpSystemSetting", true)) {
                Intent intent13 = new Intent();
                intent13.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent13.setData(Uri.parse("package:" + context.getPackageName()));
                intent13.addFlags(268435456);
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(intent13);
                C117292a.m165358d(context, aVar11.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar11.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/BrandServiceIndexUI", true)) {
                Intent intent14 = new Intent();
                intent14.setClassName(context, "com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI");
                intent14.addFlags(268435456);
                C9556a aVar12 = new C9556a();
                aVar12.mo10233c(intent14);
                C117292a.m165358d(context, aVar12.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar12.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/TextStatusDoWhatActivity", true)) {
                Intent intent15 = new Intent();
                intent15.setClassName(context, "com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity");
                intent15.addFlags(268435456);
                C9556a aVar13 = new C9556a();
                aVar13.mo10233c(intent15);
                C117292a.m165358d(context, aVar13.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar13.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/RingtoneSettingsUI", true)) {
                Intent intent16 = new Intent();
                intent16.setClassName(context, "com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI");
                intent16.putExtra("ringtone_channel", 5);
                intent16.addFlags(268435456);
                C9556a aVar14 = new C9556a();
                aVar14.mo10233c(intent16);
                C117292a.m165358d(context, aVar14.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar14.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C112551y.m153809i(str2, "page/SettingsMessageNotificationUI", true)) {
                Intent intent17 = new Intent();
                intent17.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsMessageNotificationUI");
                intent17.addFlags(268435456);
                C9556a aVar15 = new C9556a();
                aVar15.mo10233c(intent17);
                C117292a.m165358d(context, aVar15.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar15.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (!C112551y.m153809i(str2, "page/SettingsCareModeIntro", true)) {
                Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "handlePageUrl not exist path");
                return false;
            } else if (!WeChatBrands.AppInfo.current().isMainland()) {
                Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_SETTINGSCAREMODEINTRO, disable.");
                mo119014W(context);
            } else {
                Intent intent18 = new Intent();
                intent18.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro");
                intent18.addFlags(268435456);
                C9556a aVar16 = new C9556a();
                aVar16.mo10233c(intent18);
                C117292a.m165358d(context, aVar16.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar16.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.JsApiOpenWeiXinPage", th, "handlePageErr!!", new Object[0]);
            return false;
        }
    }

    /* renamed from: W */
    public final void mo119014W(Context context) {
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(context.getString(C0966R.string.hfj));
        qVar.mo107601m(C0966R.string.f8028zq);
        qVar.mo107600l(C44100d.f119464a);
        qVar.mo107603o();
    }

    /* renamed from: X */
    public final boolean mo119015X(Context context, String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        boolean z = false;
        if (z1Var != null && z1Var.mo62927s3()) {
            z = true;
        }
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("chat_from_scene", 5);
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", str);
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("pageUrl");
        Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "OpenWeiXinPage:" + str);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new OpenWeiXinPageData(str), C30606a.class, new C6395c(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f249481e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f249482f;
    }

    /* renamed from: e */
    public final void mo119016e(Context context) {
        C45607c2 a = C45608d2.m50666a(context.getString(C0966R.string.f360860ff1));
        Intent intent = new Intent();
        intent.putExtra("filter_type", a.mo71122a());
        intent.putExtra("titile", context.getString(C0966R.string.ixd));
        intent.putExtra("list_attr", 32768);
        intent.addFlags(268435456);
        intent.setClassName(context, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goBlackList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goBlackList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: f */
    public final void mo119017f(Context context) {
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_red_dot", false);
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goDarkMode", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goDarkMode", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: g */
    public final void mo119018g(Context context) {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("WeChatSafeCenterUrl");
        Log.m105925i("MicroMsg.JsApiOpenWeiXinPage", "safe center url %s", c);
        if (Util.isNullOrNil(c)) {
            c = context.getString(C0966R.string.lit) + LocaleUtil.getApplicationLanguage();
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", c);
        intent.putExtra("showShare", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: h */
    public final void mo119019h(Context context) {
        int g = C86709a0.m107523b().mo121110g();
        Object e = C86709a0.m107535s().mo121142i().mo119684e(12304, (Object) null);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Int");
        String string = context.getString(C0966R.string.f361332j01, new Object[]{Integer.valueOf(g), Integer.valueOf(Util.nullAsNil((Integer) e))});
        C87412m.m108593f(string, "context.getString(com.te…otice_url, uin, newCount)");
        if (!C112551y.m153811k(string)) {
            C86709a0.m107535s().mo121142i().mo119676J(12304, 0);
            Intent intent = new Intent();
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(C0966R.string.f361331j00));
            intent.putExtra("rawUrl", string);
            intent.putExtra("showShare", false);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: i */
    public final void mo119020i(Context context) {
        MMHandlerThread.postToMainThreadDelayed(C44099b.f119463d, 300);
        if (context instanceof MMActivity) {
            ((MMActivity) context).hideVKB();
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.setClassName(context, "com.tencent.mm.ui.LauncherUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToContactTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToContactTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: j */
    public final void mo119021j(Context context) {
        if (!C43471q.m46984h(1)) {
            Log.m105920e("MicroMsg.JsApiOpenWeiXinPage", "fts h5 template not avail");
            return;
        }
        String optString = ((C39885s) C86312j.m106911c(C39885s.class)).mo62263p4("discoverRecommendEntry").optString("wording");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiOpenWeiXinPage", "empty query");
            return;
        }
        Log.m105924i("MicroMsg.JsApiOpenWeiXinPage", "look one look clikced");
        ((C8837n) C86312j.m106911c(C8837n.class)).mo9685aT(context, 20);
        ((C88908g) C86312j.m106911c(C88908g.class)).open("labs_browse");
        OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = new OnSearchSearchBoxCtrlInfoChangedEvent();
        onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264958a = 0;
        onSearchSearchBoxCtrlInfoChangedEvent.publish();
        C22613h1.m26476b(20, optString);
        C22613h1.m26481g(20, 0);
        ((C21723h) ((C8835h) C86312j.m106911c(C8835h.class)).mo9681t4()).mo33986F();
    }

    /* renamed from: k */
    public final void mo119022k(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageAddMoreFriendsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageAddMoreFriendsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: l */
    public final void mo119023l(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindQQUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindQQUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindQQUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: m */
    public final void mo119024m(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindphoneInfoUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindphoneInfoUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: n */
    public final void mo119025n(Context context) {
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = "gh_4ee148a6ecaa@app";
        aVar.f9533h = "wxdfda2588e999a42d";
        aVar.f9527b = "pages/index/index.html";
        aVar.f9529d = 1201;
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: o */
    public final void mo119026o(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.finder.ui.FinderSelfUI");
        intent.addFlags(268435456);
        intent.putExtra("key_need_done_post_action", true);
        intent.putExtra("key_from_search_post", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageChannelPublishSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageChannelPublishSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: p */
    public final void mo119027p(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageContactTaglistSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageContactTaglistSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: q */
    public final void mo119028q(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.ui.contact.SelectContactUI");
        C87687a.m109085a(intent);
        intent.putExtra("titile", context.getString(C0966R.string.f7495ht));
        intent.putExtra("list_type", 0);
        intent.addFlags(268435456);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219163d, 256, 512));
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 7);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("create_group_recommend", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageCreateroomSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageCreateroomSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: r */
    public final void mo119029r(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageDeeplinkSetnameSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageDeeplinkSetnameSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: s */
    public final void mo119030s(Context context) {
        C88144b.m109791i(context, "setting", ".ui.setting.SettingsUI", new Intent(), (Bundle) null);
    }

    /* renamed from: t */
    public final void mo119031t(Context context) {
        C115669n.INSTANCE.mo160131h(11140, 0);
        C88144b.m109789g(context, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
    }

    /* renamed from: u */
    public final void mo119032u(Context context) {
        ((C102712e) C86312j.m106911c(C102712e.class)).F20(context, ".ui.FavoriteIndexUI", new Intent());
    }

    /* renamed from: v */
    public final void mo119033v(Context context) {
        Intent intent = new Intent();
        intent.putExtra("Contact_User", "filehelper");
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 23);
        intent.addFlags(268435456);
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD("filehelper", 10);
    }

    /* renamed from: w */
    public final void mo119034w(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI");
        intent.addFlags(268435456);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageFinderManagerSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageFinderManagerSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: x */
    public final void mo119035x(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI");
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageLanguageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageLanguageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: y */
    public final void mo119036y(Context context) {
        C88144b.m109789g(context, "account", ".security.ui.MySafeDeviceListUI");
    }

    /* renamed from: z */
    public final void mo119037z(Context context) {
        ((C76633z0) C86312j.m106911c(C76633z0.class)).mo94230XU(context, 16, false);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage$OpenWeiXinPageData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage$OpenWeiXinPageData */
    public static final class OpenWeiXinPageData implements Parcelable {
        public static final C30605a CREATOR = new C30605a((C8480h) null);

        /* renamed from: d */
        public String f82421d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeiXinPage$OpenWeiXinPageData$a */
        public static final class C30605a implements Parcelable.Creator<OpenWeiXinPageData> {
            public C30605a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenWeiXinPageData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenWeiXinPageData[i];
            }
        }

        public OpenWeiXinPageData(String str) {
            this.f82421d = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeString(this.f82421d);
        }

        public OpenWeiXinPageData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            String readString = parcel.readString();
            this.f82421d = readString == null ? "" : readString;
        }
    }
}
