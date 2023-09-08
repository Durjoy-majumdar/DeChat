package gc0;

import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: gc0.c */
public class C20830c {

    /* renamed from: a */
    public WeakReference<ImageView> f58845a;

    /* renamed from: b */
    public final int f58846b;

    public C20830c(ImageView imageView, String str) {
        this.f58845a = new WeakReference<>(imageView);
        if (imageView != null) {
            this.f58846b = imageView.hashCode();
        } else {
            this.f58846b = hashCode();
        }
    }

    /* renamed from: a */
    public ImageView mo32531a() {
        ImageView imageView;
        WeakReference<ImageView> weakReference = this.f58845a;
        if (weakReference == null || (imageView = weakReference.get()) == null) {
            return null;
        }
        return imageView;
    }
}
