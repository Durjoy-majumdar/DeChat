package r83;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import com.tencent.p014mm.sdk.platformtools.SimpleObjectPool;
import q83.C101058l;
import t83.C48590l;

/* renamed from: r83.e */
public class C47951e {

    /* renamed from: a */
    public Context f128638a;

    /* renamed from: b */
    public C48590l f128639b;

    /* renamed from: c */
    public C101058l f128640c;

    /* renamed from: d */
    public SimpleObjectPool<FtsWebVideoView> f128641d = new SimpleObjectPool<>(3);

    /* renamed from: e */
    public C47953b f128642e;

    /* renamed from: r83.e$a */
    public interface C47952a {
        /* renamed from: a */
        void mo72717a();

        /* renamed from: b */
        void mo72718b();

        /* renamed from: c */
        void mo72719c();

        /* renamed from: d */
        void mo72720d();

        /* renamed from: e */
        void mo72721e();

        boolean onBackPressed();

        void onDestroy();
    }

    /* renamed from: r83.e$b */
    public interface C47953b {
    }

    public C47951e(Context context, MMWebView mMWebView, C47953b bVar) {
        this.f128638a = context;
        this.f128642e = bVar;
        this.f128640c = new C101058l(mMWebView, bVar);
    }
}
