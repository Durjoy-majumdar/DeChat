package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.c0 */
public final class C43748c0 {

    /* renamed from: a */
    public final LinkedList<String> f118216a = new LinkedList<>();

    /* renamed from: a */
    public void mo68055a(String str) {
        try {
            mo68056b(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewURLRouteList", "add exp = %s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: b */
    public final void mo68056b(String str) {
        if (!Util.isNullOrNil(str)) {
            synchronized (this.f118216a) {
                String peekLast = this.f118216a.peekLast();
                String encode = URLEncoder.encode(str);
                if (peekLast == null || !peekLast.equals(encode)) {
                    this.f118216a.addLast(encode);
                }
                if (this.f118216a.size() > 10) {
                    this.f118216a.removeFirst();
                }
            }
        }
    }

    /* renamed from: c */
    public String[] mo68057c() {
        String[] strArr;
        synchronized (this.f118216a) {
            strArr = new String[this.f118216a.size()];
            int i = 0;
            Iterator<String> it = this.f118216a.iterator();
            while (it.hasNext()) {
                strArr[i] = it.next();
                i++;
            }
        }
        return strArr;
    }
}
