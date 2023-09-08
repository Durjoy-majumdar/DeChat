package ps2;

import android.text.TextUtils;
import android.util.Pair;
import bo2.C92277a;
import co2.C92435h;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.OpenCanvasEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import jp3.C9487b;
import jq2.C88011l;
import lo2.C99556n;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p575jn.C98950b;
import p749xh.C102646h;
import ps2.C100850a0;
import ps2.C100880k;
import ps2.C100894u;
import ps2.C35631d0;
import qs2.C101255a0;
import qs2.C101257b0;
import qs2.C101263e0;
import qs2.C101264f;
import qs2.C101280m0;
import qs2.C101297w;
import qs2.C101298y;
import qs2.C101299z;
import rq2.C101429o;
import so2.C101668d;
import so2.C101677l;
import so2.C101679m;

/* renamed from: ps2.n */
public class C100884n {

    /* renamed from: a */
    public ConcurrentLinkedQueue<String> f295436a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public C100850a0 f295437b;

    /* renamed from: c */
    public C92277a f295438c;

    /* renamed from: d */
    public int f295439d;

    /* renamed from: e */
    public C100850a0.C100851a f295440e = new C100886b();

    /* renamed from: ps2.n$a */
    public class C100885a implements C35631d0.C35635d {

        /* renamed from: a */
        public final /* synthetic */ long f295441a;

        /* renamed from: b */
        public final /* synthetic */ String f295442b;

        /* renamed from: c */
        public final /* synthetic */ int f295443c;

        public C100885a(long j, String str, int i) {
            this.f295441a = j;
            this.f295442b = str;
            this.f295443c = i;
        }

        /* renamed from: a */
        public int mo60346a(boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$1");
            Log.m105924i("AdLandingPageResPreloader", "callback() called with: isSucc = [" + z + "], pageId = [" + this.f295441a + "]");
            if (z && !Util.isNullOrNil(str)) {
                C100884n nVar = C100884n.this;
                String str2 = this.f295442b;
                int i = this.f295443c;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                nVar.mo140352c(str, str2, i);
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$1");
            return 0;
        }
    }

    /* renamed from: ps2.n$b */
    public class C100886b implements C100850a0.C100851a {
        public C100886b() {
        }

        /* renamed from: a */
        public void mo138358a(C100850a0.C100852b bVar) {
            SnsMethodCalculate.markStartTimeMs("onParseResItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$2");
            Log.m105918d("AdLandingPageResPreloader", "onParseResItem:" + bVar);
            int i = bVar.f295364a;
            if (i == 1) {
                C100884n nVar = C100884n.this;
                String str = bVar.f295365b;
                String str2 = bVar.f295366c;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                nVar.mo140356k(str, str2);
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } else if (i == 2) {
                try {
                    if (C86013q1.m106450k(C100891r.m132218m("adId", bVar.f295365b))) {
                        SnsMethodCalculate.markEndTimeMs("onParseResItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$2");
                        return;
                    }
                    C94724k.m119921a(bVar.f295365b);
                } catch (Throwable th) {
                    Log.m105920e("AdLandingPageResPreloader", "onPreloadPagFile, exp=" + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("onParseResItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$2");
        }
    }

    /* renamed from: ps2.n$c */
    public class C100887c implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ C101297w f295446a;

        public C100887c(C101297w wVar) {
            this.f295446a = wVar;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$3");
            Log.m105920e("AdLandingPageResPreloader", "pre download sight by http error:" + this.f295446a.f296769z);
            C100884n.m132181a(C100884n.this, this.f295446a.f296769z);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$3");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$3");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$3");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$3");
            C100884n.m132181a(C100884n.this, this.f295446a.f296769z);
            C115669n.INSTANCE.mo175911u(1720, 27);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$3");
        }
    }

    /* renamed from: ps2.n$d */
    public class C100888d implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ C101297w f295448a;

        public C100888d(C101297w wVar) {
            this.f295448a = wVar;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
            Log.m105920e("AdLandingPageResPreloader", "pre download sight by cdn error:" + this.f295448a.f296769z);
            C100884n.m132181a(C100884n.this, this.f295448a.f296769z);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
            C100884n.m132181a(C100884n.this, this.f295448a.f296769z);
            C115669n.INSTANCE.mo175911u(1720, 10);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$4");
        }
    }

    /* renamed from: ps2.n$e */
    public class C100889e implements C98127h.C98128a {

        /* renamed from: d */
        public final /* synthetic */ String f295450d;

        public C100889e(String str) {
            this.f295450d = str;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
            Log.m105924i("AdLandingPageResPreloader", "onProgress, mediaId = " + str + ", offset = " + j + ", total = " + j2);
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
            Log.m105924i("AdLandingPageResPreloader", "onFinish, mediaId = " + str + ", ret = " + i);
            C100884n.m132181a(C100884n.this, this.f295450d);
            C115669n.INSTANCE.mo175911u(1720, 28);
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
        }

        public void onDataAvailable(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
            SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
        }

        public void onM3U8Ready(String str, String str2) {
            SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
            SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
            SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$5");
        }
    }

    /* renamed from: ps2.n$f */
    public class C100890f implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f295452a;

        /* renamed from: b */
        public final /* synthetic */ String f295453b;

        public C100890f(String str, String str2) {
            this.f295452a = str;
            this.f295453b = str2;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
            Log.m105920e("AdLandingPageResPreloader", "predownload img err, compType=" + this.f295452a + ", url=" + this.f295453b);
            C100884n.m132181a(C100884n.this, this.f295453b);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
            Log.m105918d("AdLandingPageResPreloader", "predownload img succ, compType=" + this.f295452a + ", url=" + this.f295453b);
            C100884n.m132181a(C100884n.this, this.f295453b);
            C115669n.INSTANCE.mo175911u(1720, 34);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$6");
        }
    }

    public C100884n() {
        C100850a0 a0Var = new C100850a0("landingPage");
        this.f295437b = a0Var;
        C100850a0.C100851a aVar = this.f295440e;
        SnsMethodCalculate.markStartTimeMs("setAdPreloadAnnoListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
        a0Var.f295363b = aVar;
        SnsMethodCalculate.markEndTimeMs("setAdPreloadAnnoListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
    }

    /* renamed from: a */
    public static void m132181a(C100884n nVar, String str) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        synchronized (nVar) {
            SnsMethodCalculate.markStartTimeMs("removeDownloadedUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            nVar.f295436a.remove(str);
            SnsMethodCalculate.markEndTimeMs("removeDownloadedUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    /* renamed from: b */
    public static void m132182b(long j, boolean z, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        OpenCanvasEvent openCanvasEvent = new OpenCanvasEvent();
        OpenCanvasEvent.C1103a aVar = openCanvasEvent.f9369d;
        aVar.f9371a = j + "";
        OpenCanvasEvent.C1103a aVar2 = openCanvasEvent.f9369d;
        aVar2.f9376f = 0;
        aVar2.f9373c = 1;
        aVar2.f9374d = 0;
        aVar2.f9379i = z ? 1 : 0;
        aVar2.f9375e = 0;
        if (str2 != null) {
            aVar2.f9378h = str2;
        }
        if (str != null) {
            aVar2.f9377g = str;
        }
        openCanvasEvent.publish();
        SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    /* renamed from: e */
    public static synchronized C100884n m132183e() {
        C100884n nVar;
        synchronized (C100884n.class) {
            SnsMethodCalculate.markStartTimeMs("getInstanse", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            nVar = new C100884n();
            SnsMethodCalculate.markEndTimeMs("getInstanse", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        return nVar;
    }

    /* renamed from: f */
    public static Pair<Integer, Integer> m132184f(int i) {
        Pair<Integer, Integer> pair;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("getPreloadLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        if (!isWifi) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 6:
                case 7:
                case 8:
                    SnsMethodCalculate.markStartTimeMs("getMobilePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    try {
                        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_ad_landing_page_normal_preload_mobile_cfg, "2|3");
                        Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, getMobilePreloadConfig, config=" + Y60);
                        int[] j = m132186j(Y60);
                        if (j != null && j.length == 2) {
                            Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(j[0]), Integer.valueOf(j[1]));
                            SnsMethodCalculate.markEndTimeMs("getMobilePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                            pair = pair2;
                            break;
                        }
                    } catch (Throwable th) {
                        Log.m105920e("AdLandingPageResPreloader", "getMobilePreloadConfig, exp=" + th.toString());
                    }
                    Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, getMobilePreloadConfig, use default");
                    Pair<Integer, Integer> pair3 = new Pair<>(2, 3);
                    SnsMethodCalculate.markEndTimeMs("getMobilePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    pair = pair3;
                    break;
                case 4:
                case 5:
                    pair = m132185g();
                    break;
                default:
                    pair = m132185g();
                    break;
            }
        } else if (i == 4 || i == 5) {
            pair = m132185g();
        } else {
            SnsMethodCalculate.markStartTimeMs("getWifiPreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            try {
                String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_ad_landing_page_normal_preload_wifi_cfg, "1000|1000");
                Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, getWifiPreloadConfig, config=" + Y602);
                int[] j2 = m132186j(Y602);
                if (j2 != null && j2.length == 2) {
                    pair = new Pair<>(Integer.valueOf(j2[0]), Integer.valueOf(j2[1]));
                    SnsMethodCalculate.markEndTimeMs("getWifiPreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                }
            } catch (Throwable th4) {
                Log.m105920e("AdLandingPageResPreloader", "getWifiPreloadConfig, exp=" + th4.toString());
            }
            Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, getWifiPreloadConfig, use default");
            pair = new Pair<>(1000, 1000);
            SnsMethodCalculate.markEndTimeMs("getWifiPreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, landingpage, getPreloadLimit, isWifi=" + isWifi + ", scene=" + i + ", pageLimit=" + pair.first + ", resCount=" + pair.second);
        SnsMethodCalculate.markEndTimeMs("getPreloadLimit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return pair;
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m132185g() {
        SnsMethodCalculate.markStartTimeMs("getSharePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        try {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_ad_landing_page_share_preload_cfg, "1|2");
            Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, getSharePreloadConfig, config=" + Y60);
            int[] j = m132186j(Y60);
            if (j != null && j.length == 2) {
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(j[0]), Integer.valueOf(j[1]));
                SnsMethodCalculate.markEndTimeMs("getSharePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                return pair;
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageResPreloader", "getSharePreloadConfig, exp=" + th.toString());
        }
        Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, getSharePreloadConfig, use default");
        Pair<Integer, Integer> pair2 = new Pair<>(1, 2);
        SnsMethodCalculate.markEndTimeMs("getSharePreloadConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return pair2;
    }

    /* renamed from: j */
    public static int[] m132186j(String str) {
        SnsMethodCalculate.markStartTimeMs("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        try {
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                return null;
            }
            String[] split = str.split("\\|");
            if (split != null && split.length == 2) {
                int parseInt = Integer.parseInt(split[1]);
                int[] iArr = {Integer.parseInt(split[0]), parseInt};
                if (iArr[0] < 0 || parseInt < 0) {
                    SnsMethodCalculate.markEndTimeMs("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                    return null;
                }
                SnsMethodCalculate.markEndTimeMs("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                return iArr;
            }
            SnsMethodCalculate.markEndTimeMs("parseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            return null;
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageResPreloader", "parseConfig, cfg=" + str + ", exp=" + th.toString());
        }
    }

    /* renamed from: c */
    public final void mo140352c(String str, String str2, int i) {
        ArrayList<C92435h.C92436a.C92437a> arrayList;
        SnsMethodCalculate.markStartTimeMs("doStartPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        try {
            C100894u.C100895a aVar = new C100894u.C100895a(str, str2);
            LinkedList<C100882l> linkedList = aVar.f295461a;
            C101263e0 e0Var = aVar.f295462b;
            Pair<Integer, Integer> f = m132184f(i);
            int intValue = ((Integer) f.first).intValue();
            int intValue2 = ((Integer) f.second).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("adVideoPreload, landingpage, startPreDownloadResource, pageLimt=");
            sb.append(intValue);
            sb.append(", resLimit=");
            sb.append(intValue2);
            sb.append(", scene=");
            sb.append(i);
            sb.append(", pageCount=");
            sb.append(linkedList == null ? 0 : linkedList.size());
            Log.m105924i("AdLandingPageResPreloader", sb.toString());
            C92435h hVar = aVar.f295465e;
            if (hVar != null) {
                Log.m105924i("AdLandingPageResPreloader", "preload adEggAnimationInfo");
                this.f295437b.mo140320a(hVar, (String) null);
                C92435h.C92436a aVar2 = hVar.f264514d;
                if (!(aVar2 == null || (arrayList = aVar2.f264517a) == null)) {
                    Iterator<C92435h.C92436a.C92437a> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C92435h.C92436a.C92437a next = it.next();
                        if (!TextUtils.isEmpty(next.f264520a)) {
                            mo140356k(next.f264520a, "adEggAnimationInfo");
                        }
                    }
                }
            }
            if (linkedList != null && linkedList.size() > 0) {
                Iterator<C100882l> it4 = linkedList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C100882l next2 = it4.next();
                    mo140356k(next2.f295426a, "pageInfo-backgroundCoverUrl");
                    if (intValue2 <= 0) {
                        break;
                    } else if (intValue <= 0) {
                        break;
                    } else {
                        Iterator<C101255a0> it5 = next2.f295429d.iterator();
                        do {
                            if (!it5.hasNext()) {
                                break;
                            }
                            mo140353d("adId", it5.next());
                            intValue2--;
                        } while (intValue2 > 0);
                        intValue--;
                        SnsMethodCalculate.markStartTimeMs("isNeedPreloadFloatComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
                        SnsMethodCalculate.markEndTimeMs("isNeedPreloadFloatComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                        if (isWifi) {
                            for (String str3 : ((LinkedHashMap) next2.f295430e).keySet()) {
                                Log.m105924i("AdLandingPageResPreloader", "preload floatComponent, cid=" + str3);
                                mo140353d("adId", (C101255a0) ((LinkedHashMap) next2.f295430e).get(str3));
                            }
                        }
                    }
                }
            }
            if (e0Var != null) {
                Log.m105924i("AdLandingPageResPreloader", "preload floatBarComp");
                this.f295437b.mo140320a(e0Var, (String) null);
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageResPreloader", "startPreDownloadResource, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doStartPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    /* renamed from: d */
    public final void mo140353d(String str, C101255a0 a0Var) {
        C101264f fVar;
        int i;
        boolean z;
        ArrayList<C92435h.C92436a.C92437a> arrayList;
        boolean z2;
        String str2 = str;
        C101255a0 a0Var2 = a0Var;
        SnsMethodCalculate.markStartTimeMs("downloadLandingPageComponentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean z3 = false;
        if (C100894u.m132237q(a0Var2.f296505k)) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = a0Var2.f296505k;
            SnsMethodCalculate.markStartTimeMs("isCompentGroupListType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            if (i2 == 101) {
                SnsMethodCalculate.markEndTimeMs("isCompentGroupListType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                z = true;
            } else {
                SnsMethodCalculate.markEndTimeMs("isCompentGroupListType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                z = false;
            }
            if (z) {
                arrayList2.addAll(((C101280m0) a0Var2).mo140732a());
            } else if (C100894u.m132236p(a0Var2.f296505k)) {
                arrayList2.addAll(((C101298y) a0Var2).f296775z);
            } else {
                int i3 = a0Var2.f296505k;
                SnsMethodCalculate.markStartTimeMs("isComponentLinearLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                if (i3 == 103) {
                    SnsMethodCalculate.markEndTimeMs("isComponentLinearLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    z2 = true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("isComponentLinearLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    z2 = false;
                }
                if (z2) {
                    arrayList2.addAll(((C101257b0) a0Var2).mo140732a());
                } else {
                    int i4 = a0Var2.f296505k;
                    SnsMethodCalculate.markStartTimeMs("isComponentFrameLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    if (i4 == 104) {
                        SnsMethodCalculate.markEndTimeMs("isComponentFrameLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                        z3 = true;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isComponentFrameLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    }
                    if (z3) {
                        arrayList2.addAll(((C101299z) a0Var2).mo140732a());
                    } else if (C100894u.m132235o(a0Var2.f296505k)) {
                        arrayList2.addAll(((C101668d) a0Var2).mo140732a());
                    }
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                mo140353d(str2, (C101255a0) it.next());
            }
            if (C100894u.m132235o(a0Var2.f296505k)) {
                C101668d dVar = (C101668d) a0Var2;
                C92435h.C92436a aVar = dVar.f297602B;
                if (!(aVar == null || (arrayList = aVar.f264517a) == null)) {
                    Iterator<C92435h.C92436a.C92437a> it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C92435h.C92436a.C92437a next = it4.next();
                        if (!TextUtils.isEmpty(next.f264520a)) {
                            mo140356k(next.f264520a, dVar.f296496b + "");
                        }
                    }
                }
                this.f295437b.mo140320a(a0Var2, (String) null);
            }
        } else {
            int i5 = a0Var2.f296496b;
            if (i5 == 61) {
                if (mo140354h()) {
                    C101297w wVar = (C101297w) a0Var2;
                    Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, landingpage 61_Video, useHttp=" + wVar.f296766M + ", cId=" + a0Var2.f296495a);
                    C99556n.m129938a(wVar, true);
                    if (!mo140355i(wVar.f296769z)) {
                        this.f295436a.add(wVar.f296769z);
                        if (wVar.f296766M) {
                            C115669n.INSTANCE.mo175911u(1720, 26);
                            C100891r.m132210e(str, wVar.f296769z, true, 61, 0, new C100887c(wVar));
                        } else {
                            C115669n.INSTANCE.mo175911u(1720, 9);
                            C100891r.m132211f(str2, wVar.f296769z, new C100888d(wVar));
                        }
                        if (!((C98950b) C86312j.m106911c(C98950b.class)).mo59101SD(new PInt(), new PInt())) {
                            C115669n.INSTANCE.mo175911u(1720, 25);
                        }
                    }
                } else {
                    Log.m105920e("AdLandingPageResPreloader", "adVideoPreload, landingpage forbid 61_Video preload, cid=" + a0Var2.f296495a);
                }
                this.f295437b.mo140320a(a0Var2, (String) null);
            } else if (i5 == 62) {
                Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, landingpage 62_Video, no preload video, cid=" + a0Var2.f296495a);
                this.f295437b.mo140320a(a0Var2, (String) null);
            } else if (i5 == 142) {
                C101264f fVar2 = (C101264f) a0Var2;
                if (!mo140354h() || fVar2.f296583J) {
                    z3 = true;
                }
                int i6 = fVar2.f296584K;
                C92277a aVar2 = this.f295438c;
                if (aVar2 != null && (i = aVar2.f264110d) > 0) {
                    i6 = Math.min(i6, i);
                }
                Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, landingpage 142_Video, forbid=" + z3 + ", ratio=" + i6 + ", cId=" + a0Var2.f296495a);
                if (z3) {
                    C115669n.INSTANCE.mo175911u(1720, 30);
                } else {
                    C115669n.INSTANCE.mo175911u(1720, 29);
                }
                if (i6 > 0) {
                    C115669n.INSTANCE.mo175911u(1720, 31);
                } else {
                    C115669n.INSTANCE.mo175911u(1720, 32);
                }
                if (!z3 && i6 > 0) {
                    SnsMethodCalculate.markStartTimeMs("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                    SnsMethodCalculate.markEndTimeMs("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                    String j = C99556n.m129947j(fVar2.f296588z, true);
                    String h = C99556n.m129945h("AdLandingGeneralVideo_" + j.hashCode(), true);
                    String str3 = C100891r.m132212g() + "AdLandingGeneralVideo_" + j.hashCode() + ".mp4";
                    if (!mo140355i(j)) {
                        this.f295436a.add(j);
                        Log.m105924i("AdLandingPageResPreloader", "landingpage 142_Video, startDownloadingUrl, mediaId = " + h + ", enableH265 = " + true + ", cId=" + a0Var2.f296495a);
                        C115669n.INSTANCE.mo175911u(1720, 7);
                        AdLandingPagesProxy.getInstance().downloadLandingPageVideo(h, j, str3, 1, true, i6, new C100889e(j));
                    } else {
                        Log.m105924i("AdLandingPageResPreloader", "isDownloadingUrl, mediaId = " + h + ", enableH265 = " + true);
                    }
                }
                this.f295437b.mo140320a(a0Var2, (String) null);
            } else if (i5 == 149) {
                try {
                    if (a0Var2 instanceof C101679m) {
                        C101679m mVar = (C101679m) a0Var2;
                        C101679m.C101682b b = mVar.mo141127b();
                        b.getClass();
                        SnsMethodCalculate.markStartTimeMs("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        String str4 = b.f297668a;
                        SnsMethodCalculate.markEndTimeMs("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        if (!TextUtils.isEmpty(str4)) {
                            mo140356k(str4, "halfEggCard_animImg");
                        }
                        SnsMethodCalculate.markStartTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                        String str5 = mVar.f297655B;
                        SnsMethodCalculate.markEndTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                        if (!TextUtils.isEmpty(str5)) {
                            mo140356k(str5, "halfEggCard_bkgImg");
                        }
                        List<C101679m.C101680a> c = mVar.mo141128c();
                        if (c != null) {
                            ArrayList arrayList3 = (ArrayList) c;
                            if (arrayList3.size() > 0) {
                                Iterator it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    C101679m.C101680a aVar3 = (C101679m.C101680a) it5.next();
                                    String a = aVar3.mo141129a();
                                    SnsMethodCalculate.markStartTimeMs("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    C101255a0 a0Var3 = aVar3.f297665f;
                                    SnsMethodCalculate.markEndTimeMs("getImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    SnsMethodCalculate.markStartTimeMs("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    C101255a0 a0Var4 = aVar3.f297666g;
                                    SnsMethodCalculate.markEndTimeMs("getVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                    if (a0Var3 != null) {
                                        Log.m105918d("AdLandingPageResPreloader", "halfEggCard img_comp, cardId=" + a);
                                        mo140353d("adId", a0Var3);
                                    }
                                    if (a0Var4 != null) {
                                        Log.m105918d("AdLandingPageResPreloader", "halfEggCard video_comp, cardId=" + a);
                                        mo140353d("adId", a0Var4);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("AdLandingPageResPreloader", "preload AdLandingHalfEggCardContainerInfo exp=" + th.toString());
                }
            } else if (i5 == 144) {
                if ((a0Var2 instanceof C101677l) && (fVar = ((C101677l) a0Var2).f297633B) != null) {
                    mo140353d("adId", fVar);
                    Log.m105918d("AdLandingPageResPreloader", "hbCard preload video_comp, video.cid=" + fVar.f296495a);
                }
                this.f295437b.mo140320a(a0Var2, (String) null);
            } else {
                this.f295437b.mo140320a(a0Var2, (String) null);
            }
        }
        SnsMethodCalculate.markEndTimeMs("downloadLandingPageComponentInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }

    /* renamed from: h */
    public final boolean mo140354h() {
        C92277a aVar;
        SnsMethodCalculate.markStartTimeMs("isConfigPreloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        int i = this.f295439d;
        SnsMethodCalculate.markStartTimeMs("isGestureCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        boolean z = false;
        boolean z2 = i == 1 || i == 3 || i == 7;
        SnsMethodCalculate.markEndTimeMs("isGestureCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (z2 || (aVar = this.f295438c) == null || !aVar.f264109c) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isConfigPreloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return z;
    }

    /* renamed from: i */
    public synchronized boolean mo140355i(String str) {
        boolean contains;
        SnsMethodCalculate.markStartTimeMs("isDownloadingUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        contains = this.f295436a.contains(str);
        SnsMethodCalculate.markEndTimeMs("isDownloadingUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        return contains;
    }

    /* renamed from: k */
    public final void mo140356k(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("AdLandingPageResPreloader", "predownload img url==null, compType=" + str2);
            SnsMethodCalculate.markEndTimeMs("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        } else if (mo140355i(str)) {
            Log.m105928w("AdLandingPageResPreloader", "predownload img busy, compType=" + str2 + ", url=" + str);
            SnsMethodCalculate.markEndTimeMs("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        } else {
            this.f295436a.add(str);
            C115669n.INSTANCE.mo175911u(1720, 33);
            C100891r.m132207b("adId", str, true, 0, 0, new C100890f(str2, str));
            SnsMethodCalculate.markEndTimeMs("preDownloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
    }

    /* renamed from: l */
    public void mo140357l(String str, String str2, C92277a aVar, int i) {
        String str3 = str;
        String str4 = str2;
        C92277a aVar2 = aVar;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("startPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        Log.m105924i("AdLandingPageResPreloader", "adVideoPreload, landingpage, startPreDownloadResource, preloadScene=" + i2 + ", preloadConfig=" + aVar2);
        this.f295439d = i2;
        this.f295438c = aVar2;
        if (!(i2 == 4 || i2 == 5) || !C101429o.m133108a(str, str2)) {
            mo140352c(str3, str4, i2);
        } else {
            long safeParseLong = Util.safeParseLong(C101429o.m133110c(str3, C102646h.COL_ADXML, ".adxml.canvasShareInfo.canvasId"));
            String c = C101429o.m133110c(str3, str4, ".adxml.canvasShareInfo.uxInfo");
            String c2 = C101429o.m133110c(str3, str4, ".adxml.canvasShareInfo.canvasDynamicInfo");
            int i3 = i2 == 4 ? 3 : 5;
            C12004a aVar3 = new C12004a();
            aVar3.f35001d = false;
            C35631d0.m40783e(safeParseLong, 0, 0, i3, c, c2, aVar3, new C100885a(safeParseLong, str2, i), (C9487b) null);
        }
        SnsMethodCalculate.markStartTimeMs("preloadWuid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        if (i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6) {
            SnsMethodCalculate.markStartTimeMs("preloadWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
            Log.m105924i("AdWuidHelper", "preloadWuid, scene=" + i2);
            C88011l.m109540b(true);
            SnsMethodCalculate.markEndTimeMs("preloadWuid", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWuidHelper");
        }
        SnsMethodCalculate.markEndTimeMs("preloadWuid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        SnsMethodCalculate.markEndTimeMs("startPreDownloadResource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
    }
}
