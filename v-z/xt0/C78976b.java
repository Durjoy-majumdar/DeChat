package xt0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.util.LinkedHashMap;
import java.util.Set;
import zt3.C119157j;

/* renamed from: xt0.b */
public final class C78976b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C78974a<Object, Object> f231913d;

    /* renamed from: e */
    public final /* synthetic */ String f231914e;

    /* renamed from: f */
    public final /* synthetic */ MStorageEventData f231915f;

    /* renamed from: xt0.b$a */
    public static final class C78977a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78974a<Object, Object> f231916d;

        /* renamed from: e */
        public final /* synthetic */ String f231917e;

        /* renamed from: f */
        public final /* synthetic */ MStorageEventData f231918f;

        public C78977a(C78974a<Object, Object> aVar, String str, MStorageEventData mStorageEventData) {
            this.f231916d = aVar;
            this.f231917e = str;
            this.f231918f = mStorageEventData;
        }

        public final void run() {
            Log.m105924i("MicroMsg.AbsAppBrandStorageWithCache", "notify cache update");
            Set<MStorage.IOnStorageChange> set = this.f231916d.f231910f;
            String str = this.f231917e;
            MStorageEventData mStorageEventData = this.f231918f;
            synchronized (set) {
                for (MStorage.IOnStorageChange onNotifyChange : set) {
                    onNotifyChange.onNotifyChange(str, mStorageEventData);
                }
            }
            this.f231916d.mo108953q(this.f231917e, this.f231918f);
        }
    }

    public C78976b(C78974a<Object, Object> aVar, String str, MStorageEventData mStorageEventData) {
        this.f231913d = aVar;
        this.f231914e = str;
        this.f231915f = mStorageEventData;
    }

    public final void run() {
        Set<C78986o> keySet = ((LinkedHashMap) this.f231913d.f231909e).keySet();
        C78974a<Object, Object> aVar = this.f231913d;
        for (C78986o B : keySet) {
            aVar.mo108948B(B);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C78977a(this.f231913d, this.f231914e, this.f231915f));
    }
}
