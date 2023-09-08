package xt0;

import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.appusage.C29377k1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import java.util.List;
import mu3.C109639a;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;
import sx3.C64186f0;
import sx3.C64197v;

/* renamed from: xt0.k */
public final class C78984k extends C78974a<List<? extends LocalUsageInfo>, C68587i1> implements C68587i1 {

    /* renamed from: h */
    public final /* synthetic */ C68587i1 f231935h;

    /* renamed from: xt0.k$a */
    public static final class C38834a<T extends C15510f> implements C38172g {

        /* renamed from: a */
        public final /* synthetic */ String f104701a;

        /* renamed from: b */
        public final /* synthetic */ MStorageEventData f104702b;

        public C38834a(String str, MStorageEventData mStorageEventData) {
            this.f104701a = str;
            this.f104702b = mStorageEventData;
        }

        public boolean invoke(C15510f fVar) {
            ((C29377k1) fVar).onNotifyChange(this.f104701a, this.f104702b);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78984k(C68587i1 i1Var) {
        super(i1Var);
        C87412m.m108594g(i1Var, "delegate");
        this.f231935h = i1Var;
    }

    /* renamed from: O */
    public Object mo108950O(Object[] objArr) {
        C87412m.m108594g(objArr, "args");
        Object next = ((C32616b) C32617c.m39769a(objArr)).next();
        C87412m.m108592e(next, "null cannot be cast to non-null type kotlin.Int");
        Iterable Oe0 = ((C68587i1) this.f231908d).Oe0(((Integer) next).intValue());
        if (Oe0 == null) {
            Oe0 = C64186f0.f181907d;
        }
        int i = 0;
        for (Object next2 : Oe0) {
            int i2 = i + 1;
            if (i >= 0) {
                LocalUsageInfo localUsageInfo = (LocalUsageInfo) next2;
                if (i < 8) {
                    Log.m105925i("MicroMsg.AppBrandUsageStorageWithCache.AppBrandUsageStorageWithCache", "ccf-log [queryByDelegate] name=%s iconUrl=%s", localUsageInfo.f239044h, localUsageInfo.f239046j);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return Oe0;
    }

    public List<LocalUsageInfo> Oe0(int i) {
        return (List) mo108949D(Integer.valueOf(i));
    }

    /* renamed from: Xs */
    public List<LocalUsageInfo> mo94249Xs(int i, int i2) {
        return this.f231935h.mo94249Xs(i, i2);
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            synchronized (this.f231910f) {
                this.f231910f.add(iOnStorageChange);
            }
        }
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        this.f231935h.add(iOnStorageChange, looper);
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        this.f231935h.add(str, iOnStorageChange);
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f231935h.add(aVar, iOnStorageChange);
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f231935h.addLoadedListener(iOnStorageLoaded);
    }

    /* renamed from: d */
    public void mo108952d(MStorage.IOnStorageChange iOnStorageChange) {
        C87412m.m108594g(iOnStorageChange, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((C68587i1) this.f231908d).add(iOnStorageChange);
    }

    public void doNotify() {
        this.f231935h.doNotify();
    }

    public void doNotify(String str) {
        this.f231935h.doNotify(str);
    }

    public void doNotify(String str, int i, Object obj) {
        this.f231935h.doNotify(str, i, obj);
    }

    /* renamed from: gC */
    public List<LocalUsageInfo> mo94250gC(long j, int i) {
        return this.f231935h.mo94250gC(j, i);
    }

    public int getCount() {
        return this.f231935h.getCount();
    }

    public void lock() {
        this.f231935h.lock();
    }

    public int lockCount() {
        return this.f231935h.lockCount();
    }

    /* renamed from: nw */
    public boolean mo94252nw(String str, int i) {
        return this.f231935h.mo94252nw(str, i);
    }

    /* renamed from: q */
    public void mo108953q(String str, MStorageEventData mStorageEventData) {
        C87412m.m108594g(mStorageEventData, "eventData");
        C38166b.m41755b(C29377k1.class, new C38834a(str, mStorageEventData));
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            mo108951Q(iOnStorageChange);
        }
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f231935h.removeLoadedListener(iOnStorageLoaded);
    }

    public void unlock() {
        this.f231935h.unlock();
    }
}
