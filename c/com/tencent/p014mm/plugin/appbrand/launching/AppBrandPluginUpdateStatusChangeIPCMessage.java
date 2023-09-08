package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80280p;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import p963fc.C86812g;
import sx3.C110823p;
import u24.C90599h;
import xm0.C91291c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPluginUpdateStatusChangeIPCMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage */
public final class AppBrandPluginUpdateStatusChangeIPCMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandPluginUpdateStatusChangeIPCMessage> CREATOR = new C83248b();

    /* renamed from: n */
    public static final C83247a f243132n = new C83247a((C8480h) null);

    /* renamed from: e */
    public final String f243133e;

    /* renamed from: f */
    public final String f243134f;

    /* renamed from: g */
    public final C91291c f243135g;

    /* renamed from: h */
    public final String f243136h;

    /* renamed from: i */
    public final int f243137i;

    /* renamed from: j */
    public final String f243138j;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage$a */
    public static final class C83247a {
        public C83247a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo115490a(String str, C91291c cVar, String str2, int i, String str3) {
            C87412m.m108594g(str, "instanceId");
            C87412m.m108594g(cVar, "state");
            C87412m.m108594g(str2, "pluginAppId");
            if (MMApplicationContext.isMainProcess()) {
                Log.m105924i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + cVar + ", pluginAppId:" + str2 + "), instanceId:" + str + ", invoke");
                AppLaunchPrepareProcess j = AppLaunchPrepareProcess.m102198j(str);
                if (j == null) {
                    return mo115491b(str, cVar, str2, i, str3);
                }
                if (!C90599h.m113511d(str2)) {
                    synchronized (j.f243246S) {
                        j.f243246S.addLast(new C83349j3(cVar, str2, i, str3));
                    }
                }
                Log.m105924i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + cVar + ", pluginAppId:" + str2 + "), instanceId:" + str + ", stash in AppLaunchPrepareProcess");
                return true;
            }
            throw new IllegalStateException("Must be invoked in mm process!".toString());
        }

        /* renamed from: b */
        public final boolean mo115491b(String str, C91291c cVar, String str2, int i, String str3) {
            String str4;
            T t;
            String str5 = str;
            C91291c cVar2 = cVar;
            String str6 = str2;
            C87412m.m108594g(str5, "instanceId");
            C87412m.m108594g(cVar2, "state");
            C87412m.m108594g(str6, "pluginAppId");
            if (MMApplicationContext.isMainProcess()) {
                try {
                    AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                    try {
                        Iterator<T> it = a.mo111386a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (C87412m.m108589b(str5, ((C80264l) t).f234971g)) {
                                break;
                            }
                        }
                        C80264l lVar = (C80264l) t;
                        if (lVar != null) {
                            C80250c d = a.mo111389d(lVar);
                            try {
                                AppBrandPluginUpdateStatusChangeIPCMessage appBrandPluginUpdateStatusChangeIPCMessage = r1;
                                String str7 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
                                try {
                                    AppBrandPluginUpdateStatusChangeIPCMessage appBrandPluginUpdateStatusChangeIPCMessage2 = new AppBrandPluginUpdateStatusChangeIPCMessage(lVar.f234965a, str, cVar, str2, i, str3);
                                    C80250c.m97639p(d, appBrandPluginUpdateStatusChangeIPCMessage, (C32224a) null, 2, (Object) null);
                                    str4 = str7;
                                    try {
                                        Log.m105924i(str4, "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", by ProcessesManager");
                                        return true;
                                    } catch (C80280p e) {
                                        e = e;
                                        Log.printErrStackTrace(str4, e, "caught exception", new Object[0]);
                                        Log.m105920e(str4, "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", no app records found");
                                        return false;
                                    }
                                } catch (C80280p e2) {
                                    e = e2;
                                    str4 = str7;
                                    Log.printErrStackTrace(str4, e, "caught exception", new Object[0]);
                                    Log.m105920e(str4, "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", no app records found");
                                    return false;
                                }
                            } catch (C80280p e3) {
                                e = e3;
                                str4 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
                                Log.printErrStackTrace(str4, e, "caught exception", new Object[0]);
                                Log.m105920e(str4, "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", no app records found");
                                return false;
                            }
                        } else {
                            str4 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
                            Log.m105920e(str4, "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", no app records found");
                            return false;
                        }
                    } catch (C80280p e4) {
                        e = e4;
                        str4 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
                        Log.printErrStackTrace(str4, e, "caught exception", new Object[0]);
                        Log.m105920e(str4, "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", no app records found");
                        return false;
                    }
                } catch (Exception e5) {
                    Log.m105920e("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + cVar2 + ", pluginAppId:" + str6 + "), instanceId:" + str5 + ", get exception:" + e5);
                    return false;
                }
            } else {
                throw new IllegalStateException("Must be invoked in mm process!".toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage$b */
    public static final class C83248b implements Parcelable.Creator<AppBrandPluginUpdateStatusChangeIPCMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C91291c cVar = (C91291c) C110823p.m150982H(C91291c.values(), parcel.readInt());
            if (cVar == null) {
                cVar = C91291c.NO_UPDATE;
            }
            return new AppBrandPluginUpdateStatusChangeIPCMessage(readString, readString2, cVar, parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new AppBrandPluginUpdateStatusChangeIPCMessage[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandPluginUpdateStatusChangeIPCMessage(String str, String str2, C91291c cVar, String str3, int i, String str4) {
        super(str);
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "instanceId");
        C87412m.m108594g(cVar, "state");
        C87412m.m108594g(str3, "pluginAppId");
        this.f243133e = str;
        this.f243134f = str2;
        this.f243135g = cVar;
        this.f243136h = str3;
        this.f243137i = i;
        this.f243138j = str4;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f243133e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        String str = this.f243134f;
        AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
        String str2 = null;
        boolean b = C90599h.m113509b(str, M1 != null ? M1.f234838r : null);
        StringBuilder sb = new StringBuilder();
        sb.append("runInLuggageProcess, appId:");
        sb.append(appBrandRuntimeWC.f238147j);
        sb.append(", this.instanceId:");
        sb.append(this.f243134f);
        sb.append(", runtime.instanceId:");
        AppBrandInitConfigWC M12 = appBrandRuntimeWC.mo113210l1();
        if (M12 != null) {
            str2 = M12.f234838r;
        }
        sb.append(str2);
        sb.append(", proceed:");
        sb.append(b);
        Log.m105924i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", sb.toString());
        if (b) {
            appBrandRuntimeWC.mo113020N0(new C83328h(appBrandRuntimeWC, this));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f243133e);
        parcel.writeString(this.f243134f);
        C91291c cVar = this.f243135g;
        C87412m.m108594g(cVar, "<this>");
        parcel.writeInt(cVar.ordinal());
        parcel.writeString(this.f243136h);
        parcel.writeInt(this.f243137i);
        parcel.writeString(this.f243138j);
    }
}
