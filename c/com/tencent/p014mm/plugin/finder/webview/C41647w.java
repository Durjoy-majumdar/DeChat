package com.tencent.p014mm.plugin.finder.webview;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.MMWebView;

/* renamed from: com.tencent.mm.plugin.finder.webview.w */
public interface C41647w {

    /* renamed from: com.tencent.mm.plugin.finder.webview.w$a */
    public static final class C41648a {
        /* renamed from: a */
        public static /* synthetic */ void m44995a(C41647w wVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                wVar.startLoadUrl(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoadUrl");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.w$b */
    public interface C41649b {
        /* renamed from: a */
        void mo64676a();

        /* renamed from: b */
        void mo64677b(boolean z, boolean z2, boolean z3);

        /* renamed from: c */
        void mo64678c();

        /* renamed from: d */
        void mo64679d();

        /* renamed from: e */
        void mo64680e();

        /* renamed from: f */
        void mo64681f(int i, Bundle bundle);

        /* renamed from: g */
        void mo64682g();
    }

    void addWebViewStateListener(C41649b bVar);

    MMWebView getWithInitWebView();

    void release();

    void reload();

    void startLoadUrl(String str, boolean z);
}
