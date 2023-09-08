package wg1;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: wg1.f3 */
public final class C66002f3 implements C66009f4, View.OnClickListener {

    /* renamed from: d */
    public final View f189751d;

    /* renamed from: e */
    public final MMActivity f189752e;

    /* renamed from: f */
    public final C65997e4 f189753f;

    /* renamed from: g */
    public final String f189754g = "FinderLiveVisitorMusicSingSongViewCallback";

    /* renamed from: h */
    public final int f189755h = ((int) (((float) C75044y4.m89990b(MMApplicationContext.getContext()).y) * (((float) C32444a.f86121a.mo58621b()) / 100.0f)));

    /* renamed from: i */
    public View f189756i;

    /* renamed from: j */
    public View f189757j;

    /* renamed from: n */
    public LiveBottomSheetPanel f189758n;

    /* renamed from: o */
    public View f189759o;

    /* renamed from: p */
    public TextView f189760p;

    /* renamed from: q */
    public FrameLayout f189761q;

    /* renamed from: r */
    public ProgressBar f189762r;

    /* renamed from: s */
    public WxRecyclerView f189763s;

    /* renamed from: t */
    public View f189764t;

    /* renamed from: wg1.f3$a */
    public static final class C66003a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66002f3 f189765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66003a(C66002f3 f3Var) {
            super(1);
            this.f189765d = f3Var;
        }

        public Object invoke(Object obj) {
            C65997e4 e4Var;
            if (!((Boolean) obj).booleanValue() && (e4Var = this.f189765d.f189753f) != null) {
                e4Var.hide();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.f3$b */
    public static final class C66004b implements RecyclerView.C16622o {
        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback$initView$2$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(motionEvent, "p1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback$initView$2$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "motionEvent");
            return false;
        }
    }

    /* renamed from: wg1.f3$c */
    public static final class C66005c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66002f3 f189766d;

        public C66005c(C66002f3 f3Var) {
            this.f189766d = f3Var;
        }

        public final void run() {
            int c = C75044y4.m89991c(this.f189766d.f189751d.getContext());
            Log.m105924i(this.f189766d.f189754g, "navigationBarHeight:" + c);
            ViewGroup.LayoutParams layoutParams = this.f189766d.f189751d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c;
        }
    }

    /* renamed from: wg1.f3$d */
    public static final class C66006d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66002f3 f189767d;

        public C66006d(C66002f3 f3Var) {
            this.f189767d = f3Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189767d.f189758n;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.f3$e */
    public static final class C66007e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66002f3 f189768d;

        public C66007e(C66002f3 f3Var) {
            this.f189768d = f3Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189768d.f189758n;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    /* renamed from: wg1.f3$f */
    public static final class C66008f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66002f3 f189769d;

        public C66008f(C66002f3 f3Var) {
            this.f189769d = f3Var;
        }

        public final void run() {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189769d.f189758n;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78804d();
            }
        }
    }

    public C66002f3(View view, MMActivity mMActivity, C45795b bVar, C65997e4 e4Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "liveData");
        this.f189751d = view;
        this.f189752e = mMActivity;
        this.f189753f = e4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c5, code lost:
        r2 = r2.getLayoutParams();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90036a() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f189754g
            java.lang.String r1 = "initView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.view.View r0 = r6.f189751d
            r1 = 2131304418(0x7f091fe2, float:1.8226978E38)
            android.view.View r0 = r0.findViewById(r1)
            r6.f189756i = r0
            if (r0 == 0) goto L_0x0017
            r0.setOnClickListener(r6)
        L_0x0017:
            android.view.View r0 = r6.f189751d
            r1 = 2131313629(0x7f0943dd, float:1.824566E38)
            android.view.View r0 = r0.findViewById(r1)
            r6.f189757j = r0
            android.view.View r0 = r6.f189751d
            r1 = 2131304404(0x7f091fd4, float:1.822695E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r0
            r6.f189758n = r0
            android.view.View r0 = r6.f189751d
            r1 = 2131313620(0x7f0943d4, float:1.8245642E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.f189762r = r0
            android.view.View r0 = r6.f189751d
            r1 = 2131304419(0x7f091fe3, float:1.822698E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f189760p = r0
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r6.f189758n
            if (r0 == 0) goto L_0x0050
            r0.setOnClickListener(r6)
        L_0x0050:
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r6.f189758n
            if (r0 == 0) goto L_0x0074
            wg1.f3$a r1 = new wg1.f3$a
            r1.<init>(r6)
            r0.setOnVisibilityListener(r1)
            android.view.View r1 = r6.f189751d
            android.content.Context r1 = r1.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r1 = r6.f189755h
            r0.height = r1
        L_0x0074:
            android.view.View r0 = r6.f189751d
            r1 = 2131313628(0x7f0943dc, float:1.8245658E38)
            android.view.View r0 = r0.findViewById(r1)
            r6.f189759o = r0
            if (r0 == 0) goto L_0x0084
            r0.setOnClickListener(r6)
        L_0x0084:
            android.view.View r0 = r6.f189751d
            r1 = 2131313630(0x7f0943de, float:1.8245662E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f189761q = r0
            android.view.View r0 = r6.f189751d
            r1 = 2131313631(0x7f0943df, float:1.8245664E38)
            android.view.View r0 = r0.findViewById(r1)
            r6.f189764t = r0
            android.view.View r0 = r6.f189751d
            r1 = 2131313632(0x7f0943e0, float:1.8245666E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            r6.f189763s = r0
            if (r0 == 0) goto L_0x00b3
            wg1.f3$b r1 = new wg1.f3$b
            r1.<init>()
            r0.mo17092j0(r1)
        L_0x00b3:
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r6.f189763s
            if (r0 == 0) goto L_0x0100
            android.view.View r1 = r6.f189751d
            android.content.Context r1 = r1.getContext()
            int r1 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r1)
            android.view.View r2 = r6.f189757j
            if (r2 == 0) goto L_0x00ce
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x00ce
            int r2 = r2.height
            goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            if (r2 > 0) goto L_0x00e0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r2 = r2.getDimensionPixelOffset(r3)
        L_0x00e0:
            int r3 = r6.f189755h
            int r3 = r3 - r1
            int r3 = r3 - r2
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r3
            java.lang.String r0 = r6.f189754g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "adjustRvHeight height:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0100:
            android.view.View r0 = r6.f189751d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 == r1) goto L_0x0148
            android.view.View r0 = r6.f189751d
            wg1.f3$c r1 = new wg1.f3$c
            r1.<init>(r6)
            r0.post(r1)
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r6.f189758n
            if (r0 == 0) goto L_0x017d
            android.view.View r1 = r6.f189751d
            int r1 = r1.getPaddingLeft()
            android.view.View r2 = r6.f189751d
            int r2 = r2.getPaddingTop()
            android.view.View r3 = r6.f189751d
            int r3 = r3.getPaddingRight()
            android.view.View r4 = r6.f189751d
            int r4 = r4.getPaddingBottom()
            android.view.View r5 = r6.f189751d
            android.content.Context r5 = r5.getContext()
            int r5 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r5)
            int r4 = r4 + r5
            r0.setPadding(r1, r2, r3, r4)
            goto L_0x017d
        L_0x0148:
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r6.f189758n
            r1 = 0
            if (r0 == 0) goto L_0x0152
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0153
        L_0x0152:
            r0 = r1
        L_0x0153:
            if (r0 != 0) goto L_0x0156
            goto L_0x0164
        L_0x0156:
            android.view.View r2 = r6.f189751d
            android.content.Context r2 = r2.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            r0.width = r2
        L_0x0164:
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r6.f189758n
            if (r0 == 0) goto L_0x016c
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L_0x016c:
            if (r1 != 0) goto L_0x016f
            goto L_0x017d
        L_0x016f:
            android.view.View r0 = r6.f189751d
            android.content.Context r0 = r0.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r0 = r0.x
            r1.height = r0
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66002f3.mo90036a():void");
    }

    /* renamed from: f */
    public void mo90037f(List<C54785k6> list) {
        String str;
        C87412m.m108594g(list, "musicData");
        int size = list.size();
        String str2 = this.f189754g;
        Log.m105924i(str2, "showMusicView size:" + size);
        View view = this.f189757j;
        boolean z = false;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FrameLayout frameLayout = this.f189761q;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View view2 = this.f189764t;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WxRecyclerView wxRecyclerView = this.f189763s;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        ProgressBar progressBar = this.f189762r;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.f189760p;
        if (textView != null) {
            if (size > 0) {
                str = this.f189751d.getContext().getResources().getString(C0966R.string.mc8, new Object[]{String.valueOf(size)});
            } else {
                str = this.f189751d.getContext().getResources().getString(C0966R.string.mc9);
            }
            textView.setText(str);
        }
        TextView textView2 = this.f189760p;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        LiveBottomSheetPanel liveBottomSheetPanel = this.f189758n;
        if (liveBottomSheetPanel != null && !liveBottomSheetPanel.f165501h) {
            z = true;
        }
        if (z && liveBottomSheetPanel != null) {
            liveBottomSheetPanel.post(new C66008f(this));
        }
    }

    /* renamed from: g */
    public void mo90038g(boolean z) {
        View view = this.f189757j;
        boolean z2 = false;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FrameLayout frameLayout = this.f189761q;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TextView textView = this.f189760p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view2 = this.f189764t;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WxRecyclerView wxRecyclerView = this.f189763s;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        ProgressBar progressBar = this.f189762r;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (z) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189758n;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.f165501h) {
                z2 = true;
            }
            if (z2 && liveBottomSheetPanel != null) {
                liveBottomSheetPanel.post(new C66007e(this));
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f189752e;
    }

    /* renamed from: h */
    public void mo90039h(boolean z) {
        View view = this.f189757j;
        boolean z2 = false;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f189760p;
        if (textView != null) {
            textView.setText(this.f189751d.getContext().getResources().getString(C0966R.string.mc9));
        }
        TextView textView2 = this.f189760p;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        FrameLayout frameLayout = this.f189761q;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        WxRecyclerView wxRecyclerView = this.f189763s;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        View view2 = this.f189764t;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ProgressBar progressBar = this.f189762r;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z) {
            LiveBottomSheetPanel liveBottomSheetPanel = this.f189758n;
            if (liveBottomSheetPanel != null && !liveBottomSheetPanel.f165501h) {
                z2 = true;
            }
            if (z2 && liveBottomSheetPanel != null) {
                liveBottomSheetPanel.post(new C66006d(this));
            }
        }
    }

    public void onClick(View view) {
        LiveBottomSheetPanel liveBottomSheetPanel;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mrw) {
            LiveBottomSheetPanel liveBottomSheetPanel2 = this.f189758n;
            if (liveBottomSheetPanel2 != null) {
                liveBottomSheetPanel2.mo78802a();
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.mw6 || (liveBottomSheetPanel = this.f189758n) == null)) {
            liveBottomSheetPanel.mo78802a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
