package com.tencent.p014mm.plugin.webview.model;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.model.C85541t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.view.TouchableLayout;
import di3.C86312j;
import gt0.C87330d0;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11184p0;
import ob0.C47350c;
import te3.C49502g20;
import te3.C49644h20;
import te3.C90437rw3;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.webview.model.v0 */
public final class C85549v0 implements C87330d0.C87333c {

    /* renamed from: a */
    public final /* synthetic */ C85541t0.C85542a f249320a;

    /* renamed from: b */
    public final /* synthetic */ C90437rw3 f249321b;

    /* renamed from: com.tencent.mm.plugin.webview.model.v0$a */
    public static final class C85550a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C85541t0.C85542a f249322d;

        public C85550a(C85541t0.C85542a aVar) {
            this.f249322d = aVar;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 1, 0, this.f249322d.f249291a.getResources().getString(C0966R.string.h7w));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.v0$b */
    public static final class C85551b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C85541t0.C85542a f249323d;

        /* renamed from: e */
        public final /* synthetic */ int f249324e;

        /* renamed from: f */
        public final /* synthetic */ C90437rw3 f249325f;

        /* renamed from: g */
        public final /* synthetic */ C87330d0.C87331a f249326g;

        /* renamed from: com.tencent.mm.plugin.webview.model.v0$b$a */
        public static final class C85552a implements C40324j.C40326a {

            /* renamed from: a */
            public final /* synthetic */ C85541t0.C85542a f249327a;

            /* renamed from: b */
            public final /* synthetic */ ArrayList<C87330d0.C87331a> f249328b;

            /* renamed from: c */
            public final /* synthetic */ C90437rw3 f249329c;

            /* renamed from: com.tencent.mm.plugin.webview.model.v0$b$a$a */
            public static final class C85553a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f249330d;

                /* renamed from: e */
                public final /* synthetic */ int f249331e;

                /* renamed from: f */
                public final /* synthetic */ C85541t0.C85542a f249332f;

                /* renamed from: g */
                public final /* synthetic */ ArrayList<C87330d0.C87331a> f249333g;

                /* renamed from: h */
                public final /* synthetic */ C90437rw3 f249334h;

                public C85553a(int i, int i2, C85541t0.C85542a aVar, ArrayList<C87330d0.C87331a> arrayList, C90437rw3 rw32) {
                    this.f249330d = i;
                    this.f249331e = i2;
                    this.f249332f = aVar;
                    this.f249333g = arrayList;
                    this.f249334h = rw32;
                }

                public final void run() {
                    if (this.f249330d == 0 && this.f249331e == 0) {
                        this.f249332f.f249296f.clear();
                        this.f249332f.f249296f.addAll(this.f249333g);
                        return;
                    }
                    C85541t0.C85542a aVar = this.f249332f;
                    aVar.mo118931a(this.f249334h, aVar.f249293c, aVar.f249296f, aVar.f249297g, aVar.f249298h);
                }
            }

            public C85552a(C85541t0.C85542a aVar, ArrayList<C87330d0.C87331a> arrayList, C90437rw3 rw32) {
                this.f249327a = aVar;
                this.f249328b = arrayList;
                this.f249329c = rw32;
            }

            /* renamed from: a */
            public final void mo288a(int i, int i2, String str, C47350c cVar) {
                MMHandlerThread.postToMainThread(new C85553a(i, i2, this.f249327a, this.f249328b, this.f249329c));
            }
        }

        public C85551b(C85541t0.C85542a aVar, int i, C90437rw3 rw32, C87330d0.C87331a aVar2) {
            this.f249323d = aVar;
            this.f249324e = i;
            this.f249325f = rw32;
            this.f249326g = aVar2;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            ArrayList arrayList = new ArrayList(this.f249323d.f249296f);
            arrayList.remove(this.f249324e);
            if (this.f249323d.f249296f.get(this.f249324e).f253109h == this.f249323d.f249299i) {
                ((C87330d0.C87331a) arrayList.get(0)).f253107f = true;
            }
            C85541t0.C85542a aVar = this.f249323d;
            aVar.mo118931a(this.f249325f, aVar.f249293c, arrayList, aVar.f249297g, aVar.f249298h);
            C85541t0.f249286a.getClass();
            String str = C85541t0.f249287b;
            Log.m105924i(str, "[[OauthDialog.showDialog] try delete avatarIdx = " + this.f249324e);
            C49502g20 g202 = new C49502g20();
            g202.f133797d = this.f249326g.f253109h;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = g202;
            bVar.f127067b = new C49644h20();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_delavatar";
            bVar.f127069d = 2700;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C85552a(this.f249323d, arrayList, this.f249325f));
        }
    }

    public C85549v0(C85541t0.C85542a aVar, C90437rw3 rw32) {
        this.f249320a = aVar;
        this.f249321b = rw32;
    }

    /* renamed from: a */
    public void mo114556a(View view, C87330d0.C87331a aVar, int i) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(aVar, "item");
        C78253a aVar2 = new C78253a(view.getContext());
        if (i != 0) {
            C85541t0.C85542a aVar3 = this.f249320a;
            C85550a aVar4 = new C85550a(aVar3);
            C85551b bVar = new C85551b(aVar3, i, this.f249321b, aVar);
            int i2 = TouchableLayout.f24959d;
            aVar2.mo108272g(view, i, 0, aVar4, bVar, TouchableLayout.f24959d, TouchableLayout.f24960e);
        }
    }
}
