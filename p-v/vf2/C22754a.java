package vf2;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vf2.a */
public class C22754a implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ FacingCreateChatRoomAllInOneUI f65462a;

    public C22754a(FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f65462a = facingCreateChatRoomAllInOneUI;
    }

    public void onAnimationEnd(Animation animation) {
        this.f65462a.f53201I.setVisibility(8);
        this.f65462a.f53225n.setVisibility(0);
        this.f65462a.f53196D.setVisibility(0);
        View view = this.f65462a.f53197E;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f65462a.f53194B;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f65462a.f53226o;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65462a.f53230r.setVisibility(8);
        this.f65462a.f53225n.clearAnimation();
        this.f65462a.f53196D.clearAnimation();
        this.f65462a.f53194B.clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        View view = this.f65462a.f53194B;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$13", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
