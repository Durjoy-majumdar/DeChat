package com.tencent.p014mm.view.manager;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmojiUpdatePanelEvent;
import com.tencent.p014mm.autogen.events.RefreshSmileyPanelEvent;
import com.tencent.p014mm.autogen.events.SucceedUploadEmotionEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct;
import com.tencent.p014mm.emoji.panel.layout.EmojiPanelLayoutManager;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C93123b;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import i61.C98602h;
import j20.C117292a;
import java.util.LinkedList;
import k14.C60942d;
import k14.C99088c;
import k20.C60958c;
import k20.C9556a;
import l61.C46833a;
import l61.C46834b;
import p171il.C60334f0;
import p171il.C60336o;
import p171il.C98711d;
import p171il.C98720h0;
import p171il.C98727l;
import p441aq.C92054g;
import p490dl.C97489o;
import p490dl.C97491p;
import p585kl.C99146d;
import p585kl.C99147e;
import p585kl.C99150i;
import p662ql.C101204b;
import p662ql.C101205c;
import p813fl.C45802t0;
import p813fl.C97905g0;
import p813fl.C97906h;
import p813fl.C97907h0;
import p813fl.C97918n;
import p813fl.C97923p;
import p813fl.C97930s;
import p813fl.C97932t;
import p813fl.C97943y0;
import p813fl.C97945z0;
import z51.C39315g;
import zp3.C103055g;

/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager */
public class SmileyPanelManager {

    /* renamed from: O */
    public static boolean f285695O = true;

    /* renamed from: A */
    public C72837v1 f285696A;

    /* renamed from: B */
    public ChatFooterPanel.C72719a f285697B;

    /* renamed from: C */
    public C45802t0 f285698C = new C45802t0();

    /* renamed from: D */
    public int f285699D;

    /* renamed from: E */
    public Runnable f285700E = null;

    /* renamed from: F */
    public C99147e f285701F = new C99147e();

    /* renamed from: G */
    public final C101204b f285702G = new SmileyPanelManager$$d(this);

    /* renamed from: H */
    public final MStorage.IOnStorageChange f285703H = new SmileyPanelManager$$i(this);

    /* renamed from: I */
    public final MStorage.IOnStorageChange f285704I = new SmileyPanelManager$$j(this);

    /* renamed from: J */
    public final IListener f285705J;

    /* renamed from: K */
    public final IListener<EmojiUpdatePanelEvent> f285706K;

    /* renamed from: L */
    public C98720h0.C98721a f285707L;

    /* renamed from: M */
    public IListener<SucceedUploadEmotionEvent> f285708M;

    /* renamed from: N */
    public C92668a.C92678k f285709N;

    /* renamed from: a */
    public Context f285710a;

    /* renamed from: b */
    public boolean f285711b = false;

    /* renamed from: c */
    public String f285712c = null;

    /* renamed from: d */
    public int f285713d = -1;

    /* renamed from: e */
    public boolean f285714e = false;

    /* renamed from: f */
    public RecyclerView f285715f;

    /* renamed from: g */
    public C98727l f285716g;

    /* renamed from: h */
    public LinearLayoutManager f285717h;

    /* renamed from: i */
    public C98711d f285718i;

    /* renamed from: j */
    public final C103055g f285719j;

    /* renamed from: k */
    public View f285720k;

    /* renamed from: l */
    public ImageView f285721l;

    /* renamed from: m */
    public RecyclerView f285722m;

    /* renamed from: n */
    public NestedBounceView f285723n;

    /* renamed from: o */
    public C98720h0 f285724o;

    /* renamed from: p */
    public C97906h f285725p;

    /* renamed from: q */
    public final C97918n f285726q;

    /* renamed from: r */
    public C97905g0 f285727r;

    /* renamed from: s */
    public String f285728s;

    /* renamed from: t */
    public String f285729t;

    /* renamed from: u */
    public boolean f285730u;

    /* renamed from: v */
    public boolean f285731v;

    /* renamed from: w */
    public boolean f285732w = false;

    /* renamed from: x */
    public C97943y0 f285733x;

    /* renamed from: y */
    public final C60336o f285734y = new C60336o();

    /* renamed from: z */
    public final C60334f0 f285735z = new C60334f0();

    public SmileyPanelManager(Context context) {
        Class cls = C39315g.class;
        C40008f fVar = C40008f.f107254d;
        this.f285705J = new IListener<RefreshSmileyPanelEvent>(fVar) {
            {
                this.__eventId = -1418663662;
            }

            public boolean callback(IEvent iEvent) {
                RefreshSmileyPanelEvent refreshSmileyPanelEvent = (RefreshSmileyPanelEvent) iEvent;
                Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "REFRESH_PANEL_EVENT");
                SmileyPanelManager.this.f285726q.mo137246b();
                return false;
            }
        };
        this.f285706K = new IListener<EmojiUpdatePanelEvent>(fVar) {
            {
                this.__eventId = 281399509;
            }

            public boolean callback(IEvent iEvent) {
                EmojiUpdatePanelEvent emojiUpdatePanelEvent = (EmojiUpdatePanelEvent) iEvent;
                int i = emojiUpdatePanelEvent.f193547d.f193549a;
                String str = i == 1 ? "custom" : i == 2 ? "capture" : null;
                if (Util.isNullOrNil(str)) {
                    return false;
                }
                MMHandlerThread.postToMainThreadDelayed(new C97338c(this, str), 500);
                emojiUpdatePanelEvent.f193548e.f193550a = true;
                Log.m105918d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "update custom panel.");
                return false;
            }
        };
        this.f285707L = new SmileyPanelManager$$e(this);
        this.f285708M = new IListener<SucceedUploadEmotionEvent>(fVar) {
            {
                this.__eventId = -75046574;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105918d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "kv stat update click cell item");
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(11076, "1," + ((SucceedUploadEmotionEvent) iEvent).f265230d.f265231a);
                SmileyPanelManager.this.f285708M.dead();
                return true;
            }
        };
        this.f285709N = new SmileyPanelManager$$f(this);
        this.f285710a = context;
        if (f285695O) {
            f285695O = false;
            for (EmojiInfo next : C97489o.m125592g().mo136761b(true)) {
                if (IEmojiInfo.C40005a.STATUS_MIXING == next.mo62647T1()) {
                    next.field_captureStatus = 2;
                    next.field_captureUploadErrCode = 13;
                    ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138019f(next);
                    EmojiCaptureReporter.m117778d(next.field_captureEnterTime, 5, next.field_captureScene);
                } else if (next.mo62647T1() == IEmojiInfo.C40005a.STATUS_UPLOADING) {
                    next.field_captureStatus = 4;
                    ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138019f(next);
                    EmojiCaptureReporter.m117779f(next.field_captureEnterTime, 3, next.field_captureScene);
                }
            }
        }
        C97906h hVar = new C97906h();
        this.f285725p = hVar;
        C103055g gVar = new C103055g(context, hVar);
        this.f285719j = gVar;
        C97906h hVar2 = this.f285725p;
        hVar2.f287211h = true;
        hVar2.f287209f = true;
        hVar2.f287214k = C97491p.f286143a.mo136775d();
        this.f285724o = new C98720h0(this.f285725p);
        this.f285716g = new C98727l(this.f285725p, this.f285698C, this.f285735z, this.f285734y, gVar);
        this.f285717h = new EmojiPanelLayoutManager(context, 0, false);
        String str = C97489o.m125592g().f286141m;
        this.f285712c = str;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager: select %s", str);
        this.f285726q = new C97918n(this.f285725p, new SmileyPanelManager$$g(this, this.f285716g, this.f285724o));
    }

    /* renamed from: a */
    public void mo136449a() {
        int i;
        Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onResume: ");
        this.f285711b = true;
        this.f285725p.getClass();
        C97943y0 y0Var = this.f285733x;
        if (y0Var != null) {
            y0Var.mo137253c();
        }
        ChatFooterPanel.C72719a aVar = this.f285697B;
        if (aVar != null) {
            aVar.mo64629d(this.f285732w);
        }
        if (this.f285711b) {
            if (Util.isEqual(this.f285712c, "capture") && this.f285725p.f287211h) {
                C115669n.INSTANCE.mo160131h(15982, 0);
            }
            if (this.f285711b && !this.f285725p.f287214k && (i = this.f285713d) >= 0 && i < this.f285727r.mo137239c().size() && (this.f285727r.mo137239c().get(this.f285713d) instanceof C97932t)) {
                C97491p.f286143a.mo136776e();
            }
            C99146d.f290701a.mo138515a(1);
        }
        C96954m mVar = C96954m.f284033a;
        if (C96954m.f284039g) {
            Log.m105924i("MicroMsg.EmojiOcrService", "resume");
            C96954m.f284039g = false;
            C60942d dVar = (C60942d) C96954m.f284036d;
            if (dVar.mo85907a()) {
                C99088c.C99089a.m129046a(dVar, (Object) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public void mo136450b() {
        Class cls = C39315g.class;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager remove listener. %s", this);
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138025l(this.f285703H);
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138016c(this.f285704I);
        this.f285705J.dead();
        this.f285706K.dead();
        C92668a.C92674f fVar = C92668a.f266699q;
        fVar.mo126718b(false).mo126704e(this.f285709N);
        fVar.mo126717a(false).mo126704e(this.f285709N);
        this.f285714e = false;
    }

    /* renamed from: c */
    public void mo136451c(String str) {
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setCurrentTab: %s", str);
        if (!Util.isNullOrNil(str)) {
            this.f285712c = str;
            if (this.f285727r != null) {
                for (int i = 0; i < this.f285727r.mo137239c().size(); i++) {
                    if (this.f285727r.mo137239c().get(i).mo137247a(str)) {
                        mo136452d(i);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo136452d(int i) {
        mo136457i(i);
        RecyclerView recyclerView = this.f285715f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager", "setGroupSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/view/manager/SmileyPanelManager", "setGroupSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* renamed from: e */
    public void mo136453e(boolean z, boolean z2) {
        boolean z3 = false;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowCapture: %s, %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        C97906h hVar = this.f285725p;
        if (!(z == hVar.f287210g && z2 == hVar.f287211h)) {
            z3 = true;
        }
        hVar.f287210g = z;
        hVar.f287211h = z2;
        if (z3) {
            this.f285726q.mo137246b();
        }
    }

    /* renamed from: f */
    public void mo136454f(boolean z, boolean z2) {
        boolean z3 = false;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowCustom: %s, %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        C97906h hVar = this.f285725p;
        if (!(z == hVar.f287207d && z2 == hVar.f287209f)) {
            z3 = true;
        }
        hVar.f287207d = z;
        hVar.f287209f = z2;
        if (z3) {
            this.f285726q.mo137246b();
        }
    }

    /* renamed from: g */
    public void mo136455g(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowSearch: %s", Boolean.valueOf(z));
        C97906h hVar = this.f285725p;
        if (z == hVar.f287205b) {
            z2 = false;
        }
        hVar.f287205b = z;
        if (z2) {
            this.f285726q.mo137246b();
        }
    }

    /* renamed from: h */
    public void mo136456h(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowStore: %s", Boolean.valueOf(z));
        C97906h hVar = this.f285725p;
        if (z == hVar.f287212i) {
            z2 = false;
        }
        hVar.f287212i = z;
        if (z2) {
            this.f285726q.mo137246b();
        }
    }

    /* renamed from: i */
    public void mo136457i(int i) {
        C98720h0 h0Var;
        int i2 = 2;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setTabSelected: %s, last:%s", Integer.valueOf(i), this.f285712c);
        C97905g0 g0Var = this.f285727r;
        if (g0Var != null && i >= 0 && i < g0Var.mo137239c().size()) {
            int b = this.f285727r.mo137238b(i);
            if (!(this.f285722m == null || (h0Var = this.f285724o) == null)) {
                h0Var.mo138116G4(b);
                this.f285722m.post(new SmileyPanelManager$$h(this, b));
            }
            String c = this.f285727r.mo137239c().get(i).mo137249c();
            C97907h0 b2 = this.f285727r.mo137240d().get(i).mo127612b();
            if (b2 instanceof C97945z0) {
                C97945z0 z0Var = (C97945z0) b2;
                if (!z0Var.mo137256c()) {
                    ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
                    C93123b<C41062e> wx02 = ((C92054g) C86312j.m106911c(C92054g.class)).wx0();
                    LinkedList linkedList = new LinkedList();
                    if (Util.isEqual(c, String.valueOf(17))) {
                        linkedList.add(new C46834b("com.tencent.xin.emoticon.tusiji"));
                    } else {
                        linkedList.add(new C46833a(c));
                    }
                    wx02.f268269a.mo64092a(linkedList);
                    BKGLoaderManager bKGLoaderManager = wx02.f268269a;
                    if (!bKGLoaderManager.f110547c) {
                        bKGLoaderManager.mo64097f();
                    }
                }
                C99146d dVar = C99146d.f290701a;
                EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = C99146d.f290702b;
                emoticonBoardReddotNotificationStruct.f265444f = emoticonBoardReddotNotificationStruct.mo86045b("EnterPid", c, true);
                if (!z0Var.f287285f) {
                    i2 = 1;
                }
                emoticonBoardReddotNotificationStruct.f265443e = i2;
                emoticonBoardReddotNotificationStruct.f265445g = i + 1;
                dVar.mo138515a(1);
            } else {
                EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct2 = C99146d.f290702b;
                emoticonBoardReddotNotificationStruct2.f265444f = emoticonBoardReddotNotificationStruct2.mo86045b("EnterPid", "", true);
                emoticonBoardReddotNotificationStruct2.f265445g = 0;
            }
            mo136459k(i);
        }
    }

    /* renamed from: j */
    public void mo136458j(Context context, Runnable runnable) {
        Class cls = C101205c.class;
        this.f285700E = runnable;
        C101205c cVar = (C101205c) C86312j.m106911c(cls);
        cVar.mo140643C8();
        Context context2 = context;
        Window window = ((C101205c) C86312j.m106911c(cls)).mo140644CC(context2, this.f285728s, this.f285729t, this.f285699D, this.f285702G, cVar.mo140645sR(), this.f285730u, this.f285731v).getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        C72837v1 v1Var = this.f285696A;
        if (v1Var != null) {
            v1Var.mo65588b(true, context.getResources().getDimensionPixelOffset(C0966R.dimen.f3720ca));
        }
    }

    /* renamed from: k */
    public final void mo136459k(int i) {
        C97943y0 y0Var;
        C97923p pVar = this.f285727r.mo137239c().get(i);
        String c = pVar.mo137249c();
        this.f285712c = c;
        this.f285713d = i;
        if (pVar instanceof C97930s) {
            C99150i.m129154a().f290716i = pVar.mo137249c();
        } else {
            C99150i.m129154a().f290716i = "";
        }
        int i2 = 3;
        Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "updateSelectTab current %s, %s, %s", Integer.valueOf(i), this.f285712c, C99150i.m129154a().f290716i);
        if (this.f285711b && !this.f285725p.f287214k && (pVar instanceof C97932t)) {
            C97491p.f286143a.mo136776e();
        }
        this.f285701F.f290703a = i;
        C99150i.m129154a().f290712e = i;
        C99150i a = C99150i.m129154a();
        if (Util.isEqual(c, "custom")) {
            i2 = 1;
        } else if (Util.isEqual(c, "capture")) {
            i2 = 2;
        }
        a.f290711d = i2;
        C99150i.m129154a().f290713f = this.f285727r.mo137240d().get(i).mo127612b().getDataCount();
        boolean isEqual = Util.isEqual(c, "smiley");
        this.f285732w = isEqual;
        ChatFooterPanel.C72719a aVar = this.f285697B;
        if (aVar != null) {
            aVar.mo64629d(isEqual);
        }
        if (!this.f285732w && (y0Var = this.f285733x) != null) {
            y0Var.mo137253c();
        }
        if (this.f285711b && Util.isEqual(c, "capture") && this.f285725p.f287211h) {
            C115669n.INSTANCE.mo160131h(15982, 0);
        }
    }
}
