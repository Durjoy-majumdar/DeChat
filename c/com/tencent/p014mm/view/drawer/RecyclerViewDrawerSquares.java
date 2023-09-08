package com.tencent.p014mm.view.drawer;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p282z2.C16095a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002RSB\u001d\b\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bM\u0010NB%\b\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\b\u0010L\u001a\u0004\u0018\u00010K\u0012\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bM\u0010QJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR(\u0010-\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR\"\u00105\u001a\u0002028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010H\u001a\u0002022\u0006\u0010D\u001a\u0002028\u0006@FX\u000e¢\u0006\u0012\n\u0004\bE\u00104\u001a\u0004\bF\u00106\"\u0004\bG\u00108¨\u0006T"}, mo182094d2 = {"Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "Lcom/tencent/mm/ui/tools/t0;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "", "translationY", "Lrx3/b0;", "setTranslationY", "d", "Lcom/tencent/mm/ui/tools/t0;", "getKeyboardHeightObserver", "()Lcom/tencent/mm/ui/tools/t0;", "setKeyboardHeightObserver", "(Lcom/tencent/mm/ui/tools/t0;)V", "keyboardHeightObserver", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "e", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "getCenterLayout", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "setCenterLayout", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout;)V", "centerLayout", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "getDrawerFooterLayout", "()Landroid/widget/FrameLayout;", "setDrawerFooterLayout", "(Landroid/widget/FrameLayout;)V", "drawerFooterLayout", "g", "getDrawerHeaderLayout", "setDrawerHeaderLayout", "drawerHeaderLayout", "", "Landroid/view/View;", "h", "Ljava/util/List;", "getIgnoreInterceptViewList", "()Ljava/util/List;", "setIgnoreInterceptViewList", "(Ljava/util/List;)V", "ignoreInterceptViewList", "i", "getLoadingLayout", "setLoadingLayout", "loadingLayout", "", "j", "Z", "isClosing", "()Z", "setClosing", "(Z)V", "n", "isOpening", "setOpening", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "p", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "getOnOpenDrawerListener", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "setOnOpenDrawerListener", "(Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "onOpenDrawerListener", "value", "t", "getCanCloseDrawerWhenStop", "setCanCloseDrawerWhenStop", "canCloseDrawerWhenStop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "c", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares */
public final class RecyclerViewDrawerSquares extends LinearLayout implements HeadFooterLayout.C57874a, C7020t0 {

    /* renamed from: u */
    public static final /* synthetic */ int f165685u = 0;

    /* renamed from: d */
    public C7020t0 f165686d;

    /* renamed from: e */
    public RefreshLoadMoreLayout f165687e;

    /* renamed from: f */
    public FrameLayout f165688f;

    /* renamed from: g */
    public FrameLayout f165689g;

    /* renamed from: h */
    public List<View> f165690h = new ArrayList();

    /* renamed from: i */
    public FrameLayout f165691i;

    /* renamed from: j */
    public boolean f165692j;

    /* renamed from: n */
    public boolean f165693n;

    /* renamed from: o */
    public KeyboardHeightProvider f165694o;

    /* renamed from: p */
    public C45117c f165695p;

    /* renamed from: q */
    public C57901b f165696q;

    /* renamed from: r */
    public final C32226l<C32224a<C13598b0>, C13598b0> f165697r;

    /* renamed from: s */
    public boolean f165698s;

    /* renamed from: t */
    public boolean f165699t;

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$a */
    public static final class C45116a implements View.OnClickListener {

        /* renamed from: d */
        public static final C45116a f122385d = new C45116a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/drawer/RecyclerViewDrawerSquares$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/view/drawer/RecyclerViewDrawerSquares$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$c */
    public interface C45117c {
        /* renamed from: e */
        void mo9497e(float f);

        /* renamed from: f */
        void mo9498f();

        /* renamed from: g */
        void mo3766g(boolean z, boolean z2, int i);
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$b */
    public interface C57901b {
        /* renamed from: a */
        void mo82577a(int i, int i2, int i3, int i4);
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$d */
    public static final class C57902d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerViewDrawerSquares f165700d;

        public C57902d(RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
            this.f165700d = recyclerViewDrawerSquares;
        }

        public final void run() {
            this.f165700d.setVisibility(8);
            this.f165700d.setClosing(false);
            C45117c onOpenDrawerListener = this.f165700d.getOnOpenDrawerListener();
            if (onOpenDrawerListener != null) {
                onOpenDrawerListener.mo3766g(false, false, 0);
            }
            this.f165700d.f165694o.mo104021d();
            RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f165700d;
            recyclerViewDrawerSquares.f165698s = false;
            C7020t0 keyboardHeightObserver = recyclerViewDrawerSquares.getKeyboardHeightObserver();
            if (keyboardHeightObserver != null) {
                keyboardHeightObserver.mo531Q1(0, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$e */
    public static final class C57903e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerViewDrawerSquares f165701d;

        public C57903e(RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
            this.f165701d = recyclerViewDrawerSquares;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105918d("DrawerSquares", "[closeDrawer] setUpdateListener height:" + this.f165701d.getHeight() + ", translationY:" + this.f165701d.getTranslationY());
            C45117c onOpenDrawerListener = this.f165701d.getOnOpenDrawerListener();
            if (onOpenDrawerListener != null) {
                onOpenDrawerListener.mo9497e((this.f165701d.getTranslationY() * 1.0f) / ((float) this.f165701d.getHeight()));
            }
        }
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$f */
    public static final class C57904f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerViewDrawerSquares f165702d;

        public C57904f(RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
            this.f165702d = recyclerViewDrawerSquares;
        }

        public final void run() {
            this.f165702d.setAlpha(1.0f);
            RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f165702d;
            recyclerViewDrawerSquares.setTranslationY((float) recyclerViewDrawerSquares.getHeight());
            this.f165702d.setVisibility(8);
            RecyclerViewDrawerSquares recyclerViewDrawerSquares2 = this.f165702d;
            recyclerViewDrawerSquares2.f165698s = false;
            recyclerViewDrawerSquares2.setClosing(false);
            C45117c onOpenDrawerListener = this.f165702d.getOnOpenDrawerListener();
            if (onOpenDrawerListener != null) {
                onOpenDrawerListener.mo3766g(false, false, 0);
            }
            this.f165702d.f165694o.mo104021d();
            C7020t0 keyboardHeightObserver = this.f165702d.getKeyboardHeightObserver();
            if (keyboardHeightObserver != null) {
                keyboardHeightObserver.mo531Q1(0, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$g */
    public static final class C57905g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecyclerViewDrawerSquares f165703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57905g(RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
            super(0);
            this.f165703d = recyclerViewDrawerSquares;
        }

        public Object invoke() {
            this.f165703d.setOpening(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$h */
    public static final class C57906h extends C87413o implements C32226l<C32224a<? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecyclerViewDrawerSquares f165704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57906h(RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
            super(1);
            this.f165704d = recyclerViewDrawerSquares;
        }

        public Object invoke(Object obj) {
            C32224a aVar = (C32224a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f165704d;
            if (!recyclerViewDrawerSquares.f165692j) {
                recyclerViewDrawerSquares.clearAnimation();
                this.f165704d.animate().cancel();
                this.f165704d.animate().setInterpolator(new DecelerateInterpolator(1.5f)).translationY(0.0f).withEndAction(new C30872a(aVar)).setUpdateListener(new C57907b(this.f165704d)).setDuration(300).start();
            }
            return C13598b0.f38549a;
        }
    }

    public RecyclerViewDrawerSquares(Context context) {
        super(context);
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        this.f165694o = new KeyboardHeightProvider((Activity) context2);
        this.f165697r = new C57906h(this);
        setOrientation(1);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bqy, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.ijk);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.refresh_load_more_layout)");
        this.f165687e = (RefreshLoadMoreLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hwv);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.placeholder_drawer_header)");
        this.f165689g = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hwu);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.placeholder_drawer_footer)");
        this.f165688f = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.hww);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.placeholder_loading_layout)");
        this.f165691i = (FrameLayout) findViewById4;
        this.f165687e.setOverCallback(this);
        setVisibility(8);
        this.f165694o.f220015b = this;
        setOnClickListener(C45116a.f122385d);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        this.f165698s = i > 0;
        C7020t0 t0Var = this.f165686d;
        if (t0Var != null) {
            t0Var.mo531Q1(i, z);
        }
    }

    /* renamed from: a */
    public final void mo82553a(boolean z) {
        Log.m105924i("DrawerSquares", "closeDrawer isClosing " + this.f165692j + ", isWithAnim " + z);
        if (!this.f165692j) {
            Context context = getContext();
            MMFragmentActivity mMFragmentActivity = context instanceof MMFragmentActivity ? (MMFragmentActivity) context : null;
            if (mMFragmentActivity != null) {
                mMFragmentActivity.hideVKB();
            }
            this.f165692j = true;
            this.f165693n = false;
            C45117c cVar = this.f165695p;
            if (cVar != null) {
                cVar.mo3766g(false, true, 0);
            }
            if (z) {
                clearAnimation();
                animate().cancel();
                animate().setInterpolator(new DecelerateInterpolator(1.5f)).translationY((float) getHeight()).setDuration(300).withEndAction(new C57902d(this)).setUpdateListener(new C57903e(this)).setStartDelay(this.f165698s ? 200 : 0).start();
                return;
            }
            clearAnimation();
            animate().cancel();
            animate().alpha(0.0f).setDuration(300).withEndAction(new C57904f(this));
        }
    }

    public final boolean getCanCloseDrawerWhenStop() {
        return this.f165699t;
    }

    public final RefreshLoadMoreLayout getCenterLayout() {
        return this.f165687e;
    }

    public final FrameLayout getDrawerFooterLayout() {
        return this.f165688f;
    }

    public final FrameLayout getDrawerHeaderLayout() {
        return this.f165689g;
    }

    public final List<View> getIgnoreInterceptViewList() {
        return this.f165690h;
    }

    public final C7020t0 getKeyboardHeightObserver() {
        return this.f165686d;
    }

    public final FrameLayout getLoadingLayout() {
        return this.f165691i;
    }

    public final C45117c getOnOpenDrawerListener() {
        return this.f165695p;
    }

    public final RecyclerView getRecyclerView() {
        return this.f165687e.getRecyclerView();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getContext() instanceof Activity) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).getWindow().setSoftInputMode(48);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f165694o.mo104021d();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C57901b bVar;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (bVar = this.f165696q) != null) {
            bVar.mo82577a(i, i2, i3, i4);
        }
    }

    /* renamed from: p */
    public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
        return false;
    }

    public final void setCanCloseDrawerWhenStop(boolean z) {
        this.f165699t = z;
        Log.m105924i("DrawerSquares", "lxl set canCloseDrawerWhenStop " + z + ' ');
    }

    public final void setCenterLayout(RefreshLoadMoreLayout refreshLoadMoreLayout) {
        C87412m.m108594g(refreshLoadMoreLayout, "<set-?>");
        this.f165687e = refreshLoadMoreLayout;
    }

    public final void setClosing(boolean z) {
        this.f165692j = z;
    }

    public final void setDrawerFooterLayout(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f165688f = frameLayout;
    }

    public final void setDrawerHeaderLayout(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f165689g = frameLayout;
    }

    public final void setIgnoreInterceptViewList(List<View> list) {
        C87412m.m108594g(list, "<set-?>");
        this.f165690h = list;
    }

    public final void setKeyboardHeightObserver(C7020t0 t0Var) {
        this.f165686d = t0Var;
    }

    public final void setLoadingLayout(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f165691i = frameLayout;
    }

    public final void setOnOpenDrawerListener(C45117c cVar) {
        this.f165695p = cVar;
    }

    public final void setOpening(boolean z) {
        this.f165693n = z;
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C45117c cVar = this.f165695p;
        if (cVar != null) {
            cVar.mo9497e((f * 1.0f) / ((float) getHeight()));
        }
    }

    /* renamed from: v */
    public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
        if (this.f165692j || this.f165693n) {
            return true;
        }
        if (i3 == 1 && !z) {
            return false;
        }
        if ((!z && (z || i2 >= 0)) || !this.f165699t) {
            return false;
        }
        setTranslationY(C16095a.m14979a(getTranslationY() - ((float) i2), 0.0f, (float) getHeight()));
        return true;
    }

    /* renamed from: x */
    public void mo3720x(int i) {
        if (getTranslationY() < ((float) getHeight()) * 0.25f) {
            ((C57906h) this.f165697r).invoke(new C57905g(this));
        } else if (this.f165699t) {
            mo82553a(true);
        }
    }

    public RecyclerViewDrawerSquares(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        this.f165694o = new KeyboardHeightProvider((Activity) context2);
        this.f165697r = new C57906h(this);
        setOrientation(1);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bqy, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.ijk);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.refresh_load_more_layout)");
        this.f165687e = (RefreshLoadMoreLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hwv);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.placeholder_drawer_header)");
        this.f165689g = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hwu);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.placeholder_drawer_footer)");
        this.f165688f = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.hww);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.placeholder_loading_layout)");
        this.f165691i = (FrameLayout) findViewById4;
        this.f165687e.setOverCallback(this);
        setVisibility(8);
        this.f165694o.f220015b = this;
        setOnClickListener(C45116a.f122385d);
    }

    public RecyclerViewDrawerSquares(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        this.f165694o = new KeyboardHeightProvider((Activity) context2);
        this.f165697r = new C57906h(this);
        setOrientation(1);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bqy, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.ijk);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.refresh_load_more_layout)");
        this.f165687e = (RefreshLoadMoreLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hwv);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.placeholder_drawer_header)");
        this.f165689g = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hwu);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.placeholder_drawer_footer)");
        this.f165688f = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.hww);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.placeholder_loading_layout)");
        this.f165691i = (FrameLayout) findViewById4;
        this.f165687e.setOverCallback(this);
        setVisibility(8);
        this.f165694o.f220015b = this;
        setOnClickListener(C45116a.f122385d);
    }
}
