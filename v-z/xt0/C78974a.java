package xt0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: xt0.a */
public abstract class C78974a<DATA, DELEGATE_INTERFACE> {

    /* renamed from: d */
    public DELEGATE_INTERFACE f231908d;

    /* renamed from: e */
    public final Map<C78986o, DATA> f231909e = new LinkedHashMap();

    /* renamed from: f */
    public final Set<MStorage.IOnStorageChange> f231910f = new LinkedHashSet();

    /* renamed from: g */
    public final MStorage.IOnStorageChange f231911g;

    /* renamed from: xt0.a$a */
    public static final class C78975a implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C78974a<DATA, DELEGATE_INTERFACE> f231912d;

        public C78975a(C78974a<DATA, DELEGATE_INTERFACE> aVar) {
            this.f231912d = aVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105924i("MicroMsg.AbsAppBrandStorageWithCache", "storage change eventId=" + mStorageEventData.eventId);
            C78974a<DATA, DELEGATE_INTERFACE> aVar = this.f231912d;
            aVar.getClass();
            if (mStorageEventData.eventId != -1) {
                ((C119157j) C119157j.f356862d).mo183884o(new C78976b(aVar, str, mStorageEventData));
            }
        }
    }

    public C78974a(DELEGATE_INTERFACE delegate_interface) {
        this.f231908d = delegate_interface;
        C78975a aVar = new C78975a(this);
        this.f231911g = aVar;
        mo108952d(aVar);
    }

    /* renamed from: B */
    public DATA mo108948B(C78986o oVar) {
        C87412m.m108594g(oVar, "cacheConfig");
        DATA O = mo108950O(oVar.f231938a);
        synchronized (this.f231909e) {
            Log.m105924i("MicroMsg.AbsAppBrandStorageWithCache", "queryAndCache for config: [" + oVar + ']');
            this.f231909e.put(oVar, O);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return O;
    }

    /* renamed from: D */
    public final DATA mo108949D(Object... objArr) {
        DATA data;
        C87412m.m108594g(objArr, "args");
        C78986o oVar = new C78986o(Arrays.copyOf(objArr, objArr.length));
        synchronized (this.f231909e) {
            data = ((LinkedHashMap) this.f231909e).get(oVar);
        }
        if (data != null) {
            Log.m105924i("MicroMsg.AbsAppBrandStorageWithCache", "cache hit, return cache for config: [" + oVar + ']');
            return data;
        }
        DATA B = mo108948B(oVar);
        Log.m105924i("MicroMsg.AbsAppBrandStorageWithCache", "no cache for config: [" + oVar + "], do query through delegate");
        return B;
    }

    /* renamed from: O */
    public abstract DATA mo108950O(Object[] objArr);

    /* renamed from: Q */
    public final void mo108951Q(MStorage.IOnStorageChange iOnStorageChange) {
        C87412m.m108594g(iOnStorageChange, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f231910f) {
            this.f231910f.remove(iOnStorageChange);
            Log.m105924i("MicroMsg.AbsAppBrandStorageWithCache", "removed: " + this.f231910f.size());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public abstract void mo108952d(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: q */
    public abstract void mo108953q(String str, MStorageEventData mStorageEventData);
}
