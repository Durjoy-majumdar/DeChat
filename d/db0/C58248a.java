package db0;

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
import com.tencent.p014mm.plugin.mmplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.plugin.mmplayer.render.MMTextureViewRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import y62.C23252a;

/* renamed from: db0.a */
public final class C58248a {

    /* renamed from: a */
    public final FrameLayout f166778a;

    /* renamed from: b */
    public String f166779b = "MMSurfaceViewSwitchHelper";

    /* renamed from: c */
    public final ImageView f166780c;

    /* renamed from: d */
    public Bitmap f166781d;

    /* renamed from: e */
    public Bitmap f166782e;

    /* renamed from: f */
    public boolean f166783f;

    /* renamed from: db0.a$a */
    public static final class C58249a implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        public final /* synthetic */ C58248a f166784a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<Bitmap> f166785b;

        public C58249a(C58248a aVar, C8479f0<Bitmap> f0Var) {
            this.f166784a = aVar;
            this.f166785b = f0Var;
        }

        public final void onPixelCopyFinished(int i) {
            String c = this.f166784a.mo82999c();
            Log.m105924i(c, "captureFrame end result:" + i + " isValid:" + this.f166784a.f166783f + '.');
            if (i == 0) {
                C58248a aVar = this.f166784a;
                if (aVar.f166783f) {
                    aVar.f166782e = (Bitmap) this.f166785b.f27484d;
                }
            }
        }
    }

    /* renamed from: db0.a$b */
    public static final class C58250b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58248a f166786d;

        /* renamed from: e */
        public final /* synthetic */ String f166787e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f166788f;

        /* renamed from: g */
        public final /* synthetic */ View f166789g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58250b(C58248a aVar, String str, Bitmap bitmap, View view) {
            super(0);
            this.f166786d = aVar;
            this.f166787e = str;
            this.f166788f = bitmap;
            this.f166789g = view;
        }

        public Object invoke() {
            String c = this.f166786d.mo82999c();
            Log.m105924i(c, "showCoverBitmapInternal " + this.f166787e + " bitmap:" + this.f166788f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f166789g.getWidth(), this.f166789g.getHeight());
            layoutParams.gravity = 17;
            this.f166786d.f166780c.setImageBitmap(this.f166788f);
            View view = this.f166789g;
            if (view instanceof MMTextureViewRender) {
                Matrix transform = ((MMTextureViewRender) view).getTransform((Matrix) null);
                C87412m.m108593f(transform, "renderView.getTransform(null)");
                float[] fArr = new float[9];
                transform.getValues(fArr);
                float f = fArr[0];
                float f2 = fArr[4];
                if (f > 0.0f && f2 > 0.0f) {
                    this.f166786d.f166780c.setPivotX(((float) ((MMTextureViewRender) this.f166789g).getWidth()) / 2.0f);
                    this.f166786d.f166780c.setPivotY(((float) ((MMTextureViewRender) this.f166789g).getHeight()) / 2.0f);
                    this.f166786d.f166780c.setScaleX(f);
                    this.f166786d.f166780c.setScaleY(f2);
                }
            }
            C58248a aVar = this.f166786d;
            aVar.f166778a.addView(aVar.f166780c, layoutParams);
            return C13598b0.f38549a;
        }
    }

    public C58248a(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        this.f166778a = frameLayout;
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        this.f166780c = imageView;
    }

    /* renamed from: a */
    public final void mo82997a(C23252a aVar, Surface surface, Bitmap bitmap) {
        this.f166781d = bitmap;
        if ((aVar instanceof MMSurfaceViewRender ? (MMSurfaceViewRender) aVar : null) == null) {
            String c = mo82999c();
            Log.m105924i(c, "captureFrame return for renderView:" + aVar + '.');
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            String c2 = mo82999c();
            Log.m105924i(c2, "captureFrame return for version:" + i + '.');
            return;
        }
        boolean z = false;
        if (surface != null && !surface.isValid()) {
            z = true;
        }
        if (z) {
            String c3 = mo82999c();
            Log.m105924i(c3, "captureFrame return for surface:" + surface + " isValid:" + surface.isValid() + '.');
            return;
        }
        Log.m105924i(mo82999c(), "captureFrame begin.");
        if (aVar instanceof SurfaceView) {
            try {
                C8479f0 f0Var = new C8479f0();
                T createBitmap = Bitmap.createBitmap(((MMSurfaceViewRender) aVar).getWidth(), ((MMSurfaceViewRender) aVar).getHeight(), Bitmap.Config.ARGB_8888);
                f0Var.f27484d = createBitmap;
                Bitmap bitmap2 = (Bitmap) createBitmap;
                PixelCopy.request((SurfaceView) aVar, createBitmap, new C58249a(this, f0Var), new Handler(Looper.getMainLooper()));
            } catch (Throwable th) {
                Log.m105928w("MMSurfaceViewSwitchHelper", "captureFrame e:" + th);
            }
        } else if (aVar instanceof TextureView) {
            this.f166782e = ((MMSurfaceViewRender) aVar).getBitmap();
        }
    }

    /* renamed from: b */
    public final void mo82998b() {
        C13598b0 b0Var;
        if (this.f166778a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
            C61926c.m72668M(new C58251b(this));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w(mo82999c(), "dismissCoverBitmap ignore captureBitmap:" + this.f166782e + '.');
        }
        this.f166782e = null;
    }

    /* renamed from: c */
    public final String mo82999c() {
        return this.f166779b + '.' + this.f166783f;
    }

    /* renamed from: d */
    public final void mo83000d(View view, Bitmap bitmap, String str) {
        if (bitmap == null) {
            String c = mo82999c();
            Log.m105928w(c, "showCoverBitmapInternal " + str + " return for null.");
            return;
        }
        C61926c.m72668M(new C58250b(this, str, bitmap, view));
    }
}
