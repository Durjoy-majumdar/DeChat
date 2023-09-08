package hi3;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import gi3.C24542c;
import ii3.C87738a;
import ii3.C87739b;
import ii3.C87740c;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: hi3.e */
public class C87520e {

    /* renamed from: a */
    public static volatile C87523c f253545a;

    /* renamed from: b */
    public static LongSparseArray<Drawable.ConstantState>[] f253546b;

    /* renamed from: c */
    public static LongSparseArray<Drawable.ConstantState> f253547c;

    /* renamed from: d */
    public static C87525e<Drawable.ConstantState> f253548d;

    /* renamed from: e */
    public static C87525e<Drawable.ConstantState> f253549e;

    /* renamed from: f */
    public static LongSparseArray<C87522b> f253550f;

    /* renamed from: g */
    public static C87521a f253551g;

    /* renamed from: h */
    public static Application f253552h;

    /* renamed from: i */
    public static Resources f253553i;

    /* renamed from: j */
    public static String f253554j;

    /* renamed from: k */
    public static Class<?> f253555k;

    /* renamed from: l */
    public static volatile boolean f253556l;

    /* renamed from: m */
    public static Map<WeakReference<Resources>, Map<Long, Integer>> f253557m = new HashMap();

    /* renamed from: n */
    public static ThreadLocal<Boolean> f253558n = new ThreadLocal<>();

    /* renamed from: o */
    public static final boolean f253559o = "xiaomi".equalsIgnoreCase(Build.BRAND);

    /* renamed from: p */
    public static final byte[] f253560p = new byte[0];

    /* renamed from: q */
    public static TypedValue f253561q = new TypedValue();

    /* renamed from: r */
    public static Method f253562r = null;

    /* renamed from: s */
    public static Method f253563s = null;

    /* renamed from: hi3.e$a */
    public static class C87521a {

        /* renamed from: a */
        public Field f253564a;

        /* renamed from: b */
        public Method f253565b;

        /* renamed from: c */
        public boolean f253566c = false;

        public C87521a() {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i <= 28) {
                    if (i != 28 || Build.VERSION.PREVIEW_SDK_INT == 0) {
                        mo121988b();
                        return;
                    }
                }
                C87740c.m109159b("MicroMsg.SVGResourceLoader", "below 28", new Object[0]);
            } catch (Throwable th) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", th, "", new Object[0]);
            }
        }

        /* renamed from: a */
        public String mo121987a(AssetManager assetManager, long j) {
            if (!this.f253566c) {
                return null;
            }
            int i = (int) (j >> 32);
            int i2 = (int) (j & Util.MAX_32BIT_VALUE);
            try {
                Object obj = ((Object[]) this.f253564a.get(assetManager))[i - 1];
                return (String) this.f253565b.invoke(obj, new Object[]{Integer.valueOf(i2)});
            } catch (Throwable th) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", th, "", new Object[0]);
                return null;
            }
        }

        /* renamed from: b */
        public final void mo121988b() {
            Field declaredField = AssetManager.class.getDeclaredField("mApkAssets");
            this.f253564a = declaredField;
            declaredField.setAccessible(true);
            Method declaredMethod = Class.forName("android.content.res.ApkAssets").getDeclaredMethod("getStringFromPool", new Class[]{Integer.TYPE});
            this.f253565b = declaredMethod;
            declaredMethod.setAccessible(true);
            this.f253566c = true;
        }
    }

    /* renamed from: hi3.e$b */
    public static final class C87522b {

        /* renamed from: a */
        public Drawable.ConstantState f253567a;

        /* renamed from: b */
        public boolean f253568b;

        public C87522b(Drawable.ConstantState constantState, boolean z) {
            this.f253567a = constantState;
            this.f253568b = z;
        }
    }

    /* renamed from: hi3.e$c */
    public static class C87523c {

        /* renamed from: a */
        public Application f253569a;

        /* renamed from: b */
        public Resources f253570b;

        /* renamed from: c */
        public TypedValue f253571c = new TypedValue();

        /* renamed from: d */
        public Map<Integer, C24542c> f253572d;

        public C87523c(Map<Integer, C24542c> map, Application application, Resources resources) {
            this.f253572d = map;
            this.f253569a = application;
            this.f253570b = resources;
        }

        /* renamed from: a */
        public void mo121989a(Integer num, C24542c cVar) {
            if (cVar != null) {
                this.f253572d.put(num, cVar);
            }
            C87520e.m108844b(this.f253569a, this.f253570b, num.intValue(), this.f253571c);
        }
    }

    /* renamed from: hi3.e$e */
    public static class C87525e<T> extends LongSparseArray<T> {

        /* renamed from: d */
        public LongSparseArray<T> f253577d = null;

        public void clear() {
            super.clear();
            C87740c.m109159b("MicroMsg.SVGLongSparseArray", "Found u! clear.", new Object[0]);
        }

        public void delete(long j) {
            super.delete(j);
            C87740c.m109159b("MicroMsg.SVGLongSparseArray", "Found u! delete key %s", Long.valueOf(j));
        }

        public T get(long j, T t) {
            C87522b a;
            boolean z = false;
            if (C87520e.f253558n.get() == null || !C87520e.f253558n.get().booleanValue()) {
                synchronized (this.f253577d) {
                    if (this.f253577d.indexOfKey(j) >= 0) {
                        T t2 = this.f253577d.get(j, t);
                        if (Build.VERSION.SDK_INT >= 28 && C87520e.f253559o) {
                            z = true;
                        }
                        if (z && (a = C87520e.m108843a(j, (C87524d) t2)) != null) {
                            t2 = !a.f253568b ? a.f253567a : null;
                        }
                        if (t2 != null) {
                            return t2;
                        }
                    }
                }
            } else {
                C87740c.m109158a("MicroMsg.SVGLongSparseArray", "Skip svg this time for key %s", Long.valueOf(j));
            }
            return super.get(j, t);
        }

        public void remove(long j) {
            super.remove(j);
            C87740c.m109159b("MicroMsg.SVGLongSparseArray", "Found u! remove key %s", Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static C87522b m108843a(long j, C87524d dVar) {
        TypedValue typedValue;
        C87522b bVar;
        long j2 = j;
        C87524d dVar2 = dVar;
        try {
            LongSparseArray<C87522b> longSparseArray = f253550f;
            if (longSparseArray == null || longSparseArray.indexOfKey(j2) < 0) {
                byte[] bArr = f253560p;
                synchronized (bArr) {
                    typedValue = f253561q;
                    if (typedValue != null) {
                        f253561q = null;
                    } else {
                        typedValue = null;
                    }
                }
                if (typedValue == null) {
                    typedValue = new TypedValue();
                }
                dVar2.f253575c.getValue(dVar2.f253573a, typedValue, true);
                long j3 = ((long) typedValue.assetCookie) << 32;
                int i = typedValue.data;
                if (j2 == (j3 | ((long) i))) {
                    synchronized (bArr) {
                        if (f253561q == null) {
                            f253561q = typedValue;
                        }
                    }
                    return null;
                }
                synchronized (bArr) {
                    if (f253561q == null) {
                        f253561q = typedValue;
                    }
                }
                Object[] objArr = {Integer.valueOf(dVar2.f253573a), Long.valueOf(j), Integer.valueOf(i)};
                if (C87740c.f254036a != null) {
                    Log.m105929w("MicroMsg.SVGResourceLoader", "Found a res need justify, %s %s %s", objArr);
                }
                if (f253551g == null) {
                    f253551g = new C87521a();
                }
                String a = f253551g.mo121987a(f253553i.getAssets(), j2);
                if (a == null) {
                    return null;
                }
                if (!a.endsWith(".svg")) {
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "Found a res not SVG, %s %s", Long.valueOf(j), a);
                    bVar = new C87522b((Drawable.ConstantState) null, true);
                } else {
                    String substring = a.substring(a.lastIndexOf("/") + 1, a.lastIndexOf("."));
                    int identifier = dVar2.f253575c.getIdentifier(substring, ShareConstants.DEXMODE_RAW, f253552h.getPackageName());
                    if (identifier == 0) {
                        C87740c.m109160c("MicroMsg.SVGResourceLoader", "Justified SVG failed, %s %s %s", Integer.valueOf(identifier), Long.valueOf(j), substring);
                        return null;
                    }
                    if (f253550f == null) {
                        f253550f = new LongSparseArray<>();
                    }
                    Resources resources = dVar2.f253575c;
                    C87524d dVar3 = r1;
                    C87524d dVar4 = new C87524d(identifier, resources, j, i);
                    C87522b bVar2 = new C87522b(dVar3, false);
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "Justified SVG done, %s %s %s", Integer.valueOf(identifier), Long.valueOf(j), substring);
                    f253550f.put(j2, bVar2);
                    return bVar2;
                }
            } else {
                bVar = f253550f.get(j2);
            }
            return bVar;
        } catch (Throwable th) {
            C87740c.m109161d("MicroMsg.SVGResourceLoader", th, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static void m108844b(Application application, Resources resources, int i, TypedValue typedValue) {
        if (i == 0) {
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "preloadDrawable Why this id is %d. TypedValue %s", Integer.valueOf(i), typedValue);
            C87740c.m109160c("MicroMsg.SVGResourceLoader", android.util.Log.getStackTraceString(new Throwable()), new Object[0]);
        }
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        C87524d dVar = new C87524d(i, application.getResources(), j, typedValue.data);
        synchronized (f253547c) {
            f253547c.put(j, dVar);
        }
    }

    /* renamed from: c */
    public static void m108845c(Context context, Object obj) {
        Object a = new C87738a(obj, "sPreloadedDrawables", (String) null).mo122148a();
        if (a == null) {
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is null!! OMG!!!", new Object[0]);
        } else if (a instanceof LongSparseArray[]) {
            LongSparseArray<Drawable.ConstantState>[] longSparseArrayArr = (LongSparseArray[]) a;
            f253546b = longSparseArrayArr;
            C87740c.m109158a("MicroMsg.SVGResourceLoader", "sPreloadDrawable content: %s ", longSparseArrayArr[0]);
            for (int i = 0; i < f253546b[0].size(); i++) {
                long keyAt = f253546b[0].keyAt(i);
                f253548d.put(keyAt, f253546b[0].get(keyAt));
            }
            for (int i2 = 0; i2 < f253546b[1].size(); i2++) {
                long keyAt2 = f253546b[1].keyAt(i2);
                f253549e.put(keyAt2, f253546b[1].get(keyAt2));
            }
            LongSparseArray<Drawable.ConstantState>[] longSparseArrayArr2 = f253546b;
            longSparseArrayArr2[0] = f253548d;
            longSparseArrayArr2[1] = f253549e;
        } else if (a instanceof LongSparseArray) {
            C87738a aVar = new C87738a(context.getResources(), "sPreloadedDrawables", (String) null);
            LongSparseArray longSparseArray = (LongSparseArray) aVar.mo122148a();
            for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                long keyAt3 = longSparseArray.keyAt(i3);
                f253548d.put(keyAt3, (Drawable.ConstantState) longSparseArray.get(keyAt3));
            }
            C87525e<Drawable.ConstantState> eVar = f253548d;
            aVar.mo122149b();
            Field field = aVar.f254031d;
            if (field != null) {
                field.set(aVar.f254028a, eVar);
                if (aVar.mo122148a() == null) {
                    C87740c.m109159b("MicroMsg.SVGResourceLoader", "resourcePreloadDrawable is null!! OMG!!", new Object[0]);
                    return;
                }
                return;
            }
            throw new NoSuchFieldException();
        } else {
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is others!! OMG!", new Object[0]);
        }
    }

    /* renamed from: d */
    public static C87523c m108846d(Application application, Resources resources) {
        if (f253545a == null) {
            synchronized (C87520e.class) {
                if (f253545a == null) {
                    f253545a = new C87523c(C87515a.f253526d, application, resources);
                }
            }
        }
        return f253545a;
    }

    /* renamed from: e */
    public static void m108847e(Application application, String str) {
        f253554j = str;
        C87515a.f253525c = str;
        float f = application.getResources().getDisplayMetrics().density;
        if (C87515a.f253529g == null) {
            C87515a.f253529g = Float.valueOf(f / 3.0f);
        }
        C87515a.f253529g.floatValue();
        Log.m105925i("MicroMsg.SVGCompat", "initDensity -> %s", Float.valueOf(f));
        C87739b.f254032a = str;
        f253552h = application;
        m108852j(application);
    }

    /* renamed from: f */
    public static Drawable m108848f(Resources resources, int i) {
        Resources resources2 = resources;
        Class<String> cls = String.class;
        TypedValue typedValue = new TypedValue();
        resources2.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        ColorDrawable colorDrawable = i2 >= 28 && i2 <= 31 ? new ColorDrawable(typedValue.data) : null;
        if (f253562r == null) {
            Class<Resources> cls2 = Resources.class;
            try {
                Class cls3 = Integer.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("loadXmlResourceParser", new Class[]{cls, cls3, cls3, cls});
                f253562r = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e, "", new Object[0]);
                Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e, "", new Object[0]);
                return null;
            }
        }
        if (f253563s == null) {
            Class<AssetManager> cls4 = AssetManager.class;
            try {
                Class cls5 = Integer.TYPE;
                Method declaredMethod2 = cls4.getDeclaredMethod("openNonAsset", new Class[]{cls5, cls, cls5});
                f253563s = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e2, "", new Object[0]);
                Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e2, "", new Object[0]);
                return null;
            }
        }
        if (colorDrawable != null) {
            return colorDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.endsWith(".xml")) {
                try {
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) f253562r.invoke(resources2, new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(typedValue.assetCookie), "drawable"});
                    Drawable createFromXml = Drawable.createFromXml(resources2, xmlResourceParser);
                    xmlResourceParser.close();
                    return createFromXml;
                } catch (Exception e3) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e3);
                    throw notFoundException;
                }
            } else {
                try {
                    InputStream inputStream = (InputStream) f253563s.invoke(resources.getAssets(), new Object[]{Integer.valueOf(typedValue.assetCookie), charSequence2, 2});
                    Drawable createFromResourceStream = Drawable.createFromResourceStream(resources2, typedValue, inputStream, charSequence2, (BitmapFactory.Options) null);
                    inputStream.close();
                    return createFromResourceStream;
                } catch (Exception e4) {
                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + Integer.toHexString(i));
                    notFoundException2.initCause(e4);
                    throw notFoundException2;
                }
            }
        } else {
            throw new Resources.NotFoundException("Resource is not a Drawable (color or path): " + typedValue);
        }
    }

    /* renamed from: g */
    public static void m108849g(Application application, Resources resources, Class<C87519d> cls) {
        f253552h = application;
        f253553i = resources;
        if (cls != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                cls.newInstance().load(m108846d(application, f253553i));
                C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVGCode wrapper size %s, spent %s", Integer.valueOf(m108846d(application, f253553i).f253572d.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Resources.NotFoundException e) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", e, "We found one NotFoundException.", new Object[0]);
            }
        }
    }

    /* renamed from: h */
    public static void m108850h(Application application, Resources resources) {
        Class<?> cls = f253555k;
        if (cls == null) {
            try {
                cls = Class.forName(f253554j + ".R$raw");
            } catch (ClassNotFoundException unused) {
                Object a = C87739b.m109156a("WxSVGRawClass");
                cls = a != null ? (Class) a : null;
                if (cls == null) {
                    cls = null;
                }
            }
        }
        if (cls == null) {
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "Raw class is null!", new Object[0]);
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        C87523c d = m108846d(application, resources);
        try {
            C87515a aVar = new C87515a();
            for (Field field : declaredFields) {
                int i = field.getInt((Object) null);
                if (aVar.mo121968f(application.getResources(), i)) {
                    m108844b(d.f253569a, d.f253570b, i, d.f253571c);
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException unused2) {
        }
    }

    /* renamed from: i */
    public static boolean m108851i(Application application, Resources resources) {
        String str = f253554j + ".svg.SVGPreload";
        try {
            C87740c.m109160c("MicroMsg.SVGResourceLoader", "try to load SVGPreload", new Object[0]);
            Class<?> cls = Class.forName(str);
            long nanoTime = System.nanoTime();
            m108849g(application, resources, cls);
            C87740c.m109160c("MicroMsg.SVGResourceLoader", "load SVGPreload spent %s", Long.valueOf((System.nanoTime() - nanoTime) / 1000));
            return true;
        } catch (ClassNotFoundException unused) {
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "ClassNotFoundException %s. Go fallback logic.", str);
            return false;
        } catch (InstantiationException e) {
            C87740c.m109161d("MicroMsg.SVGResourceLoader", e, "", new Object[0]);
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "InstantiationException %s", str);
            return false;
        } catch (IllegalAccessException e2) {
            C87740c.m109159b("MicroMsg.SVGResourceLoader", "IllegalAccessException %s", str);
            C87740c.m109161d("MicroMsg.SVGResourceLoader", e2, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: j */
    public static void m108852j(Context context) {
        Object obj;
        if (f253548d == null) {
            try {
                f253547c = new LongSparseArray<>();
                C87525e<Drawable.ConstantState> eVar = new C87525e<>();
                f253548d = eVar;
                eVar.f253577d = f253547c;
                C87525e<Drawable.ConstantState> eVar2 = new C87525e<>();
                f253549e = eVar2;
                eVar2.f253577d = f253547c;
                if (Build.VERSION.SDK_INT >= 23) {
                    C87738a aVar = new C87738a(context.getResources(), "mResourcesImpl", (String) null);
                    aVar.mo122149b();
                    obj = aVar.f254031d != null ? aVar.mo122148a() : context.getResources();
                } else {
                    obj = context.getResources();
                }
                m108845c(context, obj);
                C87740c.m109160c("MicroMsg.SVGResourceLoader", "SVG this resources %s", context.getResources());
            } catch (NoSuchFieldException e) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", e, "Call reflectPreloadCache failed. Reason : NoSuchFieldException.", new Object[0]);
            } catch (IllegalAccessException e2) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", e2, "Call reflectPreloadCache failed. Reason : IllegalAccessException.", new Object[0]);
            } catch (IllegalArgumentException e3) {
                C87740c.m109161d("MicroMsg.SVGResourceLoader", e3, "Call reflectPreloadCache failed. Reason : IllegalArgumentException.", new Object[0]);
            }
        }
    }

    /* renamed from: hi3.e$d */
    public static class C87524d extends Drawable.ConstantState {

        /* renamed from: a */
        public int f253573a = 0;

        /* renamed from: b */
        public long f253574b = 0;

        /* renamed from: c */
        public Resources f253575c;

        /* renamed from: d */
        public int f253576d = 0;

        public C87524d(int i, Resources resources, long j, int i2) {
            if (i == 0) {
                C87740c.m109159b("MicroMsg.SVGResourceLoader", "SVGConstantState Why this id is %d. TypedValue %s", Integer.valueOf(i));
                C87740c.m109160c("MicroMsg.SVGResourceLoader", android.util.Log.getStackTraceString(new Throwable()), new Object[0]);
            }
            this.f253573a = i;
            this.f253575c = resources;
            this.f253574b = j;
            this.f253576d = i2;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            Map map;
            try {
                Iterator it = ((HashMap) C87520e.f253557m).keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        map = null;
                        break;
                    }
                    WeakReference weakReference = (WeakReference) it.next();
                    Resources resources2 = (Resources) weakReference.get();
                    if (resources2 != null && resources2 == resources) {
                        map = (Map) ((HashMap) C87520e.f253557m).get(weakReference);
                        break;
                    }
                }
                if (map != null) {
                    int intValue = ((Integer) map.get(Long.valueOf(this.f253574b))).intValue();
                    Drawable f = C87520e.m108848f(resources, intValue);
                    C87740c.m109160c("MicroMsg.SVGResourceLoader", "loadDrawableSkipCache id:" + Integer.toHexString(intValue) + ",drawable:" + f, new Object[0]);
                    return f;
                }
            } catch (Exception e) {
                C87740c.m109160c("MicroMsg.SVGResourceLoader", "newDrawable loadDrawableSkipCache error:" + e.getMessage(), new Object[0]);
            }
            return newDrawable();
        }

        public Drawable newDrawable() {
            C87740c.m109160c("MicroMsg.SVGResourceLoader", "newDrawable mResources %s %s %s %s", this.f253575c, Integer.valueOf(this.f253573a), Long.valueOf(this.f253574b), Integer.valueOf(this.f253576d));
            return C87515a.m108835e(this.f253575c, this.f253573a, 0.0f);
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return newDrawable(resources);
        }
    }
}
