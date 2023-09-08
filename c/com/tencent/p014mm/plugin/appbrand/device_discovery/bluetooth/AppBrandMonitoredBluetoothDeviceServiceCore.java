package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import li0.C88508b;
import li0.C88509c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore */
public final class AppBrandMonitoredBluetoothDeviceServiceCore {

    /* renamed from: a */
    public static final AppBrandMonitoredBluetoothDeviceServiceCore f239946a = new AppBrandMonitoredBluetoothDeviceServiceCore();

    /* renamed from: b */
    public static volatile boolean f239947b;

    /* renamed from: c */
    public static final Map<String, MonitoredBluetoothDeviceInfo> f239948c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final Map<String, C81807x> f239949d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final Set<String> f239950e;

    /* renamed from: f */
    public static final Map<String, Map<String, Boolean>> f239951f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final C13601g f239952g = C36568h.m40986b(C13602i.NONE, C81767c.f239961d);

    /* renamed from: h */
    public static final Object f239953h = new Object();

    /* renamed from: i */
    public static final Set<C81764a> f239954i = new HashSet();

    /* renamed from: j */
    public static final Map<C81764a, Set<MonitoredBluetoothDeviceInfo>> f239955j = new HashMap();

    /* renamed from: k */
    public static final Set<C81764a> f239956k = new HashSet();

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$a */
    public static final class C81764a {

        /* renamed from: a */
        public final String f239957a;

        /* renamed from: b */
        public final int f239958b;

        @Metadata(mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$a$a */
        public static final class C81765a<InputType, ResultType> implements C80916r {

            /* renamed from: a */
            public static final C81765a<InputType, ResultType> f239959a = new C81765a<>();

            public Object invoke(Object obj) {
                IPCString iPCString = (IPCString) obj;
                C88509c cVar = null;
                String str = iPCString != null ? iPCString.f10315d : null;
                boolean z = false;
                if (str == null) {
                    C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "isInBackgroundTemporary, passedAppId is null");
                    return new IPCBoolean(false);
                }
                AppBrandRuntimeWC b = C81682d.m100222b(str);
                if (b != null) {
                    cVar = b.f238113K;
                }
                if (cVar == null) {
                    C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "isInBackgroundTemporary, runningStateController is null");
                    return new IPCBoolean(false);
                }
                if (C88508b.BACKGROUND == cVar.mo122980c() && !cVar.mo122983f()) {
                    z = true;
                }
                C79708a aVar = C79708a.f233619a;
                aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "isInBackgroundTemporary, isInBackgroundTemporary: " + z);
                return new IPCBoolean(z);
            }
        }

        public C81764a(String str, int i) {
            C87412m.m108594g(str, "appId");
            this.f239957a = str;
            this.f239958b = i;
        }

        /* renamed from: a */
        public final boolean mo114147a() {
            String h;
            AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
            C80264l b = a.mo111387b(this.f239957a, this.f239958b);
            if (!(b == null || (h = ((C84310k) a.mo111389d(b)).mo111363h()) == null)) {
                IPCBoolean iPCBoolean = (IPCBoolean) C28947a.m38501b(h, new IPCString(this.f239957a), C81765a.f239959a);
                Boolean valueOf = iPCBoolean != null ? Boolean.valueOf(iPCBoolean.f10312d) : null;
                if (valueOf != null) {
                    return valueOf.booleanValue();
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C81764a)) {
                return false;
            }
            C81764a aVar = (C81764a) obj;
            return C87412m.m108589b(this.f239957a, aVar.f239957a) && this.f239958b == aVar.f239958b;
        }

        public int hashCode() {
            return (this.f239957a.hashCode() * 31) + this.f239958b;
        }

        public String toString() {
            return "WeApp(appId=" + this.f239957a + ", versionType=" + this.f239958b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$b */
    public static final class C81766b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MonitoredBluetoothDeviceInfo f239960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81766b(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
            super(0);
            this.f239960d = monitoredBluetoothDeviceInfo;
        }

        public Object invoke() {
            String str = this.f239960d.field_bluetoothDeviceId;
            C87412m.m108591d(str);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239948c;
            concurrentHashMap.put(str, this.f239960d);
            AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.getClass();
            C81809z zVar = (C81809z) AppBrandMonitoredBluetoothDeviceServiceCore.f239952g.getValue();
            C87412m.m108594g(zVar, "gattConnectListener");
            C81797p.f240015a.getClass();
            C81807x mVar = C81797p.f240017c ? new C81792m(str, zVar) : new C81795n(str, zVar);
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239949d;
            concurrentHashMap2.put(str, mVar);
            if (!mVar.connect()) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "doMonitor, autoConnectGatt to " + str + " fail");
                concurrentHashMap2.remove(str);
                concurrentHashMap.remove(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$c */
    public static final class C81767c extends C87413o implements C32224a<C81809z> {

        /* renamed from: d */
        public static final C81767c f239961d = new C81767c();

        public C81767c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C81784g.f239984a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$d */
    public static final class C81768d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MonitoredBluetoothDeviceInfo f239962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81768d(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
            super(0);
            this.f239962d = monitoredBluetoothDeviceInfo;
        }

        public Object invoke() {
            String str = this.f239962d.field_bluetoothDeviceId;
            C87412m.m108591d(str);
            C81807x xVar = (C81807x) ((ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239949d).remove(str);
            if (xVar != null && !xVar.disconnect()) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "undoMonitor, disAutoConnect to " + str + " fail");
            }
            ((ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239948c).remove(str);
            return C13598b0.f38549a;
        }
    }

    static {
        Set<String> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C87412m.m108593f(newSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        f239950e = newSetFromMap;
        C40008f fVar = C40008f.f107254d;
        new IListener<OnMonitorBluetoothDeviceAuthorizeStateEvent>(fVar) {
            public boolean callback(IEvent iEvent) {
                OnMonitorBluetoothDeviceAuthorizeStateEvent onMonitorBluetoothDeviceAuthorizeStateEvent = (OnMonitorBluetoothDeviceAuthorizeStateEvent) iEvent;
                C87412m.m108594g(onMonitorBluetoothDeviceAuthorizeStateEvent, "event");
                Log.m105924i("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "callback, event: " + onMonitorBluetoothDeviceAuthorizeStateEvent);
                if (!onMonitorBluetoothDeviceAuthorizeStateEvent.f80352e) {
                    AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = AppBrandMonitoredBluetoothDeviceServiceCore.f239946a;
                    appBrandMonitoredBluetoothDeviceServiceCore.mo114137c(onMonitorBluetoothDeviceAuthorizeStateEvent.f80351d, 0);
                    appBrandMonitoredBluetoothDeviceServiceCore.mo114137c(onMonitorBluetoothDeviceAuthorizeStateEvent.f80351d, 1);
                    appBrandMonitoredBluetoothDeviceServiceCore.mo114137c(onMonitorBluetoothDeviceAuthorizeStateEvent.f80351d, 2);
                }
                return false;
            }
        }.alive();
        new IListener<CgiLaunchWxaApp.UpdateLaunchWxaAppInfoBroadcastEvent>(fVar) {
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
                r8 = r8.f130770d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r8) {
                /*
                    r7 = this;
                    com.tencent.mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp$UpdateLaunchWxaAppInfoBroadcastEvent r8 = (com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp.UpdateLaunchWxaAppInfoBroadcastEvent) r8
                    java.lang.String r0 = "event"
                    gy3.C87412m.m108594g(r8, r0)
                    com.tencent.mm.plugin.appbrand.launching.w2 r8 = r8.f243447d
                    r0 = 0
                    if (r8 != 0) goto L_0x000e
                    goto L_0x0070
                L_0x000e:
                    java.lang.String r1 = r8.field_appId
                    if (r1 != 0) goto L_0x0013
                    goto L_0x0070
                L_0x0013:
                    te3.au r8 = r8.field_jsapiInfo
                    if (r8 == 0) goto L_0x001e
                    pe3.b r8 = r8.f130770d
                    if (r8 == 0) goto L_0x001e
                    byte[] r8 = r8.f257327a
                    goto L_0x001f
                L_0x001e:
                    r8 = 0
                L_0x001f:
                    if (r8 != 0) goto L_0x0022
                    goto L_0x0070
                L_0x0022:
                    r2 = 1089(0x441, float:1.526E-42)
                    int r3 = r8.length
                    r4 = 1
                    if (r2 >= r3) goto L_0x002a
                    r3 = 1
                    goto L_0x002b
                L_0x002a:
                    r3 = 0
                L_0x002b:
                    if (r3 != 0) goto L_0x002e
                    goto L_0x0070
                L_0x002e:
                    java.lang.String r3 = sf0.C90188n0.f258945m
                    int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r0)
                    int r3 = -r3
                    r5 = -2
                    java.lang.String r6 = "MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore"
                    if (r3 == r5) goto L_0x0066
                    r5 = -1
                    if (r3 == r5) goto L_0x005b
                    byte r8 = r8[r2]
                    if (r8 == r4) goto L_0x0050
                    r2 = 6
                    if (r8 == r2) goto L_0x0045
                    goto L_0x0070
                L_0x0045:
                    java.lang.String r8 = "callback#UpdateLaunchWxaAppInfoBroadcastEvent, block"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore r8 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore.f239946a
                    r8.mo114136b(r1)
                    goto L_0x0070
                L_0x0050:
                    java.lang.String r8 = "callback#UpdateLaunchWxaAppInfoBroadcastEvent, unblock"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore r8 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore.f239946a
                    r8.mo114145k(r1)
                    goto L_0x0070
                L_0x005b:
                    java.lang.String r8 = "callback#UpdateLaunchWxaAppInfoBroadcastEvent, hardcode perm on, unblock"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore r8 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore.f239946a
                    r8.mo114145k(r1)
                    goto L_0x0070
                L_0x0066:
                    java.lang.String r8 = "callback#UpdateLaunchWxaAppInfoBroadcastEvent, hardcode perm off, block"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore r8 = com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore.f239946a
                    r8.mo114136b(r1)
                L_0x0070:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore.C817632.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        }.alive();
    }

    /* renamed from: a */
    public static final void m100329a(AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore, String str) {
        appBrandMonitoredBluetoothDeviceServiceCore.getClass();
        Map map = (Map) ((ConcurrentHashMap) f239951f).get(str);
        if (map == null) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "resumeConnect, deviceId2HasConnectedMap is null");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            C79708a aVar = C79708a.f233619a;
            aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "resumeConnect, deviceId: " + str2 + ", hasConnected: " + booleanValue);
            C81807x xVar = (C81807x) ((ConcurrentHashMap) f239949d).get(str2);
            if (xVar != null) {
                xVar.mo114174b(booleanValue);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo114136b(String str) {
        List<MonitoredBluetoothDeviceInfo> list;
        C87412m.m108594g(str, "appId");
        C81774b0 g = mo114141g();
        if (g != null) {
            synchronized (g) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "blockAppInfo, appId: " + str);
                List<MonitoredBluetoothDeviceInfo> jo = g.mo114168jo(str);
                list = null;
                if (jo != null) {
                    if (!g.execSQL(g.getTableName(), "UPDATE " + g.getTableName() + " SET isBlocked = 1 WHERE appId = '" + str + '\'')) {
                        aVar.mo109822b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "blockAppInfo, execSQL fail");
                        jo = null;
                    }
                    list = jo;
                }
            }
            if (list != null) {
                AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = f239946a;
                Object[] array = list.toArray(new MonitoredBluetoothDeviceInfo[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                MonitoredBluetoothDeviceInfo[] monitoredBluetoothDeviceInfoArr = (MonitoredBluetoothDeviceInfo[]) array;
                appBrandMonitoredBluetoothDeviceServiceCore.mo114142h(3, (MonitoredBluetoothDeviceInfo[]) Arrays.copyOf(monitoredBluetoothDeviceInfoArr, monitoredBluetoothDeviceInfoArr.length));
                return true;
            }
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "blockAppInfo, fail");
        return false;
    }

    /* renamed from: c */
    public final boolean mo114137c(String str, int i) {
        List<MonitoredBluetoothDeviceInfo> list;
        C87412m.m108594g(str, "appId");
        C81774b0 g = mo114141g();
        if (g != null) {
            synchronized (g) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "deleteAppInfo, appId: " + str + ", versionType: " + i);
                List<MonitoredBluetoothDeviceInfo> Lo = g.mo114167Lo(str, i);
                list = null;
                if (Lo != null) {
                    MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
                    monitoredBluetoothDeviceInfo.field_appId = str;
                    monitoredBluetoothDeviceInfo.field_versionType = i;
                    if (!g.delete(monitoredBluetoothDeviceInfo, (String[]) Arrays.copyOf(C81774b0.f239967e, 2))) {
                        aVar.mo109822b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "deleteAppInfo, delete fail");
                        Lo = null;
                    }
                    list = Lo;
                }
            }
            if (list != null) {
                AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = f239946a;
                Object[] array = list.toArray(new MonitoredBluetoothDeviceInfo[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                MonitoredBluetoothDeviceInfo[] monitoredBluetoothDeviceInfoArr = (MonitoredBluetoothDeviceInfo[]) array;
                appBrandMonitoredBluetoothDeviceServiceCore.mo114142h(2, (MonitoredBluetoothDeviceInfo[]) Arrays.copyOf(monitoredBluetoothDeviceInfoArr, monitoredBluetoothDeviceInfoArr.length));
                return true;
            }
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "deleteAppInfo, fail");
        return false;
    }

    /* renamed from: d */
    public final boolean mo114138d(String str, String str2) {
        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "wechatToken");
        C81774b0 g = mo114141g();
        if (g != null) {
            synchronized (g) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "deleteInfo, appId: " + str + ", wechatToken: " + str2);
                monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
                monitoredBluetoothDeviceInfo.field_appId = str;
                monitoredBluetoothDeviceInfo.field_wechatToken = str2;
                String[] strArr = C81774b0.f239966d;
                if (!g.get(monitoredBluetoothDeviceInfo, (String[]) Arrays.copyOf(strArr, 2)) || !g.delete(monitoredBluetoothDeviceInfo, (String[]) Arrays.copyOf(strArr, 2))) {
                    monitoredBluetoothDeviceInfo = null;
                }
            }
            if (monitoredBluetoothDeviceInfo != null) {
                f239946a.mo114142h(2, monitoredBluetoothDeviceInfo);
                return true;
            }
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "deleteInfo, fail");
        return false;
    }

    /* renamed from: e */
    public final void mo114139e(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        if (!f239947b) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "doMonitor, isMonitor is false");
        } else {
            C23564m.m28136f(new C81766b(monitoredBluetoothDeviceInfo));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo> mo114140f() {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b0 r0 = r8.mo114141g()
            java.lang.String r1 = "MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore"
            if (r0 == 0) goto L_0x004c
            monitor-enter(r0)
            android.database.Cursor r2 = r0.getAll()     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x003c
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0021
            bj0.a r2 = bj0.C79708a.f233619a     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage"
            java.lang.String r4 = "getAllInfo, allCursor moveToFirst fail"
            r2.mo109821a(r3, r4)     // Catch:{ all -> 0x0049 }
            sx3.f0 r2 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0021:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            r3.<init>()     // Catch:{ all -> 0x0049 }
        L_0x0026:
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo r4 = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            r4.convertFrom(r2)     // Catch:{ all -> 0x0049 }
            r3.add(r4)     // Catch:{ all -> 0x0049 }
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x0049 }
            if (r4 != 0) goto L_0x0026
            r2.close()     // Catch:{ all -> 0x0049 }
            r2 = r3
            goto L_0x0047
        L_0x003c:
            bj0.a r2 = bj0.C79708a.f233619a     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage"
            java.lang.String r4 = "getAllInfo, allCursor is null"
            r2.mo109822b(r3, r4)     // Catch:{ all -> 0x0049 }
            sx3.f0 r2 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r0)
            goto L_0x0055
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004c:
            bj0.a r0 = bj0.C79708a.f233619a
            java.lang.String r2 = "getAllInfo, infoStorage is null"
            r0.mo109822b(r1, r2)
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x0055:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x005e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo r4 = (com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) r4
            boolean r5 = r4.isValid()
            if (r5 != 0) goto L_0x008e
            bj0.a r5 = bj0.C79708a.f233619a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getAllInfo, deviceInfo: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " is invalid"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.mo109822b(r1, r4)
            r4 = 0
            goto L_0x008f
        L_0x008e:
            r4 = 1
        L_0x008f:
            if (r4 == 0) goto L_0x005e
            r0.add(r3)
            goto L_0x005e
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore.mo114140f():java.util.List");
    }

    /* renamed from: g */
    public final C81774b0 mo114141g() {
        String[] strArr = C81774b0.f239966d;
        return (C81774b0) C81161g2.Bx0(C81774b0.class);
    }

    /* renamed from: h */
    public final void mo114142h(int i, MonitoredBluetoothDeviceInfo... monitoredBluetoothDeviceInfoArr) {
        Object obj;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, op: " + i);
        int i2 = 0;
        if (monitoredBluetoothDeviceInfoArr.length == 0) {
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfoList is empty");
        } else if (i == 1) {
            int length = monitoredBluetoothDeviceInfoArr.length;
            while (i2 < length) {
                MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = monitoredBluetoothDeviceInfoArr[i2];
                if (!monitoredBluetoothDeviceInfo.isValid()) {
                    C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfo is invalid");
                } else {
                    C81801r.m100367a(monitoredBluetoothDeviceInfo, C81783f0.SET_MONITORED_BLUETOOTH_DEVICE, C81806w.f240032a);
                    String str = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
                    C87412m.m108591d(str);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f239948c;
                    if (!concurrentHashMap.containsKey(str)) {
                        C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, is insert");
                        if (!monitoredBluetoothDeviceInfo.field_isBlocked) {
                            mo114139e(monitoredBluetoothDeviceInfo);
                        }
                    } else {
                        C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, is update");
                        Iterator it = concurrentHashMap.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (C87412m.m108589b(((MonitoredBluetoothDeviceInfo) obj).field_wechatToken, monitoredBluetoothDeviceInfo.field_wechatToken)) {
                                break;
                            }
                        }
                        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo2 = (MonitoredBluetoothDeviceInfo) obj;
                        if (monitoredBluetoothDeviceInfo2 != null) {
                            f239946a.mo114146l(monitoredBluetoothDeviceInfo2);
                        }
                        if (!monitoredBluetoothDeviceInfo.field_isBlocked) {
                            mo114139e(monitoredBluetoothDeviceInfo);
                        }
                    }
                }
                i2++;
            }
        } else if (i == 2) {
            int length2 = monitoredBluetoothDeviceInfoArr.length;
            while (i2 < length2) {
                MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo3 = monitoredBluetoothDeviceInfoArr[i2];
                if (!monitoredBluetoothDeviceInfo3.isValid()) {
                    C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfo is invalid");
                } else {
                    C81801r.m100367a(monitoredBluetoothDeviceInfo3, C81783f0.DELETE_MONITORED_BLUETOOTH_DEVICE, C81806w.f240032a);
                    mo114146l(monitoredBluetoothDeviceInfo3);
                }
                i2++;
            }
        } else if (i == 3) {
            int length3 = monitoredBluetoothDeviceInfoArr.length;
            while (i2 < length3) {
                MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo4 = monitoredBluetoothDeviceInfoArr[i2];
                if (!monitoredBluetoothDeviceInfo4.isValid()) {
                    C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, deviceInfo is invalid");
                } else if (!monitoredBluetoothDeviceInfo4.field_isBlocked) {
                    C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, unblock");
                    Map<String, MonitoredBluetoothDeviceInfo> map = f239948c;
                    String str2 = monitoredBluetoothDeviceInfo4.field_bluetoothDeviceId;
                    C87412m.m108591d(str2);
                    if (!((ConcurrentHashMap) map).containsKey(str2)) {
                        mo114139e(monitoredBluetoothDeviceInfo4);
                    }
                } else {
                    C79708a.f233619a.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onInfoChange, block");
                    mo114146l(monitoredBluetoothDeviceInfo4);
                }
                i2++;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo114143i(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        boolean replace;
        C87412m.m108594g(monitoredBluetoothDeviceInfo, "info");
        C81774b0 g = mo114141g();
        if (g != null) {
            monitoredBluetoothDeviceInfo.field_updateTime = System.currentTimeMillis();
            synchronized (g) {
                replace = g.replace(monitoredBluetoothDeviceInfo);
            }
            if (replace) {
                f239946a.mo114142h(1, monitoredBluetoothDeviceInfo);
            }
            return replace;
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "setInfo, infoStorage is null");
        return false;
    }

    /* renamed from: j */
    public final void mo114144j(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "deviceId");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppConnectGattSuccess, appId: " + str + ", deviceId: " + str2);
        Map map = (Map) ((ConcurrentHashMap) f239951f).get(str);
        if (map == null || ((Boolean) map.put(str2, Boolean.TRUE)) == null) {
            aVar.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppConnectGattSuccess, we dont care");
        }
    }

    /* renamed from: k */
    public final boolean mo114145k(String str) {
        List<MonitoredBluetoothDeviceInfo> list;
        C87412m.m108594g(str, "appId");
        C81774b0 g = mo114141g();
        if (g != null) {
            synchronized (g) {
                C79708a aVar = C79708a.f233619a;
                aVar.mo109821a("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "unblockAppInfo, appId: " + str);
                List<MonitoredBluetoothDeviceInfo> jo = g.mo114168jo(str);
                list = null;
                if (jo != null) {
                    if (!g.execSQL(g.getTableName(), "UPDATE " + g.getTableName() + " SET isBlocked = 0 WHERE appId = '" + str + '\'')) {
                        aVar.mo109822b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfoStorage", "unblockAppInfo, execSQL fail");
                        jo = null;
                    }
                    list = jo;
                }
            }
            if (list != null) {
                AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = f239946a;
                Object[] array = list.toArray(new MonitoredBluetoothDeviceInfo[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                MonitoredBluetoothDeviceInfo[] monitoredBluetoothDeviceInfoArr = (MonitoredBluetoothDeviceInfo[]) array;
                appBrandMonitoredBluetoothDeviceServiceCore.mo114142h(3, (MonitoredBluetoothDeviceInfo[]) Arrays.copyOf(monitoredBluetoothDeviceInfoArr, monitoredBluetoothDeviceInfoArr.length));
                return true;
            }
        }
        C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "unblockAppInfo, fail");
        return false;
    }

    /* renamed from: l */
    public final void mo114146l(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        if (!f239947b) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "undoMonitor, isMonitor is false");
        } else {
            C23564m.m28136f(new C81768d(monitoredBluetoothDeviceInfo));
        }
    }
}
