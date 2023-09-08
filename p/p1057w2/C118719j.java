package p1057w2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p1050v2.C111319e;
import p1091b3.C113133l;

/* renamed from: w2.j */
public class C118719j {

    /* renamed from: w2.j$a */
    public class C118720a implements C118721b<C113133l> {
        public C118720a(C118719j jVar) {
        }

        /* renamed from: a */
        public int mo183471a(Object obj) {
            return ((C113133l) obj).f338534c;
        }

        /* renamed from: b */
        public boolean mo183472b(Object obj) {
            return ((C113133l) obj).f338535d;
        }
    }

    /* renamed from: w2.j$b */
    public interface C118721b<T> {
        /* renamed from: a */
        int mo183471a(T t);

        /* renamed from: b */
        boolean mo183472b(T t);
    }

    public C118719j() {
        new ConcurrentHashMap();
    }

    /* renamed from: e */
    public static <T> T m167420e(T[] tArr, int i, C118721b<T> bVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(bVar.mo183471a(t2) - i2) * 2) + (bVar.mo183472b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo183460a(Context context, C111319e.C111321b bVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo183461b(Context context, CancellationSignal cancellationSignal, C113133l[] lVarArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface mo183469c(Context context, InputStream inputStream) {
        File d = C90886k.m114011d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!C90886k.m114010c(d, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo183462d(Context context, Resources resources, int i, String str, int i2) {
        File d = C90886k.m114011d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!C90886k.m114009b(d, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d.getPath());
            d.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    /* renamed from: f */
    public C113133l mo183470f(C113133l[] lVarArr, int i) {
        return (C113133l) m167420e(lVarArr, i, new C118720a(this));
    }
}
