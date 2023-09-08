package lc0;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20829b;
import gc0.C20830c;
import java.lang.ref.WeakReference;

/* renamed from: lc0.c */
public class C21411c implements Runnable {

    /* renamed from: d */
    public String f60587d;

    /* renamed from: e */
    public C20830c f60588e;

    /* renamed from: f */
    public Bitmap f60589f;

    /* renamed from: g */
    public C20829b f60590g;

    public C21411c(String str, C20830c cVar, Bitmap bitmap, C20829b bVar, String str2) {
        this.f60587d = str;
        this.f60588e = cVar;
        this.f60589f = bitmap;
        this.f60590g = bVar;
    }

    public void run() {
        Bitmap bitmap;
        C20829b bVar;
        WeakReference<ImageView> weakReference;
        ImageView imageView;
        if (Util.isNullOrNil(this.f60587d) || this.f60588e == null || (bitmap = this.f60589f) == null || bitmap.isRecycled() || (bVar = this.f60590g) == null) {
            Log.m105928w("MicroMsg.imageloader.ImageShowTask", "[cpan] run something is null.");
            return;
        }
        C20830c cVar = this.f60588e;
        if (this.f60587d.equals(bVar.f58843d.get(Integer.valueOf(cVar.f58846b)))) {
            C20830c cVar2 = this.f60588e;
            Bitmap bitmap2 = this.f60589f;
            cVar2.getClass();
            if (!(Looper.myLooper() != Looper.getMainLooper() || (weakReference = cVar2.f58845a) == null || (imageView = weakReference.get()) == null)) {
                imageView.setImageBitmap(bitmap2);
            }
            this.f60590g.mo32530b(this.f60588e);
            return;
        }
        Log.m105928w("MicroMsg.imageloader.ImageShowTask", "[cpan] url is not equals view url.");
    }
}
