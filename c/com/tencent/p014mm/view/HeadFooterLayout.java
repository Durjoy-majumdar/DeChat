package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import p282z2.C16095a;
import p849e3.C107201m;
import rx3.C13598b0;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001OB\u001d\b\u0016\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LB%\b\u0016\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\b\u0010J\u001a\u0004\u0018\u00010I\u0012\u0006\u0010M\u001a\u00020\u001e¢\u0006\u0004\bK\u0010NJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010/\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\"\u00106\u001a\u00020\u001e8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020\u001e8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010B\u001a\u00020;8\u0016@\u0016X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00105¨\u0006P"}, mo182094d2 = {"Lcom/tencent/mm/view/HeadFooterLayout;", "Landroid/widget/LinearLayout;", "Le3/m;", "", "", "translationY", "Lrx3/b0;", "setTranslationY", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "d", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "getOverCallback", "()Lcom/tencent/mm/view/HeadFooterLayout$a;", "setOverCallback", "(Lcom/tencent/mm/view/HeadFooterLayout$a;)V", "overCallback", "", "e", "Z", "isConsumeOverScroll", "()Z", "setConsumeOverScroll", "(Z)V", "f", "isEnableNestedScroll", "setEnableNestedScroll", "g", "isSuperNestedScroll", "setSuperNestedScroll", "Lkotlin/Function2;", "", "h", "Lfy3/p;", "getOnTranslateYCallback", "()Lfy3/p;", "setOnTranslateYCallback", "(Lfy3/p;)V", "onTranslateYCallback", "Ljava/util/LinkedList;", "Landroid/view/View;", "j", "Ljava/util/LinkedList;", "getHeaderViews", "()Ljava/util/LinkedList;", "headerViews", "n", "getFooterViews", "footerViews", "o", "I", "getHeadersHeight", "()I", "setHeadersHeight", "(I)V", "headersHeight", "p", "getFootersHeight", "setFootersHeight", "footersHeight", "Landroidx/recyclerview/widget/RecyclerView;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView", "s", "getExtraOverScrollFooterDx", "setExtraOverScrollFooterDx", "extraOverScrollFooterDx", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.HeadFooterLayout */
public class HeadFooterLayout extends LinearLayout implements C107201m, C111847h {

    /* renamed from: t */
    public static final /* synthetic */ int f165569t = 0;

    /* renamed from: d */
    public C57874a f165570d;

    /* renamed from: e */
    public boolean f165571e;

    /* renamed from: f */
    public boolean f165572f = true;

    /* renamed from: g */
    public boolean f165573g;

    /* renamed from: h */
    public C32227p<? super Integer, ? super Integer, C13598b0> f165574h;

    /* renamed from: i */
    public final Rect f165575i = new Rect();

    /* renamed from: j */
    public final LinkedList<View> f165576j = new LinkedList<>();

    /* renamed from: n */
    public final LinkedList<View> f165577n = new LinkedList<>();

    /* renamed from: o */
    public int f165578o;

    /* renamed from: p */
    public int f165579p;

    /* renamed from: q */
    public boolean f165580q;

    /* renamed from: r */
    public RecyclerView f165581r;

    /* renamed from: s */
    public int f165582s;

    /* renamed from: com.tencent.mm.view.HeadFooterLayout$a */
    public interface C57874a {
        /* renamed from: p */
        boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2);

        /* renamed from: v */
        boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2);

        /* renamed from: x */
        void mo3720x(int i);
    }

    public HeadFooterLayout(Context context) {
        super(context);
    }

    /* renamed from: l */
    public static /* synthetic */ void m66871l(HeadFooterLayout headFooterLayout, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            headFooterLayout.mo82404k(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: print");
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        return this.f165573g ? super.startNestedScroll(i) : this.f165572f;
    }

    /* renamed from: a */
    public final void mo82390a(View view, boolean z) {
        C87412m.m108594g(view, "view");
        getFooterViews().add(view);
        this.f165580q = z;
        requestLayout();
        mo82404k("[addFooter] view=" + view + " isDirty=" + z + " hash=" + hashCode(), false);
    }

    /* renamed from: b */
    public final void mo82391b(View view, boolean z) {
        C87412m.m108594g(view, "view");
        getHeaderViews().add(view);
        this.f165580q = z;
        requestLayout();
    }

    /* renamed from: c */
    public final View mo82392c(int i) {
        T t;
        boolean z;
        Iterator<T> it = getFooterViews().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i == ((View) t).getId()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (View) t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r8 = r8.findViewByPosition(0);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82393d(androidx.recyclerview.widget.RecyclerView r8) {
        /*
            r7 = this;
            java.lang.String r0 = "target"
            gy3.C87412m.m108594g(r8, r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r8.getLayoutManager()
            boolean r0 = r8 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0035
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r8
            r0 = 0
            int[] r0 = r8.mo17394A(r0)
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L_0x001a:
            if (r4 >= r3) goto L_0x0024
            r6 = r0[r4]
            if (r6 != 0) goto L_0x0021
            r5 = 1
        L_0x0021:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0024:
            if (r5 == 0) goto L_0x004a
            android.view.View r8 = r8.findViewByPosition(r2)
            if (r8 == 0) goto L_0x004a
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            return r1
        L_0x0035:
            boolean r0 = r8 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x004a
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
            android.view.View r8 = r8.findViewByPosition(r2)
            if (r8 == 0) goto L_0x004a
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            return r1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.HeadFooterLayout.mo82393d(androidx.recyclerview.widget.RecyclerView):boolean");
    }

    /* renamed from: e */
    public void mo82394e(View view, int i, int i2, int[] iArr, int i3) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
    }

    /* renamed from: f */
    public void mo77109f(RecyclerView recyclerView, HeadFooterLayout headFooterLayout, int i, int i2, boolean z, boolean z2, int[] iArr, int i3, boolean z3) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(headFooterLayout, "parent");
        C87412m.m108594g(iArr, "consumed");
        int b = (!z || !z3) ? z ? C16095a.m14980b(((int) getTranslationY()) - i2, ((-getHeadersHeight()) - getFootersHeight()) - this.f165582s, -getHeadersHeight()) : C16095a.m14980b(((int) getTranslationY()) - i2, -getHeadersHeight(), 0) : C16095a.m14980b(((int) getTranslationY()) - i2, ((-getHeadersHeight()) - getFootersHeight()) - this.f165582s, 0);
        if (!(getTranslationY() == (-((float) getHeadersHeight())))) {
            iArr[1] = i;
        }
        float f = (float) b;
        if (!(getTranslationY() == f)) {
            setTranslationY(f);
            iArr[1] = i;
        }
        headFooterLayout.requestDisallowInterceptTouchEvent(true);
        m66871l(this, "onOverScroll dy:" + i + " dampingDy:" + i2 + " isEnd:" + z + " consumed[1]:" + iArr + "[1] translationY:" + getTranslationY() + " targetY:" + b + " headersHeight:" + getHeadersHeight() + " footersHeight:" + getFootersHeight(), false, 2, (Object) null);
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "p0");
        C87412m.m108594g(view2, "p1");
    }

    public final int getExtraOverScrollFooterDx() {
        return this.f165582s;
    }

    public LinkedList<View> getFooterViews() {
        return this.f165577n;
    }

    public int getFootersHeight() {
        return this.f165579p;
    }

    public LinkedList<View> getHeaderViews() {
        return this.f165576j;
    }

    public int getHeadersHeight() {
        return this.f165578o;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnTranslateYCallback() {
        return this.f165574h;
    }

    public final C57874a getOverCallback() {
        return this.f165570d;
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f165581r;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: h */
    public void mo77110h(RecyclerView recyclerView, HeadFooterLayout headFooterLayout, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(headFooterLayout, "parent");
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        C57874a aVar = this.f165570d;
        if (aVar != null) {
            aVar.mo3720x(i);
        }
        this.f165571e = false;
        boolean z = view instanceof RecyclerView;
        if (z && (((RecyclerView) view).getLayoutManager() instanceof LinearLayoutManager) && C87412m.m108589b(view, getRecyclerView())) {
            mo77110h(getRecyclerView(), this, i);
        } else if (z && (((RecyclerView) view).getLayoutManager() instanceof StaggeredGridLayoutManager) && C87412m.m108589b(view, getRecyclerView())) {
            mo77110h(getRecyclerView(), this, i);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return true;
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "target");
        super.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: k */
    public final void mo82404k(String str, boolean z) {
        C87412m.m108594g(str, "log");
        if (!z) {
            Log.m105924i("HeadFooterLayout", str);
        }
    }

    /* renamed from: m */
    public final void mo82405m(View view, boolean z) {
        C87412m.m108594g(view, "view");
        if (getFooterViews().remove(view)) {
            this.f165580q = z;
            removeView(view);
            requestLayout();
            mo82404k("[removeFooter] view=" + view + " isDirty=" + z + " hash=" + hashCode(), false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        if (r10.f165575i.bottom <= r3.getHeight()) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0155, code lost:
        if (r2 != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (r2 != false) goto L_0x017b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a1  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77719n(android.view.View r19, int r20, int r21, int[] r22, int r23) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            r12 = r22
            java.lang.String r0 = "target"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r1 = "consumed"
            gy3.C87412m.m108594g(r12, r1)
            super.onNestedPreScroll(r19, r20, r21, r22)
            r1 = 1
            r2 = r12[r1]
            int r13 = r21 - r2
            boolean r2 = r11 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x019e
            androidx.recyclerview.widget.RecyclerView r2 = r18.getRecyclerView()
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
            if (r2 == 0) goto L_0x019e
            r2 = r11
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.getLayoutManager()
            boolean r3 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0049
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.getLayoutManager()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r3 = r3.mo16967N()
            if (r3 != r1) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            r14 = r3
            r15 = 1
            goto L_0x0067
        L_0x0049:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.getLayoutManager()
            boolean r3 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r3 == 0) goto L_0x0065
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r2.getLayoutManager()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager"
            gy3.C87412m.m108592e(r3, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            int r3 = r3.f44894h
            if (r3 != r1) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            r14 = r3
            goto L_0x0066
        L_0x0065:
            r14 = 0
        L_0x0066:
            r15 = 0
        L_0x0067:
            androidx.recyclerview.widget.RecyclerView r3 = r18.getRecyclerView()
            gy3.C87412m.m108594g(r3, r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r3.getLayoutManager()
            boolean r4 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r4 == 0) goto L_0x00b4
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r4 = 0
            int[] r4 = r0.mo17395B(r4)
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x0080:
            if (r6 >= r5) goto L_0x0090
            r8 = r4[r6]
            int r16 = r0.getItemCount()
            int r9 = r16 + -1
            if (r8 != r9) goto L_0x008d
            r7 = 1
        L_0x008d:
            int r6 = r6 + 1
            goto L_0x0080
        L_0x0090:
            if (r7 == 0) goto L_0x00eb
            int r5 = r4.length
            r6 = 0
        L_0x0094:
            if (r6 >= r5) goto L_0x00e9
            r7 = r4[r6]
            r8 = -1
            if (r7 == r8) goto L_0x00b1
            android.view.View r7 = r0.findViewByPosition(r7)
            if (r7 == 0) goto L_0x00b1
            android.graphics.Rect r8 = r10.f165575i
            androidx.recyclerview.widget.RecyclerView.m15804R0(r7, r8)
            android.graphics.Rect r7 = r10.f165575i
            int r7 = r7.bottom
            int r8 = r3.getHeight()
            if (r7 <= r8) goto L_0x00b1
            goto L_0x00eb
        L_0x00b1:
            int r6 = r6 + 1
            goto L_0x0094
        L_0x00b4:
            boolean r4 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x00eb
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r4 = r0.mo16959E()
            int r5 = r0.getItemCount()
            int r5 = r5 - r1
            if (r4 != r5) goto L_0x00eb
            android.view.View r0 = r0.findViewByPosition(r4)
            if (r0 == 0) goto L_0x00eb
            android.graphics.Rect r4 = r10.f165575i
            androidx.recyclerview.widget.RecyclerView.m15804R0(r0, r4)
            android.graphics.Rect r4 = r10.f165575i
            int r4 = r4.bottom
            int r5 = r3.getHeight()
            if (r4 > r5) goto L_0x00eb
            android.graphics.Rect r4 = r10.f165575i
            r0.getHitRect(r4)
            android.graphics.Rect r0 = r10.f165575i
            int r0 = r0.bottom
            int r3 = r3.getHeight()
            if (r0 > r3) goto L_0x00eb
        L_0x00e9:
            r0 = 1
            goto L_0x00ec
        L_0x00eb:
            r0 = 0
        L_0x00ec:
            if (r0 == 0) goto L_0x00fd
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.getLayoutManager()
            gy3.C87412m.m108591d(r0)
            int r0 = r0.getItemCount()
            if (r0 == 0) goto L_0x00fd
            r9 = 1
            goto L_0x00fe
        L_0x00fd:
            r9 = 0
        L_0x00fe:
            androidx.recyclerview.widget.RecyclerView r0 = r18.getRecyclerView()
            boolean r16 = r10.mo82393d(r0)
            if (r9 != 0) goto L_0x012b
            if (r16 == 0) goto L_0x010b
            goto L_0x012b
        L_0x010b:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r2.getLayoutManager()
            gy3.C87412m.m108591d(r0)
            int r0 = r0.getItemCount()
            if (r0 > 0) goto L_0x019e
            com.tencent.mm.view.HeadFooterLayout$a r3 = r10.f165570d
            if (r3 == 0) goto L_0x0127
            boolean r7 = r10.f165571e
            r4 = r20
            r5 = r13
            r6 = r23
            r8 = r14
            r3.mo3719v(r4, r5, r6, r7, r8)
        L_0x0127:
            r10.f165571e = r1
            goto L_0x019e
        L_0x012b:
            com.tencent.mm.view.HeadFooterLayout$a r0 = r10.f165570d
            if (r0 != 0) goto L_0x0131
            r0 = 1
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r9 == 0) goto L_0x0158
            float r2 = r18.getTranslationY()
            int r2 = (int) r2
            int r3 = r18.getHeadersHeight()
            int r3 = -r3
            if (r2 != r3) goto L_0x0157
            com.tencent.mm.view.HeadFooterLayout$a r3 = r10.f165570d
            if (r3 == 0) goto L_0x0154
            boolean r7 = r10.f165571e
            r4 = r20
            r5 = r13
            r6 = r23
            r8 = r14
            boolean r2 = r3.mo3718p(r4, r5, r6, r7, r8)
            if (r2 != r1) goto L_0x0154
            r2 = 1
            goto L_0x0155
        L_0x0154:
            r2 = 0
        L_0x0155:
            if (r2 != 0) goto L_0x0158
        L_0x0157:
            r0 = 1
        L_0x0158:
            if (r16 == 0) goto L_0x017b
            float r2 = r18.getTranslationY()
            int r2 = (int) r2
            if (r2 != 0) goto L_0x0178
            com.tencent.mm.view.HeadFooterLayout$a r3 = r10.f165570d
            if (r3 == 0) goto L_0x0175
            boolean r7 = r10.f165571e
            r4 = r20
            r5 = r13
            r6 = r23
            r8 = r14
            boolean r2 = r3.mo3719v(r4, r5, r6, r7, r8)
            if (r2 != r1) goto L_0x0175
            r2 = 1
            goto L_0x0176
        L_0x0175:
            r2 = 0
        L_0x0176:
            if (r2 != 0) goto L_0x017b
        L_0x0178:
            r17 = 1
            goto L_0x017d
        L_0x017b:
            r17 = r0
        L_0x017d:
            if (r17 == 0) goto L_0x0195
            androidx.recyclerview.widget.RecyclerView r1 = r18.getRecyclerView()
            r0 = r18
            r2 = r18
            r3 = r13
            r4 = r13
            r5 = r9
            r6 = r14
            r7 = r22
            r8 = r23
            r9 = r16
            r0.mo77109f(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x019b
        L_0x0195:
            if (r15 == 0) goto L_0x0199
            r12[r1] = r13
        L_0x0199:
            r10.f165571e = r1
        L_0x019b:
            r9 = r17
            goto L_0x019f
        L_0x019e:
            r9 = 0
        L_0x019f:
            if (r9 != 0) goto L_0x01af
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r13
            r4 = r22
            r5 = r23
            r0.mo82394e(r1, r2, r3, r4, r5)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.HeadFooterLayout.mo77719n(android.view.View, int, int, int[], int):void");
    }

    /* renamed from: o */
    public void mo82406o() {
        removeAllViews();
        Iterator<View> it = getHeaderViews().iterator();
        while (it.hasNext()) {
            addView(it.next());
        }
        addView(getRecyclerView(), getRecyclerView().getLayoutParams());
        Iterator<View> it4 = getFooterViews().iterator();
        while (it4.hasNext()) {
            addView(it4.next());
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo82406o();
    }

    public void onMeasure(int i, int i2) {
        setFootersHeight(0);
        setHeadersHeight(0);
        if (getRecyclerView().getVisibility() == 0) {
            getRecyclerView().measure(i, i2);
        }
        int measuredHeight = getRecyclerView().getMeasuredHeight();
        if (getRecyclerView().getVisibility() == 8) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!C87412m.m108589b(childAt, getRecyclerView()) && !getHeaderViews().contains(childAt) && !getFooterViews().contains(childAt)) {
                    childAt.measure(i, i2);
                    i3 += View.MeasureSpec.getSize(i2);
                }
            }
            measuredHeight = i3;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        for (View view : getHeaderViews()) {
            view.measure(i, makeMeasureSpec);
            measuredHeight += view.getMeasuredHeight();
            setHeadersHeight(getHeadersHeight() + view.getMeasuredHeight());
        }
        for (View view2 : getFooterViews()) {
            view2.measure(i, makeMeasureSpec);
            measuredHeight += view2.getMeasuredHeight();
            setFootersHeight(getFootersHeight() + view2.getMeasuredHeight());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), measuredHeight);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof RecyclerView) {
            setRecyclerView((RecyclerView) view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        if (this.f165580q) {
            this.f165580q = false;
            mo82406o();
        }
    }

    public final void setConsumeOverScroll(boolean z) {
        this.f165571e = z;
    }

    public final void setEnableNestedScroll(boolean z) {
        this.f165572f = z;
    }

    public final void setExtraOverScrollFooterDx(int i) {
        this.f165582s = i;
    }

    public void setFootersHeight(int i) {
        this.f165579p = i;
    }

    public void setHeadersHeight(int i) {
        this.f165578o = i;
    }

    public final void setOnTranslateYCallback(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f165574h = pVar;
    }

    public final void setOverCallback(C57874a aVar) {
        this.f165570d = aVar;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "<set-?>");
        this.f165581r = recyclerView;
    }

    public final void setSuperNestedScroll(boolean z) {
        this.f165573g = z;
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f165574h;
        if (pVar != null) {
            pVar.invoke(0, Integer.valueOf((int) f));
        }
    }

    public HeadFooterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeadFooterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
