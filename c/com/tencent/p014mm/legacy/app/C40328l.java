package com.tencent.p014mm.legacy.app;

import com.tencent.xweb.WebView;
import di3.C86312j;
import f93.C45767f;
import s00.C90110f;

/* renamed from: com.tencent.mm.legacy.app.l */
public class C40328l extends C80962f {

    /* renamed from: com.tencent.mm.legacy.app.l$a */
    public class C40329a implements WebView.PreInitCallback {
        public C40329a(C40328l lVar) {
        }

        public void onCoreInitFailed() {
        }

        public void onCoreInitFinished() {
            C45767f fVar = C45767f.f123649a;
            C45767f.f123653e = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo63021a() {
        ((C90110f) C86312j.m106911c(C90110f.class)).po0(WebView.sDefaultWebViewKind, new C40329a(this));
    }
}
