package il2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import il2.C98760e;
import rx3.C13598b0;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;

/* renamed from: il2.i */
public final class C98766i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98762f f289571d;

    /* renamed from: e */
    public final /* synthetic */ long f289572e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C98760e.C98761a, C13598b0> f289573f;

    /* renamed from: g */
    public final /* synthetic */ C101647f f289574g;

    public C98766i(C98762f fVar, long j, C32226l<? super C98760e.C98761a, C13598b0> lVar, C101647f fVar2) {
        this.f289571d = fVar;
        this.f289572e = j;
        this.f289573f = lVar;
        this.f289574g = fVar2;
    }

    public final void run() {
        String str;
        C98760e.C98761a remove = this.f289571d.f289564d.remove(Long.valueOf(this.f289572e));
        if (remove != null) {
            C101647f fVar = this.f289574g;
            C101645e eVar = remove.f289562a;
            if (eVar == null || (str = eVar.f297535d) == null) {
                str = "";
            }
            fVar.f297553g = str;
        } else {
            remove = null;
        }
        this.f289573f.invoke(remove);
        C101648g remove2 = this.f289571d.f289565e.remove(Long.valueOf(this.f289572e));
        Log.m105925i("MicroMsg.AiScanImageSceneUploader", "onScanSuccess session: %d, callback: %s", Long.valueOf(this.f289572e), remove2);
        if (remove2 != null) {
            remove2.mo33401c(this.f289572e, this.f289574g);
        }
    }
}
