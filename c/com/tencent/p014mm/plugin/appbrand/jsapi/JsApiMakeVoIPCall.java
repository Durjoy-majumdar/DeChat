package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StartVoipCSResultEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C9556a;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiMakeVoIPCall */
public class JsApiMakeVoIPCall extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 154;
    public static final String NAME = "makeVoIPCall";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        String optString = jSONObject.optString("context");
        String optString2 = jSONObject.optString("avatarUrl");
        boolean optBoolean = jSONObject.optBoolean("showOther");
        boolean optBoolean2 = jSONObject.optBoolean("allowBackCamera");
        String optString3 = jSONObject.optString("toUserName");
        String nullAsNil = Util.nullAsNil(jSONObject.optString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
        String nullAsNil2 = Util.nullAsNil(jSONObject.optString("type"));
        if (Util.isNullOrNil(optString3)) {
            optString3 = eVar.getRuntime().mo113210l1().f234839s;
        }
        if (Util.isNullOrNil(eVar.getAppId()) || Util.isNullOrNil(optString3)) {
            Log.m105920e("MicroMsg.JsApiMakeVoIPCall", "appId or toUserName invalid!");
            eVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        Log.m105919d("MicroMsg.JsApiMakeVoIPCall", "allowBackCamera: %s, showOther: %s, avatarUrl: %s, context: %s, toUserName: %s", Boolean.valueOf(optBoolean2), Boolean.valueOf(optBoolean), optString2, optString, optString3);
        new StartVoIPCall(this, eVar, i).mo114395c();
        Intent intent = new Intent();
        intent.putExtra("voipCSBizId", optString3);
        intent.putExtra("voipCSAppId", eVar.getAppId());
        String str = "1";
        intent.putExtra("voipCSAllowBackCamera", optBoolean2 ? str : "0");
        if (!optBoolean) {
            str = "0";
        }
        intent.putExtra("voipCSShowOther", str);
        intent.putExtra("voipCSAvatarUrl", optString2);
        intent.putExtra("voipCSContext", optString);
        intent.putExtra("voipCSScene", nullAsNil);
        intent.putExtra("voipCSType", nullAsNil2);
        intent.putExtra("launch_from_appbrand", true);
        Context context = eVar.getContext();
        intent.setClassName(context, MMApplicationContext.getSourcePackageName() + ".plugin.voip_cs.ui.VoipCSMainUI");
        Context context2 = eVar.getContext();
        int i2 = AppBrandProcessProxyUI.f240314o;
        if (!(context2 instanceof AppBrandUI) || (context2 instanceof AppBrandPluginUI)) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "proxyLaunchByAppBrandUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "proxyLaunchByAppBrandUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Intent addFlags = new Intent(context2, AppBrandProcessProxyUI.class).putExtra("key_running_mode", 10000).putExtra("key_proxy_launch_target_intent", intent).putExtra("key_proxy_launch_appbrand_ui_class", context2.getClass()).addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(addFlags);
        Context context4 = context2;
        C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "proxyLaunchByAppBrandUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context4, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "proxyLaunchByAppBrandUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiMakeVoIPCall$StartVoIPCall */
    public static class StartVoIPCall extends MainProcessTask {
        public static final Parcelable.Creator<StartVoIPCall> CREATOR = new C1570a();

        /* renamed from: f */
        public C82870p f11021f;

        /* renamed from: g */
        public C82381f f11022g;

        /* renamed from: h */
        public int f11023h;

        /* renamed from: i */
        public int f11024i;

        /* renamed from: j */
        public IListener f11025j = new IListener<StartVoipCSResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = -689945029;
            }

            public boolean callback(IEvent iEvent) {
                StartVoipCSResultEvent startVoipCSResultEvent = (StartVoipCSResultEvent) iEvent;
                if (startVoipCSResultEvent == null) {
                    return false;
                }
                StartVoIPCall startVoIPCall = StartVoIPCall.this;
                startVoIPCall.f11024i = startVoipCSResultEvent.f9556d.f9557a;
                startVoIPCall.f11025j.dead();
                StartVoIPCall.this.mo114394b();
                return false;
            }
        };

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiMakeVoIPCall$StartVoIPCall$a */
        public class C1570a implements Parcelable.Creator<StartVoIPCall> {
            public Object createFromParcel(Parcel parcel) {
                return new StartVoIPCall(parcel);
            }

            public Object[] newArray(int i) {
                return new StartVoIPCall[i];
            }
        }

        public StartVoIPCall(C82870p pVar, C82381f fVar, int i) {
            this.f11021f = pVar;
            this.f11022g = fVar;
            this.f11023h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11024i = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            Log.m105925i("MicroMsg.JsApiMakeVoIPCall", "makeVoIPCall = %d", Integer.valueOf(this.f11024i));
            int i = this.f11024i;
            if (i == 1) {
                this.f11022g.mo109647a(this.f11023h, this.f11021f.mo115109j("cancel"));
            } else if (i == 2) {
                this.f11022g.mo109647a(this.f11023h, this.f11021f.mo115109j("ok"));
            } else if (i == 3) {
                this.f11022g.mo109647a(this.f11023h, this.f11021f.mo115109j("fail:network error"));
            } else if (i == 4) {
                this.f11022g.mo109647a(this.f11023h, this.f11021f.mo115109j("fail:param not match"));
            } else {
                this.f11022g.mo109647a(this.f11023h, this.f11021f.mo115109j("fail:unknow"));
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            this.f11025j.alive();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11024i);
        }

        public StartVoIPCall(Parcel parcel) {
            this.f11024i = parcel.readInt();
        }
    }
}
