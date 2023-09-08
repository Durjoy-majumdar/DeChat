package p853i4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import j20.C117292a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: i4.v */
public class C108360v {

    /* renamed from: a */
    public static final C108366z f324401a;

    /* renamed from: b */
    public static Field f324402b;

    /* renamed from: c */
    public static boolean f324403c;

    /* renamed from: d */
    public static final Property<View, Float> f324404d = new C108361a(Float.class, "translationAlpha");

    /* renamed from: e */
    public static final Property<View, Rect> f324405e = new C108362b(Rect.class, "clipBounds");

    /* renamed from: i4.v$a */
    public static class C108361a extends Property<View, Float> {
        public C108361a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(C108360v.f324401a.mo158854a((View) obj));
        }

        public void set(Object obj, Object obj2) {
            C108360v.m146765c((View) obj, ((Float) obj2).floatValue());
        }
    }

    /* renamed from: i4.v$b */
    public static class C108362b extends Property<View, Rect> {
        public C108362b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            return C107207u.C107210d.m145203a((View) obj);
        }

        public void set(Object obj, Object obj2) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107210d.m145205c((View) obj, (Rect) obj2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            f324401a = new C108365y();
        } else {
            f324401a = new C108364x();
        }
    }

    /* renamed from: a */
    public static void m146763a(View view, Matrix matrix) {
        ((C108364x) f324401a).getClass();
        if (!C108364x.f324415j) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", new Class[]{Matrix.class});
                C108364x.f324414i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C108364x.f324415j = true;
        }
        Method method = C108364x.f324414i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (InvocationTargetException unused2) {
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public static void m146764b(View view, int i, int i2, int i3, int i4) {
        f324401a.mo158857b(view, i, i2, i3, i4);
    }

    /* renamed from: c */
    public static void m146765c(View view, float f) {
        ((C108363w) f324401a).getClass();
        if (!C108363w.f324407b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                C108363w.f324406a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C108363w.f324407b = true;
        }
        Method method = C108363w.f324406a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            C117292a.m165358d(view, aVar.mo10232b(), "androidx/transition/ViewUtilsApi19", "setTransitionAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "androidx/transition/ViewUtilsApi19", "setTransitionAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: d */
    public static void m146766d(View view, int i) {
        if (!f324403c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f324402b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f324403c = true;
        }
        Field field = f324402b;
        if (field != null) {
            try {
                f324402b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
