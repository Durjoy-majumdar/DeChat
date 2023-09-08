package ip1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabProvider;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ls1.C10647i;
import ls1.C10648k;
import ls1.C61391g;
import ls1.C61393j;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ip1.a */
public final class C60571a extends FinderTabUIC {

    /* renamed from: t */
    public final int f172646t = getIntent().getIntExtra("request_type", 0);

    /* renamed from: u */
    public final C13601g f172647u = C36568h.m40985a(new C60576g(this));

    /* renamed from: v */
    public final C13601g f172648v = C36568h.m40985a(new C60575f(this));

    /* renamed from: w */
    public final C13601g f172649w = C36568h.m40985a(new C60574e(this));

    /* renamed from: x */
    public FinderMixSearchPresenter f172650x;

    /* renamed from: y */
    public boolean f172651y;

    /* renamed from: ip1.a$b */
    public static final class C9233b extends C10647i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9233b(String str) {
            super((CharSequence) str);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        }

        /* renamed from: a */
        public int mo3852a() {
            return C0966R.C0971layout.bqx;
        }

        /* renamed from: b */
        public int[] mo3853b() {
            return new int[]{0, 0};
        }
    }

    /* renamed from: ip1.a$d */
    public static final class C9234d extends C10648k {
        /* renamed from: a */
        public void mo3858a(Context context, C61391g gVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(gVar, "tab");
            super.mo3858a(context, gVar);
            gVar.mo9047e(true);
        }

        /* renamed from: b */
        public void mo3859b(Context context, C61391g gVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(gVar, "tab");
            super.mo3859b(context, gVar);
            gVar.mo9047e(false);
        }
    }

    /* renamed from: ip1.a$a */
    public final class C60572a extends FinderTabProvider {
        public C60572a(C60571a aVar) {
            setTabContainer(new C60573c());
            setTabViewAction(new C9234d());
            setTabs(new LinkedList());
            setFragments(new LinkedList());
        }

        public boolean isDynamic() {
            return true;
        }
    }

    /* renamed from: ip1.a$c */
    public final class C60573c extends C61393j {
        public C60573c() {
        }

        /* renamed from: d */
        public View mo78527d() {
            return null;
        }

        /* renamed from: g */
        public int mo78528g() {
            return C0966R.C0970id.gkz;
        }

        public int getLayoutId() {
            return C60571a.this.f172646t == 13 ? C0966R.C0971layout.alx : C0966R.C0971layout.alw;
        }
    }

    /* renamed from: ip1.a$e */
    public static final class C60574e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C60571a f172653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60574e(C60571a aVar) {
            super(0);
            this.f172653d = aVar;
        }

        public Object invoke() {
            return this.f172653d.findViewById(C0966R.C0970id.brn);
        }
    }

    /* renamed from: ip1.a$f */
    public static final class C60575f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C60571a f172654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60575f(C60571a aVar) {
            super(0);
            this.f172654d = aVar;
        }

        public Object invoke() {
            return (TextView) ((View) ((C36570n) this.f172654d.f172647u).getValue()).findViewById(C0966R.C0970id.c2h);
        }
    }

    /* renamed from: ip1.a$g */
    public static final class C60576g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C60571a f172655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60576g(C60571a aVar) {
            super(0);
            this.f172655d = aVar;
        }

        public Object invoke() {
            return this.f172655d.getContext().findViewById(C0966R.C0970id.iyj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60571a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: l3 */
    public void mo78525l3() {
        boolean z = true;
        if (mo80041M3().size() <= 1 || this.f172651y) {
            HardTouchableLayout f = mo80038J3().mo86338f();
            if (f != null) {
                f.setVisibility(8);
            }
        } else {
            HardTouchableLayout f2 = mo80038J3().mo86338f();
            if (f2 != null) {
                f2.setVisibility(0);
            }
        }
        HardTouchableLayout f3 = mo80038J3().mo86338f();
        if (f3 == null || f3.getVisibility() != 0) {
            z = false;
        }
        if (z) {
            ((TextView) ((C36570n) this.f172648v).getValue()).setVisibility(8);
            View view = (View) ((C36570n) this.f172649w).getValue();
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        ((TextView) ((C36570n) this.f172648v).getValue()).setVisibility(0);
        View view3 = (View) ((C36570n) this.f172649w).getValue();
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: m3 */
    public IFinderTabProvider mo11417m3() {
        return new C60572a(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewPager viewPager = this.f162509g;
        if (viewPager instanceof FinderViewPager) {
            ((FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        mo78525l3();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60571a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
