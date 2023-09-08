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

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.c */
public final class C69007c extends C68998b.C68999a {

    /* renamed from: d */
    public final /* synthetic */ C68998b f198298d;

    /* renamed from: e */
    public final /* synthetic */ C68998b.C69000b f198299e;

    /* renamed from: f */
    public final /* synthetic */ ViewPropertyAnimator f198300f;

    /* renamed from: g */
    public final /* synthetic */ View f198301g;

    public C69007c(C68998b bVar, C68998b.C69000b bVar2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f198298d = bVar;
        this.f198299e = bVar2;
        this.f198300f = viewPropertyAnimator;
        this.f198301g = view;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animator");
        this.f198300f.setListener((Animator.AnimatorListener) null);
        View view = this.f198301g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f198301g.setTranslationX(0.0f);
        this.f198301g.setTranslationY(0.0f);
        this.f198298d.mo17319h(this.f198299e.f198277a);
        RecyclerView.C16631z zVar = this.f198299e.f198277a;
        if (zVar != null) {
            ArrayList<RecyclerView.C16631z> arrayList = this.f198298d.f198276r;
            C87412m.m108591d(zVar);
            arrayList.remove(zVar);
        }
        this.f198298d.mo94973F();
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animator");
        C68998b bVar = this.f198298d;
        RecyclerView.C16631z zVar = this.f198299e.f198277a;
        bVar.getClass();
    }
}
