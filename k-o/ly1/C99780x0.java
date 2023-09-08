package ly1;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.lang.ref.SoftReference;
import o90.C100301b;

/* renamed from: ly1.x0 */
public class C99780x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f292446d;

    /* renamed from: e */
    public final /* synthetic */ SoftReference f292447e;

    /* renamed from: ly1.x0$a */
    public class C99781a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f292448d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f292449e;

        public C99781a(C99780x0 x0Var, ImageView imageView, Bitmap bitmap) {
            this.f292448d = imageView;
            this.f292449e = bitmap;
        }

        public void run() {
            this.f292448d.setImageBitmap(this.f292449e);
        }
    }

    public C99780x0(String str, SoftReference softReference) {
        this.f292446d = str;
        this.f292447e = softReference;
    }

    public void run() {
        SoftReference softReference;
        ImageView imageView;
        String str = this.f292446d;
        C100301b bVar = (C100301b) C99782y0.f292450a;
        Bitmap bitmap = (Bitmap) bVar.mo139556b(str);
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2);
            if (createVideoThumbnail == null || createVideoThumbnail.isRecycled()) {
                bitmap = null;
            } else {
                bitmap = ThumbnailUtils.extractThumbnail(createVideoThumbnail, 537, 402, 2);
                Bitmap bitmap2 = (Bitmap) bVar.put(str, bitmap);
                boolean z = true;
                Object[] objArr = new Object[1];
                if (bitmap2 != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.SimpleVideoAnalyzer", "createVideoThumbail, too big size = %b", objArr);
            }
        }
        if (bitmap != null && !bitmap.isRecycled() && (softReference = this.f292447e) != null && (imageView = (ImageView) softReference.get()) != null) {
            MMHandlerThread.postToMainThread(new C99781a(this, imageView, bitmap));
        }
    }
}
