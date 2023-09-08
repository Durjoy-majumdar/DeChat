package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.luggage.sdk.processes.main.LuggageRegisterTask;
import com.tencent.luggage.sdk.processes.main.RuntimeInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.ipcinvoker.C80910p;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p959ec.C86499a;
import p963fc.C86812g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRegisterTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask */
public class AppBrandRegisterTask extends LuggageRegisterTask {
    public static final Parcelable.Creator<AppBrandRegisterTask> CREATOR = new C84302a();

    /* renamed from: h */
    public final RuntimeInfo f246184h;

    /* renamed from: i */
    public final int f246185i;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRegisterTask$a */
    public static final class C84302a implements Parcelable.Creator<AppBrandRegisterTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandRegisterTask((RuntimeInfo) parcel.readParcelable(AppBrandRegisterTask.class.getClassLoader()), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AppBrandRegisterTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandRegisterTask(RuntimeInfo runtimeInfo, int i) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f246184h = runtimeInfo;
        this.f246185i = i;
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f246184h;
    }

    /* renamed from: t */
    public void mo111421t(C80250c<C80278n> cVar) {
        C87412m.m108594g(cVar, "process");
        super.mo111421t(cVar);
        ((C84310k) cVar).f246199l = this.f246185i;
        RuntimeInfo runtimeInfo = this.f246184h;
        String str = runtimeInfo.f234989e;
        String str2 = runtimeInfo.f234993i;
        C80264l d = cVar.mo111359d(str);
        if (d != null) {
            if (this.f246184h.f234990f != d.f234966b) {
                Log.m105920e("MicroMsg.AppBrandRegisterTask", "runInMainProcess appId:" + this.f246184h.f234989e + ", instanceId:" + this.f246184h.f234993i + ", runtimeInfo.versionType(" + this.f246184h.f234990f + ") != record.debugType(" + d.f234966b + ')');
                return;
            }
            C87412m.m108594g(str2, "<set-?>");
            d.f234971g = str2;
            if (C81648d.m100144g() != null) {
                C81648d g = C81648d.m100144g();
                RuntimeInfo runtimeInfo2 = this.f246184h;
                g.mo124412e(runtimeInfo2.f234994j, (AppBrandInitConfigLU) runtimeInfo2.f234995n);
            } else {
                AppBrandInitConfig appBrandInitConfig = this.f246184h.f234995n;
                C87412m.m108592e(appBrandInitConfig, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
                new AppBrandRegisterTask$runInMainProcess$1((AppBrandInitConfigWC) appBrandInitConfig, C40008f.f107254d).alive();
            }
            String h = cVar.mo111363h();
            if (h != null) {
                if (h.length() > 0) {
                    C80910p.m98789a(h);
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f246184h, i);
        parcel.writeInt(this.f246185i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppBrandRegisterTask(C86812g gVar, int i) {
        this(C86499a.m107251a(gVar), i);
        C87412m.m108594g(gVar, "rt");
    }
}
