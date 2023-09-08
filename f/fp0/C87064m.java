package fp0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;

/* renamed from: fp0.m */
public final class C87064m implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ View f252644d;

    /* renamed from: e */
    public final /* synthetic */ C87060l f252645e;

    public C87064m(View view, C87060l lVar) {
        this.f252644d = view;
        this.f252645e = lVar;
    }

    public boolean onPreDraw() {
        this.f252644d.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = this.f252644d;
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f252645e.getContext(), MMFragmentActivity$$c.f318644a);
        loadAnimation.setAnimationListener(new C87065n(this.f252645e));
        view.startAnimation(loadAnimation);
        return true;
    }
}
