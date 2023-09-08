package f83;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.websearch.p898ui.WebSearchImageLoadingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import p158gt.C76051j;
import p158gt.C98201k;
import zt3.C119157j;

/* renamed from: f83.b */
public final class C97847b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f286999d;

    /* renamed from: e */
    public final /* synthetic */ WebSearchImageLoadingUI f287000e;

    /* renamed from: f83.b$a */
    public static final class C97848a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebSearchImageLoadingUI f287001d;

        public C97848a(WebSearchImageLoadingUI webSearchImageLoadingUI) {
            this.f287001d = webSearchImageLoadingUI;
        }

        public final void run() {
            WebSearchImageLoadingUI webSearchImageLoadingUI = this.f287001d;
            int i = WebSearchImageLoadingUI.f282836r;
            webSearchImageLoadingUI.showLoading();
        }
    }

    public C97847b(long j, WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f286999d = j;
        this.f287000e = webSearchImageLoadingUI;
    }

    public final void run() {
        Class cls = C98201k.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f286999d);
        WebSearchImageLoadingUI webSearchImageLoadingUI = this.f287000e;
        int i = WebSearchImageLoadingUI.f282836r;
        webSearchImageLoadingUI.getClass();
        boolean z = b002.mo108769t2() == 1 ? !b002.mo100972K3() : !b002.mo100972K3();
        Log.m105925i(this.f287000e.f282837d, "tryDownloadImage msgId: %s, msgSvrId: %s, talker: %s, canDownload: %b", Long.valueOf(this.f286999d), Long.valueOf(b002.mo108774y2()), b002.mo108768t(), Boolean.valueOf(z));
        if (z) {
            this.f287000e.f282842i = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(b002.mo108768t(), b002.mo108774y2()).f267374a;
            C76051j Jp0 = ((C98201k) C86312j.m106911c(cls)).Jp0();
            long j = this.f287000e.f282842i;
            long j2 = this.f286999d;
            if (((C92822e) Jp0).mo127100b(j, j2, 0, Long.valueOf(j2), C0966R.C0969drawable.by8, this.f287000e.f282846p, 0, true) != 0) {
                WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f287000e;
                webSearchImageLoadingUI2.getClass();
                ((C119157j) C119157j.f356862d).mo183895z(new C97845a(webSearchImageLoadingUI2));
                return;
            }
            WebSearchImageLoadingUI webSearchImageLoadingUI3 = this.f287000e;
            webSearchImageLoadingUI3.f282843j = true;
            ((C119157j) C119157j.f356862d).mo183895z(new C97848a(webSearchImageLoadingUI3));
        }
    }
}
