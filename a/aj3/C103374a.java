package aj3;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: aj3.a */
public abstract class C103374a {

    /* renamed from: f */
    public static final WeakHashMap<View, C103374a> f304861f = new WeakHashMap<>(0);

    /* renamed from: a */
    public HashMap<Animator, Runnable> f304862a;

    /* renamed from: b */
    public HashMap<Animator, Runnable> f304863b;

    /* renamed from: c */
    public Runnable f304864c;

    /* renamed from: d */
    public Runnable f304865d;

    /* renamed from: e */
    public C67055a f304866e;

    /* renamed from: aj3.a$a */
    public interface C67055a {
        /* renamed from: a */
        void mo91065a(float f);
    }

    /* renamed from: a */
    public static C103374a m137034a(View view) {
        WeakHashMap<View, C103374a> weakHashMap = f304861f;
        C103374a aVar = weakHashMap.get(view);
        if (aVar == null) {
            int intValue = Integer.valueOf(Build.VERSION.SDK).intValue();
            aVar = intValue >= 19 ? new C103383d(view) : intValue >= 16 ? new C103380c(view) : new C103375b(view);
            weakHashMap.put(view, aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public abstract C103374a mo143279b(float f);

    /* renamed from: c */
    public abstract C103374a mo143280c(float f);

    /* renamed from: d */
    public abstract C103374a mo143281d(float f);

    /* renamed from: e */
    public abstract C103374a mo143282e(long j);

    /* renamed from: f */
    public abstract C103374a mo143283f(Interpolator interpolator);

    /* renamed from: g */
    public abstract C103374a mo143284g(long j);

    /* renamed from: h */
    public C103374a mo143285h(C67055a aVar) {
        this.f304866e = aVar;
        return this;
    }

    /* renamed from: i */
    public abstract void mo143286i();

    /* renamed from: j */
    public abstract C103374a mo143287j(float f);

    /* renamed from: k */
    public abstract C103374a mo143288k(float f);

    /* renamed from: l */
    public abstract C103374a mo143289l(Runnable runnable);

    /* renamed from: m */
    public abstract C103374a mo143290m(Runnable runnable);
}
