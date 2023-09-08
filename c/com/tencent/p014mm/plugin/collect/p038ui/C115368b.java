package com.tencent.p014mm.plugin.collect.p038ui;

import android.view.View;
import android.view.animation.Animation;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.collect.ui.b */
public class C115368b implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ CollectMainUI.C115332s f345766a;

    /* renamed from: b */
    public final /* synthetic */ CollectMainUI.C115333t f345767b;

    public C115368b(CollectMainUI.C115333t tVar, CollectMainUI.C115332s sVar) {
        this.f345767b = tVar;
        this.f345766a = sVar;
    }

    public void onAnimationEnd(Animation animation) {
        View view = CollectMainUI.this.f345570C;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105918d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animation end. TransId=" + this.f345766a.f349754e);
        int i = 0;
        while (true) {
            if (i >= ((LinkedList) CollectMainUI.this.f345585R).size()) {
                break;
            } else if (((CollectMainUI.C115332s) ((LinkedList) CollectMainUI.this.f345585R).get(i)).f349754e.equals(this.f345766a.f349754e)) {
                ((CollectMainUI.C115332s) ((LinkedList) CollectMainUI.this.f345585R).get(i)).f345665s = true;
                Log.m105918d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Update msg animation status. TransId=" + this.f345766a.f349754e);
                break;
            } else {
                i++;
            }
        }
        CollectMainUI.this.mo175107Z7();
        CollectMainUI.C115333t tVar = this.f345767b;
        tVar.f345666a = false;
        tVar.mo175124a();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
