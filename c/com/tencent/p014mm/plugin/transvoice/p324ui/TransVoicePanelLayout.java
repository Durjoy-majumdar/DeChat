package com.tencent.p014mm.plugin.transvoice.p324ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout */
public class TransVoicePanelLayout extends InputPanelFrameLayout {

    /* renamed from: f */
    public C71569a f207399f;

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout$a */
    public interface C71569a {
        /* renamed from: i0 */
        void mo98701i0(boolean z, int i);
    }

    public TransVoicePanelLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        super.mo1072i0(z, i);
        Log.m105919d("TransVoicePanelLayout", "isKeyboardShow: %s, keyboardHeight: %d.", Boolean.valueOf(z), Integer.valueOf(i));
        C71569a aVar = this.f207399f;
        if (aVar != null) {
            aVar.mo98701i0(z, i);
        }
    }

    public void setOnInputPanelChange(C71569a aVar) {
        this.f207399f = aVar;
    }

    public TransVoicePanelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
