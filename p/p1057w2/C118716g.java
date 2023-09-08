package p1057w2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p1050v2.C111319e;
import p1091b3.C113133l;

/* renamed from: w2.g */
public class C118716g extends C118714e {

    /* renamed from: f */
    public final Class<?> f355231f;

    /* renamed from: g */
    public final Constructor<?> f355232g;

    /* renamed from: h */
    public final Method f355233h;

    /* renamed from: i */
    public final Method f355234i;

    /* renamed from: j */
    public final Method f355235j;

    /* renamed from: k */
    public final Method f355236k;

    /* renamed from: l */
    public final Method f355237l;

    public C118716g() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = mo183466l(cls2);
            method2 = mo183467m(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo183468n(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f355231f = cls;
        this.f355232g = constructor;
        this.f355233h = method3;
        this.f355234i = method2;
        this.f355235j = method;
        this.f355236k = method4;
        this.f355237l = method5;
    }

    /* renamed from: a */
    public Typeface mo183460a(Context context, C111319e.C111321b bVar, Resources resources, int i) {
        Object obj;
        if (!(this.f355233h != null)) {
            return super.mo183460a(context, bVar, resources, i);
        }
        try {
            obj = this.f355232g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C111319e.C111323c cVar : bVar.f333288a) {
            if (!mo183463i(context, obj, cVar.f333293a, cVar.f333297e, cVar.f333294b, cVar.f333295c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f333296d))) {
                try {
                    this.f355236k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!mo183465k(obj)) {
            return null;
        }
        return mo183464j(obj);
    }

    /* renamed from: b */
    public Typeface mo183461b(Context context, CancellationSignal cancellationSignal, C113133l[] lVarArr, int i) {
        Object obj;
        Typeface j;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!(this.f355233h != null)) {
            C113133l f = mo183470f(lVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f.f338532a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.f338534c).setItalic(f.f338535d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (C113133l lVar : lVarArr) {
                if (lVar.f338536e == 0) {
                    Uri uri = lVar.f338532a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, C90886k.m114012e(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f355232g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            boolean z2 = false;
            for (C113133l lVar2 : lVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f338532a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f355234i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(lVar2.f338533b), null, Integer.valueOf(lVar2.f338534c), Integer.valueOf(lVar2.f338535d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            this.f355236k.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                        }
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                try {
                    this.f355236k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                }
                return null;
            } else if (mo183465k(obj) && (j = mo183464j(obj)) != null) {
                return Typeface.create(j, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: d */
    public Typeface mo183462d(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (!(this.f355233h != null)) {
            return super.mo183462d(context, resources, i, str, i2);
        }
        try {
            obj = this.f355232g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!mo183463i(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f355236k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!mo183465k(obj)) {
            return null;
        } else {
            return mo183464j(obj);
        }
    }

    /* renamed from: i */
    public final boolean mo183463i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f355233h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public Typeface mo183464j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f355231f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f355237l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean mo183465k(Object obj) {
        try {
            return ((Boolean) this.f355235j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public Method mo183466l(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: m */
    public Method mo183467m(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: n */
    public Method mo183468n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
