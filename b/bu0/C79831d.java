package bu0;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: bu0.d */
public class C79831d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f233978d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f233979e;

    public C79831d(C79819c cVar, ImageView imageView, Bitmap bitmap) {
        this.f233978d = imageView;
        this.f233979e = bitmap;
    }

    public void run() {
        this.f233978d.setImageBitmap(this.f233979e);
    }
}
