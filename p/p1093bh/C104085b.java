package p1093bh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.C106853e;
import me3.C109612c;
import me3.C109623f;
import p520fi.C107549g;

/* renamed from: bh.b */
public abstract class C104085b<T extends C107549g> {

    /* renamed from: n */
    public static final C104085b f307883n = new C104086a();

    /* renamed from: a */
    public C109623f f307884a;

    /* renamed from: b */
    public Matrix f307885b;

    /* renamed from: c */
    public Rect f307886c;

    /* renamed from: d */
    public boolean f307887d;

    /* renamed from: e */
    public boolean f307888e;

    /* renamed from: f */
    public Bitmap f307889f;

    /* renamed from: g */
    public Paint f307890g = new Paint();

    /* renamed from: h */
    public Canvas f307891h = new Canvas();

    /* renamed from: i */
    public Runnable f307892i;

    /* renamed from: j */
    public PointF f307893j = new PointF();

    /* renamed from: k */
    public PointF f307894k = new PointF();

    /* renamed from: l */
    public float[] f307895l = new float[9];

    /* renamed from: m */
    public C104088c f307896m;

    /* renamed from: bh.b$a */
    public class C104086a extends C104085b {
        /* renamed from: k */
        public C104084a mo145700k() {
            return C104084a.DEFAULT;
        }

        /* renamed from: v */
        public void mo145711v(Canvas canvas) {
        }

        /* renamed from: y */
        public void mo145714y() {
        }
    }

    /* renamed from: bh.b$b */
    public class C104087b implements Runnable {
        public C104087b() {
        }

        public void run() {
            C104085b.this.mo145714y();
            C104085b.this.mo145704o();
            C104085b.this.f307892i = null;
        }
    }

    /* renamed from: bh.b$c */
    public interface C104088c {
        /* renamed from: a */
        boolean mo145717a(MotionEvent motionEvent);
    }

    /* renamed from: A */
    public void mo145688A(boolean z) {
        this.f307891h.setBitmap(mo145693d());
        C107549g c = mo145692c();
        if (c != null) {
            c.mo157980i(this.f307891h, z);
            this.f307891h.drawArc(0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, true, this.f307890g);
            return;
        }
        Log.m105924i("MicroMsg.BaseArtist", "updateCache: cache is null");
    }

    /* renamed from: B */
    public void mo145689B(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            this.f307894k.x = motionEvent.getX(1);
            this.f307894k.y = motionEvent.getY(1);
        } else if (motionEvent.getPointerCount() == 1) {
            this.f307893j.x = motionEvent.getX(0);
            this.f307893j.y = motionEvent.getY(0);
        }
        if (motionEvent.getActionMasked() != 6) {
            return;
        }
        if (motionEvent.getPointerCount() <= 1 || 1 - motionEvent.getActionIndex() < 0 || 1 - motionEvent.getActionIndex() >= motionEvent.getPointerCount()) {
            this.f307893j.x = motionEvent.getX(0);
            this.f307893j.y = motionEvent.getY(0);
            return;
        }
        this.f307893j.x = motionEvent.getX(1 - motionEvent.getActionIndex());
        this.f307893j.y = motionEvent.getY(1 - motionEvent.getActionIndex());
    }

    /* renamed from: a */
    public float[] mo145690a(float f, float f2) {
        Matrix matrix = new Matrix(this.f307885b);
        this.f307885b.invert(matrix);
        float[] fArr = {f, f2};
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: b */
    public Rect mo145691b() {
        return ((C109612c) this.f307884a).f328158a.getBaseBoardView().getBoardRect();
    }

    /* renamed from: c */
    public T mo145692c() {
        C109623f fVar = this.f307884a;
        C104084a k = mo145700k();
        C109612c cVar = (C109612c) fVar;
        cVar.getClass();
        ArtistCacheManager a = ArtistCacheManager.m140185a();
        String str = cVar.f328159b.f332927d;
        a.getClass();
        if (TextUtils.isEmpty(str)) {
            if (ArtistCacheManager.f310568c.containsKey(a.f310570a)) {
                return ArtistCacheManager.f310568c.get(a.f310570a).mo148168b(k);
            }
            Log.m105921e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", a.f310570a);
            return null;
        } else if (ArtistCacheManager.f310568c.containsKey(str)) {
            return ArtistCacheManager.f310568c.get(str).mo148168b(k);
        } else {
            Log.m105921e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", str);
            return null;
        }
    }

    /* renamed from: d */
    public Bitmap mo145693d() {
        int i;
        int i2;
        Bitmap bitmap = this.f307889f;
        if (bitmap == null || bitmap.isRecycled()) {
            Rect imageBitmapRect = ((C109612c) this.f307884a).f328158a.getBaseBoardView().getImageBitmapRect();
            if (imageBitmapRect.isEmpty() || !((C109612c) this.f307884a).f328158a.getBaseBoardView().mo157331e()) {
                i = ((C109612c) this.f307884a).f328158a.getBaseBoardView().getBoardRect().width();
                i2 = ((C109612c) this.f307884a).f328158a.getBaseBoardView().getBoardRect().height();
            } else {
                i = imageBitmapRect.width();
                i2 = imageBitmapRect.height();
            }
            if (i <= 0 || i2 <= 0) {
                return null;
            }
            this.f307889f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        }
        return this.f307889f;
    }

    /* renamed from: e */
    public int mo145694e(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return 0;
        }
        int x = (int) (motionEvent.getX(0) - motionEvent.getX(1));
        int y = (int) (motionEvent.getY(0) - motionEvent.getY(1));
        return (int) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: f */
    public int[] mo145695f(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (motionEvent.getPointerCount() > 1) {
            iArr[0] = (int) (motionEvent.getX(0) - motionEvent.getX(1));
            iArr[1] = (int) (motionEvent.getY(0) - motionEvent.getY(1));
        }
        return iArr;
    }

    /* renamed from: g */
    public Matrix mo145696g() {
        return ((C109612c) this.f307884a).f328158a.getBaseBoardView().getMainMatrix();
    }

    /* renamed from: h */
    public float mo145697h() {
        this.f307885b.getValues(this.f307895l);
        float[] fArr = this.f307895l;
        this.f307885b.getValues(fArr);
        return (float) Math.round(Math.atan2((double) fArr[1], (double) this.f307895l[0]) * 57.29577951308232d);
    }

    /* renamed from: i */
    public float mo145698i(Matrix matrix) {
        matrix.getValues(this.f307895l);
        float[] fArr = this.f307895l;
        matrix.getValues(fArr);
        return (float) Math.round(Math.atan2((double) fArr[1], (double) this.f307895l[0]) * 57.29577951308232d);
    }

    /* renamed from: j */
    public float mo145699j() {
        this.f307885b.getValues(this.f307895l);
        float[] fArr = this.f307895l;
        float f = fArr[3];
        this.f307885b.getValues(fArr);
        float f2 = this.f307895l[0];
        return (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
    }

    /* renamed from: k */
    public abstract C104084a mo145700k();

    /* renamed from: l */
    public boolean mo145701l() {
        try {
            return mo145692c().mo157975D1(true) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo145702m(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return Math.abs(this.f307893j.x - motionEvent.getX(0)) > 3.0f || Math.abs(this.f307893j.y - motionEvent.getY(0)) > 3.0f || Math.abs(this.f307894k.x - motionEvent.getX(1)) > 3.0f || Math.abs(this.f307894k.y - motionEvent.getY(1)) > 3.0f;
        }
        if (motionEvent.getPointerCount() == 1) {
            return Math.abs(this.f307893j.x - motionEvent.getX(0)) > 3.0f || Math.abs(this.f307893j.y - motionEvent.getY(0)) > 3.0f;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo145703n() {
        return ((C109612c) this.f307884a).mo160820d().mo145700k() == mo145700k();
    }

    /* renamed from: o */
    public void mo145704o() {
        ((C109612c) this.f307884a).f328158a.getBaseBoardView().postInvalidate();
    }

    /* renamed from: p */
    public void mo145705p() {
        ((C109612c) this.f307884a).f328158a.getBaseFooterView().postInvalidate();
    }

    /* renamed from: q */
    public void mo145706q() {
        Log.m105925i("MicroMsg.BaseArtist" + mo145700k(), "[onAlive] isAlive:%s", Boolean.valueOf(this.f307887d));
        if (!this.f307887d) {
            this.f307887d = true;
            C107549g c = mo145692c();
            if (c != null) {
                c.mo157985z1(false);
                c.mo157977Z(false);
            } else {
                Log.m105921e("MicroMsg.BaseArtist", "[onAlive] type:%s cache is null", mo145700k());
            }
            this.f307889f = mo145693d();
        }
    }

    /* renamed from: r */
    public void mo145707r(C109623f fVar, Matrix matrix, Rect rect) {
        Log.m105924i("MicroMsg.BaseArtist" + mo145700k(), "[onCreate]");
        this.f307888e = true;
        this.f307884a = fVar;
        this.f307885b = matrix;
        this.f307886c = rect;
    }

    /* renamed from: s */
    public void mo145708s(Canvas canvas) {
        Bitmap bitmap = this.f307889f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f307889f, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* renamed from: t */
    public void mo145709t() {
        this.f307888e = false;
        this.f307887d = false;
        Log.m105924i("MicroMsg.BaseArtist" + mo145700k(), "[onDestroy]");
        Bitmap bitmap = this.f307889f;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f307889f.recycle();
        }
    }

    /* renamed from: u */
    public boolean mo145710u(MotionEvent motionEvent) {
        if (!mo145702m(motionEvent)) {
            return false;
        }
        mo145689B(motionEvent);
        return false;
    }

    /* renamed from: v */
    public abstract void mo145711v(Canvas canvas);

    /* renamed from: w */
    public void mo145712w() {
        Log.m105925i("MicroMsg.BaseArtist", "[onFinish] type:%s", mo145700k());
        this.f307887d = false;
        this.f307888e = false;
        C107549g c = mo145692c();
        if (c != null) {
            c.mo157977Z(true);
        } else {
            Log.m105921e("MicroMsg.BaseArtist", "[onFinish] type:%s cache is null", mo145700k());
        }
        Bitmap bitmap = this.f307889f;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f307889f.recycle();
        }
    }

    /* renamed from: x */
    public void mo145713x() {
        Log.m105924i("MicroMsg.BaseArtist" + mo145700k(), "[onSelected] ");
    }

    /* renamed from: y */
    public abstract void mo145714y();

    /* renamed from: z */
    public void mo145715z() {
        if (mo145692c().pop() != null) {
            mo145692c().mo157984z0();
        }
        ((C109612c) this.f307884a).f328158a.removeCallbacks(this.f307892i);
        C106853e eVar = ((C109612c) this.f307884a).f328158a;
        C104087b bVar = new C104087b();
        this.f307892i = bVar;
        eVar.postDelayed(bVar, 66);
    }
}
