package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.Collections;
import java.util.List;
import mu3.C109639a;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.z */
public final class C81545z extends C86301e implements C68587i1, IStorage {

    /* renamed from: d */
    public final /* synthetic */ MStorage f239159d = C81468a0.f239055a;

    /* renamed from: e */
    public final String f239160e = "MicroMsg.AppBrandLocalUsageStorageNewImpl";

    public List<? extends LocalUsageInfo> Oe0(int i) {
        if (i <= 0) {
            List<? extends LocalUsageInfo> emptyList = Collections.emptyList();
            C87412m.m108593f(emptyList, "emptyList<LocalUsageInfo>()");
            return emptyList;
        }
        C81161g2.requireAccountInitializedOnDemand();
        return C29378l0.m38692SE(C81161g2.f238473i.mo56647mI((String[]) null, i, 0, Integer.MAX_VALUE));
    }

    /* renamed from: Xs */
    public List<? extends LocalUsageInfo> mo94249Xs(int i, int i2) {
        if (i <= 0) {
            List<? extends LocalUsageInfo> emptyList = Collections.emptyList();
            C87412m.m108593f(emptyList, "emptyList<LocalUsageInfo>()");
            return emptyList;
        }
        C81161g2.requireAccountInitializedOnDemand();
        return C29378l0.m38692SE(C81161g2.f238473i.mo56647mI((String[]) null, i, 0, i2));
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        add(iOnStorageChange, Looper.getMainLooper());
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239159d.add(str, iOnStorageChange);
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239159d.add(aVar, iOnStorageChange);
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f239159d.addLoadedListener(iOnStorageLoaded);
    }

    public void doNotify() {
        this.f239159d.doNotify();
    }

    public void doNotify(String str) {
        this.f239159d.doNotify(str);
    }

    public void doNotify(String str, int i, Object obj) {
        this.f239159d.doNotify(str, i, obj);
    }

    /* renamed from: gC */
    public List<? extends LocalUsageInfo> mo94250gC(long j, int i) {
        C81161g2.requireAccountInitializedOnDemand();
        return C81161g2.f238473i.f80166f.mo56648a(j, i);
    }

    public int getCount() {
        C81161g2.requireAccountInitializedOnDemand();
        return C81161g2.f238473i.mo56641Yt();
    }

    public void lock() {
        this.f239159d.lock();
    }

    public int lockCount() {
        return this.f239159d.lockCount();
    }

    /* renamed from: nw */
    public boolean mo94252nw(String str, int i) {
        C81523q1.m100016a(str, (String) null, i);
        C81161g2.requireAccountInitializedOnDemand();
        boolean z = true;
        if (!C81161g2.f238473i.mo56644bF(str, i, 1)) {
            try {
                C81161g2.requireAccountInitializedOnDemand();
                if (C81161g2.f238473i.mo56643bD(str, i)) {
                    z = false;
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f239160e, e, "removeUsage", new Object[0]);
                return false;
            }
        }
        return z;
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        C81161g2.requireAccountInitializedOnDemand();
        C81161g2.f238473i.remove(iOnStorageChange);
        C81161g2.Cx0().remove(iOnStorageChange);
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f239159d.removeLoadedListener(iOnStorageLoaded);
    }

    public void unlock() {
        this.f239159d.unlock();
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        C81161g2.requireAccountInitializedOnDemand();
        C81161g2.f238473i.add(iOnStorageChange, looper);
        C81161g2.Cx0().add(iOnStorageChange, looper);
    }
}
