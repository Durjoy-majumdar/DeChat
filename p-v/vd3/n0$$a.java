package vd3;

import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputUI;

public final /* synthetic */ class n0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputUI.C19483d.C19484a f65453d;

    public /* synthetic */ n0$$a(VoiceInputUI.C19483d.C19484a aVar) {
        this.f65453d = aVar;
    }

    public final void run() {
        VoiceInputUI.C19483d.C19484a aVar = this.f65453d;
        ((InputMethodManager) VoiceInputUI.this.getContext().getSystemService("input_method")).showSoftInput(VoiceInputUI.this.f55046d, 0);
    }
}
