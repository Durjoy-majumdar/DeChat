package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bj0.C79708a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.debugger.console.C81720v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import lu3.C88656g;
import rx3.C13598b0;
import sx3.C64186f0;
import x20.C15618a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService */
public final class AppBrandMonitoredBluetoothDeviceService {

    /* renamed from: a */
    public static final AppBrandMonitoredBluetoothDeviceService f239926a = new AppBrandMonitoredBluetoothDeviceService();

    /* renamed from: b */
    public static final boolean f239927b = MMApplicationContext.isMainProcess();

    /* renamed from: c */
    public static final Set<String> f239928c;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams */
    public static final class DeleteInfoParams implements Parcelable {
        public static final Parcelable.Creator<DeleteInfoParams> CREATOR = new C81751a();

        /* renamed from: d */
        public final String f239929d;

        /* renamed from: e */
        public final String f239930e;

        /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams$a */
        public static final class C81751a implements Parcelable.Creator<DeleteInfoParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new DeleteInfoParams(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new DeleteInfoParams[i];
            }
        }

        public DeleteInfoParams(String str, String str2) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "wechatToken");
            this.f239929d = str;
            this.f239930e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f239929d);
            parcel.writeString(this.f239930e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo */
    public static final class WeAppConnectGattSuccessInfo implements Parcelable {
        public static final Parcelable.Creator<WeAppConnectGattSuccessInfo> CREATOR = new C81752a();

        /* renamed from: d */
        public final String f239931d;

        /* renamed from: e */
        public final String f239932e;

        /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo$a */
        public static final class C81752a implements Parcelable.Creator<WeAppConnectGattSuccessInfo> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new WeAppConnectGattSuccessInfo(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new WeAppConnectGattSuccessInfo[i];
            }
        }

        public WeAppConnectGattSuccessInfo(String str, String str2) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "deviceId");
            this.f239931d = str;
            this.f239932e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f239931d);
            parcel.writeString(this.f239932e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$a */
    public static final class C81753a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Result<C13598b0>, C13598b0> f239933d;

        /* renamed from: e */
        public final /* synthetic */ String f239934e;

        /* renamed from: f */
        public final /* synthetic */ String f239935f;

        public C81753a(C32226l<? super Result<C13598b0>, C13598b0> lVar, String str, String str2) {
            this.f239933d = lVar;
            this.f239934e = str;
            this.f239935f = str2;
        }

        public String getKey() {
            return "DeleteMonitoredBluetoothDeviceInfo#" + hashCode();
        }

        public void run() {
            Object obj;
            C32226l<Result<C13598b0>, C13598b0> lVar = this.f239933d;
            if (AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114138d(this.f239934e, this.f239935f)) {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } else {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(new C81777c0((String) null, 1, (C8480h) null)));
            }
            lVar.invoke(Result.m168113boximpl(obj));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams;", "kotlin.jvm.PlatformType", "deleteInfoParams", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "ipcCallback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$b */
    public static final class C81754b<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C81754b<InputType, ResultType> f239936d = new C81754b<>();

        public void invoke(Object obj, C1256g gVar) {
            DeleteInfoParams deleteInfoParams = (DeleteInfoParams) obj;
            String str = deleteInfoParams != null ? deleteInfoParams.f239929d : null;
            boolean z = true;
            if (str == null || str.length() == 0) {
                C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, passedAppId is empty");
                gVar.mo894a(new IPCBoolean(false));
                return;
            }
            String str2 = deleteInfoParams.f239930e;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z) {
                C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, passedWechatToken is empty");
                gVar.mo894a(new IPCBoolean(false));
                return;
            }
            gVar.mo894a(new IPCBoolean(AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114138d(str, str2)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$c */
    public static final class C81755c<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Result<C13598b0>, C13598b0> f239937d;

        public C81755c(C32226l<? super Result<C13598b0>, C13598b0> lVar) {
            this.f239937d = lVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Object obj2;
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean == null) {
                AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
                C32226l<Result<C13598b0>, C13598b0> lVar = this.f239937d;
                C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, data is null");
                Result.Companion companion = Result.Companion;
                lVar.invoke(Result.m168113boximpl(Result.m168114constructorimpl(ResultKt.createFailure(new C81777c0((String) null, 1, (C8480h) null)))));
                return;
            }
            C32226l<Result<C13598b0>, C13598b0> lVar2 = this.f239937d;
            if (iPCBoolean.f10312d) {
                Result.Companion companion2 = Result.Companion;
                obj2 = C13598b0.f38549a;
            } else {
                Result.Companion companion3 = Result.Companion;
                obj2 = ResultKt.createFailure(new C81777c0((String) null, 1, (C8480h) null));
            }
            lVar2.invoke(Result.m168113boximpl(Result.m168114constructorimpl(obj2)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$d */
    public static final class C81756d implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> f239938d;

        public C81756d(C32226l<? super Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> lVar) {
            this.f239938d = lVar;
        }

        public String getKey() {
            return "GetAllMonitoredBluetoothDeviceInfo#" + hashCode();
        }

        public void run() {
            C32226l<Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> lVar = this.f239938d;
            Result.Companion companion = Result.Companion;
            lVar.invoke(Result.m168113boximpl(Result.m168114constructorimpl(AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114140f())));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "Landroid/os/Bundle;", "ipcCallback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$e */
    public static final class C81757e<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C81757e<InputType, ResultType> f239939d = new C81757e<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Bundle bundle = new Bundle();
            bundle.setClassLoader(MonitoredBluetoothDeviceInfo.class.getClassLoader());
            bundle.putParcelableArrayList("List_MonitoredBluetoothDeviceInfo", new ArrayList(AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114140f()));
            gVar.mo894a(bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$f */
    public static final class C81758f<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> f239940d;

        public C81758f(C32226l<? super Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> lVar) {
            this.f239940d = lVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            boolean z;
            Bundle bundle = (Bundle) obj;
            if (bundle == null) {
                AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
                C32226l<Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> lVar = this.f239940d;
                C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync, data is null");
                Result.Companion companion = Result.Companion;
                lVar.invoke(Result.m168113boximpl(Result.m168114constructorimpl(C64186f0.f181907d)));
                return;
            }
            bundle.setClassLoader(MonitoredBluetoothDeviceInfo.class.getClassLoader());
            Iterable parcelableArrayList = bundle.getParcelableArrayList("List_MonitoredBluetoothDeviceInfo");
            if (parcelableArrayList == null) {
                parcelableArrayList = C64186f0.f181907d;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : parcelableArrayList) {
                MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (MonitoredBluetoothDeviceInfo) next;
                if (!monitoredBluetoothDeviceInfo.isValid()) {
                    C79708a aVar = C79708a.f233619a;
                    aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync, deviceInfo: " + monitoredBluetoothDeviceInfo + " is invalid");
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            this.f239940d.invoke(Result.m168113boximpl(Result.m168114constructorimpl(arrayList)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$g */
    public static final class C81759g implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Result<C13598b0>, C13598b0> f239941d;

        /* renamed from: e */
        public final /* synthetic */ MonitoredBluetoothDeviceInfo f239942e;

        public C81759g(C32226l<? super Result<C13598b0>, C13598b0> lVar, MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
            this.f239941d = lVar;
            this.f239942e = monitoredBluetoothDeviceInfo;
        }

        public String getKey() {
            return "SetMonitoredBluetoothDeviceInfo#" + hashCode();
        }

        public void run() {
            Object obj;
            C32226l<Result<C13598b0>, C13598b0> lVar = this.f239941d;
            if (AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114143i(this.f239942e)) {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } else {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(new C81777c0((String) null, 1, (C8480h) null)));
            }
            lVar.invoke(Result.m168113boximpl(obj));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;", "kotlin.jvm.PlatformType", "passedInfo", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "ipcCallback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$h */
    public static final class C81760h<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C81760h<InputType, ResultType> f239943d = new C81760h<>();

        public void invoke(Object obj, C1256g gVar) {
            MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (MonitoredBluetoothDeviceInfo) obj;
            boolean z = true;
            if (monitoredBluetoothDeviceInfo == null || true != monitoredBluetoothDeviceInfo.isValid()) {
                z = false;
            }
            if (!z) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "setInfoAsync, passedInfo: " + monitoredBluetoothDeviceInfo + " is invalid");
                gVar.mo894a(new IPCBoolean(false));
                return;
            }
            AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = AppBrandMonitoredBluetoothDeviceServiceCore.f239946a;
            C87412m.m108593f(monitoredBluetoothDeviceInfo, "passedInfo");
            gVar.mo894a(new IPCBoolean(appBrandMonitoredBluetoothDeviceServiceCore.mo114143i(monitoredBluetoothDeviceInfo)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$i */
    public static final class C81761i<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Result<C13598b0>, C13598b0> f239944d;

        public C81761i(C32226l<? super Result<C13598b0>, C13598b0> lVar) {
            this.f239944d = lVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Object obj2;
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean == null) {
                AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
                C32226l<Result<C13598b0>, C13598b0> lVar = this.f239944d;
                C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "setInfoAsync, data is null");
                Result.Companion companion = Result.Companion;
                lVar.invoke(Result.m168113boximpl(Result.m168114constructorimpl(ResultKt.createFailure(new C81777c0((String) null, 1, (C8480h) null)))));
                return;
            }
            C32226l<Result<C13598b0>, C13598b0> lVar2 = this.f239944d;
            if (iPCBoolean.f10312d) {
                Result.Companion companion2 = Result.Companion;
                obj2 = C13598b0.f38549a;
            } else {
                Result.Companion companion3 = Result.Companion;
                obj2 = ResultKt.createFailure(new C81777c0((String) null, 1, (C8480h) null));
            }
            lVar2.invoke(Result.m168113boximpl(Result.m168114constructorimpl(obj2)));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo;", "kotlin.jvm.PlatformType", "passedConnectInfo", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$j */
    public static final class C81762j<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C81762j<InputType, ResultType> f239945d = new C81762j<>();

        public void invoke(Object obj, C1256g gVar) {
            WeAppConnectGattSuccessInfo weAppConnectGattSuccessInfo = (WeAppConnectGattSuccessInfo) obj;
            String str = null;
            String str2 = weAppConnectGattSuccessInfo != null ? weAppConnectGattSuccessInfo.f239931d : null;
            if (weAppConnectGattSuccessInfo != null) {
                str = weAppConnectGattSuccessInfo.f239932e;
            }
            boolean z = true;
            if (!(str2 == null || str2.length() == 0)) {
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114144j(str2, str);
                    return;
                }
            }
            C79708a aVar = C79708a.f233619a;
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, passedAppId: " + str2 + ", passedDeviceId: " + str);
        }
    }

    static {
        Set<String> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C87412m.m108593f(newSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        f239928c = newSetFromMap;
    }

    /* renamed from: a */
    public final void mo114121a(String str, String str2, C32226l<? super Result<C13598b0>, C13598b0> lVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "wechatToken");
        C87412m.m108594g(lVar, "callback");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, appId: " + str + ", wechatToken: " + str2);
        if (f239927b) {
            ((C119157j) C119157j.f356862d).mo183885p(new C81753a(lVar, str, str2), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
            return;
        }
        C15618a.m14626b(new DeleteInfoParams(str, str2), C81754b.f239936d, new C81755c(lVar));
    }

    /* renamed from: b */
    public final void mo114122b(C32226l<? super Result<? extends List<MonitoredBluetoothDeviceInfo>>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync");
        if (f239927b) {
            ((C119157j) C119157j.f356862d).mo183885p(new C81756d(lVar), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
            return;
        }
        C15618a.m14626b(IPCVoid.f10316d, C81757e.f239939d, new C81758f(lVar));
    }

    /* renamed from: c */
    public final void mo114123c(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, C32226l<? super Result<C13598b0>, C13598b0> lVar) {
        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo2 = monitoredBluetoothDeviceInfo;
        C32226l<? super Result<C13598b0>, C13598b0> lVar2 = lVar;
        C87412m.m108594g(monitoredBluetoothDeviceInfo2, "info");
        C87412m.m108594g(lVar2, "callback");
        C79708a aVar = C79708a.f233619a;
        Log.m105918d("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "setInfoAsync");
        if (C79708a.f233620b) {
            C81720v.f239836a.mo114087b().logD(0, (String) null, (String) null, (String) null, 0, 0, 0, 0, "MicroMsg.AppBrandMonitoredBluetoothDeviceService: setInfoAsync");
        }
        if (f239927b) {
            ((C119157j) C119157j.f356862d).mo183885p(new C81759g(lVar2, monitoredBluetoothDeviceInfo2), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
            return;
        }
        C15618a.m14626b(monitoredBluetoothDeviceInfo2, C81760h.f239943d, new C81761i(lVar2));
    }

    /* renamed from: d */
    public final void mo114124d(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "deviceId");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, appId: " + str + ", deviceId: " + str2);
        if (!f239928c.contains(str)) {
            aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, we dont care");
        } else if (f239927b) {
            AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114144j(str, str2);
        } else {
            C15618a.m14627c(new WeAppConnectGattSuccessInfo(str, str2), C81762j.f239945d, (C1256g) null, 4, (Object) null);
        }
    }
}
