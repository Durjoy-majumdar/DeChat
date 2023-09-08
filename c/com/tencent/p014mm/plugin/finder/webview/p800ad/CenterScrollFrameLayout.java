package com.tencent.p014mm.plugin.finder.webview.p800ad;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import zs1.C53812i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/CenterScrollFrameLayout;", "Lcom/tencent/mm/plugin/finder/webview/ad/ScrollFrameLayout;", "", "y", "I", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout */
public final class CenterScrollFrameLayout extends ScrollFrameLayout {

    /* renamed from: y */
    public int f112039y;

    /* renamed from: com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout$a */
    public static final class C41621a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CenterScrollFrameLayout f112040d;

        public C41621a(CenterScrollFrameLayout centerScrollFrameLayout) {
            this.f112040d = centerScrollFrameLayout;
        }

        public final void run() {
            C53812i dialog = this.f112040d.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CenterScrollFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final int getPeekHeight() {
        return this.f112039y;
    }

    /* renamed from: i */
    public boolean mo64793i(float f, float f2, int i, int i2) {
        Log.m105924i("Finder.CenterScrollFrameLayout", "distanceY:" + f2 + " velocityY:" + i2);
        return f2 >= 10.0f && Math.abs(i2) > Math.abs(i) && Math.abs(f2) > Math.abs(f);
    }

    /* renamed from: j */
    public void mo64794j() {
        mo64797m();
        mo64808h();
    }

    /* renamed from: k */
    public void mo64795k() {
        mo64797m();
        mo64808h();
    }

    /* renamed from: l */
    public void mo64796l(float f) {
        if (getMPointerTranslateY() + f < 0.0f) {
            setMPointerTranslateY(0.0f);
        } else {
            setMPointerTranslateY(getMPointerTranslateY() + f);
        }
        setTranslationY(getMPointerTranslateY());
        Log.m105924i("Finder.CenterScrollFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f);
    }

    /* renamed from: m */
    public final void mo64797m() {
        if (getMPointerTranslateY() > getScrollDownLimit()) {
            ScrollFrameLayout.m44967d(this, (float) this.f112039y, false, 0, new C41621a(this), 6, (Object) null);
            return;
        }
        ScrollFrameLayout.m44967d(this, 0.0f, false, 0, (Runnable) null, 15, (Object) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTranslationY((float) this.f112039y);
        ScrollFrameLayout.m44967d(this, 0.0f, false, 300, (Runnable) null, 8, (Object) null);
    }

    public final void setPeekHeight(int i) {
        this.f112039y = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CenterScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setAllowVerticalIntercept(true);
        setScrollDownLimit(context.getResources().getDimension(C0966R.dimen.f3705bx));
    }
}
