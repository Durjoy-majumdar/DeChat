package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.widget.C84918a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import lg3.C88494d;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.f3 */
public class C84527f3 extends ContextThemeWrapper {

    /* renamed from: a */
    public Resources f246674a;

    /* renamed from: b */
    public LayoutInflater f246675b;

    public C84527f3(Context context) {
        attachBaseContext(context);
        mo117212a(context);
    }

    /* renamed from: a */
    public final void mo117212a(Context context) {
        Resources resources;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        if (castActivityOrNull instanceof MMFragmentActivity) {
            resources = ((MMFragmentActivity) castActivityOrNull).getOriginalResources();
            if (resources.getConfiguration().orientation != 1 && !C85875k4.m106157N()) {
                Resources resources2 = new Resources(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
                Point h = C85875k4.m106184h(castActivityOrNull);
                int min = Math.min(h.x, h.y);
                if (min >= resources2.getDisplayMetrics().heightPixels) {
                    resources2.getDisplayMetrics().heightPixels = min;
                }
                resources = resources2;
            }
        } else {
            resources = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext().getResources() : context.getResources();
        }
        this.f246674a = new C84528a(resources, C88494d.m110348d());
        getTheme().getResources().getDisplayMetrics().setTo(this.f246674a.getDisplayMetrics());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f246674a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.Resources getResources() {
        /*
            r1 = this;
            android.content.res.AssetManager r0 = r1.getAssets()
            if (r0 == 0) goto L_0x000b
            android.content.res.Resources r0 = r1.f246674a
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.Resources r0 = super.getResources()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84527f3.getResources():android.content.res.Resources");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater = this.f246675b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater c = C85868k2.m106138c((LayoutInflater) super.getSystemService("layout_inflater"));
        this.f246675b = c;
        return c;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.f3$a */
    public static final class C84528a extends C84918a {

        /* renamed from: b */
        public final Resources f246676b;

        /* renamed from: c */
        public DisplayMetrics f246677c;

        /* renamed from: d */
        public Configuration f246678d;

        public C84528a(Resources resources, DisplayMetrics displayMetrics) {
            super(resources);
            this.f246676b = resources;
            this.f246677c = displayMetrics;
            Configuration configuration = new Configuration(resources.getConfiguration());
            this.f246678d = configuration;
            configuration.densityDpi = this.f246677c.densityDpi;
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            displayMetrics2.setTo(resources.getDisplayMetrics());
            mo117215c(configuration2, displayMetrics2, false);
        }

        /* renamed from: c */
        public final void mo117215c(Configuration configuration, DisplayMetrics displayMetrics, boolean z) {
            if (this.f246677c == null || z) {
                this.f246677c = C88494d.m110348d();
                Configuration configuration2 = new Configuration(configuration);
                this.f246678d = configuration2;
                configuration2.densityDpi = this.f246677c.densityDpi;
            }
            super.updateConfiguration(this.f246678d, this.f246677c);
            this.f246676b.updateConfiguration(configuration, displayMetrics);
        }

        public Configuration getConfiguration() {
            Configuration configuration = this.f246678d;
            return configuration != null ? configuration : super.getConfiguration();
        }

        public int getDimensionPixelOffset(int i) {
            return mo117683a(i);
        }

        public int getDimensionPixelSize(int i) {
            return mo117684b(i);
        }

        public DisplayMetrics getDisplayMetrics() {
            DisplayMetrics displayMetrics = this.f246677c;
            return displayMetrics != null ? displayMetrics : super.getDisplayMetrics();
        }

        public Drawable getDrawable(int i) {
            DisplayMetrics displayMetrics;
            DisplayMetrics displayMetrics2 = this.f246677c;
            if (displayMetrics2 != null) {
                return getDrawableForDensity(i, displayMetrics2.densityDpi);
            }
            Drawable drawable = this.f246676b.getDrawable(i);
            if ((drawable instanceof BitmapDrawable) && (displayMetrics = this.f246677c) != null) {
                ((BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
            }
            return drawable;
        }

        public Drawable getDrawableForDensity(int i, int i2) {
            DisplayMetrics displayMetrics;
            if (i2 == 0 && (displayMetrics = this.f246677c) != null) {
                i2 = displayMetrics.densityDpi;
            }
            return this.f246676b.getDrawableForDensity(i, i2);
        }

        public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
            if (this.f246677c != null) {
                mo117215c(configuration, displayMetrics, true);
            } else {
                super.updateConfiguration(configuration, displayMetrics);
            }
        }

        public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
            DisplayMetrics displayMetrics;
            if (i2 == 0 && (displayMetrics = this.f246677c) != null) {
                i2 = displayMetrics.densityDpi;
            }
            return this.f246676b.getDrawableForDensity(i, i2, theme);
        }

        public Drawable getDrawable(int i, Resources.Theme theme) {
            DisplayMetrics displayMetrics;
            try {
                DisplayMetrics displayMetrics2 = this.f246677c;
                if (displayMetrics2 != null) {
                    return getDrawableForDensity(i, displayMetrics2.densityDpi, theme);
                }
            } catch (NoSuchMethodError e) {
                Log.printErrStackTrace("MicroMsg.AppBrandUIScreenAdaptiveContextThemeWrapper", e, "getDrawable(id, theme)", new Object[0]);
                if (theme == null) {
                    return getDrawableForDensity(i, this.f246677c.densityDpi);
                }
            }
            Drawable drawable = this.f246676b.getDrawable(i, theme);
            if ((drawable instanceof BitmapDrawable) && (displayMetrics = this.f246677c) != null) {
                ((BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
            }
            return drawable;
        }
    }

    public C84527f3(Context context, int i) {
        super(context, i);
        mo117212a(context);
    }
}
