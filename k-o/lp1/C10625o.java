package lp1;

import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60206u1;
import j20.C117292a;
import java.lang.reflect.Method;
import k20.C60958c;
import k20.C9556a;
import up1.C37521f;

/* renamed from: lp1.o */
public final class C10625o extends C10623n {

    /* renamed from: A */
    public boolean f32022A;

    /* renamed from: B */
    public boolean f32023B = true;

    /* renamed from: y */
    public final int f32024y = getActivity().getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);

    /* renamed from: z */
    public C56437x0 f32025z;

    /* renamed from: lp1.o$a */
    public static final class C10626a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10625o f32026d;

        public C10626a(C10625o oVar) {
            this.f32026d = oVar;
        }

        public final void run() {
            C10625o oVar = this.f32026d;
            C56437x0 x0Var = oVar.f32025z;
            if (x0Var != null) {
                x0Var.mo75025b(oVar.f31972f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10625o(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: F3 */
    public long mo10882F3() {
        C37521f.f99374d.getClass();
        return C37521f.f99132B3.mo60266n().longValue();
    }

    /* renamed from: I3 */
    public void mo10884I3() {
        this.f32022A = true;
        C10605a.m10552d3(this, mo10883G3(), 260, 0.0f, 4, (Object) null);
    }

    /* renamed from: K3 */
    public final boolean mo10888K3(String str) {
        Class<? super C56437x0> superclass;
        Class<? super Object> superclass2;
        Method declaredMethod;
        try {
            if (!(this.f32025z == null || (superclass = C56437x0.class.getSuperclass()) == null || (superclass2 = superclass.getSuperclass()) == null || (declaredMethod = superclass2.getDeclaredMethod(str, new Class[0])) == null)) {
                declaredMethod.setAccessible(true);
                C56437x0 x0Var = this.f32025z;
                C87412m.m108592e(x0Var, "null cannot be cast to non-null type androidx.recyclerview.widget.SnapHelper");
                declaredMethod.invoke(x0Var, new Object[0]);
            }
            return true;
        } catch (Exception e) {
            Log.m105924i("FinderShareGuidePopupTipUIC", e.getMessage());
            return false;
        }
    }

    /* renamed from: c3 */
    public void mo10860c3(int i, long j, float f) {
        LinearInterpolator linearInterpolator;
        int i2 = -i;
        if (this.f32022A) {
            i2 += C74783i3.m89537a(getActivity()).f24705b;
            linearInterpolator = null;
        } else {
            linearInterpolator = new LinearInterpolator();
        }
        RecyclerView recyclerView = this.f31972f;
        if (recyclerView != null) {
            recyclerView.mo17122s1(0, i2, linearInterpolator);
        }
        View view = this.f31970d;
        if (view != null) {
            view.removeCallbacks(this.f32013r);
        }
        View view2 = this.f31970d;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f32023B) {
            mo10888K3("setupCallbacks");
        } else {
            RecyclerView recyclerView2 = this.f31972f;
            if (recyclerView2 != null) {
                recyclerView2.postDelayed(new C10626a(this), 260);
            }
        }
        this.f32017v = false;
    }

    /* renamed from: e3 */
    public int mo10861e3() {
        return 1;
    }

    /* renamed from: f3 */
    public int mo10862f3() {
        return C0966R.C0970id.n3s;
    }

    /* renamed from: i3 */
    public void mo10864i3(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.mo10864i3(recyclerView);
        View view = this.f31970d;
        if (view != null) {
            view.setPadding(0, 0, 0, this.f32024y);
        }
        View view2 = this.f31970d;
        if (view2 != null) {
            view2.setBackgroundResource(C0966R.C0969drawable.b_h);
        }
    }

    /* renamed from: m3 */
    public void mo10868m3(float f, long j) {
        if (!mo10888K3("destroyCallbacks")) {
            C56437x0 x0Var = this.f32025z;
            if (x0Var != null) {
                x0Var.mo75025b((RecyclerView) null);
            }
            RecyclerView recyclerView = this.f31972f;
            if (recyclerView != null) {
                recyclerView.setOnFlingListener((RecyclerView.C16633n) null);
            }
            this.f32023B = false;
        }
        RecyclerView recyclerView2 = this.f31972f;
        if (recyclerView2 != null) {
            recyclerView2.mo17122s1(0, mo10883G3(), new LinearInterpolator());
        }
    }

    /* renamed from: n3 */
    public boolean mo10869n3() {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (C37521f.f99423i4.mo60266n().intValue() != 1 && !((C60206u1) C86312j.m106911c(C60206u1.class)).Cw0()) {
            fVar.getClass();
            if (C37521f.f99141C3.mo60266n().intValue() == 0) {
                fVar.getClass();
                if (C37521f.f99123A3.mo60266n().intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10625o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
