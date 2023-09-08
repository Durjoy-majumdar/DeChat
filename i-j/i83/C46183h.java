package i83;

import com.tencent.xweb.WebView;
import di3.C86312j;
import s00.C90110f;

/* renamed from: i83.h */
public class C46183h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebView.PreInitCallback f124485d;

    public C46183h(WebView.PreInitCallback preInitCallback) {
        this.f124485d = preInitCallback;
    }

    public void run() {
        ((C90110f) C86312j.m106911c(C90110f.class)).po0(WebView.sDefaultWebViewKind, this.f124485d);
    }
}
