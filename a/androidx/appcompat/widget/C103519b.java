package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
public class C103519b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f305702a;

    public C103519b(ActionBarContainer actionBarContainer) {
        this.f305702a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f305702a;
        if (actionBarContainer.f305332n) {
            Drawable drawable = actionBarContainer.f305331j;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f305329h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f305702a;
        Drawable drawable3 = actionBarContainer2.f305330i;
        if (drawable3 != null && actionBarContainer2.f305333o) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f305702a;
        if (actionBarContainer.f305332n) {
            Drawable drawable = actionBarContainer.f305331j;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f305329h;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
