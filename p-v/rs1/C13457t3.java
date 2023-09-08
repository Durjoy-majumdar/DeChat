package rs1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eo1.C58638b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import os1.C11739f;
import rx3.C13601g;
import rx3.C36568h;
import te3.C51262sl1;

/* renamed from: rs1.t3 */
public final class C13457t3 extends UIComponent {

    /* renamed from: j */
    public static C51262sl1 f38149j;

    /* renamed from: n */
    public static long f38150n;

    /* renamed from: d */
    public final C13601g f38151d = C36568h.m40985a(new C13460c(this));

    /* renamed from: e */
    public final C13601g f38152e = C36568h.m40985a(C13459b.f38158d);

    /* renamed from: f */
    public final int f38153f = 4;

    /* renamed from: g */
    public boolean f38154g;

    /* renamed from: h */
    public boolean f38155h;

    /* renamed from: i */
    public boolean f38156i;

    /* renamed from: rs1.t3$a */
    public static final class C13458a implements C4194v2 {

        /* renamed from: d */
        public final /* synthetic */ C13457t3 f38157d;

        public C13458a(C13457t3 t3Var) {
            this.f38157d = t3Var;
        }

        /* renamed from: k */
        public void mo5077k(int i, int i2, int i3, int i4) {
            Class cls = FinderCommonFeatureService.class;
            View c3 = this.f38157d.mo12882c3();
            if (c3 != null) {
                C13457t3 t3Var = this.f38157d;
                if (c3.getVisibility() == 0 && t3Var.f38154g) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(c3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$onCreate$1", "onFragmentChange", "(IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(c3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$onCreate$1", "onFragmentChange", "(IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t3Var.mo12883d3();
                    if (i4 == t3Var.f38153f && t3Var.f38156i) {
                        C11739f.C11740a c35 = ((C11739f) C39818r.f106831a.mo62446e(cls).mo75002a(C11739f.class)).mo11600c3(t3Var.f38153f);
                        c35.f34376i = C11739f.C11742c.InCacheTime;
                        c35.f34374g = System.currentTimeMillis();
                        t3Var.f38156i = false;
                        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                        Nx0.mo77263e("finder_tl_hot_tab", "onLeftSlide");
                        Nx0.mo77239M5("finder_tl_hot_tab");
                    }
                }
            }
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        /* renamed from: v */
        public void mo5078v(boolean z, int i, FinderHomeTabFragment finderHomeTabFragment) {
            C87412m.m108594g(finderHomeTabFragment, "fragment");
        }
    }

    /* renamed from: rs1.t3$b */
    public static final class C13459b extends C87413o implements C32224a<C58638b> {

        /* renamed from: d */
        public static final C13459b f38158d = new C13459b();

        public C13459b() {
            super(0);
        }

        public Object invoke() {
            return new C58638b(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0(), "FinderFriendsLeftSlideGuideUIC");
        }
    }

    /* renamed from: rs1.t3$c */
    public static final class C13460c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13457t3 f38159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13460c(C13457t3 t3Var) {
            super(0);
            this.f38159d = t3Var;
        }

        public Object invoke() {
            return this.f38159d.findViewById(C0966R.C0970id.f358009d02);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13457t3(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final View mo12882c3() {
        return (View) this.f38151d.getValue();
    }

    /* renamed from: d3 */
    public final void mo12883d3() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USREINFO_FINDER_SLIDE_LEFT_TIPS_COUNT_INT_SYNC;
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i.mo119689j(aVar, 0) + 1));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((FinderHomeUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class)).f18653j.add(new C13458a(this));
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.e7o);
        if (viewStub != null) {
            viewStub.inflate();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        f38149j = null;
        View c3 = mo12882c3();
        if (c3 != null && c3.getVisibility() == 0 && this.f38154g) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(c3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(c3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo12883d3();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13457t3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
