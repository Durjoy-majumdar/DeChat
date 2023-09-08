package k90;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j90.C108668f;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import u80.C111139a;

/* renamed from: k90.d */
public final class C108970d extends C108965b {

    /* renamed from: k90.d$a */
    public static final class C108971a extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110777a f326416d;

        /* renamed from: e */
        public final /* synthetic */ C108970d f326417e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108971a(C110777a aVar, C108970d dVar) {
            super(1);
            this.f326416d = aVar;
            this.f326417e = dVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((SurfaceTexture) obj, LocaleUtil.ITALIAN);
            C110777a aVar = this.f326416d;
            C110194c j = aVar.mo157954j();
            int i = j != null ? j.f329652e : -1;
            aVar.f331388m = i;
            C111139a aVar2 = aVar.f331382g;
            if (aVar2 != null) {
                aVar2.mo159578p(i);
            }
            this.f326417e.f326402a.requestRender();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108970d(C108668f fVar) {
        super(fVar);
        C87412m.m108594g(fVar, "view");
    }

    /* renamed from: i */
    public void mo160070i(C110777a aVar) {
        C87412m.m108594g(aVar, "renderer");
        super.mo160070i(aVar);
        aVar.f331392q = new C108971a(aVar, this);
        String str = this.f326403b;
        Log.m105924i(str, "setPreviewRenderer: " + aVar.hashCode());
    }
}
