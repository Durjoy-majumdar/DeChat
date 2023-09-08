package com.tencent.p014mm.plugin.websearch.webview;

import android.content.Context;
import android.util.AttributeSet;
import js0.C46574u;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.websearch.webview.WebSearchWebView */
public class WebSearchWebView extends BaseWebSearchWebView {
    public WebSearchWebView(Context context) {
        super(context);
    }

    public String getUserAgentString() {
        return C46574u.m51897a(getContext(), getSettings().getUserAgentString(), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
    }

    public WebSearchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebSearchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
