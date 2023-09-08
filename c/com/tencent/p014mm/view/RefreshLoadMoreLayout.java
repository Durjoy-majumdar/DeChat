package com.tencent.p014mm.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import t40.C77853a;
import zp3.C16383g0;
import zp3.C16389w;
import zp3.C66955f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0004|}~B\u001b\b\u0016\u0012\b\u0010u\u001a\u0004\u0018\u00010t\u0012\u0006\u0010w\u001a\u00020v¢\u0006\u0004\bx\u0010yB#\b\u0016\u0012\b\u0010u\u001a\u0004\u0018\u00010t\u0012\u0006\u0010w\u001a\u00020v\u0012\u0006\u0010z\u001a\u00020\r¢\u0006\u0004\bx\u0010{J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010$\u001a\u00020!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\"\u00104\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00106\u001a\u00020!2\u0006\u00105\u001a\u00020!8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\"\u00109\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010F\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0017\u001a\u0004\bH\u0010\u0019\"\u0004\bI\u0010\u001bR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010#\u001a\u0004\bT\u0010%\"\u0004\bU\u0010'R\"\u0010Z\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010#\u001a\u0004\bX\u0010%\"\u0004\bY\u0010'R\"\u0010^\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010#\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010'R*\u0010b\u001a\u00020!2\u0006\u00105\u001a\u00020!8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b_\u0010#\u001a\u0004\b`\u0010%\"\u0004\ba\u0010'R*\u0010f\u001a\u00020!2\u0006\u00105\u001a\u00020!8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bc\u0010#\u001a\u0004\bd\u0010%\"\u0004\be\u0010'R$\u0010j\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0010\u001a\u0004\bh\u0010\u0012\"\u0004\bi\u0010\u0014R$\u0010l\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010r\u001a\u00020!8\u0006XD¢\u0006\f\n\u0004\br\u0010#\u001a\u0004\bs\u0010%¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "Lcom/tencent/mm/view/HeadFooterLayout;", "Lzp3/w;", "", "translationY", "Lrx3/b0;", "setTranslationY", "Landroid/view/View;", "footer", "setLoadMoreFooter", "getLoadMoreFooter", "header", "setRefreshHeaderView", "", "getRefreshHeaderHeight", "w", "Landroid/view/View;", "getRefreshHeader", "()Landroid/view/View;", "setRefreshHeader", "(Landroid/view/View;)V", "refreshHeader", "y", "I", "getLimitTopRequest", "()I", "setLimitTopRequest", "(I)V", "limitTopRequest", "z", "getLimitBottomRequest", "setLimitBottomRequest", "limitBottomRequest", "", "D", "Z", "isRefreshing", "()Z", "setRefreshing", "(Z)V", "F", "isLoadingMore", "setLoadingMore", "G", "getRefreshTargetY", "setRefreshTargetY", "refreshTargetY", "H", "getDamping", "()F", "setDamping", "(F)V", "damping", "value", "isHasBottomMore", "setHasBottomMore", "J", "isHasTopMore", "setHasTopMore", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "L", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "getActionCallback", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "setActionCallback", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;)V", "actionCallback", "M", "getReportCallback", "setReportCallback", "reportCallback", "R", "getParentTranslation", "setParentTranslation", "parentTranslation", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$StickTopLoadingLayout;", "S", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$StickTopLoadingLayout;", "getStickTopLoadingLayout", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout$StickTopLoadingLayout;", "setStickTopLoadingLayout", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$StickTopLoadingLayout;)V", "stickTopLoadingLayout", "U", "getEnablePullDownHeader", "setEnablePullDownHeader", "enablePullDownHeader", "V", "getCanRefresh", "setCanRefresh", "canRefresh", "W", "getCanLoadMore", "setCanLoadMore", "canLoadMore", "p0", "getEnableRefresh", "setEnableRefresh", "enableRefresh", "x0", "getEnableLoadMore", "setEnableLoadMore", "enableLoadMore", "y0", "getEmptyView", "setEmptyView", "emptyView", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$b;", "test", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$b;", "getTest", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout$b;", "setTest", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$b;)V", "DEBUG", "getDEBUG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "a", "c", "StickTopLoadingLayout", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout */
public class RefreshLoadMoreLayout extends HeadFooterLayout implements C16389w {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f165599Q0 = 0;

    /* renamed from: A */
    public int f165600A;

    /* renamed from: B */
    public int f165601B;

    /* renamed from: C */
    public boolean f165602C;

    /* renamed from: D */
    public boolean f165603D;

    /* renamed from: E */
    public final MMHandler f165604E = new MMHandler(Looper.getMainLooper());

    /* renamed from: F */
    public boolean f165605F;

    /* renamed from: G */
    public int f165606G = -1;

    /* renamed from: H */
    public float f165607H;

    /* renamed from: I */
    public boolean f165608I = true;

    /* renamed from: J */
    public boolean f165609J = true;

    /* renamed from: K */
    public Runnable f165610K;

    /* renamed from: L */
    public C57879a f165611L;

    /* renamed from: M */
    public C57879a f165612M;

    /* renamed from: N */
    public boolean f165613N = true;

    /* renamed from: P */
    public boolean f165614P = true;

    /* renamed from: Q */
    public boolean f165615Q;

    /* renamed from: R */
    public int f165616R;

    /* renamed from: S */
    public StickTopLoadingLayout f165617S;

    /* renamed from: T */
    public boolean f165618T;

    /* renamed from: U */
    public boolean f165619U;

    /* renamed from: V */
    public boolean f165620V = true;

    /* renamed from: W */
    public boolean f165621W = true;

    /* renamed from: p0 */
    public boolean f165622p0 = true;

    /* renamed from: u */
    public boolean f165623u;

    /* renamed from: v */
    public boolean f165624v;

    /* renamed from: w */
    public View f165625w;

    /* renamed from: x */
    public View f165626x;

    /* renamed from: x0 */
    public boolean f165627x0 = true;

    /* renamed from: y */
    public int f165628y = -1;

    /* renamed from: y0 */
    public View f165629y0;

    /* renamed from: z */
    public int f165630z = -1;

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$c */
    public static final class C7080c<E> {

        /* renamed from: a */
        public final int f24946a;

        /* renamed from: b */
        public int f24947b;

        /* renamed from: c */
        public CharSequence f24948c = "";

        /* renamed from: d */
        public E f24949d;

        /* renamed from: e */
        public E f24950e;

        /* renamed from: f */
        public boolean f24951f = true;

        /* renamed from: g */
        public boolean f24952g = true;

        /* renamed from: h */
        public int f24953h;

        /* renamed from: i */
        public boolean f24954i;

        /* renamed from: j */
        public boolean f24955j;

        /* renamed from: k */
        public boolean f24956k;

        /* renamed from: l */
        public int f24957l;

        public C7080c(int i) {
            this.f24946a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7080c) && this.f24946a == ((C7080c) obj).f24946a;
        }

        public int hashCode() {
            return this.f24946a;
        }

        public String toString() {
            return "(actionType=" + this.f24946a + ", reasonType=" + this.f24947b + ", extra=" + this.f24949d + ", hasAnyMore=" + this.f24951f + ", isAnim=" + this.f24952g + ", remainSize=" + this.f24953h + " isFooterVisible=" + this.f24954i + ')';
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$e */
    public static final class C7081e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C7081e f24958d = new C7081e();

        public C7081e() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$a */
    public static abstract class C57879a {
        /* renamed from: a */
        public void mo3747a(int i) {
        }

        /* renamed from: b */
        public void mo2561b(int i) {
        }

        /* renamed from: c */
        public void mo2562c(C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
        }

        /* renamed from: e */
        public void mo3681e(C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$b */
    public static abstract class C57880b {
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$d */
    public static final class C57881d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165631d;

        /* renamed from: e */
        public final /* synthetic */ C59741c0 f165632e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f165633f;

        public C57881d(RefreshLoadMoreLayout refreshLoadMoreLayout, C59741c0 c0Var, C32224a<C13598b0> aVar) {
            this.f165631d = refreshLoadMoreLayout;
            this.f165632e = c0Var;
            this.f165633f = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165631d;
            refreshLoadMoreLayout.f165602C = false;
            refreshLoadMoreLayout.setTranslationY(this.f165632e.f170634d);
            this.f165633f.invoke();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f165631d.f165602C = true;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$f */
    public static final class C57882f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165634d;

        public C57882f(RefreshLoadMoreLayout refreshLoadMoreLayout) {
            this.f165634d = refreshLoadMoreLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C32227p<Integer, Integer, C13598b0> onTranslateYCallback = this.f165634d.getOnTranslateYCallback();
            if (onTranslateYCallback != null) {
                onTranslateYCallback.invoke(0, Integer.valueOf((int) this.f165634d.getTranslationY()));
            }
            StickTopLoadingLayout stickTopLoadingLayout = this.f165634d.getStickTopLoadingLayout();
            if (stickTopLoadingLayout != null) {
                stickTopLoadingLayout.mo8166a(((float) this.f165634d.getRefreshHeaderHeight()) - Math.abs(this.f165634d.getTranslationY()));
            }
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$g */
    public static final class C57883g implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165635d;

        /* renamed from: e */
        public final /* synthetic */ float f165636e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f165637f;

        public C57883g(RefreshLoadMoreLayout refreshLoadMoreLayout, float f, C32224a<C13598b0> aVar) {
            this.f165635d = refreshLoadMoreLayout;
            this.f165636e = f;
            this.f165637f = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165635d;
            refreshLoadMoreLayout.f165602C = false;
            refreshLoadMoreLayout.setTranslationY(this.f165636e);
            this.f165635d.f165615Q = false;
            this.f165637f.invoke();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f165635d.f165602C = true;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$h */
    public static final class C57884h implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165638d;

        /* renamed from: e */
        public final /* synthetic */ float f165639e;

        public C57884h(RefreshLoadMoreLayout refreshLoadMoreLayout, float f) {
            this.f165638d = refreshLoadMoreLayout;
            this.f165639e = f;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165638d;
            refreshLoadMoreLayout.f165602C = false;
            refreshLoadMoreLayout.setTranslationY(this.f165639e);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f165638d.f165602C = true;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$i */
    public static final class C57885i implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165640d;

        public C57885i(RefreshLoadMoreLayout refreshLoadMoreLayout) {
            this.f165640d = refreshLoadMoreLayout;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f165640d.f165602C = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f165640d.f165602C = true;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$j */
    public static final class C57886j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57886j(RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(0);
            this.f165641d = refreshLoadMoreLayout;
        }

        public Object invoke() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165641d;
            int i = RefreshLoadMoreLayout.f165599Q0;
            refreshLoadMoreLayout.mo82499w();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$k */
    public static final class C57887k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165642d;

        /* renamed from: e */
        public final /* synthetic */ int f165643e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57887k(RefreshLoadMoreLayout refreshLoadMoreLayout, int i) {
            super(0);
            this.f165642d = refreshLoadMoreLayout;
            this.f165643e = i;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.RLMoreLayout", "[onFinishLoadMore]");
            this.f165642d.setLoadingMore(false);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165642d;
            refreshLoadMoreLayout.mo55513p(new C57908g(refreshLoadMoreLayout, this.f165643e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$l */
    public static final class C57888l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7080c<Object> f165644d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout f165645e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57888l(C7080c<Object> cVar, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(0);
            this.f165644d = cVar;
            this.f165645e = refreshLoadMoreLayout;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.RLMoreLayout", "[onFinishLoadMore2] reason=" + this.f165644d);
            this.f165645e.setLoadingMore(false);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165645e;
            refreshLoadMoreLayout.mo55513p(new C57909h(refreshLoadMoreLayout, this.f165644d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$m */
    public static final class C57889m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165646d;

        /* renamed from: e */
        public final /* synthetic */ int f165647e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57889m(RefreshLoadMoreLayout refreshLoadMoreLayout, int i) {
            super(0);
            this.f165646d = refreshLoadMoreLayout;
            this.f165647e = i;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.RLMoreLayout", "[onFinishRefresh]");
            this.f165646d.setRefreshing(false);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165646d;
            refreshLoadMoreLayout.mo82474q(new C57910i(refreshLoadMoreLayout, this.f165647e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$n */
    public static final class C57890n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7080c<Object> f165648d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout f165649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57890n(C7080c<Object> cVar, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(0);
            this.f165648d = cVar;
            this.f165649e = refreshLoadMoreLayout;
        }

        public Object invoke() {
            View findViewById;
            TextView textView;
            C13598b0 b0Var;
            CharSequence charSequence;
            Log.m105924i("MicroMsg.RLMoreLayout", "[onFinishRefresh2] reason=" + this.f165648d);
            this.f165649e.setRefreshing(false);
            C7083k kVar = new C7083k(this.f165649e, this.f165648d);
            C7080c<Object> cVar = this.f165648d;
            if (cVar.f24953h <= 0) {
                CharSequence charSequence2 = cVar.f24948c;
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165649e;
                    C7080c<Object> cVar2 = this.f165648d;
                    refreshLoadMoreLayout.f165609J = false;
                    View view = refreshLoadMoreLayout.f165625w;
                    if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.iji)) == null)) {
                        if (cVar2 == null || (charSequence = cVar2.f24948c) == null) {
                            b0Var = null;
                        } else {
                            textView.setVisibility(0);
                            textView.setText(charSequence);
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var == null) {
                            textView.setText(C0966R.string.hvh);
                        }
                    }
                    View view2 = refreshLoadMoreLayout.f165625w;
                    if (!(view2 == null || (findViewById = view2.findViewById(C0966R.C0970id.ive)) == null)) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view3 = findViewById;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "noRefreshMore", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/view/RefreshLoadMoreLayout", "noRefreshMore", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                C57879a actionCallback = this.f165649e.getActionCallback();
                if (actionCallback != null) {
                    actionCallback.mo3681e(this.f165648d);
                }
                C57879a reportCallback = this.f165649e.getReportCallback();
                if (reportCallback != null) {
                    reportCallback.mo3681e(this.f165648d);
                }
            } else if (!cVar.f24952g) {
                kVar.invoke();
                C57879a actionCallback2 = this.f165649e.getActionCallback();
                if (actionCallback2 != null) {
                    actionCallback2.mo3681e(this.f165648d);
                }
                C57879a reportCallback2 = this.f165649e.getReportCallback();
                if (reportCallback2 != null) {
                    reportCallback2.mo3681e(this.f165648d);
                }
            } else {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f165649e;
                refreshLoadMoreLayout2.mo82474q(new C57911j(kVar, refreshLoadMoreLayout2, cVar));
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f165649e;
            refreshLoadMoreLayout3.f165615Q = false;
            StickTopLoadingLayout stickTopLoadingLayout = refreshLoadMoreLayout3.getStickTopLoadingLayout();
            if (stickTopLoadingLayout != null) {
                C7080c<Object> cVar3 = this.f165648d;
                C87412m.m108594g(cVar3, TPReportKeys.PlayerStep.PLAYER_REASON);
                stickTopLoadingLayout.f24939f = false;
                stickTopLoadingLayout.mo8167b();
                C57879a aVar2 = stickTopLoadingLayout.f24940g;
                if (aVar2 != null) {
                    aVar2.mo3681e(cVar3);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$o */
    public static final class C57891o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165650d;

        /* renamed from: e */
        public final /* synthetic */ int f165651e;

        public C57891o(RefreshLoadMoreLayout refreshLoadMoreLayout, int i) {
            this.f165650d = refreshLoadMoreLayout;
            this.f165651e = i;
        }

        public final void run() {
            C57879a actionCallback = this.f165650d.getActionCallback();
            if (actionCallback != null) {
                actionCallback.mo3747a(this.f165651e);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$p */
    public static final class C57892p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7080c<Object> f165652d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout f165653e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57892p(C7080c<Object> cVar, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(0);
            this.f165652d = cVar;
            this.f165653e = refreshLoadMoreLayout;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.RLMoreLayout", "[onPreFinishLoadMoreSmooth] reason=" + this.f165652d);
            this.f165653e.setLoadingMore(false);
            C7084n nVar = new C7084n(this.f165653e, this.f165652d);
            C7080c<Object> cVar = this.f165652d;
            if (!cVar.f24951f) {
                this.f165653e.mo82437B(cVar);
                C7080c<Object> cVar2 = this.f165652d;
                if (cVar2.f24953h <= 0) {
                    C57879a actionCallback = this.f165653e.getActionCallback();
                    if (actionCallback != null) {
                        actionCallback.mo2562c(this.f165652d);
                    }
                } else if (!cVar2.f24952g) {
                    nVar.invoke();
                    C57879a actionCallback2 = this.f165653e.getActionCallback();
                    if (actionCallback2 != null) {
                        actionCallback2.mo2562c(this.f165652d);
                    }
                } else {
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165653e;
                    refreshLoadMoreLayout.mo55513p(new C57912l(nVar, refreshLoadMoreLayout, cVar2));
                }
            } else if (!cVar.f24952g) {
                nVar.invoke();
                C57879a actionCallback3 = this.f165653e.getActionCallback();
                if (actionCallback3 != null) {
                    actionCallback3.mo2562c(this.f165652d);
                }
            } else {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f165653e;
                refreshLoadMoreLayout2.mo55513p(new C57913m(nVar, refreshLoadMoreLayout2, cVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$q */
    public static final class C57893q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f165654d;

        public C57893q(C32224a<C13598b0> aVar) {
            this.f165654d = aVar;
        }

        public final void run() {
            this.f165654d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$r */
    public static final class C57894r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f165655d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout f165656e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57894r(int i, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(0);
            this.f165655d = i;
            this.f165656e = refreshLoadMoreLayout;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.RLMoreLayout", "[onRequestLoadMore] loadMoreType:" + this.f165655d);
            RecyclerView.C16613e adapter = this.f165656e.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.getItemCount();
            }
            int i = RefreshLoadMoreLayout.f165599Q0;
            View view = this.f165656e.f165626x;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165656e;
            refreshLoadMoreLayout.f165623u = false;
            refreshLoadMoreLayout.f165624v = false;
            C57879a actionCallback = refreshLoadMoreLayout.getActionCallback();
            if (actionCallback == null) {
                return null;
            }
            actionCallback.mo2561b(this.f165655d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$s */
    public static final class C57895s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f165657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57895s(C32224a<C13598b0> aVar) {
            super(0);
            this.f165657d = aVar;
        }

        public Object invoke() {
            this.f165657d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$t */
    public static final class C57896t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165658d;

        /* renamed from: e */
        public final /* synthetic */ boolean f165659e;

        /* renamed from: f */
        public final /* synthetic */ int f165660f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57896t(RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z, int i) {
            super(0);
            this.f165658d = refreshLoadMoreLayout;
            this.f165659e = z;
            this.f165660f = i;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.RLMoreLayout", "[onRequestRefresh]");
            this.f165658d.setRefreshing(true);
            RecyclerView.C16613e adapter = this.f165658d.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.getItemCount();
            }
            View refreshHeader = this.f165658d.getRefreshHeader();
            if (refreshHeader != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(refreshHeader, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestRefresh$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                refreshHeader.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(refreshHeader, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestRefresh$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165658d;
            refreshLoadMoreLayout.f165623u = false;
            refreshLoadMoreLayout.f165624v = false;
            StringBuilder sb = new StringBuilder();
            sb.append("[onRequestRefresh], stickTopLoadingLayout is null? ");
            sb.append(this.f165658d.getStickTopLoadingLayout() == null);
            sb.append(", hash:");
            C57879a actionCallback = this.f165658d.getActionCallback();
            sb.append(actionCallback != null ? Integer.valueOf(actionCallback.hashCode()) : null);
            Log.m105924i("MicroMsg.RLMoreLayout", sb.toString());
            StickTopLoadingLayout stickTopLoadingLayout = this.f165658d.getStickTopLoadingLayout();
            if (stickTopLoadingLayout != null) {
                boolean z = this.f165659e;
                if (z) {
                    stickTopLoadingLayout.f24939f = true;
                    stickTopLoadingLayout.f24937d.setVisibility(4);
                    stickTopLoadingLayout.f24937d.mo82304d();
                } else {
                    stickTopLoadingLayout.mo8166a(stickTopLoadingLayout.f24938e);
                    stickTopLoadingLayout.f24939f = true;
                    stickTopLoadingLayout.f24937d.setAlpha(1.0f);
                    stickTopLoadingLayout.f24937d.setVisibility(0);
                    stickTopLoadingLayout.f24937d.mo82303c();
                }
                Log.m105924i("MicroMsg.RLMoreLayout", "onRefreshing isHideLoading = " + z);
                C57879a aVar2 = stickTopLoadingLayout.f24940g;
                if (aVar2 != null) {
                    aVar2.mo3680d(0);
                }
            }
            C57879a actionCallback2 = this.f165658d.getActionCallback();
            if (actionCallback2 != null) {
                actionCallback2.mo3680d(this.f165660f);
            }
            C57879a reportCallback = this.f165658d.getReportCallback();
            if (reportCallback == null) {
                return null;
            }
            reportCallback.mo3680d(this.f165660f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$u */
    public static final class C57897u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f165661d;

        public C57897u(C32224a aVar) {
            this.f165661d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f165661d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$v */
    public static final class C57898v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f165662d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f165663e;

        /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$v$a */
        public static final class C57899a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ RefreshLoadMoreLayout f165664d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57899a(RefreshLoadMoreLayout refreshLoadMoreLayout) {
                super(0);
                this.f165664d = refreshLoadMoreLayout;
            }

            public Object invoke() {
                View findViewById;
                View findViewById2;
                View refreshHeader = this.f165664d.getRefreshHeader();
                if (!(refreshHeader == null || (findViewById2 = refreshHeader.findViewById(C0966R.C0970id.ive)) == null)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById2;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View refreshHeader2 = this.f165664d.getRefreshHeader();
                if (!(refreshHeader2 == null || (findViewById = refreshHeader2.findViewById(C0966R.C0970id.iji)) == null)) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View refreshHeader3 = this.f165664d.getRefreshHeader();
                if (refreshHeader3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(4);
                    View view3 = refreshHeader3;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    refreshHeader3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f165664d.setHasTopMore(true);
                return C13598b0.f38549a;
            }
        }

        public C57898v(RefreshLoadMoreLayout refreshLoadMoreLayout, C32224a<C13598b0> aVar) {
            this.f165662d = refreshLoadMoreLayout;
            this.f165663e = aVar;
        }

        public final void run() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f165662d;
            refreshLoadMoreLayout.mo82474q(new C57899a(refreshLoadMoreLayout));
            this.f165663e.invoke();
        }
    }

    public RefreshLoadMoreLayout(Context context) {
        super(context);
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m66895A(RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return refreshLoadMoreLayout.mo82501z(z, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isAttachRefresh");
    }

    /* renamed from: C */
    public static /* synthetic */ void m66896C(RefreshLoadMoreLayout refreshLoadMoreLayout, C7080c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                cVar = null;
            }
            refreshLoadMoreLayout.mo82437B(cVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: noFooterMore");
    }

    /* renamed from: N */
    public static /* synthetic */ void m66897N(RefreshLoadMoreLayout refreshLoadMoreLayout, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            refreshLoadMoreLayout.mo82445K(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRefresh");
    }

    /* renamed from: r */
    public static /* synthetic */ void m66898r(RefreshLoadMoreLayout refreshLoadMoreLayout, C32224a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                aVar = C7081e.f24958d;
            }
            refreshLoadMoreLayout.mo82474q(aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animToFinishRefresh");
    }

    /* renamed from: x */
    private final void m66899x(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226846A);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…le.RefreshLoadMoreLayout)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) null);
                    this.f165625w = inflate;
                    if (inflate != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(4);
                        View view = inflate;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view2 = this.f165625w;
                    C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.View");
                    mo82391b(view2, false);
                }
            } else if (index == 0) {
                int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
                Log.m105924i("MicroMsg.RLMoreLayout", "check footer res " + resourceId2 + " i " + i);
                if (resourceId2 != 0) {
                    View inflate2 = LayoutInflater.from(getContext()).inflate(resourceId2, this, false);
                    this.f165626x = inflate2;
                    if (inflate2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(4);
                        View view3 = inflate2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/view/RefreshLoadMoreLayout", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view4 = this.f165626x;
                    C87412m.m108592e(view4, "null cannot be cast to non-null type android.view.View");
                    mo82390a(view4, false);
                }
            }
        }
        Log.m105924i("MicroMsg.RLMoreLayout", "has static refreshHeader=" + this.f165625w + " loadMoreFooter=" + this.f165626x + " hash=" + hashCode());
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82437B(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r13) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "noFooterMore reason: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.RLMoreLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            r0 = 0
            r12.setHasBottomMore(r0)
            android.view.View r1 = r12.f165626x
            r2 = 0
            r3 = 2131308010(0x7f092dea, float:1.8234263E38)
            if (r1 == 0) goto L_0x003f
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x003f
            if (r13 == 0) goto L_0x0036
            java.lang.CharSequence r13 = r13.f24948c
            if (r13 == 0) goto L_0x0036
            r1.setText(r13)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0037
        L_0x0036:
            r13 = r2
        L_0x0037:
            if (r13 != 0) goto L_0x003f
            r13 = 2131832190(0x7f112d7e, float:1.9297427E38)
            r1.setText(r13)
        L_0x003f:
            android.view.View r13 = r12.f165626x
            if (r13 == 0) goto L_0x009f
            r1 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r13 = r13.findViewById(r1)
            if (r13 == 0) goto L_0x009f
            android.view.View r1 = r12.f165626x
            if (r1 == 0) goto L_0x0057
            android.view.View r1 = r1.findViewById(r3)
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            r1 = 8
            r2.setVisibility(r1)
        L_0x005f:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.mo10233c(r2)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/view/RefreshLoadMoreLayout"
            java.lang.String r7 = "noFooterMore"
            java.lang.String r8 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r13
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r1.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/view/RefreshLoadMoreLayout"
            java.lang.String r6 = "noFooterMore"
            java.lang.String r7 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.RefreshLoadMoreLayout.mo82437B(com.tencent.mm.view.RefreshLoadMoreLayout$c):void");
    }

    /* renamed from: D */
    public final boolean mo82438D(boolean z) {
        Log.m105924i("MicroMsg.RLMoreLayout", "[onAutoToLoadMore] isSilence=" + z);
        return z ? mo82444J(2) : mo82444J(2);
    }

    /* renamed from: E */
    public final void mo82439E(boolean z, boolean z2) {
        Log.m105924i("MicroMsg.RLMoreLayout", "[onAutoToRefresh] isSilence=" + z + " isHideLoading=" + z2);
        if (z) {
            mo82445K(2, z2);
        } else {
            mo82475s(2);
        }
    }

    /* renamed from: F */
    public final void mo82440F(int i) {
        mo82449R(new C57887k(this, i));
    }

    /* renamed from: G */
    public final void mo82441G(C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        mo82449R(new C57888l(cVar, this));
    }

    /* renamed from: H */
    public final void mo82442H(int i) {
        mo82449R(new C57889m(this, i));
    }

    /* renamed from: I */
    public final void mo82443I(C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        mo82449R(new C57890n(cVar, this));
    }

    /* renamed from: J */
    public final boolean mo82444J(int i) {
        if (!this.f165608I) {
            Log.m105924i("MicroMsg.RLMoreLayout", "has't any more");
            return false;
        } else if (this.f165605F) {
            Log.m105924i("MicroMsg.RLMoreLayout", "isLoadingMore...");
            return false;
        } else {
            this.f165605F = true;
            C57894r rVar = new C57894r(i, this);
            if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                rVar.invoke();
            } else {
                post(new C57893q(rVar));
            }
            return true;
        }
    }

    /* renamed from: K */
    public final void mo82445K(int i, boolean z) {
        Log.m105924i("MicroMsg.RLMoreLayout", "[onRequestRefresh] isHasTopMore=" + this.f165609J + " isRefreshing=" + this.f165603D + " refreshType:" + i);
        if (this.f165609J && !this.f165603D) {
            C57896t tVar = new C57896t(this, z, i);
            if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                tVar.invoke();
            } else {
                mo82449R(new C57895s(tVar));
            }
        }
    }

    /* renamed from: O */
    public final void mo82446O(int i) {
        int i2 = (int) (((float) i) / 1.5f);
        if (i2 == 0) {
            i2 = i > 0 ? 1 : -1;
        }
        this.f165618T = true;
        setTranslationY(getTranslationY() - ((float) i2));
        Log.m105918d("MicroMsg.RLMoreLayout", "onNotOverScroll enablePullDownHeader " + i2 + ", " + getTranslationY() + ", " + i);
        if (getTranslationY() < 0.0f) {
            setTranslationY(0.0f);
        }
    }

    /* renamed from: P */
    public final void mo82447P() {
        this.f165613N = true;
        this.f165603D = false;
        this.f165605F = false;
        setHasBottomMore(true);
        this.f165602C = false;
        setTranslationY(-((float) this.f165600A));
        View view = this.f165625w;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f165626x;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/view/RefreshLoadMoreLayout", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: Q */
    public final void mo82448Q(long j, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "finish");
        C57898v vVar = new C57898v(this, aVar);
        this.f165610K = vVar;
        this.f165604E.postDelayed(vVar, j);
    }

    /* renamed from: R */
    public final void mo82449R(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
        } else {
            this.f165604E.post(new C57897u(aVar));
        }
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        return this.f165573g ? super.startNestedScroll(i) : this.f165572f;
    }

    /* renamed from: e */
    public void mo82394e(View view, int i, int i2, int[] iArr, int i3) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        if (this.f165618T) {
            mo82446O(i2);
            iArr[1] = i2;
        }
    }

    /* renamed from: f */
    public void mo77109f(RecyclerView recyclerView, HeadFooterLayout headFooterLayout, int i, int i2, boolean z, boolean z2, int[] iArr, int i3, boolean z3) {
        int i4;
        View view;
        View view2;
        Runnable runnable;
        View findViewById;
        View findViewById2;
        int i5 = i;
        int[] iArr2 = iArr;
        int i6 = i3;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(headFooterLayout, "parent");
        C87412m.m108594g(iArr2, "consumed");
        boolean z4 = true;
        if (i6 == 0 && (runnable = this.f165610K) != null) {
            this.f165604E.removeCallbacks(runnable);
            View view3 = this.f165625w;
            if (!(view3 == null || (findViewById2 = view3.findViewById(C0966R.C0970id.ive)) == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = findViewById2;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f165625w;
            if (!(view5 == null || (findViewById = view5.findViewById(C0966R.C0970id.iji)) == null)) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = findViewById;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view7 = this.f165625w;
            if (view7 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f165609J = true;
            this.f165610K = null;
        }
        boolean y = mo82500y(false, "onOverScroll");
        boolean d = mo82393d(recyclerView);
        if (this.f165614P && !this.f165615Q && ((float) (-this.f165628y)) < getTranslationY() && i6 == 0) {
            performHapticFeedback(0, 2);
            this.f165615Q = true;
        }
        if (i6 != 1 || ((!y || this.f165605F || !this.f165608I) && (!d || this.f165603D))) {
            boolean A = m66895A(this, false, "onOverScroll", 1, (Object) null);
            boolean y2 = mo82500y(true, "onOverScroll");
            if (!this.f165619U || i6 != 0 || !z3) {
                if (this.f165618T) {
                    HeadFooterLayout.m66871l(this, "[onOverScroll] isPullDownHeader ：" + this.f165618T, false, 2, (Object) null);
                    return;
                }
            } else if (i5 < 0 || this.f165618T) {
                mo82446O(i5);
                iArr2[1] = i5;
                HeadFooterLayout.m66871l(this, "[onOverScroll] pullDown", false, 2, (Object) null);
                return;
            }
            if (i6 != 0 && d && this.f165603D && i5 < 0) {
                float translationY = getTranslationY();
                int i7 = this.f165606G;
                if (translationY > ((float) i7) && i7 != -1) {
                    mo82404k("[onOverScroll] isFirstItemReachTop  stopScroll", false);
                    recyclerView.mo17155w1();
                    return;
                }
            }
            if ((!A || i5 >= 0 || !this.f165609J) && (!y2 || i5 <= 0 || !this.f165608I)) {
                i4 = i5;
            } else {
                float f = (float) i5;
                float f2 = this.f165607H;
                if (f2 != 0.0f) {
                    z4 = false;
                }
                if (z4) {
                    f2 = 3.0f;
                }
                i4 = (int) (f / f2);
            }
            if ((z3 && !this.f165620V && i5 < 0) || (!this.f165621W && i5 > 0)) {
                i4 = 0;
            }
            if ((A && i5 < 0) || (y2 && i5 > 0)) {
                if (A && (view2 = this.f165625w) != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view9 = view2;
                    C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (y2 && (view = this.f165626x) != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view10 = view;
                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/view/RefreshLoadMoreLayout", "onOverScroll", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/HeadFooterLayout;IIZZ[IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            super.mo77109f(recyclerView, headFooterLayout, i, i4, z, z2, iArr, i3, z3);
        } else if (this.f165622p0 && d && i5 < 0) {
            recyclerView.mo17155w1();
        } else if (this.f165627x0 && y && i5 > 0) {
            recyclerView.mo17155w1();
        }
    }

    public final C57879a getActionCallback() {
        return this.f165611L;
    }

    public final boolean getCanLoadMore() {
        return this.f165621W;
    }

    public final boolean getCanRefresh() {
        return this.f165620V;
    }

    public final boolean getDEBUG() {
        return false;
    }

    public final float getDamping() {
        return this.f165607H;
    }

    public final View getEmptyView() {
        return this.f165629y0;
    }

    public final boolean getEnableLoadMore() {
        return this.f165627x0;
    }

    public final boolean getEnablePullDownHeader() {
        return this.f165619U;
    }

    public final boolean getEnableRefresh() {
        return this.f165622p0;
    }

    public final int getLimitBottomRequest() {
        return this.f165630z;
    }

    public final int getLimitTopRequest() {
        return this.f165628y;
    }

    public final View getLoadMoreFooter() {
        return this.f165626x;
    }

    public final int getParentTranslation() {
        return this.f165616R;
    }

    public final View getRefreshHeader() {
        return this.f165625w;
    }

    public final int getRefreshHeaderHeight() {
        return this.f165600A;
    }

    public final int getRefreshTargetY() {
        return this.f165606G;
    }

    public final C57879a getReportCallback() {
        return this.f165612M;
    }

    public final StickTopLoadingLayout getStickTopLoadingLayout() {
        return this.f165617S;
    }

    public final C57880b getTest() {
        return null;
    }

    /* renamed from: h */
    public void mo77110h(RecyclerView recyclerView, HeadFooterLayout headFooterLayout, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(headFooterLayout, "parent");
        super.mo77110h(recyclerView, headFooterLayout, i);
        boolean z = true;
        if (this.f165618T) {
            this.f165618T = false;
            recyclerView.mo17155w1();
            Log.m105924i("MicroMsg.RLMoreLayout", "animToCollapseHeader");
            if (getTranslationY() != 0.0f) {
                z = false;
            }
            if (!z) {
                animate().cancel();
                animate().translationY(0.0f).setDuration(240).setListener(new C66955f0(this)).start();
            }
        } else if (i == 0) {
            if (m66895A(this, false, "onStopScroll", 1, (Object) null)) {
                boolean z2 = this.f165603D;
                if (!z2 && this.f165609J) {
                    recyclerView.mo17155w1();
                    if (((float) (-this.f165628y)) < getTranslationY()) {
                        mo82475s(1);
                    } else if (((float) (-this.f165628y)) > getTranslationY()) {
                        m66898r(this, (C32224a) null, 1, (Object) null);
                    }
                } else if (z2) {
                    mo82475s(1);
                }
            } else if (mo82500y(true, "onStopScroll") && !this.f165605F && this.f165608I) {
                recyclerView.mo17155w1();
                if (((float) ((-this.f165600A) - (this.f165601B - this.f165630z))) > getTranslationY()) {
                    mo82444J(1);
                } else if (((float) ((-this.f165600A) - (this.f165601B - this.f165630z))) < getTranslationY()) {
                    mo55513p(C16383g0.f43783d);
                }
            }
        } else if (m66895A(this, false, "onStopScroll", 1, (Object) null)) {
            Log.m105928w("MicroMsg.RLMoreLayout", "[onStopScroll] isAttachRefresh but type=" + i + ' ');
        }
    }

    public boolean isNestedScrollingEnabled() {
        return true;
    }

    public void onChanged() {
        RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo82447P();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (this.f165602C) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f165623u = mo82501z(false, "onInterceptTouchEvent ACTION_DOWN");
            this.f165624v = mo82500y(false, "onInterceptTouchEvent ACTION_DOWN");
            mo82404k("[onInterceptTouchEvent] ACTION_DOWN isAttachRefreshAtDown=" + this.f165623u + " isAttachLoadMoreAtDown=" + this.f165624v, false);
        } else if (action == 1 || action == 3) {
            mo82404k("[onInterceptTouchEvent] ACTION_UP isAttachRefreshAtDown=" + this.f165623u + " isAttachLoadMoreAtDown=" + this.f165624v, false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onItemRangeChanged(int i, int i2) {
        RecyclerView.C16613e adapter;
        if (i2 > 0 && (adapter = getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemRangeChanged(i, i2);
        }
    }

    public void onItemRangeInserted(int i, int i2) {
        if (i2 > 0) {
            RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeInserted(i, i2);
            }
            getRecyclerView().post(new C57891o(this, i2));
        }
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        RecyclerView.C16613e adapter;
        if (i3 > 0 && (adapter = getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemMoved(i, i2);
        }
    }

    public void onItemRangeRemoved(int i, int i2) {
        RecyclerView.C16613e adapter;
        if (i2 > 0 && (adapter = getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemRangeRemoved(i, i2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.f165613N) {
            setTranslationY(-((float) this.f165600A));
            this.f165613N = false;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        View view = this.f165625w;
        int i4 = 0;
        if (view != null) {
            C87412m.m108591d(view);
            i3 = view.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        this.f165600A = i3;
        View view2 = this.f165626x;
        if (view2 != null) {
            C87412m.m108591d(view2);
            i4 = view2.getMeasuredHeight();
        }
        this.f165601B = i4;
        if (-1 == this.f165628y) {
            this.f165628y = (int) (((float) this.f165600A) * 0.15f);
        }
        if (-1 == this.f165630z) {
            this.f165630z = (int) (((float) i4) * 0.15f);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C87412m.m108594g(view, "target");
        return super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C87412m.m108594g(view, "target");
        return super.onNestedPreFling(view, f, f2);
    }

    public void onPreFinishLoadMore(C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        mo82441G(cVar);
    }

    public void onPreFinishLoadMoreSmooth(C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        mo82449R(new C57892p(cVar, this));
    }

    public void onPreFinishRefresh(C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        mo82443I(cVar);
    }

    /* renamed from: p */
    public void mo55513p(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        Rect rect = new Rect(0, 0, 0, 0);
        View view = this.f165626x;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        C59741c0 c0Var = new C59741c0();
        float translationY = getTranslationY() + ((float) rect.height());
        c0Var.f170634d = translationY;
        int i = this.f165600A;
        if (translationY >= ((float) (-i))) {
            c0Var.f170634d = -((float) i);
        }
        animate().cancel();
        animate().translationY(c0Var.f170634d).setDuration(240).setListener(new C57881d(this, c0Var, aVar)).start();
    }

    /* renamed from: q */
    public final void mo82474q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        float f = -((float) this.f165600A);
        if (!m66895A(this, false, "onInterceptTouchEvent animToFinishRefresh", 1, (Object) null)) {
            aVar.invoke();
            this.f165615Q = false;
            return;
        }
        animate().cancel();
        animate().translationY(f).setDuration(240).setUpdateListener(new C57882f(this)).setListener(new C57883g(this, f, aVar)).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r1 = r4.f165600A;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82475s(int r5) {
        /*
            r4 = this;
            int r0 = r4.f165606G
            r1 = -1
            if (r0 != r1) goto L_0x0007
            r0 = 0
            goto L_0x0013
        L_0x0007:
            com.tencent.mm.view.RefreshLoadMoreLayout$StickTopLoadingLayout r1 = r4.f165617S
            if (r1 == 0) goto L_0x0012
            int r1 = r4.f165600A
            if (r1 == 0) goto L_0x0012
            float r0 = (float) r1
            float r0 = -r0
            goto L_0x0013
        L_0x0012:
            float r0 = (float) r0
        L_0x0013:
            r1 = 0
            r2 = 2
            r3 = 0
            m66897N(r4, r5, r1, r2, r3)
            android.view.ViewPropertyAnimator r5 = r4.animate()
            r5.cancel()
            android.view.ViewPropertyAnimator r5 = r4.animate()
            android.view.ViewPropertyAnimator r5 = r5.translationY(r0)
            r1 = 240(0xf0, double:1.186E-321)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r1)
            com.tencent.mm.view.RefreshLoadMoreLayout$h r1 = new com.tencent.mm.view.RefreshLoadMoreLayout$h
            r1.<init>(r4, r0)
            android.view.ViewPropertyAnimator r5 = r5.setListener(r1)
            r5.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.RefreshLoadMoreLayout.mo82475s(int):void");
    }

    public final void setActionCallback(C57879a aVar) {
        this.f165611L = aVar;
    }

    public final void setCanLoadMore(boolean z) {
        this.f165621W = z;
    }

    public final void setCanRefresh(boolean z) {
        this.f165620V = z;
    }

    public final void setDamping(float f) {
        this.f165607H = f;
    }

    public final void setEmptyView(View view) {
        this.f165629y0 = view;
    }

    public final void setEnableLoadMore(boolean z) {
        View view;
        this.f165627x0 = z;
        if (!z && (view = this.f165626x) != null) {
            C87412m.m108591d(view);
            mo82405m(view, false);
            this.f165626x = null;
            float translationY = getTranslationY();
            int i = this.f165600A;
            if (translationY > ((float) i)) {
                setTranslationY((float) i);
            }
            Log.m105924i("MicroMsg.RLMoreLayout", "set enableLoadMore false and remove footer hash=" + hashCode() + ", " + getTranslationY() + ", " + this.f165600A);
        }
        Log.m105924i("MicroMsg.RLMoreLayout", "set enableLoadMore " + z + ", hash=" + hashCode());
    }

    public final void setEnablePullDownHeader(boolean z) {
        this.f165619U = z;
    }

    public final void setEnableRefresh(boolean z) {
        View view;
        this.f165622p0 = z;
        if (!z && (view = this.f165625w) != null) {
            if (getHeaderViews().remove(view)) {
                removeView(view);
                this.f165580q = false;
                requestLayout();
            }
            this.f165625w = null;
            if (getTranslationY() <= ((float) (0 - this.f165600A))) {
                setTranslationY(getTranslationY() + ((float) this.f165600A));
            }
            Log.m105924i("MicroMsg.RLMoreLayout", "set enableRefresh false and remove header, " + getTranslationY() + ", " + this.f165600A + " hash=" + hashCode());
        }
        Log.m105924i("MicroMsg.RLMoreLayout", "set enableRefresh " + z + " hash=" + hashCode());
    }

    public final void setHasBottomMore(boolean z) {
        if (z) {
            if (this.f165613N) {
                mo82499w();
            } else {
                mo55513p(new C57886j(this));
            }
        }
        this.f165608I = z;
    }

    public final void setHasTopMore(boolean z) {
        this.f165609J = z;
    }

    public final void setLimitBottomRequest(int i) {
        this.f165630z = i;
    }

    public final void setLimitTopRequest(int i) {
        this.f165628y = i;
    }

    public final void setLoadMoreFooter(View view) {
        C87412m.m108594g(view, "footer");
        View view2 = this.f165626x;
        if (view2 != null) {
            mo82405m(view2, true);
        }
        mo82390a(view, true);
        this.f165626x = view;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "setLoadMoreFooter", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout", "setLoadMoreFooter", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setLoadingMore(boolean z) {
        this.f165605F = z;
    }

    public final void setParentTranslation(int i) {
        this.f165616R = i;
    }

    public final void setRefreshHeader(View view) {
        this.f165625w = view;
    }

    public final void setRefreshHeaderView(View view) {
        C87412m.m108594g(view, "header");
        this.f165613N = true;
        View view2 = this.f165625w;
        if (view2 != null && getHeaderViews().remove(view2)) {
            removeView(view2);
            this.f165580q = true;
            requestLayout();
        }
        mo82391b(view, true);
        setEnableRefresh(true);
        this.f165625w = view;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "setRefreshHeaderView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout", "setRefreshHeaderView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setRefreshTargetY(int i) {
        this.f165606G = i;
    }

    public final void setRefreshing(boolean z) {
        this.f165603D = z;
    }

    public final void setReportCallback(C57879a aVar) {
        this.f165612M = aVar;
    }

    public final void setStickTopLoadingLayout(StickTopLoadingLayout stickTopLoadingLayout) {
        this.f165617S = stickTopLoadingLayout;
    }

    public final void setTest(C57880b bVar) {
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        StickTopLoadingLayout stickTopLoadingLayout = this.f165617S;
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.mo8166a(((float) getRefreshHeaderHeight()) - Math.abs(f));
        }
    }

    /* renamed from: t */
    public final void mo82498t() {
        View view = this.f165626x;
        if (view != null) {
            float translationY = getTranslationY() - ((float) view.getHeight());
            animate().cancel();
            animate().translationY(translationY).setDuration(240).setListener(new C57885i(this)).start();
        }
    }

    /* renamed from: w */
    public final void mo82499w() {
        View findViewById;
        TextView textView;
        View view = this.f165626x;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "doAfterLoadMoreAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/RefreshLoadMoreLayout", "doAfterLoadMoreAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f165626x;
        if (!(view2 == null || (textView = (TextView) view2.findViewById(C0966R.C0970id.g2t)) == null)) {
            textView.setText(C0966R.string.f360085a04);
        }
        View view3 = this.f165626x;
        if (view3 != null && (findViewById = view3.findViewById(C0966R.C0970id.g2s)) != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout", "doAfterLoadMoreAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout", "doAfterLoadMoreAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029 A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82500y(boolean r12, java.lang.String r13) {
        /*
            r11 = this;
            android.view.View r0 = r11.f165626x
            r1 = 0
            if (r0 == 0) goto L_0x0189
            boolean r0 = r11.f165621W
            if (r0 != 0) goto L_0x000b
            goto L_0x0189
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView r0 = r11.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L_0x00d1
            if (r12 == 0) goto L_0x002c
            float r12 = r11.getTranslationY()
            int r13 = r11.getHeadersHeight()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x0189
        L_0x0029:
            r1 = 1
            goto L_0x0189
        L_0x002c:
            float r12 = r11.getTranslationY()
            int r13 = r11.getHeadersHeight()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0189
            androidx.recyclerview.widget.RecyclerView r12 = r11.getRecyclerView()
            java.lang.String r13 = "target"
            gy3.C87412m.m108594g(r12, r13)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r13 = r12.getLayoutManager()
            boolean r0 = r13 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x009d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r13
            r0 = 0
            int[] r0 = r13.mo17395B(r0)
            int r2 = r0.length
            r5 = 0
            r6 = 0
        L_0x0056:
            if (r5 >= r2) goto L_0x0065
            r7 = r0[r5]
            int r8 = r13.getItemCount()
            int r8 = r8 - r4
            if (r7 != r8) goto L_0x0062
            r6 = 1
        L_0x0062:
            int r5 = r5 + 1
            goto L_0x0056
        L_0x0065:
            if (r6 == 0) goto L_0x00cc
            int r2 = r0.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x006b:
            if (r5 >= r2) goto L_0x00cd
            r8 = r0[r5]
            if (r8 == r3) goto L_0x009a
            android.view.View r8 = r13.findViewByPosition(r8)
            if (r8 == 0) goto L_0x009a
            android.graphics.Rect r9 = r11.f165575i
            androidx.recyclerview.widget.RecyclerView.m15804R0(r8, r9)
            android.graphics.Rect r9 = r11.f165575i
            int r9 = r9.bottom
            int r10 = r8.getBottom()
            if (r10 <= r7) goto L_0x009a
            int r6 = r12.getHeight()
            if (r9 > r6) goto L_0x0095
            int r6 = r12.getHeight()
            int r6 = r6 - r1
            if (r9 < r6) goto L_0x0095
            r6 = 1
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            int r7 = r8.getBottom()
        L_0x009a:
            int r5 = r5 + 1
            goto L_0x006b
        L_0x009d:
            boolean r0 = r13 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00cc
            androidx.recyclerview.widget.LinearLayoutManager r13 = (androidx.recyclerview.widget.LinearLayoutManager) r13
            int r0 = r13.mo16959E()
            int r2 = r13.getItemCount()
            int r2 = r2 - r4
            if (r0 != r2) goto L_0x00cc
            android.view.View r13 = r13.findViewByPosition(r0)
            if (r13 == 0) goto L_0x00cc
            android.graphics.Rect r0 = r11.f165575i
            androidx.recyclerview.widget.RecyclerView.m15804R0(r13, r0)
            android.graphics.Rect r13 = r11.f165575i
            int r13 = r13.bottom
            int r0 = r12.getHeight()
            if (r13 > r0) goto L_0x00cc
            int r12 = r12.getHeight()
            int r12 = r12 - r1
            if (r13 < r12) goto L_0x00cc
            r6 = 1
            goto L_0x00cd
        L_0x00cc:
            r6 = 0
        L_0x00cd:
            if (r6 == 0) goto L_0x0189
            goto L_0x0029
        L_0x00d1:
            boolean r2 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r2 == 0) goto L_0x0189
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            int r2 = r0.f44890d
            int[] r2 = new int[r2]
            r5 = 0
        L_0x00dc:
            int r6 = r0.f44890d
            if (r5 >= r6) goto L_0x0105
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r0.f44891e
            r6 = r6[r5]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            boolean r7 = r7.f44897n
            if (r7 == 0) goto L_0x00f5
            java.util.ArrayList<android.view.View> r7 = r6.f44936a
            int r7 = r7.size()
            int r6 = r6.mo17456h(r1, r7, r4)
            goto L_0x0100
        L_0x00f5:
            java.util.ArrayList<android.view.View> r7 = r6.f44936a
            int r7 = r7.size()
            int r7 = r7 - r4
            int r6 = r6.mo17456h(r7, r3, r4)
        L_0x0100:
            r2[r5] = r6
            int r5 = r5 + 1
            goto L_0x00dc
        L_0x0105:
            int r3 = r2.length
            r5 = 0
            r6 = 0
        L_0x0108:
            if (r5 >= r3) goto L_0x0117
            r7 = r2[r5]
            int r8 = r0.getItemCount()
            int r8 = r8 - r4
            if (r7 != r8) goto L_0x0114
            r6 = 1
        L_0x0114:
            int r5 = r5 + 1
            goto L_0x0108
        L_0x0117:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[isAttachLoadMore] "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = " isHard "
            r2.append(r13)
            r2.append(r12)
            java.lang.String r13 = " translationY:"
            r2.append(r13)
            float r13 = r11.getTranslationY()
            r2.append(r13)
            java.lang.String r13 = " headersHeight:"
            r2.append(r13)
            int r13 = r11.getHeadersHeight()
            r2.append(r13)
            java.lang.String r13 = " loadingLast:"
            r2.append(r13)
            r2.append(r6)
            java.lang.String r13 = " itemCount "
            r2.append(r13)
            int r13 = r0.getItemCount()
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r11.mo82404k(r13, r1)
            if (r12 == 0) goto L_0x0171
            float r12 = r11.getTranslationY()
            int r13 = r11.getHeadersHeight()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x0189
            goto L_0x0029
        L_0x0171:
            float r12 = r11.getTranslationY()
            int r13 = r11.getHeadersHeight()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0189
            if (r6 == 0) goto L_0x0189
            int r12 = r0.getItemCount()
            if (r12 == 0) goto L_0x0189
            goto L_0x0029
        L_0x0189:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.RefreshLoadMoreLayout.mo82500y(boolean, java.lang.String):boolean");
    }

    /* renamed from: z */
    public final boolean mo82501z(boolean z, String str) {
        C87412m.m108594g(str, "invokeSource");
        if (this.f165625w == null || !this.f165622p0 || !this.f165620V) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (z) {
                return getTranslationY() > ((float) (-this.f165600A));
            }
            if (getTranslationY() < ((float) (-this.f165600A)) || ((LinearLayoutManager) layoutManager).mo17004z() != 0) {
                return false;
            }
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return false;
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f44890d];
            for (int i = 0; i < staggeredGridLayoutManager.f44890d; i++) {
                StaggeredGridLayoutManager.C16643c cVar = staggeredGridLayoutManager.f44891e[i];
                iArr[i] = StaggeredGridLayoutManager.this.f44897n ? cVar.mo17456h(cVar.f44936a.size() - 1, -1, true) : cVar.mo17456h(0, cVar.f44936a.size(), true);
            }
            boolean z2 = false;
            for (int i2 : iArr) {
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                return getTranslationY() > ((float) (-this.f165600A));
            }
            if (getTranslationY() < ((float) (-this.f165600A)) || !z2) {
                return false;
            }
        }
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        RecyclerView.C16613e adapter;
        if (i2 > 0 && (adapter = getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemRangeChanged(i, i2, obj);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:B#\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010;\u001a\u00020)¢\u0006\u0004\b9\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\"\u0010(\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\"\u00100\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/¨\u0006="}, mo182094d2 = {"Lcom/tencent/mm/view/RefreshLoadMoreLayout$StickTopLoadingLayout;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "d", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "getProgressBar", "()Lcom/tencent/mm/ui/widget/MMProcessBar;", "progressBar", "", "e", "F", "getTopLoadingOffsetLimit", "()F", "setTopLoadingOffsetLimit", "(F)V", "topLoadingOffsetLimit", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "g", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "getActionCallback", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "setActionCallback", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;)V", "actionCallback", "Lkotlin/Function1;", "Lrx3/b0;", "h", "Lfy3/l;", "getOnScrollCallback", "()Lfy3/l;", "setOnScrollCallback", "(Lfy3/l;)V", "onScrollCallback", "i", "getOffsetExtra", "setOffsetExtra", "offsetExtra", "j", "getHintHeight", "setHintHeight", "hintHeight", "", "n", "I", "getProgressBarPaddingBottom", "()I", "setProgressBarPaddingBottom", "(I)V", "progressBarPaddingBottom", "o", "getAlphaOffset", "setAlphaOffset", "alphaOffset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.view.RefreshLoadMoreLayout$StickTopLoadingLayout */
    public static final class StickTopLoadingLayout extends LinearLayout {

        /* renamed from: d */
        public final MMProcessBar f24937d;

        /* renamed from: e */
        public float f24938e = getContext().getResources().getDimension(C0966R.dimen.f3761db);

        /* renamed from: f */
        public boolean f24939f;

        /* renamed from: g */
        public C57879a f24940g;

        /* renamed from: h */
        public C32226l<? super Float, C13598b0> f24941h = C7082f.f24961d;

        /* renamed from: i */
        public float f24942i;

        /* renamed from: j */
        public float f24943j;

        /* renamed from: n */
        public int f24944n;

        /* renamed from: o */
        public int f24945o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StickTopLoadingLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C87412m.m108594g(context, "context");
            MMProcessBar mMProcessBar = new MMProcessBar(getContext());
            this.f24937d = mMProcessBar;
            setOrientation(1);
            setGravity(1);
            int dimension = (int) getResources().getDimension(C0966R.dimen.f3738cr);
            mMProcessBar.setBackgroundResource(C0966R.C0969drawable.f357317an2);
            addView(mMProcessBar, new LinearLayout.LayoutParams(dimension, dimension));
            mo8167b();
            setVisibility(0);
        }

        /* renamed from: a */
        public final void mo8166a(float f) {
            if (!this.f24939f) {
                float f2 = f - ((float) this.f24945o);
                float f3 = this.f24938e;
                float f4 = (f2 >= f3 ? f3 : f2) + this.f24942i;
                this.f24937d.setAlpha(f4 / f3);
                this.f24937d.setVisibility(0);
                this.f24937d.mo82301a(f2 / 6000.0f);
                if (f <= 0.0f) {
                    this.f24937d.setVisibility(4);
                    this.f24937d.mo82304d();
                }
                setTranslationY(f4 - ((float) this.f24944n));
                this.f24941h.invoke(Float.valueOf(getTranslationY()));
            }
        }

        /* renamed from: b */
        public final void mo8167b() {
            this.f24937d.setAlpha(1.0f);
            this.f24937d.setVisibility(4);
            this.f24937d.mo82304d();
            this.f24941h.invoke(Float.valueOf(this.f24943j));
            setTranslationY(0.0f);
        }

        public final C57879a getActionCallback() {
            return this.f24940g;
        }

        public final int getAlphaOffset() {
            return this.f24945o;
        }

        public final float getHintHeight() {
            return this.f24943j;
        }

        public final float getOffsetExtra() {
            return this.f24942i;
        }

        public final C32226l<Float, C13598b0> getOnScrollCallback() {
            return this.f24941h;
        }

        public final MMProcessBar getProgressBar() {
            return this.f24937d;
        }

        public final int getProgressBarPaddingBottom() {
            return this.f24944n;
        }

        public final float getTopLoadingOffsetLimit() {
            return this.f24938e;
        }

        public final void setActionCallback(C57879a aVar) {
            this.f24940g = aVar;
        }

        public final void setAlphaOffset(int i) {
            this.f24945o = i;
        }

        public final void setHintHeight(float f) {
            this.f24943j = f;
        }

        public final void setOffsetExtra(float f) {
            this.f24942i = f;
        }

        public final void setOnScrollCallback(C32226l<? super Float, C13598b0> lVar) {
            C87412m.m108594g(lVar, "<set-?>");
            this.f24941h = lVar;
        }

        public final void setProgressBarPaddingBottom(int i) {
            this.f24944n = i;
        }

        public final void setTopLoadingOffsetLimit(float f) {
            this.f24938e = f;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StickTopLoadingLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            C87412m.m108594g(context, "context");
            MMProcessBar mMProcessBar = new MMProcessBar(getContext());
            this.f24937d = mMProcessBar;
            setOrientation(1);
            setGravity(1);
            int dimension = (int) getResources().getDimension(C0966R.dimen.f3738cr);
            mMProcessBar.setBackgroundResource(C0966R.C0969drawable.f357317an2);
            addView(mMProcessBar, new LinearLayout.LayoutParams(dimension, dimension));
            mo8167b();
            setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshLoadMoreLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(attributeSet, "attrs");
        m66899x(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshLoadMoreLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(attributeSet, "attrs");
        m66899x(attributeSet);
    }
}
