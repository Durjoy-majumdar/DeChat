package og1;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: og1.a */
public abstract class C62008a implements C62010c, C11411d {

    /* renamed from: d */
    public final View f176275d;

    /* renamed from: e */
    public final String f176276e = ("BaseLiveBubbleView_" + mo86887F0());

    /* renamed from: f */
    public final FrameBubbleContentLayout f176277f;

    public C62008a(View view, FrameBubbleContentLayout frameBubbleContentLayout) {
        C87412m.m108594g(view, "oriRootView");
        this.f176275d = view;
        this.f176277f = frameBubbleContentLayout;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.setSceneStateListener(this);
        }
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.setVisibility(8);
            frameBubbleContentLayout.mo77543d();
        }
    }

    /* renamed from: D */
    public void mo86885D(Bundle bundle) {
    }

    /* renamed from: E0 */
    public final <T extends View> T mo86886E0(int i) {
        View view = this.f176277f;
        if (view == null) {
            view = this.f176275d;
        }
        return view.findViewById(i);
    }

    /* renamed from: F0 */
    public abstract String mo86887F0();

    /* renamed from: G0 */
    public final int mo86888G0() {
        View view = this.f176277f;
        if (view == null) {
            view = this.f176275d;
        }
        return view.getVisibility();
    }

    /* renamed from: H0 */
    public final void mo86889H0() {
        Log.m105924i(this.f176276e, "requestBubbleHide");
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176277f;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.mo77541b();
        }
    }

    /* renamed from: Z */
    public Bundle mo86890Z() {
        return null;
    }

    /* renamed from: b */
    public final View mo86891b() {
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176277f;
        View childAt = frameBubbleContentLayout != null ? frameBubbleContentLayout.getChildAt(0) : null;
        return childAt == null ? this.f176275d : childAt;
    }

    /* renamed from: k0 */
    public void mo11421k0() {
        Log.m105924i(this.f176276e, "requestBubbleShow");
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176277f;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.mo77542c();
        }
    }

    /* renamed from: m0 */
    public void mo86892m0(Bundle bundle) {
    }

    /* renamed from: p */
    public void mo11422p() {
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176277f;
        if (frameBubbleContentLayout != null) {
            frameBubbleContentLayout.mo77543d();
        }
    }

    /* renamed from: v */
    public boolean mo86893v() {
        return true;
    }

    /* renamed from: x */
    public void mo86894x() {
    }

    /* renamed from: y */
    public Bundle mo86895y() {
        return null;
    }
}
