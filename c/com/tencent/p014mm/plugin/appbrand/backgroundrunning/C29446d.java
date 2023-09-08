package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.HashSet;
import java.util.Iterator;
import q20.C89449a;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.d */
public class C29446d extends C86301e implements C81590r {

    /* renamed from: d */
    public final HashSet<C81590r.C29458b> f80282d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<C81590r.C29457a> f80283e = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.d$a */
    public class C29447a implements C1256g<IPCBoolean> {
        public C29447a(C29446d dVar) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean != null) {
                Log.m105925i("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation(appbrand process), result:%s", Boolean.valueOf(iPCBoolean.f10312d));
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.d$b */
    public static class C29448b implements C80883e<AppBrandBackgroundRunningOperationParcel, IPCBoolean> {
        private C29448b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = (AppBrandBackgroundRunningOperationParcel) obj;
            Class cls = C81591s.class;
            if (appBrandBackgroundRunningOperationParcel == null) {
                Log.m105928w("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation(MM process), data is null");
                gVar.mo894a(new IPCBoolean(false));
            } else if (C86312j.m106916h(cls)) {
                ((C81591s) C86312j.m106911c(cls)).mo113852MI(appBrandBackgroundRunningOperationParcel);
                gVar.mo894a(new IPCBoolean(true));
            } else {
                gVar.mo894a(new IPCBoolean(false));
            }
        }
    }

    /* renamed from: O7 */
    public void mo56707O7(C81590r.C29457a aVar) {
        if (aVar != null) {
            synchronized (this.f80283e) {
                this.f80283e.remove(aVar);
            }
        }
    }

    /* renamed from: jr */
    public void mo56708jr(C81590r.C29457a aVar) {
        if (aVar != null) {
            synchronized (this.f80283e) {
                this.f80283e.add(aVar);
            }
        }
    }

    public void ke0(C81590r.C29458b bVar) {
        if (bVar != null) {
            synchronized (this.f80282d) {
                this.f80282d.add(bVar);
            }
        }
    }

    public void n50(C81590r.C29458b bVar) {
        if (bVar != null) {
            synchronized (this.f80282d) {
                this.f80282d.remove(bVar);
            }
        }
    }

    /* renamed from: qO */
    public void mo56711qO(AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        if (appBrandBackgroundRunningOperationParcel != null) {
            Log.m105925i("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation from appbrand process, operation:%s", appBrandBackgroundRunningOperationParcel);
            synchronized (this.f80282d) {
                Iterator<C81590r.C29458b> it = this.f80282d.iterator();
                while (it.hasNext()) {
                    it.next().mo56715a(appBrandBackgroundRunningOperationParcel);
                }
            }
            if (!appBrandBackgroundRunningOperationParcel.f239233r) {
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, appBrandBackgroundRunningOperationParcel, C29448b.class, new C29447a(this));
            }
        }
    }

    /* renamed from: qa */
    public void mo56712qa(MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel) {
        if (mMBackgroundRunningOperationParcel != null && !Util.isNullOrNil(mMBackgroundRunningOperationParcel.f239244d)) {
            Log.m105925i("MicroMsg.AppBrandBackgroundRunningManagerService", "receiveOperation in appbrand process, operation:%s", mMBackgroundRunningOperationParcel);
            synchronized (this.f80283e) {
                Iterator<C81590r.C29457a> it = this.f80283e.iterator();
                while (it.hasNext()) {
                    it.next().mo56714a(mMBackgroundRunningOperationParcel);
                }
            }
        }
    }
}
