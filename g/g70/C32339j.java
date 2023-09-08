package g70;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import h70.C87459d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import zt3.C119157j;

@C86522b
/* renamed from: g70.j */
public final class C32339j extends C86301e implements C87459d {

    /* renamed from: d */
    public MultiProcessMMKV f85831d;

    /* renamed from: e */
    public final HashMap<String, WeakReference<C87164i>> f85832e = new HashMap<>();

    /* renamed from: g70.j$a */
    public static final class C32340a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32339j f85833d;

        public C32340a(C32339j jVar) {
            this.f85833d = jVar;
        }

        public final void run() {
            C32339j jVar = this.f85833d;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MagicSclFrameSetManagerService_Report");
            mmkv.clearAll();
            jVar.f85831d = mmkv;
        }
    }

    /* renamed from: fc */
    public void mo58571fc(String str) {
        C87412m.m108594g(str, "id");
        MultiProcessMMKV multiProcessMMKV = this.f85831d;
        if (multiProcessMMKV != null) {
            multiProcessMMKV.putLong(str, System.currentTimeMillis());
        }
    }

    public void ij0(C87164i iVar) {
        C87412m.m108594g(iVar, "frameSet");
        this.f85832e.remove(iVar.f252786b);
    }

    /* renamed from: nm */
    public Integer mo58573nm(String str) {
        C87412m.m108594g(str, "id");
        MultiProcessMMKV multiProcessMMKV = this.f85831d;
        long j = multiProcessMMKV != null ? multiProcessMMKV.getLong(str, 0) : 0;
        if (j <= 0) {
            return null;
        }
        MultiProcessMMKV multiProcessMMKV2 = this.f85831d;
        if (multiProcessMMKV2 != null) {
            multiProcessMMKV2.remove(str);
        }
        return Integer.valueOf((int) (System.currentTimeMillis() - j));
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        ((C119157j) C119157j.f356862d).mo183884o(new C32340a(this));
    }

    /* renamed from: uo */
    public C87164i mo58574uo(String str) {
        C87412m.m108594g(str, "id");
        WeakReference weakReference = this.f85832e.get(str);
        if (weakReference != null) {
            return (C87164i) weakReference.get();
        }
        return null;
    }

    public C87164i ye0(C87164i iVar) {
        C87412m.m108594g(iVar, "frameSet");
        if (!this.f85832e.containsKey(iVar.f252786b)) {
            this.f85832e.put(iVar.f252786b, new WeakReference(iVar));
        }
        WeakReference weakReference = this.f85832e.get(iVar.f252786b);
        C87164i iVar2 = weakReference != null ? (C87164i) weakReference.get() : null;
        return iVar2 == null ? iVar : iVar2;
    }
}
