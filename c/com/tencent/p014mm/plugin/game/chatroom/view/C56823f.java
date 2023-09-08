package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.TimeInterpolator;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.f */
public final class C56823f {
    /* renamed from: a */
    public static final void m65514a(View view) {
        C87412m.m108594g(view, "v");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimatorKt", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimatorKt", "clear", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
        view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
        view.animate().setInterpolator((TimeInterpolator) null).setStartDelay(0);
    }
}
