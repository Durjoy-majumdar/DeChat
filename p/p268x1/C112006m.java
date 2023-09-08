package p268x1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import gy3.C87412m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: x1.m */
public final class C112006m implements C112005l {

    /* renamed from: a */
    public static boolean f335272a;

    /* renamed from: b */
    public static Constructor<StaticLayout> f335273b;

    /* renamed from: a */
    public StaticLayout mo163665a(C112007n nVar) {
        Constructor<StaticLayout> constructor;
        C112007n nVar2 = nVar;
        C87412m.m108594g(nVar2, "params");
        StaticLayout staticLayout = null;
        if (f335272a) {
            constructor = f335273b;
        } else {
            f335272a = true;
            Class<StaticLayout> cls = StaticLayout.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                f335273b = cls.getConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, TextDirectionHeuristic.class, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
            } catch (NoSuchMethodException unused) {
                f335273b = null;
            }
            constructor = f335273b;
        }
        if (constructor != null) {
            try {
                staticLayout = constructor.newInstance(new Object[]{nVar2.f335274a, Integer.valueOf(nVar2.f335275b), Integer.valueOf(nVar2.f335276c), nVar2.f335277d, Integer.valueOf(nVar2.f335278e), nVar2.f335280g, nVar2.f335279f, Float.valueOf(nVar2.f335284k), Float.valueOf(nVar2.f335285l), Boolean.valueOf(nVar2.f335287n), nVar2.f335282i, Integer.valueOf(nVar2.f335283j), Integer.valueOf(nVar2.f335281h)});
            } catch (IllegalAccessException unused2) {
                f335273b = null;
            } catch (InstantiationException unused3) {
                f335273b = null;
            } catch (InvocationTargetException unused4) {
                f335273b = null;
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(nVar2.f335274a, nVar2.f335275b, nVar2.f335276c, nVar2.f335277d, nVar2.f335278e, nVar2.f335280g, nVar2.f335284k, nVar2.f335285l, nVar2.f335287n, nVar2.f335282i, nVar2.f335283j);
    }
}
