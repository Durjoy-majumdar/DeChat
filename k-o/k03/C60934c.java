package k03;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: k03.c */
public final class C60934c {

    /* renamed from: a */
    public final FrameLayout f173556a;

    /* renamed from: b */
    public String f173557b = "MMSurfaceViewSwitchHelper";

    /* renamed from: c */
    public final ImageView f173558c;

    /* renamed from: d */
    public Bitmap f173559d;

    /* renamed from: e */
    public Bitmap f173560e;

    /* renamed from: f */
    public boolean f173561f;

    /* renamed from: k03.c$a */
    public static final class C60935a implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        public final /* synthetic */ C60934c f173562a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<Bitmap> f173563b;

        public C60935a(C60934c cVar, C8479f0<Bitmap> f0Var) {
            this.f173562a = cVar;
            this.f173563b = f0Var;
        }

        public final void onPixelCopyFinished(int i) {
            String d = this.f173562a.mo85888d();
            Log.m105924i(d, "captureFrame end result:" + i + " isValid:" + this.f173562a.f173561f + '.');
            if (i == 0) {
                C60934c cVar = this.f173562a;
                if (cVar.f173561f) {
                    cVar.f173560e = (Bitmap) this.f173563b.f27484d;
                }
            }
        }
    }

    /* renamed from: k03.c$b */
    public static final class C60936b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60934c f173564d;

        /* renamed from: e */
        public final /* synthetic */ String f173565e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f173566f;

        /* renamed from: g */
        public final /* synthetic */ View f173567g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60936b(C60934c cVar, String str, Bitmap bitmap, View view) {
            super(0);
            this.f173564d = cVar;
            this.f173565e = str;
            this.f173566f = bitmap;
            this.f173567g = view;
        }

        public Object invoke() {
            String d = this.f173564d.mo85888d();
            Log.m105924i(d, "showCoverBitmapInternal " + this.f173565e + " bitmap:" + this.f173566f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f173567g.getWidth(), this.f173567g.getHeight());
            layoutParams.gravity = 17;
            this.f173564d.f173558c.setImageBitmap(this.f173566f);
            View view = this.f173567g;
            if (view instanceof MMTextureViewRender) {
                Matrix transform = ((MMTextureViewRender) view).getTransform((Matrix) null);
                C87412m.m108593f(transform, "renderView.getTransform(null)");
                float[] fArr = new float[9];
                transform.getValues(fArr);
                float f = fArr[0];
                float f2 = fArr[4];
                if (f > 0.0f && f2 > 0.0f) {
                    this.f173564d.f173558c.setPivotX(((float) ((MMTextureViewRender) this.f173567g).getWidth()) / 2.0f);
                    this.f173564d.f173558c.setPivotY(((float) ((MMTextureViewRender) this.f173567g).getHeight()) / 2.0f);
                    this.f173564d.f173558c.setScaleX(f);
                    this.f173564d.f173558c.setScaleY(f2);
                }
            }
            C60934c cVar = this.f173564d;
            cVar.f173556a.addView(cVar.f173558c, layoutParams);
            return C13598b0.f38549a;
        }
    }

    public C60934c(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        this.f173556a = frameLayout;
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        this.f173558c = imageView;
    }

    /* renamed from: a */
    public final void mo85885a(C60931a aVar, Surface surface, Bitmap bitmap) {
        C87412m.m108594g(aVar, "renderView");
        this.f173559d = bitmap;
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            String d = mo85888d();
            Log.m105924i(d, "captureFrame return for version:" + i + '.');
            return;
        }
        boolean z = false;
        if (surface != null && !surface.isValid()) {
            z = true;
        }
        if (z) {
            String d2 = mo85888d();
            Log.m105924i(d2, "captureFrame return for surface:" + surface + " isValid:" + surface.isValid() + '.');
            return;
        }
        Log.m105924i(mo85888d(), "captureFrame begin.");
        if (aVar instanceof SurfaceView) {
            try {
                C8479f0 f0Var = new C8479f0();
                T createBitmap = Bitmap.createBitmap(((SurfaceView) aVar).getWidth(), ((SurfaceView) aVar).getHeight(), Bitmap.Config.ARGB_8888);
                f0Var.f27484d = createBitmap;
                Bitmap bitmap2 = (Bitmap) createBitmap;
                PixelCopy.request((SurfaceView) aVar, createBitmap, new C60935a(this, f0Var), new Handler(Looper.getMainLooper()));
            } catch (Throwable th) {
                Log.m105928w("MMSurfaceViewSwitchHelper", "captureFrame e:" + th);
            }
        } else if (aVar instanceof TextureView) {
            this.f173560e = aVar.getBitmap();
        }
    }

    /* renamed from: b */
    public final void mo85886b() {
        String d = mo85888d();
        Log.m105924i(d, "detach captureBitmap:" + this.f173560e + " defaultBitmap:" + this.f173559d);
        this.f173561f = false;
        this.f173559d = null;
        mo85887c();
    }

    /* renamed from: c */
    public final void mo85887c() {
        C13598b0 b0Var;
        try {
            if (this.f173556a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
                C61926c.m72668M(new C60937d(this));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w(mo85888d(), "dismissCoverBitmap ignore captureBitmap:" + this.f173560e + '.');
            }
        } catch (Throwable unused) {
            Log.m105920e(mo85888d(), "dismissCoverBitmap");
        }
        this.f173560e = null;
    }

    /* renamed from: d */
    public final String mo85888d() {
        return this.f173557b + '.' + this.f173561f;
    }

    /* renamed from: e */
    public final void mo85889e(View view) {
        C13598b0 b0Var;
        String str;
        C87412m.m108594g(view, "renderView");
        C13598b0 b0Var2 = null;
        if (this.f173556a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
            Log.m105928w(mo85888d(), "showCoverBitmap return for duplicated.");
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Bitmap bitmap = this.f173560e;
            if (bitmap != null) {
                mo85890f(view, bitmap, " captureFrame success.");
                b0Var2 = C13598b0.f38549a;
            }
            if (b0Var2 == null) {
                Bitmap bitmap2 = this.f173559d;
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    str = "captureFrame fail.";
                } else {
                    str = "version:" + i;
                }
                mo85890f(view, bitmap2, str);
            }
        }
    }

    /* renamed from: f */
    public final void mo85890f(View view, Bitmap bitmap, String str) {
        if (bitmap == null) {
            String d = mo85888d();
            Log.m105928w(d, "showCoverBitmapInternal " + str + " return for null.");
            return;
        }
        C61926c.m72668M(new C60936b(this, str, bitmap, view));
    }
}
