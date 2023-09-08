package wk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.C17885c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.qbar.QbarNative;
import java.util.concurrent.atomic.AtomicBoolean;
import vk0.C90818k;

/* renamed from: wk0.c */
public abstract class C22914c {

    /* renamed from: a */
    public AtomicBoolean f65884a = new AtomicBoolean(false);

    /* renamed from: b */
    public C22917c f65885b;

    /* renamed from: c */
    public MMHandler f65886c = new MMHandler("MicroMsg.appbrand.ScanDecoder");

    /* renamed from: wk0.c$a */
    public class C22915a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f65887d;

        /* renamed from: e */
        public final /* synthetic */ String f65888e;

        /* renamed from: f */
        public final /* synthetic */ int f65889f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f65890g;

        /* renamed from: h */
        public final /* synthetic */ QbarNative.QBarPoint f65891h;

        public C22915a(int i, String str, int i2, int i3, byte[] bArr, QbarNative.QBarPoint qBarPoint) {
            this.f65887d = i;
            this.f65888e = str;
            this.f65889f = i3;
            this.f65890g = bArr;
            this.f65891h = qBarPoint;
        }

        public void run() {
            C22917c cVar = C22914c.this.f65885b;
            if (cVar != null) {
                int i = this.f65887d;
                String str = this.f65888e;
                int i2 = this.f65889f;
                byte[] bArr = this.f65890g;
                QbarNative.QBarPoint qBarPoint = this.f65891h;
                AppBrandCameraView.C17880i iVar = (AppBrandCameraView.C17880i) ((C22920e) cVar).f65894a;
                if (iVar.f49314b.compareAndSet(false, true)) {
                    MMHandlerThread.postToMainThreadDelayed(new C17885c(iVar), (long) iVar.f49315c);
                    Log.m105919d("MicroMsg.AppBrandCameraView", "resultText:%s, resultType:%d, codeVersion:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
                    if (qBarPoint != null && iVar.f49323k % 4 == 0) {
                        Log.m105925i("MicroMsg.AppBrandCameraView", "x: %f, y: %f, w: %f, h: %f; x0:%f, x1:%f, x2:%f, x3:%f, y0:%f, y1:%f, y2:%f, y3:%f", Float.valueOf(qBarPoint.f56815x0), Float.valueOf(qBarPoint.f56819y0), Float.valueOf(qBarPoint.f56816x1 - qBarPoint.f56815x0), Float.valueOf(qBarPoint.f56822y3 - qBarPoint.f56819y0), Float.valueOf(qBarPoint.f56815x0), Float.valueOf(qBarPoint.f56816x1), Float.valueOf(qBarPoint.f56817x2), Float.valueOf(qBarPoint.f56818x3), Float.valueOf(qBarPoint.f56819y0), Float.valueOf(qBarPoint.f56820y1), Float.valueOf(qBarPoint.f56821y2), Float.valueOf(qBarPoint.f56822y3));
                        iVar.f49323k++;
                    }
                    if (i == 1) {
                        AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
                        C90818k.m113893p(appBrandCameraView.f49284e, appBrandCameraView.getCameraId(), "qrcode", i2, str, bArr, qBarPoint);
                    } else if (i != 2) {
                        Log.m105928w("MicroMsg.AppBrandCameraView", "resultType:%d is not support, ignore");
                    } else {
                        AppBrandCameraView appBrandCameraView2 = AppBrandCameraView.this;
                        C90818k.m113893p(appBrandCameraView2.f49284e, appBrandCameraView2.getCameraId(), "barcode", i2, str, bArr, qBarPoint);
                    }
                }
            }
        }
    }

    /* renamed from: wk0.c$b */
    public class C22916b implements Runnable {
        public C22916b() {
        }

        public void run() {
            ((C22920e) C22914c.this.f65885b).f65894a.getClass();
        }
    }

    /* renamed from: wk0.c$c */
    public interface C22917c {
    }

    public C22914c(C22917c cVar) {
        this.f65885b = cVar;
    }

    /* renamed from: a */
    public void mo36096a(boolean z, String str, int i, int i2, int i3, byte[] bArr, QbarNative.QBarPoint qBarPoint) {
        Log.m105919d("MicroMsg.appbrand.ScanDecoder", "result:%b, resultText:%s, resultType:%d, codeType:%d, codeVersion:%d", Boolean.valueOf(z), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (z) {
            MMHandlerThread.postToMainThread(new C22915a(i, str, i2, i3, bArr, qBarPoint));
            return;
        }
        MMHandlerThread.postToMainThread(new C22916b());
    }
}
