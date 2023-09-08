package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.luggage.sdk.launching.C80245f;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.api.ParcelableMultiTaskData;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import di0.C86299o;
import di0.C86300q;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/WeAppOpenUICallbackIPCProxy;", "Landroid/os/Parcelable;", "b", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy */
public final class WeAppOpenUICallbackIPCProxy implements Parcelable {
    public static final Parcelable.Creator<WeAppOpenUICallbackIPCProxy> CREATOR = new C83283a();

    /* renamed from: d */
    public C80242c<IPCVoid> f243386d;

    /* renamed from: e */
    public C80242c<IPCBoolean> f243387e;

    /* renamed from: f */
    public C80242c<IPCString> f243388f;

    /* renamed from: g */
    public C86300q f243389g;

    /* renamed from: h */
    public boolean f243390h;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy$a */
    public static final class C83283a implements Parcelable.Creator<WeAppOpenUICallbackIPCProxy> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            C80242c a = C80245f.m97631a(parcel);
            C87412m.m108591d(a);
            C80242c a2 = C80245f.m97631a(parcel);
            C87412m.m108591d(a2);
            C80242c a3 = C80245f.m97631a(parcel);
            C87412m.m108591d(a3);
            return new WeAppOpenUICallbackIPCProxy(a, a2, a3);
        }

        public Object[] newArray(int i) {
            return new WeAppOpenUICallbackIPCProxy[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy$b */
    public static final class C83284b {

        /* renamed from: a */
        public static final C83284b f243391a = new C83284b();

        /* renamed from: b */
        public static final ConcurrentHashMap<AppBrandInitConfigWC, C86300q> f243392b = new ConcurrentHashMap<>();

        /* renamed from: c */
        public static final SparseIntArray f243393c = new SparseIntArray();

        /* renamed from: b */
        public static final void m102229b(AppBrandInitConfigWC appBrandInitConfigWC, LaunchParcel launchParcel) {
            C87412m.m108594g(appBrandInitConfigWC, "initConfig");
            C87412m.m108594g(launchParcel, "launchParcel");
            C86299o e = C83316f1.f243478a.mo115611e(launchParcel.f243721M);
            ParcelableMultiTaskData parcelableMultiTaskData = null;
            C86300q qVar = e != null ? e.f250916E : null;
            if (qVar != null && !f243391a.mo115581a(qVar)) {
                f243392b.put(appBrandInitConfigWC, qVar);
            }
            appBrandInitConfigWC.f239393x1 = e != null ? e.f250917F : false;
            if (e != null) {
                parcelableMultiTaskData = e.f250919H;
            }
            appBrandInitConfigWC.f239394y1 = parcelableMultiTaskData;
        }

        /* renamed from: a */
        public final boolean mo115581a(C86300q qVar) {
            boolean z;
            SparseIntArray sparseIntArray = f243393c;
            synchronized (sparseIntArray) {
                z = false;
                if (sparseIntArray.get(qVar.hashCode(), 0) == 1) {
                    z = true;
                }
            }
            return z;
        }
    }

    public WeAppOpenUICallbackIPCProxy(C80242c<IPCVoid> cVar, C80242c<IPCBoolean> cVar2, C80242c<IPCString> cVar3) {
        C87412m.m108594g(cVar, "onUIEnterInvokeProxy");
        C87412m.m108594g(cVar2, "onUIExitInvokeProxy");
        C87412m.m108594g(cVar3, "onShareClickInHalfScreenMode");
        this.f243386d = cVar;
        this.f243387e = cVar2;
        this.f243388f = cVar3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        C80245f.m97634d(this.f243386d, parcel, 0, 4, (Object) null);
        C80245f.m97634d(this.f243387e, parcel, 0, 4, (Object) null);
        C80245f.m97634d(this.f243388f, parcel, 0, 4, (Object) null);
    }
}
