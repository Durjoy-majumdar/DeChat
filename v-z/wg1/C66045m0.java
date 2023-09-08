package wg1;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.view.LiveBottomSheetRL;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C60464o0;
import il1.C60482p0;
import il1.C60505s0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qg1.C47826f;
import qk1.C63205e0;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C50415mk1;
import uo3.C78253a;

/* renamed from: wg1.m0 */
public final class C66045m0 implements C66112z0, View.OnClickListener {

    /* renamed from: A */
    public View f189868A;

    /* renamed from: B */
    public ConstraintLayout f189869B;

    /* renamed from: C */
    public FrameLayout f189870C;

    /* renamed from: D */
    public ConstraintLayout f189871D;

    /* renamed from: E */
    public ProgressBar f189872E;

    /* renamed from: F */
    public View f189873F;

    /* renamed from: G */
    public WxRecyclerView f189874G;

    /* renamed from: H */
    public C60464o0 f189875H;

    /* renamed from: I */
    public C60505s0 f189876I;

    /* renamed from: J */
    public C60482p0 f189877J;

    /* renamed from: K */
    public C78253a f189878K;

    /* renamed from: L */
    public int[] f189879L;

    /* renamed from: d */
    public final View f189880d;

    /* renamed from: e */
    public final MMActivity f189881e;

    /* renamed from: f */
    public final C45795b f189882f;

    /* renamed from: g */
    public final C66109y0 f189883g;

    /* renamed from: h */
    public final String f189884h = "FinderLiveAnchorMusicSingSongViewCallback";

    /* renamed from: i */
    public final int f189885i = 1;

    /* renamed from: j */
    public final int f189886j = 2;

    /* renamed from: n */
    public final int f189887n = ((int) (((float) C75044y4.m89990b(MMApplicationContext.getContext()).y) * (((float) C32444a.f86121a.mo58621b()) / 100.0f)));

    /* renamed from: o */
    public View f189888o;

    /* renamed from: p */
    public View f189889p;

    /* renamed from: q */
    public FrameLayout f189890q;

    /* renamed from: r */
    public MMSwitchBtn f189891r;

    /* renamed from: s */
    public TextView f189892s;

    /* renamed from: t */
    public TextView f189893t;

    /* renamed from: u */
    public LinearLayout f189894u;

    /* renamed from: v */
    public LiveBottomSheetPanel f189895v;

    /* renamed from: w */
    public View f189896w;

    /* renamed from: x */
    public View f189897x;

    /* renamed from: y */
    public View f189898y;

    /* renamed from: z */
    public View f189899z;

    /* renamed from: wg1.m0$a */
    public static final class C66046a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66046a(C66045m0 m0Var) {
            super(1);
            this.f189900d = m0Var;
        }

        public Object invoke(Object obj) {
            C66109y0 y0Var;
            if (!((Boolean) obj).booleanValue() && (y0Var = this.f189900d.f189883g) != null) {
                y0Var.hide();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.m0$b */
    public static final class C66047b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C66047b f189901d = new C66047b();

        public C66047b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.m0$c */
    public static final class C66048c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189902d;

        /* renamed from: wg1.m0$c$a */
        public static final class C66049a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C66045m0 f189903d;

            public C66049a(C66045m0 m0Var) {
                this.f189903d = m0Var;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (e0Var.mo107176v()) {
                    C66045m0 m0Var = this.f189903d;
                    e0Var.mo107140d(m0Var.f189886j, m0Var.f189880d.getContext().getResources().getColor(C0966R.color.f2966ao), this.f189903d.f189880d.getContext().getResources().getString(C0966R.string.mbu));
                }
            }
        }

        /* renamed from: wg1.m0$c$b */
        public static final class C66050b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C66045m0 f189904d;

            public C66050b(C66045m0 m0Var) {
                this.f189904d = m0Var;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                C66045m0 m0Var = this.f189904d;
                if (itemId == m0Var.f189886j) {
                    MMSwitchBtn mMSwitchBtn = m0Var.f189891r;
                    if (mMSwitchBtn != null) {
                        mMSwitchBtn.setCheck(false);
                    }
                    C66109y0 y0Var = m0Var.f189883g;
                    if (y0Var != null) {
                        y0Var.mo90054q1(false);
                    }
                    C66109y0 y0Var2 = m0Var.f189883g;
                    if (y0Var2 != null) {
                        y0Var2.mo90048T(false, new C66062n0(m0Var, false));
                    }
                }
            }
        }

        public C66048c(C66045m0 m0Var) {
            this.f189902d = m0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66045m0 m0Var = this.f189902d;
            MMSwitchBtn mMSwitchBtn = m0Var.f189891r;
            if (mMSwitchBtn != null && !mMSwitchBtn.f220433y) {
                if (mMSwitchBtn != null) {
                    mMSwitchBtn.setCheck(true);
                }
                C66109y0 y0Var = m0Var.f189883g;
                if (y0Var != null) {
                    y0Var.mo90054q1(true);
                }
                C66109y0 y0Var2 = m0Var.f189883g;
                if (y0Var2 != null) {
                    y0Var2.mo90048T(true, new C66062n0(m0Var, true));
                }
            } else {
                C77407n nVar = new C77407n(m0Var.f189880d.getContext(), 1, true);
                C66045m0 m0Var2 = this.f189902d;
                Context context = m0Var2.f189880d.getContext();
                C87412m.m108593f(context, "root.context");
                View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bc5, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpi);
                textView.setGravity(17);
                if (((C54991o) m0Var2.f189882f.mo71262a(C54991o.class)).mo75999e4()) {
                    textView.setText(context.getResources().getString(C0966R.string.mbw));
                } else {
                    textView.setText(context.getResources().getString(C0966R.string.mbv));
                }
                textView.setTextColor(context.getResources().getColor(C0966R.color.FG_2));
                textView.setTextSize(1, 14.0f);
                nVar.mo107569n(inflate, false);
                C66045m0 m0Var3 = this.f189902d;
                nVar.f225771i = new C66049a(m0Var3);
                nVar.f225782p = new C66050b(m0Var3);
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.m0$d */
    public static final class C66051d implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189905d;

        public C66051d(C66045m0 m0Var) {
            this.f189905d = m0Var;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback$initView$4$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(motionEvent, "p1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback$initView$4$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "motionEvent");
            this.f189905d.f189879L[0] = (int) motionEvent.getRawX();
            this.f189905d.f189879L[1] = (int) motionEvent.getRawY();
            return false;
        }
    }

    /* renamed from: wg1.m0$e */
    public static final class C66052e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189906d;

        public C66052e(C66045m0 m0Var) {
            this.f189906d = m0Var;
        }

        public final void run() {
            int c = C75044y4.m89991c(this.f189906d.f189880d.getContext());
            Log.m105924i(this.f189906d.f189884h, "navigationBarHeight:" + c);
            ViewGroup.LayoutParams layoutParams = this.f189906d.f189880d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c;
        }
    }

    /* renamed from: wg1.m0$f */
    public static final class C66053f implements C47826f.C47827a {

        /* renamed from: a */
        public final /* synthetic */ C66045m0 f189907a;

        /* renamed from: wg1.m0$f$a */
        public static final class C66054a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C66045m0 f189908d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66054a(C66045m0 m0Var) {
                super(0);
                this.f189908d = m0Var;
            }

            public Object invoke() {
                MMSwitchBtn mMSwitchBtn = this.f189908d.f189891r;
                if (mMSwitchBtn != null) {
                    mMSwitchBtn.setCheck(false);
                }
                this.f189908d.f189883g.mo90054q1(false);
                C76912y0.m92767f(this.f189908d.f189880d.getContext(), "设置失败，请稍后再试");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: wg1.m0$f$b */
        public static final class C66055b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C66045m0 f189909d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66055b(C66045m0 m0Var) {
                super(0);
                this.f189909d = m0Var;
            }

            public Object invoke() {
                ((C54994o1) this.f189909d.f189882f.mo71262a(C54994o1.class)).f154402i.postValue(Boolean.TRUE);
                MMSwitchBtn mMSwitchBtn = this.f189909d.f189891r;
                if (mMSwitchBtn != null) {
                    mMSwitchBtn.setCheck(true);
                }
                C60482p0 p0Var = this.f189909d.f189877J;
                if (p0Var != null) {
                    p0Var.mo85443b(true, true);
                }
                return C13598b0.f38549a;
            }
        }

        public C66053f(C66045m0 m0Var) {
            this.f189907a = m0Var;
        }

        /* renamed from: a */
        public void mo9151a(int i, long j, C50415mk1 mk12) {
        }

        /* renamed from: b */
        public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
        }

        /* renamed from: c */
        public void mo9153c(int i, long j) {
            C61926c.m72668M(new C66055b(this.f189907a));
        }

        /* renamed from: d */
        public void mo9154d(int i, int i2, String str, int i3) {
            C61926c.m72668M(new C66054a(this.f189907a));
        }
    }

    /* renamed from: wg1.m0$g */
    public static final class C66056g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189910d;

        public C66056g(C66045m0 m0Var) {
            this.f189910d = m0Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189910d.f189895v;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.m0$h */
    public static final class C66057h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189911d;

        public C66057h(C66045m0 m0Var) {
            this.f189911d = m0Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189911d.f189895v;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.m0$i */
    public static final class C66058i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189912d;

        public C66058i(C66045m0 m0Var) {
            this.f189912d = m0Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189912d.f189895v;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.m0$j */
    public static final class C66059j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189913d;

        public C66059j(C66045m0 m0Var) {
            this.f189913d = m0Var;
        }

        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            Class cls = C54994o1.class;
            WxRecyclerView wxRecyclerView = this.f189913d.f189874G;
            if (!(wxRecyclerView == null || (viewTreeObserver = wxRecyclerView.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            Integer value = ((C54994o1) this.f189913d.f189882f.mo71262a(cls)).f154399f.f153478a.getValue();
            if (value == null) {
                value = -1;
            }
            int intValue = value.intValue();
            if (intValue >= 0 && intValue < ((C54994o1) this.f189913d.f189882f.mo71262a(cls)).f154399f.f153479b.size()) {
                WxRecyclerView wxRecyclerView2 = this.f189913d.f189874G;
                LinearLayoutManager linearLayoutManager = null;
                RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(intValue));
                    C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback$showMusicView$2", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback$showMusicView$2", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            }
        }
    }

    /* renamed from: wg1.m0$k */
    public static final class C66060k implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189914d;

        public C66060k(C66045m0 m0Var) {
            this.f189914d = m0Var;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C66045m0 m0Var = this.f189914d;
            contextMenu.add(0, m0Var.f189885i, 0, m0Var.f189881e.getResources().getString(C0966R.string.mbx));
        }
    }

    /* renamed from: wg1.m0$l */
    public static final class C66061l implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189915d;

        /* renamed from: e */
        public final /* synthetic */ C54785k6 f189916e;

        /* renamed from: f */
        public final /* synthetic */ int f189917f;

        public C66061l(C66045m0 m0Var, C54785k6 k6Var, int i) {
            this.f189915d = m0Var;
            this.f189916e = k6Var;
            this.f189917f = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            C66045m0 m0Var = this.f189915d;
            if (itemId == m0Var.f189885i) {
                m0Var.f189878K.mo108266a();
                C66109y0 y0Var = this.f189915d.f189883g;
                if (y0Var != null) {
                    y0Var.mo90050g1(this.f189916e, this.f189917f);
                }
            }
        }
    }

    public C66045m0(View view, MMActivity mMActivity, C45795b bVar, C66109y0 y0Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "liveData");
        this.f189880d = view;
        this.f189881e = mMActivity;
        this.f189882f = bVar;
        this.f189883g = y0Var;
        this.f189878K = new C78253a(mMActivity);
        this.f189879L = new int[2];
    }

    /* renamed from: O */
    public void mo90075O() {
        C60482p0 p0Var = this.f189877J;
        if (p0Var != null) {
            p0Var.mo85443b(false, true);
        }
    }

    /* renamed from: V */
    public void mo90076V(View view, int i, C54785k6 k6Var, int i2, int i3) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(k6Var, "musicItem");
        this.f189878K.mo108266a();
        this.f189878K.mo108273h(view, new C66060k(this), new C66061l(this, k6Var, i), i2, i3);
        C78253a aVar = this.f189878K;
        MMListPopupWindow mMListPopupWindow = aVar.f229242h;
        if (mMListPopupWindow != null) {
            mMListPopupWindow.f214823g.setBackgroundDrawable(aVar.f229238d.getResources().getDrawable(C0966R.C0969drawable.c2w));
        }
        C78253a aVar2 = this.f189878K;
        aVar2.f229232H = true;
        aVar2.f229231G = C0966R.color.BW_100_Alpha_0_8;
    }

    /* renamed from: a */
    public void mo90077a() {
        ViewGroup.LayoutParams layoutParams;
        ArrayList<C54785k6> arrayList;
        Log.m105924i(this.f189884h, "initView");
        View findViewById = this.f189880d.findViewById(C0966R.C0970id.mqb);
        this.f189888o = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f189889p = this.f189880d.findViewById(C0966R.C0970id.mqk);
        this.f189890q = (FrameLayout) this.f189880d.findViewById(C0966R.C0970id.mt8);
        this.f189891r = (MMSwitchBtn) this.f189880d.findViewById(C0966R.C0970id.mt6);
        this.f189892s = (TextView) this.f189880d.findViewById(C0966R.C0970id.mt7);
        mo90085p();
        this.f189893t = (TextView) this.f189880d.findViewById(C0966R.C0970id.mqe);
        this.f189894u = (LinearLayout) this.f189880d.findViewById(C0966R.C0970id.nee);
        this.f189895v = (LiveBottomSheetPanel) this.f189880d.findViewById(C0966R.C0970id.mqc);
        this.f189870C = (FrameLayout) this.f189880d.findViewById(C0966R.C0970id.mvx);
        this.f189871D = (ConstraintLayout) this.f189880d.findViewById(C0966R.C0970id.mvv);
        this.f189872E = (ProgressBar) this.f189880d.findViewById(C0966R.C0970id.mvy);
        LiveBottomSheetPanel liveBottomSheetPanel = this.f189895v;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnClickListener(this);
        }
        LiveBottomSheetPanel liveBottomSheetPanel2 = this.f189895v;
        if (liveBottomSheetPanel2 != null) {
            liveBottomSheetPanel2.setOnVisibilityListener(new C66046a(this));
            liveBottomSheetPanel2.setTranslationY((float) C75044y4.m89990b(this.f189880d.getContext()).y);
            liveBottomSheetPanel2.getLayoutParams().height = this.f189887n;
        }
        this.f189896w = this.f189880d.findViewById(C0966R.C0970id.mqd);
        View findViewById2 = this.f189880d.findViewById(C0966R.C0970id.mrq);
        this.f189897x = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        this.f189898y = this.f189880d.findViewById(C0966R.C0970id.f359208mv2);
        View findViewById3 = this.f189880d.findViewById(C0966R.C0970id.grr);
        this.f189899z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View findViewById4 = this.f189880d.findViewById(C0966R.C0970id.f5578iw);
        this.f189868A = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this);
        }
        this.f189869B = (ConstraintLayout) this.f189880d.findViewById(C0966R.C0970id.mvn);
        TextView textView = (TextView) this.f189880d.findViewById(C0966R.C0970id.mvk);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.f189873F = this.f189880d.findViewById(C0966R.C0970id.mv9);
        View findViewById5 = this.f189880d.findViewById(C0966R.C0970id.mqd);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…g_song_content_item_root)");
        this.f189875H = new C60464o0((ViewGroup) findViewById5, this.f189883g, C66047b.f189901d);
        WxRecyclerView wxRecyclerView = this.f189874G;
        WxRecyclerView wxRecyclerView2 = null;
        RecyclerView.C16613e adapter = wxRecyclerView != null ? wxRecyclerView.getAdapter() : null;
        C63205e0 e0Var = adapter instanceof C63205e0 ? (C63205e0) adapter : null;
        int i = 0;
        if (((e0Var == null || (arrayList = e0Var.f179340h) == null) ? 0 : arrayList.size()) >= 10) {
            ConstraintLayout constraintLayout = this.f189871D;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            ConstraintLayout constraintLayout2 = this.f189871D;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
        }
        TextView textView2 = this.f189892s;
        if (textView2 != null) {
            textView2.setOnClickListener(new C66048c(this));
        }
        C60464o0 o0Var = this.f189875H;
        if (o0Var != null) {
            wxRecyclerView2 = o0Var.f172377b;
        }
        this.f189874G = wxRecyclerView2;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.mo17092j0(new C66051d(this));
        }
        View findViewById6 = this.f189880d.findViewById(C0966R.C0970id.mqf);
        C87412m.m108593f(findViewById6, "root.findViewById<LiveBo…g_song_edit_content_area)");
        this.f189876I = new C60505s0((LiveBottomSheetRL) findViewById6, this.f189882f, this.f189883g);
        View findViewById7 = this.f189880d.findViewById(C0966R.C0970id.mq9);
        C87412m.m108593f(findViewById7, "root.findViewById<LiveBo…ng_song_add_content_area)");
        this.f189877J = new C60482p0((LiveBottomSheetRL) findViewById7, this.f189882f, this.f189883g);
        WxRecyclerView wxRecyclerView3 = this.f189874G;
        if (wxRecyclerView3 != null) {
            int c = C75044y4.m89991c(this.f189880d.getContext());
            View view = this.f189889p;
            if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
                i = layoutParams.height;
            }
            if (i <= 0) {
                i = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3718c_);
            }
            int i2 = (this.f189887n - c) - i;
            wxRecyclerView3.getLayoutParams().height = i2;
            String str = this.f189884h;
            Log.m105924i(str, "adjustRvHeight height:" + i2);
        }
        this.f189880d.post(new C66052e(this));
    }

    /* renamed from: f */
    public void mo90078f(List<C54785k6> list) {
        ViewTreeObserver viewTreeObserver;
        ArrayList<C54785k6> arrayList;
        C87412m.m108594g(list, "musicData");
        int size = list.size();
        String str = this.f189884h;
        Log.m105924i(str, "showMusicView size:" + size);
        TextView textView = this.f189893t;
        boolean z = true;
        if (textView != null) {
            textView.setText(size > 0 ? this.f189880d.getContext().getResources().getString(C0966R.string.mc8, new Object[]{String.valueOf(size)}) : this.f189880d.getContext().getResources().getString(C0966R.string.mc8, new Object[]{"-"}));
        }
        mo90085p();
        View view = this.f189898y;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ConstraintLayout constraintLayout = this.f189869B;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        View view3 = this.f189873F;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FrameLayout frameLayout = this.f189890q;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        WxRecyclerView wxRecyclerView = this.f189874G;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f189894u;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ProgressBar progressBar = this.f189872E;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        WxRecyclerView wxRecyclerView2 = this.f189874G;
        C63205e0 e0Var = null;
        RecyclerView.C16613e adapter = wxRecyclerView2 != null ? wxRecyclerView2.getAdapter() : null;
        if (adapter instanceof C63205e0) {
            e0Var = (C63205e0) adapter;
        }
        if (((e0Var == null || (arrayList = e0Var.f179340h) == null) ? 0 : arrayList.size()) >= 10) {
            ConstraintLayout constraintLayout2 = this.f189871D;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
        } else {
            ConstraintLayout constraintLayout3 = this.f189871D;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
        }
        LiveBottomSheetPanel liveBottomSheetPanel = this.f189895v;
        if (liveBottomSheetPanel == null || liveBottomSheetPanel.f165501h) {
            z = false;
        }
        if (z && liveBottomSheetPanel != null) {
            liveBottomSheetPanel.post(new C66058i(this));
        }
        WxRecyclerView wxRecyclerView3 = this.f189874G;
        if (wxRecyclerView3 != null && (viewTreeObserver = wxRecyclerView3.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C66059j(this));
        }
    }

    /* renamed from: g */
    public void mo90079g(boolean z) {
        View view = this.f189898y;
        boolean z2 = false;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ConstraintLayout constraintLayout = this.f189869B;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        View view2 = this.f189873F;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FrameLayout frameLayout = this.f189890q;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        WxRecyclerView wxRecyclerView = this.f189874G;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        ProgressBar progressBar = this.f189872E;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (z) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189895v;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.f165501h) {
                z2 = true;
            }
            if (z2 && liveBottomSheetPanel != null) {
                liveBottomSheetPanel.post(new C66057h(this));
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f189881e;
    }

    /* renamed from: h */
    public void mo90080h(boolean z) {
        View view = this.f189898y;
        boolean z2 = false;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FrameLayout frameLayout = this.f189890q;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.f189869B;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        LinearLayout linearLayout = this.f189894u;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        View view2 = this.f189873F;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ProgressBar progressBar = this.f189872E;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189895v;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.f165501h) {
                z2 = true;
            }
            if (z2 && liveBottomSheetPanel != null) {
                liveBottomSheetPanel.post(new C66056g(this));
            }
        }
    }

    /* renamed from: l0 */
    public void mo90081l0() {
        FrameLayout frameLayout = this.f189870C;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: m */
    public int[] mo90082m() {
        return this.f189879L;
    }

    /* renamed from: o */
    public void mo90083o() {
        C60505s0 s0Var = this.f189876I;
        if (s0Var != null) {
            s0Var.mo85479c(false, true);
        }
    }

    public void onClick(View view) {
        C60505s0 s0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mqb) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189895v;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78802a();
            }
            C60505s0 s0Var2 = this.f189876I;
            if (s0Var2 != null) {
                s0Var2.mo85479c(false, false);
            }
            C60482p0 p0Var = this.f189877J;
            if (p0Var != null) {
                p0Var.mo85443b(false, false);
            }
            Object systemService = this.f189880d.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f189880d.getWindowToken(), 0);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mrq) {
            LiveBottomSheetPanel liveBottomSheetPanel2 = this.f189895v;
            if (liveBottomSheetPanel2 != null) {
                liveBottomSheetPanel2.mo78802a();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mvk) {
            if (((C54991o) this.f189882f.mo71262a(C54991o.class)).mo75999e4()) {
                C66109y0 y0Var = this.f189883g;
                if (y0Var != null) {
                    y0Var.mo90054q1(true);
                }
                C66109y0 y0Var2 = this.f189883g;
                if (y0Var2 != null) {
                    y0Var2.mo90048T(true, new C66053f(this));
                }
            } else {
                MMSwitchBtn mMSwitchBtn = this.f189891r;
                if (mMSwitchBtn != null) {
                    mMSwitchBtn.setCheck(true);
                }
                ((C54994o1) this.f189882f.mo71262a(C54994o1.class)).f154402i.postValue(Boolean.TRUE);
                C66109y0 y0Var3 = this.f189883g;
                if (y0Var3 != null) {
                    y0Var3.mo90054q1(true);
                }
                C60482p0 p0Var2 = this.f189877J;
                if (p0Var2 != null) {
                    p0Var2.mo85443b(true, true);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f5578iw) {
            C60482p0 p0Var3 = this.f189877J;
            if (p0Var3 != null) {
                p0Var3.mo85443b(true, true);
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.grr || (s0Var = this.f189876I) == null)) {
            s0Var.mo85479c(true, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p */
    public final void mo90085p() {
        MMSwitchBtn mMSwitchBtn = this.f189891r;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(C62042e.f176370a.mo87092k1(this.f189882f));
        }
        C66109y0 y0Var = this.f189883g;
        if (y0Var != null) {
            y0Var.mo90046I0(C62042e.f176370a.mo87092k1(this.f189882f));
        }
        ((C54994o1) this.f189882f.mo71262a(C54994o1.class)).f154402i.postValue(Boolean.valueOf(C62042e.f176370a.mo87092k1(this.f189882f)));
    }

    /* renamed from: r */
    public void mo90086r(int i) {
        String str;
        TextView textView = this.f189893t;
        if (textView != null) {
            if (i > 0) {
                str = this.f189880d.getContext().getResources().getString(C0966R.string.mc8, new Object[]{String.valueOf(i)});
            } else {
                str = this.f189880d.getContext().getResources().getString(C0966R.string.mc8, new Object[]{"-"});
            }
            textView.setText(str);
        }
    }

    /* renamed from: s */
    public void mo90087s() {
        FrameLayout frameLayout = this.f189870C;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
