package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l2 */
public final /* synthetic */ class C6270l2 {
    /* renamed from: a */
    public static /* synthetic */ String m6559a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
