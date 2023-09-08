package androidx.appcompat.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C103553n0;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.app.h */
public class C103416h implements C107204q {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDelegateImpl f305073a;

    public C103416h(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f305073a = appCompatDelegateImpl;
    }

    /* renamed from: a */
    public C107179f0 mo12075a(View view, C107179f0 f0Var) {
        int i;
        boolean z;
        View view2;
        C107179f0 f0Var2;
        boolean z2;
        int d = f0Var.mo157632d();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f305073a;
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.f305023s;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = d;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.f305023s.getLayoutParams();
            boolean z3 = true;
            if (appCompatDelegateImpl.f305023s.isShown()) {
                if (appCompatDelegateImpl.f305008U == null) {
                    appCompatDelegateImpl.f305008U = new Rect();
                    appCompatDelegateImpl.f305009V = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f305008U;
                Rect rect2 = appCompatDelegateImpl.f305009V;
                rect.set(0, d, 0, 0);
                ViewGroup viewGroup = appCompatDelegateImpl.f305028x;
                Method method = C103553n0.f305820a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception unused) {
                    }
                }
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? d : 0)) {
                    marginLayoutParams.topMargin = d;
                    View view3 = appCompatDelegateImpl.f305030z;
                    if (view3 == null) {
                        View view4 = new View(appCompatDelegateImpl.f305011d);
                        appCompatDelegateImpl.f305030z = view4;
                        view4.setBackgroundColor(appCompatDelegateImpl.f305011d.getResources().getColor(C0966R.color.alu));
                        appCompatDelegateImpl.f305028x.addView(appCompatDelegateImpl.f305030z, -1, new ViewGroup.LayoutParams(-1, d));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                        if (layoutParams.height != d) {
                            layoutParams.height = d;
                            appCompatDelegateImpl.f305030z.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (appCompatDelegateImpl.f305030z == null) {
                    z3 = false;
                }
                i = (appCompatDelegateImpl.f304993E || !z3) ? d : 0;
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i = d;
                z = false;
            } else {
                i = d;
                z = false;
                z3 = false;
            }
            if (z3) {
                appCompatDelegateImpl.f305023s.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = appCompatDelegateImpl.f305030z;
        if (view5 != null) {
            int i2 = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            View view6 = view5;
            C117292a.m165358d(view6, aVar.mo10232b(), "androidx/appcompat/app/AppCompatDelegateImpl", "updateStatusGuard", "(I)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "androidx/appcompat/app/AppCompatDelegateImpl", "updateStatusGuard", "(I)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (d != i) {
            f0Var2 = f0Var.mo157633e(f0Var.mo157630b(), i, f0Var.mo157631c(), f0Var.mo157629a());
            view2 = view;
        } else {
            view2 = view;
            f0Var2 = f0Var;
        }
        return C107207u.m145167h(view2, f0Var2);
    }
}
