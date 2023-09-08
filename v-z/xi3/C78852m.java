package xi3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import xi3.C78844a;

/* renamed from: xi3.m */
public class C78852m extends View.AccessibilityDelegate {

    /* renamed from: b */
    public static final /* synthetic */ int f231676b = 0;

    /* renamed from: a */
    public boolean f231677a;

    public C78852m() {
        this.f231677a = false;
        this.f231677a = C78844a.C15689b.f42385a.mo108843i();
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return true;
    }

    public void sendAccessibilityEvent(View view, int i) {
        C78844a aVar = C78844a.C15689b.f42385a;
        if (aVar.mo108842h(true)) {
            Log.m105925i("MicroMsg.MMSecureAccessibilityDelegate", "sendAccessibilityEvent shouldSpeakPassWord: %s, eventType: %s", Boolean.valueOf(this.f231677a), Integer.valueOf(i));
            if (!this.f231677a) {
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

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
    }
}
