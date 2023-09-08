package mu1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.pigeon.C26953g;
import com.tencent.pigeon.FlutterSettingsApi;
import d62.C75339i;
import di3.C86312j;
import eb0.C75590o4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import ky2.C10432i;
import p145dx.C7526s;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.PluginRegistry;
import p220pr.C12001j;
import p220pr.C77288i;
import tc0.C77885p;
import wj2.C66132f;

/* renamed from: mu1.a */
public final class C117558a implements FlutterSettingsApi.FlutterSettingApi, FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, C77288i.C77289a {

    /* renamed from: d */
    public Activity f351700d;

    /* renamed from: e */
    public FlutterSettingsApi.FlutterSettingCallback f351701e;

    /* renamed from: mu1.a$a */
    public static final class C117559a<T> implements FlutterSettingsApi.FlutterSettingCallback.Reply {

        /* renamed from: a */
        public static final C117559a<T> f351702a = new C117559a<>();

        public /* bridge */ /* synthetic */ void reply(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: a */
    public void mo107441a() {
        FlutterSettingsApi.FlutterSettingCallback flutterSettingCallback = this.f351701e;
        if (flutterSettingCallback != null) {
            flutterSettingCallback.updateAvatar(C117559a.f351702a);
        }
    }

    public String getDisplayUsername() {
        String c = C75592q0.m90773c();
        String s = C75592q0.m90789s();
        if (!Util.isNullOrNil(c)) {
            return c;
        }
        if (C72996z1.m85802I4(s)) {
            return null;
        }
        return s;
    }

    public String getDistrict() {
        C75590o4 a = C75590o4.m90740a();
        String nullAsNil = Util.nullAsNil(a.mo105937d());
        String nullAsNil2 = Util.nullAsNil(a.mo105936c());
        return ((C75339i) C86312j.m106911c(C75339i.class)).K90(nullAsNil) + ' ' + nullAsNil2;
    }

    public String getNickname() {
        Object e = C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
        if (e instanceof String) {
            return (String) e;
        }
        return null;
    }

    public String getPatTail() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, (Object) null);
        if (f instanceof String) {
            return (String) f;
        }
        return null;
    }

    public Boolean getSendMsgInKeybaord() {
        Object e = C86709a0.m107535s().mo121142i().mo119684e(66832, Boolean.FALSE);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Boolean");
        return Boolean.valueOf(((Boolean) e).booleanValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long getSex() {
        /*
            r3 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 12290(0x3002, float:1.7222E-41)
            r2 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0016
            r2 = r0
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0016:
            r0 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r2, (int) r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mu1.C117558a.getSex():java.lang.Long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getSignature() {
        /*
            r3 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 12291(0x3003, float:1.7223E-41)
            r2 = 0
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0016
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x003a
            android.app.Activity r0 = r3.f351700d
            if (r0 == 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "getContext()"
            gy3.C87412m.m108593f(r0, r1)
        L_0x0033:
            r1 = 2131836334(0x7f113dae, float:1.9305832E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mu1.C117558a.getSignature():java.lang.String");
    }

    public String getUsername() {
        return C75592q0.m90789s();
    }

    public Boolean getVoicePlayMode() {
        Object e = C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Boolean");
        return Boolean.valueOf(((Boolean) e).booleanValue());
    }

    public String getVoipRingtone() {
        C66132f Hi0 = ((C7526s) C86312j.m106911c(C7526s.class)).Hi0("");
        return Hi0 != null ? Util.nullAsNil(Hi0.f190086i) : "";
    }

    public String getWeCoin() {
        C12001j jVar = (C12001j) C86312j.m106911c(C12001j.class);
        Context context = this.f351700d;
        if (context == null) {
            context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
        }
        return jVar.pb0(context);
    }

    public Boolean isInvoiceEnable() {
        boolean z = false;
        if (WeChatBrands.Business.Entries.MeAvatarInvoiceTitle.banned() || !Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN, false)))) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    public Boolean isLandscapeMode() {
        return Boolean.valueOf(MMApplicationContext.getDefaultPreference().getBoolean("settings_landscape_mode", false));
    }

    public Boolean isMultipleUser() {
        return Boolean.valueOf(Process.myUid() / 100000 != 0);
    }

    public Boolean isMyAddressEnable() {
        Context context = this.f351700d;
        if (context == null) {
            context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
        }
        return Boolean.valueOf(!(Util.isOverseasUser(context) || WeChatBrands.Business.Entries.MeAvatarAddress.banned()));
    }

    public Boolean isPatEnable() {
        return Boolean.valueOf(((C12001j) C86312j.m106911c(C12001j.class)).isPatEnable());
    }

    public Boolean isWeCoinEnable() {
        return Boolean.valueOf(!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e());
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 2 && i != 4) {
            return false;
        }
        ((C12001j) C86312j.m106911c(C12001j.class)).zp0(this.f351700d, i, i2, intent);
        return true;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f351700d = activityPluginBinding.getActivity();
        activityPluginBinding.addActivityResultListener(this);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C26953g.m35907x(flutterPluginBinding.getBinaryMessenger(), this);
        this.f351701e = new FlutterSettingsApi.FlutterSettingCallback(flutterPluginBinding.getBinaryMessenger());
        ((C77288i) C86312j.m106911c(C77288i.class)).mo107432IL(this);
    }

    public void onDetachedFromActivity() {
        this.f351700d = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f351700d = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C26953g.m35907x(flutterPluginBinding.getBinaryMessenger(), (FlutterSettingsApi.FlutterSettingApi) null);
        this.f351701e = new FlutterSettingsApi.FlutterSettingCallback(flutterPluginBinding.getBinaryMessenger());
        ((C77288i) C86312j.m106911c(C77288i.class)).l20(this);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f351700d = activityPluginBinding.getActivity();
        activityPluginBinding.removeActivityResultListener(this);
    }

    public void resetChatRecord() {
        ((C12001j) C86312j.m106911c(C12001j.class)).mo11875Ee(this.f351700d);
    }

    public void saveUserInfo() {
        Log.m105924i("MicroMsg.FlutterSettingsPlugin", "saveUserInfo: ");
        C75590o4 a = C75590o4.m90740a();
        long longValue = getSex().longValue();
        if (longValue != -1) {
            a.f222065b = (int) longValue;
        }
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(1, C75590o4.m90742e(a)));
    }

    public void sendMsgInKeyboard(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Log.m105924i("MicroMsg.FlutterSettingsPlugin", "sendMsgInKeyboard: " + booleanValue);
        C86709a0.m107535s().mo121142i().mo119676J(66832, Boolean.valueOf(booleanValue));
    }

    public void setSex(Long l) {
        long longValue = l.longValue();
        C75590o4 a = C75590o4.m90740a();
        if (longValue != -1) {
            a.f222065b = (int) longValue;
        }
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(1, C75590o4.m90742e(a)));
        C5139t.m5183e(4, 4);
    }

    public void voicePlayMode(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Object e = C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Boolean");
        Log.m105925i("MicroMsg.FlutterSettingsPlugin", "set voice mode from %B to %B", Boolean.valueOf(((Boolean) e).booleanValue()), Boolean.valueOf(booleanValue));
        C86709a0.m107535s().mo121142i().mo119676J(26, Boolean.valueOf(booleanValue));
    }
}
