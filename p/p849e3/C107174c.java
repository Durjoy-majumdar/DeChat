package p849e3;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;
import p1057w2.C111711b;

/* renamed from: e3.c */
public final class C107174c {

    /* renamed from: a */
    public final Object f320761a;

    public C107174c(Object obj) {
        this.f320761a = obj;
    }

    /* renamed from: a */
    public int mo157621a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f320761a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo157622b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f320761a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo157623c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f320761a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo157624d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f320761a).getSafeInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public C111711b mo157625e() {
        return Build.VERSION.SDK_INT >= 30 ? C111711b.m152276b(((DisplayCutout) this.f320761a).getWaterfallInsets()) : C111711b.f334387e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C107174c.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f320761a, ((C107174c) obj).f320761a);
    }

    public int hashCode() {
        Object obj = this.f320761a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f320761a + "}";
    }
}
