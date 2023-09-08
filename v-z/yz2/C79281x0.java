package yz2;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.sdk.platformtools.Log;
import z04.C112550d0;

/* renamed from: yz2.x0 */
public final class C79281x0 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232730d;

    public C79281x0(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232730d = textStatusDoWhatActivityV2;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        Editable text;
        String obj;
        boolean z = true;
        Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "initCustomStatusView: actionId:%s", Integer.valueOf(i));
        if (i == 6) {
            MMEditText mMEditText = this.f232730d.f206794B;
            if (mMEditText == null || (text = mMEditText.getText()) == null || (obj = text.toString()) == null || (str = C112550d0.m153799i0(obj).toString()) == null) {
                str = "";
            }
            if (str.length() <= 0) {
                z = false;
            }
            if (z) {
                TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232730d;
                textStatusDoWhatActivityV2.getClass();
                textStatusDoWhatActivityV2.f206829h = str;
                TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f232730d;
                TextStatusDoWhatActivityV2.m83898H7(textStatusDoWhatActivityV22, textStatusDoWhatActivityV22.f206806N);
            }
        }
        return false;
    }
}
