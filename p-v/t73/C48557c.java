package t73;

import com.tencent.p014mm.sdk.platformtools.Log;
import t73.C48558d;

/* renamed from: t73.c */
public final class C48557c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48558d f129894d;

    /* renamed from: e */
    public final /* synthetic */ C48558d.C48559a f129895e;

    public C48557c(C48558d dVar, C48558d.C48559a aVar) {
        this.f129894d = dVar;
        this.f129895e = aVar;
    }

    public final void run() {
        String str = this.f129894d.f129908B;
        Log.m105925i(str, "onAppBackground delay run isBackground: %s, hashCode: " + this.f129895e.hashCode(), Boolean.valueOf(this.f129895e.f129915e));
        C48558d.C48559a aVar = this.f129895e;
        if (aVar.f129915e) {
            C48558d dVar = aVar.f129916f;
            if (!dVar.f129285v) {
                dVar.pause();
            }
        }
    }
}
