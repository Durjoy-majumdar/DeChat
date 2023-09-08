package rs1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56595d8;
import com.tencent.p014mm.plugin.finder.view.C56635l8;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview$onAttach$1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import ef1.C58553c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import p501dz.C58466h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C37521f;

/* renamed from: rs1.e */
public final class C63547e extends UIComponent {

    /* renamed from: d */
    public final boolean f180229d = ((Boolean) C37521f.f99350a1.mo60266n()).booleanValue();

    /* renamed from: e */
    public final C13601g f180230e = C36568h.m40985a(new C63550c(this));

    /* renamed from: f */
    public final C13601g f180231f = C36568h.m40985a(new C63548a(this));

    /* renamed from: g */
    public final C13601g f180232g = C36568h.m40985a(new C63549b(this));

    /* renamed from: rs1.e$a */
    public static final class C63548a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63547e f180233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63548a(C63547e eVar) {
            super(0);
            this.f180233d = eVar;
        }

        public Object invoke() {
            return ((View) ((C36570n) this.f180233d.f180232g).getValue()).findViewById(C0966R.C0970id.bzk);
        }
    }

    /* renamed from: rs1.e$b */
    public static final class C63549b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C63547e f180234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63549b(C63547e eVar) {
            super(0);
            this.f180234d = eVar;
        }

        public Object invoke() {
            if (this.f180234d.isBelongFragment()) {
                return this.f180234d.getRootView();
            }
            View decorView = this.f180234d.getActivity().getWindow().getDecorView();
            C87412m.m108593f(decorView, "activity.window.decorView");
            return decorView;
        }
    }

    /* renamed from: rs1.e$c */
    public static final class C63550c extends C87413o implements C32224a<TestPreloadPreview> {

        /* renamed from: d */
        public final /* synthetic */ C63547e f180235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63550c(C63547e eVar) {
            super(0);
            this.f180235d = eVar;
        }

        public Object invoke() {
            return (TestPreloadPreview) ((View) ((C36570n) this.f180235d.f180232g).getValue()).findViewById(C0966R.C0970id.khh);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63547e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
    }

    /* renamed from: c3 */
    public final void mo88403c3(DataBuffer<C0740i2> dataBuffer, int i, FinderVideoCore finderVideoCore, C58553c cVar, int i2) {
        DataBuffer<C0740i2> dataBuffer2 = dataBuffer;
        FinderVideoCore finderVideoCore2 = finderVideoCore;
        C58553c cVar2 = cVar;
        C87412m.m108594g(dataBuffer2, "data");
        C87412m.m108594g(finderVideoCore2, "videoCore");
        if (this.f180229d) {
            View view = (View) ((C36570n) this.f180232g).getValue();
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).addView(C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_8, this instanceof ViewGroup ? (ViewGroup) this : null, false));
            TestPreloadPreview testPreloadPreview = (TestPreloadPreview) ((C36570n) this.f180230e).getValue();
            if (testPreloadPreview != null) {
                testPreloadPreview.f162166o = true;
                testPreloadPreview.f162162h = dataBuffer2;
                testPreloadPreview.f162167p = i2;
                testPreloadPreview.f162163i = finderVideoCore2;
                RecyclerView recyclerView = testPreloadPreview.getRecyclerView();
                TestPreloadPreview$onAttach$1 testPreloadPreview$onAttach$1 = new TestPreloadPreview$onAttach$1(testPreloadPreview.getContext());
                testPreloadPreview$onAttach$1.setItemPrefetchEnabled(false);
                recyclerView.setLayoutManager(testPreloadPreview$onAttach$1);
                TestPreloadPreview.C56582d dVar = new TestPreloadPreview.C56582d();
                dVar.setHasStableIds(true);
                testPreloadPreview.getRecyclerView().setAdapter(dVar);
                testPreloadPreview.getRecyclerView().setHasFixedSize(true);
                if (cVar2 != null) {
                    cVar2.mo83450a(testPreloadPreview.f162157A);
                }
                testPreloadPreview.getRecyclerView().setNestedScrollingEnabled(false);
                testPreloadPreview.getRecyclerView().setOnTouchListener(new C56635l8(testPreloadPreview));
                ((C58466h) C86312j.m106911c(C58466h.class)).Qi0().mo32060h(testPreloadPreview.f162172u);
                ConcurrentHashMap<String, RefreshLoadMoreLayout.C7080c<Object>> concurrentHashMap = FinderTimelinePresenter.f13239Q0;
                C56595d8 d8Var = testPreloadPreview.f162171t;
                C87412m.m108594g(d8Var, "callback");
                FinderTimelinePresenter.f13240R0.add(d8Var);
            }
            View view2 = (View) ((C36570n) this.f180231f).getValue();
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/DebugVideoLoadInfoUIC", "onAttach", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;ILcom/tencent/mm/plugin/finder/video/FinderVideoCore;Lcom/tencent/mm/plugin/finder/event/base/EventDispatcher;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/DebugVideoLoadInfoUIC", "onAttach", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;ILcom/tencent/mm/plugin/finder/video/FinderVideoCore;Lcom/tencent/mm/plugin/finder/event/base/EventDispatcher;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo88404d3(C75044y4.m89994f(getContext()));
        }
    }

    /* renamed from: d3 */
    public final void mo88404d3(int i) {
        TestPreloadPreview testPreloadPreview = (TestPreloadPreview) ((C36570n) this.f180230e).getValue();
        FrameLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = testPreloadPreview != null ? testPreloadPreview.getLayoutParams() : null;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = i;
        }
        TestPreloadPreview testPreloadPreview2 = (TestPreloadPreview) ((C36570n) this.f180230e).getValue();
        if (testPreloadPreview2 != null) {
            testPreloadPreview2.requestLayout();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63547e(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C37521f.f99374d.getClass();
    }
}
