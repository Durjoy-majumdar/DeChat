package aq3;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p157gk.C59491j;
import p157gk.C59492k;
import p248ug.C102029k0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: aq3.h */
public final class C92069h extends UIComponent implements View.OnClickListener {

    /* renamed from: d */
    public final C13601g f263601d;

    /* renamed from: e */
    public final C13601g f263602e;

    /* renamed from: f */
    public final C13601g f263603f;

    /* renamed from: g */
    public final C13601g f263604g;

    /* renamed from: h */
    public final C13601g f263605h;

    /* renamed from: i */
    public C53973z1 f263606i;

    /* renamed from: aq3.h$a */
    public static final class C92070a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92070a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263607d = appCompatActivity;
        }

        public Object invoke() {
            return this.f263607d.findViewById(C0966R.C0970id.mdn);
        }
    }

    /* renamed from: aq3.h$b */
    public static final class C92071b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92071b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263608d = appCompatActivity;
        }

        public Object invoke() {
            return this.f263608d.findViewById(C0966R.C0970id.mdm);
        }
    }

    /* renamed from: aq3.h$c */
    public static final class C92072c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92072c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263609d = appCompatActivity;
        }

        public Object invoke() {
            return this.f263609d.findViewById(C0966R.C0970id.mdp);
        }
    }

    /* renamed from: aq3.h$d */
    public static final class C92073d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263610d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92073d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263610d = appCompatActivity;
        }

        public Object invoke() {
            return this.f263610d.findViewById(C0966R.C0970id.f358443me0);
        }
    }

    /* renamed from: aq3.h$e */
    public static final class C92074e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f263611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92074e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f263611d = appCompatActivity;
        }

        public Object invoke() {
            return this.f263611d.findViewById(C0966R.C0970id.mdw);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92069h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f263601d = C36568h.m40985a(new C92072c(appCompatActivity));
        this.f263602e = C36568h.m40985a(new C92070a(appCompatActivity));
        this.f263603f = C36568h.m40985a(new C92074e(appCompatActivity));
        this.f263604g = C36568h.m40985a(new C92073d(appCompatActivity));
        this.f263605h = C36568h.m40985a(new C92071b(appCompatActivity));
    }

    /* renamed from: c3 */
    public final View mo126058c3() {
        Object value = ((C36570n) this.f263601d).getValue();
        C87412m.m108593f(value, "<get-funcLayout>(...)");
        return (View) value;
    }

    /* renamed from: d3 */
    public final void mo126059d3() {
        C53973z1 z1Var = this.f263606i;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        View c3 = mo126058c3();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = c3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "resetVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "resetVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f263606i = C53895h.m60466d(getMainScope(), C53872d1.f151119c, (C53934p0) null, new C28107i(this, (C15601d<? super C28107i>) null), 2, (Object) null);
    }

    public void onClick(View view) {
        Class cls = C92075j.class;
        Class cls2 = C92068g.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "v");
        C39818r rVar = C39818r.f106831a;
        long j = ((C92068g) rVar.mo62444c(getActivity()).mo75002a(cls2)).f263597i;
        int id = view.getId();
        if (id == C0966R.C0970id.mdn) {
            AppCompatActivity activity = getActivity();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C102029k0 k0Var = C59492k.f169999a;
            if (k0Var != null) {
                k0Var.mo137232s(activity, j);
            }
        } else {
            boolean z = false;
            if (id == C0966R.C0970id.mdw) {
                AppCompatActivity activity2 = getActivity();
                C87412m.m108594g(activity2, "context");
                C102029k0 k0Var2 = C59492k.f169999a;
                if (k0Var2 != null) {
                    k0Var2.mo137224k(j, 0, activity2);
                }
            } else if (id == C0966R.C0970id.f358443me0) {
                C92075j jVar = (C92075j) rVar.mo62444c(getActivity()).mo75002a(cls);
                C54295a0 a0Var = jVar.f263622q;
                C54295a0 a0Var2 = C54295a0.CUR_STATE_RUNNING;
                if (!(a0Var == a0Var2 || jVar.f263619n == a0Var2)) {
                    z = true;
                }
                if (z && ((C92068g) rVar.mo62444c(getActivity()).mo75002a(cls2)).mo126057c3() != null) {
                    ((C92075j) rVar.mo62444c(getActivity()).mo75002a(cls)).mo126065g3(j);
                }
            } else if (id == C0966R.C0970id.mdm) {
                AppCompatActivity activity3 = getActivity();
                C87412m.m108594g(activity3, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C102029k0 k0Var3 = C59492k.f169999a;
                if (k0Var3 != null) {
                    k0Var3.mo137227n(activity3, j);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C102029k0 k0Var = C59492k.f169999a;
        int i = 0;
        if (k0Var != null ? k0Var.mo137221h() : false) {
            Object value = ((C36570n) this.f263603f).getValue();
            C87412m.m108593f(value, "<get-searchView>(...)");
            View view = (View) value;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!C59491j.f169996a) {
            Object value2 = ((C36570n) this.f263605h).getValue();
            C87412m.m108593f(value2, "<get-enterGalleyView>(...)");
            View view2 = (View) value2;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ViewGroup.LayoutParams layoutParams = mo126058c3().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int i2 = layoutParams2.bottomMargin;
        AppCompatActivity activity = getActivity();
        C102029k0 k0Var2 = C59492k.f169999a;
        if (k0Var2 != null) {
            i = k0Var2.getNavigationBarHeight();
        }
        layoutParams2.bottomMargin = i2 + C76577a.m92151b(activity, i);
        mo126058c3().setLayoutParams(layoutParams2);
        Object value3 = ((C36570n) this.f263602e).getValue();
        C87412m.m108593f(value3, "<get-downloadView>(...)");
        ((View) value3).setOnClickListener(this);
        Object value4 = ((C36570n) this.f263604g).getValue();
        C87412m.m108593f(value4, "<get-moreView>(...)");
        ((View) value4).setOnClickListener(this);
        Object value5 = ((C36570n) this.f263605h).getValue();
        C87412m.m108593f(value5, "<get-enterGalleyView>(...)");
        ((View) value5).setOnClickListener(this);
        Object value6 = ((C36570n) this.f263603f).getValue();
        C87412m.m108593f(value6, "<get-searchView>(...)");
        ((View) value6).setOnClickListener(this);
        mo126059d3();
    }
}
