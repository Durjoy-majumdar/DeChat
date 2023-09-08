package xi3;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import xi3.C78844a;

/* renamed from: xi3.l */
public class C78851l extends View.AccessibilityDelegate {

    /* renamed from: a */
    public boolean f231675a;

    public C78851l() {
        this.f231675a = false;
        this.f231675a = C78844a.C15689b.f42385a.mo108843i();
    }

    public void sendAccessibilityEvent(View view, int i) {
        C78844a aVar = C78844a.C15689b.f42385a;
        if (aVar.mo108842h(true)) {
            Log.m105925i("MicroMsg.MMSecureAccessibilityAndroidRDelegate", "shouldSpeakPassWord: %s, sendAccessibilityEvent eventType:%s", Boolean.valueOf(this.f231675a), Integer.valueOf(i));
            if (i == 32768) {
                super.sendAccessibilityEvent(view, i);
            } else if (!this.f231675a) {
                if (view == null) {
                    return;
                }
                if (i == 128 || i == 1) {
                    aVar.mo108841f(view);
                }
            } else if (view == null) {
            } else {
                if (i == 128 || i == 1) {
                    CharSequence charSequence = null;
                    if (view instanceof EditText) {
                        EditText editText = (EditText) view;
                        if (!Util.isNullOrNil((CharSequence) editText.getText())) {
                            charSequence = editText.getText();
                        } else if (!Util.isNullOrNil(editText.getContentDescription())) {
                            charSequence = editText.getContentDescription();
                        } else if (editText.getHint() != null) {
                            charSequence = editText.getHint();
                        }
                    } else {
                        charSequence = view instanceof TextView ? Util.isNullOrNil(view.getContentDescription()) ? ((TextView) view).getText() : view.getContentDescription() : view.getContentDescription();
                    }
                    if (!Util.isNullOrNil(charSequence)) {
                        aVar.mo108844j(view, charSequence.toString());
                    }
                }
            }
        }
    }
}
