package i13;

import android.animation.Animator;
import com.tencent.p014mm.plugin.transvoice.p324ui.LanguageChoiceLayout;

/* renamed from: i13.d */
public class C76257d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f223392d;

    /* renamed from: e */
    public final /* synthetic */ LanguageChoiceLayout f223393e;

    /* renamed from: i13.d$a */
    public class C76258a implements Runnable {
        public C76258a() {
        }

        public void run() {
            C76257d dVar = C76257d.this;
            dVar.f223393e.setSelectedLang(dVar.f223392d);
        }
    }

    public C76257d(LanguageChoiceLayout languageChoiceLayout, int i) {
        this.f223393e = languageChoiceLayout;
        this.f223392d = i;
    }

    public void run() {
        this.f223393e.f207391g.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).withEndAction(new C76258a()).start();
    }
}
