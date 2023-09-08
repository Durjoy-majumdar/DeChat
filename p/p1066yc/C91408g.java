package p1066yc;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87557d;
import hm0.C87562h;
import java.util.ArrayList;
import lu3.C34379c;
import p1066yc.C91393a0;
import p1066yc.C91417m;
import zt3.C119157j;

/* renamed from: yc.g */
public abstract class C91408g<TextureImageViewLike extends View & C91417m> implements C87562h<TextureImageViewLike> {

    /* renamed from: e */
    public static C87557d f262121e = new C91409a();

    /* renamed from: f */
    public static Handler f262122f;

    /* renamed from: a */
    public final String f262123a = ("MicroMsg.AppBrand.AbsXWebVideoContainerChannel#" + hashCode());

    /* renamed from: b */
    public SparseArray<TextureView.SurfaceTextureListener> f262124b = new SparseArray<>();

    /* renamed from: c */
    public SparseArray<Pair<Surface, SurfaceTexture>> f262125c = new SparseArray<>();

    /* renamed from: d */
    public boolean f262126d = false;

    /* renamed from: yc.g$a */
    public class C91409a implements C87557d {
        /* renamed from: a */
        public boolean mo122015a() {
            return true;
        }
    }

    /* renamed from: yc.g$b */
    public abstract class C91410b<TextureImageViewLike> implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final TextureImageViewLike f262127d;

        /* renamed from: e */
        public final int f262128e;

        /* renamed from: f */
        public volatile Runnable f262129f;

        public C91410b(TextureImageViewLike textureimageviewlike, Runnable runnable) {
            this.f262127d = textureimageviewlike;
            this.f262128e = textureimageviewlike.hashCode();
            this.f262129f = runnable;
        }

        /* renamed from: a */
        public final void mo125360a(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface;
            Pair pair = C91408g.this.f262125c.get(this.f262128e);
            if (pair == null || pair.second != surfaceTexture) {
                Surface surface2 = new Surface(surfaceTexture);
                Surface surface3 = surface2;
                pair = Pair.create(surface2, surfaceTexture);
                surface = surface3;
            } else {
                surface = (Surface) pair.first;
            }
            if (mo109558c(surface, i, i2)) {
                C91408g.this.f262125c.put(this.f262128e, pair);
            }
        }

        /* renamed from: b */
        public abstract void mo109557b();

        /* renamed from: c */
        public abstract boolean mo109558c(Surface surface, int i, int i2);

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            String str = C91408g.this.f262123a;
            Log.m105919d(str, this.f262127d + " onSurfaceTextureAvailable, surfaceTexture: %s, width: %d, height: %d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
            mo125360a(surfaceTexture, i, i2);
            Runnable runnable = this.f262129f;
            this.f262129f = null;
            if (runnable != null) {
                C91408g gVar = C91408g.this;
                Log.m105924i(gVar.f262123a, "scheduleAfterTransferToTask");
                C91393a0 a = C91393a0.m114669a(surfaceTexture);
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.getClass();
                C34379c<?> w = jVar.mo183892w(runnable, 300, false);
                if (a != null) {
                    C91411h hVar = new C91411h(gVar, w, runnable, a);
                    if (C91408g.f262122f == null) {
                        C91408g.f262122f = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = C91408g.f262122f;
                    synchronized (a) {
                        C91393a0.C91395b bVar = new C91393a0.C91395b(hVar, handler);
                        ((ArrayList) a.f262094b).remove(bVar);
                        ((ArrayList) a.f262094b).add(bVar);
                    }
                }
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            String str = C91408g.this.f262123a;
            Log.m105918d(str, this.f262127d + " onSurfaceTextureDestroyed, surfaceTexture: " + surfaceTexture);
            mo109557b();
            Pair pair = C91408g.this.f262125c.get(this.f262128e);
            if (pair == null) {
                return true;
            }
            C91408g.this.f262125c.remove(this.f262128e);
            ((Surface) pair.first).release();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C91408g gVar = C91408g.this;
            if (!gVar.f262126d) {
                Log.m105928w(gVar.f262123a, "onSurfaceTextureSizeChanged, video is not in pip container");
            } else {
                mo125360a(surfaceTexture, i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: a */
    public void mo109565a(TextureImageViewLike textureimageviewlike, Runnable runnable) {
        String str = this.f262123a;
        Log.m105924i(str, "transferTo, textureImageViewLike: " + textureimageviewlike);
        this.f262126d = true;
        ((C91417m) textureimageviewlike).setImageBitmap((Bitmap) null);
        int hashCode = textureimageviewlike.hashCode();
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f262124b.get(hashCode);
        if (surfaceTextureListener != null) {
            Log.m105928w(this.f262123a, "transferTo, surfaceTextureListener is not null");
            SurfaceTexture surfaceTexture = ((C91417m) textureimageviewlike).getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, textureimageviewlike.getWidth(), textureimageviewlike.getHeight());
            }
            if (runnable != null) {
                Log.m105924i(this.f262123a, "transferTo, run afterTransferToTask when surfaceTextureListener is not null");
                runnable.run();
                return;
            }
            return;
        }
        C91410b g = mo109556g(textureimageviewlike, runnable);
        Log.m105918d(this.f262123a, "transferTo, setSurfaceTextureListener");
        ((C91417m) textureimageviewlike).setSurfaceTextureListener(g);
        this.f262124b.put(hashCode, g);
    }

    /* renamed from: c */
    public C87557d mo109566c() {
        return f262121e;
    }

    /* renamed from: d */
    public void mo109567d(TextureImageViewLike textureimageviewlike) {
        Log.m105918d(this.f262123a, "recycleVideoContainerView");
        this.f262124b.remove(textureimageviewlike.hashCode());
        ((C91417m) textureimageviewlike).setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
    }

    /* renamed from: f */
    public void mo109568f(TextureImageViewLike textureimageviewlike) {
        String str = this.f262123a;
        Log.m105924i(str, "onPlayEndWorkaround, textureImageViewLike: " + textureimageviewlike);
        if (!this.f262126d) {
            Log.m105924i(this.f262123a, "onPlayEndWorkaround, video is not in pip container");
        }
        C91417m mVar = (C91417m) textureimageviewlike;
        Bitmap bitmap = mVar.getBitmap();
        if (bitmap == null) {
            Log.m105928w(this.f262123a, "onPlayEndWorkaround, bitmap is null");
        } else {
            mVar.setImageBitmap(bitmap);
        }
    }

    /* renamed from: g */
    public abstract C91410b mo109556g(TextureImageViewLike textureimageviewlike, Runnable runnable);
}
