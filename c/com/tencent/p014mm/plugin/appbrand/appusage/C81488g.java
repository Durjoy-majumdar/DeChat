package com.tencent.p014mm.plugin.appbrand.appusage;

import android.content.Context;
import android.os.Looper;
import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C40434o0;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81470c;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.IStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;
import mu3.C109639a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;
import wi0.C90978e0;
import wi0.C90992p;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.g */
public final class C81488g extends C86301e implements IStorage, C68585h1 {

    /* renamed from: e */
    public static C81488g f239086e;

    /* renamed from: d */
    public final AtomicBoolean f239087d = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g$a */
    public static final class C81489a {
        public C81489a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g$b */
    public static class C81490b implements C81470c.C81471a {
        /* renamed from: a */
        public void mo113777a(LocalUsageInfo localUsageInfo, LocalUsageInfo localUsageInfo2, LocalUsageInfo localUsageInfo3) {
            C87412m.m108594g(localUsageInfo, "info");
        }

        /* renamed from: b */
        public void mo113778b(LocalUsageInfo localUsageInfo) {
            C87412m.m108594g(localUsageInfo, "info");
        }

        /* renamed from: d */
        public void mo113787d() {
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g$c */
    public static final class C81491c extends C81490b {

        /* renamed from: a */
        public final /* synthetic */ C81488g f239088a;

        public C81491c(C81488g gVar) {
            this.f239088a = gVar;
        }

        /* renamed from: c */
        public void mo113779c(LocalUsageInfo localUsageInfo) {
            C87412m.m108594g(localUsageInfo, "info");
            C81488g.vx0(this.f239088a, localUsageInfo);
        }

        /* renamed from: d */
        public void mo113787d() {
            ((C81470c) C86312j.m106911c(C81470c.class)).yx0(C40434o0.C40435a.ClosePullDown);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g$d */
    public static final class C81492d extends C81490b {

        /* renamed from: a */
        public final /* synthetic */ C81488g f239089a;

        public C81492d(C81488g gVar) {
            this.f239089a = gVar;
        }

        /* renamed from: c */
        public void mo113779c(LocalUsageInfo localUsageInfo) {
            C87412m.m108594g(localUsageInfo, "info");
            C81488g.vx0(this.f239089a, localUsageInfo);
        }

        /* renamed from: d */
        public void mo113787d() {
            ((C81470c) C86312j.m106911c(C81470c.class)).yx0(C40434o0.C40435a.Timeout);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g$e */
    public static final class C81493e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81488g f239090d;

        /* renamed from: e */
        public final /* synthetic */ List<LocalUsageInfo> f239091e;

        /* renamed from: f */
        public final /* synthetic */ boolean f239092f;

        /* renamed from: g */
        public final /* synthetic */ C81490b f239093g;

        public C81493e(C81488g gVar, List<? extends LocalUsageInfo> list, boolean z, C81490b bVar) {
            this.f239090d = gVar;
            this.f239091e = list;
            this.f239092f = z;
            this.f239093g = bVar;
        }

        public final void run() {
            List pM = this.f239090d.mo94245pM(Integer.MAX_VALUE, C68585h1.C68586a.DESC);
            if (pM == null) {
                pM = C64186f0.f181907d;
            }
            List<LocalUsageInfo> list = this.f239091e;
            boolean z = this.f239092f;
            C81488g gVar = this.f239090d;
            C81490b bVar = this.f239093g;
            StringBuilder sb = new StringBuilder();
            sb.append("[collection] reorderWithCallback, before calculateDiff oldList.size=");
            sb.append(pM.size());
            sb.append(" reorderList.size= ");
            C87412m.m108591d(list);
            sb.append(list.size());
            sb.append(' ');
            Log.m105924i("MicroMsg.AppBrandCollectionStorageExport[collection]", sb.toString());
            if (!z || pM.size() == list.size()) {
                C54248l.C54251c a = C54248l.m60949a(new C81522q0(pM, list), true);
                Log.m105924i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, after calculateDiff oldList.size=" + pM.size() + " reorderList.size= " + list.size() + ' ');
                C81470c cVar = (C81470c) C86312j.m106911c(C81470c.class);
                List y0 = C110818d0.m150953y0(pM);
                List<T> y05 = C110818d0.m150953y0(list);
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(y0);
                PInt pInt = new PInt(0);
                cVar.requireAccountInitialized();
                synchronized (cVar.f239056d) {
                    C81476d dVar = r5;
                    C81476d dVar2 = new C81476d(pInt, y0, y05, bVar, cVar, arrayList);
                    a.mo75045a(dVar);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                boolean z2 = pInt.value > 0;
                Log.m105924i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, changed = " + z2);
                if (z2) {
                    ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113790Lo(LocalUsageInfo.class, list, (Long) null);
                }
                gVar.f239087d.set(false);
                Log.m105924i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, before run callback");
                if (bVar != null) {
                    bVar.mo113787d();
                }
            } else if (bVar != null) {
                bVar.mo113787d();
            }
        }
    }

    static {
        new C81489a((C8480h) null);
    }

    public static final void vx0(C81488g gVar, LocalUsageInfo localUsageInfo) {
        gVar.getClass();
        String Lo = C81161g2.m99451h1().mo61553Lo(C90992p.C90996d.m114165a(localUsageInfo.f239041e), "true");
        C87412m.m108591d(Lo);
        if (!Boolean.parseBoolean(Lo)) {
            C81161g2.m99451h1().mo61554c(C90992p.C90996d.m114165a(localUsageInfo.f239041e));
        }
    }

    public boolean Fq0(List<LocalUsageInfo> list, int i) {
        Log.m105924i("MicroMsg.AppBrandCollectionStorageExport[collection]", "reorder reason = " + i);
        return wx0(list, i != 0 ? i != 1 ? null : new C81491c(this) : new C81492d(this), true);
    }

    /* renamed from: G7 */
    public boolean mo94240G7(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return mo94243l8(C81661j.m100181f(str), i);
    }

    /* renamed from: Tk */
    public int mo94241Tk() {
        return C81506j0.m99996a();
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        add(iOnStorageChange, Looper.getMainLooper());
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.addLoadedListener(iOnStorageLoaded);
        }
    }

    public void doNotify() {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.doNotify();
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.doNotify();
        }
    }

    public int getCount() {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            return i0Var.mo113796qq();
        }
        return 0;
    }

    /* renamed from: l8 */
    public boolean mo94243l8(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C87412m.m108591d(str);
        return ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113793bD(str, i);
    }

    public void lock() {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.lock();
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.lock();
        }
    }

    public int lockCount() {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        int i = 0;
        int lockCount = i0Var != null ? i0Var.lockCount() : 0;
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            i = Cx0.lockCount();
        }
        return lockCount + i;
    }

    /* renamed from: mJ */
    public boolean mo94244mJ(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C87412m.m108591d(str);
        return ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113795kD(str, i, true);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        C81161g2.vx0().getClass();
        C81161g2.requireAccountInitializedOnDemand();
        f239086e = this;
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        f239086e = null;
    }

    /* renamed from: pM */
    public List<? extends LocalUsageInfo> mo94245pM(int i, C68585h1.C68586a aVar) {
        C81500i0 i0Var;
        if (i > 0 && (i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class)) != null) {
            return i0Var.mo113792Yt(i, aVar);
        }
        return null;
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.remove(iOnStorageChange);
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.remove(iOnStorageChange);
        }
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.removeLoadedListener(iOnStorageLoaded);
        }
    }

    public int rg0(String str, int i) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        C87412m.m108591d(str);
        return ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113794jo(str, i);
    }

    public List<? extends LocalUsageInfo> tl0(int i, C68585h1.C68586a aVar, int i2) {
        C81500i0 i0Var;
        if (i > 0 && (i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class)) != null) {
            return i0Var.mo113791Ow(i, aVar, i2);
        }
        return null;
    }

    public void unlock() {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.unlock();
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.unlock();
        }
    }

    public final boolean wx0(List<? extends LocalUsageInfo> list, C81490b bVar, boolean z) {
        if (list == null) {
            if (!WeChatEnvironment.hasDebugger()) {
                return false;
            }
            Assert.assertTrue("reorderList is NULL", false);
        }
        this.f239087d.set(true);
        C81493e eVar = new C81493e(this, list, z, bVar);
        if (MMHandlerThread.isMainThread()) {
            ((C119157j) C119157j.f356862d).mo183871b(eVar, "MicroMsg.AppBrandCollectionStorageExport[collection]");
        } else {
            eVar.run();
        }
        return true;
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.add(iOnStorageChange, looper);
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.add(iOnStorageChange, looper);
        }
    }

    public void doNotify(String str) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.doNotify(str);
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.doNotify(str);
        }
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.add(aVar, iOnStorageChange);
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.add(aVar, iOnStorageChange);
        }
    }

    public void doNotify(String str, int i, Object obj) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.doNotify(str, i, obj);
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.doNotify(str, i, obj);
        }
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        C81500i0 i0Var = (C81500i0) C81161g2.Bx0(C81500i0.class);
        if (i0Var != null) {
            i0Var.add(str, iOnStorageChange);
        }
        C90978e0 Cx0 = C81161g2.Cx0();
        if (Cx0 != null) {
            Cx0.add(str, iOnStorageChange);
        }
    }
}
