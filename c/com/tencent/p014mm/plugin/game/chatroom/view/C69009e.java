package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.game.chatroom.view.C68998b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.e */
public final class C69009e extends C68998b.C68999a {

    /* renamed from: d */
    public final /* synthetic */ C68998b f198306d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f198307e;

    /* renamed from: f */
    public final /* synthetic */ int f198308f;

    /* renamed from: g */
    public final /* synthetic */ View f198309g;

    /* renamed from: h */
    public final /* synthetic */ int f198310h;

    /* renamed from: i */
    public final /* synthetic */ ViewPropertyAnimator f198311i;

    public C69009e(C68998b bVar, RecyclerView.C16631z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f198306d = bVar;
        this.f198307e = zVar;
        this.f198308f = i;
        this.f198309g = view;
        this.f198310h = i2;
        this.f198311i = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animator");
        if (this.f198308f != 0) {
            this.f198309g.setTranslationX(0.0f);
        }
        if (this.f198310h != 0) {
            this.f198309g.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f198311i.setListener((Animator.AnimatorListener) null);
        this.f198306d.mo91175w(this.f198307e);
        this.f198306d.f198274p.remove(this.f198307e);
        this.f198306d.mo94973F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f198306d.mo91178z(this.f198307e);
    }
}
