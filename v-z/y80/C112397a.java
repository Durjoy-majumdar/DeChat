package y80;

import a90.C103340f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.SurfaceHolder;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.PermissionShowDlgEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import f72.C97842b;
import fy3.C32226l;
import gy3.C87412m;
import i72.C108383i;
import i72.C108393s;
import l90.C109292b;
import nj3.C76879j;
import p903ij.C76359b;
import qo3.C77398g;
import rx3.C13598b0;
import z04.C112551y;
import z80.C112609a;

/* renamed from: y80.a */
public abstract class C112397a implements C112405g {

    /* renamed from: a */
    public Context f336527a;

    /* renamed from: b */
    public final String f336528b = "MicroMsg.BaseCommonCamera";

    /* renamed from: c */
    public final String f336529c = "MicroMsg.MMSightCameraSetting";

    /* renamed from: d */
    public final int f336530d = 2100;

    /* renamed from: e */
    public final C112609a f336531e;

    /* renamed from: f */
    public boolean f336532f;

    /* renamed from: g */
    public boolean f336533g;

    /* renamed from: h */
    public C112398a f336534h;

    /* renamed from: i */
    public boolean f336535i;

    /* renamed from: j */
    public boolean f336536j;

    /* renamed from: k */
    public C108393s f336537k;

    /* renamed from: l */
    public C66557b f336538l;

    /* renamed from: m */
    public C109292b.C61240a f336539m;

    /* renamed from: n */
    public SurfaceTexture f336540n;

    /* renamed from: o */
    public SurfaceHolder f336541o;

    /* renamed from: p */
    public int f336542p;

    /* renamed from: q */
    public Size f336543q;

    /* renamed from: r */
    public Float f336544r;

    /* renamed from: s */
    public Point f336545s;

    /* renamed from: t */
    public int f336546t;

    /* renamed from: u */
    public boolean f336547u;

    /* renamed from: v */
    public int f336548v;

    /* renamed from: w */
    public boolean f336549w;

    /* renamed from: y80.a$a */
    public enum C112398a {
        CAMERA_IS_DEFAULT(-1),
        CAMERA_IS_PREVIEWING(0),
        CAMERA_IS_CAPTURING(1);

        /* access modifiers changed from: public */
        C112398a(int i) {
        }
    }

    public C112397a(Context context) {
        C87412m.m108594g(context, "context");
        this.f336527a = context;
        Looper mainLooper = Looper.getMainLooper();
        C87412m.m108593f(mainLooper, "getMainLooper()");
        this.f336531e = new C112609a(mainLooper, this.f336527a, this);
        this.f336533g = true;
        this.f336534h = C112398a.CAMERA_IS_DEFAULT;
        this.f336535i = true;
        this.f336537k = C108393s.m146851a();
        this.f336538l = C66557b.f191414a;
        this.f336542p = CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
        this.f336546t = -1;
        this.f336548v = -1;
    }

    /* renamed from: B */
    public boolean mo164109B() {
        return this.f336534h == C112398a.CAMERA_IS_PREVIEWING;
    }

    /* renamed from: C */
    public abstract boolean mo143141C();

    /* renamed from: D */
    public final Point mo164110D() {
        if (this.f336543q == null) {
            return C97842b.m126290g(this.f336527a);
        }
        Size size = this.f336543q;
        C87412m.m108591d(size);
        int width = size.getWidth();
        Size size2 = this.f336543q;
        C87412m.m108591d(size2);
        return new Point(width, size2.getHeight());
    }

    /* renamed from: E */
    public abstract Size[] mo143142E();

    /* renamed from: F */
    public boolean mo143143F(int i) {
        try {
            boolean C = mo143141C();
            Point D = mo164110D();
            Size[] E = mo143142E();
            if (E == null) {
                Log.m105920e(this.f336528b, "fuck, preview size null!!");
                return false;
            }
            C108383i.C108387d b = C108383i.m146828b(E, D, i, C);
            if (b.f324531a == null) {
                Log.m105920e(this.f336528b, "fuck, preview size still null!!");
                b = C108383i.m146833g(E, new Point(Math.min(D.x, D.y), Math.max(D.x, D.y)), this.f336530d, C);
            }
            if (b.f324531a == null) {
                Log.m105925i(this.f336528b, "checkMore start %s", b.toString());
                b.f324531a = b.f324534d;
                b.f324532b = b.f324535e;
                b.f324533c = b.f324536f;
            }
            Point point = b.f324531a;
            Size size = new Size(point.x, point.y);
            this.f336537k.f324562c = size.getWidth();
            this.f336537k.f324561b = size.getHeight();
            Point point2 = b.f324533c;
            if (point2 != null) {
                this.f336545s = point2;
            }
            mo143144G(size.getWidth(), size.getHeight());
            String str = this.f336528b;
            Log.m105924i(str, "final set camera preview size: " + size + ", cropSize: " + this.f336545s);
            return true;
        } catch (CameraAccessException e) {
            Log.printErrStackTrace(this.f336528b, e, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", Looper.myLooper(), e.getMessage());
            return false;
        } catch (Exception e2) {
            Log.printErrStackTrace(this.f336528b, e2, "selectNoCropPreviewSize Exception, %s, %s", Looper.myLooper(), e2.getMessage());
            return false;
        }
    }

    /* renamed from: G */
    public abstract boolean mo143144G(int i, int i2);

    /* renamed from: H */
    public void mo164111H(boolean z) {
        this.f336536j = z;
    }

    /* renamed from: I */
    public final void mo164112I() {
        if (!this.f336532f && this.f336527a != null) {
            if (!C112551y.m153809i(Build.MANUFACTURER, "meizu", true) || C76359b.m91785b()) {
                PermissionShowDlgEvent permissionShowDlgEvent = new PermissionShowDlgEvent();
                permissionShowDlgEvent.f264988d.f264990a = 2;
                permissionShowDlgEvent.publish();
                permissionShowDlgEvent.f264989e.getClass();
                C77398g i = C76879j.m92738i(this.f336527a, C0966R.string.j7_, C0966R.string.a3h);
                if (i != null) {
                    i.setCancelable(false);
                    i.setCanceledOnTouchOutside(false);
                    i.show();
                    this.f336532f = true;
                }
            }
        }
    }

    /* renamed from: J */
    public abstract void mo143145J(SurfaceHolder surfaceHolder, boolean z, int i);

    /* renamed from: b */
    public boolean mo143162b(C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(lVar, "dataCallback");
        return false;
    }

    /* renamed from: d */
    public abstract boolean mo143164d(Context context, boolean z);

    public void onDestroy() {
        C112609a aVar = this.f336531e;
        C103340f fVar = aVar.f337232g;
        if (fVar != null) {
            fVar.mo143201b();
        }
        HandlerThread handlerThread = aVar.f337230e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    /* renamed from: q */
    public boolean mo143178q() {
        return false;
    }

    /* renamed from: r */
    public void mo164114r(C109292b.C61240a aVar) {
        C87412m.m108594g(aVar, "deviceConfig");
        this.f336539m = aVar;
    }

    public abstract void release();

    public void setDisplayScreenSize(Size size) {
        this.f336543q = size;
    }

    public boolean switchCamera() {
        if (this.f336540n == null && this.f336541o == null) {
            Log.m105920e(this.f336528b, " do you forget override func startPreview");
            return false;
        } else if (!mo164109B()) {
            Log.m105920e(this.f336528b, " now is cpature image and refuse to switchCamera");
            return false;
        } else {
            release();
            Context context = this.f336527a;
            C87412m.m108591d(context);
            mo143164d(context, !this.f336533g);
            String str = this.f336528b;
            Log.m105924i(str, "useCpuCrop : " + this.f336535i + " , resolutionLimit: " + this.f336542p);
            SurfaceTexture surfaceTexture = this.f336540n;
            if (surfaceTexture == null) {
                SurfaceHolder surfaceHolder = this.f336541o;
                C87412m.m108591d(surfaceHolder);
                mo143145J(surfaceHolder, this.f336535i, this.f336542p);
                return this.f336533g;
            }
            C87412m.m108591d(surfaceTexture);
            mo143188z(surfaceTexture, this.f336535i, this.f336544r, this.f336542p);
            return this.f336533g;
        }
    }
}
