package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.chatting.component.d3 */
public final class C73462d3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LoadableTextView f215870d;

    public C73462d3(LoadableTextView loadableTextView) {
        this.f215870d = loadableTextView;
    }

    public final void run() {
        if (this.f215870d.getText() != null) {
            CharSequence text = this.f215870d.getText();
            C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
            if (!(text.length() == 0)) {
                int lineCount = (this.f215870d.getLineCount() * this.f215870d.getLineHeight()) - ((this.f215870d.getHeight() - this.f215870d.getPaddingTop()) - this.f215870d.getPaddingBottom());
                if (lineCount > 0) {
                    LoadableTextView loadableTextView = this.f215870d;
                    loadableTextView.scrollBy(0, lineCount - loadableTextView.getScrollY());
                    return;
                }
                LoadableTextView loadableTextView2 = this.f215870d;
                loadableTextView2.scrollTo(loadableTextView2.getScrollX(), 0);
                return;
            }
        }
        this.f215870d.scrollTo(0, 0);
    }
}
