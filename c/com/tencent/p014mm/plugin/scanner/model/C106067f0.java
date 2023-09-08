package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C51734vs2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.model.f0 */
public final class C106067f0 implements C11385n {

    /* renamed from: d */
    public static final C106067f0 f315807d = new C106067f0();

    /* renamed from: e */
    public static HashMap<Integer, ArrayList<C106068a>> f315808e = new HashMap<>();

    /* renamed from: f */
    public static HashMap<Integer, C42911v> f315809f = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.scanner.model.f0$a */
    public interface C106068a {
        /* renamed from: a */
        void mo24272a(int i, int i2, String str);

        /* renamed from: b */
        void mo24273b(C51734vs2 vs22);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.f0$b */
    public static final class C106069b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f315810d;

        /* renamed from: e */
        public final /* synthetic */ int f315811e;

        /* renamed from: f */
        public final /* synthetic */ int f315812f;

        /* renamed from: g */
        public final /* synthetic */ String f315813g;

        public C106069b(C117747y yVar, int i, int i2, String str) {
            this.f315810d = yVar;
            this.f315811e = i;
            this.f315812f = i2;
            this.f315813g = str;
        }

        public final void run() {
            C117747y yVar = this.f315810d;
            if (!(yVar != null && yVar.getType() == 1812)) {
                return;
            }
            if (this.f315810d.isCanceled()) {
                Log.m105928w("MicroMsg.ScanConfigSyncManager", "alvinluo onSceneEnd updateScanConfig is cancelled and ignore");
                return;
            }
            int i = this.f315811e;
            if (i == 0 && this.f315812f == 0) {
                C117747y yVar2 = this.f315810d;
                C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneScanConfigSync");
                C47465a aVar = ((C42911v) yVar2).f116192e.f127056b.f127083a;
                Integer num = null;
                C51734vs2 vs22 = aVar != null ? (C51734vs2) aVar : null;
                C106067f0 f0Var = C106067f0.f315807d;
                C117747y yVar3 = this.f315810d;
                if (yVar3 instanceof C42911v) {
                    int i2 = ((C42911v) yVar3).f116193f;
                    ArrayList<C106068a> arrayList = C106067f0.f315808e.get(Integer.valueOf(i2));
                    Object[] objArr = new Object[1];
                    if (arrayList != null) {
                        num = Integer.valueOf(arrayList.size());
                    }
                    objArr[0] = num;
                    Log.m105927v("MicroMsg.ScanConfigSyncManager", "alvinluo onSuccess callbackList size: %d", objArr);
                    if (arrayList != null) {
                        for (C106068a b : arrayList) {
                            b.mo24273b(vs22);
                        }
                    }
                    f0Var.mo151624a(i2);
                    return;
                }
                return;
            }
            C106067f0 f0Var2 = C106067f0.f315807d;
            int i3 = this.f315812f;
            String str = this.f315813g;
            C117747y yVar4 = this.f315810d;
            if (yVar4 instanceof C42911v) {
                int i4 = ((C42911v) yVar4).f116193f;
                ArrayList<C106068a> arrayList2 = C106067f0.f315808e.get(Integer.valueOf(i4));
                if (arrayList2 != null) {
                    for (C106068a a : arrayList2) {
                        a.mo24272a(i, i3, str);
                    }
                }
                f0Var2.mo151624a(i4);
            }
        }
    }

    /* renamed from: a */
    public final void mo151624a(int i) {
        Log.m105927v("MicroMsg.ScanConfigSyncManager", "alvinluo removeConfigType: %d", Integer.valueOf(i));
        f315808e.remove(Integer.valueOf(i));
        f315809f.remove(Integer.valueOf(i));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ScanConfigSyncManager", "alvinluo onSceneEnd errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ((C119157j) C119157j.f356862d).mo183876g(new C106069b(yVar, i, i2, str), "ScanConfigSync");
    }
}
