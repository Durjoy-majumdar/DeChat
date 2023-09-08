package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.game.chatroom.view.C68998b;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.u */
public class C69011u extends C68998b {
    /* renamed from: C */
    public void mo94970C(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        ViewPropertyAnimator animate = zVar.f44854d.animate();
        animate.translationY(0.0f);
        animate.alpha(1.0f);
        animate.setDuration(this.f44807c);
        animate.setInterpolator(animate.getInterpolator());
        animate.setListener(new C68998b.C69001c(this, zVar));
        animate.setStartDelay(Math.abs((((long) zVar.mo17363j()) * this.f44807c) / ((long) 4)));
        animate.start();
    }

    /* renamed from: D */
    public void mo94971D(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        ViewPropertyAnimator animate = zVar.f44854d.animate();
        animate.translationY(((float) (-zVar.f44854d.getHeight())) * 0.25f);
        animate.alpha(0.0f);
        animate.setDuration(this.f44807c);
        animate.setInterpolator(animate.getInterpolator());
        animate.setListener(new C68998b.C69002d(this, zVar));
        animate.setStartDelay(Math.abs((((long) zVar.f44857g) * this.f44808d) / ((long) 4)));
        animate.start();
    }

    /* renamed from: I */
    public void mo94976I(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        View view = zVar.f44854d;
        view.setTranslationY(((float) (-view.getHeight())) * 0.25f);
        View view2 = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/FadeInDownAnimator", "preAnimateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/game/chatroom/view/FadeInDownAnimator", "preAnimateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
