package z73;

import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import ic0.C108455d;
import java.util.Map;
import p166hy.C117128b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import z04.C112551y;

/* renamed from: z73.j */
public final class C119062j extends C15053a {

    /* renamed from: d */
    public static final C119062j f356588d = new C119062j();

    /* renamed from: z73.j$a */
    public static final class C119063a implements C108455d {

        /* renamed from: a */
        public final C13855j f356589a;

        /* renamed from: b */
        public final C13851h1 f356590b;

        /* renamed from: c */
        public final String f356591c;

        /* renamed from: d */
        public final String f356592d;

        /* renamed from: e */
        public final String f356593e;

        public C119063a(C13855j jVar, C13851h1 h1Var, String str, String str2, String str3) {
            C87412m.m108594g(jVar, "env");
            C87412m.m108594g(h1Var, "msg");
            C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            C87412m.m108594g(str2, "scanUrl");
            C87412m.m108594g(str3, "uxInfo");
            this.f356589a = jVar;
            this.f356590b = h1Var;
            this.f356591c = str;
            this.f356592d = str2;
            this.f356593e = str3;
        }

        /* renamed from: a */
        public void mo26263a(boolean z, Object[] objArr) {
            Class cls = C117128b0.class;
            try {
                Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "ImageLoader downloadImage, isSuccess is " + z + ", scanUrl is " + this.f356592d + ", filePath is " + this.f356591c);
                if (z) {
                    C119062j jVar = C119062j.f356588d;
                    C13855j jVar2 = this.f356589a;
                    C13851h1 h1Var = this.f356590b;
                    String str = this.f356591c;
                    String str2 = this.f356592d;
                    String str3 = this.f356593e;
                    jVar.getClass();
                    ((C117128b0) C86312j.m106911c(cls)).mo137575Lp(jVar2.f38998a, str, str2, str3, new C119064k(jVar2, h1Var, str3, str2));
                    return;
                }
                ((C117128b0) C86312j.m106911c(cls)).uo0(this.f356593e, 1, this.f356592d, 0);
                C13849g gVar = this.f356589a.f39001d;
                String str4 = this.f356590b.f38990c;
                C119062j.f356588d.getClass();
                gVar.mo10774a(str4, "startAdQRScan:failed. Image download failed", (Map<String, Object>) null);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.WebSearch.StartAdQRScanJSApi", "onImageDownload, exp is " + th);
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        Class cls = C117128b0.class;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "handleMsg params: " + h1Var.f38983a);
        Map<String, Object> map = h1Var.f38983a;
        if (NetStatusUtil.getNetType(MMApplicationContext.getContext()) == -1) {
            Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "network status is non_network");
            jVar.f39001d.mo10774a(h1Var.f38990c, "startAdQRScan:failed. Unreachable", (Map<String, Object>) null);
            return true;
        }
        String f = C43471q.m46982f(map, "scanUrl");
        String f2 = C43471q.m46982f(map, "uxInfo");
        if (Util.isNullOrNil(f)) {
            Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "scanUrl is isNullOrNil");
            ((C117128b0) C86312j.m106911c(cls)).uo0(f2, 3, f, 0);
            jVar.f39001d.mo10774a(h1Var.f38990c, "startAdQRScan:failed. Params error", (Map<String, Object>) null);
            return true;
        }
        C87412m.m108593f(f, "scanUrl");
        if (C112551y.m153819s(f, "http", false) || C112551y.m153819s(f, C113600ck.f339986i, false)) {
            String FO = ((C117128b0) C86312j.m106911c(cls)).mo137574FO(f);
            try {
                if (!Util.isNullOrNil(FO)) {
                    if (C86013q1.m106450k(FO)) {
                        Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "filePath not null and file is exist");
                        C87412m.m108593f(FO, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        C87412m.m108593f(f2, "uxInfo");
                        ((C117128b0) C86312j.m106911c(cls)).mo137575Lp(jVar.f38998a, FO, f, f2, new C119064k(jVar, h1Var, f2, f));
                        return true;
                    }
                }
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59345a = true;
                bVar.f59346b = true;
                bVar.f59350f = FO;
                C20937c a = bVar.mo32666a();
                C20828a b = C20828a.m22825b();
                C87412m.m108593f(FO, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                C87412m.m108593f(f2, "uxInfo");
                b.mo32515d(f, a, new C119063a(jVar, h1Var, FO, f, f2));
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.WebSearch.StartAdQRScanJSApi", "exp is " + th);
            }
            return true;
        }
        Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "scanUrl not start with http or https");
        ((C117128b0) C86312j.m106911c(cls)).uo0(f2, 3, f, 0);
        jVar.f39001d.mo10774a(h1Var.f38990c, "startAdQRScan:failed.", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "startAdQRScan";
    }
}
