package p1115h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C103527f;
import java.util.WeakHashMap;
import p1050v2.C111317c;
import p385u2.C111105a;

/* renamed from: h.a */
public final class C107922a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f323135a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<C107923a>> f323136b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f323137c = new Object();

    /* renamed from: h.a$a */
    public static class C107923a {

        /* renamed from: a */
        public final ColorStateList f323138a;

        /* renamed from: b */
        public final Configuration f323139b;

        public C107923a(ColorStateList colorStateList, Configuration configuration) {
            this.f323138a = colorStateList;
            this.f323139b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m146227a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C107923a aVar;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (f323137c) {
            SparseArray sparseArray = f323136b.get(context);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = (C107923a) sparseArray.get(i)) == null)) {
                if (aVar.f323139b.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = aVar.f323138a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f323135a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = C111317c.m151800a(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return C111105a.m151501c(context, i);
        }
        synchronized (f323137c) {
            WeakHashMap<Context, SparseArray<C107923a>> weakHashMap = f323136b;
            SparseArray sparseArray2 = weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i, new C107923a(colorStateList, context.getResources().getConfiguration()));
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static Drawable m146228b(Context context, int i) {
        Drawable i2;
        C103527f g = C103527f.m137545g();
        synchronized (g) {
            i2 = g.mo144329i(context, i, false);
        }
        return i2;
    }
}
