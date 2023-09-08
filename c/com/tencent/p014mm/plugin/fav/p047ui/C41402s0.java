package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.fav.ui.s0 */
public class C41402s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FavPostVoiceUI f111485d;

    public C41402s0(FavPostVoiceUI favPostVoiceUI) {
        this.f111485d = favPostVoiceUI;
    }

    public void run() {
        View findViewById = this.f111485d.findViewById(C0966R.C0970id.lb6);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view = this.f111485d.f269778v;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = this.f111485d.findViewById(C0966R.C0970id.cvz);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(findViewById2, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300);
        this.f111485d.f269778v.startAnimation(alphaAnimation);
        this.f111485d.findViewById(C0966R.C0970id.lb6).startAnimation(alphaAnimation);
        this.f111485d.findViewById(C0966R.C0970id.cvz).startAnimation(translateAnimation);
    }
}
