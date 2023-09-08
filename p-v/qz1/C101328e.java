package qz1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: qz1.e */
public class C101328e extends C101325b {

    /* renamed from: A */
    public Resources f296843A;

    /* renamed from: B */
    public long f296844B = 0;

    /* renamed from: C */
    public final Runnable f296845C = new C101329a();

    /* renamed from: D */
    public final Runnable f296846D = new C101330b();

    /* renamed from: d */
    public volatile boolean f296847d = false;

    /* renamed from: e */
    public int f296848e;

    /* renamed from: f */
    public int f296849f;

    /* renamed from: g */
    public int[] f296850g;

    /* renamed from: h */
    public int f296851h = 0;

    /* renamed from: i */
    public Bitmap f296852i = null;

    /* renamed from: j */
    public int f296853j;

    /* renamed from: n */
    public int f296854n;

    /* renamed from: o */
    public boolean f296855o = false;

    /* renamed from: p */
    public boolean f296856p = true;

    /* renamed from: q */
    public boolean f296857q = true;

    /* renamed from: r */
    public String f296858r;

    /* renamed from: s */
    public int f296859s = 0;

    /* renamed from: t */
    public float f296860t = 1.0f;

    /* renamed from: u */
    public float f296861u = 1.0f;

    /* renamed from: v */
    public boolean f296862v;

    /* renamed from: w */
    public final Rect f296863w = new Rect();

    /* renamed from: x */
    public final Paint f296864x = new Paint(6);

    /* renamed from: y */
    public MMHandler f296865y = new MMHandler(Looper.getMainLooper());

    /* renamed from: z */
    public Context f296866z;

    /* renamed from: qz1.e$a */
    public class C101329a implements Runnable {
        public C101329a() {
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            C101328e eVar = C101328e.this;
            if (uptimeMillis >= eVar.f296844B) {
                eVar.invalidateSelf();
            }
        }
    }

    /* renamed from: qz1.e$b */
    public class C101330b implements Runnable {
        public C101330b() {
        }

        public void run() {
            C101328e.this.getClass();
        }
    }

    public C101328e(Context context, boolean z, boolean z2, boolean z3, int i, int[] iArr, String str) {
        this.f296866z = context;
        this.f296843A = context.getResources();
        this.f296855o = z;
        this.f296856p = z2;
        this.f296857q = z3;
        this.f296858r = str;
        this.f296849f = i;
        this.f296850g = iArr;
        if (z) {
            this.f296852i = mo140817e(i);
        } else if (!z2) {
            this.f296852i = mo140817e(mo140818f(str));
        } else {
            this.f296852i = mo140817e(iArr[0]);
        }
        Bitmap bitmap = this.f296852i;
        if (bitmap != null) {
            this.f296853j = bitmap.getWidth();
            this.f296854n = this.f296852i.getHeight();
        } else {
            this.f296853j = 1;
            this.f296854n = 1;
        }
        if (this.f296850g.length == 3) {
            this.f296848e = 300;
        } else {
            this.f296848e = 100;
        }
        this.f296859s = 0;
    }

    /* renamed from: a */
    public void mo35279a() {
    }

    /* renamed from: b */
    public void mo35280b() {
    }

    /* renamed from: c */
    public void mo35281c() {
    }

    /* renamed from: d */
    public void mo35282d() {
    }

    public void draw(Canvas canvas) {
        if (this.f296862v) {
            this.f296863w.set(getBounds());
            this.f296860t = ((float) this.f296863w.width()) / ((float) this.f296853j);
            this.f296861u = ((float) this.f296863w.height()) / ((float) this.f296854n);
            this.f296862v = false;
        }
        if (this.f296864x.getShader() == null) {
            canvas.scale(this.f296860t, this.f296861u);
            if (this.f296855o) {
                Bitmap e = mo140817e(this.f296849f);
                this.f296852i = e;
                if (e != null && !e.isRecycled()) {
                    canvas.drawBitmap(this.f296852i, 0.0f, 0.0f, this.f296864x);
                }
            } else if (!this.f296856p) {
                Bitmap e2 = mo140817e(mo140818f(this.f296858r));
                this.f296852i = e2;
                if (e2 != null && !e2.isRecycled()) {
                    canvas.drawBitmap(this.f296852i, 0.0f, 0.0f, this.f296864x);
                }
            } else {
                Bitmap e3 = mo140817e(this.f296850g[this.f296851h]);
                this.f296852i = e3;
                if (e3 != null && !e3.isRecycled()) {
                    canvas.drawBitmap(this.f296852i, 0.0f, 0.0f, this.f296864x);
                }
                int i = this.f296851h + 1;
                this.f296851h = i;
                int i2 = this.f296859s;
                if (i2 < 3) {
                    if (i >= this.f296850g.length) {
                        this.f296851h = 0;
                        if (!this.f296857q) {
                            this.f296859s = 0;
                        } else {
                            this.f296859s = i2 + 1;
                        }
                    }
                    Runnable runnable = this.f296845C;
                    long j = (long) this.f296848e;
                    this.f296844B = SystemClock.uptimeMillis() + j;
                    MMHandler mMHandler = this.f296865y;
                    if (mMHandler != null) {
                        mMHandler.postDelayed(runnable, j);
                        return;
                    }
                    return;
                }
                this.f296856p = false;
                Runnable runnable2 = this.f296845C;
                long j2 = (long) this.f296848e;
                this.f296844B = SystemClock.uptimeMillis() + j2;
                MMHandler mMHandler2 = this.f296865y;
                if (mMHandler2 != null) {
                    mMHandler2.postDelayed(runnable2, j2);
                }
                Runnable runnable3 = this.f296846D;
                this.f296844B = SystemClock.uptimeMillis() + 0;
                MMHandler mMHandler3 = this.f296865y;
                if (mMHandler3 != null) {
                    mMHandler3.postDelayed(runnable3, 0);
                }
            }
        } else {
            Log.m105924i("MicroMsg.GIF.MMGIFGameDrawable", "shader is not null.");
            canvas.drawRect(this.f296863w, this.f296864x);
        }
    }

    /* renamed from: e */
    public Bitmap mo140817e(int i) {
        return BitmapFactory.decodeResource(this.f296843A, i);
    }

    /* renamed from: f */
    public int mo140818f(String str) {
        int identifier = this.f296843A.getIdentifier(str.split("\\.")[0], "drawable", this.f296866z.getPackageName());
        Log.m105919d("MicroMsg.GIF.MMGIFGameDrawable", "getResouceIdByName %s, %s, %s", str, this.f296866z.getPackageName(), Integer.valueOf(identifier));
        return identifier;
    }

    public void finalize() {
        super.finalize();
    }

    public int getIntrinsicHeight() {
        return this.f296854n;
    }

    public int getIntrinsicWidth() {
        return this.f296853j;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f296847d;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f296862v = true;
    }

    public void setAlpha(int i) {
        this.f296864x.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f296864x.setColorFilter(colorFilter);
    }

    public void start() {
        this.f296847d = true;
        this.f296865y.post(this.f296845C);
    }

    public void stop() {
        this.f296847d = false;
    }
}
