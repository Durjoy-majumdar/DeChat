package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.DrawnCallBackLinearLayout;

/* renamed from: com.tencent.mm.ui.base.OnLayoutChangedLinearLayout */
public class OnLayoutChangedLinearLayout extends DrawnCallBackLinearLayout {

    /* renamed from: d */
    public C73214a f214982d;

    /* renamed from: com.tencent.mm.ui.base.OnLayoutChangedLinearLayout$a */
    public interface C73214a {
        /* renamed from: a */
        void mo101517a();
    }

    public OnLayoutChangedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C73214a aVar = this.f214982d;
        if (aVar != null) {
            aVar.mo101517a();
        }
    }

    public void setOnChattingLayoutChangedListener(C73214a aVar) {
        this.f214982d = aVar;
    }

    public OnLayoutChangedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
