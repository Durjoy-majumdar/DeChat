package aw0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import lb0.C88394b;

/* renamed from: aw0.b */
public final class C103920b implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C103921c f307279d;

    /* renamed from: e */
    public final /* synthetic */ String f307280e;

    public C103920b(C103921c cVar, String str) {
        this.f307279d = cVar;
        this.f307280e = str;
    }

    /* renamed from: b */
    public void mo1907b() {
        C103921c cVar = this.f307279d;
        cVar.mo145545a(cVar.f307283f);
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return this.f307280e;
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            mo1907b();
            return;
        }
        ImageView imageView = this.f307279d.f307282e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f307279d.f307282e;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
    }
}
