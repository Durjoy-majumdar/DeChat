package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.sdk.platformtools.Log;
import d93.C45297a;
import d93.C45298c;
import java.util.Map;
import te3.C52018xt1;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$c */
public class n$$c implements C45297a<C52018xt1> {

    /* renamed from: a */
    public final /* synthetic */ C43658n f117964a;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.n$$c$a */
    public class C43659a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f117965d;

        public C43659a(String str, String str2) {
            this.f117965d = str2;
        }

        public void run() {
            C43658n nVar = n$$c.this.f117964a;
            nVar.f148259i.f148245i.loadData(this.f117965d, "text/html", "utf-8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.n$$c$b */
    public class C43660b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f117967d;

        /* renamed from: e */
        public final /* synthetic */ String f117968e;

        /* renamed from: f */
        public final /* synthetic */ int f117969f;

        /* renamed from: g */
        public final /* synthetic */ int f117970g;

        public C43660b(int i, String str, int i2, int i3, String str2) {
            this.f117967d = i;
            this.f117968e = str;
            this.f117969f = i2;
            this.f117970g = i3;
        }

        public void run() {
            C43658n nVar = n$$c.this.f117964a;
            int i = this.f117967d;
            String str = this.f117968e;
            int i2 = this.f117969f;
            int i3 = this.f117970g;
            nVar.getClass();
            Log.m105925i("MicroMsg.LuggageMMWebPage", "onError, reason = %d, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            if ((i == 0 || i == 2 || i == 8 || i == 9) && !nVar.mo65778B(str)) {
                nVar.f117956y.setVisibility(0);
                nVar.mo65806x();
            }
        }
    }

    public n$$c(C43658n nVar) {
        this.f117964a = nVar;
    }

    /* renamed from: A */
    public void mo63661A(int i, String str, int i2, int i3, String str2) {
        C43658n nVar = this.f117964a;
        nVar.f117932T = false;
        nVar.mo67933N(new C43660b(i, str, i2, i3, str2));
    }

    /* renamed from: B */
    public void mo65764B(int i, String str) {
        this.f117964a.mo65780G(str);
    }

    /* renamed from: D */
    public void mo65765D(int i, String str) {
    }

    /* renamed from: j */
    public void mo63682j(int i, String str, String str2, Object obj) {
        C52018xt1 xt12 = (C52018xt1) obj;
        this.f117964a.f117932T = false;
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo65766k(int i, String str, Object obj) {
        C52018xt1 xt12 = (C52018xt1) obj;
        return false;
    }

    /* renamed from: l */
    public void mo65767l(int i, boolean z, String str, String str2, Object obj) {
        this.f117964a.f117932T = false;
        Map<String, String> f = C45298c.m50183f(((C52018xt1) obj).f144958x);
        if (z) {
            this.f117964a.mo65784K(str, str2, f);
        }
        this.f117964a.mo67933N(new C43575c0(this, str, str2, f));
    }

    /* renamed from: r */
    public void mo65768r(int i, String str, String str2) {
        C43658n nVar = this.f117964a;
        nVar.f117932T = false;
        nVar.mo67933N(new C43659a(str, str2));
    }
}
