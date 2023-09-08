package com.tencent.p014mm.view.drawer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.widget.InsectFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import dq3.C58420a;
import dq3.C58423b;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<B#\b\u0016\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010=\u001a\u00020\u0017¢\u0006\u0004\b;\u0010>J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R*\u0010+\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR.\u00103\u001a\u0004\u0018\u00010,2\b\u0010\u0018\u001a\u0004\u0018\u00010,8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00105\u001a\u00020\u00108\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016¨\u0006?"}, mo182094d2 = {"Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/ui/widget/InsectFrameLayout;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "recyclerView", "Lrx3/b0;", "setRecyclerView", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "getCenterLayout", "layout", "setCenterLayout", "Landroid/widget/FrameLayout;", "getFooterLayout", "getHeaderLayout", "getLoadingLayout", "", "i", "Z", "isEnableClickBackgroundToCloseDrawer", "()Z", "setEnableClickBackgroundToCloseDrawer", "(Z)V", "", "value", "j", "I", "getTopOffset", "()I", "setTopOffset", "(I)V", "topOffset", "n", "getBackgroundColorRes", "setBackgroundColorRes", "backgroundColorRes", "o", "getChangeBackgroundAlpha", "setChangeBackgroundAlpha", "changeBackgroundAlpha", "p", "getSquaresBackgroundResource", "setSquaresBackgroundResource", "squaresBackgroundResource", "Lcom/tencent/mm/ui/tools/t0;", "q", "Lcom/tencent/mm/ui/tools/t0;", "getKeyboardHeightObserver", "()Lcom/tencent/mm/ui/tools/t0;", "setKeyboardHeightObserver", "(Lcom/tencent/mm/ui/tools/t0;)V", "keyboardHeightObserver", "u", "isIntercept", "setIntercept", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.drawer.RecyclerViewDrawer */
public class RecyclerViewDrawer extends InsectFrameLayout implements RecyclerViewDrawerSquares.C45117c {

    /* renamed from: y */
    public static final /* synthetic */ int f165670y = 0;

    /* renamed from: h */
    public final RecyclerViewDrawerSquares f165671h;

    /* renamed from: i */
    public boolean f165672i = true;

    /* renamed from: j */
    public int f165673j = ((int) getResources().getDimension(C0966R.dimen.f3732cl));

    /* renamed from: n */
    public int f165674n = C0966R.color.UN_BW_0_Alpha_0_5;

    /* renamed from: o */
    public boolean f165675o = true;

    /* renamed from: p */
    public int f165676p = C0966R.color.al6;

    /* renamed from: q */
    public C7020t0 f165677q;

    /* renamed from: r */
    public final int f165678r = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: s */
    public CopyOnWriteArrayList<RecyclerViewDrawerSquares.C45117c> f165679s = new CopyOnWriteArrayList<>();

    /* renamed from: t */
    public final Rect f165680t;

    /* renamed from: u */
    public boolean f165681u;

    /* renamed from: v */
    public float f165682v;

    /* renamed from: w */
    public float f165683w;

    /* renamed from: x */
    public boolean f165684x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerViewDrawer(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        RecyclerViewDrawerSquares recyclerViewDrawerSquares = new RecyclerViewDrawerSquares(getContext());
        this.f165671h = recyclerViewDrawerSquares;
        setBackgroundResource(this.f165674n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setPadding(0, this.f165673j, 0, 0);
        recyclerViewDrawerSquares.setBackgroundResource(this.f165676p);
        addView(recyclerViewDrawerSquares, layoutParams);
        setVisibility(8);
        recyclerViewDrawerSquares.setOnOpenDrawerListener(this);
        this.f165680t = new Rect();
    }

    /* renamed from: b */
    public final void mo82527b(RecyclerViewDrawerSquares.C45117c cVar) {
        C87412m.m108594g(cVar, "onOpenDrawerListener");
        this.f165679s.add(cVar);
    }

    /* renamed from: c */
    public final void mo82528c(View view) {
        C87412m.m108594g(view, "view");
        if (!this.f165671h.getIgnoreInterceptViewList().contains(view)) {
            this.f165671h.getIgnoreInterceptViewList().add(view);
        }
    }

    /* renamed from: d */
    public final void mo82529d(boolean z) {
        this.f165671h.setCanCloseDrawerWhenStop(z);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f165680t.setEmpty();
            this.f165671h.getDrawerHeaderLayout().getGlobalVisibleRect(this.f165680t);
            boolean contains = this.f165680t.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.f165681u = contains;
            if (contains) {
                Rect rect = new Rect();
                for (View globalVisibleRect : this.f165671h.getIgnoreInterceptViewList()) {
                    globalVisibleRect.getGlobalVisibleRect(rect);
                    boolean z = !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                    this.f165681u = z;
                    if (!z) {
                        break;
                    }
                }
            }
            float y = motionEvent.getY();
            this.f165682v = y;
            this.f165683w = y;
            if (!this.f165681u && this.f165672i) {
                this.f165671h.getGlobalVisibleRect(this.f165680t);
                if (!this.f165680t.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.f165684x = true;
                }
            }
        }
        if (this.f165681u) {
            this.f165671h.mo3719v(0, (int) (this.f165682v - motionEvent.getY()), 0, true, true);
            this.f165682v = motionEvent.getY();
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            if (this.f165681u) {
                this.f165671h.mo3720x(1);
            }
            this.f165681u = false;
            if (this.f165684x && this.f165672i && motionEvent.getAction() == 1 && Math.abs(this.f165683w - motionEvent.getY()) <= ((float) this.f165678r)) {
                RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f165671h;
                int i = RecyclerViewDrawerSquares.f165685u;
                recyclerViewDrawerSquares.mo82553a(true);
            }
            this.f165684x = false;
        }
        return this.f165681u || this.f165684x || super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public void mo9497e(float f) {
        Drawable background;
        if (this.f165675o && (background = getBackground()) != null) {
            background.setAlpha((int) (((float) 255) * (((float) 1) - f)));
        }
        for (RecyclerViewDrawerSquares.C45117c e : this.f165679s) {
            e.mo9497e(f);
        }
    }

    /* renamed from: f */
    public void mo9498f() {
        for (RecyclerViewDrawerSquares.C45117c f : this.f165679s) {
            f.mo9498f();
        }
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        if (z2 && z) {
            setVisibility(0);
        } else if (!z2 && !z) {
            setVisibility(4);
            getCenterLayout().mo82447P();
        }
        for (RecyclerViewDrawerSquares.C45117c g : this.f165679s) {
            g.mo3766g(z, z2, i);
        }
    }

    public final int getBackgroundColorRes() {
        return this.f165674n;
    }

    public final RefreshLoadMoreLayout getCenterLayout() {
        return this.f165671h.getCenterLayout();
    }

    public final boolean getChangeBackgroundAlpha() {
        return this.f165675o;
    }

    public final FrameLayout getFooterLayout() {
        return this.f165671h.getDrawerFooterLayout();
    }

    public final FrameLayout getHeaderLayout() {
        return this.f165671h.getDrawerHeaderLayout();
    }

    public final C7020t0 getKeyboardHeightObserver() {
        return this.f165677q;
    }

    public final FrameLayout getLoadingLayout() {
        return this.f165671h.getLoadingLayout();
    }

    public final RecyclerView getRecyclerView() {
        return this.f165671h.getCenterLayout().getRecyclerView();
    }

    public final int getSquaresBackgroundResource() {
        return this.f165676p;
    }

    public final int getTopOffset() {
        return this.f165673j;
    }

    /* renamed from: h */
    public void mo82540h(boolean z) {
        this.f165671h.mo82553a(z);
    }

    /* renamed from: i */
    public final boolean mo82541i() {
        return getVisibility() == 0;
    }

    /* renamed from: j */
    public void mo82542j(boolean z, boolean z2, int i) {
        RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f165671h;
        recyclerViewDrawerSquares.getClass();
        Log.m105924i("DrawerSquares", "[openDrawer] isOpening=" + recyclerViewDrawerSquares.f165693n + ", canCloseDrawerWhenStop=" + z2);
        if (!recyclerViewDrawerSquares.f165693n) {
            recyclerViewDrawerSquares.setCanCloseDrawerWhenStop(z2);
            recyclerViewDrawerSquares.f165694o.mo104022e();
            RecyclerViewDrawerSquares.C45117c cVar = recyclerViewDrawerSquares.f165695p;
            if (cVar != null) {
                cVar.mo3766g(true, true, i);
            }
            recyclerViewDrawerSquares.f165693n = true;
            if (!z) {
                recyclerViewDrawerSquares.setTranslationY(0.0f);
                recyclerViewDrawerSquares.f165693n = false;
                RecyclerViewDrawerSquares.C45117c cVar2 = recyclerViewDrawerSquares.f165695p;
                if (cVar2 != null) {
                    cVar2.mo3766g(true, false, i);
                }
            } else if (((float) recyclerViewDrawerSquares.getHeight()) <= 0.0f) {
                recyclerViewDrawerSquares.f165696q = new C58420a(recyclerViewDrawerSquares, i);
            } else {
                recyclerViewDrawerSquares.setTranslationY((float) recyclerViewDrawerSquares.getHeight());
                ((RecyclerViewDrawerSquares.C57906h) recyclerViewDrawerSquares.f165697r).invoke(new C58423b(recyclerViewDrawerSquares));
            }
            recyclerViewDrawerSquares.setVisibility(0);
        }
    }

    /* renamed from: k */
    public final void mo82543k(RecyclerViewDrawerSquares.C45117c cVar) {
        C87412m.m108594g(cVar, "onOpenDrawerListener");
        this.f165679s.remove(cVar);
    }

    public final void setBackgroundColorRes(int i) {
        this.f165674n = i;
        setBackgroundResource(i);
    }

    public final void setCenterLayout(RefreshLoadMoreLayout refreshLoadMoreLayout) {
        C87412m.m108594g(refreshLoadMoreLayout, "layout");
        this.f165671h.setCenterLayout(refreshLoadMoreLayout);
    }

    public final void setChangeBackgroundAlpha(boolean z) {
        this.f165675o = z;
    }

    public final void setEnableClickBackgroundToCloseDrawer(boolean z) {
        this.f165672i = z;
    }

    public final void setIntercept(boolean z) {
        this.f165681u = z;
    }

    public final void setKeyboardHeightObserver(C7020t0 t0Var) {
        this.f165677q = t0Var;
        this.f165671h.setKeyboardHeightObserver(t0Var);
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f165671h.getCenterLayout().setRecyclerView(recyclerView);
    }

    public final void setSquaresBackgroundResource(int i) {
        this.f165676p = i;
        this.f165671h.setBackgroundResource(i);
    }

    public final void setTopOffset(int i) {
        this.f165673j = i;
        setPadding(0, i, 0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerViewDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        RecyclerViewDrawerSquares recyclerViewDrawerSquares = new RecyclerViewDrawerSquares(getContext());
        this.f165671h = recyclerViewDrawerSquares;
        setBackgroundResource(this.f165674n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setPadding(0, this.f165673j, 0, 0);
        recyclerViewDrawerSquares.setBackgroundResource(this.f165676p);
        addView(recyclerViewDrawerSquares, layoutParams);
        setVisibility(8);
        recyclerViewDrawerSquares.setOnOpenDrawerListener(this);
        this.f165680t = new Rect();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerViewDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        RecyclerViewDrawerSquares recyclerViewDrawerSquares = new RecyclerViewDrawerSquares(getContext());
        this.f165671h = recyclerViewDrawerSquares;
        setBackgroundResource(this.f165674n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        setPadding(0, this.f165673j, 0, 0);
        recyclerViewDrawerSquares.setBackgroundResource(this.f165676p);
        addView(recyclerViewDrawerSquares, layoutParams);
        setVisibility(8);
        recyclerViewDrawerSquares.setOnOpenDrawerListener(this);
        this.f165680t = new Rect();
    }
}
