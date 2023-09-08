package com.tencent.p014mm.plugin.finder.shopping.view;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedDeque;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import np1.C61866i0;
import ok1.C62042e;
import org.libpag.PAGView;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp1.C13772k;
import sp1.C64074c;
import sp1.C64083d;
import sp1.C64085e;
import sp1.C64087f;
import sp1.C64098l;
import sp1.C64106n;
import sp1.C64116o;
import sp1.C64118p;
import sp1.C64120q;
import sp1.C64122r;
import sp1.C64124s;
import sx3.C110823p;
import te3.C48714ah2;
import te3.C64370fp1;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C66447b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003012B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u000bR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u000bR\u001d\u0010!\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u000bR\u001d\u0010$\u001a\u0004\u0018\u00010\b8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u000bR\u001b\u0010)\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010(¨\u00063"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView;", "Landroid/widget/FrameLayout;", "", "d", "Lrx3/g;", "getE_A", "()I", "E_A", "Landroid/animation/ObjectAnimator;", "w", "getBgEnterAlphaAnimator", "()Landroid/animation/ObjectAnimator;", "bgEnterAlphaAnimator", "", "x", "[I", "getSellDescTextSizeArray", "()[I", "sellDescTextSizeArray", "y", "getSellNumSizeArray", "sellNumSizeArray", "z", "getSellNumScalex1", "sellNumScalex1", "A", "getSellNumScaley1", "sellNumScaley1", "B", "getSellNumAlpha1", "sellNumAlpha1", "C", "getSellNumScalex2", "sellNumScalex2", "D", "getSellNumScaley2", "sellNumScaley2", "Landroid/animation/AnimatorSet;", "E", "getSellNumAnimatorSet", "()Landroid/animation/AnimatorSet;", "sellNumAnimatorSet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView */
public final class FinderLiveShopHotSellView extends FrameLayout {

    /* renamed from: I */
    public static final /* synthetic */ int f160927I = 0;

    /* renamed from: A */
    public final C13601g f160928A = C36568h.m40985a(new C64122r(this));

    /* renamed from: B */
    public final C13601g f160929B = C36568h.m40985a(new C64106n(this));

    /* renamed from: C */
    public final C13601g f160930C = C36568h.m40985a(new C64120q(this));

    /* renamed from: D */
    public final C13601g f160931D = C36568h.m40985a(new C64124s(this));

    /* renamed from: E */
    public final C13601g f160932E = C36568h.m40985a(new C64116o(this));

    /* renamed from: F */
    public final ConcurrentLinkedDeque<Integer> f160933F = new ConcurrentLinkedDeque<>();

    /* renamed from: G */
    public long f160934G;

    /* renamed from: H */
    public long f160935H;

    /* renamed from: d */
    public final C13601g f160936d = C36568h.m40985a(new C64074c(this));

    /* renamed from: e */
    public C64370fp1 f160937e;

    /* renamed from: f */
    public C0000n0 f160938f = C53930o0.m60555b();

    /* renamed from: g */
    public C53973z1 f160939g;

    /* renamed from: h */
    public View f160940h;

    /* renamed from: i */
    public PAGView f160941i;

    /* renamed from: j */
    public TextView f160942j;

    /* renamed from: n */
    public View f160943n;

    /* renamed from: o */
    public FinderLiveGiftTextView f160944o;

    /* renamed from: p */
    public C56311c f160945p;

    /* renamed from: q */
    public C56310b f160946q = new C56310b(0, 0, 0, 0, 0, 0, 63, (C8480h) null);

    /* renamed from: r */
    public C56309a f160947r;

    /* renamed from: s */
    public int f160948s;

    /* renamed from: t */
    public volatile int f160949t;

    /* renamed from: u */
    public int f160950u;

    /* renamed from: v */
    public boolean f160951v;

    /* renamed from: w */
    public final C13601g f160952w = C36568h.m40985a(new C64083d(this));

    /* renamed from: x */
    public final int[] f160953x = {12, 10, 8};

    /* renamed from: y */
    public final int[] f160954y = {12, 10};

    /* renamed from: z */
    public final C13601g f160955z = C36568h.m40985a(new C64118p(this));

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$a */
    public interface C56309a {
        /* renamed from: a */
        void mo78784a();
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b */
    public static final class C56310b {

        /* renamed from: a */
        public final int f160956a;

        /* renamed from: b */
        public final int f160957b;

        /* renamed from: c */
        public final int f160958c;

        /* renamed from: d */
        public final int f160959d;

        /* renamed from: e */
        public final int f160960e;

        /* renamed from: f */
        public final int f160961f;

        public C56310b() {
            this(0, 0, 0, 0, 0, 0, 63, (C8480h) null);
        }

        public C56310b(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
            i = (i7 & 1) != 0 ? 800 : i;
            i2 = (i7 & 2) != 0 ? 600 : i2;
            i3 = (i7 & 4) != 0 ? 1500 : i3;
            i4 = (i7 & 8) != 0 ? 300 : i4;
            i5 = (i7 & 16) != 0 ? 300 : i5;
            i6 = (i7 & 32) != 0 ? 800 : i6;
            this.f160956a = i;
            this.f160957b = i2;
            this.f160958c = i3;
            this.f160959d = i4;
            this.f160960e = i5;
            this.f160961f = i6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56310b)) {
                return false;
            }
            C56310b bVar = (C56310b) obj;
            return this.f160956a == bVar.f160956a && this.f160957b == bVar.f160957b && this.f160958c == bVar.f160958c && this.f160959d == bVar.f160959d && this.f160960e == bVar.f160960e && this.f160961f == bVar.f160961f;
        }

        public int hashCode() {
            return (((((((((this.f160956a * 31) + this.f160957b) * 31) + this.f160958c) * 31) + this.f160959d) * 31) + this.f160960e) * 31) + this.f160961f;
        }

        public String toString() {
            return "AnimConfig(bgEnterAnimDurMs=" + this.f160956a + ", descEnterDelayMs=" + this.f160957b + ", keepDurationMs=" + this.f160958c + ", transformDurMs=" + this.f160959d + ", tvDismissDurMs=" + this.f160960e + ", bgDismissDurMs=" + this.f160961f + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c */
    public static final class C56311c {

        /* renamed from: a */
        public final boolean f160962a;

        /* renamed from: b */
        public final C48714ah2 f160963b;

        /* renamed from: c */
        public final int f160964c;

        /* renamed from: d */
        public final int f160965d;

        public C56311c(boolean z, C48714ah2 ah22, int i, int i2) {
            C87412m.m108594g(ah22, "hotSellOptions");
            this.f160962a = z;
            this.f160963b = ah22;
            this.f160964c = i;
            this.f160965d = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56311c)) {
                return false;
            }
            C56311c cVar = (C56311c) obj;
            return this.f160962a == cVar.f160962a && C87412m.m108589b(this.f160963b, cVar.f160963b) && this.f160964c == cVar.f160964c && this.f160965d == cVar.f160965d;
        }

        public int hashCode() {
            boolean z = this.f160962a;
            if (z) {
                z = true;
            }
            return ((((((z ? 1 : 0) * true) + this.f160963b.hashCode()) * 31) + this.f160964c) * 31) + this.f160965d;
        }

        public String toString() {
            return "AnimContentConfig(showAnim=" + this.f160962a + ", hotSellOptions=" + this.f160963b + ", fromSell=" + this.f160964c + ", toSell=" + this.f160965d + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShopHotSellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m64529a(FinderLiveShopHotSellView finderLiveShopHotSellView, int i, int i2, boolean z, boolean z2) {
        finderLiveShopHotSellView.getClass();
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 6) {
                if (z2) {
                    finderLiveShopHotSellView.f160934G = System.currentTimeMillis();
                    finderLiveShopHotSellView.f160949t = i;
                    return;
                }
                Log.m105924i("FinderLiveShopHotSellView", '(' + finderLiveShopHotSellView.hashCode() + ")step" + finderLiveShopHotSellView.f160949t + " e:" + i2 + '-' + (System.currentTimeMillis() - finderLiveShopHotSellView.f160934G) + " result:" + z + '!');
            } else if (z2) {
                finderLiveShopHotSellView.f160934G = System.currentTimeMillis();
                finderLiveShopHotSellView.f160949t = i;
            } else {
                Log.m105924i("FinderLiveShopHotSellView", '(' + finderLiveShopHotSellView.hashCode() + ")step" + finderLiveShopHotSellView.f160949t + " e:" + i2 + '-' + (System.currentTimeMillis() - finderLiveShopHotSellView.f160934G) + " result:" + z + " total time" + (System.currentTimeMillis() - finderLiveShopHotSellView.f160935H) + '!');
            }
        } else if (z2) {
            Log.m105924i("FinderLiveShopHotSellView", '(' + finderLiveShopHotSellView.hashCode() + ")step" + finderLiveShopHotSellView.f160949t + " launchAnim!");
            long currentTimeMillis = System.currentTimeMillis();
            finderLiveShopHotSellView.f160934G = currentTimeMillis;
            finderLiveShopHotSellView.f160935H = currentTimeMillis;
            finderLiveShopHotSellView.f160949t = i;
        } else {
            Log.m105924i("FinderLiveShopHotSellView", '(' + finderLiveShopHotSellView.hashCode() + ")step" + finderLiveShopHotSellView.f160949t + " e:" + i2 + '-' + (System.currentTimeMillis() - finderLiveShopHotSellView.f160934G) + " result:" + z + '!');
        }
    }

    /* renamed from: b */
    public static final Object m64530b(FinderLiveShopHotSellView finderLiveShopHotSellView, C56310b bVar, C15601d dVar) {
        finderLiveShopHotSellView.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        View view = finderLiveShopHotSellView.f160943n;
        TextView textView = finderLiveShopHotSellView.f160942j;
        if (!(view == null || textView == null)) {
            view.postDelayed(new C64085e(textView, view, finderLiveShopHotSellView, bVar), (long) bVar.f160957b);
        }
        C8477a0 a0Var = new C8477a0();
        ObjectAnimator bgEnterAlphaAnimator = finderLiveShopHotSellView.getBgEnterAlphaAnimator();
        if (bgEnterAlphaAnimator != null) {
            bgEnterAlphaAnimator.addListener(new C64087f(finderLiveShopHotSellView, a0Var, hVar));
        }
        PAGView pAGView = finderLiveShopHotSellView.f160941i;
        if (pAGView != null) {
            pAGView.setVisibility(0);
            pAGView.play();
        }
        C62042e eVar = C62042e.f176370a;
        StringBuilder sb = new StringBuilder();
        sb.append("sellAnim?.visibility:");
        PAGView pAGView2 = finderLiveShopHotSellView.f160941i;
        Float f = null;
        sb.append(pAGView2 != null ? new Integer(pAGView2.getVisibility()) : null);
        sb.append(",playing:");
        PAGView pAGView3 = finderLiveShopHotSellView.f160941i;
        sb.append(pAGView3 != null ? Boolean.valueOf(pAGView3.isPlaying()) : null);
        sb.append(", pivot:");
        PAGView pAGView4 = finderLiveShopHotSellView.f160941i;
        sb.append(pAGView4 != null ? new Float(pAGView4.getPivotX()) : null);
        sb.append('-');
        PAGView pAGView5 = finderLiveShopHotSellView.f160941i;
        if (pAGView5 != null) {
            f = new Float(pAGView5.getPivotY());
        }
        sb.append(f);
        eVar.mo86998D1("FinderLiveShopHotSellView", sb.toString());
        ObjectAnimator bgEnterAlphaAnimator2 = finderLiveShopHotSellView.getBgEnterAlphaAnimator();
        if (bgEnterAlphaAnimator2 != null) {
            bgEnterAlphaAnimator2.start();
        }
        return hVar.mo90314b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64531c(com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r10, com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.C56310b r11, wx3.C15601d r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof sp1.C64089g
            if (r0 == 0) goto L_0x0016
            r0 = r12
            sp1.g r0 = (sp1.C64089g) r0
            int r1 = r0.f181718f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f181718f = r1
            goto L_0x001b
        L_0x0016:
            sp1.g r0 = new sp1.g
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.f181716d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181718f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00a6
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r12)
            android.view.View r12 = r10.f160943n
            android.widget.TextView r2 = r10.f160942j
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r4 = r10.f160944o
            org.libpag.PAGView r5 = r10.f160941i
            if (r12 == 0) goto L_0x009a
            if (r2 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x009a
            if (r5 == 0) goto L_0x009a
            android.view.ViewPropertyAnimator r6 = r12.animate()
            r7 = 0
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r8 = r10.f160946q
            int r8 = r8.f160960e
            long r8 = (long) r8
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r8)
            r6.start()
            android.view.ViewPropertyAnimator r6 = r12.animate()
            int r8 = r10.getE_A()
            float r8 = (float) r8
            android.view.ViewPropertyAnimator r6 = r6.translationY(r8)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r8 = r10.f160946q
            int r8 = r8.f160960e
            long r8 = (long) r8
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r8)
            sp1.h r8 = new sp1.h
            r8.<init>(r2, r4, r12)
            android.view.ViewPropertyAnimator r12 = r6.setListener(r8)
            r12.start()
            android.view.ViewPropertyAnimator r12 = r5.animate()
            android.view.ViewPropertyAnimator r12 = r12.alpha(r7)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b r10 = r10.f160946q
            int r10 = r10.f160961f
            long r6 = (long) r10
            android.view.ViewPropertyAnimator r10 = r12.setDuration(r6)
            sp1.i r12 = new sp1.i
            r12.<init>(r5)
            android.view.ViewPropertyAnimator r10 = r10.setListener(r12)
            r10.start()
        L_0x009a:
            int r10 = r11.f160961f
            long r10 = (long) r10
            r0.f181718f = r3
            java.lang.Object r10 = a14.C53965x0.m60607b(r10, r0)
            if (r10 != r1) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64531c(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView, com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$b, wx3.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final ObjectAnimator getBgEnterAlphaAnimator() {
        return (ObjectAnimator) ((C36570n) this.f160952w).getValue();
    }

    /* access modifiers changed from: private */
    public final int getE_A() {
        return ((Number) ((C36570n) this.f160936d).getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final ObjectAnimator getSellNumAlpha1() {
        return (ObjectAnimator) ((C36570n) this.f160929B).getValue();
    }

    private final AnimatorSet getSellNumAnimatorSet() {
        return (AnimatorSet) ((C36570n) this.f160932E).getValue();
    }

    /* access modifiers changed from: private */
    public final ObjectAnimator getSellNumScalex1() {
        return (ObjectAnimator) ((C36570n) this.f160955z).getValue();
    }

    /* access modifiers changed from: private */
    public final ObjectAnimator getSellNumScalex2() {
        return (ObjectAnimator) ((C36570n) this.f160930C).getValue();
    }

    /* access modifiers changed from: private */
    public final ObjectAnimator getSellNumScaley1() {
        return (ObjectAnimator) ((C36570n) this.f160928A).getValue();
    }

    /* access modifiers changed from: private */
    public final ObjectAnimator getSellNumScaley2() {
        return (ObjectAnimator) ((C36570n) this.f160931D).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r11.f160933F.isEmpty() != false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64539k(com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r11, com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.C56311c r12, wx3.C15601d r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof sp1.C64095j
            if (r0 == 0) goto L_0x0016
            r0 = r13
            sp1.j r0 = (sp1.C64095j) r0
            int r1 = r0.f181735g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f181735g = r1
            goto L_0x001b
        L_0x0016:
            sp1.j r0 = new sp1.j
            r0.<init>(r11, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f181733e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181735g
            java.lang.String r3 = "FinderLiveShopHotSellView"
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r11 = r0.f181732d
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r11 = (com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x007b
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r13)
            int r13 = r12.f160964c
            int r2 = r12.f160965d
            if (r13 != r2) goto L_0x0043
            goto L_0x0123
        L_0x0043:
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r13 = r11.f160933F
            r13.clear()
            ok1.e r5 = ok1.C62042e.f176370a
            int r6 = r12.f160964c
            int r7 = r12.f160965d
            r8 = 0
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r9 = r11.f160933F
            r10 = 20
            r5.mo87079g(r6, r7, r8, r9, r10)
            int r12 = r12.f160965d
            r11.f160950u = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "sellNumAnim queue:"
            r12.append(r13)
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r13 = r11.f160933F
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r12 = r11.f160933F
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x007b
            goto L_0x0123
        L_0x007b:
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r12 = r11.f160933F
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r4
            if (r12 == 0) goto L_0x0123
            java.lang.String r12 = "sellNumAnim"
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r13 = r11.f160933F
            java.lang.Object r13 = r13.poll()
            java.lang.String r2 = "sellNumQueue.poll()"
            gy3.C87412m.m108593f(r13, r2)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r0.f181732d = r11
            r0.f181735g = r4
            wx3.h r2 = new wx3.h
            wx3.d r5 = xx3.C66447b.m78392b(r0)
            r2.<init>(r5)
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r6 = r11.f160944o
            if (r6 == 0) goto L_0x010e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 120(0x78, float:1.68E-43)
            r7.append(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            java.lang.CharSequence r8 = r6.getText()
            java.lang.String r8 = r8.toString()
            boolean r8 = gy3.C87412m.m108589b(r8, r7)
            if (r8 != 0) goto L_0x0100
            ok1.e r8 = ok1.C62042e.f176370a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r12)
            java.lang.String r10 = " startSellNumAnim num:"
            r9.append(r10)
            r9.append(r13)
            java.lang.String r13 = r9.toString()
            r8.mo86998D1(r3, r13)
            r6.setText(r7)
            android.animation.ObjectAnimator r13 = r11.getSellNumAlpha1()
            if (r13 == 0) goto L_0x00f8
            sp1.t r6 = new sp1.t
            r6.<init>(r11, r5, r2, r12)
            r13.addListener(r6)
        L_0x00f8:
            android.animation.AnimatorSet r12 = r11.getSellNumAnimatorSet()
            r12.start()
            goto L_0x010b
        L_0x0100:
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Object r12 = kotlin.Result.m168114constructorimpl(r12)
            r2.resumeWith(r12)
        L_0x010b:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x010f
        L_0x010e:
            r12 = 0
        L_0x010f:
            if (r12 != 0) goto L_0x011c
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Object r12 = kotlin.Result.m168114constructorimpl(r12)
            r2.resumeWith(r12)
        L_0x011c:
            java.lang.Object r12 = r2.mo90314b()
            if (r12 != r1) goto L_0x007b
            goto L_0x0125
        L_0x0123:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64539k(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView, com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c, wx3.d):java.lang.Object");
    }

    /* renamed from: l */
    public static final Object m64540l(FinderLiveShopHotSellView finderLiveShopHotSellView, C56311c cVar, C56310b bVar, C15601d dVar) {
        int i;
        float f;
        boolean z;
        int i2;
        FinderLiveShopHotSellView finderLiveShopHotSellView2 = finderLiveShopHotSellView;
        finderLiveShopHotSellView.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        View view = finderLiveShopHotSellView2.f160943n;
        TextView textView = finderLiveShopHotSellView2.f160942j;
        FinderLiveGiftTextView finderLiveGiftTextView = finderLiveShopHotSellView2.f160944o;
        if (!(view == null || textView == null || finderLiveGiftTextView == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append('x');
            sb.append(cVar.f160964c);
            finderLiveGiftTextView.setText(sb.toString());
            float desiredWidth = finderLiveGiftTextView.getDesiredWidth();
            float desiredWidth2 = Layout.getDesiredWidth(textView.getText().toString(), textView.getPaint());
            float e_a = (((float) finderLiveShopHotSellView2.f160948s) - desiredWidth) - ((float) finderLiveShopHotSellView.getE_A());
            C61866i0 i0Var = C61866i0.f175909a;
            String string = textView.getContext().getResources().getString(C0966R.string.mbm);
            C87412m.m108593f(string, "_sellDesc.context.resour…inder_live_shopping_sell)");
            int[] iArr = finderLiveShopHotSellView2.f160953x;
            i0Var.getClass();
            C87412m.m108594g(iArr, "descendTextSizeDpList");
            float textSize = textView.getTextSize();
            String obj = textView.getText().toString();
            textView.setText(string);
            int i3 = 2;
            if (e_a <= 0.0f) {
                if (iArr.length == 0) {
                    i = C76577a.m92152c(textView.getContext(), (int) textSize);
                    f = Layout.getDesiredWidth(textView.getText().toString(), textView.getPaint());
                } else {
                    i = C110823p.m150988N(iArr);
                    textView.setTextSize(2, (float) i);
                    f = Layout.getDesiredWidth(textView.getText().toString(), textView.getPaint());
                }
            } else if (iArr.length == 0) {
                i = C76577a.m92152c(textView.getContext(), (int) textSize);
                f = Layout.getDesiredWidth(textView.getText().toString(), textView.getPaint());
            } else {
                int length = iArr.length;
                int i4 = 0;
                float f2 = 0.0f;
                while (true) {
                    if (i4 >= length) {
                        z = false;
                        i2 = 0;
                        break;
                    }
                    i2 = iArr[i4];
                    textView.setTextSize(i3, (float) i2);
                    f2 = Layout.getDesiredWidth(textView.getText().toString(), textView.getPaint());
                    if (f2 <= e_a) {
                        z = true;
                        break;
                    }
                    i4++;
                    i3 = 2;
                }
                i = !z ? C110823p.m150988N(iArr) : i2;
                f = f2;
            }
            textView.setTextSize(0, textSize);
            textView.setText(obj);
            Integer valueOf = Integer.valueOf(i);
            Float valueOf2 = Float.valueOf(f);
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = valueOf.intValue();
            float floatValue = valueOf2.floatValue();
            if (floatValue >= e_a) {
                if (((float) d0Var.f27483d) > ((float) finderLiveShopHotSellView2.f160954y[1])) {
                    Log.m105924i("FinderLiveShopHotSellView", "ori targetDescTextSizeDp:" + d0Var.f27483d);
                    int i5 = finderLiveShopHotSellView2.f160954y[1];
                    int[] iArr2 = finderLiveShopHotSellView2.f160953x;
                    int length2 = iArr2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            break;
                        }
                        int i7 = iArr2[i6];
                        if (i7 <= i5) {
                            i5 = i7;
                            break;
                        }
                        i6++;
                    }
                    d0Var.f27483d = i5;
                }
                finderLiveGiftTextView.setTextSize(2, (float) finderLiveShopHotSellView2.f160954y[1]);
            } else {
                finderLiveGiftTextView.setTextSize(2, (float) finderLiveShopHotSellView2.f160954y[0]);
            }
            Log.m105924i("FinderLiveShopHotSellView", "keepToTransferAnim rootWidth:" + finderLiveShopHotSellView2.f160948s + ",oriSellDescWidth:" + desiredWidth2 + ",targetSellDescWidth:" + floatValue + "(leftSpaceForDesc:" + e_a + "),sellNumWidth:" + desiredWidth + ", descTextSizeDp:" + d0Var.f27483d);
            finderLiveGiftTextView.setVisibility(0);
            finderLiveGiftTextView.setAlpha(0.0f);
            C58739j4.f168176a.mo83717l(view, (int) desiredWidth2, (int) (floatValue + desiredWidth), (long) bVar.f160959d, new C13772k(finderLiveGiftTextView, view, new C8477a0(), hVar, textView, d0Var));
        }
        return hVar.mo90314b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64541m(com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r8, long r9, long r11, wx3.C15601d r13) {
        /*
            r8.getClass()
            boolean r0 = r13 instanceof sp1.C64104m
            if (r0 == 0) goto L_0x0016
            r0 = r13
            sp1.m r0 = (sp1.C64104m) r0
            int r1 = r0.f181764i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f181764i = r1
            goto L_0x001b
        L_0x0016:
            sp1.m r0 = new sp1.m
            r0.<init>(r8, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f181762g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181764i
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            long r8 = r0.f181761f
            long r10 = r0.f181760e
            java.lang.Object r12 = r0.f181759d
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r12 = (com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x005a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r13)
        L_0x003d:
            boolean r13 = r8.f160951v
            if (r13 == 0) goto L_0x0047
            r9 = 0
            r8.f160951v = r9
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x0083
        L_0x0047:
            r0.f181759d = r8
            r0.f181760e = r11
            r0.f181761f = r9
            r0.f181764i = r3
            java.lang.Object r13 = a14.C53965x0.m60607b(r11, r0)
            if (r13 != r1) goto L_0x0056
            goto L_0x0083
        L_0x0056:
            r6 = r11
            r12 = r8
            r8 = r9
            r10 = r6
        L_0x005a:
            long r8 = r8 - r10
            ok1.e r13 = ok1.C62042e.f176370a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "observerSellNumChange timeLeft:"
            r2.append(r4)
            r2.append(r8)
            java.lang.String r4 = ",interval:"
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "FinderLiveShopHotSellView"
            r13.mo86998D1(r4, r2)
            r4 = 0
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0084
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x0083:
            return r1
        L_0x0084:
            r6 = r8
            r8 = r12
            r11 = r10
            r9 = r6
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64541m(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView, long, long, wx3.d):java.lang.Object");
    }

    /* renamed from: n */
    public static void m64542n(FinderLiveShopHotSellView finderLiveShopHotSellView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (z) {
            View view = finderLiveShopHotSellView.f160940h;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView", "hideAnim", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView", "hideAnim", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C53973z1 z1Var = finderLiveShopHotSellView.f160939g;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            finderLiveShopHotSellView.f160939g = null;
            StringBuilder sb = new StringBuilder();
            sb.append("hideAnim(");
            sb.append(finderLiveShopHotSellView.hashCode());
            sb.append("),source:");
            sb.append(i);
            sb.append(",product:");
            C64370fp1 fp12 = finderLiveShopHotSellView.f160937e;
            sb.append(fp12 != null ? fp12.f183177e : null);
            Log.m105924i("FinderLiveShopHotSellView", sb.toString());
            PAGView pAGView = finderLiveShopHotSellView.f160941i;
            if (pAGView != null) {
                pAGView.setVisibility(8);
            }
            PAGView pAGView2 = finderLiveShopHotSellView.f160941i;
            if (pAGView2 != null) {
                pAGView2.stop();
            }
            finderLiveShopHotSellView.f160949t = 0;
            C56309a aVar2 = finderLiveShopHotSellView.f160947r;
            if (aVar2 != null) {
                aVar2.mo78784a();
            }
            finderLiveShopHotSellView.f160947r = null;
            return;
        }
        finderLiveShopHotSellView.getClass();
    }

    public final int[] getSellDescTextSizeArray() {
        return this.f160953x;
    }

    public final int[] getSellNumSizeArray() {
        return this.f160954y;
    }

    /* renamed from: o */
    public final void mo78782o(int i) {
        Log.m105924i("FinderLiveShopHotSellView", "notifySellNumChange last sellNum:" + this.f160950u + ", new sellNum:" + i);
        if (i != this.f160950u) {
            this.f160951v = true;
        }
    }

    /* renamed from: p */
    public final void mo78783p(String str, C56311c cVar, C56310b bVar, C56309a aVar) {
        View view = this.f160940h;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView", "showAnim", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$AnimContentConfig;Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$AnimConfig;Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$AnimCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView", "showAnim", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$AnimContentConfig;Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$AnimConfig;Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$AnimCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f160945p = cVar;
        if (cVar.f160962a && bVar != null) {
            this.f160946q = bVar;
        }
        this.f160947r = aVar;
        PAGView pAGView = this.f160941i;
        if (pAGView != null) {
            pAGView.setPath(str);
        }
        PAGView pAGView2 = this.f160941i;
        if (pAGView2 != null) {
            pAGView2.setVisibility(0);
        }
        TextView textView = this.f160942j;
        if (textView != null) {
            textView.setTextSize(2, 14.0f);
        }
        TextView textView2 = this.f160942j;
        if (textView2 != null) {
            textView2.setText(getContext().getResources().getString(C0966R.string.mbn));
        }
        TextView textView3 = this.f160942j;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        FinderLiveGiftTextView finderLiveGiftTextView = this.f160944o;
        if (finderLiveGiftTextView != null) {
            finderLiveGiftTextView.setVisibility(8);
        }
        if (cVar.f160962a) {
            this.f160939g = C53895h.m60466d(this.f160938f, (C66212f) null, (C53934p0) null, new C64098l(this, cVar, (C15601d<? super C64098l>) null), 3, (Object) null);
        }
    }
}
