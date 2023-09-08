package com.tencent.p014mm.p136ui.widget;

import android.view.animation.Animation;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

/* renamed from: com.tencent.mm.ui.widget.b */
public class C74970b implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ MMSwitchBtn.C74959c f220508a;

    /* renamed from: com.tencent.mm.ui.widget.b$a */
    public class C74971a implements Runnable {
        public C74971a() {
        }

        public void run() {
            MMSwitchBtn mMSwitchBtn = MMSwitchBtn.this;
            MMSwitchBtn.C7041b bVar = mMSwitchBtn.f220414I;
            if (bVar != null) {
                bVar.onStatusChange(mMSwitchBtn.f220433y);
            }
        }
    }

    public C74970b(MMSwitchBtn.C74959c cVar, MMSwitchBtn mMSwitchBtn) {
        this.f220508a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        MMSwitchBtn.C74959c cVar = this.f220508a;
        MMSwitchBtn mMSwitchBtn = MMSwitchBtn.this;
        boolean z = mMSwitchBtn.f220433y;
        int i = cVar.f220435d;
        boolean z2 = true;
        if (z != (i == 1)) {
            if (i != 1) {
                z2 = false;
            }
            mMSwitchBtn.f220433y = z2;
            mMSwitchBtn.post(new C74971a());
        }
        MMSwitchBtn.this.f220423o = false;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
