package z80;

import a90.C103329a;
import a90.C103331c;
import a90.C103340f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import l90.C109292b;
import n90.C109726b;
import p206nj.C11171e;
import rx3.C13598b0;
import y80.C112405g;

/* renamed from: z80.a */
public final class C112609a extends MMHandler {

    /* renamed from: o */
    public static final /* synthetic */ int f337225o = 0;

    /* renamed from: a */
    public Context f337226a;

    /* renamed from: b */
    public C112405g f337227b;

    /* renamed from: c */
    public final String f337228c = "MicroMsg.BaseCameraHandler";

    /* renamed from: d */
    public Handler f337229d;

    /* renamed from: e */
    public HandlerThread f337230e;

    /* renamed from: f */
    public C32226l<? super Bitmap, C13598b0> f337231f;

    /* renamed from: g */
    public C103340f f337232g;

    /* renamed from: h */
    public float f337233h;

    /* renamed from: i */
    public float f337234i;

    /* renamed from: j */
    public int f337235j;

    /* renamed from: k */
    public int f337236k;

    /* renamed from: l */
    public boolean f337237l = true;

    /* renamed from: m */
    public String f337238m;

    /* renamed from: n */
    public final ImageReader.OnImageAvailableListener f337239n;

    /* renamed from: z80.a$a */
    public static final class C112610a implements ImageReader.OnImageAvailableListener {

        /* renamed from: d */
        public final /* synthetic */ C112609a f337240d;

        /* renamed from: z80.a$a$a */
        public static final class C112611a extends C87413o implements C32226l<Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C112609a f337241d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112611a(C112609a aVar) {
                super(1);
                this.f337241d = aVar;
            }

            public Object invoke(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C87412m.m108594g(bitmap, "image");
                String str = this.f337241d.f337228c;
                Log.m105924i(str, "onImageAvailableListener, image:" + bitmap + ", width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight());
                C32226l<? super Bitmap, C13598b0> lVar = this.f337241d.f337231f;
                if (lVar != null) {
                    C13598b0 invoke = lVar.invoke(bitmap);
                }
                if (C87412m.m108589b(C103331c.f304674c, C103331c.f304672a.mo143135b(1))) {
                    Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureSuccessUseImageBack");
                    C115669n.INSTANCE.mo175913w(1099, 14, 1);
                } else {
                    Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureSuccessUseImageFront");
                    C115669n.INSTANCE.mo175913w(1099, 15, 1);
                }
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageSuccess");
                C115669n.INSTANCE.mo175913w(1099, 16, 1);
                C103340f fVar = this.f337241d.f337232g;
                if (fVar != null) {
                    fVar.mo143201b();
                }
                this.f337241d.f337232g = null;
                return C13598b0.f38549a;
            }
        }

        public C112610a(C112609a aVar) {
            this.f337240d = aVar;
        }

        public final void onImageAvailable(ImageReader imageReader) {
            Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markImageAvailable");
            C115669n.INSTANCE.mo175913w(1099, 13, 1);
            C112609a aVar = this.f337240d;
            C103340f fVar = aVar.f337232g;
            C103331c cVar = C103331c.f304672a;
            Point point = C103331c.f304676e;
            C87412m.m108591d(point);
            Image acquireLatestImage = imageReader.acquireLatestImage();
            C87412m.m108593f(acquireLatestImage, "it.acquireLatestImage()");
            aVar.post(new C103329a(fVar, point, !C87412m.m108589b(C103331c.f304674c, cVar.mo143135b(1)), acquireLatestImage, new C112611a(this.f337240d)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112609a(Looper looper, Context context, C112405g gVar) {
        super(looper);
        C87412m.m108594g(looper, "looper");
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(gVar, "camera");
        this.f337226a = context;
        this.f337227b = gVar;
        int i = C109292b.f327190v0;
        this.f337238m = "auto";
        Log.m105924i("MicroMsg.BaseCameraHandler", "init camera handler");
        HandlerThread handlerThread = new HandlerThread("CameraHandler");
        this.f337230e = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f337230e;
        C87412m.m108591d(handlerThread2);
        this.f337229d = new Handler(handlerThread2.getLooper());
        if (C109726b.m149051f()) {
            this.f337232g = new C103340f(this.f337226a);
        }
        this.f337239n = new C112610a(this);
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        if (message.what != 4354) {
            return;
        }
        if (this.f337235j == 0 || this.f337236k == 0 || C11171e.m11044a(14)) {
            this.f337237l = false;
            this.f337238m = this.f337227b.mo143186x();
            this.f337237l = !this.f337227b.mo143161a();
            String str = this.f337228c;
            Log.m105924i(str, "triggerAutoFocus ret " + this.f337237l);
            return;
        }
        float f = this.f337233h;
        float f2 = this.f337234i;
        int i = this.f337235j;
        int i2 = this.f337236k;
        C112405g gVar = this.f337227b;
        if (gVar == null) {
            Log.m105928w(this.f337228c, "want to auto focus, but camera is null, do nothing");
        } else if (!this.f337237l) {
            Log.m105928w(this.f337228c, "auto focus not back");
        } else {
            this.f337237l = false;
            this.f337238m = gVar.mo143186x();
            this.f337237l = this.f337227b.mo143140A(this.f337227b.mo143167g(f, f2, 1.25f, i, i2), this.f337227b.mo143167g(f, f2, 1.0f, i, i2));
        }
    }
}
