package br3;

import android.view.animation.Animation;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;

/* renamed from: br3.b */
public class C67311b implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f193146a;

    /* renamed from: b */
    public final /* synthetic */ WcPayKeyboard f193147b;

    /* renamed from: br3.b$a */
    public class C67312a implements Runnable {
        public C67312a() {
        }

        public void run() {
            C67311b bVar = C67311b.this;
            if (!bVar.f193146a) {
                bVar.f193147b.f220911r.setVisibility(0);
                C67311b.this.f193147b.f220917x.setVisibility(4);
            }
        }
    }

    public C67311b(WcPayKeyboard wcPayKeyboard, boolean z) {
        this.f193147b = wcPayKeyboard;
        this.f193146a = z;
    }

    public void onAnimationEnd(Animation animation) {
        Log.m105918d("MicroMsg.WcPayKeyBoard", "keyboard anim end");
        this.f193147b.post(new C67312a());
        WcPayKeyboard wcPayKeyboard = this.f193147b;
        wcPayKeyboard.setWindowViewBottomMargin(wcPayKeyboard.f220916w.getHeight());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        Log.m105918d("MicroMsg.WcPayKeyBoard", "keyboard anim start");
        this.f193147b.f220916w.setVisibility(0);
        if (this.f193146a) {
            this.f193147b.f220911r.setVisibility(0);
        } else {
            this.f193147b.f220911r.setVisibility(4);
        }
    }
}
