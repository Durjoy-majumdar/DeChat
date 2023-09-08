package lp1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p282z2.C16095a;

/* renamed from: lp1.a */
public abstract class C10605a extends UIComponent {

    /* renamed from: d */
    public View f31970d;

    /* renamed from: e */
    public boolean f31971e;

    /* renamed from: f */
    public RecyclerView f31972f;

    /* renamed from: g */
    public FinderVideoLayout f31973g;

    /* renamed from: h */
    public ViewGroup f31974h;

    /* renamed from: i */
    public FinderFullSeekBarLayout f31975i;

    /* renamed from: j */
    public List<? extends BaseFinderFeed> f31976j;

    /* renamed from: n */
    public int f31977n = -1;

    /* renamed from: o */
    public int f31978o = -1;

    /* renamed from: p */
    public int f31979p;

    /* renamed from: lp1.a$a */
    public static final class C10606a extends RecyclerView.C0130p {

        /* renamed from: d */
        public float f31980d = 100.0f;

        /* renamed from: e */
        public final /* synthetic */ C10605a f31981e;

        public C10606a(C10605a aVar) {
            this.f31981e = aVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            FinderVideoLayout finderVideoLayout;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                RecyclerView recyclerView2 = this.f31981e.f31972f;
                RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int E = ((LinearLayoutManager) layoutManager).mo16959E();
                C10605a aVar = this.f31981e;
                if (aVar.f31971e && aVar.f31977n > 0 && E == 0 && (finderVideoLayout = aVar.f31973g) != null && !finderVideoLayout.mo79599y()) {
                    finderVideoLayout.mo79600z(false, true);
                }
                aVar.f31977n = E;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            float f = this.f31980d - (((float) i2) / 5.0f);
            this.f31980d = f;
            float a = C16095a.m14979a(f, 0.0f, 100.0f);
            this.f31980d = a;
            if (a <= 0.0f) {
                this.f31981e.mo10867l3(a);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC$initViews$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10605a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: d3 */
    public static /* synthetic */ void m10552d3(C10605a aVar, int i, long j, float f, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f = 0.0f;
            }
            aVar.mo10860c3(i, j, f);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissLayout");
    }

    /* renamed from: c3 */
    public void mo10860c3(int i, long j, float f) {
        View view;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator translationYBy;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationYBy2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator translationYBy3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator animate4;
        ViewPropertyAnimator translationYBy4;
        ViewPropertyAnimator duration4;
        ViewPropertyAnimator listener;
        View view2;
        View view3;
        View view4;
        float f2 = (float) i;
        boolean z = false;
        if (this.f31978o != 0) {
            RecyclerView recyclerView = this.f31972f;
            View view5 = null;
            RecyclerView.C16631z I0 = recyclerView != null ? recyclerView.mo17023I0(0) : null;
            View findViewById = (I0 == null || (view4 = I0.f44854d) == null) ? null : view4.findViewById(C0966R.C0970id.d97);
            View findViewById2 = (I0 == null || (view3 = I0.f44854d) == null) ? null : view3.findViewById(C0966R.C0970id.e6u);
            if (!(I0 == null || (view2 = I0.f44854d) == null)) {
                view5 = view2.findViewById(C0966R.C0970id.crv);
            }
            if (!(findViewById == null || (animate4 = findViewById.animate()) == null || (translationYBy4 = animate4.translationYBy(f2)) == null || (duration4 = translationYBy4.setDuration(j)) == null || (listener = duration4.setListener(new C10607b(this))) == null)) {
                listener.start();
            }
            float f3 = f > 0.0f ? f + f2 : f2;
            if (!(findViewById2 == null || (animate3 = findViewById2.animate()) == null || (translationYBy3 = animate3.translationYBy(f3)) == null || (duration3 = translationYBy3.setDuration(j)) == null)) {
                duration3.start();
            }
            if (!(view5 == null || (animate2 = view5.animate()) == null || (translationYBy2 = animate2.translationYBy(f3)) == null || (duration2 = translationYBy2.setDuration(j)) == null)) {
                duration2.start();
            }
            this.f31978o = 0;
        }
        View view6 = this.f31970d;
        if (view6 != null && view6.getVisibility() == 0) {
            z = true;
        }
        if (z && (view = this.f31970d) != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (translationYBy = alpha.translationYBy(f2)) != null && (duration = translationYBy.setDuration(j)) != null) {
            duration.start();
        }
    }

    /* renamed from: e3 */
    public int mo10861e3() {
        return 0;
    }

    /* renamed from: f3 */
    public abstract int mo10862f3();

    /* renamed from: g3 */
    public void mo10863g3(List<? extends BaseFinderFeed> list, int i) {
        C87412m.m108594g(list, "feeds");
        this.f31976j = list;
        this.f31979p = i;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r0 = r0.mo17023I0(mo10861e3());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10864i3(androidx.recyclerview.widget.RecyclerView r4) {
        /*
            r3 = this;
            java.lang.String r0 = "recyclerView"
            gy3.C87412m.m108594g(r4, r0)
            r3.f31972f = r4
            lp1.a$a r0 = new lp1.a$a
            r0.<init>(r3)
            r4.mo17043c(r0)
            int r4 = r3.mo10862f3()
            if (r4 > 0) goto L_0x0016
            return
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f31972f
            r1 = 0
            if (r0 == 0) goto L_0x0028
            int r2 = r3.mo10861e3()
            androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17023I0(r2)
            if (r0 == 0) goto L_0x0028
            android.view.View r0 = r0.f44854d
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            boolean r2 = r3 instanceof lp1.C10628q
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x0038
            android.view.View r4 = r0.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            goto L_0x0044
        L_0x0038:
            r4 = r1
            goto L_0x0044
        L_0x003a:
            androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
        L_0x0044:
            if (r4 == 0) goto L_0x004b
            android.view.View r4 = r4.inflate()
            goto L_0x004c
        L_0x004b:
            r4 = r1
        L_0x004c:
            r3.f31970d = r4
            if (r0 == 0) goto L_0x005a
            r4 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r4 = r0.findViewById(r4)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r4 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r4
            goto L_0x005b
        L_0x005a:
            r4 = r1
        L_0x005b:
            r3.f31973g = r4
            if (r4 != 0) goto L_0x0075
            if (r0 == 0) goto L_0x006a
            r4 = 2131297745(0x7f0905d1, float:1.8213444E38)
            android.view.View r4 = r0.findViewById(r4)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r4 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r4
        L_0x006a:
            if (r0 == 0) goto L_0x0075
            r4 = 2131304482(0x7f092022, float:1.8227108E38)
            android.view.View r4 = r0.findViewById(r4)
            com.tencent.mm.plugin.finder.view.FinderImageBanner r4 = (com.tencent.p014mm.plugin.finder.view.FinderImageBanner) r4
        L_0x0075:
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            r2 = 2131302830(0x7f0919ae, float:1.8223757E38)
            android.view.View r4 = r4.findViewById(r2)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.f31974h = r4
            if (r0 == 0) goto L_0x0090
            r4 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r4 = r0.findViewById(r4)
            r1 = r4
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
        L_0x0090:
            r3.f31975i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lp1.C10605a.mo10864i3(androidx.recyclerview.widget.RecyclerView):void");
    }

    /* renamed from: j3 */
    public final boolean mo10865j3() {
        return ((C10612f) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C10612f.class)).f31994g;
    }

    /* renamed from: k3 */
    public void mo10866k3() {
        View view;
        View view2;
        View view3;
        View view4 = this.f31970d;
        if (view4 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RecyclerView recyclerView = this.f31972f;
        View view5 = null;
        RecyclerView.C16631z I0 = recyclerView != null ? recyclerView.mo17023I0(0) : null;
        View findViewById = (I0 == null || (view3 = I0.f44854d) == null) ? null : view3.findViewById(C0966R.C0970id.d97);
        View findViewById2 = (I0 == null || (view2 = I0.f44854d) == null) ? null : view2.findViewById(C0966R.C0970id.e6u);
        if (!(I0 == null || (view = I0.f44854d) == null)) {
            view5 = view.findViewById(C0966R.C0970id.crv);
        }
        if (findViewById != null) {
            findViewById.setTranslationY(0.0f);
        }
        if (findViewById2 != null) {
            findViewById2.setTranslationY(0.0f);
        }
        if (view5 != null) {
            view5.setTranslationY(0.0f);
        }
    }

    /* renamed from: l3 */
    public void mo10867l3(float f) {
        View view = this.f31970d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: m3 */
    public void mo10868m3(float f, long j) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationYBy;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationYBy2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator translationYBy3;
        ViewPropertyAnimator duration3;
        View view;
        View view2;
        View view3;
        RecyclerView recyclerView = this.f31972f;
        View view4 = null;
        RecyclerView.C16631z I0 = recyclerView != null ? recyclerView.mo17023I0(0) : null;
        View findViewById = (I0 == null || (view3 = I0.f44854d) == null) ? null : view3.findViewById(C0966R.C0970id.d97);
        View findViewById2 = (I0 == null || (view2 = I0.f44854d) == null) ? null : view2.findViewById(C0966R.C0970id.e6u);
        if (!(I0 == null || (view = I0.f44854d) == null)) {
            view4 = view.findViewById(C0966R.C0970id.crv);
        }
        if (findViewById != null) {
            findViewById.setTranslationY(findViewById.getTranslationY() + f);
            ViewPropertyAnimator animate3 = findViewById.animate();
            if (!(animate3 == null || (translationYBy3 = animate3.translationYBy(-f)) == null || (duration3 = translationYBy3.setDuration(j)) == null)) {
                duration3.start();
            }
        }
        if (!(findViewById2 == null || (animate2 = findViewById2.animate()) == null || (translationYBy2 = animate2.translationYBy(-f)) == null || (duration2 = translationYBy2.setDuration(j)) == null)) {
            duration2.start();
        }
        if (!(view4 == null || (animate = view4.animate()) == null || (translationYBy = animate.translationYBy(-f)) == null || (duration = translationYBy.setDuration(j)) == null)) {
            duration.start();
        }
        this.f31978o = 1;
    }

    /* renamed from: n3 */
    public abstract boolean mo10869n3();

    /* renamed from: o3 */
    public void mo10870o3() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10605a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
