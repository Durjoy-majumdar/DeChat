package p292ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import jo0.C88003e;
import p1066yc.C91408g;
import p292ad.C79516p;

/* renamed from: ad.o */
public class C79514o extends C91408g<TextureImageViewLikeImpl> {

    /* renamed from: g */
    public final /* synthetic */ C88003e f233155g;

    /* renamed from: ad.o$a */
    public class C79515a extends C91408g<TextureImageViewLikeImpl>.b<TextureImageViewLikeImpl> {

        /* renamed from: h */
        public Surface f233156h = null;

        public C79515a(TextureImageViewLikeImpl textureImageViewLikeImpl, Runnable runnable) {
            super(textureImageViewLikeImpl, runnable);
        }

        /* renamed from: b */
        public void mo109557b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
            r0 = r1.f233157i.f233155g.mo122454b(r2);
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo109558c(android.view.Surface r2, int r3, int r4) {
            /*
                r1 = this;
                android.view.Surface r0 = r1.f233156h     // Catch:{ Exception -> 0x0020 }
                if (r0 == 0) goto L_0x0007
                if (r0 != r2) goto L_0x0007
                r2 = 0
            L_0x0007:
                r0 = 1
                if (r2 == 0) goto L_0x0016
                ad.o r0 = p292ad.C79514o.this     // Catch:{ Exception -> 0x0020 }
                jo0.e r0 = r0.f233155g     // Catch:{ Exception -> 0x0020 }
                boolean r0 = r0.mo122454b(r2)     // Catch:{ Exception -> 0x0020 }
                if (r0 == 0) goto L_0x0016
                r1.f233156h = r2     // Catch:{ Exception -> 0x0020 }
            L_0x0016:
                if (r0 == 0) goto L_0x001f
                ad.o r2 = p292ad.C79514o.this     // Catch:{ Exception -> 0x0020 }
                jo0.e r2 = r2.f233155g     // Catch:{ Exception -> 0x0020 }
                r2.mo122455c(r3, r4)     // Catch:{ Exception -> 0x0020 }
            L_0x001f:
                return r0
            L_0x0020:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p292ad.C79514o.C79515a.mo109558c(android.view.Surface, int, int):boolean");
        }
    }

    public C79514o(C79516p.C79517a aVar, C88003e eVar) {
        this.f233155g = eVar;
    }

    /* renamed from: b */
    public void mo109554b(View view, Runnable runnable) {
        String str = this.f262123a;
        Log.m105924i(str, "transferFrom, textureView: " + ((TextureImageViewLikeImpl) view));
        this.f262126d = false;
        Surface surface = this.f233155g.f254610a.f233096g;
        if (surface == null || !surface.isValid()) {
            Log.m105928w(this.f262123a, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                Log.m105924i(this.f262123a, "transferFrom, run afterTransferFromTask when originSurface is invalid");
                runnable.run();
                return;
            }
            return;
        }
        try {
            if (this.f233155g.mo122454b(surface)) {
                C88003e eVar = this.f233155g;
                C79502b bVar = eVar.f254610a;
                eVar.mo122455c(bVar.f233103q, bVar.f233104r);
            }
            if (runnable != null) {
                this.f233155g.f254610a.getClass();
                Log.m105924i(this.f262123a, "transferFrom, run afterTransferFromTask when originSurfaceTexture is null");
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public View mo109555e(Context context) {
        Log.m105918d(this.f262123a, "createVideoContainerView");
        return new TextureImageViewLikeImpl(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public C91408g.C91410b mo109556g(View view, Runnable runnable) {
        return new C79515a((TextureImageViewLikeImpl) view, runnable);
    }
}
