package lg3;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: lg3.m */
public final class C88506m extends C88493a {

    /* renamed from: b */
    public final Resources f255653b;

    /* renamed from: c */
    public Configuration f255654c;

    /* renamed from: d */
    public DisplayMetrics f255655d;

    /* renamed from: e */
    public int f255656e = 0;

    public C88506m(Resources resources, int i, DisplayMetrics displayMetrics) {
        super(resources);
        this.f255653b = resources;
        Configuration configuration = new Configuration(resources.getConfiguration());
        this.f255654c = configuration;
        this.f255655d = displayMetrics;
        configuration.densityDpi = displayMetrics.densityDpi;
        this.f255656e = i;
        if (i == 1) {
            C88497f.m110370c(configuration, true);
        } else if (i == 2) {
            C88497f.m110370c(configuration, false);
        }
        mo122973a(this.f255654c, this.f255655d, false);
    }

    /* renamed from: a */
    public final void mo122973a(Configuration configuration, DisplayMetrics displayMetrics, boolean z) {
        if (this.f255656e != 0 || z) {
            this.f255654c = new Configuration(configuration);
            this.f255655d = C88494d.m110348d();
            int i = this.f255656e;
            if (i == 1) {
                C88497f.m110370c(this.f255654c, true);
            } else if (i == 2) {
                C88497f.m110370c(this.f255654c, false);
            }
        }
        super.updateConfiguration(this.f255654c, this.f255655d);
    }

    public Configuration getConfiguration() {
        Configuration configuration = this.f255654c;
        return configuration != null ? configuration : super.getConfiguration();
    }

    public DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.f255655d;
        return displayMetrics != null ? displayMetrics : super.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2 = this.f255655d;
        if (displayMetrics2 != null) {
            return getDrawableForDensity(i, displayMetrics2.densityDpi);
        }
        Drawable drawable = this.f255653b.getDrawable(i);
        if ((drawable instanceof BitmapDrawable) && (displayMetrics = this.f255655d) != null) {
            ((BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        DisplayMetrics displayMetrics;
        if (i2 == 0 && (displayMetrics = this.f255655d) != null) {
            i2 = displayMetrics.densityDpi;
        }
        return this.f255653b.getDrawableForDensity(i, i2);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        if (this.f255656e != 0) {
            mo122973a(configuration, displayMetrics, true);
        } else {
            super.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        DisplayMetrics displayMetrics;
        if (i2 == 0 && (displayMetrics = this.f255655d) != null) {
            i2 = displayMetrics.densityDpi;
        }
        return this.f255653b.getDrawableForDensity(i, i2, theme);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        DisplayMetrics displayMetrics;
        try {
            DisplayMetrics displayMetrics2 = this.f255655d;
            if (displayMetrics2 != null) {
                return getDrawableForDensity(i, displayMetrics2.densityDpi, theme);
            }
        } catch (NoSuchMethodError e) {
            Log.printErrStackTrace("MicroMsg.UIModeResource", e, "getDrawable(id, theme)", new Object[0]);
            if (theme == null) {
                return getDrawableForDensity(i, this.f255655d.densityDpi);
            }
        }
        Drawable drawable = this.f255653b.getDrawable(i, theme);
        if ((drawable instanceof BitmapDrawable) && (displayMetrics = this.f255655d) != null) {
            ((BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }
}
