package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.b1 */
public final class C72769b1 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212114d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f212115e;

    public C72769b1(C72852z0 z0Var, ViewPropertyAnimator viewPropertyAnimator) {
        this.f212114d = z0Var;
        this.f212115e = viewPropertyAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C72852z0 z0Var = this.f212114d;
        ChatFooterPanel chatFooterPanel = z0Var.f212317a.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibleChangeListener((ChatFooterPanel.C72718b) null);
        }
        z0Var.f212319c = false;
        View g = z0Var.mo100694g();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(g, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(g, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z0Var.f212318b.getSizeAnimController().mo91525a(false);
        Object value = ((C36570n) z0Var.f212332p).getValue();
        C87412m.m108593f(value, "<get-edtContainer>(...)");
        z0Var.mo100700m((LinearLayout) value);
        z0Var.f212318b.mo104257n().post(new C72794h1(z0Var));
        ChatFooterPanel chatFooterPanel2 = z0Var.f212317a.getChatFooterPanel();
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.mo100194g(false);
        }
        z0Var.f212317a.mo100395d1();
        SwipeBackLayout swipeBackLayout = z0Var.mo100690c().f193286j.getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(true);
        }
        z0Var.mo100701n();
        this.f212115e.setListener((Animator.AnimatorListener) null);
        this.f212114d.mo100693f().setTranslationY(0.0f);
        this.f212114d.mo100693f().setTranslationX(0.0f);
    }
}
