package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TopStoryEvent;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19391e;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19395l;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19396n;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19397o;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19398p;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C43261a;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C43271h;
import com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryViewPager;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import g83.C45897a;
import g83.C45898g;
import g83.C59379b;
import j20.C117292a;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import o03.C21723h;
import p03.C21912d;
import p03.C21914h;
import p03.C21915i;
import p156gj.C87200o;
import p156gj.C87203t;
import p167hz.C21031j;
import p167hz.C21032k;
import p646pn.C110234e;
import p996kj.C88155a;
import q03.C12026a;
import q20.C89449a;
import qe3.C89625d;
import qo3.C77389a;
import qo3.C77398g;
import s00.C90110f;
import t03.C22420e;
import t03.C22426h;
import te3.C49768hy;
import te3.jh4;
import te3.rh4;
import u73.C101982p;
import u73.C101987v0;
import u73.C22613h1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl */
public class TopStoryHomeUIComponentImpl implements C43255a {

    /* renamed from: A */
    public int f54492A = -1;

    /* renamed from: B */
    public int f54493B = -1;

    /* renamed from: C */
    public int f54494C = 0;

    /* renamed from: D */
    public boolean f54495D = false;

    /* renamed from: E */
    public Context f54496E;

    /* renamed from: F */
    public boolean f54497F = false;

    /* renamed from: G */
    public int f54498G = 0;

    /* renamed from: H */
    public boolean f54499H = true;

    /* renamed from: I */
    public boolean f54500I;

    /* renamed from: J */
    public boolean f54501J;

    /* renamed from: K */
    public boolean f54502K;

    /* renamed from: L */
    public IListener<TopStoryEvent> f54503L = new IListener<TopStoryEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1497615958;
        }

        public boolean callback(IEvent iEvent) {
            TopStoryEvent topStoryEvent = (TopStoryEvent) iEvent;
            int i = topStoryEvent.f310012d.f310014a;
            if (i == 1) {
                topStoryEvent.f310013e.f310015a = true;
            } else if (i == 2) {
                TopStoryHomeUIComponentImpl.this.f54506d.finish();
            } else if (i == 3) {
                topStoryEvent.f310013e.f310016b = TopStoryHomeUIComponentImpl.this.f54508f;
            } else if (i == 4) {
                TopStoryHomeUIComponentImpl.this.f54506d.finishAndRemoveTask();
            }
            return true;
        }
    };

    /* renamed from: M */
    public C21032k.C21033a f54504M = new C19327e();

    /* renamed from: N */
    public C29060q f54505N = new C19334f();

    /* renamed from: d */
    public MMActivity f54506d;

    /* renamed from: e */
    public boolean f54507e;

    /* renamed from: f */
    public jh4 f54508f;

    /* renamed from: g */
    public FrameLayout f54509g;

    /* renamed from: h */
    public C43263c f54510h;

    /* renamed from: i */
    public WebSearchWebView f54511i;

    /* renamed from: j */
    public C19391e f54512j;

    /* renamed from: n */
    public View f54513n;

    /* renamed from: o */
    public ThreeDotsLoadingView f54514o;

    /* renamed from: p */
    public View f54515p;

    /* renamed from: q */
    public List<C22426h.C22429c> f54516q = new ArrayList();

    /* renamed from: r */
    public View f54517r;

    /* renamed from: s */
    public int f54518s = 0;

    /* renamed from: t */
    public long f54519t = 0;

    /* renamed from: u */
    public boolean f54520u = false;

    /* renamed from: v */
    public boolean f54521v = false;

    /* renamed from: w */
    public LinearLayout f54522w;

    /* renamed from: x */
    public TopStoryViewPager f54523x;

    /* renamed from: y */
    public View f54524y;

    /* renamed from: z */
    public List<C19340m> f54525z = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$a */
    public class C19324a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f54526d;

        public C19324a(int i) {
            this.f54526d = i;
        }

        public void run() {
            int i = this.f54526d;
            TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = TopStoryHomeUIComponentImpl.this;
            int i2 = topStoryHomeUIComponentImpl.f54492A;
            if (i == i2) {
                ((C19340m) ((ArrayList) topStoryHomeUIComponentImpl.f54525z).get(i2)).f54556c.setVisibility(8);
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onH5RenderFinished hide fakeIv " + TopStoryHomeUIComponentImpl.this.f54492A);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$c */
    public class C19325c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f54528d;

        /* renamed from: e */
        public final /* synthetic */ int f54529e;

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$c$a */
        public class C19326a implements View.OnClickListener {
            public C19326a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$12$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                TopStoryHomeUIComponentImpl.this.mo24897d();
                C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$12$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C19325c(int i, int i2) {
            this.f54528d = i;
            this.f54529e = i2;
        }

        public void run() {
            Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "showNavBarShadow %s, %s", Integer.valueOf(this.f54528d), Integer.valueOf(this.f54529e));
            TopStoryHomeUIComponentImpl.this.f54515p.setBackgroundColor(this.f54528d + (this.f54529e * TPMediaCodecProfileLevel.HEVCMainTierLevel62));
            View view = TopStoryHomeUIComponentImpl.this.f54515p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = TopStoryHomeUIComponentImpl.this;
            topStoryHomeUIComponentImpl.f54520u = true;
            topStoryHomeUIComponentImpl.f54515p.setOnClickListener(new C19326a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e */
    public class C19327e implements C21032k.C21033a {

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e$a */
        public class C19328a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22426h.C22429c f54533d;

            /* renamed from: e */
            public final /* synthetic */ String f54534e;

            public C19328a(C19327e eVar, C22426h.C22429c cVar, String str) {
                this.f54533d = cVar;
                this.f54534e = str;
            }

            public void run() {
                this.f54533d.mo35580a(1, this.f54534e);
                ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33986F();
            }
        }

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e$b */
        public class C19329b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22426h.C22429c f54535d;

            /* renamed from: e */
            public final /* synthetic */ String f54536e;

            public C19329b(C19327e eVar, C22426h.C22429c cVar, String str) {
                this.f54535d = cVar;
                this.f54536e = str;
            }

            public void run() {
                this.f54535d.mo35580a(1, this.f54536e);
                ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33986F();
            }
        }

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e$c */
        public class C19330c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22426h.C22429c f54537d;

            /* renamed from: e */
            public final /* synthetic */ String f54538e;

            public C19330c(C19327e eVar, C22426h.C22429c cVar, String str) {
                this.f54537d = cVar;
                this.f54538e = str;
            }

            public void run() {
                this.f54537d.mo35580a(1, this.f54538e);
                ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33986F();
            }
        }

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e$d */
        public class C19331d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22426h.C22429c f54539d;

            /* renamed from: e */
            public final /* synthetic */ int f54540e;

            /* renamed from: f */
            public final /* synthetic */ String f54541f;

            public C19331d(C19327e eVar, C22426h.C22429c cVar, int i, String str) {
                this.f54539d = cVar;
                this.f54540e = i;
                this.f54541f = str;
            }

            public void run() {
                this.f54539d.mo35581b(this.f54540e, this.f54541f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e$e */
        public class C19332e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22426h.C22429c f54542d;

            public C19332e(C19327e eVar, C22426h.C22429c cVar) {
                this.f54542d = cVar;
            }

            public void run() {
                this.f54542d.mo35580a(0, "");
            }
        }

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$e$f */
        public class C19333f implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22426h.C22429c f54543d;

            public C19333f(C19327e eVar, C22426h.C22429c cVar) {
                this.f54543d = cVar;
            }

            public void run() {
                this.f54543d.mo35580a(0, "");
            }
        }

        public C19327e() {
        }

        /* renamed from: a */
        public boolean mo24922a(int i) {
            for (C22426h.C22429c next : TopStoryHomeUIComponentImpl.this.f54516q) {
                if (next != null && i == next.f63546b && next.f63548d > 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo24923b(rh4 rh4, int i) {
            Class cls = C21912d.class;
            String str = rh4.f64533d;
            long j = rh4.f64541o;
            int i2 = rh4.f64538i;
            C19391e eVar = TopStoryHomeUIComponentImpl.this.f54512j;
            if (eVar != null) {
                eVar.mo25068q(str, j, i2);
            }
            for (C22426h.C22429c next : TopStoryHomeUIComponentImpl.this.f54516q) {
                Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onNewRedDotReceived item.category:%s category:%s", Integer.valueOf(next.f63546b), Integer.valueOf(i));
                if (!TopStoryHomeUIComponentImpl.this.f54506d.isPaused() || !C22426h.m26106h()) {
                    if (C21914h.m25162j(next.f63546b) && C21914h.m25162j(i)) {
                        TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19328a(this, next, str));
                        if (!TopStoryHomeUIComponentImpl.this.f54521v && next.f63549e <= 0) {
                            C22613h1.m26484j(((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61498b, 107, 1, 0, 0, "");
                        }
                    }
                    if (C21914h.m25163k(next.f63546b) && C21914h.m25163k(i)) {
                        TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19329b(this, next, str));
                        if (!TopStoryHomeUIComponentImpl.this.f54521v && next.f63549e <= 0) {
                            C22613h1.m26484j(((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61497a, 107, 1, 0, 0, "");
                        }
                    }
                    if (C21914h.m25164l(next.f63546b) && C21914h.m25164l(i)) {
                        TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19330c(this, next, str));
                        if (!TopStoryHomeUIComponentImpl.this.f54521v && next.f63549e <= 0) {
                            C22613h1.m26484j(((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61499c, 107, 1, 0, 0, "");
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "proxyActivity is paused in MultiTask, does not clear finderMoreEntry timestamp");
                    return;
                }
            }
        }

        /* renamed from: c */
        public void mo24924c(int i, String str, String str2, int i2, int i3, String str3, boolean z) {
            C19391e eVar;
            if (z && (eVar = TopStoryHomeUIComponentImpl.this.f54512j) != null) {
                eVar.mo25065p(str, str2, i2, i3, i, str3);
            }
            for (C22426h.C22429c next : TopStoryHomeUIComponentImpl.this.f54516q) {
                if (C21914h.m25162j(next.f63546b)) {
                    TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19331d(this, next, i, str2));
                    if (i > 0 && !TopStoryHomeUIComponentImpl.this.f54521v) {
                        C22613h1.m26484j(((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo34004o(), 107, 2, next.f63549e, 0, "");
                        return;
                    }
                    return;
                }
            }
        }

        /* renamed from: d */
        public void mo24925d(long j) {
            for (C22426h.C22429c next : TopStoryHomeUIComponentImpl.this.f54516q) {
                if (C21914h.m25163k(next.f63546b)) {
                    TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19332e(this, next));
                    return;
                }
            }
        }

        /* renamed from: e */
        public void mo24926e(long j) {
            for (C22426h.C22429c next : TopStoryHomeUIComponentImpl.this.f54516q) {
                if (C21914h.m25164l(next.f63546b)) {
                    TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19333f(this, next));
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$f */
    public class C19334f extends C29060q.C29061a {
        public C19334f() {
        }

        public void onNetworkChange(int i) {
            try {
                C19391e eVar = TopStoryHomeUIComponentImpl.this.f54512j;
                eVar.getClass();
                MMHandlerThread.postToMainThread(new C19398p(eVar));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$g */
    public class C19335g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C19340m f54545d;

        /* renamed from: e */
        public final /* synthetic */ int f54546e;

        /* renamed from: f */
        public final /* synthetic */ C22426h.C22429c f54547f;

        /* renamed from: g */
        public final /* synthetic */ String f54548g;

        /* renamed from: h */
        public final /* synthetic */ boolean f54549h;

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$g$a */
        public class C19336a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f54551d;

            public C19336a(Bitmap bitmap) {
                this.f54551d = bitmap;
            }

            public void run() {
                Bitmap bitmap = this.f54551d;
                if (bitmap != null) {
                    C19335g.this.f54545d.f54556c.setImageBitmap(bitmap);
                } else {
                    C19335g gVar = C19335g.this;
                    gVar.f54545d.f54556c.setImageDrawable(TopStoryHomeUIComponentImpl.this.f54506d.getResources().getDrawable(C0966R.color.f2927a));
                    C19335g.this.f54545d.f54557d = 0;
                }
                C19335g.this.f54545d.f54556c.setVisibility(0);
                Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "layout %s,%s, fakeIv %s,%s", Integer.valueOf(C19335g.this.f54545d.f54555b.getWidth()), Integer.valueOf(C19335g.this.f54545d.f54555b.getHeight()), Integer.valueOf(C19335g.this.f54545d.f54556c.getWidth()), Integer.valueOf(C19335g.this.f54545d.f54556c.getHeight()));
                WebSearchWebView webSearchWebView = TopStoryHomeUIComponentImpl.this.f54511i;
                if (webSearchWebView != null) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "topStoryWebView %s,%s", Integer.valueOf(webSearchWebView.getWidth()), Integer.valueOf(TopStoryHomeUIComponentImpl.this.f54511i.getHeight()));
                }
                if (TopStoryHomeUIComponentImpl.this.f54524y.getParent() != null) {
                    ((ViewGroup) TopStoryHomeUIComponentImpl.this.f54524y.getParent()).removeView(TopStoryHomeUIComponentImpl.this.f54524y);
                    Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "remove view from:" + C19335g.this.f54546e);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = TopStoryHomeUIComponentImpl.this;
                ((C19340m) ((ArrayList) topStoryHomeUIComponentImpl.f54525z).get(topStoryHomeUIComponentImpl.f54492A)).f54555b.addView(TopStoryHomeUIComponentImpl.this.f54524y, layoutParams);
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "add view to:" + TopStoryHomeUIComponentImpl.this.f54492A);
                C19335g gVar2 = C19335g.this;
                C19391e eVar = TopStoryHomeUIComponentImpl.this.f54512j;
                C22426h.C22429c cVar = gVar2.f54547f;
                eVar.mo25079t(cVar.f63547c, cVar.f63548d, cVar.f63549e, gVar2.f54548g, gVar2.f54549h);
            }
        }

        public C19335g(C19340m mVar, int i, C22426h.C22429c cVar, String str, boolean z) {
            this.f54545d = mVar;
            this.f54546e = i;
            this.f54547f = cVar;
            this.f54548g = str;
            this.f54549h = z;
        }

        public void run() {
            Bitmap bitmap;
            TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = TopStoryHomeUIComponentImpl.this;
            WebSearchWebView webSearchWebView = topStoryHomeUIComponentImpl.f54511i;
            int width = this.f54545d.f54555b.getWidth();
            int height = this.f54545d.f54555b.getHeight();
            topStoryHomeUIComponentImpl.getClass();
            try {
                long c = C31543z5.m39453c();
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                webSearchWebView.drawCanvas(new Canvas(bitmap));
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "captureWebView success, cost:" + (C31543z5.m39453c() - c));
                C12026a.m11717a(true);
            } catch (Throwable th) {
                bitmap = null;
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", th, "captureWebView error", new Object[0]);
                C12026a.m11717a(false);
            }
            TopStoryHomeUIComponentImpl.this.f54506d.runOnUiThread(new C19336a(bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$h */
    public class C19337h implements C22420e.C22421a {
        public C19337h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$i */
    public class C19338i implements C1256g<IPCString> {
        public C19338i(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCString iPCString = (IPCString) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$j */
    public class C19339j implements C1256g<IPCString> {
        public C19339j(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCString iPCString = (IPCString) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$m */
    public static class C19340m {

        /* renamed from: a */
        public View f54554a;

        /* renamed from: b */
        public FrameLayout f54555b;

        /* renamed from: c */
        public ImageView f54556c;

        /* renamed from: d */
        public int f54557d = 0;
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$d */
    public class C19341d implements Runnable {
        public C19341d() {
        }

        public void run() {
            Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "hideNavBarShadow");
            View view = TopStoryHomeUIComponentImpl.this.f54515p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TopStoryHomeUIComponentImpl.this.f54520u = false;
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$k */
    public static class C19342k implements C1255d<IPCString, IPCString> {
        private C19342k() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            KVCommCrossProcessReceiver.f346932d = -1;
            Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "PushResetMaxCacheItemCountLimitTask, MaxCacheItemCountLimit = %s", Integer.valueOf(KVCommCrossProcessReceiver.f346932d));
            if (gVar != null) {
                gVar.mo894a(new IPCString());
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$l */
    public static class C19343l implements C1255d<IPCString, IPCString> {
        private C19343l() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            KVCommCrossProcessReceiver.f346932d = 50;
            Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "PushSetMaxItemCountLimitTask, MaxCacheItemCountLimit  = %s", Integer.valueOf(KVCommCrossProcessReceiver.f346932d));
            if (gVar != null) {
                gVar.mo894a(new IPCString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$b */
    public class C19344b implements Runnable {
        public C19344b() {
        }

        public void run() {
            TopStoryHomeUIComponentImpl.this.f54514o.mo119904f();
            View view = TopStoryHomeUIComponentImpl.this.f54513n;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TopStoryHomeUIComponentImpl.this.f54511i.setVisibility(0);
        }
    }

    public TopStoryHomeUIComponentImpl(MMActivity mMActivity, boolean z) {
        this.f54506d = mMActivity;
        this.f54507e = z;
    }

    /* renamed from: E1 */
    public void mo24891E1(int i, int i2) {
        C22613h1.m26478d("", 0, 0, i);
        String e = C101987v0.m134271e(i);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("topStoryScene", String.valueOf(this.f54508f.f64034i));
            hashMap.put(MJTextResolver.KEY_DEVICE_NAME, URLEncoder.encode(C89625d.f257838d, "utf8"));
            hashMap.put("deviceBrand", URLEncoder.encode(Build.BRAND, "utf8"));
            hashMap.put(ConstValue.INIT_CONFIG_KEY_DEVICE_MODEL, URLEncoder.encode(C87203t.m108275k(), "utf8"));
            hashMap.put("from", URLEncoder.encode(this.f54506d.getString(C0966R.string.k3m), "utf8"));
            hashMap.put("uin", C86709a0.m107523b().mo121111i());
            hashMap.put("timeZone", URLEncoder.encode("" + Util.getTimeZoneOffset(), "utf8"));
            hashMap.put("ostype", C87200o.f252872e);
            hashMap.put("subScene", "" + i2);
            hashMap.put("extInfo", ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo34011v());
            hashMap.put("needCameraIcon", "0");
        } catch (Exception unused) {
        }
        MMActivity mMActivity = this.f54506d;
        ((C101982p) C86312j.m106911c(C101982p.class)).mo6881ph(mMActivity, i, "", e, true, hashMap, mMActivity.getResources().getString(C0966R.string.k45), this.f54506d.getResources().getColor(C0966R.color.BW_93), true);
    }

    /* renamed from: J4 */
    public int mo24892J4() {
        return this.f54494C;
    }

    /* renamed from: R5 */
    public void mo24893R5() {
        this.f54500I = true;
    }

    /* renamed from: a */
    public synchronized void mo24894a(int i, boolean z) {
        boolean z2;
        TextView textView;
        Class cls = C21912d.class;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("changeView, from ");
            sb.append(z ? "viewpager" : "tab");
            sb.append(", mLastPos =");
            sb.append(this.f54493B);
            sb.append(", pos = ");
            sb.append(i);
            sb.append(", curpos = ");
            sb.append(this.f54492A);
            Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", sb.toString());
            if (i == this.f54492A) {
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "changeView return");
                return;
            }
            if (this.f54493B == -1) {
                if (i == 0) {
                    this.f54493B = 1;
                } else if (i == 1) {
                    this.f54493B = 0;
                } else if (i == 2) {
                    this.f54493B = 1;
                }
            }
            List<C19340m> list = this.f54525z;
            if (list == null || ((ArrayList) list).size() <= 1) {
                this.f54493B = 0;
            }
            int i2 = this.f54493B;
            this.f54492A = i;
            this.f54493B = i;
            C19340m mVar = (C19340m) ((ArrayList) this.f54525z).get(i2);
            if (this.f54524y.getParent() == ((C19340m) ((ArrayList) this.f54525z).get(i2)).f54555b) {
                if (mVar.f54557d <= 0) {
                    z2 = true;
                } else {
                    mVar.f54556c.setVisibility(0);
                    Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "changeView cacheworked");
                    z2 = false;
                }
                mVar.f54557d = 2;
            } else {
                mVar.f54556c.setVisibility(0);
                z2 = false;
            }
            C22426h.C22429c cVar = (C22426h.C22429c) ((ArrayList) this.f54516q).get(this.f54492A);
            this.f54499H = false;
            String str = "";
            if (C21914h.m25163k(cVar.f63546b) && cVar.f63548d > 0) {
                str = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61497a.f64533d;
            }
            String str2 = (!C21914h.m25164l(cVar.f63546b) || cVar.f63548d <= 0) ? str : ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61499c.f64533d;
            if (z2) {
                ((C119157j) C119157j.f356862d).mo183876g(new C19335g(mVar, i2, cVar, str2, z), "CaptureWebViewTask");
            } else {
                if (this.f54524y.getParent() != null) {
                    ((ViewGroup) this.f54524y.getParent()).removeView(this.f54524y);
                    Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "remove view from:" + i2);
                }
                ((C19340m) ((ArrayList) this.f54525z).get(this.f54492A)).f54555b.addView(this.f54524y, new FrameLayout.LayoutParams(-1, -1));
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "add view to:" + this.f54492A);
                this.f54512j.mo25079t(cVar.f63547c, cVar.f63548d, cVar.f63549e, str2, z);
            }
            C22613h1.m26486l(cVar.f63546b, this.f54518s, Util.isNullOrNil(cVar.f63551g) ? cVar.f63550f : cVar.f63551g, this.f54508f.f64029d, z);
            Iterator it = ((ArrayList) this.f54516q).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C22426h.C22429c cVar2 = (C22426h.C22429c) it.next();
                if (!(cVar2 == null || (textView = cVar2.f63554j) == null)) {
                    textView.setTypeface((Typeface) null, i == i3 ? 1 : 0);
                }
                i3++;
            }
        }
    }

    /* renamed from: b */
    public final void mo24895b(String str, long j) {
        View view = this.f54517r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "exposeUserProfileRedDot", "(Ljava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "exposeUserProfileRedDot", "(Ljava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rh4 rh4 = new rh4();
        rh4.f64533d = str;
        rh4.f64541o = j;
        C22613h1.m26484j(rh4, 107, 5, 0, 0, "");
    }

    /* renamed from: b2 */
    public void mo24896b2(String str) {
        C19391e eVar = this.f54512j;
        eVar.getClass();
        MMHandlerThread.postToMainThread(new C19397o(eVar, str));
    }

    /* renamed from: c */
    public C45897a mo9283c() {
        return this.f54510h;
    }

    /* renamed from: d */
    public final void mo24897d() {
        C19391e eVar = this.f54512j;
        if (eVar != null) {
            eVar.getClass();
            MMHandlerThread.postToMainThread(new C43271h(eVar));
            mo24911m3();
        }
    }

    /* renamed from: e */
    public boolean mo24898e() {
        if (this.f54520u) {
            mo24897d();
            return true;
        }
        if (this.f54501J) {
            C21915i.m25174f(this.f54508f, "uiBackBtnClick", C31543z5.m39453c());
        } else if (!this.f54500I) {
            C21915i.m25174f(this.f54508f, "uiBackBtnClickWithoutGetSearchData", C31543z5.m39453c());
        } else if (this.f54502K) {
            C21915i.m25174f(this.f54508f, "uiBackBtnClickWithoutH5Ready", C31543z5.m39453c());
        } else {
            C21915i.m25174f(this.f54508f, "uiBackBtnClickWithoutDataReady", C31543z5.m39453c());
        }
        C22613h1.m26480f(19);
        if (C22426h.m26106h()) {
            MMActivity mMActivity = this.f54506d;
            if (mMActivity instanceof TopStoryHomeAffinityUI) {
                mMActivity.moveTaskToBack(true);
                this.f54506d.overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
                return true;
            }
        }
        if (this.f54507e) {
            this.f54506d.finish();
        } else {
            this.f54506d.moveTaskToBack(true);
        }
        return true;
    }

    /* renamed from: f */
    public void mo24899f(Bundle bundle) {
        String str;
        Bundle bundleExtra;
        int i;
        int i2;
        Bundle bundle2 = bundle;
        Class cls = C22420e.class;
        Class cls2 = C21912d.class;
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onCreate");
        mo24910m(50);
        MMActivity mMActivity = this.f54506d;
        this.f54496E = mMActivity;
        mMActivity.getSupportActionBar().mo91104o();
        this.f54497F = C43471q.m46983g(1).mo71055b();
        jh4 jh4 = new jh4();
        this.f54508f = jh4;
        try {
            jh4.parseFrom(this.f54506d.getIntent().getByteArrayExtra("key_context"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e, "initData use intent", new Object[0]);
            if (bundle2 != null) {
                try {
                    this.f54508f.parseFrom(bundle2.getByteArray("key_context"));
                } catch (IOException e2) {
                    Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e2, "initData use savedInstanceState", new Object[0]);
                }
            }
        }
        this.f54498G = this.f54506d.getIntent().getIntExtra("key_navbarbgcolortype", 0);
        if (!Util.isNullOrNil(this.f54508f.f64038p)) {
            Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "Create HomeContext Success %s", this.f54508f.f64038p);
        } else {
            Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "Create HomeContext Fail");
            this.f54506d.finish();
        }
        if (this.f54506d.getIntent().getBooleanExtra("key_isfromhomepage", false)) {
            this.f54516q = C22426h.m26104f();
        }
        if (!((ArrayList) this.f54516q).isEmpty()) {
            ((C21723h) ((C21912d) C86312j.m106911c(cls2)).mo34966t4()).f61501e = this.f54504M;
        }
        int i3 = 2;
        Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "Create HomeContext tabItems size = %s, isSupportVideoTab = %s", Integer.valueOf(((ArrayList) this.f54516q).size()), Boolean.valueOf(this.f54497F));
        this.f54503L.alive();
        C86709a0.m107529k().mo121126a(this.f54505N);
        ((C22420e) C86312j.m106911c(cls)).mo35573Dp(new C19337h());
        C22613h1.m26480f(17);
        View inflate = LayoutInflater.from(this.f54506d).inflate(C0966R.C0971layout.cae, (ViewGroup) null);
        this.f54524y = inflate;
        this.f54509g = (FrameLayout) inflate.findViewById(C0966R.C0970id.lm9);
        if (((C22420e) C86312j.m106911c(cls)).T60() != null) {
            if (!((C22420e) C86312j.m106911c(cls)).T60().f117062e) {
                ((C22420e) C86312j.m106911c(cls)).T60().mo67495c(this.f54508f, true, (LinkedList<C49768hy>) null);
            }
            ((C22420e) C86312j.m106911c(cls)).T60().mo67494b(this);
        } else {
            C43259y yVar = new C43259y();
            yVar.mo67495c(this.f54508f, true, (LinkedList<C49768hy>) null);
            yVar.mo67494b(this);
        }
        this.f54511i.mo70470f(this.f54506d);
        this.f54513n = this.f54524y.findViewById(C0966R.C0970id.jzl);
        this.f54514o = (ThreeDotsLoadingView) this.f54524y.findViewById(C0966R.C0970id.g3t);
        if (!MIUI.isMIUIV8() && !C85875k4.m106211z()) {
            this.f54506d.supportLightStatusBar();
        }
        TextView textView = (TextView) this.f54506d.findViewById(C0966R.C0970id.khk);
        View findViewById = this.f54506d.findViewById(C0966R.C0970id.f5470g0);
        View findViewById2 = this.f54506d.findViewById(C0966R.C0970id.f359408ks0);
        this.f54517r = this.f54506d.findViewById(C0966R.C0970id.fdl);
        View findViewById3 = this.f54506d.findViewById(C0966R.C0970id.krv);
        this.f54515p = this.f54506d.findViewById(C0966R.C0970id.kru);
        this.f54523x = (TopStoryViewPager) this.f54506d.findViewById(C0966R.C0970id.kry);
        this.f54522w = (LinearLayout) this.f54506d.findViewById(C0966R.C0970id.krw);
        if (!((ArrayList) this.f54516q).isEmpty()) {
            int intExtra = this.f54506d.getIntent().getIntExtra("key_chosetab", 0);
            TabLayout tabLayout = (TabLayout) this.f54506d.findViewById(C0966R.C0970id.kci);
            Iterator it = ((ArrayList) this.f54516q).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                C22426h.C22429c cVar = (C22426h.C22429c) it.next();
                if (this.f54497F || !C21914h.m25164l(cVar.f63546b)) {
                    i4++;
                }
            }
            Iterator it4 = ((ArrayList) this.f54516q).iterator();
            while (it4.hasNext()) {
                C22426h.C22429c cVar2 = (C22426h.C22429c) it4.next();
                if (this.f54497F || !C21914h.m25164l(cVar2.f63546b)) {
                    TabLayout.C55061f l = tabLayout.mo146908l();
                    cVar2.f63552h = l;
                    l.mo76122c(C0966R.C0971layout.cad);
                    cVar2.f63553i = cVar2.f63552h.f154605f.findViewById(C0966R.C0970id.krx);
                    cVar2.f63554j = (TextView) cVar2.f63552h.f154605f.findViewById(C0966R.C0970id.kyb);
                    cVar2.f63555k = (TextView) cVar2.f63552h.f154605f.findViewById(C0966R.C0970id.kya);
                    cVar2.f63556l = cVar2.f63552h.f154605f.findViewById(C0966R.C0970id.iix);
                    cVar2.f63557m = cVar2.f63552h.f154605f.findViewById(C0966R.C0970id.fdk);
                    cVar2.f63554j.setText(cVar2.f63545a);
                    if (i4 == i3) {
                        i2 = i4;
                        cVar2.f63553i.setPadding((int) this.f54496E.getResources().getDimension(C0966R.dimen.arc), cVar2.f63553i.getPaddingTop(), (int) this.f54496E.getResources().getDimension(C0966R.dimen.arc), cVar2.f63553i.getPaddingBottom());
                    } else {
                        i2 = i4;
                        cVar2.f63553i.setPadding((int) this.f54496E.getResources().getDimension(C0966R.dimen.arf), cVar2.f63553i.getPaddingTop(), (int) this.f54496E.getResources().getDimension(C0966R.dimen.arf), cVar2.f63553i.getPaddingBottom());
                    }
                    if (!C44706b.m49450a()) {
                        C44706b.m49451b(cVar2.f63554j, C0966R.dimen.f3879hn);
                        C44706b.m49451b(cVar2.f63555k, C0966R.dimen.f3962lk);
                    } else {
                        C44706b.m49451b(cVar2.f63554j, C0966R.dimen.f3879hn);
                        C44706b.m49451b(cVar2.f63555k, C0966R.dimen.f3962lk);
                        cVar2.f63557m.getLayoutParams().width = (int) this.f54506d.getResources().getDimension(C0966R.dimen.f3640y);
                        cVar2.f63557m.getLayoutParams().height = (int) this.f54506d.getResources().getDimension(C0966R.dimen.f3640y);
                    }
                    if (cVar2.f63549e > 0) {
                        String str2 = "" + cVar2.f63549e;
                        if (cVar2.f63549e > 99) {
                            str2 = "99+";
                        }
                        cVar2.f63555k.setText(str2);
                        cVar2.f63555k.setVisibility(0);
                        View view = cVar2.f63557m;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initTabLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initTabLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else if (cVar2.f63548d > 0) {
                        cVar2.f63555k.setText("");
                        cVar2.f63555k.setVisibility(8);
                        View view3 = cVar2.f63557m;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initTabLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initTabLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    tabLayout.mo146889d(cVar2.f63552h, false);
                    cVar2.mo35582c(cVar2);
                    i4 = i2;
                    i3 = 2;
                }
            }
            tabLayout.mo146882a(new C19351l(this));
            this.f54523x.setVisibility(0);
            for (int i5 = 0; i5 < ((ArrayList) this.f54516q).size(); i5++) {
                C19340m mVar = new C19340m();
                View inflate2 = LayoutInflater.from(this.f54506d).inflate(C0966R.C0971layout.caa, (ViewGroup) null);
                mVar.f54554a = inflate2;
                mVar.f54556c = (ImageView) inflate2.findViewById(C0966R.C0970id.crw);
                mVar.f54555b = (FrameLayout) mVar.f54554a.findViewById(C0966R.C0970id.crx);
                ((ArrayList) this.f54525z).add(mVar);
            }
            this.f54523x.setAdapter(new C115818m(this));
            this.f54523x.addOnPageChangeListener(new C19352n(this, tabLayout));
            this.f54511i.f122361n = new C19354o(this);
            Iterator it5 = ((ArrayList) this.f54516q).iterator();
            while (it5.hasNext()) {
                C22426h.C22429c cVar3 = (C22426h.C22429c) it5.next();
                int i6 = cVar3.f63546b;
                if (i6 == intExtra) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "select category %s", Integer.valueOf(i6));
                    cVar3.f63552h.mo76121b();
                    ((C19340m) ((ArrayList) this.f54525z).get(cVar3.f63552h.f154604e)).f54556c.setVisibility(8);
                }
            }
            if (tabLayout.getSelectedTabPosition() < 0) {
                i = 0;
                tabLayout.mo146907k(0).mo76121b();
            } else {
                i = 0;
            }
            if (((ArrayList) this.f54516q).size() == 1) {
                tabLayout.setSelectedTabIndicator(i);
                tabLayout.setSelectedTabIndicatorColor(i);
            }
            textView.setText("");
        } else {
            this.f54523x.setVisibility(8);
            this.f54522w.addView(this.f54524y, -1, -1);
            textView.setText(this.f54508f.f64044v);
            findViewById3.setOnClickListener(new C43256h(this));
        }
        if (C44706b.m49450a()) {
            C44706b.m49451b(textView, C0966R.dimen.f3619c);
        } else if (C76577a.m92147C(this.f54496E)) {
            textView.setTextSize(0, ((float) C76577a.m92155f(this.f54496E, C0966R.dimen.f3619c)) * C76577a.m92161l(this.f54496E));
        }
        findViewById.setOnClickListener(new C43257i(this));
        ImageView imageView = (ImageView) this.f54506d.findViewById(C0966R.C0970id.f5471g1);
        imageView.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        imageView.setContentDescription(imageView.getResources().getString(C0966R.string.f7368e5));
        this.f54514o.mo119903e();
        if (!(this instanceof C19355s)) {
            String w = ((C21723h) ((C21912d) C86312j.m106911c(cls2)).mo34966t4()).mo34012w();
            if (Util.isNullOrNil(w)) {
                View view5 = this.f54517r;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                mo24895b(w, ((C21723h) ((C21912d) C86312j.m106911c(cls2)).mo34966t4()).mo34013x());
            }
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view7 = findViewById2;
            str = "";
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setContentDescription(this.f54506d.getString(C0966R.string.k45));
            findViewById2.setOnClickListener(new C19350j(this));
        } else {
            str = "";
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view8 = findViewById2;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Bundle bundleExtra2 = this.f54506d.getIntent().getBundleExtra("key_extra_data");
        if (bundleExtra2 != null && bundleExtra2.getBoolean("_openbusinessview_personal_center", false)) {
            findViewById2.post(new C106191k(this, findViewById2));
        }
        View findViewById4 = this.f54506d.findViewById(C0966R.C0970id.f5386dr);
        findViewById4.setBackgroundColor(this.f54506d.getResources().getColor(C0966R.color.BW_93));
        MMActivity mMActivity2 = this.f54506d;
        mMActivity2.setActionbarColor(mMActivity2.getResources().getColor(C0966R.color.BW_93));
        int i7 = this.f54498G;
        if (i7 == 1) {
            findViewById4.setBackgroundColor(this.f54506d.getResources().getColor(C0966R.color.al6));
            MMActivity mMActivity3 = this.f54506d;
            mMActivity3.setActionbarColor(mMActivity3.getResources().getColor(C0966R.color.al6));
        } else if (i7 == 2) {
            findViewById4.setBackgroundColor(this.f54506d.getResources().getColor(C0966R.color.BW_93));
            MMActivity mMActivity4 = this.f54506d;
            mMActivity4.setActionbarColor(mMActivity4.getResources().getColor(C0966R.color.BW_93));
        } else {
            int i8 = this.f54508f.f64048z;
            if (i8 != 0) {
                if (Color.red(i8) > 200 && Color.blue(i8) > 200 && Color.green(i8) > 200) {
                    findViewById4.setBackgroundColor(this.f54506d.getResources().getColor(C0966R.color.al6));
                    MMActivity mMActivity5 = this.f54506d;
                    mMActivity5.setActionbarColor(mMActivity5.getResources().getColor(C0966R.color.al6));
                } else {
                    findViewById4.setBackgroundColor(this.f54508f.f64048z);
                    this.f54506d.setActionbarColor(this.f54508f.f64048z);
                }
            }
        }
        WebSearchWebView webSearchWebView = this.f54511i;
        webSearchWebView.setWebViewCallbackClient(new C45898g(this.f54523x, webSearchWebView));
        if (this.f54508f.f64034i == 54 && (bundleExtra = this.f54506d.getIntent().getBundleExtra("key_extra_data")) != null) {
            MMActivity mMActivity6 = this.f54506d;
            C77389a aVar6 = new C77389a();
            aVar6.f225658o = C88155a.decodeResource(mMActivity6.getResources(), C0966R.raw.dialog_successful_icon, (BitmapFactory.Options) null);
            aVar6.f225619B = false;
            aVar6.f225635R = 3;
            aVar6.f225668y = false;
            aVar6.f225669z = false;
            aVar6.f225646c = this.f54506d.getString(C0966R.string.bjc);
            aVar6.f225633P = 17;
            C77398g gVar = new C77398g(mMActivity6, C0966R.style.a66);
            gVar.mo107525e(aVar6);
            gVar.mo107539t(this.f54506d.getString(C0966R.string.bj9, new Object[]{bundleExtra.getString("_openbusinessview_app_name", str)}), true, new C30511f(this, bundleExtra, bundleExtra.getString("_openbusinessview_package_name", str)));
            gVar.mo107542x(this.f54506d.getString(C0966R.string.bjf), true, new C30512g(this));
            gVar.mo107540u(this.f54506d.getResources().getColor(C0966R.color.f3154h3));
            gVar.show();
            C117407d.INSTANCE.mo160131h(17080, 42, 1);
        }
        C22426h.m26099a(this.f54508f, "uiOnCreate", C31543z5.m39453c());
    }

    /* renamed from: f7 */
    public void mo24900f7(String str) {
        Iterator it = ((ArrayList) this.f54525z).iterator();
        while (it.hasNext()) {
            C19340m mVar = (C19340m) it.next();
            if (mVar.f54556c != null) {
                mVar.f54557d = 0;
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "invalid cache when onSearchDataReady");
            }
        }
        this.f54502K = true;
        this.f54512j.mo25072s(str);
    }

    /* renamed from: g */
    public C59379b mo9284g() {
        return this.f54512j;
    }

    public BaseWebSearchWebView getWebView() {
        return this.f54511i;
    }

    /* renamed from: h */
    public void mo24902h() {
        this.f54511i.f122361n = null;
        try {
            Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onDestroy, homeContext.channelId = %s.", Integer.valueOf(this.f54508f.f64041s));
            if (this.f54512j != null) {
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onDestroy, onWebCommendLeaveFromFindPage");
                C19391e eVar = this.f54512j;
                eVar.getClass();
                C43261a.m46837a(eVar, "onWebCommendLeaveFromFindPage", "");
                C21031j jVar = this.f54512j.f54734g;
                if (jVar != null) {
                    jVar.mo13943b((Context) null);
                }
            }
            if (this.f54511i.getParent() != null && this.f54511i.getParent().equals(this.f54509g)) {
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "webViewContainer remove topstoryWebview");
                this.f54509g.removeView(this.f54511i);
            }
        } catch (Exception unused) {
        }
        WebSearchWebView webSearchWebView = this.f54511i;
        if (webSearchWebView != null) {
            webSearchWebView.removeJavascriptInterface("topStoryJSApi");
            this.f54511i.setWebChromeClient((WebChromeClient) null);
            this.f54511i.setWebViewClient((WebViewClient) null);
            this.f54511i.destroy();
        }
        jh4 jh4 = this.f54508f;
        long activityBrowseTimeMs = this.f54506d.getActivityBrowseTimeMs();
        if (activityBrowseTimeMs > 0) {
            String format = String.format("%s,%s,%s,%s", new Object[]{Integer.valueOf(jh4.f64034i), Long.valueOf(activityBrowseTimeMs), Integer.valueOf(jh4.f64041s), Integer.valueOf(jh4.f64043u)});
            Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomePageBrowseTime 15018 %s", format);
            C115669n.INSTANCE.kvStat(15018, format);
        }
        C21915i.m25174f(this.f54508f, "uiOnDestroy", C31543z5.m39453c());
        C22613h1.m26480f(18);
        C43263c cVar = this.f54510h;
        cVar.getClass();
        Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "onUIDestroy");
        cVar.f123861d = null;
        cVar.f117069f.clear();
        cVar.f117068e.clear();
        cVar.f117070g.clear();
        C86709a0.m107524d().mo123470p(1943, cVar);
        C86709a0.m107524d().mo123470p(2582, cVar.f117074n);
        C86709a0.m107524d().mo123470p(2802, cVar.f117073j);
        C86709a0.m107524d().mo123470p(2906, cVar.f117072i);
        this.f54503L.dead();
        C86709a0.m107529k().mo121129d(this.f54505N);
        ((C22420e) C86312j.m106911c(C22420e.class)).mo35573Dp((C22420e.C22421a) null);
        C21032k t4 = ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4();
        C21723h hVar = (C21723h) t4;
        if (hVar.f61501e == this.f54504M) {
            hVar.f61501e = null;
        }
        mo24910m(-1);
    }

    public void hideVKB() {
    }

    /* renamed from: i */
    public void mo24904i(Intent intent) {
        jh4 jh4 = new jh4();
        try {
            jh4.parseFrom(intent.getByteArrayExtra("key_context"));
        } catch (Exception unused) {
            this.f54506d.finish();
        }
        jh4 jh42 = this.f54508f;
        jh42.f64030e = jh4.f64030e;
        jh42.f64031f = jh4.f64031f;
        jh42.f64034i = jh4.f64034i;
        jh42.f64036n = jh4.f64036n;
        jh42.f64045w = C43471q.m46979c();
        C21915i.m25174f(this.f54508f, "uiOnNewIntent", C31543z5.m39453c());
        C22613h1.m26480f(20);
        this.f54512j.mo25070r("onNewIntent");
    }

    /* renamed from: j */
    public void mo24905j() {
        C21915i.m25174f(this.f54508f, "uiOnPause", C31543z5.m39453c());
        this.f54512j.mo25070r("onPause");
        WebSearchWebView webSearchWebView = this.f54511i;
        if (webSearchWebView != null) {
            webSearchWebView.onPause();
        }
        this.f54521v = true;
        Class cls = C110234e.class;
        if (((C110234e) C86312j.m106911c(cls)).mo161398Zc() != null) {
            int i = this.f54518s;
            if (i == 0) {
                i = C22426h.m26103e();
            }
            if (C21914h.m25163k(i)) {
                ((C110234e) C86312j.m106911c(cls)).mo161398Zc().mo22761a(104, false, false);
            } else if (C21914h.m25162j(i)) {
                ((C110234e) C86312j.m106911c(cls)).mo161398Zc().mo22761a(103, false, false);
            }
        }
    }

    /* renamed from: j6 */
    public void mo24906j6(String str) {
        C19391e eVar = this.f54512j;
        eVar.getClass();
        MMHandlerThread.postToMainThread(new C19396n(eVar, str));
    }

    /* renamed from: k */
    public void mo24907k() {
        C21915i.m25174f(this.f54508f, "uiOnResume", C31543z5.m39453c());
        this.f54512j.mo25070r("onResume");
        WebSearchWebView webSearchWebView = this.f54511i;
        if (webSearchWebView != null) {
            webSearchWebView.onResume();
        }
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        Class cls = C21912d.class;
        for (C22426h.C22429c next : this.f54516q) {
            if (next.f63549e > 0) {
                if (C21914h.m25162j(next.f63546b)) {
                    C22613h1.m26484j(((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34004o(), 107, 2, next.f63549e, 0, "");
                }
            } else if (next.f63548d > 0) {
                if (C21914h.m25162j(next.f63546b)) {
                    C22613h1.m26484j(((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61498b, 107, 1, 0, 0, "");
                } else if (C21914h.m25163k(next.f63546b)) {
                    rh4 rh4 = new rh4();
                    rh4.f64533d = next.f63550f;
                    C22613h1.m26484j(rh4, 107, 3, 0, 0, "");
                }
            }
        }
        this.f54521v = false;
        this.f54495D = false;
    }

    /* renamed from: k0 */
    public Context mo24908k0() {
        return this.f54506d;
    }

    /* renamed from: l */
    public void mo24909l(Bundle bundle) {
        try {
            bundle.putByteArray("key_context", this.f54508f.toByteArray());
            Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onSaveInstanceState %s", this.f54508f.f64038p);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e, "onSaveInstanceState", new Object[0]);
        }
    }

    /* renamed from: m */
    public void mo24910m(int i) {
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "setMaxCacheItemCountLimit = " + i);
        if (i == 50) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_PUSH, new IPCString(""), C19343l.class, new C19338i(this));
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_PUSH, new IPCString(""), C19342k.class, new C19339j(this));
        }
    }

    /* renamed from: m3 */
    public void mo24911m3() {
        this.f54506d.runOnUiThread(new C19341d());
    }

    /* renamed from: n2 */
    public void mo24912n2(String str) {
        C19391e eVar = this.f54512j;
        eVar.getClass();
        MMHandlerThread.postToMainThread(new C19395l(eVar, str));
    }

    public void showVKB() {
    }

    /* renamed from: t */
    public MMActivity mo24914t() {
        return this.f54506d;
    }

    /* renamed from: v5 */
    public int mo24915v5() {
        return 0;
    }

    /* renamed from: v7 */
    public void mo24916v7(int i, int i2) {
        this.f54506d.runOnUiThread(new C19325c(i, i2));
    }

    /* renamed from: w0 */
    public void mo24917w0() {
        if (!this.f54499H || ((ArrayList) this.f54525z).size() <= 0) {
            this.f54499H = true;
            return;
        }
        this.f54523x.postDelayed(new C19324a(this.f54492A), 100);
    }

    /* renamed from: y6 */
    public void mo24918y6() {
        this.f54501J = true;
        MMHandlerThread.postToMainThread(new C19344b());
    }
}
