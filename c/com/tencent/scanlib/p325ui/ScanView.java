package com.tencent.scanlib.p325ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.stubs.logger.Log;
import ht3.C108258a;
import ht3.C108261e;
import ht3.C108264l;
import ht3.C108265m;
import ht3.C108266p;
import ht3.C108267t;
import ht3.C21001c;
import ht3.C21003d;
import ht3.C21005g;
import ht3.C21007i;
import ht3.C21009k;
import ht3.C21010n;
import ht3.C21012o;
import ht3.C21014q;
import ht3.C21015r;
import ht3.C21017s;

/* renamed from: com.tencent.scanlib.ui.ScanView */
public abstract class ScanView extends FrameLayout implements Camera.PreviewCallback, Camera.AutoFocusCallback, TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public TextureView f56969d;

    /* renamed from: e */
    public C108267t f56970e;

    /* renamed from: f */
    public SurfaceTexture f56971f;

    /* renamed from: g */
    public int f56972g;

    /* renamed from: h */
    public long f56973h;

    /* renamed from: i */
    public long f56974i;

    /* renamed from: j */
    public C20008f f56975j = new C20008f(Looper.myLooper());

    /* renamed from: n */
    public C20007e f56976n = new C20007e(Looper.myLooper());

    /* renamed from: com.tencent.scanlib.ui.ScanView$b */
    public class C20001b implements C108261e.C108262a {
        public C20001b() {
        }

        /* renamed from: a */
        public void mo24458a() {
            ScanView.this.mo24382k(0);
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanView$c */
    public class C20002c implements C21001c.C21002a {

        /* renamed from: a */
        public final /* synthetic */ int f56978a;

        /* renamed from: b */
        public final /* synthetic */ int f56979b;

        /* renamed from: com.tencent.scanlib.ui.ScanView$c$a */
        public class C20003a implements C108261e.C108262a {
            public C20003a() {
            }

            /* renamed from: a */
            public void mo24458a() {
                ScanView.this.mo24382k(0);
            }
        }

        public C20002c(int i, int i2) {
            this.f56978a = i;
            this.f56979b = i2;
        }

        /* renamed from: a */
        public void mo24425a() {
            ((C108258a) ScanView.this.f56970e).mo158651m(new Point(this.f56978a, this.f56979b));
            ScanView.this.mo27898i(new C20003a());
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanView$d */
    public class C20004d implements C21003d.C21004a {

        /* renamed from: com.tencent.scanlib.ui.ScanView$d$a */
        public class C20005a implements C108261e.C108262a {
            public C20005a() {
            }

            /* renamed from: a */
            public void mo24458a() {
                ScanView.this.mo24382k(0);
            }
        }

        public C20004d() {
        }

        /* renamed from: a */
        public void mo24438a() {
            ((C108258a) ScanView.this.f56970e).mo158651m(new Point(ScanView.this.f56969d.getWidth(), ScanView.this.f56969d.getHeight()));
            ScanView.this.mo27898i(new C20005a());
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanView$a */
    public class C20006a implements C108261e.C108262a {

        /* renamed from: a */
        public final /* synthetic */ C108261e.C108262a f56984a;

        public C20006a(C108261e.C108262a aVar) {
            this.f56984a = aVar;
        }

        /* renamed from: a */
        public void mo24458a() {
            float f;
            float f2;
            int i;
            if (((C108258a) ScanView.this.f56970e).f324140b && ((C108258a) ScanView.this.f56970e).f324141c) {
                ScanView scanView = ScanView.this;
                if (scanView.f56971f != null) {
                    TextureView textureView = scanView.f56969d;
                    Point point = ((C108258a) scanView.f56970e).f324142d;
                    Point point2 = new Point(ScanView.this.f56969d.getWidth(), ScanView.this.f56969d.getHeight());
                    scanView.getClass();
                    Log.m106505i("ScanView", "from " + point + " to " + point2);
                    Matrix matrix = new Matrix();
                    scanView.f56969d.getTransform(matrix);
                    matrix.reset();
                    Log.m106505i("ScanView", "before matrix " + matrix);
                    if (!point.equals(point2)) {
                        C108258a aVar = (C108258a) scanView.f56970e;
                        int i2 = aVar.f324147i;
                        Point point3 = aVar.f324144f;
                        int i3 = point3.x;
                        int i4 = point2.x;
                        int i5 = (i3 - i4) / 2;
                        int i6 = point3.y;
                        int i7 = point2.y;
                        int i8 = (i6 - i7) / 2;
                        if (i2 % 180 != 0) {
                            f2 = (((float) i4) * 1.0f) / ((float) point.y);
                            f = (((float) i7) * 1.0f) / ((float) point.x);
                            i = (i6 - i4) / 2;
                            i8 = (i3 - i7) / 2;
                        } else {
                            f2 = (((float) i4) * 1.0f) / ((float) point.x);
                            int i9 = i5;
                            f = (((float) i7) * 1.0f) / ((float) point.y);
                            i = i9;
                        }
                        float max = Math.max(f2, f);
                        Log.m106506i("ScanView", "scaleX %f, scaleY %f, scale %f, dx %d, dy %d", Float.valueOf(f2), Float.valueOf(f), Float.valueOf(max), Integer.valueOf(i), Integer.valueOf(i8));
                        matrix.preScale(1.0f / f2, 1.0f / f);
                        matrix.postScale(max, max);
                        matrix.postTranslate((float) (-i), (float) (-i8));
                        Log.m106505i("ScanView", "after matrix " + matrix);
                    }
                    textureView.setTransform(matrix);
                    C108261e.C108262a aVar2 = this.f56984a;
                    if (aVar2 != null) {
                        aVar2.mo24458a();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanView$e */
    public class C20007e extends Handler {
        public C20007e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ScanView.this.f56974i = System.currentTimeMillis();
            if (((C108258a) ScanView.this.f56970e).f324141c) {
                if (!"auto".equals(((C108258a) ScanView.this.f56970e).mo158642d(true))) {
                    ((C108258a) ScanView.this.f56970e).mo158649k("auto");
                }
                ScanView scanView = ScanView.this;
                C108258a aVar = (C108258a) scanView.f56970e;
                if (aVar.f324139a != null && aVar.f324141c) {
                    try {
                        aVar.f324139a.autoFocus(scanView);
                    } catch (Exception e) {
                        Log.m106513w("BaseScanCamera", "autoFocus() " + e.getMessage());
                    }
                }
                Log.m106505i("ScanView", "do auto focus");
            }
        }
    }

    /* renamed from: com.tencent.scanlib.ui.ScanView$f */
    public class C20008f extends Handler {
        public C20008f(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ScanView.this.f56973h = System.currentTimeMillis();
            Log.m106505i("ScanView", "take one shot");
            if (((C108258a) ScanView.this.f56970e).f324141c) {
                ScanView scanView = ScanView.this;
                ((C108258a) scanView.f56970e).mo158653o(scanView);
            }
        }
    }

    public ScanView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo27895a() {
        Log.m106505i("ScanView", "try close camera");
        if (((C108258a) this.f56970e).f324140b) {
            C21017s a = C21017s.m23187a();
            a.f59486a.submit(new C21014q(a, new C21005g(this.f56970e)));
        }
    }

    /* renamed from: b */
    public void mo24370b() {
        this.f56970e = new C108258a();
    }

    /* renamed from: c */
    public void mo27896c(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.f56974i;
        long j2 = (long) 1000;
        if (currentTimeMillis > j2) {
            this.f56976n.removeMessages(0);
            this.f56976n.sendEmptyMessageDelayed(0, j);
            return;
        }
        this.f56976n.removeMessages(0);
        this.f56976n.sendEmptyMessageDelayed(0, j + (j2 - currentTimeMillis));
    }

    /* renamed from: d */
    public void mo24371d() {
        TextureView textureView = new TextureView(getContext());
        this.f56969d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.f56969d, new FrameLayout.LayoutParams(-1, -1));
        mo24370b();
        this.f56972g = getResources().getConfiguration().orientation;
        mo24374g((C21001c.C21002a) null);
    }

    /* renamed from: e */
    public void mo24372e() {
        Log.m106505i("ScanView", "onPause");
    }

    /* renamed from: f */
    public void mo24373f() {
        Log.m106505i("ScanView", "onResume");
    }

    /* renamed from: g */
    public void mo24374g(C21001c.C21002a aVar) {
        Log.m106505i("ScanView", "try open camera");
        if (!((C108258a) this.f56970e).f324140b) {
            Log.m106505i("ScanView", "camera is not open");
            int rotation = ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
            C21017s a = C21017s.m23187a();
            a.f59486a.submit(new C21010n(a, new C21007i(this.f56970e, rotation), aVar));
            return;
        }
        Log.m106505i("ScanView", "camera is already open!");
        if (aVar != null) {
            aVar.mo24425a();
        }
    }

    /* renamed from: h */
    public void mo27897h(C21003d.C21004a aVar) {
        int rotation = ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        Log.m106505i("ScanView", "try reopen camera " + rotation);
        C21017s a = C21017s.m23187a();
        a.f59486a.submit(new C21015r(a, new C21009k(this.f56970e, rotation), aVar));
    }

    /* renamed from: i */
    public void mo27898i(C108261e.C108262a aVar) {
        Log.m106505i("ScanView", "try start preview");
        if (((C108258a) this.f56970e).f324140b && !((C108258a) this.f56970e).f324141c && this.f56971f != null) {
            C21017s a = C21017s.m23187a();
            a.f59486a.submit(new C21012o(a, new C108264l(this.f56970e, this.f56971f), new C20006a(aVar)));
        }
    }

    /* renamed from: j */
    public void mo24381j() {
        Log.m106505i("ScanView", "try stop preview");
        if (((C108258a) this.f56970e).f324140b) {
            C21017s a = C21017s.m23187a();
            a.f59486a.submit(new C108266p(a, new C108265m(this.f56970e)));
        }
    }

    /* renamed from: k */
    public void mo24382k(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.f56973h;
        long j2 = (long) 80;
        if (currentTimeMillis > j2) {
            this.f56975j.removeMessages(0);
            this.f56975j.sendEmptyMessageDelayed(0, j);
            return;
        }
        this.f56975j.removeMessages(0);
        this.f56975j.sendEmptyMessageDelayed(0, j + (j2 - currentTimeMillis));
    }

    public void onAutoFocus(boolean z, Camera camera) {
        Log.m106506i("ScanView", "onAutoFocus %s", Boolean.valueOf(z));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m106506i("ScanView", "onConfigurationChanged %d,%d", Integer.valueOf(configuration.orientation), Integer.valueOf(this.f56972g));
        int i = configuration.orientation;
        if (i != this.f56972g && this.f56970e != null) {
            this.f56972g = i;
            mo27897h(new C20004d());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo24381j();
        mo27895a();
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f56973h = 0;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m106506i("ScanView", "surface available, %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f56971f = surfaceTexture;
        if (((C108258a) this.f56970e).f324140b) {
            ((C108258a) this.f56970e).mo158651m(new Point(i, i2));
            mo27898i(new C20001b());
            return;
        }
        mo24374g(new C20002c(i, i2));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m106505i("ScanView", "surface destroyed");
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m106506i("ScanView", "surface size changed, %d %d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public ScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
