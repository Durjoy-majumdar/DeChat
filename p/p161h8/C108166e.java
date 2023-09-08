package p161h8;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: h8.e */
public class C108166e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f323895a = new C108166e();

    public C108166e() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    public Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
