package bl3;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C36570n;

/* renamed from: bl3.r */
public final class C39818r {

    /* renamed from: a */
    public static final C39818r f106831a = new C39818r();

    /* renamed from: b */
    public static final ConcurrentHashMap<Object, Object> f106832b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<Object, Object> f106833c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final Field f106834d;

    /* renamed from: bl3.r$a */
    public static final class C39819a extends C54209k0 {

        /* renamed from: c */
        public final C0123n0 f106835c;

        /* renamed from: d */
        public final Object f106836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39819a(C0123n0 n0Var, C54209k0.C54210b bVar) {
            super(n0Var.getViewModelStore(), bVar);
            C87412m.m108594g(n0Var, "owner");
            C87412m.m108594g(bVar, "factory");
            this.f106835c = n0Var;
            Object obj = C39818r.f106834d.get(n0Var.getViewModelStore());
            C87412m.m108591d(obj);
            this.f106836d = obj;
        }

        /* renamed from: c */
        public final <T extends C0316c> T mo62447c(Class<T> cls) {
            C87412m.m108594g(cls, "apiClass");
            C39818r.f106831a.getClass();
            Object obj = C39818r.f106832b.get(cls.getName());
            if (obj != null) {
                T a = mo75002a((Class) obj);
                C87412m.m108592e(a, "null cannot be cast to non-null type T of com.tencent.mm.ui.component.UICProvider.ViewModelProviderProxy.api");
                return (C0316c) a;
            }
            throw new RuntimeException(cls + " never import any instance.");
        }

        /* renamed from: d */
        public final <T extends C0316c> T mo62448d(Class<T> cls) {
            C87412m.m108594g(cls, "apiClass");
            C39818r.f106831a.getClass();
            Object obj = C39818r.f106832b.get(cls.getName());
            if (obj == null) {
                return null;
            }
            T e = mo62449e((Class) obj);
            if (e instanceof C0316c) {
                return (C0316c) e;
            }
            return null;
        }

        /* renamed from: e */
        public final <T extends C54495t> T mo62449e(Class<T> cls) {
            C87412m.m108594g(cls, "uicClass");
            Object obj = this.f106836d;
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, T of com.tencent.mm.ui.component.UICProvider.ViewModelProviderProxy.getOrNull>");
            T t = ((Map) obj).get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + cls.getCanonicalName());
            if (t == null) {
                C39630m0 viewModelStore = this.f106835c.getViewModelStore();
                C39812a0 a0Var = viewModelStore instanceof C39812a0 ? (C39812a0) viewModelStore : null;
                if (a0Var != null && ((HashSet) ((C36570n) a0Var.f106827f).getValue()).contains(cls)) {
                    Log.m105924i("UICProvider", "getOrNull: new instance uicClass=" + cls + ", lazyInitSize=" + ((HashSet) ((C36570n) a0Var.f106827f).getValue()).size());
                    t = mo75002a(cls);
                }
            }
            return (C54495t) t;
        }
    }

    /* renamed from: bl3.r$b */
    public static final class C39820b extends C54209k0.C39628d {

        /* renamed from: b */
        public final /* synthetic */ Fragment f106837b;

        public C39820b(Fragment fragment) {
            this.f106837b = fragment;
        }

        public <T extends C39622i0> T create(Class<T> cls) {
            T t;
            C87412m.m108594g(cls, "modelClass");
            if ((C54492n.class.isAssignableFrom(cls) ? cls : null) != null) {
                Fragment fragment = this.f106837b;
                try {
                    Result.Companion companion = Result.Companion;
                    t = Result.m168114constructorimpl((C39622i0) cls.getConstructor(new Class[]{Fragment.class}).newInstance(new Object[]{fragment}));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    t = Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
                Throwable r1 = Result.m168117exceptionOrNullimpl(t);
                if (r1 == null) {
                    ResultKt.throwOnFailure(t);
                    T t2 = (C39622i0) t;
                    if (t2 != null) {
                        return t2;
                    }
                } else {
                    throw new RuntimeException("Cannot create an instance of " + cls, r1);
                }
            }
            return super.create(cls);
        }
    }

    /* renamed from: bl3.r$c */
    public static final class C39821c extends C54209k0.C39628d {

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f106838b;

        public C39821c(AppCompatActivity appCompatActivity) {
            this.f106838b = appCompatActivity;
        }

        public <T extends C39622i0> T create(Class<T> cls) {
            T t;
            C87412m.m108594g(cls, "modelClass");
            if ((C54492n.class.isAssignableFrom(cls) ? cls : null) != null) {
                AppCompatActivity appCompatActivity = this.f106838b;
                try {
                    Result.Companion companion = Result.Companion;
                    t = Result.m168114constructorimpl((C39622i0) cls.getConstructor(new Class[]{AppCompatActivity.class}).newInstance(new Object[]{appCompatActivity}));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    t = Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
                Throwable r1 = Result.m168117exceptionOrNullimpl(t);
                if (r1 == null) {
                    ResultKt.throwOnFailure(t);
                    T t2 = (C39622i0) t;
                    if (t2 != null) {
                        return t2;
                    }
                } else {
                    throw new RuntimeException("Cannot create an instance of " + cls, r1);
                }
            }
            return super.create(cls);
        }
    }

    /* renamed from: bl3.r$d */
    public static final class C39822d extends C54209k0.C39628d {

        /* renamed from: b */
        public final /* synthetic */ P f106839b;

        public C39822d(P p) {
            this.f106839b = p;
        }

        public <T extends C39622i0> T create(Class<T> cls) {
            T t;
            C87412m.m108594g(cls, "modelClass");
            if ((C0327w.class.isAssignableFrom(cls) ? cls : null) != null) {
                P p = this.f106839b;
                try {
                    Result.Companion companion = Result.Companion;
                    T newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    C39622i0 i0Var = (C39622i0) newInstance;
                    C87412m.m108592e(i0Var, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentPlugin<P of com.tencent.mm.ui.component.UICProvider.of.<no name provided>.create$lambda-4$lambda-2$lambda-1>");
                    C87412m.m108594g(p, "<set-?>");
                    ((C0327w) i0Var).f902d = p;
                    t = Result.m168114constructorimpl((C39622i0) newInstance);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    t = Result.m168114constructorimpl(ResultKt.createFailure(th));
                }
                Throwable r1 = Result.m168117exceptionOrNullimpl(t);
                if (r1 == null) {
                    ResultKt.throwOnFailure(t);
                    T t2 = (C39622i0) t;
                    if (t2 != null) {
                        return t2;
                    }
                } else {
                    throw new RuntimeException("Cannot create an instance of " + cls, r1);
                }
            }
            return super.create(cls);
        }
    }

    static {
        Field declaredField = C39630m0.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        f106834d = declaredField;
    }

    /* renamed from: a */
    public final <T extends C39815b> T mo62442a(Class<T> cls) {
        C87412m.m108594g(cls, "t");
        Object obj = f106833c.get(cls.getName());
        Class cls2 = obj instanceof Class ? (Class) obj : null;
        if (cls2 != null) {
            cls2.isInterface();
            T newInstance = cls2.newInstance();
            C87412m.m108593f(newInstance, "clazz.newInstance()");
            return (C39815b) newInstance;
        }
        throw new RuntimeException(this + " never import any instance.");
    }

    /* renamed from: b */
    public final C39819a mo62443b(Context context) {
        C87412m.m108594g(context, "context");
        if (context instanceof AppCompatActivity) {
            return mo62444c((AppCompatActivity) context);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final C39819a mo62444c(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C39819a(appCompatActivity, new C39821c(appCompatActivity));
    }

    /* renamed from: d */
    public final C39819a mo62445d(Fragment fragment) {
        C87412m.m108594g(fragment, "fragment");
        return new C39819a(fragment, new C39820b(fragment));
    }

    /* renamed from: e */
    public final <P> C39819a mo62446e(Class<P> cls) {
        C87412m.m108594g(cls, "ownerClazz");
        P c = C7335d.class.isAssignableFrom(cls) ? C86312j.m106911c(cls) : null;
        if (c instanceof C0123n0) {
            return new C39819a((C0123n0) c, new C39822d(c));
        }
        throw new RuntimeException(c + ": " + cls + " cannot create ViewModelProvider failed.");
    }
}
