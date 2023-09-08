package xt0;

import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.appusage.C29373j1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mu3.C109639a;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;
import sx3.C110818d0;
import sx3.C64186f0;

/* renamed from: xt0.c */
public final class C78978c extends C78974a<List<? extends LocalUsageInfo>, C68585h1> implements C68585h1 {

    /* renamed from: h */
    public final /* synthetic */ C68585h1 f231919h;

    /* renamed from: xt0.c$a */
    public static final class C38830a<T extends C15510f> implements C38172g {

        /* renamed from: a */
        public final /* synthetic */ String f104694a;

        /* renamed from: b */
        public final /* synthetic */ MStorageEventData f104695b;

        public C38830a(String str, MStorageEventData mStorageEventData) {
            this.f104694a = str;
            this.f104695b = mStorageEventData;
        }

        public boolean invoke(C15510f fVar) {
            ((C29373j1) fVar).onNotifyChange(this.f104694a, this.f104695b);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78978c(C68585h1 h1Var) {
        super(h1Var);
        C87412m.m108594g(h1Var, "delegate");
        this.f231919h = h1Var;
    }

    public boolean Fq0(List<LocalUsageInfo> list, int i) {
        return this.f231919h.Fq0(list, i);
    }

    /* renamed from: G7 */
    public boolean mo94240G7(String str, int i) {
        return this.f231919h.mo94240G7(str, i);
    }

    /* renamed from: O */
    public Object mo108950O(Object[] objArr) {
        C87412m.m108594g(objArr, "args");
        C32616b bVar = (C32616b) C32617c.m39769a(objArr);
        Object next = bVar.next();
        C87412m.m108592e(next, "null cannot be cast to non-null type kotlin.Int");
        List<LocalUsageInfo> pM = ((C68585h1) this.f231908d).mo94245pM(((Integer) next).intValue(), (C68585h1.C68586a) bVar.next());
        return pM == null ? C64186f0.f181907d : pM;
    }

    /* renamed from: Tk */
    public int mo94241Tk() {
        return this.f231919h.mo94241Tk();
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            synchronized (this.f231910f) {
                this.f231910f.add(iOnStorageChange);
            }
        }
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        this.f231919h.add(iOnStorageChange, looper);
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        this.f231919h.add(str, iOnStorageChange);
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f231919h.add(aVar, iOnStorageChange);
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f231919h.addLoadedListener(iOnStorageLoaded);
    }

    /* renamed from: d */
    public void mo108952d(MStorage.IOnStorageChange iOnStorageChange) {
        C87412m.m108594g(iOnStorageChange, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((C68585h1) this.f231908d).add(iOnStorageChange);
    }

    public void doNotify() {
        this.f231919h.doNotify();
    }

    public void doNotify(String str) {
        this.f231919h.doNotify(str);
    }

    public void doNotify(String str, int i, Object obj) {
        this.f231919h.doNotify(str, i, obj);
    }

    public int getCount() {
        return this.f231919h.getCount();
    }

    /* renamed from: l8 */
    public boolean mo94243l8(String str, int i) {
        return this.f231919h.mo94243l8(str, i);
    }

    public void lock() {
        this.f231919h.lock();
    }

    public int lockCount() {
        return this.f231919h.lockCount();
    }

    /* renamed from: mJ */
    public boolean mo94244mJ(String str, int i) {
        return this.f231919h.mo94244mJ(str, i);
    }

    /* renamed from: pM */
    public List<LocalUsageInfo> mo94245pM(int i, C68585h1.C68586a aVar) {
        return (List) mo108949D(Integer.valueOf(i), aVar);
    }

    /* renamed from: q */
    public void mo108953q(String str, MStorageEventData mStorageEventData) {
        C87412m.m108594g(mStorageEventData, "eventData");
        C38166b.m41755b(C29373j1.class, new C38830a(str, mStorageEventData));
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            mo108951Q(iOnStorageChange);
        }
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f231919h.removeLoadedListener(iOnStorageLoaded);
    }

    public int rg0(String str, int i) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (!mo94243l8(str, i)) {
            return ((C68585h1) this.f231908d).rg0(str, i);
        }
        Log.m105924i("MicroMsg.AppBrandCollectionStorageWithCache", "isCollection reorder");
        C78985l lVar = C78983j.f231933a;
        List<T> B0 = C110818d0.m150900B0(mo94245pM(lVar.f231936b, lVar.f231937c));
        ArrayList arrayList = (ArrayList) B0;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            LocalUsageInfo localUsageInfo = (LocalUsageInfo) it.next();
            if (C87412m.m108589b(localUsageInfo.f239040d, str) && localUsageInfo.f239042f == i) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return -1;
        }
        Log.m105924i("MicroMsg.AppBrandCollectionStorageWithCache", "addCollection exist, remove and insert: " + str + " atPos:" + i2);
        arrayList.add((LocalUsageInfo) arrayList.remove(i2));
        return Fq0(B0, 0) ? 0 : -1;
    }

    public List<LocalUsageInfo> tl0(int i, C68585h1.C68586a aVar, int i2) {
        return this.f231919h.tl0(i, aVar, i2);
    }

    public void unlock() {
        this.f231919h.unlock();
    }
}
