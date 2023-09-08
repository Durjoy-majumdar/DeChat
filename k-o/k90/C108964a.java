package k90;

import android.opengl.EGL14;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import s80.C110777a;

/* renamed from: k90.a */
public final class C108964a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108965b f326398d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f326399e;

    /* renamed from: f */
    public final /* synthetic */ boolean f326400f;

    /* renamed from: g */
    public final /* synthetic */ int f326401g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108964a(C108965b bVar, C32224a<C13598b0> aVar, boolean z, int i) {
        super(0);
        this.f326398d = bVar;
        this.f326399e = aVar;
        this.f326400f = z;
        this.f326401g = i;
    }

    public Object invoke() {
        C108965b bVar = this.f326398d;
        C110777a aVar = bVar.f326404c;
        boolean z = true;
        if (aVar == null || !aVar.f331394s) {
            z = false;
        }
        if (z) {
            C32224a<C13598b0> aVar2 = this.f326399e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else {
            String str = bVar.f326403b;
            Log.printInfoStack(str, "initRender, generateExternalTexture: " + this.f326400f, new Object[0]);
            C110777a aVar3 = this.f326398d.f326404c;
            if (aVar3 != null) {
                aVar3.mo157955k(this.f326400f);
            }
            C108965b bVar2 = this.f326398d;
            C110777a aVar4 = bVar2.f326404c;
            if (aVar4 != null) {
                aVar4.f331389n = this.f326401g;
            }
            bVar2.f326405d = EGL14.eglGetCurrentContext();
            C32224a<C13598b0> aVar5 = this.f326399e;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        return C13598b0.f38549a;
    }
}
