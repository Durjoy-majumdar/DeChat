package com.tencent.p014mm.plugin.appbrand;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.l2 */
public final class C83239l2 {

    /* renamed from: a */
    public final SparseArray<List<C83242c>> f243109a = new SparseArray<>();

    /* renamed from: b */
    public final SparseIntArray f243110b = new SparseIntArray();

    /* renamed from: com.tencent.mm.plugin.appbrand.l2$b */
    public static class C83241b {

        /* renamed from: a */
        public static C83239l2 f243111a = new C83239l2((C83240a) null);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l2$c */
    public interface C83242c {
        /* renamed from: a */
        void mo115476a();
    }

    public C83239l2(C83240a aVar) {
    }

    /* renamed from: a */
    public final void mo115475a(int i, List<C83242c> list) {
        if (this.f243110b.size() > 0) {
            Log.m105925i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify pending : %d", Integer.valueOf(i));
            if (this.f243110b.indexOfKey(i) < 0) {
                Log.m105924i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "not in pending notify");
                return;
            }
            this.f243110b.delete(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).mo115476a();
            }
        }
    }
}
