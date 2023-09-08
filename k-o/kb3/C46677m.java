package kb3;

import android.content.SharedPreferences;
import android.webkit.ConsoleMessage;
import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.wepkg.event.C44476a;
import com.tencent.p014mm.plugin.wepkg.event.C44477b;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify;
import com.tencent.p014mm.plugin.wepkg.event.ForceUpdateNotify;
import com.tencent.p014mm.plugin.wepkg.model.C44493e;
import com.tencent.p014mm.plugin.wepkg.model.C44499i;
import com.tencent.p014mm.plugin.wepkg.model.C44501k;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import di3.C86312j;
import h81.C32735h;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import k00.C46633d;
import k00.C9550c;
import v10.C52735e;
import yx1.C53635c;

/* renamed from: kb3.m */
public class C46677m implements C9550c {

    /* renamed from: u */
    public static final Pattern f125647u = Pattern.compile(".*#.*wechat_redirect");

    /* renamed from: a */
    public String f125648a;

    /* renamed from: b */
    public long f125649b = 0;

    /* renamed from: c */
    public String f125650c;

    /* renamed from: d */
    public boolean f125651d = false;

    /* renamed from: e */
    public C44501k f125652e;

    /* renamed from: f */
    public WepkgVersion f125653f;

    /* renamed from: g */
    public C44476a f125654g;

    /* renamed from: h */
    public GameWebPerformanceInfo f125655h;

    /* renamed from: i */
    public C44499i f125656i;

    /* renamed from: j */
    public boolean f125657j = false;

    /* renamed from: k */
    public boolean f125658k = false;

    /* renamed from: l */
    public C44477b f125659l;

    /* renamed from: m */
    public boolean f125660m = false;

    /* renamed from: n */
    public Set<String> f125661n = new HashSet();

    /* renamed from: o */
    public long f125662o;

    /* renamed from: p */
    public boolean f125663p = true;

    /* renamed from: q */
    public String f125664q;

    /* renamed from: r */
    public MTimerHandler f125665r;

    /* renamed from: s */
    public boolean f125666s;

    /* renamed from: t */
    public boolean f125667t = false;

    /* renamed from: kb3.m$a */
    public class C46678a implements C44476a {
        public C46678a() {
        }

        public void notify(Object obj) {
            DownloadBigPkgCompleteNotify downloadBigPkgCompleteNotify;
            String str;
            String str2;
            boolean z;
            String str3;
            String[] strArr;
            Object obj2 = obj;
            int i = 1;
            if (obj2 instanceof ForceUpdateNotify) {
                ForceUpdateNotify forceUpdateNotify = (ForceUpdateNotify) obj2;
                if (forceUpdateNotify != null && (strArr = forceUpdateNotify.f120604d) != null && strArr.length > 0) {
                    for (String str4 : strArr) {
                        if (str4.equals(C46665a.m51974c()) || (!Util.isNullOrNil(C46677m.this.f125650c) && str4.equals(C46677m.this.f125650c))) {
                            C46677m mVar = C46677m.this;
                            mVar.mo71923b();
                            long currentTimeMillis = System.currentTimeMillis();
                            mVar.f125662o = currentTimeMillis;
                            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "forceUpdatePageSrc, pkgId: %s, time: %d", str4, Long.valueOf(currentTimeMillis));
                            ((HashSet) mVar.f125661n).add(str4);
                            C44477b bVar = mVar.f125659l;
                            if (bVar != null && mVar.f125651d && !mVar.f125660m) {
                                mVar.f125660m = true;
                                bVar.mo65875a(str4);
                            }
                            if (C46665a.m51974c().equals(str4)) {
                                C46665a.f125636b = true;
                                return;
                            }
                            return;
                        }
                    }
                }
            } else if ((obj2 instanceof DownloadBigPkgCompleteNotify) && (downloadBigPkgCompleteNotify = (DownloadBigPkgCompleteNotify) obj2) != null && (str = downloadBigPkgCompleteNotify.f120600d) != null) {
                if (str.equals(C46665a.m51974c()) || downloadBigPkgCompleteNotify.f120600d.equals(C46677m.this.f125650c)) {
                    C46677m mVar2 = C46677m.this;
                    String str5 = downloadBigPkgCompleteNotify.f120600d;
                    boolean z2 = downloadBigPkgCompleteNotify.f120601e;
                    boolean z3 = downloadBigPkgCompleteNotify.f120602f;
                    mVar2.getClass();
                    Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "downloadPkgCpl, pkgId: %s, success: %b", str5, Boolean.valueOf(z2));
                    if (z2 && z3 && str5.equalsIgnoreCase(mVar2.f125650c)) {
                        mVar2.mo71923b();
                    }
                    if (((HashSet) mVar2.f125661n).contains(str5)) {
                        if (!z2) {
                            i = 2;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - mVar2.f125662o;
                        String str6 = mVar2.f125648a;
                        String str7 = mVar2.f125650c;
                        if (str7 != null && str7.equals(str5)) {
                            WepkgVersion wepkgVersion = mVar2.f125653f;
                            if (wepkgVersion != null) {
                                str3 = wepkgVersion.f120653f;
                                long j = (long) i;
                                z = z2;
                                long j2 = currentTimeMillis2;
                                str2 = str5;
                                C44532a.m48912c("forceUpdateTime", str6, str5, str3, j, j2, (String) null);
                                ((HashSet) mVar2.f125661n).remove(str2);
                                ((HashMap) C46676l.f125644a).remove(str2);
                            }
                        } else if (C46665a.m51974c().equals(str5)) {
                            str3 = C46665a.m51972a();
                            long j3 = (long) i;
                            z = z2;
                            long j25 = currentTimeMillis2;
                            str2 = str5;
                            C44532a.m48912c("forceUpdateTime", str6, str5, str3, j3, j25, (String) null);
                            ((HashSet) mVar2.f125661n).remove(str2);
                            ((HashMap) C46676l.f125644a).remove(str2);
                        }
                        str3 = "";
                        long j35 = (long) i;
                        z = z2;
                        long j252 = currentTimeMillis2;
                        str2 = str5;
                        C44532a.m48912c("forceUpdateTime", str6, str5, str3, j35, j252, (String) null);
                        ((HashSet) mVar2.f125661n).remove(str2);
                        ((HashMap) C46676l.f125644a).remove(str2);
                    } else {
                        z = z2;
                        str2 = str5;
                    }
                    if (C46665a.m51974c().equals(str2) && (C46665a.f125636b || C46676l.f125646c == 0)) {
                        C46665a.f125636b = false;
                        if (z) {
                            C46665a.m51973b();
                        }
                    }
                    if (mVar2.f125659l != null && mVar2.f125651d && ((HashSet) mVar2.f125661n).isEmpty()) {
                        mVar2.f125659l.mo65876b(z);
                    }
                }
            }
        }
    }

    public C46677m() {
        Map<String, C44501k> map = C46676l.f125644a;
        if (!C80907o.m98784g(MMApplicationContext.getMainProcessName())) {
            C44536d.m48915a("", new C46673i());
        }
        this.f125656i = new C44499i();
        if (C46676l.f125646c == 0) {
            C46665a.m51973b();
        }
        C46676l.f125646c++;
        C46678a aVar = new C46678a();
        this.f125654g = aVar;
        C44478c.f120606a.add(new WeakReference(aVar));
    }

    /* renamed from: a */
    public static void m51984a(C46677m mVar, int i) {
        mVar.getClass();
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("white_screen_times", i).commit();
        }
    }

    /* renamed from: b */
    public final void mo71923b() {
        this.f125663p = false;
        ((C53635c) C86312j.m106911c(C53635c.class)).Yj0(this.f125650c);
    }

    /* renamed from: c */
    public String mo71924c() {
        return C46665a.m51972a();
    }

    /* renamed from: d */
    public boolean mo71925d() {
        return this.f125651d;
    }

    /* renamed from: e */
    public boolean mo71926e(String str) {
        if (f125647u.matcher(Util.nullAsNil(str)).find()) {
            return false;
        }
        return this.f125651d;
    }

    /* renamed from: f */
    public boolean mo71927f(String str, boolean z, boolean z2) {
        this.f125666s = z2;
        this.f125648a = str;
        Object obj = C44536d.f120770a;
        this.f125650c = C46633d.m51936a(str);
        C44501k b = C46676l.m51982b(str, z);
        int i = b.f120672a;
        if (i == 0) {
            this.f125652e = b;
            this.f125651d = true;
            WepkgVersion wepkgVersion = b.f120697d;
            this.f125653f = wepkgVersion;
            C44532a.m48912c("WepkgUsed", this.f125648a, this.f125650c, wepkgVersion.f120653f, 2, 0, (String) null);
            C44532a.m48912c("EnterWeb", this.f125648a, this.f125650c, this.f125653f.f120653f, 1, 0, (String) null);
        } else {
            C44532a.m48912c("WepkgUsed", this.f125648a, this.f125650c, b.f120674c, 3, 0, C44532a.m48913d(i));
        }
        if (b.f120673b) {
            C44532a.m48912c("WepkgUsed", this.f125648a, this.f125650c, b.f120674c, 1, 0, (String) null);
        }
        String str2 = this.f125648a;
        String str3 = this.f125650c;
        WepkgVersion wepkgVersion2 = this.f125653f;
        String str4 = "";
        C44532a.m48912c("WepkgUsed", str2, str3, wepkgVersion2 != null ? wepkgVersion2.f120653f : str4, 0, 0, (String) null);
        if (this.f125651d && !Util.isNullOrNil(this.f125650c)) {
            boolean z3 = ((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_open_page_cache, 0) == 1;
            Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "isOpenPageCache:%b", Boolean.valueOf(z3));
            if (z3) {
                String Wf = ((C53635c) C86312j.m106911c(C53635c.class)).mo5379Wf(this.f125650c);
                this.f125664q = Wf;
                if (Wf != null && Wf.length() < 8) {
                    this.f125664q = null;
                }
            }
            Log.m105919d("MicroMsg.Wepkg.WePkgPlugin", "mPageCache:%s", this.f125664q);
        }
        Log.m105925i("MicroMsg.Wepkg.WePkgPlugin", "wepkgAvailable:%s, pkgId:%s", Boolean.valueOf(this.f125651d), this.f125650c);
        if (this.f125655h == null) {
            GameWebPerformanceInfo b2 = GameWebPerformanceInfo.m43446b(str);
            this.f125655h = b2;
            b2.f108364q = C46633d.m51936a(str);
            GameWebPerformanceInfo gameWebPerformanceInfo = this.f125655h;
            gameWebPerformanceInfo.f108357g = this.f125651d ? 1 : 0;
            gameWebPerformanceInfo.f108351M = C46665a.m51972a();
            GameWebPerformanceInfo gameWebPerformanceInfo2 = this.f125655h;
            WepkgVersion wepkgVersion3 = this.f125653f;
            if (wepkgVersion3 != null) {
                str4 = wepkgVersion3.f120653f;
            }
            gameWebPerformanceInfo2.f108352N = str4;
        }
        return this.f125651d;
    }

    /* renamed from: g */
    public void mo71928g(ConsoleMessage consoleMessage) {
        this.f125658k = true;
        String message = consoleMessage != null ? consoleMessage.message() : null;
        if (!Util.isNullOrNil(message) && message.equalsIgnoreCase("weixin://whiteScreenEnd")) {
            Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "mIsReceivedWhiteScreenEnd: true");
            this.f125657j = true;
        }
    }

    /* renamed from: h */
    public void mo71929h(boolean z) {
        MTimerHandler mTimerHandler = this.f125665r;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        if (z && !Util.isNullOrNil(this.f125650c)) {
            ((HashMap) C46676l.f125644a).remove(this.f125650c);
            C44493e.m48856c().mo69277e(this.f125650c, 2, 1);
        }
        int i = C46676l.f125646c - 1;
        C46676l.f125646c = i;
        if (i == 0) {
            ((HashMap) C46676l.f125644a).clear();
            C46665a.m51973b();
        }
        C44478c.m48835b(this.f125654g);
    }

    /* renamed from: i */
    public void mo71930i(WebView webView, String str) {
        WepkgVersion wepkgVersion;
        boolean z = true;
        Log.m105919d("MicroMsg.Wepkg.WePkgPlugin", "onPageFinished, url = %s", str);
        if (this.f125649b != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f125649b;
            Object obj = C44536d.f120770a;
            String a = C46633d.m51936a(str);
            if (Util.isNullOrNil(a)) {
                C44532a.m48912c("PageLoadTime", str, "", (String) null, 2, currentTimeMillis, (String) null);
            } else if (!this.f125651d || (wepkgVersion = this.f125653f) == null) {
                C44532a.m48912c("PageLoadTime", str, a, (String) null, 0, currentTimeMillis, (String) null);
            } else {
                C44532a.m48912c("PageLoadTime", str, wepkgVersion.f120651d, wepkgVersion.f120653f, 1, currentTimeMillis, (String) null);
            }
            this.f125649b = 0;
        }
        if (this.f125651d && this.f125652e != null && !this.f125666s) {
            if (Util.isNullOrNil(this.f125664q)) {
                C44501k kVar = this.f125652e;
                kVar.getClass();
                Object obj2 = C44536d.f120770a;
                WebResourceResponse a2 = kVar.mo69284a(C46633d.m51937b(str));
                if (a2 != null) {
                    InputStream data = a2.getData();
                    if (data != null) {
                        try {
                            data.close();
                        } catch (IOException unused) {
                        }
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            Log.m105924i("MicroMsg.Wepkg.WePkgPlugin", "startTimer");
            if (this.f125665r == null) {
                this.f125665r = new MTimerHandler(new C46680o(this), false);
            }
            this.f125665r.startTimer(1000);
        }
    }

    /* renamed from: j */
    public void mo71931j(WebView webView, String str) {
        Log.m105919d("MicroMsg.Wepkg.WePkgPlugin", "onPageStarted, url = %s", str);
        this.f125649b = System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c4, code lost:
        if (r0 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01af  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.xweb.WebResourceResponse mo71932k(com.tencent.xweb.WebView r20, java.lang.String r21, com.tencent.xweb.WebResourceRequest r22) {
        /*
            r19 = this;
            r1 = r19
            r11 = r21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onRequestIntercept, url: "
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r12 = "MicroMsg.Wepkg.WePkgPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            r2 = 3
            r3 = 2
            r13 = 0
            r14 = 1
            r15 = 0
            if (r22 == 0) goto L_0x007e
            boolean r0 = r22.isForMainFrame()
            if (r0 == 0) goto L_0x007e
            if (r11 == 0) goto L_0x007e
            java.lang.String r0 = r1.f125648a
            boolean r0 = r11.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x007e
            java.lang.Class<ex0.h> r0 = ex0.C45700h.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.h r0 = (ex0.C45700h) r0
            java.lang.String r4 = r1.f125648a
            ex0.h$c r0 = r0.mo71039jM(r4, r13)
            if (r0 == 0) goto L_0x007e
            ex0.h$e r4 = r0.f123521g
            if (r4 == 0) goto L_0x007e
            com.tencent.xweb.WebResourceResponse r4 = r4.f123531a
            if (r4 == 0) goto L_0x007e
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r5 = r1.f125648a
            r4[r15] = r5
            java.lang.String r5 = "onRequestIntercept hit prefetch response, mRawUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r5, r4)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 21075(0x5253, float:2.9532E-41)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r15] = r7
            r6[r14] = r11
            java.lang.String r7 = ""
            r6[r3] = r7
            r3 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r6[r3] = r2
            r4.mo160131h(r5, r6)
            ex0.h$e r0 = r0.f123521g
            com.tencent.xweb.WebResourceResponse r0 = r0.f123531a
            return r0
        L_0x007e:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r0 = kb3.C46676l.f125644a
            android.net.Uri r0 = android.net.Uri.parse(r21)     // Catch:{ Exception -> 0x008c }
            java.lang.String r4 = "wepkg_rid"
            java.lang.String r0 = r0.getQueryParameter(r4)     // Catch:{ Exception -> 0x008c }
            goto L_0x009f
        L_0x008c:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r15] = r11
            java.lang.String r0 = r0.getMessage()
            r3[r14] = r0
            java.lang.String r0 = "MicroMsg.WePkgLoader"
            java.lang.String r4 = "getWePkgRid, url: %s, exception: "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
            r0 = r13
        L_0x009f:
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onRequestIntercept, rid: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            int r3 = kb3.C46676l.m51981a(r21)
            if (r3 != 0) goto L_0x00c7
            com.tencent.mm.plugin.wepkg.model.k r3 = kb3.C46665a.f125635a
            if (r3 != 0) goto L_0x00c0
            goto L_0x00c7
        L_0x00c0:
            com.tencent.xweb.WebResourceResponse r0 = r3.mo69284a(r0)
            if (r0 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00c7:
            java.lang.String r0 = "MicroMsg.CommJsLoader"
            java.lang.String r3 = "nativeJsCache is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
        L_0x00ce:
            r0 = r13
        L_0x00cf:
            if (r0 == 0) goto L_0x00d2
            return r0
        L_0x00d2:
            java.lang.Object r0 = com.tencent.p014mm.plugin.wepkg.utils.C44536d.f120770a
            java.lang.String r0 = k00.C46633d.m51936a(r21)
            java.lang.String r3 = r1.f125650c
            boolean r3 = r0.equals(r3)
            java.lang.String r10 = "MicroMsg.Wepkg.SupportIframe"
            if (r3 != 0) goto L_0x016b
            java.lang.Object[] r3 = new java.lang.Object[r14]
            r3[r15] = r0
            java.lang.String r0 = "load iframe pkgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r3)
            com.tencent.mm.plugin.wepkg.model.i r0 = r1.f125656i
            int r3 = r0.f120689b
            if (r3 <= r2) goto L_0x00f8
            java.lang.String r0 = "more than 3 wepkgs"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x016b
        L_0x00f8:
            java.lang.String r8 = k00.C46633d.m51936a(r21)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r2 != 0) goto L_0x016b
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r2 = r0.f120688a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r8)
            if (r2 != 0) goto L_0x016b
            int r2 = r0.f120689b
            int r2 = r2 + r14
            r0.f120689b = r2
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r2 = kb3.C46676l.f125644a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r2 != 0) goto L_0x012f
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r2 = kb3.C46676l.f125644a
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r2 = r2.containsKey(r8)
            if (r2 != 0) goto L_0x0124
            goto L_0x012f
        L_0x0124:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r2 = kb3.C46676l.f125644a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r8)
            com.tencent.mm.plugin.wepkg.model.k r2 = (com.tencent.p014mm.plugin.wepkg.model.C44501k) r2
            goto L_0x0130
        L_0x012f:
            r2 = r13
        L_0x0130:
            if (r2 == 0) goto L_0x013a
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r0 = r0.f120688a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r8, r2)
            goto L_0x016b
        L_0x013a:
            com.tencent.mm.plugin.wepkg.model.k r2 = kb3.C46676l.m51982b(r11, r14)
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r3 = r2.f120697d
            if (r3 == 0) goto L_0x016b
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r0 = r0.f120688a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r8, r2)
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r0 = r2.f120697d
            java.lang.String r4 = r0.f120651d
            java.lang.String r5 = r0.f120653f
            r6 = 1
            r16 = 0
            r0 = 0
            java.lang.String r2 = "EnterWeb"
            r3 = r21
            r18 = r8
            r8 = r16
            r13 = r10
            r10 = r0
            com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48912c(r2, r3, r4, r5, r6, r8, r10)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r15] = r18
            java.lang.String r2 = "load wepkg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r0)
            goto L_0x016c
        L_0x016b:
            r13 = r10
        L_0x016c:
            boolean r0 = r1.f125651d
            if (r0 == 0) goto L_0x019e
            com.tencent.mm.plugin.wepkg.model.k r0 = r1.f125652e
            if (r0 == 0) goto L_0x017d
            java.lang.String r2 = k00.C46633d.m51937b(r21)
            com.tencent.xweb.WebResourceResponse r0 = r0.mo69284a(r2)
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            if (r0 == 0) goto L_0x019e
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r2 = r1.f125653f
            if (r2 == 0) goto L_0x0194
            java.lang.String r4 = r2.f120651d
            java.lang.String r5 = r2.f120653f
            r6 = 1
            r8 = 0
            r10 = 0
            java.lang.String r2 = "RequestHook"
            r3 = r21
            com.tencent.p014mm.plugin.wepkg.utils.C44532a.m48912c(r2, r3, r4, r5, r6, r8, r10)
        L_0x0194:
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r15] = r11
            java.lang.String r3 = "hit resource:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r2)
            return r0
        L_0x019e:
            com.tencent.mm.plugin.wepkg.model.i r0 = r1.f125656i
            java.lang.String r2 = k00.C46633d.m51937b(r21)
            r0.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x01af
        L_0x01ad:
            r13 = 0
            goto L_0x01d7
        L_0x01af:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.k> r0 = r0.f120688a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x01bb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.wepkg.model.k r3 = (com.tencent.p014mm.plugin.wepkg.model.C44501k) r3
            com.tencent.xweb.WebResourceResponse r3 = r3.mo69284a(r2)
            if (r3 == 0) goto L_0x01bb
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r15] = r2
            java.lang.String r2 = "hit rid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r0)
            r13 = r3
        L_0x01d7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kb3.C46677m.mo71932k(com.tencent.xweb.WebView, java.lang.String, com.tencent.xweb.WebResourceRequest):com.tencent.xweb.WebResourceResponse");
    }
}
