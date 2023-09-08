package wg1;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54768h6;
import cl1.C54991o;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMusicScrollViewBehavior;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C46265l0;
import il1.C60446k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import ok1.C11467q;
import ok1.C62042e;
import qk1.C63213g;
import rx3.C13598b0;
import uo3.C78253a;
import wg1.C66096w;

/* renamed from: wg1.o0 */
public final class C66065o0 implements C66096w, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: A */
    public int f189924A;

    /* renamed from: B */
    public View f189925B;

    /* renamed from: C */
    public SeekBar f189926C;

    /* renamed from: D */
    public TextView f189927D;

    /* renamed from: E */
    public ProgressBar f189928E;

    /* renamed from: F */
    public WxRecyclerView f189929F;

    /* renamed from: G */
    public C60446k0 f189930G;

    /* renamed from: H */
    public C78253a f189931H;

    /* renamed from: I */
    public int[] f189932I;

    /* renamed from: d */
    public final View f189933d;

    /* renamed from: e */
    public final MMActivity f189934e;

    /* renamed from: f */
    public final C45795b f189935f;

    /* renamed from: g */
    public final C66089v f189936g;

    /* renamed from: h */
    public final String f189937h = "FinderLiveAnchorMusicViewCallback";

    /* renamed from: i */
    public final int f189938i = 1;

    /* renamed from: j */
    public final int f189939j = ((int) (((float) C75044y4.m89990b(MMApplicationContext.getContext()).y) * (((float) C32444a.f86121a.mo58621b()) / 100.0f)));

    /* renamed from: n */
    public View f189940n;

    /* renamed from: o */
    public View f189941o;

    /* renamed from: p */
    public LiveBottomSheetPanel f189942p;

    /* renamed from: q */
    public View f189943q;

    /* renamed from: r */
    public View f189944r;

    /* renamed from: s */
    public View f189945s;

    /* renamed from: t */
    public View f189946t;

    /* renamed from: u */
    public View f189947u;

    /* renamed from: v */
    public View f189948v;

    /* renamed from: w */
    public View f189949w;

    /* renamed from: x */
    public View f189950x;

    /* renamed from: y */
    public AppBarLayout f189951y;

    /* renamed from: z */
    public boolean f189952z;

    /* renamed from: wg1.o0$d */
    public static final class C15329d implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f41657d;

        public C15329d(C66065o0 o0Var) {
            this.f41657d = o0Var;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback$initView$4$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(motionEvent, "p1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback$initView$4$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "motionEvent");
            this.f41657d.f189932I[0] = (int) motionEvent.getRawX();
            this.f41657d.f189932I[1] = (int) motionEvent.getRawY();
            return false;
        }
    }

    /* renamed from: wg1.o0$e */
    public static final class C15330e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f41658d;

        public C15330e(C66065o0 o0Var) {
            this.f41658d = o0Var;
        }

        public final void run() {
            int c = C75044y4.m89991c(this.f41658d.f189933d.getContext());
            Log.m105924i(this.f41658d.f189937h, "navigationBarHeight:" + c);
            ViewGroup.LayoutParams layoutParams = this.f41658d.f189933d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c;
        }
    }

    /* renamed from: wg1.o0$a */
    public static final class C66066a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189953d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66066a(C66065o0 o0Var) {
            super(1);
            this.f189953d = o0Var;
        }

        public Object invoke(Object obj) {
            C66089v vVar;
            if (!((Boolean) obj).booleanValue() && (vVar = this.f189953d.f189936g) != null) {
                vVar.hide();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.o0$b */
    public static final class C66067b implements AppBarLayout.C67445c {

        /* renamed from: a */
        public final /* synthetic */ C66065o0 f189954a;

        public C66067b(C66065o0 o0Var) {
            this.f189954a = o0Var;
        }

        /* renamed from: a */
        public final void mo3128a(AppBarLayout appBarLayout, int i) {
            if (i == appBarLayout.getHeight() * -1) {
                C66065o0 o0Var = this.f189954a;
                if (o0Var.f189924A != 1) {
                    o0Var.f189952z = false;
                    o0Var.f189924A = 0;
                    View view = o0Var.f189947u;
                    if (view != null) {
                        view.setBackground((Drawable) null);
                        return;
                    }
                    return;
                }
            }
            if (i == 0) {
                C66065o0 o0Var2 = this.f189954a;
                if (o0Var2.f189924A != 2) {
                    o0Var2.f189952z = true;
                    o0Var2.f189924A = 0;
                    View view2 = o0Var2.f189947u;
                    if (view2 != null) {
                        view2.setBackground(o0Var2.f189934e.getResources().getDrawable(C0966R.C0969drawable.b7y));
                    }
                }
            }
        }
    }

    /* renamed from: wg1.o0$c */
    public static final class C66068c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66068c(C66065o0 o0Var) {
            super(1);
            this.f189955d = o0Var;
        }

        public Object invoke(Object obj) {
            if (((Number) obj).intValue() > 0) {
                WxRecyclerView wxRecyclerView = this.f189955d.f189929F;
                RecyclerView.C16613e adapter = wxRecyclerView != null ? wxRecyclerView.getAdapter() : null;
                C63213g gVar = adapter instanceof C63213g ? (C63213g) adapter : null;
                if (gVar != null) {
                    C63213g.m74556F4(gVar, false, 1, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.o0$f */
    public static final class C66069f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189956d;

        public C66069f(C66065o0 o0Var) {
            this.f189956d = o0Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189956d.f189942p;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.o0$g */
    public static final class C66070g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189957d;

        public C66070g(C66065o0 o0Var) {
            this.f189957d = o0Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189957d.f189942p;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.o0$h */
    public static final class C66071h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189958d;

        public C66071h(C66065o0 o0Var) {
            this.f189958d = o0Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189958d.f189942p;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.o0$i */
    public static final class C66072i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189959d;

        public C66072i(C66065o0 o0Var) {
            this.f189959d = o0Var;
        }

        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            Class cls = C54991o.class;
            WxRecyclerView wxRecyclerView = this.f189959d.f189929F;
            if (!(wxRecyclerView == null || (viewTreeObserver = wxRecyclerView.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int i = ((C54991o) this.f189959d.f189935f.mo71262a(cls)).f154232N2.f153467d;
            if (i >= 0 && i < ((C54991o) this.f189959d.f189935f.mo71262a(cls)).f154232N2.f153469f.size()) {
                WxRecyclerView wxRecyclerView2 = this.f189959d.f189929F;
                LinearLayoutManager linearLayoutManager = null;
                RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(i));
                    C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback$showMusicView$2", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback$showMusicView$2", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            }
        }
    }

    /* renamed from: wg1.o0$j */
    public static final class C66073j implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189960d;

        public C66073j(C66065o0 o0Var) {
            this.f189960d = o0Var;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C66065o0 o0Var = this.f189960d;
            contextMenu.add(0, o0Var.f189938i, 0, o0Var.f189934e.getResources().getString(C0966R.string.dft));
        }
    }

    /* renamed from: wg1.o0$k */
    public static final class C66074k implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C66065o0 f189961d;

        /* renamed from: e */
        public final /* synthetic */ C54768h6 f189962e;

        /* renamed from: f */
        public final /* synthetic */ int f189963f;

        public C66074k(C66065o0 o0Var, C54768h6 h6Var, int i) {
            this.f189961d = o0Var;
            this.f189962e = h6Var;
            this.f189963f = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            C66065o0 o0Var = this.f189961d;
            if (itemId == o0Var.f189938i) {
                o0Var.f189931H.mo108266a();
                C66089v vVar = this.f189961d.f189936g;
                if (vVar != null) {
                    vVar.mo89997d1(this.f189962e, this.f189963f);
                }
                C66096w.C66097a.m77894a(this.f189961d, false, 1, (Object) null);
            }
        }
    }

    public C66065o0(View view, MMActivity mMActivity, C45795b bVar, C66089v vVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "liveData");
        this.f189933d = view;
        this.f189934e = mMActivity;
        this.f189935f = bVar;
        this.f189936g = vVar;
        this.f189931H = new C78253a(mMActivity);
        this.f189932I = new int[2];
    }

    /* renamed from: B */
    public void mo90095B(View view, int i, C54768h6 h6Var, int i2, int i3) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(h6Var, "musicItem");
        this.f189931H.mo108266a();
        this.f189931H.mo108273h(view, new C66073j(this), new C66074k(this, h6Var, i), i2, i3);
        C78253a aVar = this.f189931H;
        MMListPopupWindow mMListPopupWindow = aVar.f229242h;
        if (mMListPopupWindow != null) {
            mMListPopupWindow.f214823g.setBackgroundDrawable(aVar.f229238d.getResources().getDrawable(C0966R.C0969drawable.c2w));
        }
        C78253a aVar2 = this.f189931H;
        aVar2.f229232H = true;
        aVar2.f229231G = C0966R.color.BW_100_Alpha_0_8;
    }

    /* renamed from: J */
    public void mo90096J(int i) {
        SeekBar seekBar = this.f189926C;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
        TextView textView = this.f189927D;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* renamed from: a */
    public void mo90097a() {
        Class cls = C54991o.class;
        Log.m105924i(this.f189937h, "initView");
        View findViewById = this.f189933d.findViewById(C0966R.C0970id.dcp);
        this.f189940n = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f189941o = this.f189933d.findViewById(C0966R.C0970id.dcz);
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) this.f189933d.findViewById(C0966R.C0970id.dcq);
        this.f189942p = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setOnClickListener(this);
        }
        LiveBottomSheetPanel liveBottomSheetPanel2 = this.f189942p;
        if (liveBottomSheetPanel2 != null) {
            liveBottomSheetPanel2.setOnVisibilityListener(new C66066a(this));
            liveBottomSheetPanel2.setTranslationY((float) C75044y4.m89990b(this.f189933d.getContext()).y);
            liveBottomSheetPanel2.getLayoutParams().height = this.f189939j;
        }
        this.f189943q = this.f189933d.findViewById(C0966R.C0970id.dcr);
        View findViewById2 = this.f189933d.findViewById(C0966R.C0970id.dtm);
        this.f189944r = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        this.f189945s = this.f189933d.findViewById(C0966R.C0970id.h5p);
        View findViewById3 = this.f189933d.findViewById(C0966R.C0970id.grr);
        this.f189946t = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View findViewById4 = this.f189933d.findViewById(C0966R.C0970id.lds);
        this.f189947u = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this);
        }
        View findViewById5 = this.f189933d.findViewById(C0966R.C0970id.f5578iw);
        this.f189948v = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(this);
        }
        this.f189949w = this.f189933d.findViewById(C0966R.C0970id.h6b);
        TextView textView = (TextView) this.f189933d.findViewById(C0966R.C0970id.h6_);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.f189950x = this.f189933d.findViewById(C0966R.C0970id.h5v);
        AppBarLayout appBarLayout = (AppBarLayout) this.f189933d.findViewById(C0966R.C0970id.h7d);
        this.f189951y = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.mo146159a(new C66067b(this));
            CoordinatorLayout.C103717e eVar = new CoordinatorLayout.C103717e(-1, -2);
            eVar.mo144938b(new FinderLiveMusicScrollViewBehavior(this.f189934e, (AttributeSet) null));
            appBarLayout.setLayoutParams(eVar);
        }
        this.f189925B = this.f189933d.findViewById(C0966R.C0970id.h7e);
        this.f189926C = (SeekBar) this.f189933d.findViewById(C0966R.C0970id.h7f);
        this.f189927D = (TextView) this.f189933d.findViewById(C0966R.C0970id.h7g);
        SeekBar seekBar = this.f189926C;
        if (seekBar != null) {
            seekBar.setProgress(((C54991o) this.f189935f.mo71262a(cls)).f154239P2 ? 5 : ((C54991o) this.f189935f.mo71262a(cls)).f154235O2);
        }
        C66089v vVar = this.f189936g;
        if (vVar != null) {
            SeekBar seekBar2 = this.f189926C;
            vVar.mo89995V(seekBar2 != null ? seekBar2.getProgress() : ((C54991o) this.f189935f.mo71262a(cls)).f154235O2, false);
        }
        SeekBar seekBar3 = this.f189926C;
        if (seekBar3 != null) {
            seekBar3.setOnSeekBarChangeListener(this);
        }
        View findViewById6 = this.f189933d.findViewById(C0966R.C0970id.dcr);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…_music_content_item_root)");
        WxRecyclerView wxRecyclerView = new C46265l0((ViewGroup) findViewById6, this.f189936g, new C66068c(this)).f124715d;
        this.f189929F = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.mo17092j0(new C15329d(this));
        }
        View findViewById7 = this.f189933d.findViewById(C0966R.C0970id.dcs);
        C87412m.m108593f(findViewById7, "root.findViewById<Relati…_music_edit_content_area)");
        this.f189930G = new C60446k0((ViewGroup) findViewById7, this.f189935f, this.f189936g);
        this.f189928E = (ProgressBar) this.f189933d.findViewById(C0966R.C0970id.h6o);
        View view = this.f189925B;
        SeekBar seekBar4 = this.f189926C;
        if (!(view == null || seekBar4 == null)) {
            C62042e eVar2 = C62042e.f176370a;
            int i = C62042e.f176376g;
            eVar2.getClass();
            view.setOnTouchListener(new C11467q(seekBar4, i));
        }
        this.f189933d.post(new C15330e(this));
    }

    /* renamed from: f */
    public void mo90098f(List<C54768h6> list) {
        ViewTreeObserver viewTreeObserver;
        C87412m.m108594g(list, "musicData");
        int size = list.size();
        String str = this.f189937h;
        Log.m105924i(str, "showMusicView size:" + size);
        View view = this.f189945s;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f189949w;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view4 = this.f189950x;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WxRecyclerView wxRecyclerView = this.f189929F;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        ProgressBar progressBar = this.f189928E;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        LiveBottomSheetPanel liveBottomSheetPanel = this.f189942p;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.post(new C66071h(this));
        }
        C66096w.C66097a.m77894a(this, false, 1, (Object) null);
        WxRecyclerView wxRecyclerView2 = this.f189929F;
        if (wxRecyclerView2 != null && (viewTreeObserver = wxRecyclerView2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C66072i(this));
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f189934e;
    }

    /* renamed from: h */
    public void mo90099h(boolean z) {
        LiveBottomSheetPanel liveBottomSheetPanel;
        View view = this.f189945s;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f189949w;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view4 = this.f189950x;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ProgressBar progressBar = this.f189928E;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z && (liveBottomSheetPanel = this.f189942p) != null) {
            liveBottomSheetPanel.post(new C66069f(this));
        }
        C66096w.C66097a.m77894a(this, false, 1, (Object) null);
    }

    /* renamed from: l */
    public void mo90100l() {
        View view = this.f189945s;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f189949w;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view4 = this.f189950x;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WxRecyclerView wxRecyclerView = this.f189929F;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        ProgressBar progressBar = this.f189928E;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        LiveBottomSheetPanel liveBottomSheetPanel = this.f189942p;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.post(new C66070g(this));
        }
        C66096w.C66097a.m77894a(this, false, 1, (Object) null);
    }

    /* renamed from: m */
    public int[] mo90101m() {
        return this.f189932I;
    }

    /* renamed from: o */
    public void mo90102o() {
        C60446k0 k0Var = this.f189930G;
        if (k0Var != null) {
            k0Var.mo85415c(false, false);
        }
    }

    public void onClick(View view) {
        Class cls = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dcp) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189942p;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78802a();
            }
            C60446k0 k0Var = this.f189930G;
            if (k0Var != null) {
                k0Var.mo85415c(false, true);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dtm) {
            LiveBottomSheetPanel liveBottomSheetPanel2 = this.f189942p;
            if (liveBottomSheetPanel2 != null) {
                liveBottomSheetPanel2.mo78802a();
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.h6_) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.f5578iw)) {
                C66089v vVar = this.f189936g;
                if (vVar != null) {
                    vVar.mo90002j();
                }
                C66107x1.f190022a.mo90147a(((C54991o) this.f189935f.mo71262a(cls)).mo75999e4(), 1, 0);
            } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.grr) {
                C60446k0 k0Var2 = this.f189930G;
                if (k0Var2 != null) {
                    k0Var2.mo85415c(true, false);
                }
                C66107x1.f190022a.mo90147a(((C54991o) this.f189935f.mo71262a(cls)).mo75999e4(), 5, 0);
            } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.lds) {
                String str2 = this.f189937h;
                Log.m105924i(str2, "doVolumeAction appBarVisible:" + this.f189952z + ", volumeState:" + this.f189924A);
                if (this.f189952z) {
                    mo90107u0(true);
                } else {
                    this.f189952z = true;
                    this.f189924A = 1;
                    AppBarLayout appBarLayout = this.f189951y;
                    if (appBarLayout != null) {
                        appBarLayout.mo146163d(true, true, true);
                    }
                    View view2 = this.f189947u;
                    if (view2 != null) {
                        view2.setBackground(this.f189934e.getResources().getDrawable(C0966R.C0969drawable.b7y));
                    }
                    TextView textView = this.f189927D;
                    if (textView != null) {
                        SeekBar seekBar = this.f189926C;
                        if (seekBar != null) {
                            str = Integer.valueOf(seekBar.getProgress()).toString();
                        }
                        textView.setText(str);
                    }
                }
                C66107x1.f190022a.mo90147a(((C54991o) this.f189935f.mo71262a(cls)).mo75999e4(), 3, 0);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorMusicViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String str = this.f189937h;
        Log.m105924i(str, "onProgressChanged progress:" + i + ",fromUser:" + z);
        C66089v vVar = this.f189936g;
        if (vVar != null) {
            vVar.mo89995V(i, true);
        }
        TextView textView = this.f189927D;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        Class cls = C54991o.class;
        String str = this.f189937h;
        StringBuilder sb = new StringBuilder();
        sb.append("onStopTrackingTouch inMiniVolumeState:");
        sb.append(((C54991o) this.f189935f.mo71262a(cls)).f154239P2);
        sb.append(", recoveryVolume:");
        sb.append(((C54991o) this.f189935f.mo71262a(cls)).f154235O2);
        sb.append(", progress:");
        sb.append(seekBar != null ? Integer.valueOf(seekBar.getProgress()) : null);
        Log.m105924i(str, sb.toString());
        ((C54991o) this.f189935f.mo71262a(cls)).f154239P2 = false;
        C54991o oVar = (C54991o) this.f189935f.mo71262a(cls);
        if (seekBar != null) {
            oVar.f154235O2 = seekBar.getProgress();
        }
    }

    /* renamed from: u0 */
    public void mo90107u0(boolean z) {
        this.f189952z = false;
        this.f189924A = 2;
        View view = this.f189947u;
        if (view != null) {
            view.setBackground((Drawable) null);
        }
        AppBarLayout appBarLayout = this.f189951y;
        if (appBarLayout != null) {
            appBarLayout.mo146163d(false, z, true);
        }
    }
}
