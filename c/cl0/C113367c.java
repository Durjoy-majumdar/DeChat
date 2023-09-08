package cl0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import ck0.C80043a;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1737l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.InputStream;
import p224ra.C89909e;
import s24.C90125c;
import zi0.C91755a;

/* renamed from: cl0.c */
public class C113367c implements C91755a.C91758c {

    /* renamed from: a */
    public final /* synthetic */ C113369d f339163a;

    /* renamed from: b */
    public final /* synthetic */ String f339164b;

    /* renamed from: c */
    public final /* synthetic */ String f339165c;

    /* renamed from: d */
    public final /* synthetic */ MultiTouchImageView f339166d;

    /* renamed from: e */
    public final /* synthetic */ float f339167e;

    /* renamed from: cl0.c$a */
    public class C113368a implements Runnable {
        public C113368a() {
        }

        public void run() {
            C113367c cVar = C113367c.this;
            float f = cVar.f339167e;
            if (f >= 0.5f) {
                cVar.f339166d.mo177313r(f);
                C113367c.this.f339166d.mo26058c();
            }
        }
    }

    public C113367c(C113369d dVar, String str, String str2, MultiTouchImageView multiTouchImageView, float f) {
        this.f339163a = dVar;
        this.f339164b = str;
        this.f339165c = str2;
        this.f339166d = multiTouchImageView;
        this.f339167e = f;
    }

    /* renamed from: a */
    public void mo121428a(InputStream inputStream) {
        Class cls = C1737l0.class;
        if (inputStream == null) {
            C113369d dVar = this.f339163a;
            if (dVar != null) {
                String str = this.f339164b;
                ((ZoomImagePreviewer) dVar).mo175006e(str, "null InputStream, finalUrl: " + this.f339165c);
            }
            Log.m105921e("MicroMsg.ImagePreviewerUtils", "openRead failed, url=%s", this.f339165c);
            return;
        }
        InputStream a = C80043a.m97325a(inputStream);
        "HUAWEI".equals(Build.MANUFACTURER);
        a.mark(8388608);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C1737l0 l0Var = (C1737l0) C89909e.m112436a(cls);
        if (l0Var == null) {
            l0Var = C1737l0.f11455j0;
        }
        l0Var.mo1726jg(a, (Rect) null, options);
        String str2 = options.outMimeType;
        str2.getClass();
        if (str2.equals("image/GIF") || str2.equals("image/gif")) {
            C113369d dVar2 = this.f339163a;
            if (dVar2 != null) {
                ((ZoomImagePreviewer) dVar2).mo175006e(this.f339164b, "not support gif");
            }
            Log.m105920e("MicroMsg.ImagePreviewerUtils", "not support gift image");
            return;
        }
        try {
            a.reset();
            C1737l0 l0Var2 = (C1737l0) C89909e.m112436a(cls);
            if (l0Var2 == null) {
                l0Var2 = C1737l0.f11455j0;
            }
            Bitmap O0 = l0Var2.mo1725O0(a);
            C90125c.m112774a(a);
            if (O0 == null || O0.isRecycled()) {
                C113369d dVar3 = this.f339163a;
                if (dVar3 != null) {
                    ((ZoomImagePreviewer) dVar3).mo175006e(this.f339164b, "bmp is null or recycled");
                    return;
                }
                return;
            }
            this.f339166d.setImageBitmap(O0);
            MultiTouchImageView multiTouchImageView = this.f339166d;
            int width = O0.getWidth();
            int height = O0.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
            this.f339166d.postDelayed(new C113368a(), 100);
        } catch (Throwable th) {
            C113369d dVar4 = this.f339163a;
            if (dVar4 != null) {
                String str3 = this.f339164b;
                ((ZoomImagePreviewer) dVar4).mo175006e(str3, "exception found: " + th.toString());
            }
            Log.m105921e("MicroMsg.ImagePreviewerUtils", "setImageBitmap failed, url=%s", this.f339165c);
        }
    }
}
