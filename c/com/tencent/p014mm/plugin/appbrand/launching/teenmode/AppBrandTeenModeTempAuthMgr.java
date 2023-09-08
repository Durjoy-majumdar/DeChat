package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import ky2.C10432i;
import p1081gi.C98121d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr */
public final class AppBrandTeenModeTempAuthMgr {

    /* renamed from: a */
    public static final AppBrandTeenModeTempAuthMgr f243916a = new AppBrandTeenModeTempAuthMgr();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lrx3/b0;", "writeToParcel", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "getTaskClass", "describeContents", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "initConfig", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "getInitConfig", "()Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "setInitConfig", "(Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;)V", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest */
    public static final class IPCGoAuthRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final CREATOR CREATOR = new CREATOR((C8480h) null);
        private AppBrandInitConfigWC initConfig;

        @Metadata(mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest$CREATOR */
        public static final class CREATOR implements Parcelable.Creator<IPCGoAuthRequest> {
            private CREATOR() {
            }

            public /* synthetic */ CREATOR(C8480h hVar) {
                this();
            }

            public IPCGoAuthRequest createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new IPCGoAuthRequest(parcel);
            }

            public IPCGoAuthRequest[] newArray(int i) {
                return new IPCGoAuthRequest[i];
            }
        }

        public IPCGoAuthRequest() {
        }

        public int describeContents() {
            return 0;
        }

        public final AppBrandInitConfigWC getInitConfig() {
            return this.initConfig;
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return IPCGoAuthTask.class;
        }

        public final void setInitConfig(AppBrandInitConfigWC appBrandInitConfigWC) {
            this.initConfig = appBrandInitConfigWC;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeParcelable(this.initConfig, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public IPCGoAuthRequest(Parcel parcel) {
            this();
            C87412m.m108594g(parcel, "parcel");
            this.initConfig = (AppBrandInitConfigWC) parcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader());
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lrx3/b0;", "writeToParcel", "readParcel", "describeContents", "", "bizKey", "Ljava/lang/String;", "getBizKey", "()Ljava/lang/String;", "setBizKey", "(Ljava/lang/String;)V", "", "canGoOn", "Z", "getCanGoOn", "()Z", "setCanGoOn", "(Z)V", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthResult */
    public static final class IPCGoAuthResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final CREATOR CREATOR = new CREATOR((C8480h) null);
        private String bizKey;
        private boolean canGoOn;

        @Metadata(mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthResult$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthResult;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthResult;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthResult$CREATOR */
        public static final class CREATOR implements Parcelable.Creator<IPCGoAuthResult> {
            private CREATOR() {
            }

            public /* synthetic */ CREATOR(C8480h hVar) {
                this();
            }

            public IPCGoAuthResult createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new IPCGoAuthResult(parcel);
            }

            public IPCGoAuthResult[] newArray(int i) {
                return new IPCGoAuthResult[i];
            }
        }

        public IPCGoAuthResult() {
        }

        public int describeContents() {
            return 0;
        }

        public final String getBizKey() {
            return this.bizKey;
        }

        public final boolean getCanGoOn() {
            return this.canGoOn;
        }

        public void readParcel(Parcel parcel) {
            this.bizKey = parcel != null ? parcel.readString() : null;
            boolean z = false;
            if ((parcel != null ? parcel.readInt() : 0) == 1) {
                z = true;
            }
            this.canGoOn = z;
        }

        public final void setBizKey(String str) {
            this.bizKey = str;
        }

        public final void setCanGoOn(boolean z) {
            this.canGoOn = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.bizKey);
            parcel.writeInt(this.canGoOn ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public IPCGoAuthResult(Parcel parcel) {
            this();
            C87412m.m108594g(parcel, "parcel");
            readParcel(parcel);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/teenmode/AppBrandTeenModeTempAuthMgr$IPCGoAuthTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Lrx3/b0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask */
    public static final class IPCGoAuthTask extends AppBrandProxyUIProcessTask {
        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            C87412m.m108592e(processRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr.IPCGoAuthRequest");
            AppBrandTeenModeTempAuthMgr appBrandTeenModeTempAuthMgr = AppBrandTeenModeTempAuthMgr.f243916a;
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            appBrandTeenModeTempAuthMgr.mo115754a(activityContext, ((IPCGoAuthRequest) processRequest).getInitConfig(), new AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1(this));
        }
    }

    /* renamed from: a */
    public final void mo115754a(Context context, AppBrandInitConfigWC appBrandInitConfigWC, C32228q<? super Integer, ? super String, ? super Boolean, C13598b0> qVar) {
        Context context2 = context;
        AppBrandInitConfigWC appBrandInitConfigWC2 = appBrandInitConfigWC;
        C32228q<? super Integer, ? super String, ? super Boolean, C13598b0> qVar2 = qVar;
        if (appBrandInitConfigWC2 == null) {
            qVar2.invoke(1, "", Boolean.FALSE);
            return;
        }
        String s = C75592q0.m90789s();
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195582i = 33;
        bVar.f195570f = appBrandInitConfigWC2.f239363e;
        bVar.f195646y = appBrandInitConfigWC2.f239364f;
        bVar.f195577g2 = appBrandInitConfigWC2.f239362d;
        bVar.f195573f2 = appBrandInitConfigWC2.f234839s;
        bVar.f195467A2 = appBrandInitConfigWC2.f234802F;
        bVar.f195653z2 = appBrandInitConfigWC2.f239365g;
        String s2 = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
        String str = "<fromusr>" + s + "</fromusr>" + "<type>" + 49 + "</type>" + "<content>" + Util.escapeStringForXml(s2) + "</content>";
        C87412m.m108593f(str, "StringBuilder().apply {\n…t>\")\n        }.toString()");
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        String str2 = appBrandInitConfigWC2.f239362d;
        C87412m.m108593f(str2, "config.appId");
        ((C10432i) C86312j.m106911c(C10432i.class)).Wq0((Activity) context2, 0, 1, "weapp_" + str2, context2.getString(C0966R.string.a98), context2.getString(C0966R.string.a97, new Object[]{appBrandInitConfigWC2.f239363e}), str, !appBrandInitConfigWC.mo111300k(), new C1928xce1ae931(qVar2));
    }

    /* renamed from: b */
    public final void mo115755b(Context context, AppBrandInitConfigWC appBrandInitConfigWC, C32227p<? super String, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(pVar, "afterCheckAuthCallback");
        Log.m105924i("MicroMsg.AppBrandTeenModeTempAuthMgr", "jumpToSendAuthorizationReqUI appId:" + appBrandInitConfigWC.f239362d + " isMMProcess:" + MMApplicationContext.isMainProcess() + ' ');
        if (!MMApplicationContext.isMainProcess() || context == null) {
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            IPCGoAuthRequest iPCGoAuthRequest = new IPCGoAuthRequest();
            iPCGoAuthRequest.setInitConfig(appBrandInitConfigWC);
            C81956c.m100675c(context, iPCGoAuthRequest, new AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3(pVar), (Intent) null);
            return;
        }
        mo115754a(context, appBrandInitConfigWC, new AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1(pVar));
    }
}
