package com.tencent.p014mm.p136ui.widget.pulldown;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import gy3.C87412m;
import kotlin.Metadata;
import vo3.C111576j;
import vo3.C78461f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u00101\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$¨\u00068"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/pulldown/WeUIBounceViewV2;", "Lcom/tencent/mm/ui/widget/pulldown/NestedBounceView;", "Lvo3/f;", "Landroid/view/View;", "contentView", "Lrx3/b0;", "setView", "", "enabled", "setBounceEnabled", "", "color", "setStart2EndBgColor", "setEnd2StartBgColor", "setBgColor", "Landroid/graphics/drawable/Drawable;", "drawable", "setStart2EndBg", "setEnd2StartBg", "setStart2EndBgColorByActionBar", "setEnd2StartBgColorByNavigationBar", "setBg", "getView", "getOffset", "H", "Landroid/view/View;", "getMContentView", "()Landroid/view/View;", "setMContentView", "(Landroid/view/View;)V", "mContentView", "J", "Landroid/graphics/drawable/Drawable;", "getMStart2EndBg", "()Landroid/graphics/drawable/Drawable;", "setMStart2EndBg", "(Landroid/graphics/drawable/Drawable;)V", "mStart2EndBg", "K", "getMEnd2StartBg", "setMEnd2StartBg", "mEnd2StartBg", "L", "getMStart2EndBgByActionBar", "setMStart2EndBgByActionBar", "mStart2EndBgByActionBar", "M", "getMEnd2StartBgByNavigationBar", "setMEnd2StartBgByNavigationBar", "mEnd2StartBgByNavigationBar", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.pulldown.WeUIBounceViewV2 */
public class WeUIBounceViewV2 extends NestedBounceView implements C78461f {

    /* renamed from: G */
    public View f319716G;

    /* renamed from: H */
    public View f319717H;

    /* renamed from: I */
    public FrameLayout f319718I;

    /* renamed from: J */
    public Drawable f319719J;

    /* renamed from: K */
    public Drawable f319720K;

    /* renamed from: L */
    public Drawable f319721L = new ColorDrawable(0);

    /* renamed from: M */
    public Drawable f319722M = new ColorDrawable(0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeUIBounceViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        if (getMIsEnabled()) {
            return super.mo77716Z(view, view2, i, i2);
        }
        if (!C111576j.f334006j) {
            return false;
        }
        getMIsEnabled();
        return false;
    }

    /* renamed from: a */
    public void mo89642a(View view, int i) {
        if (i < 0) {
            if ((getMPullDownEnableFlag() & 2) == 0) {
                i = 0;
            }
            View view2 = this.f319716G;
            if (view2 != null) {
                Drawable drawable = this.f319720K;
                if (drawable == null) {
                    drawable = this.f319722M;
                }
                view2.setBackground(drawable);
            }
        } else if (i > 0) {
            if ((getMPullDownEnableFlag() & 1) == 0) {
                i = 0;
            }
            View view3 = this.f319716G;
            if (view3 != null) {
                Drawable drawable2 = this.f319719J;
                if (drawable2 == null) {
                    drawable2 = this.f319721L;
                }
                view3.setBackground(drawable2);
            }
        }
        if (C111576j.f334006j) {
            getMPullDownEnableFlag();
        }
        (C111576j.f334002f == 1 ? C111576j.f334004h : C111576j.f334003g).mo89642a(this.f319718I, i);
        mo154648h(i);
    }

    /* renamed from: b */
    public int mo89643b(View view) {
        return (C111576j.f334002f == 1 ? C111576j.f334004h : C111576j.f334003g).mo89643b(this.f319718I);
    }

    public final View getMContentView() {
        return this.f319717H;
    }

    public final Drawable getMEnd2StartBg() {
        return this.f319720K;
    }

    public final Drawable getMEnd2StartBgByNavigationBar() {
        return this.f319722M;
    }

    public final Drawable getMStart2EndBg() {
        return this.f319719J;
    }

    public final Drawable getMStart2EndBgByActionBar() {
        return this.f319721L;
    }

    public int getOffset() {
        return mo89643b((View) null);
    }

    public View getView() {
        return this;
    }

    public void setBg(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        setStart2EndBg(drawable);
        setEnd2StartBg(drawable);
    }

    public void setBgColor(int i) {
        setStart2EndBgColor(i);
        setEnd2StartBgColor(i);
    }

    public void setBounceEnabled(boolean z) {
        setMIsEnabled(z);
    }

    public void setEnd2StartBg(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        this.f319720K = drawable;
    }

    public void setEnd2StartBgColor(int i) {
        this.f319720K = new ColorDrawable(i);
    }

    public void setEnd2StartBgColorByNavigationBar(int i) {
        this.f319722M = new ColorDrawable(i);
    }

    public final void setMContentView(View view) {
        this.f319717H = view;
    }

    public final void setMEnd2StartBg(Drawable drawable) {
        this.f319720K = drawable;
    }

    public final void setMEnd2StartBgByNavigationBar(Drawable drawable) {
        C87412m.m108594g(drawable, "<set-?>");
        this.f319722M = drawable;
    }

    public final void setMStart2EndBg(Drawable drawable) {
        this.f319719J = drawable;
    }

    public final void setMStart2EndBgByActionBar(Drawable drawable) {
        C87412m.m108594g(drawable, "<set-?>");
        this.f319721L = drawable;
    }

    public void setStart2EndBg(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        this.f319719J = drawable;
    }

    public void setStart2EndBgColor(int i) {
        this.f319719J = new ColorDrawable(i);
    }

    public void setStart2EndBgColorByActionBar(int i) {
        this.f319721L = new ColorDrawable(i);
    }

    public void setView(View view) {
        this.f319717H = view;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f319718I = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
            boolean z = false;
            int i = valueOf == null || valueOf.intValue() == 0 ? -1 : layoutParams.width;
            Integer valueOf2 = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
            if (valueOf2 == null || valueOf2.intValue() == 0) {
                z = true;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, z ? -1 : layoutParams.height);
            FrameLayout frameLayout2 = this.f319718I;
            if (frameLayout2 != null) {
                frameLayout2.addView(view, layoutParams2);
            }
        }
        NestedScrollView nestedScrollView = new NestedScrollView(getContext(), (AttributeSet) null);
        nestedScrollView.setOverScrollMode(2);
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollView.addView((View) new LinearLayout(getContext()), new ViewGroup.LayoutParams(-1, -1));
        nestedScrollView.setImportantForAccessibility(2);
        this.f319716G = nestedScrollView;
        addView(nestedScrollView);
        addView(this.f319718I);
    }
}
