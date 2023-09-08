package kg3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: kg3.a */
public final class C76577a {

    /* renamed from: a */
    public static final SparseIntArray f224127a = new SparseIntArray();

    /* renamed from: b */
    public static float f224128b = 0.0f;

    /* renamed from: c */
    public static boolean f224129c = false;

    /* renamed from: d */
    public static boolean f224130d = true;

    /* renamed from: A */
    public static int m92145A(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        Log.m105920e("MicroMsg.ResourceHelper", "get widthPixels but context is null");
        return 0;
    }

    /* renamed from: B */
    public static boolean m92146B(float f, float f2) {
        return ((double) Math.abs(f - f2)) <= 1.0E-5d;
    }

    /* renamed from: C */
    public static boolean m92147C(Context context) {
        float p = m92165p(context);
        f224128b = p;
        return Float.compare(p, m92171v(context)) > 0;
    }

    /* renamed from: D */
    public static boolean m92148D(Context context) {
        float p = m92165p(context);
        f224128b = p;
        return Float.compare(p, m92174y(context)) > 0;
    }

    /* renamed from: E */
    public static void m92149E(Context context, float f) {
        SharedPreferences.Editor edit = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
        edit.putFloat("text_size_scale_key", f);
        edit.commit();
        f224128b = f;
    }

    /* renamed from: a */
    public static int m92150a(Context context, float f) {
        return Math.round(m92156g(context) * f);
    }

    /* renamed from: b */
    public static int m92151b(Context context, int i) {
        return Math.round(m92156g(context) * ((float) i));
    }

    /* renamed from: c */
    public static int m92152c(Context context, int i) {
        return Math.round(((float) i) / m92156g(context));
    }

    /* renamed from: d */
    public static int m92153d(Context context, int i) {
        if (context != null) {
            return context.getResources().getColor(i);
        }
        Log.m105921e("MicroMsg.ResourceHelper", "get color, resId %d, but context is null", Integer.valueOf(i));
        return 0;
    }

    /* renamed from: e */
    public static ColorStateList m92154e(Context context, int i) {
        if (context != null) {
            return context.getResources().getColorStateList(i);
        }
        Log.m105921e("MicroMsg.ResourceHelper", "get color state list, resId %d, but context is null", Integer.valueOf(i));
        return null;
    }

    /* renamed from: f */
    public static int m92155f(Context context, int i) {
        int i2;
        if (context == null) {
            Log.m105921e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", Integer.valueOf(i));
            return 0;
        }
        SparseIntArray sparseIntArray = f224127a;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, 0);
        }
        if (i2 <= 0) {
            i2 = context.getResources().getDimensionPixelSize(i);
            synchronized (sparseIntArray) {
                sparseIntArray.put(i, i2);
            }
        }
        return i2;
    }

    /* renamed from: g */
    public static float m92156g(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: h */
    public static int m92157h(Context context, int i) {
        float p = m92165p(context);
        if (p > 1.4f) {
            p = 1.4f;
        }
        return (int) (((float) m92155f(context, i)) * p);
    }

    /* renamed from: i */
    public static Drawable m92158i(Context context, int i) {
        if (context != null) {
            return context.getResources().getDrawable(i);
        }
        Log.m105921e("MicroMsg.ResourceHelper", "get drawable, resId %d, but context is null", Integer.valueOf(i));
        return null;
    }

    /* renamed from: j */
    public static int m92159j(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        Log.m105920e("MicroMsg.ResourceHelper", "get heightPixels but context is null");
        return 0;
    }

    /* renamed from: k */
    public static boolean m92160k(Context context) {
        if (context != null && !f224129c) {
            f224130d = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("screenResolution_isModifyDensity", true);
            f224129c = true;
        }
        return f224130d;
    }

    /* renamed from: l */
    public static float m92161l(Context context) {
        if (m92148D(context)) {
            return m92160k(context) ? 1.2f : 1.1f;
        }
        return 1.0f;
    }

    /* renamed from: m */
    public static float m92162m(Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getFloat("text_size_scale_key", 1.0f);
    }

    /* renamed from: n */
    public static int m92163n(Context context) {
        float m = m92162m(context);
        if (m == m92173x(context)) {
            return 1;
        }
        m92172w(context);
        if (m == 1.0f) {
            return 2;
        }
        if (m == m92171v(context)) {
            return 3;
        }
        if (m == m92174y(context)) {
            return 4;
        }
        if (m == m92167r(context)) {
            return 5;
        }
        if (m == m92168s(context)) {
            return 6;
        }
        if (m == m92169t(context)) {
            return 7;
        }
        return m == m92170u(context) ? 8 : 2;
    }

    /* renamed from: o */
    public static int m92164o(Context context, int i) {
        return (int) (((float) m92155f(context, i)) * m92165p(context));
    }

    /* renamed from: p */
    public static float m92165p(Context context) {
        if (f224128b == 0.0f) {
            if (context == null) {
                f224128b = 1.0f;
            } else {
                f224128b = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getFloat("text_size_scale_key", 1.0f);
            }
        }
        if (!f224129c) {
            f224130d = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("screenResolution_isModifyDensity", true);
            f224129c = true;
        }
        if (f224130d && (m92146B(f224128b, 1.1f) || m92146B(f224128b, 0.8f))) {
            f224128b = 1.0f;
        }
        return f224128b;
    }

    /* renamed from: q */
    public static String m92166q(Context context, int i) {
        if (context != null) {
            return context.getResources().getString(i);
        }
        Log.m105921e("MicroMsg.ResourceHelper", "get string, resId %d, but context is null", Integer.valueOf(i));
        return "";
    }

    /* renamed from: r */
    public static float m92167r(Context context) {
        return m92160k(context) ? 1.125f : 1.375f;
    }

    /* renamed from: s */
    public static float m92168s(Context context) {
        return m92160k(context) ? 1.4f : 1.625f;
    }

    /* renamed from: t */
    public static float m92169t(Context context) {
        return m92160k(context) ? 1.55f : 1.875f;
    }

    /* renamed from: u */
    public static float m92170u(Context context) {
        return m92160k(context) ? 1.65f : 2.025f;
    }

    /* renamed from: v */
    public static float m92171v(Context context) {
        return m92160k(context) ? 1.1f : 1.11f;
    }

    /* renamed from: w */
    public static float m92172w(Context context) {
        m92160k(context);
        return 1.0f;
    }

    /* renamed from: x */
    public static float m92173x(Context context) {
        return m92160k(context) ? 0.8f : 0.875f;
    }

    /* renamed from: y */
    public static float m92174y(Context context) {
        return m92160k(context) ? 1.12f : 1.25f;
    }

    /* renamed from: z */
    public static float m92175z(Context context) {
        return (m92160k(context) || !m92148D(context)) ? 1.0f : 1.1f;
    }
}
