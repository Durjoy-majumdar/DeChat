package nm0;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.report.model.C84158m;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import p329d3.C86167d;
import rx3.C13598b0;

/* renamed from: nm0.a */
public final class C89018a {

    /* renamed from: a */
    public final SparseArray<C89024c> f256620a = new SparseArray<>();

    /* renamed from: b */
    public final C89019a f256621b = new C89019a();

    /* renamed from: nm0.a$a */
    public static final class C89019a implements C86167d<C89024c> {

        /* renamed from: a */
        public final ConcurrentLinkedDeque<C89024c> f256622a = new ConcurrentLinkedDeque<>();
    }

    /* renamed from: a */
    public final void mo123388a() {
        this.f256621b.f256622a.clear();
        SparseArray<C89024c> sparseArray = this.f256620a;
        synchronized (sparseArray) {
            sparseArray.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public final void mo123389b(int i, String str) {
        String str2;
        C89024c cVar;
        C87412m.m108594g(str, "ret");
        SparseArray<C89024c> sparseArray = this.f256620a;
        synchronized (sparseArray) {
            str2 = null;
            cVar = sparseArray.get(i, (Object) null);
            if (cVar != null) {
                sparseArray.remove(i);
            }
        }
        C89024c cVar2 = cVar;
        if (cVar2 != null) {
            long currentTicks = Util.currentTicks() - cVar2.f256631d;
            C82554k kVar = cVar2.f256628a;
            if (kVar != null) {
                str2 = kVar.getAppId();
            }
            String str3 = cVar2.f256632e;
            String e = cVar2.f256629b.mo114779e();
            String str4 = cVar2.f256630c;
            int i2 = cVar2.f256633f;
            Set<String> set = C84158m.f245696a;
            if (!Util.isNullOrNil(str2)) {
                C84158m.C84162c cVar3 = (C84158m.C84162c) ((ConcurrentLinkedQueue) C84158m.f245698c.f245710a).poll();
                if (cVar3 == null) {
                    cVar3 = new C84158m.C84162c();
                }
                cVar3.f245703d = str2;
                cVar3.f245704e = str3;
                cVar3.f245705f = e;
                cVar3.f245706g = str4;
                cVar3.f245707h = i2;
                cVar3.f245708i = currentTicks;
                cVar3.f245709j = str;
                ((AbstractExecutorService) C84158m.f245697b).submit(cVar3);
            }
            C89019a aVar = this.f256621b;
            aVar.getClass();
            aVar.f256622a.offer(cVar2);
        }
    }
}
