package com.tencent.p014mm.plugin.webview.luggage;

import a93.C39517b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMFalseProgressBar;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.luggage.C43689y0;
import com.tencent.p014mm.plugin.webview.luggage.util.C43679b;
import com.tencent.p014mm.plugin.webview.model.C43692a;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44340m1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MovingImageButton;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45297a;
import d93.C45298c;
import d93.C45302f;
import di3.C86312j;
import ea3.C45598m;
import ex0.C45700h;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import js0.C88016e;
import p385u2.C111105a;
import p828wa.C53106j;
import p828wa.C53118n;
import p828wa.C53133t;
import p828wa.C53136v;
import p828wa.C53138x;
import te3.C52018xt1;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n */
public class C43658n extends C53138x {

    /* renamed from: a1 */
    public static final Pattern f117909a1 = Pattern.compile("\"\\s*rgba\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");

    /* renamed from: b1 */
    public static final Pattern f117910b1 = Pattern.compile("\"\\s*rgb\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");

    /* renamed from: A */
    public MovingImageButton f117911A;

    /* renamed from: B */
    public FrameLayout f117912B;

    /* renamed from: C */
    public FrameLayout f117913C;

    /* renamed from: D */
    public LuggageWebViewLongClickHelper f117914D;

    /* renamed from: E */
    public C43976g f117915E;

    /* renamed from: F */
    public C43689y0 f117916F;

    /* renamed from: G */
    public C43603j1 f117917G;

    /* renamed from: H */
    public HandOffURL f117918H;

    /* renamed from: I */
    public WebChromeClient.CustomViewCallback f117919I;

    /* renamed from: J */
    public FrameLayout f117920J;

    /* renamed from: K */
    public ProgressBar f117921K;

    /* renamed from: L */
    public C45298c f117922L;

    /* renamed from: M */
    public C43633m1 f117923M;

    /* renamed from: N */
    public C43689y0.C43690a f117924N;

    /* renamed from: P */
    public MMHandler f117925P;

    /* renamed from: Q */
    public boolean f117926Q = true;

    /* renamed from: Q0 */
    public boolean f117927Q0 = false;

    /* renamed from: R */
    public String f117928R;

    /* renamed from: R0 */
    public int f117929R0 = 0;

    /* renamed from: S */
    public Map<String, String> f117930S;

    /* renamed from: S0 */
    public int f117931S0 = 0;

    /* renamed from: T */
    public boolean f117932T = false;

    /* renamed from: T0 */
    public C43666o1 f117933T0 = new C43666o1();

    /* renamed from: U */
    public boolean f117934U;

    /* renamed from: U0 */
    public AccessibilityManager f117935U0;

    /* renamed from: V */
    public int f117936V;

    /* renamed from: V0 */
    public AccessibilityManager.AccessibilityStateChangeListener f117937V0;

    /* renamed from: W */
    public boolean f117938W;

    /* renamed from: W0 */
    public int f117939W0 = 32;

    /* renamed from: X */
    public boolean f117940X = false;

    /* renamed from: X0 */
    public n$$n f117941X0;

    /* renamed from: Y */
    public boolean f117942Y = false;

    /* renamed from: Y0 */
    public C45297a<C52018xt1> f117943Y0 = new n$$c(this);

    /* renamed from: Z */
    public boolean f117944Z = false;

    /* renamed from: Z0 */
    public C53138x.C53140b f117945Z0 = new n$$d(this);

    /* renamed from: p0 */
    public boolean f117946p0 = false;

    /* renamed from: q */
    public C39517b f117947q;

    /* renamed from: r */
    public C6007m0 f117948r;

    /* renamed from: s */
    public FrameLayout f117949s;

    /* renamed from: t */
    public C43584g f117950t;

    /* renamed from: u */
    public C43661n0 f117951u;

    /* renamed from: v */
    public WebViewKeyboardLinearLayout f117952v;

    /* renamed from: w */
    public WebViewInputFooter f117953w;

    /* renamed from: x */
    public WebViewSearchContentInputFooter f117954x;

    /* renamed from: x0 */
    public boolean f117955x0 = false;

    /* renamed from: y */
    public FrameLayout f117956y;

    /* renamed from: y0 */
    public boolean f117957y0 = false;

    /* renamed from: z */
    public MMFalseProgressBar f117958z;

    public C43658n(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar, tVar, bundle);
        if (tVar != null) {
            this.f117938W = true;
            this.f117922L = C45302f.f122730a.remove(Integer.valueOf(tVar.hashCode()));
        }
        int i = bundle.getInt("geta8key_scene", 32);
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.f117922L == null);
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.LuggageMMWebPage", "LuggageMMWebPage create, getA8key == null ? %b  sourceA8keyScene = %d", objArr);
        if (this.f117922L == null) {
            this.f117922L = new C45298c();
        }
        this.f117922L.f122685b = 32;
        this.f117925P = new MMHandler();
        this.f117923M = new C43633m1(this);
        C43689y0.C43690a aVar = new C43689y0.C43690a(this, this.f117922L);
        this.f117924N = aVar;
        this.f148259i.f148230e = aVar;
        this.f117914D = new LuggageWebViewLongClickHelper(this);
        this.f117916F = new C43689y0(new C43594i(this), this);
        this.f117917G = new C43603j1(this, new C43627k1(this));
        synchronized (C43626k0.f117877a) {
            if (!C43626k0.f117878b.contains(this)) {
                C43626k0.f117878b.add(this);
                C43626k0.f117879c.put(C43626k0.m47359a(this), this);
            }
        }
        C39517b bVar = this.f117947q;
        if (bVar != null) {
            bVar.setPage(this);
            this.f117947q.setWebViewClient(new C43686x(this));
            this.f117947q.setWebChromeClient(new C43688y(this));
        }
        C53138x.C53140b bVar2 = this.f117945Z0;
        if (bVar2 instanceof C53138x.C53140b) {
            this.f148199g = bVar2;
        } else {
            this.f148199g = new C53138x.C53140b(bVar2);
        }
        this.f148197e.f148228a.put(new n$$b(this), Boolean.FALSE);
        mo65808z();
        AccessibilityManager accessibilityManager = (AccessibilityManager) MMApplicationContext.getContext().getSystemService("accessibility");
        this.f117935U0 = accessibilityManager;
        C43577d0 d0Var = new C43577d0(this);
        this.f117937V0 = d0Var;
        accessibilityManager.addAccessibilityStateChangeListener(d0Var);
    }

    /* renamed from: A */
    public boolean mo67930A() {
        boolean z = this.f148261n.getBoolean("forceHideShare", false);
        boolean z2 = this.f148261n.getBoolean("showShare", true);
        Log.m105925i("MicroMsg.LuggageMMWebPage", "forceHideShare:%b showShareBtn:%b enableMinimize:%b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(mo65820o()));
        return !z && z2 && mo65820o();
    }

    /* renamed from: B */
    public boolean mo65778B(String str) {
        return false;
    }

    /* renamed from: C */
    public void mo65779C(String str) {
        Log.m105925i("MicroMsg.LuggageMMWebPage", "loadUrlWithoutCache, url: %s, __Time__: %d", str, Long.valueOf(System.currentTimeMillis()));
        HashMap hashMap = new HashMap(2);
        hashMap.put("Pragma", "no-cache");
        hashMap.put("Cache-Control", "no-cache");
        this.f117947q.loadUrl(str, hashMap);
    }

    /* renamed from: D */
    public void mo67931D(int i) {
        Log.m105924i("MicroMsg.LuggageMMWebPage", "localSetFontSize, fontSize = " + i);
        switch (i) {
            case 1:
                this.f117947q.getSettings().setTextZoom(80);
                return;
            case 2:
                this.f117947q.getSettings().setTextZoom(100);
                return;
            case 3:
                this.f117947q.getSettings().setTextZoom(110);
                return;
            case 4:
                this.f117947q.getSettings().setTextZoom(112);
                return;
            case 5:
                this.f117947q.getSettings().setTextZoom(112);
                return;
            case 6:
                this.f117947q.getSettings().setTextZoom(140);
                return;
            case 7:
                this.f117947q.getSettings().setTextZoom(155);
                return;
            case 8:
                this.f117947q.getSettings().setTextZoom(165);
                return;
            default:
                this.f117947q.getSettings().setTextZoom(100);
                return;
        }
    }

    /* renamed from: E */
    public Boolean mo65821E() {
        return Boolean.FALSE;
    }

    /* renamed from: F */
    public void mo67932F(String str) {
        if (str != null) {
            this.f148259i.mo73815b(new n$$k(this, str));
        }
    }

    /* renamed from: G */
    public void mo65780G(String str) {
    }

    /* renamed from: H */
    public void mo65781H(String str) {
        Log.m105918d("MicroMsg.LuggageMMWebPage", "onUrlLoadingFinished, url = " + str);
        C43692a.m47524b(this.f117947q);
        this.f117951u.setOptionEnable(true);
        mo65806x();
        C43689y0 y0Var = this.f117916F;
        if (y0Var != null) {
            y0Var.mo149079t0("rawUrl", str);
            this.f117916F.mo67997C0(str);
        }
        HandOffURL handOffURL = this.f117918H;
        if (handOffURL != null) {
            handOffURL.setUrl(Util.nullAsNil(str));
            ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f117918H);
        }
    }

    /* renamed from: I */
    public void mo65782I(String str) {
        int k;
        Log.m105918d("MicroMsg.LuggageMMWebPage", "onUrlLoadingStarted, url = " + str);
        mo65808z();
        if (!mo65790V(str) || !((k = this.f117922L.mo70845k(str, false)) == 0 || k == 2 || k == 8)) {
            C43692a.m47524b(this.f117947q);
            C43689y0 y0Var = this.f117916F;
            if (y0Var != null) {
                y0Var.mo149079t0("rawUrl", str);
                this.f117916F.mo67997C0(str);
            }
            HandOffURL handOffURL = this.f117918H;
            if (handOffURL != null) {
                handOffURL.setUrl(Util.nullAsNil(str));
                ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f117918H);
            }
            this.f117951u.setOptionEnable(false);
            mo65788S();
            mo65817Q(str);
            return;
        }
        this.f148259i.f148245i.stopLoading();
    }

    /* renamed from: J */
    public void mo65783J(int i, String str, String str2) {
    }

    /* renamed from: K */
    public void mo65784K(String str, String str2, Map<String, String> map) {
        mo67933N(new n$$a(this, str, map, str2));
    }

    /* renamed from: L */
    public void mo65785L(String str, String str2, Map<String, String> map) {
        Log.m105925i("MicroMsg.LuggageMMWebPage", "onUrlRedirect, reqUrl = %s, full = %s", str, str2);
        if (Util.isNullOrNil(this.f117928R)) {
            this.f117928R = str2;
        }
        this.f117930S = map;
        C39517b bVar = this.f117947q;
        if (Util.isNullOrNil(str2) || bVar == null) {
            Log.m105920e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            C40319a0.m43495c(true, new C43625k(str2, map, bVar));
        }
        C40319a0.m43495c(true, new C43601j(this.f117947q.getWebCore(), str2));
        if (!mo65778B(str) && !this.f117938W && !this.f117927Q0 && !this.f117957y0) {
            this.f148259i.f148245i.stopLoading();
            if (map == null || map.size() <= 0) {
                this.f148259i.mo73821i(str2);
            } else {
                this.f148259i.f148245i.loadUrl(str2, map);
            }
        }
    }

    /* renamed from: M */
    public void mo65786M() {
        this.f117947q.reload();
    }

    /* renamed from: N */
    public void mo67933N(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f117925P.post(runnable);
        }
    }

    /* renamed from: O */
    public void mo67934O() {
        Log.m105918d("MicroMsg.LuggageMMWebPage", "setActionBarColor");
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f117925P.post(new n$$l(this));
            return;
        }
        C43661n0 n0Var = this.f117951u;
        int i = this.f117936V;
        n$$n n__n = this.f117941X0;
        n0Var.mo67961h(i, n__n.f117983a, n__n.f117984b);
    }

    /* renamed from: P */
    public void mo65787P(boolean z) {
        if (z) {
            this.f117951u.setVisibility(8);
            this.f117911A.setVisibility(0);
            C43679b.m47501a(((Activity) this.f148196d).getWindow(), true);
            return;
        }
        this.f117951u.setVisibility(0);
        this.f117911A.setVisibility(8);
        C43679b.m47501a(((Activity) this.f148196d).getWindow(), false);
    }

    /* renamed from: Q */
    public void mo65817Q(String str) {
    }

    /* renamed from: R */
    public void mo65818R(String str, int i) {
        if (this.f117955x0) {
            this.f117916F.mo67998q0(str);
        }
        this.f117917G.mo160077O(str);
        HandOffURL handOffURL = this.f117918H;
        if (handOffURL != null) {
            handOffURL.setTitle(str);
            ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f117918H);
        }
        this.f117925P.post(new n$$m(this, str, i));
    }

    /* renamed from: S */
    public void mo65788S() {
        this.f117958z.setVisibility(0);
        this.f117958z.mo25983c();
    }

    /* renamed from: T */
    public void mo65789T() {
        this.f117951u.mo65849k();
    }

    /* renamed from: U */
    public void mo67935U(boolean z) {
        if (!z) {
            this.f117954x.mo68915a();
        } else if (!this.f117954x.isShown()) {
            this.f117954x.mo68917c();
            this.f117954x.f119842e.setText("");
            WebViewSearchContentInputFooter webViewSearchContentInputFooter = this.f117954x;
            webViewSearchContentInputFooter.setVisibility(0);
            WebViewSearchContentInputFooter.C44223g gVar = webViewSearchContentInputFooter.f119847j;
            if (gVar != null) {
                gVar.onShow();
            }
            webViewSearchContentInputFooter.f119842e.requestFocus();
            webViewSearchContentInputFooter.postDelayed(new C44340m1(webViewSearchContentInputFooter), 100);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: V */
    public boolean mo65790V(java.lang.String r6) {
        /*
            r5 = this;
            d93.c r0 = r5.f117922L
            java.util.HashSet<java.lang.String> r0 = r0.f122684a
            boolean r0 = r0.contains(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            r5.f117932T = r1
            return r2
        L_0x000f:
            d93.c r0 = r5.f117922L
            d93.a<te3.xt1> r3 = r5.f117943Y0
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x003b }
            r4 = -1
            d93.c$$d r3 = r0.mo70851q(r6, r2, r4, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            d93.c$$d r0 = d93.c$$d.WILL_GET
            if (r3 != r0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r3[r1] = r6
            java.lang.String r6 = "MicroMsg.LuggageMMWebPage"
            java.lang.String r1 = "startGetA8Key, url: %s, ret: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r3)
            r5.f117932T = r0
            return r0
        L_0x0038:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r6     // Catch:{ all -> 0x003b }
        L_0x003b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43658n.mo65790V(java.lang.String):boolean");
    }

    /* renamed from: c */
    public void mo65794c(String str, Bundle bundle) {
        C45700h.C45705e eVar;
        Log.m105925i("MicroMsg.LuggageMMWebPage", "load url, url: %s, fromStash: %b  mFirstLoad : %b", str, Boolean.valueOf(this.f117938W), Boolean.valueOf(this.f117926Q));
        this.f148259i.f148250q = str;
        if (this.f117938W) {
            Log.m105924i("MicroMsg.LuggageMMWebPage", "stash url");
            this.f117951u.setOptionEnable(true);
            if (!Util.isNullOrNil(this.f148261n.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE))) {
                mo65818R(this.f148261n.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE), 0);
            }
            this.f117926Q = false;
            if (this.f117922L == null) {
                this.f117922L = new C45298c();
            }
            this.f117922L.f122685b = 32;
            mo65790V(str);
            return;
        }
        mo65788S();
        String string = bundle.getString("game_open_html");
        if (!Util.isNullOrNil(string)) {
            this.f117927Q0 = true;
            this.f117947q.loadDataWithBaseURL(str, string, "text/html", "utf-8", (String) null);
        } else if (mo65778B(str)) {
            mo65779C(str);
        } else if (!this.f117926Q) {
            mo65794c(str, (Bundle) null);
            return;
        }
        Log.m105925i("MicroMsg.LuggageMMWebPage", "before GetA8Key stopLoading and load url, url: %s,", str);
        C45700h.C45703c jM = ((C45700h) C86709a0.m107533q(C45700h.class)).mo71039jM(str, (String) null);
        if (!(jM == null || (eVar = jM.f123521g) == null || eVar.f123531a == null)) {
            this.f117957y0 = true;
            this.f148259i.f148245i.stopLoading();
            this.f148259i.mo73821i(str);
        }
        mo65790V(str);
        this.f117926Q = false;
    }

    /* renamed from: e */
    public void mo65797e() {
        Log.m105924i("MicroMsg.LuggageMMWebPage", "onBackground");
        this.f117946p0 = false;
        mo67932F("onPause");
        this.f117951u.mo65843c();
        this.f117947q.onPause();
        this.f117940X = false;
        C43689y0 y0Var = this.f117916F;
        if (y0Var != null) {
            y0Var.mo64001C();
        }
        C43603j1 j1Var = this.f117917G;
        if (j1Var != null) {
            j1Var.mo74189F();
        }
    }

    /* renamed from: g */
    public void mo65800g() {
        if (!this.f117942Y) {
            this.f117942Y = true;
            Log.m105924i("MicroMsg.LuggageMMWebPage", "onDestroy");
            this.f117914D.f117787i = null;
            synchronized (C43626k0.f117877a) {
                C43626k0.f117878b.remove(this);
                C43626k0.f117879c.remove(C43626k0.m47359a(this));
            }
            this.f117949s.removeAllViews();
            this.f148259i.mo73823k(MMApplicationContext.getContext());
            C43689y0 y0Var = this.f117916F;
            if (y0Var != null) {
                y0Var.mo67996A0();
            }
            C43603j1 j1Var = this.f117917G;
            if (j1Var != null) {
                if (j1Var.mo160080e()) {
                    MultiTaskInfo multiTaskInfo = this.f117917G.f326418a;
                    String str = multiTaskInfo != null ? multiTaskInfo.field_id : null;
                    C53133t tVar = this.f148259i;
                    C45298c cVar = this.f117922L;
                    if (!C43691z0.f118067a.containsKey(str)) {
                        int i = C43668p0.f118037a;
                        Context context = MMApplicationContext.getContext();
                        ConcurrentHashMap<Integer, C53133t> concurrentHashMap = C53136v.f148255a;
                        tVar.mo73823k(context);
                        for (String remove : tVar.f148229d.keySet()) {
                            tVar.f148246j.f129381e.remove(remove);
                        }
                        tVar.f148229d.clear();
                        tVar.f148244h = null;
                        tVar.f148230e = null;
                        tVar.f148247n = true;
                        C53136v.f148255a.put(Integer.valueOf(tVar.hashCode()), tVar);
                        Log.m105925i(C53136v.class.getSimpleName(), "stash, holding size: %d", Integer.valueOf(C53136v.f148255a.size()));
                        int intValue = Integer.valueOf(tVar.hashCode()).intValue();
                        C45302f.f122730a.put(Integer.valueOf(tVar.hashCode()), cVar);
                        Log.m105925i("MicroMsg.LuggageWebViewFloatBallManager", "onMultiTaskItemClick, stash, ballKey = %s, ticket = %d", str, Integer.valueOf(intValue));
                        C43691z0.f118067a.put(str, Integer.valueOf(intValue));
                    }
                } else {
                    mo67932F("onDestroy");
                }
            }
            if (this.f117918H != null) {
                ((C92331c) C86312j.m106911c(C92331c.class)).co0(this.f117918H);
            }
            this.f117922L.f122697n = true;
            this.f117951u.mo65845e();
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.f117937V0;
            if (accessibilityStateChangeListener != null) {
                this.f117935U0.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
            }
        }
    }

    /* renamed from: h */
    public void mo65801h() {
        if (!this.f117946p0) {
            this.f117946p0 = true;
            Log.m105924i("MicroMsg.LuggageMMWebPage", "onForeground");
            if (this.f117944Z) {
                mo67938q(false);
                return;
            }
            mo67936m();
            mo65787P(this.f148261n.getBoolean("show_full_screen", false));
            mo65807y();
            mo67932F("onResume");
            this.f117947q.onResume();
            this.f117940X = true;
            mo67940s(0);
            if (this.f117955x0) {
                this.f117916F.mo64003o();
                this.f117917G.mo74188E();
            }
            this.f117951u.mo65846f();
        }
    }

    /* renamed from: k */
    public String mo65883k() {
        return C88016e.m109548e("luggage_mm_adapter.js");
    }

    /* renamed from: l */
    public View mo65803l() {
        String t = mo67941t();
        this.f117941X0 = new n$$n((n$$b) null);
        Uri parse = Uri.parse(t);
        if (Util.nullAsNil(parse.getQueryParameter("immersiveUIStyle")).equals("1")) {
            this.f117941X0.f117983a = true;
        }
        if (Util.nullAsNil(parse.getQueryParameter("immersivePageBgIsDark")).equals("1")) {
            this.f117941X0.f117984b = true;
        } else if (!Util.nullAsNil(parse.getQueryParameter("immersivePageBgIsDark")).equals("2")) {
            this.f117941X0.f117984b = false;
        } else if (C85875k4.m106211z()) {
            this.f117941X0.f117984b = true;
        } else {
            this.f117941X0.f117984b = false;
        }
        if (Util.nullAsNil(parse.getQueryParameter("hide_share_option")).equals("1")) {
            this.f117941X0.f117985c = true;
        }
        this.f117947q = (C39517b) this.f148259i.mo73819g();
        this.f117948r = new C6007m0(this.f148196d, super.mo65803l());
        this.f117947q.setSource(this.f148261n.getString("KPublisherId"));
        this.f117949s = new FrameLayout(this.f148196d);
        C43584g gVar = new C43584g(this.f148196d);
        this.f117950t = gVar;
        gVar.setBackgroundColor(C111105a.m151500b(this.f148196d, C0966R.color.al6));
        this.f117949s.addView(this.f117950t, new FrameLayout.LayoutParams(-1, -1));
        View inflate = C85868k2.m106137b(this.f148196d).inflate(C0966R.C0971layout.b_j, this.f117950t, false);
        mo65804n();
        if (mo65821E().booleanValue()) {
            this.f117950t.addView(inflate);
        } else {
            C43584g gVar2 = this.f117950t;
            C43661n0 n0Var = this.f117951u;
            boolean z = this.f117941X0.f117983a;
            gVar2.getClass();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            if (z) {
                layoutParams2.addRule(10);
                gVar2.addView(inflate, layoutParams2);
                gVar2.addView(n0Var, layoutParams);
            } else {
                gVar2.addView(n0Var, layoutParams);
                layoutParams2.addRule(3, n0Var.getId());
                gVar2.addView(inflate, layoutParams2);
            }
        }
        if (this.f117941X0.f117985c) {
            this.f117951u.mo67957a(true);
        }
        this.f117950t.setActionBar(this.f117951u);
        this.f117950t.setWebView(this.f117947q);
        this.f117912B = (FrameLayout) inflate.findViewById(C0966R.C0970id.f357785br0);
        this.f117958z = (MMFalseProgressBar) inflate.findViewById(C0966R.C0970id.llw);
        MovingImageButton movingImageButton = (MovingImageButton) inflate.findViewById(C0966R.C0970id.egz);
        this.f117911A = movingImageButton;
        movingImageButton.setOnClickListener(new n$$h(this));
        this.f117952v = (WebViewKeyboardLinearLayout) inflate.findViewById(C0966R.C0970id.eoc);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0966R.C0970id.llv);
        this.f117913C = frameLayout;
        frameLayout.addView(this.f117948r, new ViewGroup.LayoutParams(-1, -1));
        WebViewInputFooter webViewInputFooter = (WebViewInputFooter) inflate.findViewById(C0966R.C0970id.lml);
        this.f117953w = webViewInputFooter;
        webViewInputFooter.mo68983a();
        this.f117953w.setOnTextSendListener(new C43582f0(this));
        this.f117953w.setOnSmileyChosenListener(new C43667p(this));
        this.f117953w.setOnSmileyPanelVisibilityChangedListener(new C43669q(this));
        WebViewSearchContentInputFooter webViewSearchContentInputFooter = (WebViewSearchContentInputFooter) inflate.findViewById(C0966R.C0970id.j59);
        this.f117954x = webViewSearchContentInputFooter;
        webViewSearchContentInputFooter.setActionDelegate(new C43671r(this));
        this.f117947q.setFindListener(new C43673s(this));
        this.f117956y = (FrameLayout) inflate.findViewById(C0966R.C0970id.ijl);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359579o50);
        if (textView != null) {
            C85875k4.m106191k0(textView.getPaint());
            textView.setOnClickListener(new n$$i(this));
        }
        this.f117952v.setOnkbdStateListener(new C43675t(this));
        this.f117947q.setOnTouchListener(new n$$j(this));
        return this.f117949s;
    }

    /* renamed from: m */
    public final void mo67936m() {
        int i = this.f148261n.getInt("screen_orientation", -1);
        if (C53106j.this.f148204d.peek() == this) {
            ((Activity) this.f148196d).setRequestedOrientation(i);
        }
    }

    /* renamed from: n */
    public View mo65804n() {
        C43661n0 n0Var = new C43661n0(this);
        this.f117951u = n0Var;
        return n0Var;
    }

    /* renamed from: o */
    public boolean mo65820o() {
        boolean z = !this.f148261n.getBoolean("disable_minimize", false);
        Log.m105925i("MicroMsg.LuggageMMWebPage", "enableMinimize class:%s enable:%b", getClass(), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: p */
    public void mo67937p(String str, ValueCallback<String> valueCallback) {
        C39517b bVar = this.f117947q;
        if (bVar != null) {
            bVar.evaluateJavascript(str, valueCallback);
        }
    }

    /* renamed from: q */
    public void mo67938q(boolean z) {
        C43689y0 y0Var = this.f117916F;
        if (y0Var != null) {
            y0Var.mo149068c0();
        }
        C43689y0 y0Var2 = this.f117916F;
        if (y0Var2 == null || !y0Var2.mo64004y0(1)) {
            C43603j1 j1Var = this.f117917G;
            if (j1Var != null && j1Var.mo67896U(1, true)) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                C40319a0.m43495c(true, new n$$g(this, z));
            } else if (!C53106j.this.mo73791f(z)) {
                C53106j.this.f148206f.mo124231e();
            }
        }
    }

    /* renamed from: r */
    public void mo67939r() {
        boolean z = true;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            int indexOf = C53106j.this.f148204d.indexOf(this);
            if (indexOf >= 0) {
                C53106j jVar = C53106j.this;
                if (indexOf < 0) {
                    jVar.getClass();
                } else if (jVar.f148204d.size() <= 1 || jVar.f148204d.size() <= indexOf) {
                    z = false;
                } else if (indexOf == 0) {
                    z = jVar.mo73791f(false);
                } else {
                    jVar.mo73795j(jVar.f148204d.remove(indexOf));
                }
                if (!z) {
                    C53106j.this.f148206f.mo124231e();
                    return;
                }
                C119179t tVar = C119157j.f356862d;
                n$$e n__e = new n$$e(this);
                C119157j jVar2 = (C119157j) tVar;
                jVar2.getClass();
                jVar2.mo183892w(n__e, 250, false);
                return;
            }
            return;
        }
        C40319a0.m43495c(true, new n$$f(this));
    }

    /* renamed from: s */
    public final void mo67940s(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f117954x.getLayoutParams();
        if (marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            this.f117954x.setLayoutParams(marginLayoutParams);
        }
        if (this.f117954x.isShown()) {
            i += this.f117954x.getHeight();
        }
        C6007m0 m0Var = this.f117948r;
        m0Var.setPadding(m0Var.getPaddingLeft(), this.f117948r.getPaddingTop(), this.f117948r.getPaddingRight(), i);
    }

    /* renamed from: t */
    public String mo67941t() {
        return this.f148261n.getString("rawUrl");
    }

    /* renamed from: u */
    public String mo67942u() {
        return this.f117951u.getTitle();
    }

    /* renamed from: v */
    public String mo67943v() {
        C53133t tVar = this.f148259i;
        return tVar != null ? tVar.f148250q : "";
    }

    /* renamed from: w */
    public boolean mo65805w(int i) {
        return this.f117922L.mo70841g(mo67943v()).mo69443d(i) == 1;
    }

    /* renamed from: x */
    public void mo65806x() {
        this.f117958z.mo25981a();
        this.f117958z.setVisibility(8);
    }

    /* renamed from: y */
    public void mo65807y() {
        if (!this.f117934U) {
            int i = this.f148261n.getInt("customize_status_bar_color");
            this.f117936V = i;
            if (i == 0) {
                this.f117936V = C111105a.m151500b(this.f148196d, C0966R.color.f3008c5);
            }
        }
        mo67934O();
    }

    /* renamed from: z */
    public int mo65808z() {
        int a = C45598m.m50659a(this.f148196d);
        if (a < 1 || a > 8) {
            a = 2;
        }
        mo67931D(a);
        return a;
    }
}
