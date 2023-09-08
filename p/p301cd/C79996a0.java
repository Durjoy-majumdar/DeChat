package p301cd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p1066yc.C91408g;

/* renamed from: cd.a0 */
public final class C79996a0 extends C91408g<TextureImageViewLikeImpl> {

    /* renamed from: g */
    public final C80000o f234297g;

    /* renamed from: cd.a0$a */
    public final class C79997a extends C91408g<TextureImageViewLikeImpl>.b<TextureImageViewLikeImpl> {

        /* renamed from: h */
        public Surface f234298h;

        /* renamed from: i */
        public final /* synthetic */ C79996a0 f234299i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79997a(C79996a0 a0Var, TextureImageViewLikeImpl textureImageViewLikeImpl, Runnable runnable) {
            super(textureImageViewLikeImpl, runnable);
            C87412m.m108594g(textureImageViewLikeImpl, "textureImageViewLike");
            this.f234299i = a0Var;
        }

        /* renamed from: b */
        public void mo109557b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
            r0 = r1.f234299i.f234297g.mo110203o(r2);
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo109558c(android.view.Surface r2, int r3, int r4) {
            /*
                r1 = this;
                java.lang.String r0 = "surface"
                gy3.C87412m.m108594g(r2, r0)
                android.view.Surface r0 = r1.f234298h     // Catch:{ Exception -> 0x0026 }
                if (r0 == 0) goto L_0x000d
                if (r0 != r2) goto L_0x000d
                r2 = 0
            L_0x000d:
                r0 = 1
                if (r2 == 0) goto L_0x001c
                cd.a0 r0 = r1.f234299i     // Catch:{ Exception -> 0x0026 }
                cd.o r0 = r0.f234297g     // Catch:{ Exception -> 0x0026 }
                boolean r0 = r0.mo110203o(r2)     // Catch:{ Exception -> 0x0026 }
                if (r0 == 0) goto L_0x001c
                r1.f234298h = r2     // Catch:{ Exception -> 0x0026 }
            L_0x001c:
                if (r0 == 0) goto L_0x0027
                cd.a0 r2 = r1.f234299i     // Catch:{ Exception -> 0x0026 }
                cd.o r2 = r2.f234297g     // Catch:{ Exception -> 0x0026 }
                r2.mo110206p(r3, r4)     // Catch:{ Exception -> 0x0026 }
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p301cd.C79996a0.C79997a.mo109558c(android.view.Surface, int, int):boolean");
        }
    }

    public C79996a0(C80000o oVar) {
        C87412m.m108594g(oVar, "originVideoContainer");
        this.f234297g = oVar;
    }

    /* renamed from: b */
    public void mo109554b(View view, Runnable runnable) {
        TextureImageViewLikeImpl textureImageViewLikeImpl = (TextureImageViewLikeImpl) view;
        C87412m.m108594g(textureImageViewLikeImpl, "textureImageViewLike");
        String str = this.f262123a;
        Log.m105924i(str, "transferFrom, textureView: " + textureImageViewLikeImpl);
        this.f262126d = false;
        Surface surface = this.f234297g.f234301a.f234326h;
        if (surface == null || !surface.isValid()) {
            Log.m105928w(this.f262123a, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        try {
            if (this.f234297g.mo110203o(surface)) {
                C80000o oVar = this.f234297g;
                C80005q qVar = oVar.f234301a;
                oVar.mo110206p(qVar.f234333r, qVar.f234334s);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public View mo109555e(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105918d(this.f262123a, "createVideoContainerView");
        return new TextureImageViewLikeImpl(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public C91408g.C91410b mo109556g(View view, Runnable runnable) {
        TextureImageViewLikeImpl textureImageViewLikeImpl = (TextureImageViewLikeImpl) view;
        C87412m.m108594g(textureImageViewLikeImpl, "textureImageViewLike");
        return new C79997a(this, textureImageViewLikeImpl, runnable);
    }
}
