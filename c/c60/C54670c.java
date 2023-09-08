package c60;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import p196ln.C76705f;
import rx3.C13598b0;

/* renamed from: c60.c */
public final class C54670c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f153221d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f153222e;

    /* renamed from: f */
    public final /* synthetic */ int f153223f;

    /* renamed from: c60.c$a */
    public static final class C54671a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f153224d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f153225e;

        public C54671a(C32226l<? super Bitmap, C13598b0> lVar, Bitmap bitmap) {
            this.f153224d = lVar;
            this.f153225e = bitmap;
        }

        public final void run() {
            C32226l<Bitmap, C13598b0> lVar = this.f153224d;
            if (lVar != null) {
                lVar.invoke(this.f153225e);
            }
        }
    }

    /* renamed from: c60.c$b */
    public static final class C54672b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f153226d;

        public C54672b(C32226l<? super Bitmap, C13598b0> lVar) {
            this.f153226d = lVar;
        }

        public final void run() {
            C32226l<Bitmap, C13598b0> lVar = this.f153226d;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    /* renamed from: c60.c$c */
    public static final class C54673c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f153227d;

        public C54673c(C32226l<? super Bitmap, C13598b0> lVar) {
            this.f153227d = lVar;
        }

        public final void run() {
            C32226l<Bitmap, C13598b0> lVar = this.f153227d;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    public C54670c(String str, C32226l<? super Bitmap, C13598b0> lVar, int i) {
        this.f153221d = str;
        this.f153222e = lVar;
        this.f153223f = i;
    }

    public final void run() {
        Class cls = C76705f.class;
        if (Util.isNullOrNil(this.f153221d)) {
            C32226l<Bitmap, C13598b0> lVar = this.f153222e;
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        Bitmap loadBitmap = ((C76705f) C86312j.m106911c(cls)).mo106829VT().loadBitmap(this.f153221d);
        if (loadBitmap == null) {
            loadBitmap = ((C76705f) C86312j.m106911c(cls)).mo106829VT().mo10728qq();
        }
        if (loadBitmap != null) {
            try {
                long currentTicks = Util.currentTicks();
                Bitmap fastblur = BitmapUtil.fastblur(BitmapUtil.extractThumbNail(loadBitmap, loadBitmap.getHeight(), (int) (((float) loadBitmap.getHeight()) / (((float) C85875k4.m106184h(MMApplicationContext.getContext()).y) / ((float) C85875k4.m106184h(MMApplicationContext.getContext()).x))), true, false), 20);
                C87412m.m108593f(fastblur, "blurBitmap");
                int i = this.f153223f;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Canvas canvas = new Canvas(fastblur);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawColor(i);
                long ticksToNow = Util.ticksToNow(currentTicks);
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorGaussAnchorAvatarCost is " + ticksToNow);
                C115669n.INSTANCE.mo160138m((int) 1383, 9, 10, (int) ticksToNow, false);
                MMHandlerThread.postToMainThread(new C54671a(this.f153222e, fastblur));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.LiveBitmapUtil", "fastblur failed: " + e.getMessage());
                MMHandlerThread.postToMainThread(new C54672b(this.f153222e));
            }
        }
        MMHandlerThread.postToMainThread(new C54673c(this.f153222e));
    }
}
