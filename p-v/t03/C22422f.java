package t03;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.TopStoryEvent;
import com.tencent.p014mm.plugin.topstory.p113ui.home.C43259y;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import hc0.C20937c;
import java.util.HashMap;
import p03.C21914h;
import t03.C22420e;
import te3.kh4;
import u73.C22613h1;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: t03.f */
public class C22422f extends C86301e implements C22420e {

    /* renamed from: d */
    public int f63532d = 2;

    /* renamed from: e */
    public volatile C43259y f63533e;

    /* renamed from: f */
    public HashMap<String, Integer> f63534f = new HashMap<>();

    /* renamed from: g */
    public C22420e.C22421a f63535g;

    /* renamed from: h */
    public C80617t0.C80620c f63536h = new C22423c();

    /* renamed from: t03.f$c */
    public class C22423c implements C80617t0.C80620c {
        public C22423c() {
        }

        /* renamed from: J0 */
        public void mo31867J0(String str) {
            C22422f.this.getClass();
        }

        /* renamed from: h2 */
        public void mo31871h2(String str) {
            C22422f.this.getClass();
        }
    }

    /* renamed from: t03.f$a */
    public class C22424a implements Runnable {
        public C22424a() {
        }

        public void run() {
            C43259y T60 = C22422f.this.T60();
            T60.getClass();
            C86009m1 m1Var = new C86009m1(C21914h.m25158f());
            if (m1Var.mo119967g()) {
                C86009m1[] u = m1Var.mo119984u();
                if (u == null || u.length <= 0) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Files %s", m1Var.mo119971i());
                } else {
                    for (C86009m1 m1Var2 : u) {
                        int i = Util.getInt(m1Var2.getName(), -1);
                        if (i > 0) {
                            kh4 kh4 = new kh4();
                            try {
                                byte[] O = C86013q1.m106433O(m1Var2.mo119971i(), 0, -1);
                                kh4.parseFrom(O);
                                T60.f117063f.put(Integer.valueOf(i), kh4);
                                Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "put home data cache key:%d size:%d", Integer.valueOf(i), Integer.valueOf(O.length));
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e, "loadHomeDataCache %s", m1Var2.mo119969h());
                            }
                        } else {
                            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Decode Key Error %s", m1Var2.mo119971i());
                        }
                    }
                }
            } else {
                Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Exist %s", m1Var.mo119971i());
            }
            C43259y T602 = C22422f.this.T60();
            T602.getClass();
            C86009m1 m1Var3 = new C86009m1(C21914h.m25159g());
            if (m1Var3.mo119967g()) {
                C86009m1[] u2 = m1Var3.mo119984u();
                if (u2 == null || u2.length <= 0) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Files %s", m1Var3.mo119971i());
                    return;
                }
                for (C86009m1 m1Var4 : u2) {
                    int i2 = Util.getInt(m1Var4.getName(), -1);
                    if (i2 > 0) {
                        try {
                            byte[] O2 = C86013q1.m106433O(m1Var4.mo119971i(), 0, -1);
                            T602.f117064g.put(Integer.valueOf(i2), new String(O2, "utf-8"));
                            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "put neg cache key:%d size:%d", Integer.valueOf(i2), Integer.valueOf(O2.length));
                        } catch (Exception e2) {
                            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e2, "loadNegDataCache %s", m1Var4.mo119969h());
                        }
                    } else {
                        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Decode Key Error %s", m1Var4.mo119971i());
                    }
                }
                return;
            }
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadNegDataCache Folder Not Exist %s", m1Var3.mo119971i());
        }
    }

    /* renamed from: t03.f$b */
    public class C22425b implements Runnable {
        public C22425b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                t03.f r0 = t03.C22422f.this
                int r0 = r0.f63532d
                r1 = 2
                if (r0 != r1) goto L_0x008a
                java.lang.Class<o03.f> r0 = o03.C47322f.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                o03.f r0 = (o03.C47322f) r0
                r0.getClass()
                com.tencent.xweb.WebView$WebViewKind r0 = com.tencent.xweb.WebView.sDefaultWebViewKind
                com.tencent.xweb.WebView$WebViewKind r1 = com.tencent.xweb.WebView.WebViewKind.WV_KIND_SYS
                if (r0 != r1) goto L_0x008a
                java.lang.String r0 = android.os.Build.BRAND
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0038
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r1 = "huawei"
                boolean r1 = r0.contains(r1)
                if (r1 != 0) goto L_0x0036
                java.lang.String r1 = "honor"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0038
            L_0x0036:
                r0 = 0
                goto L_0x0039
            L_0x0038:
                r0 = 1
            L_0x0039:
                if (r0 == 0) goto L_0x008a
                java.lang.Class<lc3.b> r0 = lc3.C10485b.class
                k40.a r0 = f40.C86709a0.m107533q(r0)
                lc3.b r0 = (lc3.C10485b) r0
                pj.f r0 = r0.vh0()
                java.lang.String r1 = "TopStoryWebViewPreInit"
                int r0 = r0.mo107404b(r1, r3)
                java.lang.String r1 = "MicroMsg.TopStory.PluginTopStoryUI"
                if (r0 != 0) goto L_0x005f
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r2] = r0
                java.lang.String r0 = "MXM_DynaCfg_AV_Item_Key_TopStory_WebViewPreInit is %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
                return
            L_0x005f:
                t03.f r0 = t03.C22422f.this
                r0.f63532d = r3
                long r4 = eb0.C31543z5.m39453c()
                com.tencent.mm.plugin.websearch.webview.WebSearchWebView r0 = new com.tencent.mm.plugin.websearch.webview.WebSearchWebView     // Catch:{ Exception -> 0x0073 }
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0073 }
                r0.<init>(r6)     // Catch:{ Exception -> 0x0073 }
                r0.destroy()     // Catch:{ Exception -> 0x0073 }
            L_0x0073:
                r0 = 26
                u73.C22613h1.m26480f(r0)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                long r6 = eb0.C31543z5.m39453c()
                long r6 = r6 - r4
                java.lang.Long r3 = java.lang.Long.valueOf(r6)
                r0[r2] = r3
                java.lang.String r2 = "Create TopStoryWebView Use Time %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            L_0x008a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t03.C22422f.C22425b.run():void");
        }
    }

    /* renamed from: Dp */
    public void mo35573Dp(C22420e.C22421a aVar) {
        this.f63535g = aVar;
    }

    public C43259y T60() {
        if (this.f63533e == null) {
            synchronized (this) {
                if (this.f63533e == null) {
                    this.f63533e = new C43259y();
                }
            }
        }
        return this.f63533e;
    }

    public void h70() {
        MMHandlerThread.postToMainThreadDelayed(new C22425b(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    public void onAccountInitialized(Context context) {
        C80617t0.m98255d().mo112357c(this.f63536h);
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TOP_STORY_HOME_UI_TIMESTAMP_LONG, 0);
        boolean z = true;
        if (C31543z5.m39453c() - G <= 259200000) {
            Log.m105925i("MicroMsg.TopStory.PluginTopStoryUI", "Use TopStory In Three Days %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, G / 1000));
            C22613h1.m26480f(23);
        } else {
            z = false;
        }
        if (z) {
            h70();
        }
        ThreadPool.post(new C22424a(), "TopStory.LoadHomeCacheData");
    }

    public void onAccountReleased(Context context) {
        this.f63533e = null;
        C20937c cVar = C22426h.f63540a;
        TopStoryEvent topStoryEvent = new TopStoryEvent();
        topStoryEvent.f310012d.f310014a = 4;
        topStoryEvent.publish();
        C30650a.m39148c("//topstory");
        C80617t0.m98255d().mo112358f(this.f63536h);
        this.f63534f.clear();
    }
}
