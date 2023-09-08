package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputScrollView */
public class VoiceInputScrollView extends ScrollView {

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputScrollView$a */
    public interface C72738a {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    public VoiceInputScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void setOnScrollListener(C72738a aVar) {
    }

    public VoiceInputScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
