package od1;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import md1.C10779c;
import od1.C11405h;
import p629ny.C76979h;
import pe3.C47465a;

/* renamed from: od1.a */
public class C11392a<T extends C47465a> extends C11407i<T> {

    /* renamed from: g */
    public FrameLayout f33519g;

    /* renamed from: h */
    public View f33520h;

    /* renamed from: i */
    public View f33521i;

    /* renamed from: j */
    public LinearLayout f33522j;

    /* renamed from: n */
    public LinearLayout f33523n;

    /* renamed from: o */
    public WeImageView f33524o;

    /* renamed from: p */
    public WeImageView f33525p;

    /* renamed from: q */
    public FrameLayout f33526q;

    /* renamed from: r */
    public TextView f33527r;

    /* renamed from: s */
    public AppBarLayout f33528s;

    /* renamed from: t */
    public View f33529t;

    /* renamed from: u */
    public C10779c f33530u;

    /* renamed from: v */
    public int f33531v;

    /* renamed from: w */
    public int f33532w;

    /* renamed from: x */
    public boolean f33533x;

    /* renamed from: y */
    public float f33534y;

    /* renamed from: z */
    public final int f33535z = C76577a.m92151b(getContext(), 72);

    /* renamed from: od1.a$a */
    public final class C11393a implements AppBarLayout.C67445c {
        public C11393a() {
        }

        /* renamed from: a */
        public void mo3128a(AppBarLayout appBarLayout, int i) {
            float f;
            C87412m.m108594g(appBarLayout, "view");
            float min = Math.min(1.0f, (((float) Math.abs(i)) * 1.0f) / ((float) C11392a.this.f33535z));
            C11392a<T> aVar = C11392a.this;
            if (!(min == aVar.f33534y)) {
                aVar.f33534y = min;
                if (min < 0.5f) {
                    f = (0.5f - min) / 0.5f;
                    View view = aVar.f33521i;
                    if (view != null) {
                        view.setBackgroundColor(aVar.f33531v);
                    }
                    FrameLayout frameLayout = C11392a.this.f33526q;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(0.0f);
                    }
                    C11392a.m11208k3(C11392a.this, min, f);
                } else {
                    f = (min - 0.5f) / 0.5f;
                    int i2 = (int) (((float) 255) * f);
                    View view2 = aVar.f33521i;
                    if (view2 != null) {
                        view2.setBackgroundColor(C74933u4.m89764a(aVar.f33532w, i2));
                    }
                    FrameLayout frameLayout2 = C11392a.this.f33526q;
                    if (frameLayout2 != null) {
                        frameLayout2.setAlpha(f);
                    }
                    C11392a.m11208k3(C11392a.this, min, f);
                }
                View view3 = C11392a.this.f33529t;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(min));
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$OnOffsetChangedListener", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                Log.m105924i("Finder.FinderTopicActionBarUIC", "alpha : " + f);
            }
        }
    }

    /* renamed from: od1.a$b */
    public static final class C11394b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11392a<T> f33537d;

        public C11394b(C11392a<T> aVar) {
            this.f33537d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f33537d.getActivity().isFinishing()) {
                this.f33537d.getActivity().finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: od1.a$c */
    public static final class C11395c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11392a<T> f33538d;

        public C11395c(C11392a<T> aVar) {
            this.f33538d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11392a<T> aVar = this.f33538d;
            if (aVar.f33530u == null) {
                C10779c l3 = aVar.mo310l3();
                aVar.f33530u = l3;
                if (l3 != null) {
                    l3.mo11014e();
                }
            }
            C10779c cVar = aVar.f33530u;
            if (cVar != null) {
                cVar.mo11018i();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11392a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f33531v = appCompatActivity.getResources().getColor(C0966R.color.ahf);
        this.f33532w = appCompatActivity.getResources().getColor(C0966R.color.f3387r0);
    }

    /* renamed from: k3 */
    public static final void m11208k3(C11392a aVar, float f, float f2) {
        if (((double) f) < 0.5d) {
            aVar.mo11403n3(aVar.f33527r, 4);
        } else {
            aVar.mo11403n3(aVar.f33527r, 0);
        }
        LinearLayout linearLayout = aVar.f33522j;
        if (linearLayout != null) {
            linearLayout.setAlpha(f2);
        }
        LinearLayout linearLayout2 = aVar.f33523n;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(f2);
        }
    }

    /* renamed from: c2 */
    public void mo513c2() {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(true);
        int color = getResources().getColor(C0966R.color.f3390r5);
        WeImageView weImageView = this.f33524o;
        if (weImageView != null) {
            weImageView.setIconColor(color);
        }
        WeImageView weImageView2 = this.f33525p;
        if (weImageView2 != null) {
            weImageView2.setIconColor(color);
        }
        TextView textView = this.f33527r;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(C0966R.color.f3386qz));
        }
        this.f33532w = getActivity().getResources().getColor(C0966R.color.f3387r0);
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        View view;
        if (!this.f33533x && (view = this.f33521i) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LinearLayout linearLayout = this.f33522j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f33523n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(4);
        }
        WeImageView weImageView = this.f33524o;
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(C0966R.color.f3133gi));
        }
        View findViewById = getActivity().findViewById(C0966R.C0970id.i7c);
        if (findViewById != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(C85875k4.m106211z());
        View view3 = this.f33520h;
        if (view3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f3 */
    public void mo314f3() {
        super.mo314f3();
        this.f33519g = (FrameLayout) getActivity().findViewById(C0966R.C0970id.e4o);
        this.f33520h = getActivity().findViewById(C0966R.C0970id.btl);
        this.f33528s = (AppBarLayout) getActivity().findViewById(C0966R.C0970id.f6070wg);
        View findViewById = getActivity().findViewById(C0966R.C0970id.f5527hg);
        this.f33521i = findViewById;
        if (this.f33533x) {
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            FrameLayout frameLayout = this.f33519g;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        this.f33526q = (FrameLayout) getActivity().findViewById(C0966R.C0970id.i7c);
        this.f33527r = (TextView) getActivity().findViewById(C0966R.C0970id.f5456fm);
        this.f33524o = (WeImageView) getActivity().findViewById(C0966R.C0970id.d6t);
        LinearLayout linearLayout = (LinearLayout) getActivity().findViewById(C0966R.C0970id.d6s);
        LinearLayout linearLayout2 = null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C11394b(this));
        } else {
            linearLayout = null;
        }
        this.f33522j = linearLayout;
        this.f33525p = (WeImageView) getActivity().findViewById(C0966R.C0970id.d6v);
        LinearLayout linearLayout3 = (LinearLayout) getActivity().findViewById(C0966R.C0970id.d6u);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new C11395c(this));
            linearLayout2 = linearLayout3;
        }
        this.f33523n = linearLayout2;
        this.f33529t = getActivity().findViewById(C0966R.C0970id.f5500gu);
        setNormalStyle();
    }

    /* renamed from: i3 */
    public void mo515i3(T t) {
        super.mo515i3(t);
        TextView textView = this.f33527r;
        if (textView != null) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getActivity(), mo311m3()));
        }
    }

    /* renamed from: j3 */
    public void mo315j3() {
        View view;
        C11405h.C11406a.m11254b(this);
        View view2 = this.f33520h;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.f33533x && (view = this.f33521i) != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: l3 */
    public C10779c mo310l3() {
        return new C10779c(getActivity());
    }

    /* renamed from: m3 */
    public String mo311m3() {
        return "";
    }

    /* renamed from: n3 */
    public final void mo11403n3(View view, int i) {
        if (!(view != null && view.getVisibility() == i) && view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onCreate(Bundle bundle) {
        AppBarLayout appBarLayout;
        this.f33533x = getIntent().getBooleanExtra("key_drawer_mode", false);
        super.onCreate(bundle);
        View decorView = getActivity().getWindow().getDecorView();
        C87412m.m108593f(decorView, "activity.window.decorView");
        decorView.setSystemUiVisibility(1280);
        C74779i.m89536a(getActivity(), false);
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        float dimension = getActivity().getResources().getDimension(C0966R.dimen.f3679b9);
        int f = C75044y4.m89994f(getActivity());
        if (!this.f33533x) {
            int b = C60641c.m70921b(dimension + ((float) f));
            View view = this.f33521i;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = b;
                view.setLayoutParams(layoutParams);
                view.setPadding(0, f, 0, 0);
            }
            FrameLayout frameLayout = this.f33519g;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                layoutParams2.height = b;
                frameLayout.setLayoutParams(layoutParams2);
                FrameLayout frameLayout2 = this.f33565e;
                if (frameLayout2 != null) {
                    frameLayout2.setMinimumHeight(b);
                }
            }
        }
        FrameLayout frameLayout3 = this.f33526q;
        if (frameLayout3 != null) {
            frameLayout3.setAlpha(0.0f);
        }
        if (!this.f33533x && (appBarLayout = this.f33528s) != null) {
            C11393a aVar = new C11393a();
            aVar.mo3128a(appBarLayout, 0);
            appBarLayout.mo146159a(aVar);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C10779c cVar = this.f33530u;
        if (cVar != null) {
            cVar.mo11015f();
        }
    }

    public void setNormalStyle() {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(C85875k4.m106211z());
        int color = getResources().getColor(C0966R.color.f3133gi);
        WeImageView weImageView = this.f33524o;
        if (weImageView != null) {
            weImageView.setIconColor(color);
        }
        WeImageView weImageView2 = this.f33525p;
        if (weImageView2 != null) {
            weImageView2.setIconColor(color);
        }
        TextView textView = this.f33527r;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(C0966R.color.a7f));
        }
        this.f33532w = getActivity().getResources().getColor(C0966R.color.f2927a);
    }
}
