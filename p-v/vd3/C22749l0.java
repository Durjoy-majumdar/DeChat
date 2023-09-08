package vd3;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vd3.l0 */
public class C22749l0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputUI f65451d;

    public C22749l0(VoiceInputUI voiceInputUI) {
        this.f65451d = voiceInputUI;
    }

    public void afterTextChanged(Editable editable) {
        Log.m105919d("VoiceInputUI", "afterTextChanged firstTextChange:%s,textChange:%s", Boolean.valueOf(this.f65451d.f55055p), Boolean.valueOf(this.f65451d.f55056q));
        VoiceInputUI voiceInputUI = this.f65451d;
        if (voiceInputUI.f55055p) {
            voiceInputUI.f55055p = false;
            return;
        }
        voiceInputUI.f55056q = true;
        voiceInputUI.f55046d.requestLayout();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
