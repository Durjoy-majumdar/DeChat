package com.tencent.p014mm.plugin.finder.webview.p800ad;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C87412m;
import kotlin.Metadata;
import zs1.C53804b;
import zs1.C53805c;
import zs1.C53812i;
import zs1.C53813j;
import zs1.C53814k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B#\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b&\u0010)R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/ExpandableScrollFrameLayout;", "Lcom/tencent/mm/plugin/finder/webview/ad/ScrollFrameLayout;", "", "z", "I", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeight", "Lzs1/k;", "A", "Lzs1/k;", "getScrollToTopListener", "()Lzs1/k;", "setScrollToTopListener", "(Lzs1/k;)V", "scrollToTopListener", "Lzs1/j;", "B", "Lzs1/j;", "getCurScrollHeightListener", "()Lzs1/j;", "setCurScrollHeightListener", "(Lzs1/j;)V", "curScrollHeightListener", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "C", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "getDrawerListener", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "setDrawerListener", "(Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "drawerListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout */
public final class ExpandableScrollFrameLayout extends ScrollFrameLayout {

    /* renamed from: A */
    public C53814k f112041A;

    /* renamed from: B */
    public C53813j f112042B;

    /* renamed from: C */
    public RecyclerViewDrawerSquares.C45117c f112043C;

    /* renamed from: y */
    public boolean f112044y;

    /* renamed from: z */
    public int f112045z;

    /* renamed from: com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout$a */
    public static final class C41622a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ExpandableScrollFrameLayout f112046d;

        public C41622a(ExpandableScrollFrameLayout expandableScrollFrameLayout) {
            this.f112046d = expandableScrollFrameLayout;
        }

        public final void run() {
            C53812i dialog = this.f112046d.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout$b */
    public static final class C41623b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ExpandableScrollFrameLayout f112047d;

        public C41623b(ExpandableScrollFrameLayout expandableScrollFrameLayout) {
            this.f112047d = expandableScrollFrameLayout;
        }

        public final void run() {
            C53812i dialog = this.f112047d.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpandableScrollFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: e */
    public void mo64801e() {
        RecyclerViewDrawerSquares.C45117c cVar;
        Log.m105924i("Finder.WebViewFrameLayout", "peekHeight + translationY:" + (((float) this.f112045z) - getTranslationY()));
        C53813j jVar = this.f112042B;
        if (jVar != null) {
            float translationY = ((float) this.f112045z) - getTranslationY();
            int i = this.f112045z;
            jVar.mo64750a(translationY, (float) i, ((float) i) + getScrollUpLimit());
        }
        float translationY2 = (((float) this.f112045z) - getTranslationY()) / ((float) this.f112045z);
        boolean z = true;
        if (translationY2 == 1.0f) {
            RecyclerViewDrawerSquares.C45117c cVar2 = this.f112043C;
            if (cVar2 != null) {
                cVar2.mo3766g(true, false, 0);
                return;
            }
            return;
        }
        if (translationY2 != 0.0f) {
            z = false;
        }
        if (z && (cVar = this.f112043C) != null) {
            cVar.mo3766g(false, false, 0);
        }
    }

    /* renamed from: f */
    public void mo64802f() {
        RecyclerViewDrawerSquares.C45117c cVar;
        float translationY = (((float) this.f112045z) - getTranslationY()) / ((float) this.f112045z);
        if (translationY == 1.0f) {
            RecyclerViewDrawerSquares.C45117c cVar2 = this.f112043C;
            if (cVar2 != null) {
                cVar2.mo3766g(false, true, 0);
                return;
            }
            return;
        }
        if ((translationY == 0.0f) && (cVar = this.f112043C) != null) {
            cVar.mo3766g(true, true, 0);
        }
    }

    /* renamed from: g */
    public void mo64803g(float f) {
        RecyclerViewDrawerSquares.C45117c cVar;
        float translationY = (((float) this.f112045z) - getTranslationY()) / ((float) this.f112045z);
        if (translationY <= 1.0f && (cVar = this.f112043C) != null) {
            cVar.mo9497e(((float) 1) - translationY);
        }
    }

    public final C53813j getCurScrollHeightListener() {
        return this.f112042B;
    }

    public final RecyclerViewDrawerSquares.C45117c getDrawerListener() {
        return this.f112043C;
    }

    public final int getPeekHeight() {
        return this.f112045z;
    }

    public final C53814k getScrollToTopListener() {
        return this.f112041A;
    }

    /* renamed from: h */
    public void mo64808h() {
        super.mo64808h();
        if (!this.f112044y) {
            setAllowVerticalIntercept(true);
        }
        setMPointerTranslateY(0.0f);
    }

    /* renamed from: i */
    public boolean mo64793i(float f, float f2, int i, int i2) {
        Log.m105924i("Finder.WebViewFrameLayout", "distanceY:" + f2 + " velocityY:" + i2);
        return Math.abs(f2) >= 10.0f && Math.abs(i2) > Math.abs(i) && Math.abs(f2) > Math.abs(f);
    }

    /* renamed from: j */
    public void mo64794j() {
        mo64810n();
        mo64808h();
    }

    /* renamed from: k */
    public void mo64795k() {
        mo64810n();
        mo64808h();
    }

    /* renamed from: l */
    public void mo64796l(float f) {
        float f2;
        RecyclerViewDrawerSquares.C45117c cVar;
        if (!this.f112044y) {
            if (getMPointerTranslateY() + f <= (-getScrollUpLimit())) {
                setMPointerTranslateY(-getScrollUpLimit());
            } else {
                setMPointerTranslateY(getMPointerTranslateY() + f);
            }
            f2 = getMPointerTranslateY();
        } else {
            if (getMPointerTranslateY() + f < 0.0f) {
                setMPointerTranslateY(0.0f);
            } else {
                setMPointerTranslateY(getMPointerTranslateY() + f);
            }
            f2 = (-getScrollUpLimit()) + getMPointerTranslateY();
        }
        setTranslationY(f2);
        float translationY = ((float) this.f112045z) - getTranslationY();
        Log.m105924i("Finder.WebViewFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f + " curHeight:" + translationY);
        C53813j jVar = this.f112042B;
        if (jVar != null) {
            int i = this.f112045z;
            jVar.mo64750a(translationY, (float) i, ((float) i) + getScrollUpLimit());
        }
        float translationY2 = (((float) this.f112045z) - getTranslationY()) / ((float) this.f112045z);
        if (translationY2 <= 1.0f && (cVar = this.f112043C) != null) {
            cVar.mo9497e(((float) 1) - translationY2);
        }
        Log.m105924i("Finder.WebViewFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f + " ratio:" + translationY2);
    }

    /* renamed from: m */
    public final void mo64809m() {
        if (this.f112044y) {
            mo64819c((float) this.f112045z, false, 300, new C41622a(this));
            return;
        }
        ScrollFrameLayout.m44967d(this, (float) this.f112045z, false, 0, new C41623b(this), 4, (Object) null);
    }

    /* renamed from: n */
    public final void mo64810n() {
        boolean z = this.f112044y;
        if (!z) {
            if (getMPointerTranslateY() < 0.0f) {
                float f = (float) 2;
                if (getMPointerTranslateY() > (-getScrollUpLimit()) / f) {
                    ScrollFrameLayout.m44967d(this, 0.0f, false, 0, (Runnable) null, 15, (Object) null);
                } else if (getMPointerTranslateY() <= (-getScrollUpLimit()) / f && getMPointerTranslateY() >= (-getScrollUpLimit())) {
                    ScrollFrameLayout.m44967d(this, -getScrollUpLimit(), false, 0, (Runnable) null, 14, (Object) null);
                    this.f112044y = true;
                    C53814k kVar = this.f112041A;
                    if (kVar != null) {
                        kVar.mo12776a();
                    }
                }
            } else if (getMPointerTranslateY() > getScrollDownLimit()) {
                ScrollFrameLayout.m44967d(this, (float) this.f112045z, false, 0, new C53804b(this), 6, (Object) null);
            } else {
                ScrollFrameLayout.m44967d(this, 0.0f, false, 0, (Runnable) null, 15, (Object) null);
            }
        } else if (z && getMPointerTranslateY() > 0.0f) {
            if (getMPointerTranslateY() < getScrollDownLimit()) {
                ScrollFrameLayout.m44967d(this, -getScrollUpLimit(), false, 0, (Runnable) null, 14, (Object) null);
                return;
            }
            ScrollFrameLayout.m44967d(this, (float) this.f112045z, false, 0, new C53805c(this), 6, (Object) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTranslationY((float) this.f112045z);
        ScrollFrameLayout.m44967d(this, 0.0f, false, 300, (Runnable) null, 8, (Object) null);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105924i("Finder.WebViewFrameLayout", "onDetachedFromWindow");
        RecyclerViewDrawerSquares.C45117c cVar = this.f112043C;
        if (cVar != null) {
            cVar.mo9498f();
        }
    }

    public final void setCurScrollHeightListener(C53813j jVar) {
        this.f112042B = jVar;
    }

    public final void setDrawerListener(RecyclerViewDrawerSquares.C45117c cVar) {
        this.f112043C = cVar;
    }

    public final void setPeekHeight(int i) {
        this.f112045z = i;
    }

    public final void setScrollToTopListener(C53814k kVar) {
        this.f112041A = kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setAllowVerticalIntercept(true);
    }
}
