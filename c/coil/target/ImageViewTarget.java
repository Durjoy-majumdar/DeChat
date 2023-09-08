package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import gy3.C87412m;
import kotlin.Metadata;
import p1144q5.C110365a;
import p1152s5.C110741d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcoil/target/ImageViewTarget;", "Lq5/a;", "Landroid/widget/ImageView;", "Ls5/d;", "Landroidx/lifecycle/e;", "view", "<init>", "(Landroid/widget/ImageView;)V", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public class ImageViewTarget implements C110365a<ImageView>, C110741d, C103757e {

    /* renamed from: d */
    public final ImageView f2120d;

    /* renamed from: e */
    public boolean f2121e;

    public ImageViewTarget(ImageView imageView) {
        C87412m.m108594g(imageView, "view");
        this.f2120d = imageView;
    }

    /* renamed from: a */
    public void mo791a() {
        mo797f((Drawable) null);
    }

    /* renamed from: b */
    public void mo792b(Drawable drawable) {
        C87412m.m108594g(drawable, "result");
        mo797f(drawable);
    }

    /* renamed from: c */
    public void mo793c(Drawable drawable) {
        mo797f(drawable);
    }

    /* renamed from: d */
    public void mo794d(Drawable drawable) {
        mo797f(drawable);
    }

    /* renamed from: e */
    public Drawable mo795e() {
        return this.f2120d.getDrawable();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageViewTarget) && C87412m.m108589b(this.f2120d, ((ImageViewTarget) obj).f2120d));
    }

    /* renamed from: f */
    public void mo797f(Drawable drawable) {
        Drawable drawable2 = this.f2120d.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        this.f2120d.setImageDrawable(drawable);
        mo798g();
    }

    /* renamed from: g */
    public void mo798g() {
        Drawable drawable = this.f2120d.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            if (this.f2121e) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    public View getView() {
        return this.f2120d;
    }

    public int hashCode() {
        return this.f2120d.hashCode();
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    public /* synthetic */ void onDestroy(C0125s sVar) {
    }

    public /* synthetic */ void onPause(C0125s sVar) {
    }

    public /* synthetic */ void onResume(C0125s sVar) {
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        this.f2121e = true;
        mo798g();
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        this.f2121e = false;
        mo798g();
    }

    public String toString() {
        return "ImageViewTarget(view=" + this.f2120d + ')';
    }
}
