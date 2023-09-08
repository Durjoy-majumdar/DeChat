package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.net.Uri;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81334h;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kr0.C88262c1;
import kr0.C88273g1;
import sx3.C26236u;
import sx3.C64186f0;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.l */
public final class C81337l extends C86301e implements C88262c1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.l$a */
    public /* synthetic */ class C81338a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f238801a;

        static {
            int[] iArr = new int[C88273g1.values().length];
            iArr[13] = 1;
            f238801a = iArr;
        }
    }

    /* renamed from: Dm */
    public void mo113580Dm(String str, int i) {
        String[] strArr = AppBrandGlobalSystemConfig.m100099b().f239290M;
        if (strArr == null) {
            strArr = new String[0];
        }
        String[] strArr2 = strArr;
        int length = strArr2.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr2[i2];
            if ((str2 == null || str2.length() == 0) || !str2.equals(str)) {
                i2++;
            } else {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "username[" + str + "] blacklist, just return");
                return;
            }
        }
        new C81314c(str, (String) null, (String) null, i, (String) null, 16, (C8480h) null).mo113598k(false);
    }

    /* renamed from: Re */
    public void mo113581Re(String str, String str2, String str3, int i) {
        new C81314c(str, str2, str3, i, (String) null, 16, (C8480h) null).mo113598k(false);
    }

    public void S60(List<String> list, C88273g1 g1Var) {
        if (!(list == null || list.isEmpty())) {
            if ((g1Var == null ? -1 : C81338a.f238801a[g1Var.ordinal()]) == 1) {
                C81344s.f238811a.mo113619a(list, C81652f.C81653a.SNS_TIMELINE_AD, C1516t.f10867d);
                return;
            }
            Log.m105920e("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWxaAttrs invalid PRELOAD_SCENE:" + g1Var);
        }
    }

    /* renamed from: VU */
    public void mo113583VU(String str) {
        if (vx0(str)) {
            C115669n.INSTANCE.mo175911u(1342, 2);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_prefetch_weapp_data_chat_item, false)) {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchChattingItemAppBrandPiece username:" + str);
                C81344s sVar = C81344s.f238811a;
                C87412m.m108591d(str);
                sVar.mo113619a(C26236u.m33719b(str), C81652f.C81653a.CHATTING, C1516t.f10867d);
            }
        }
    }

    /* renamed from: Yy */
    public void mo113584Yy(List<String> list) {
        LinkedList linkedList = new LinkedList();
        if (list == null) {
            list = C64186f0.f181907d;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!(next == null || next.length() == 0)) {
                z = false;
            }
            if (!z) {
                try {
                    String queryParameter = Uri.parse(next).getQueryParameter("username");
                    if (vx0(queryParameter)) {
                        C87412m.m108591d(queryParameter);
                        linkedList.add(queryParameter);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        if (linkedList.size() > 0) {
            C115669n.INSTANCE.mo175911u(1342, 1);
            Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchMallIndexWeAppLinks list.size:" + linkedList.size());
            C81344s.f238811a.mo113619a(linkedList, C81652f.C81653a.WALLET_MALL_INDEX, C1516t.f10867d);
        }
    }

    /* renamed from: cs */
    public void mo113585cs(C88262c1.C88264b bVar) {
        C87412m.m108594g(bVar, "request");
        C81314c cVar = new C81314c(bVar.f255110a, bVar.f255111b, bVar.f255113d, bVar.f255112c, bVar.f255114e);
        C88262c1.C88263a aVar = bVar.f255115f;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.hashCode());
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(Util.currentTicks());
            String sb4 = sb.toString();
            cVar.f238760v = sb4;
            C81334h hVar = C81334h.f238795a;
            C87412m.m108591d(sb4);
            if (!(sb4.length() == 0)) {
                C81334h.f238796b.put(sb4, new C81334h.C81335a(sb4, aVar));
            }
        }
        cVar.mo113598k(false);
    }

    public void e60(String str, String str2, int i) {
        new C81314c(str, str2, (String) null, i, (String) null, 16, (C8480h) null).mo113598k(false);
    }

    /* renamed from: fX */
    public void mo113587fX() {
        if (vx0("gh_8c10d2f0f25e@app")) {
            C115669n.INSTANCE.mo175911u(1342, 4);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_prefetch_weapp_data_weishi_chat_item, false)) {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchChattingItemWeishiVideoFakeNative");
                C81344s.f238811a.mo113619a(C26236u.m33719b("gh_8c10d2f0f25e@app"), C81652f.C81653a.CHATTING, C1516t.f10867d);
            }
        }
    }

    /* renamed from: rf */
    public void mo113588rf(List<String> list) {
        if (!(list == null || list.isEmpty())) {
            C115669n.INSTANCE.mo175911u(1342, 1);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_prefetch_weapp_data_mall_index_functions, true)) {
                Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchMallIndexWeAppV2 list.size:" + list.size());
                C81344s.f238811a.mo113619a(list, C81652f.C81653a.WALLET_MALL_INDEX, C1516t.f10867d);
            }
        }
    }

    public final boolean vx0(String str) {
        return !(str == null || str.length() == 0) && C72996z1.m85804J4(str) && C81662k.m100193l(str);
    }
}
