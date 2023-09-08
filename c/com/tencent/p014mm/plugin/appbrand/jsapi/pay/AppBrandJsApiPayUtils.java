package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C88267e;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$e;
import p225rc.g$$f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils */
public final class AppBrandJsApiPayUtils {

    /* renamed from: a */
    public static final AppBrandJsApiPayUtils f242319a = new AppBrandJsApiPayUtils();

    /* renamed from: b */
    public static final SparseArray<C32226l<MMActivity, C13598b0>> f242320b = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$a */
    public static final class C1789a implements g$$f {

        /* renamed from: a */
        public final /* synthetic */ int f11584a;

        /* renamed from: b */
        public final /* synthetic */ g$$e f11585b;

        public C1789a(int i, g$$e g__e) {
            this.f11584a = i;
            this.f11585b = g__e;
        }

        /* renamed from: b */
        public final boolean mo1596b(int i, int i2, Intent intent) {
            if (this.f11584a != i) {
                return false;
            }
            this.f11585b.mo1626a(i2, intent);
            return true;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/AppBrandJsApiPayUtils$ProxyMMActivityResultResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultResult */
    public static final class ProxyMMActivityResultResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final C82874a CREATOR = new C82874a((C8480h) null);

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultResult$a */
        public static final class C82874a implements Parcelable.Creator<ProxyMMActivityResultResult> {
            public C82874a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new ProxyMMActivityResultResult();
            }

            public Object[] newArray(int i) {
                return new ProxyMMActivityResultResult[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/AppBrandJsApiPayUtils$ProxyMMActivityResultTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onHostActivityDestroyed", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultTask */
    public static final class ProxyMMActivityResultTask extends AppBrandProxyUIProcessTask implements C0124r {

        /* renamed from: d */
        public boolean f242322d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultTask$a */
        public static final class C82875a implements g$$f {

            /* renamed from: a */
            public final /* synthetic */ ProxyMMActivityResultTask f242323a;

            public C82875a(ProxyMMActivityResultTask proxyMMActivityResultTask) {
                this.f242323a = proxyMMActivityResultTask;
            }

            /* renamed from: b */
            public final boolean mo1596b(int i, int i2, Intent intent) {
                this.f242323a.getActivityContext().setResult(i2, intent);
                this.f242323a.finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
                this.f242323a.f242322d = true;
                return true;
            }
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            C87412m.m108592e(processRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils.ProxyMMActivityResultRequest");
            int i = ((ProxyMMActivityResultRequest) processRequest).f242321d;
            SparseArray<C32226l<MMActivity, C13598b0>> sparseArray = AppBrandJsApiPayUtils.f242320b;
            C32226l<MMActivity, C13598b0> lVar = sparseArray.get(i);
            if (lVar != null) {
                sparseArray.remove(i);
            } else {
                lVar = null;
            }
            C32226l lVar2 = lVar;
            if (lVar2 == null) {
                finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
                return;
            }
            C89916g.m112446a(getActivityContext()).f258381c.add(new C82875a(this));
            MMActivity activityContext = getActivityContext();
            C87412m.m108593f(activityContext, "activityContext");
            lVar2.invoke(activityContext);
        }

        @C112974b0(C39623j.C39625b.ON_DESTROY)
        public final void onHostActivityDestroyed() {
            if (!this.f242322d) {
                getActivityContext().setResult(0);
                getActivityContext().finish();
            }
        }
    }

    /* renamed from: b */
    public static final boolean m101643b(Activity activity, C32226l<? super MMActivity, C13598b0> lVar) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(lVar, "function");
        return m101644c(activity, lVar, (g$$e) null);
    }

    /* renamed from: c */
    public static final boolean m101644c(Activity activity, C32226l<? super MMActivity, C13598b0> lVar, g$$e g__e) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(lVar, "function");
        if (activity instanceof MMActivity) {
            lVar.invoke(activity);
            return true;
        }
        try {
            int hashCode = lVar.hashCode();
            ProxyMMActivityResultRequest proxyMMActivityResultRequest = new ProxyMMActivityResultRequest(hashCode);
            int a = C87687a.m109085a(proxyMMActivityResultRequest);
            if (g__e != null) {
                C89916g.m112446a(activity).mo124232f(new C1789a(a, g__e));
            }
            f242320b.put(hashCode, lVar);
            C81956c.m100674b(activity, proxyMMActivityResultRequest, (AppBrandProxyUIProcessTask.C81943b) null);
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrandJsApiPayUtils", th, "waitForMMActivityResult startLogicProxy", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo115119a(C88267e eVar, String str) {
        C87412m.m108594g(eVar, "service");
        C87412m.m108594g(str, "customAppId");
        C26827e l = new C104289g(eVar.getRuntime().mo113210l1().f234804H.f239463r).optJSONArray("call_plugin_info");
        if (l == null) {
            return false;
        }
        int length = l.length();
        for (int i = 0; i < length; i++) {
            String optString = l.mo53814m(i).optString("plugin_id");
            Log.m105925i("MicroMsg.AppBrandJsApiPayUtils", "canRequestPaymentUseCustomAppId pluginId:%s customAppId:%s", optString, str);
            if (C87412m.m108589b(optString, str)) {
                return true;
            }
        }
        return false;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/AppBrandJsApiPayUtils$ProxyMMActivityResultRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultRequest */
    public static final class ProxyMMActivityResultRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final C82873a CREATOR = new C82873a((C8480h) null);

        /* renamed from: d */
        public final int f242321d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultRequest$a */
        public static final class C82873a implements Parcelable.Creator<ProxyMMActivityResultRequest> {
            public C82873a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new ProxyMMActivityResultRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new ProxyMMActivityResultRequest[i];
            }
        }

        public ProxyMMActivityResultRequest(int i) {
            this.f242321d = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProxyMMActivityResultRequest) && this.f242321d == ((ProxyMMActivityResultRequest) obj).f242321d;
        }

        public int getStartActivityRequestCode() {
            return C87687a.m109085a(this);
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return ProxyMMActivityResultTask.class;
        }

        public String getUIAlias() {
            return "AppBrandJsApiPayUtils.waitForMMActivityResult";
        }

        public int hashCode() {
            return this.f242321d;
        }

        public String toString() {
            return "ProxyMMActivityResultRequest(requestId=" + this.f242321d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f242321d);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public ProxyMMActivityResultRequest(Parcel parcel) {
            this(parcel.readInt());
            C87412m.m108594g(parcel, "parcel");
        }
    }
}
