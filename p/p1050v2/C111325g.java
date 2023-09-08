package p1050v2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p1042u.C111058g;
import p1050v2.C111319e;
import p1057w2.C118712d;

/* renamed from: v2.g */
public final class C111325g {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f333301a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<C111327c, SparseArray<C111326b>> f333302b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f333303c = new Object();

    /* renamed from: v2.g$a */
    public static class C90738a {
        /* renamed from: a */
        public static ColorStateList m113805a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: v2.g$b */
    public static class C111326b {

        /* renamed from: a */
        public final ColorStateList f333304a;

        /* renamed from: b */
        public final Configuration f333305b;

        public C111326b(ColorStateList colorStateList, Configuration configuration) {
            this.f333304a = colorStateList;
            this.f333305b = configuration;
        }
    }

    /* renamed from: v2.g$c */
    public static final class C111327c {

        /* renamed from: a */
        public final Resources f333306a;

        /* renamed from: b */
        public final Resources.Theme f333307b;

        public C111327c(Resources resources, Resources.Theme theme) {
            this.f333306a = resources;
            this.f333307b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C111327c.class != obj.getClass()) {
                return false;
            }
            C111327c cVar = (C111327c) obj;
            return this.f333306a.equals(cVar.f333306a) && Objects.equals(this.f333307b, cVar.f333307b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f333306a, this.f333307b});
        }
    }

    /* renamed from: v2.g$d */
    public static abstract class C111328d {

        /* renamed from: v2.g$d$a */
        public class C111329a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Typeface f333308d;

            public C111329a(Typeface typeface) {
                this.f333308d = typeface;
            }

            public void run() {
                C111328d.this.mo144404d(this.f333308d);
            }
        }

        /* renamed from: v2.g$d$b */
        public class C111330b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f333310d;

            public C111330b(int i) {
                this.f333310d = i;
            }

            public void run() {
                C111328d.this.mo144403c(this.f333310d);
            }
        }

        /* renamed from: a */
        public final void mo163015a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C111330b(i));
        }

        /* renamed from: b */
        public final void mo163016b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C111329a(typeface));
        }

        /* renamed from: c */
        public abstract void mo144403c(int i);

        /* renamed from: d */
        public abstract void mo144404d(Typeface typeface);
    }

    /* renamed from: a */
    public static int m151807a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    /* renamed from: b */
    public static void m151808b(Context context, int i, C111328d dVar, Handler handler) {
        dVar.getClass();
        if (context.isRestricted()) {
            dVar.mo163015a(-4, handler);
            return;
        }
        m151809c(context, i, new TypedValue(), 0, dVar, handler, false, false);
    }

    /* renamed from: c */
    public static Typeface m151809c(Context context, int i, TypedValue typedValue, int i2, C111328d dVar, Handler handler, boolean z, boolean z2) {
        int i3 = i;
        TypedValue typedValue2 = typedValue;
        int i4 = i2;
        C111328d dVar2 = dVar;
        Handler handler2 = handler;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue2, true);
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                C111058g<String, Typeface> gVar = C118712d.f355220b;
                Typeface typeface2 = gVar.get(C118712d.m167396b(resources, i, i4));
                if (typeface2 != null) {
                    if (dVar2 != null) {
                        dVar2.mo163016b(typeface2, handler2);
                    }
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            C111319e.C111320a a = C111319e.m151804a(resources.getXml(i), resources);
                            if (a != null) {
                                typeface = C118712d.m167395a(context, a, resources, i, i2, dVar, handler, z);
                            } else if (dVar2 != null) {
                                dVar2.mo163015a(-3, handler2);
                            }
                        } else {
                            typeface2 = C118712d.f355219a.mo183462d(context, resources, i, charSequence2, i2);
                            if (typeface2 != null) {
                                gVar.put(C118712d.m167396b(resources, i, i4), typeface2);
                            }
                            if (dVar2 != null) {
                                if (typeface2 != null) {
                                    dVar2.mo163016b(typeface2, handler2);
                                } else {
                                    dVar2.mo163015a(-3, handler2);
                                }
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (dVar2 != null) {
                            dVar2.mo163015a(-3, handler2);
                        }
                    }
                }
                typeface = typeface2;
            } else if (dVar2 != null) {
                dVar2.mo163015a(-3, handler2);
            }
            if (typeface != null || dVar2 != null || z2) {
                return typeface;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue2);
    }
}
