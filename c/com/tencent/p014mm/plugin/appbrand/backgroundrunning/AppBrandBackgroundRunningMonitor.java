package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.os.Parcel;
import android.os.Parcelable;
import co0.C80123a;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import java.util.HashSet;
import java.util.Set;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor */
public class AppBrandBackgroundRunningMonitor {

    /* renamed from: a */
    public static MMToClientEvent.C81947d f239216a;

    /* renamed from: b */
    public static C81590r.C29457a f239217b;

    /* renamed from: c */
    public static IListener f239218c = new IListener<AppBrandBackgroundRunningOperationEvent>(C40008f.f107254d) {
        {
            this.__eventId = 15624729;
        }

        public boolean callback(IEvent iEvent) {
            AppBrandBackgroundRunningOperationEvent.C83126a aVar;
            AppBrandRuntimeWC b;
            C88267e eVar;
            AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = (AppBrandBackgroundRunningOperationEvent) iEvent;
            if (!(appBrandBackgroundRunningOperationEvent == null || (aVar = appBrandBackgroundRunningOperationEvent.f242920d) == null || (b = C81682d.m100222b(aVar.f242921a)) == null || (eVar = (C88267e) b.f238150p) == null)) {
                AppBrandBackgroundRunningOperationEvent.C83126a aVar2 = appBrandBackgroundRunningOperationEvent.f242920d;
                int i = aVar2.f242923c;
                int i2 = aVar2.f242922b;
                MMToClientEvent.C81947d dVar = AppBrandBackgroundRunningMonitor.f239216a;
                boolean z = true;
                Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, operation: %d, usage: %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i2 == 8 && i == 2) {
                    C80123a aVar3 = (C80123a) b.mo113032U(C80123a.class);
                    if (aVar3 != null) {
                        Log.m105918d("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "isBackgroundAudioPlayPaused: " + aVar3.f234613i);
                        if (aVar3.f234613i) {
                            Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, audioOfVideoBackgroundPlayManager isBackgroundAudioPlayPaused");
                            AppBrandBackgroundRunningOperationEvent.C83126a aVar4 = appBrandBackgroundRunningOperationEvent.f242920d;
                            AppBrandBackgroundRunningMonitor.m100056a(eVar, aVar4.f242923c, aVar4.f242922b, z);
                        }
                    } else {
                        Log.m105928w("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, audioOfVideoBackgroundPlayManager is null");
                    }
                }
                z = false;
                AppBrandBackgroundRunningOperationEvent.C83126a aVar42 = appBrandBackgroundRunningOperationEvent.f242920d;
                AppBrandBackgroundRunningMonitor.m100056a(eVar, aVar42.f242923c, aVar42.f242922b, z);
            }
            return false;
        }
    };

    /* renamed from: d */
    public static Set<String> f239219d = new HashSet();

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$a */
    public static final class C81571a implements C80883e<NotifyLocationBackgroundChanged, IPCVoid> {
        private C81571a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            NotifyLocationBackgroundChanged notifyLocationBackgroundChanged = (NotifyLocationBackgroundChanged) obj;
            if (notifyLocationBackgroundChanged != null) {
                String str = notifyLocationBackgroundChanged.f239220d;
                boolean z = notifyLocationBackgroundChanged.f239221e;
                MMToClientEvent.C81947d dVar = AppBrandBackgroundRunningMonitor.f239216a;
                C81964j.m100679b(str, new EventLocationBackgroundStateChanged(z));
            }
        }
    }

    /* renamed from: a */
    public static void m100056a(C81925i2 i2Var, int i, int i2, boolean z) {
        Class cls = C81590r.class;
        if (C86312j.m106911c(cls) != null) {
            AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new AppBrandBackgroundRunningOperationParcel();
            appBrandBackgroundRunningOperationParcel.f239222d = i2Var.getAppId();
            appBrandBackgroundRunningOperationParcel.f239223e = i2Var.getRuntime().f238149o.f239365g;
            appBrandBackgroundRunningOperationParcel.f239224f = i2;
            appBrandBackgroundRunningOperationParcel.f239225g = i;
            appBrandBackgroundRunningOperationParcel.f239226h = i2Var.getContext().getClass().getName();
            appBrandBackgroundRunningOperationParcel.f239230o = MMApplicationContext.getProcessName();
            appBrandBackgroundRunningOperationParcel.f239233r = z;
            appBrandBackgroundRunningOperationParcel.f239231p = ((AppBrandInitConfigLU) i2Var.getRuntime().mo113036W()).f234811P;
            if (i2 == 8) {
                appBrandBackgroundRunningOperationParcel.f239232q = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.class.getName();
            }
            if (!(!(i2Var instanceof C88267e) || i2Var.getRuntime() == null || i2Var.getRuntime().mo113036W() == null)) {
                AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) i2Var.getRuntime().mo113036W();
                appBrandBackgroundRunningOperationParcel.f239227i = appBrandInitConfigWC.f239363e;
                appBrandBackgroundRunningOperationParcel.f239228j = appBrandInitConfigWC.f239364f;
                appBrandBackgroundRunningOperationParcel.f239229n = appBrandInitConfigWC.f234839s;
            }
            ((C81590r) C86312j.m106911c(cls)).mo56711qO(appBrandBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: b */
    public static void m100057b(AppBrandRuntimeWC appBrandRuntimeWC) {
        Class cls = C81590r.class;
        Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveLocationUsageOperation, runtime:%s", appBrandRuntimeWC.f238147j);
        if (C86312j.m106911c(cls) != null) {
            AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new AppBrandBackgroundRunningOperationParcel();
            appBrandBackgroundRunningOperationParcel.f239222d = appBrandRuntimeWC.f238147j;
            appBrandBackgroundRunningOperationParcel.f239223e = appBrandRuntimeWC.f238149o.f239365g;
            appBrandBackgroundRunningOperationParcel.f239224f = 2;
            appBrandBackgroundRunningOperationParcel.f239225g = 2;
            appBrandBackgroundRunningOperationParcel.f239231p = appBrandRuntimeWC.mo113210l1().f234811P;
            if (appBrandRuntimeWC.mo113026R() != null) {
                appBrandBackgroundRunningOperationParcel.f239226h = appBrandRuntimeWC.mo113026R().getClass().getName();
            }
            ((C81590r) C86312j.m106911c(cls)).mo56711qO(appBrandBackgroundRunningOperationParcel);
        }
        String str = appBrandRuntimeWC.f238147j;
        if (MMApplicationContext.isMMProcess()) {
            C81964j.m100679b(str, new EventLocationBackgroundStateChanged(false));
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new NotifyLocationBackgroundChanged(str, false), C81571a.class, (C1256g) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged */
    public static class NotifyLocationBackgroundChanged implements Parcelable {
        public static final Parcelable.Creator<NotifyLocationBackgroundChanged> CREATOR = new C81570a();

        /* renamed from: d */
        public String f239220d;

        /* renamed from: e */
        public boolean f239221e;

        /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged$a */
        public class C81570a implements Parcelable.Creator<NotifyLocationBackgroundChanged> {
            public Object createFromParcel(Parcel parcel) {
                return new NotifyLocationBackgroundChanged(parcel);
            }

            public Object[] newArray(int i) {
                return new NotifyLocationBackgroundChanged[i];
            }
        }

        public NotifyLocationBackgroundChanged(String str, boolean z) {
            this.f239220d = str;
            this.f239221e = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f239220d);
            parcel.writeByte(this.f239221e ? (byte) 1 : 0);
        }

        public NotifyLocationBackgroundChanged(Parcel parcel) {
            this.f239220d = parcel.readString();
            this.f239221e = parcel.readByte() != 0;
        }
    }
}
