package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.game.chatroom.view.C68998b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.d */
public final class C69008d extends C68998b.C68999a {

    /* renamed from: d */
    public final /* synthetic */ C68998b f198302d;

    /* renamed from: e */
    public final /* synthetic */ C68998b.C69000b f198303e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f198304f;

    /* renamed from: g */
    public final /* synthetic */ View f198305g;

    public C69008d(C68998b bVar, C68998b.C69000b bVar2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f198302d = bVar;
        this.f198303e = bVar2;
        this.f198304f = viewPropertyAnimator;
        this.f198305g = view;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f198304f.setListener((Animator.AnimatorListener) null);
        View view = this.f198305g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f198305g.setTranslationX(0.0f);
        this.f198305g.setTranslationY(0.0f);
        this.f198302d.mo17319h(this.f198303e.f198278b);
        RecyclerView.C16631z zVar = this.f198303e.f198278b;
        if (zVar != null) {
            ArrayList<RecyclerView.C16631z> arrayList = this.f198302d.f198276r;
            C87412m.m108591d(zVar);
            arrayList.remove(zVar);
        }
        this.f198302d.mo94973F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        C68998b bVar = this.f198302d;
        RecyclerView.C16631z zVar = this.f198303e.f198278b;
        bVar.getClass();
    }
}
