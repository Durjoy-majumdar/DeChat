package p849e3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import p1164y2.C112383b;

/* renamed from: e3.h */
public final class C107197h {

    @Deprecated
    /* renamed from: e3.h$a */
    public interface C97599a {
    }

    /* renamed from: a */
    public static void m145132a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C112383b) {
            ((C112383b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m145133b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C112383b) {
            ((C112383b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: c */
    public static void m145134c(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C112383b) {
            ((C112383b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m145135d(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C112383b) {
            ((C112383b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: e */
    public static void m145136e(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C112383b) {
            ((C112383b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: f */
    public static void m145137f(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C112383b) {
            ((C112383b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
