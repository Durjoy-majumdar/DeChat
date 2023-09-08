package p1122i8;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: i8.a */
public class C108396a extends RippleDrawable {
    public C108396a(ColorStateList colorStateList, InsetDrawable insetDrawable, Drawable drawable) {
        super(colorStateList, insetDrawable, drawable);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((GradientDrawable) ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorFilter);
        }
    }
}
