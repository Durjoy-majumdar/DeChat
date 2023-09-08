package go0;

import android.content.Context;
import android.view.TextureView;
import com.tencent.p014mm.sdk.AsyncCountDownLatch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.xweb.skia_canvas.SkiaCanvasApp;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import junit.framework.Assert;

/* renamed from: go0.d */
public class C87278d extends TextureView {

    /* renamed from: d */
    public String f253009d;

    /* renamed from: e */
    public int f253010e;

    /* renamed from: f */
    public SkiaCanvasView f253011f;

    /* renamed from: g */
    public SkiaCanvasApp f253012g;

    /* renamed from: h */
    public final AsyncCountDownLatch f253013h;

    /* renamed from: i */
    public C87280b f253014i;

    /* renamed from: go0.d$a */
    public class C87279a implements Runnable {
        public C87279a() {
        }

        public void run() {
            C87280b bVar;
            C87278d dVar = C87278d.this;
            if (dVar.f253011f != null && (bVar = dVar.f253014i) != null) {
                a$$e a__e = (a$$e) bVar;
                a__e.f253007a.mo122438a(a__e.f253008b.mo115109j("ok"));
            }
        }
    }

    /* renamed from: go0.d$b */
    public interface C87280b {
    }

    public C87278d(Context context, SkiaCanvasApp skiaCanvasApp, int i, String str) {
        super(context);
        this.f253012g = skiaCanvasApp;
        this.f253010e = i;
        this.f253009d = str;
        AsyncCountDownLatch asyncCountDownLatch = new AsyncCountDownLatch(2);
        this.f253013h = asyncCountDownLatch;
        Log.m105925i("Luggage.SkiaCanvasTextureView", "init() viewId:%d appId:%s, app:%s", Integer.valueOf(this.f253010e), this.f253009d, this.f253012g);
        setSurfaceTextureListener(new C87281e(this));
        setOpaque(false);
        if (this.f253012g != null) {
            asyncCountDownLatch.countDown();
        }
    }

    /* renamed from: a */
    public void mo121674a(SkiaCanvasApp skiaCanvasApp) {
        Assert.assertNull("mApp should be null", this.f253012g);
        Assert.assertNotNull("skiaCanvasApp should not be null", skiaCanvasApp);
        Log.m105925i("Luggage.SkiaCanvasTextureView", "attachApp viewId:%d, app:%s", Integer.valueOf(this.f253010e), skiaCanvasApp);
        this.f253012g = skiaCanvasApp;
        this.f253013h.countDown();
    }

    public SkiaCanvasApp getAttachedApp() {
        return this.f253012g;
    }

    public void setOnReadyListener(C87280b bVar) {
        this.f253014i = bVar;
        MMHandlerThread.postToMainThread(new C87279a());
    }
}
