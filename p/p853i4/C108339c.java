package p853i4;

import android.view.View;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C60958c;
import k20.C9556a;

/* renamed from: i4.c */
public class C108339c implements C108341d {

    /* renamed from: b */
    public static Class<?> f324362b;

    /* renamed from: c */
    public static boolean f324363c;

    /* renamed from: d */
    public static Method f324364d;

    /* renamed from: e */
    public static boolean f324365e;

    /* renamed from: f */
    public static Method f324366f;

    /* renamed from: g */
    public static boolean f324367g;

    /* renamed from: a */
    public final View f324368a;

    public C108339c(View view) {
        this.f324368a = view;
    }

    public void setVisibility(int i) {
        View view = this.f324368a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "androidx/transition/GhostViewApi21", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "androidx/transition/GhostViewApi21", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
