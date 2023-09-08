package zs1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.webview.p800ad.CenterScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ExpandableScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import er1.C7865r3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zs1.h */
public final class C53810h extends FrameLayout implements C53812i {

    /* renamed from: A */
    public int f150991A;

    /* renamed from: B */
    public int f150992B;

    /* renamed from: C */
    public int f150993C;

    /* renamed from: D */
    public int f150994D;

    /* renamed from: E */
    public RecyclerViewDrawerSquares.C45117c f150995E;

    /* renamed from: F */
    public C53813j f150996F;

    /* renamed from: d */
    public final C39444l f150997d;

    /* renamed from: e */
    public Context f150998e;

    /* renamed from: f */
    public ViewGroup f150999f;

    /* renamed from: g */
    public ScrollFrameLayout f151000g;

    /* renamed from: h */
    public final int f151001h;

    /* renamed from: i */
    public final int f151002i;

    /* renamed from: j */
    public final int f151003j;

    /* renamed from: n */
    public final int f151004n = C75044y4.m89994f(this.f150998e);

    /* renamed from: o */
    public final int f151005o;

    /* renamed from: p */
    public DialogInterface.OnDismissListener f151006p;

    /* renamed from: q */
    public final int f151007q;

    /* renamed from: r */
    public int f151008r;

    /* renamed from: s */
    public int f151009s;

    /* renamed from: t */
    public float f151010t;

    /* renamed from: u */
    public int f151011u;

    /* renamed from: v */
    public int f151012v;

    /* renamed from: w */
    public int f151013w;

    /* renamed from: x */
    public int f151014x;

    /* renamed from: y */
    public int f151015y;

    /* renamed from: z */
    public int f151016z;

    /* renamed from: zs1.h$a */
    public static final class C53811a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53810h f151017d;

        public C53811a(C53810h hVar) {
            this.f151017d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/webview/ad/FinderViewScrollContainer$setCanceledOnTouchOutside$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f151017d.mo74384a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/ad/FinderViewScrollContainer$setCanceledOnTouchOutside$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53810h(Context context, C39444l lVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "scConfig");
        this.f150997d = lVar;
        this.f150998e = context;
        C7865r3 r3Var = C7865r3.f26468a;
        int a = r3Var.mo8968a();
        this.f151001h = a;
        int c = r3Var.mo8970c();
        this.f151002i = c;
        int c2 = C75044y4.m89991c(this.f150998e);
        this.f151003j = c2;
        int dimension = (int) this.f150998e.getResources().getDimension(C0966R.dimen.f3758d_);
        this.f151005o = dimension;
        int i = lVar.f105948a;
        this.f151007q = i;
        this.f151010t = lVar.f105949b;
        this.f150994D = 80;
        View inflate = C85868k2.m106137b(this.f150998e).inflate(C0966R.C0971layout.a8v, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f150999f = viewGroup;
        viewGroup.setOnClickListener(new C53809g(this));
        if (i == 1) {
            this.f151008r = c;
            this.f151013w = c;
            int i2 = (int) (((float) a) * this.f151010t);
            this.f151011u = i2;
            this.f151009s = lVar.f105950c ? a - dimension : i2;
            Log.m105924i("Finder.FinderScrollDialog", "screenH=" + a + ", navH=" + c2);
            int i3 = this.f151009s;
            this.f151012v = i3;
            int i4 = i3 - this.f151011u;
            this.f151016z = i4;
            this.f150992B = i4;
            this.f150993C = i4;
            this.f150994D = 80;
        } else if (i == 2) {
            this.f151008r = r3Var.mo8970c();
            int dimension2 = (int) getContext().getResources().getDimension(C0966R.dimen.f3736cp);
            this.f151014x = dimension2;
            this.f151015y = dimension2;
            this.f151013w = this.f151008r - (dimension2 + dimension2);
            int a2 = r3Var.mo8968a() - C75044y4.m89994f(this.f150998e);
            this.f151009s = a2;
            int i5 = (int) (((double) this.f151013w) * 1.6666666666666667d);
            this.f151012v = i5;
            if (i5 > a2) {
                this.f151012v = a2 - ((int) getContext().getResources().getDimension(C0966R.dimen.f3749d0));
            }
            int i6 = this.f151012v;
            int i7 = (this.f151009s - i6) - ((a - i6) / 2);
            this.f151016z = i7;
            if (i7 < 0) {
                this.f151016z = 0;
            }
            this.f150992B = (int) getContext().getResources().getDimension(C0966R.dimen.f3705bx);
            this.f150994D = 80;
        }
        if (i == 1) {
            View inflate2 = LayoutInflater.from(this.f150998e).inflate(C0966R.C0971layout.a9h, (ViewGroup) null);
            C87412m.m108592e(inflate2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            setMContentView((ExpandableScrollFrameLayout) inflate2);
            getMContentView().setScrollDownLimit((float) this.f150992B);
            getMContentView().setScrollUpLimit((float) this.f150993C);
            ScrollFrameLayout mContentView = getMContentView();
            C87412m.m108592e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((ExpandableScrollFrameLayout) mContentView).setPeekHeight(this.f151011u);
        } else if (i == 2) {
            View inflate3 = LayoutInflater.from(this.f150998e).inflate(C0966R.C0971layout.a8w, (ViewGroup) null);
            C87412m.m108592e(inflate3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout");
            setMContentView((CenterScrollFrameLayout) inflate3);
            getMContentView().setScrollDownLimit((float) this.f150992B);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f151012v);
        layoutParams.leftMargin = this.f151014x;
        layoutParams.rightMargin = this.f151015y;
        layoutParams.topMargin = this.f151016z;
        layoutParams.bottomMargin = this.f150991A;
        ViewGroup viewGroup2 = this.f150999f;
        if (viewGroup2 != null) {
            viewGroup2.addView(getMContentView(), layoutParams);
            setCanceledOnTouchOutside(true);
            return;
        }
        C87412m.m108603p("mRootView");
        throw null;
    }

    private final void setCanceledOnTouchOutside(boolean z) {
        if (z) {
            setOnClickListener(new C53811a(this));
        }
    }

    /* renamed from: a */
    public void mo74384a() {
        Log.m105924i("Finder.FinderScrollDialog", "animateDismiss");
        if (this.f151007q == 1) {
            ScrollFrameLayout mContentView = getMContentView();
            C87412m.m108592e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((ExpandableScrollFrameLayout) mContentView).mo64809m();
            return;
        }
        Log.m105924i("Finder.FinderScrollDialog", "tobe full_fill");
    }

    public void cancel() {
        ScrollFrameLayout mContentView = getMContentView();
        C87412m.m108592e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout");
        if (mContentView.f112059s) {
            Log.m105928w("Finder.FinderScrollDialog", "cancel return isAnimating.");
        }
    }

    public Context context() {
        return this.f150998e;
    }

    public void dismiss() {
        Window window;
        Log.m105924i("Finder.FinderScrollDialog", "dismiss");
        Context context = getContext();
        FrameLayout frameLayout = null;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        KeyEvent.Callback decorView = (mMActivity == null || (window = mMActivity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof FrameLayout) {
            frameLayout = (FrameLayout) decorView;
        }
        if (frameLayout != null) {
            frameLayout.removeView(this);
        }
        DialogInterface.OnDismissListener onDismissListener = this.f151006p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    public final int getBottomMargin() {
        return this.f150991A;
    }

    public final C53813j getCurScrollHeightListener() {
        return this.f150996F;
    }

    public final int getDialogHeight() {
        return this.f151009s;
    }

    public final int getDialogTopMargin() {
        return this.f151005o;
    }

    public final int getDialogWidth() {
        return this.f151008r;
    }

    public final DialogInterface.OnDismissListener getDismissListener() {
        return this.f151006p;
    }

    public final int getGravity() {
        return this.f150994D;
    }

    public final int getLeftMargin() {
        return this.f151014x;
    }

    public final RecyclerViewDrawerSquares.C45117c getListener() {
        return this.f150995E;
    }

    public final ScrollFrameLayout getMContentView() {
        ScrollFrameLayout scrollFrameLayout = this.f151000g;
        if (scrollFrameLayout != null) {
            return scrollFrameLayout;
        }
        C87412m.m108603p("mContentView");
        throw null;
    }

    public final int getNavigationBarHeight() {
        return this.f151003j;
    }

    public final int getPeekHeight() {
        return this.f151011u;
    }

    public final float getPeekRatio() {
        return this.f151010t;
    }

    public final int getRightMargin() {
        return this.f151015y;
    }

    public final C39444l getScConfig() {
        return this.f150997d;
    }

    public final int getScreenHeight() {
        return this.f151001h;
    }

    public final int getScreenWidth() {
        return this.f151002i;
    }

    public final int getScrollContainerHeight() {
        return this.f151012v;
    }

    public final int getScrollContainerWidth() {
        return this.f151013w;
    }

    public final int getScrollDownLimit() {
        return this.f150992B;
    }

    public final int getScrollUpLimit() {
        return this.f150993C;
    }

    public final int getStatusBarHeight() {
        return this.f151004n;
    }

    public final int getStyle() {
        return this.f151007q;
    }

    public final int getTopMargin() {
        return this.f151016z;
    }

    public final Window getWindow() {
        Context context = getContext();
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null) {
            return mMActivity.getWindow();
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundColor(getResources().getColor(C0966R.color.ahf));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f151009s);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = C75044y4.m89993e(getContext());
        ViewGroup viewGroup = this.f150999f;
        if (viewGroup != null) {
            addView(viewGroup, layoutParams);
        } else {
            C87412m.m108603p("mRootView");
            throw null;
        }
    }

    /* renamed from: p */
    public ScrollFrameLayout mo74382p() {
        return getMContentView();
    }

    public final void setBottomMargin(int i) {
        this.f150991A = i;
    }

    public final void setCurScrollHeightListener(C53813j jVar) {
        if (this.f151007q == 1) {
            ScrollFrameLayout mContentView = getMContentView();
            ExpandableScrollFrameLayout expandableScrollFrameLayout = mContentView instanceof ExpandableScrollFrameLayout ? (ExpandableScrollFrameLayout) mContentView : null;
            if (expandableScrollFrameLayout != null) {
                expandableScrollFrameLayout.setCurScrollHeightListener(jVar);
            }
        }
        this.f150996F = jVar;
    }

    public final void setDialogHeight(int i) {
        this.f151009s = i;
    }

    public final void setDialogWidth(int i) {
        this.f151008r = i;
    }

    public final void setDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f151006p = onDismissListener;
    }

    public final void setGravity(int i) {
        this.f150994D = i;
    }

    public final void setLeftMargin(int i) {
        this.f151014x = i;
    }

    public final void setListener(RecyclerViewDrawerSquares.C45117c cVar) {
        if (this.f151007q == 1) {
            ScrollFrameLayout mContentView = getMContentView();
            C87412m.m108592e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((ExpandableScrollFrameLayout) mContentView).setDrawerListener(cVar);
        }
        this.f150995E = cVar;
    }

    public final void setMContentView(ScrollFrameLayout scrollFrameLayout) {
        C87412m.m108594g(scrollFrameLayout, "<set-?>");
        this.f151000g = scrollFrameLayout;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f151006p = onDismissListener;
    }

    public final void setPeekHeight(int i) {
        this.f151011u = i;
    }

    public final void setPeekRatio(float f) {
        this.f151010t = f;
    }

    public final void setRightMargin(int i) {
        this.f151015y = i;
    }

    public final void setScrollContainerHeight(int i) {
        this.f151012v = i;
    }

    public final void setScrollContainerWidth(int i) {
        this.f151013w = i;
    }

    public final void setScrollDownLimit(int i) {
        this.f150992B = i;
    }

    public final void setScrollUpLimit(int i) {
        this.f150993C = i;
    }

    public final void setTopMargin(int i) {
        this.f151016z = i;
    }
}
