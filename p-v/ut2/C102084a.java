package ut2;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import b14.C54393b;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95790g2;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveOverScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import java.util.ArrayList;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import vt2.C102279c;
import wx3.C15601d;

/* renamed from: ut2.a */
public class C102084a extends UIComponent {
    public static final C52608a Companion = new C52608a((C8480h) null);
    private static final String TAG = "MicroMsg.Improve.BaseUIC";
    private final C13601g actionBarHeight$delegate = C36568h.m40985a(new C52609b(this));
    private final C13601g appBarLayout$delegate = C36568h.m40985a(new C52610c(this));
    private final C13601g dispatcher$delegate;
    private final C13601g layoutManager$delegate = C36568h.m40985a(new C102086e(this));
    private final C0125s lifecycleOwner;
    private final C13601g navigationBarHeight$delegate = C36568h.m40985a(new C52611f(this));
    private final C13601g overScrollView$delegate;
    private final C13601g recycleView$delegate = C36568h.m40985a(new C52613h(this));
    private final C13601g screenHeight$delegate = C36568h.m40985a(new C52614i(this));
    private final C13601g statusBarHeight$delegate = C36568h.m40985a(new C52615j(this));

    /* renamed from: ut2.a$a */
    public static final class C52608a {
        public C52608a(C8480h hVar) {
        }
    }

    /* renamed from: ut2.a$b */
    public static final class C52609b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52609b(C102084a aVar) {
            super(0);
            this.f146922d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$actionBarHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$actionBarHeight$2");
            Integer valueOf = Integer.valueOf(C76577a.m92157h(this.f146922d.getContext(), C0966R.dimen.f3679b9));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$actionBarHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$actionBarHeight$2");
            return valueOf;
        }
    }

    /* renamed from: ut2.a$c */
    public static final class C52610c extends C87413o implements C32224a<AppBarLayout> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52610c(C102084a aVar) {
            super(0);
            this.f146923d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$appBarLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$appBarLayout$2");
            AppBarLayout appBarLayout = (AppBarLayout) this.f146923d.findViewById(C0966R.C0970id.f6071wh);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$appBarLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$appBarLayout$2");
            return appBarLayout;
        }
    }

    /* renamed from: ut2.a$f */
    public static final class C52611f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52611f(C102084a aVar) {
            super(0);
            this.f146924d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$navigationBarHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$navigationBarHeight$2");
            Integer valueOf = Integer.valueOf(C75044y4.m89991c(this.f146924d.getContext()));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$navigationBarHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$navigationBarHeight$2");
            return valueOf;
        }
    }

    /* renamed from: ut2.a$g */
    public static final class C52612g extends C87413o implements C32224a<ImproveOverScrollView> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52612g(C102084a aVar) {
            super(0);
            this.f146925d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
            ImproveOverScrollView improveOverScrollView = (ImproveOverScrollView) this.f146925d.findViewById(C0966R.C0970id.oii);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$overScrollView$2");
            return improveOverScrollView;
        }
    }

    /* renamed from: ut2.a$h */
    public static final class C52613h extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52613h(C102084a aVar) {
            super(0);
            this.f146926d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
            WxRecyclerView wxRecyclerView = (WxRecyclerView) this.f146926d.findViewById(C0966R.C0970id.oez);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$recycleView$2");
            return wxRecyclerView;
        }
    }

    /* renamed from: ut2.a$i */
    public static final class C52614i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52614i(C102084a aVar) {
            super(0);
            this.f146927d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$screenHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$screenHeight$2");
            Integer valueOf = Integer.valueOf(C75044y4.m89990b(this.f146927d.getContext()).y);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$screenHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$screenHeight$2");
            return valueOf;
        }
    }

    /* renamed from: ut2.a$j */
    public static final class C52615j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f146928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52615j(C102084a aVar) {
            super(0);
            this.f146928d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$statusBarHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$statusBarHeight$2");
            Integer valueOf = Integer.valueOf(C75044y4.m89994f(this.f146928d.getContext()));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$statusBarHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$statusBarHeight$2");
            return valueOf;
        }
    }

    /* renamed from: ut2.a$d */
    public static final class C102085d extends C87413o implements C32224a<C54393b> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f300615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102085d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f300615d = appCompatActivity;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
            C102088c cVar = (C102088c) C39818r.f106831a.mo62444c(this.f300615d).mo75002a(C102088c.class);
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getHandlerDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
            C54393b bVar = cVar.f300620f;
            SnsMethodCalculate.markEndTimeMs("getHandlerDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
            return bVar;
        }
    }

    /* renamed from: ut2.a$e */
    public static final class C102086e extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ C102084a f300616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102086e(C102084a aVar) {
            super(0);
            this.f300616d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
            RecyclerView.LayoutManager layoutManager = this.f300616d.getRecycleView().getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxLinearLayoutManager");
            WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) layoutManager;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$layoutManager$2");
            return wxLinearLayoutManager;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102084a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.lifecycleOwner = appCompatActivity;
        this.dispatcher$delegate = C36568h.m40985a(new C102085d(appCompatActivity));
        this.overScrollView$delegate = C36568h.m40985a(new C52612g(this));
    }

    public static /* synthetic */ Object onScrollStateChanged$suspendImpl(C102084a aVar, RecyclerView recyclerView, C102104r rVar, int i, C15601d dVar) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return b0Var;
    }

    public final int getActionBarHeight() {
        SnsMethodCalculate.markStartTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((Number) this.actionBarHeight$delegate.getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final AppBarLayout getAppBarLayout() {
        SnsMethodCalculate.markStartTimeMs("getAppBarLayout", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        Object value = this.appBarLayout$delegate.getValue();
        C87412m.m108593f(value, "<get-appBarLayout>(...)");
        AppBarLayout appBarLayout = (AppBarLayout) value;
        SnsMethodCalculate.markEndTimeMs("getAppBarLayout", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return appBarLayout;
    }

    public final C54393b getDispatcher() {
        SnsMethodCalculate.markStartTimeMs("getDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        C54393b bVar = (C54393b) this.dispatcher$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return bVar;
    }

    public final WxLinearLayoutManager getLayoutManager() {
        SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) this.layoutManager$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return wxLinearLayoutManager;
    }

    public final C0125s getLifecycleOwner() {
        SnsMethodCalculate.markStartTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        C0125s sVar = this.lifecycleOwner;
        SnsMethodCalculate.markEndTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return sVar;
    }

    public final int getNavigationBarHeight() {
        SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((Number) this.navigationBarHeight$delegate.getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final ImproveOverScrollView getOverScrollView() {
        SnsMethodCalculate.markStartTimeMs("getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        Object value = this.overScrollView$delegate.getValue();
        C87412m.m108593f(value, "<get-overScrollView>(...)");
        ImproveOverScrollView improveOverScrollView = (ImproveOverScrollView) value;
        SnsMethodCalculate.markEndTimeMs("getOverScrollView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return improveOverScrollView;
    }

    public final WxRecyclerView getRecycleView() {
        SnsMethodCalculate.markStartTimeMs("getRecycleView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        Object value = this.recycleView$delegate.getValue();
        C87412m.m108593f(value, "<get-recycleView>(...)");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) value;
        SnsMethodCalculate.markEndTimeMs("getRecycleView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return wxRecyclerView;
    }

    public final int getScreenHeight() {
        SnsMethodCalculate.markStartTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((Number) this.screenHeight$delegate.getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getScreenHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final int getStatusBarHeight() {
        SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int intValue = ((Number) this.statusBarHeight$delegate.getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return intValue;
    }

    public final C102104r getVisibleItemView() {
        C98799a aVar;
        SnsMethodCalculate.markStartTimeMs("getVisibleItemView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        int C = getLayoutManager().mo16957C();
        int E = getLayoutManager().mo16959E();
        ArrayList<T> arrayList = ((C102279c) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C102279c.class)).mo141841d3().f272353o;
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(C, 1);
        if (max <= E) {
            while (true) {
                int i = max - 1;
                if (i < arrayList.size()) {
                    View findViewByPosition = getLayoutManager().findViewByPosition(max);
                    if (findViewByPosition != null) {
                        int[] iArr = new int[2];
                        findViewByPosition.getLocationOnScreen(iArr);
                        if (iArr[1] <= getScreenHeight() - getNavigationBarHeight() && (aVar = (C98799a) C110818d0.m150917O(arrayList, i)) != null) {
                            int i2 = iArr[0];
                            arrayList2.add(new C65477j(max, aVar, findViewByPosition, new Rect(i2, iArr[1], findViewByPosition.getWidth() + i2, iArr[1] + findViewByPosition.getHeight())));
                        }
                    }
                    if (max == E) {
                        break;
                    }
                    max++;
                } else {
                    break;
                }
            }
        }
        Log.m105924i(TAG, "getVisibleHolder range:[" + C + ' ' + E + "],snapshot size:" + arrayList2.size());
        C102104r rVar = new C102104r(C, E, arrayList2);
        SnsMethodCalculate.markEndTimeMs("getVisibleItemView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return rVar;
    }

    public final boolean isTouchPointInView(View view, MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        C87412m.m108594g(motionEvent, "ev");
        boolean z = false;
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i;
        if ((i2 <= rawY && rawY <= view.getMeasuredHeight() + i2) && rawX >= i && rawX <= measuredWidth) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return z;
    }

    public Object onScrollStateChanged(RecyclerView recyclerView, C102104r rVar, int i, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        Object onScrollStateChanged$suspendImpl = onScrollStateChanged$suspendImpl(this, recyclerView, rVar, i, dVar);
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return onScrollStateChanged$suspendImpl;
    }

    public final boolean resumePage() {
        SnsMethodCalculate.markStartTimeMs("resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        boolean z = true;
        if (!getIntent().getBooleanExtra("sns_resume_state", true) || !C94866e1.Kx0().mo133243f()) {
            z = false;
        }
        Log.m105924i(TAG, "resumePage:" + z);
        if (z) {
            C5431p1.C5432a dy02 = C94866e1.dy0();
            C95790g2 Kx0 = C94866e1.Kx0();
            Kx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            long j = Kx0.f279538j;
            SnsMethodCalculate.markEndTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            dy02.mo6421r(j, -1);
            C5431p1.C5432a dy03 = C94866e1.dy0();
            C95790g2 Kx02 = C94866e1.Kx0();
            Kx02.getClass();
            SnsMethodCalculate.markStartTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            long j2 = Kx02.f279539k;
            SnsMethodCalculate.markEndTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            dy03.mo6420q(j2);
        }
        SnsMethodCalculate.markEndTimeMs("resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC");
        return z;
    }
}
