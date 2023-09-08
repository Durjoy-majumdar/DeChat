package vd3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import bp3.C79760s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import p261wl.C15510f;
import vd3.C78399i;

/* renamed from: vd3.r */
public class C78407r extends BitmapDrawable implements C78399i.C78400a {

    /* renamed from: r */
    public static final MMHandler f229742r = new MMHandler(Looper.getMainLooper());

    /* renamed from: d */
    public final Paint f229743d;

    /* renamed from: e */
    public boolean f229744e = false;

    /* renamed from: f */
    public boolean f229745f = false;

    /* renamed from: g */
    public boolean f229746g;

    /* renamed from: h */
    public boolean f229747h;

    /* renamed from: i */
    public final C78409b f229748i;

    /* renamed from: j */
    public String f229749j;

    /* renamed from: n */
    public float f229750n = 1.0f;

    /* renamed from: o */
    public Paint f229751o;

    /* renamed from: p */
    public C78411d f229752p;

    /* renamed from: q */
    public Runnable f229753q;

    /* renamed from: vd3.r$a */
    public class C78408a implements Runnable {
        public C78408a() {
        }

        public void run() {
            try {
                C79760s.m96908a("LazyBmpDrawable.invalidate");
                C78407r.this.invalidateSelf();
            } finally {
                C79760s.m96909b();
            }
        }
    }

    /* renamed from: vd3.r$b */
    public interface C78409b {
        /* renamed from: E0 */
        void mo10724E0(C78407r rVar);

        /* renamed from: O */
        Bitmap mo10725O(String str);

        Bitmap loadBitmap(String str);

        Bitmap ov0(String str, int i, int i2, int i3);

        /* renamed from: qq */
        Bitmap mo10728qq();
    }

    /* renamed from: vd3.r$c */
    public interface C78410c {
        /* renamed from: a */
        boolean mo108339a(String str);
    }

    /* renamed from: vd3.r$d */
    public interface C78411d {
        /* renamed from: X */
        boolean mo108362X(String str);
    }

    /* renamed from: vd3.r$e */
    public interface C78412e extends C15510f {
        C78409b get(String str);
    }

    public C78407r(C78409b bVar, String str) {
        super(bVar.mo10728qq());
        Paint paint = new Paint();
        this.f229743d = paint;
        new Rect();
        new PaintFlagsDrawFilter(0, 3);
        Paint paint2 = new Paint();
        this.f229751o = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f229751o.setFlags(1);
        this.f229751o.setAntiAlias(true);
        new Path();
        this.f229753q = new C78408a();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f229748i = bVar;
        this.f229749j = str;
        bVar.mo10724E0(this);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        C78411d dVar = this.f229752p;
        if ((dVar == null || !dVar.mo108362X(str)) && str != null && str.equals(this.f229749j)) {
            Log.m105927v("MicroMsg.SDK.LazyBitmapDrawable", "notifyChanged :%s", str);
            f229742r.postAtFrontOfQueue(this.f229753q);
        }
    }

    /* renamed from: a */
    public void mo108360a(String str) {
        if (str != null && str.length() > 0 && !str.equals(this.f229749j)) {
            this.f229749j = str;
            f229742r.post(this.f229753q);
        }
    }

    public void draw(Canvas canvas) {
        Bitmap ov02 = this.f229745f ? this.f229748i.ov0(this.f229749j, canvas.getWidth(), canvas.getHeight(), 1) : this.f229746g ? this.f229748i.mo10725O(this.f229749j) : this.f229748i.loadBitmap(this.f229749j);
        if (ov02 == null || ov02.isRecycled()) {
            ov02 = this.f229748i.mo10728qq();
            if (this.f229746g) {
                this.f229747h = true;
            } else {
                this.f229747h = false;
            }
        } else {
            this.f229747h = false;
        }
        Rect bounds = getBounds();
        Rect rect = null;
        if (this.f229750n > 1.0f || this.f229744e) {
            int height = (ov02.getHeight() / 15) / 2;
            int width = (ov02.getWidth() / 15) / 2;
            rect = new Rect(width, height, ov02.getWidth() - width, ov02.getHeight() - height);
        }
        canvas.drawBitmap(ov02, rect, bounds, this.f229743d);
    }

    public void onScrollStateChanged(boolean z) {
        if (z) {
            this.f229746g = true;
        } else if (this.f229746g) {
            this.f229746g = false;
            if (this.f229747h) {
                this.f229747h = false;
                invalidateSelf();
            }
        }
    }

    public C78407r(C78409b bVar, String str, boolean z) {
        super(bVar.mo10728qq());
        Paint paint = new Paint();
        this.f229743d = paint;
        new Rect();
        new PaintFlagsDrawFilter(0, 3);
        Paint paint2 = new Paint();
        this.f229751o = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f229751o.setFlags(1);
        this.f229751o.setAntiAlias(true);
        new Path();
        this.f229753q = new C78408a();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f229744e = z;
        this.f229748i = bVar;
        this.f229749j = str;
        bVar.mo10724E0(this);
    }
}
