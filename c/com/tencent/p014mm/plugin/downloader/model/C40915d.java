package com.tencent.p014mm.plugin.downloader.model;

import android.webkit.URLUtil;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.downloader.model.DownloadChecker;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import u10.C52416b;
import u41.C52425e;
import u41.C52437q;
import v41.C52744c;
import v41.C52745d;
import v41.C52748g;
import v41.C52752k;
import v41.C52758q;

/* renamed from: com.tencent.mm.plugin.downloader.model.d */
public class C40915d implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f110085d;

    /* renamed from: e */
    public final /* synthetic */ String f110086e;

    /* renamed from: f */
    public final /* synthetic */ String f110087f;

    /* renamed from: g */
    public final /* synthetic */ C1256g f110088g;

    public C40915d(String str, String str2, String str3, C1256g gVar) {
        this.f110085d = str;
        this.f110086e = str2;
        this.f110087f = str3;
        this.f110088g = gVar;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        boolean z;
        C52752k kVar;
        C52748g gVar;
        C52744c cVar2;
        Log.m105925i("MicroMsg.DownloadChecker", "errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        DownloadChecker.DownloadInterceptBean downloadInterceptBean = new DownloadChecker.DownloadInterceptBean();
        if (i == 0 && i2 == 0) {
            C52437q qVar = (C52437q) cVar.f127056b.f127083a;
            if (qVar != null) {
                int i3 = qVar.f146540f;
                String str2 = qVar.f146541g;
                C52425e eVar = qVar.f146538d;
                if (eVar == null || (kVar = eVar.f146512d) == null || (gVar = kVar.f147402f) == null || (cVar2 = gVar.f147385d) == null || !URLUtil.isNetworkUrl(cVar2.f147349d)) {
                    Log.m105924i("MicroMsg.DownloadChecker", "downloadInfo is invalid");
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    downloadInterceptBean.f80875d = true;
                    downloadInterceptBean.f80876e = i3;
                    downloadInterceptBean.f80877f = str2;
                    C52752k kVar2 = eVar.f146512d;
                    C52745d dVar = kVar2.f147400d;
                    String str3 = null;
                    downloadInterceptBean.f80878g = dVar == null ? null : dVar.f147368d;
                    downloadInterceptBean.f80879h = dVar == null ? null : dVar.f147369e;
                    if (dVar != null) {
                        str3 = dVar.f147370f;
                    }
                    downloadInterceptBean.f80880i = str3;
                    C52748g gVar2 = kVar2.f147402f;
                    C52744c cVar3 = gVar2.f147385d;
                    downloadInterceptBean.f80881j = cVar3.f147349d;
                    downloadInterceptBean.f80882n = cVar3.f147357o;
                    downloadInterceptBean.f80883o = cVar3.f147351f;
                    downloadInterceptBean.f80884p = cVar3.f147350e;
                    downloadInterceptBean.f80885q = cVar3.f147352g;
                    downloadInterceptBean.f80886r = cVar3.f147353h;
                    downloadInterceptBean.f80887s = gVar2.f147389h;
                    C52758q qVar2 = new C52758q();
                    downloadInterceptBean.f80889u = qVar2;
                    qVar2.f147428d = eVar.f146512d.f147402f.f147385d.f147360r;
                } else {
                    downloadInterceptBean.f80875d = false;
                }
                Log.m105925i("MicroMsg.DownloadChecker", "check download from net, ret: %d, confirmType: %d, appid: %s", Integer.valueOf(qVar.f146539e), Integer.valueOf(qVar.f146540f), downloadInterceptBean.f80878g);
                if (qVar.f146539e != 0) {
                    downloadInterceptBean.f80875d = false;
                } else if (!downloadInterceptBean.f80875d) {
                    qVar.f146539e = -2018122750;
                }
                String str4 = downloadInterceptBean.f80878g;
                String str5 = this.f110085d;
                String str6 = downloadInterceptBean.f80881j;
                String valueOf = String.valueOf(qVar.f146539e);
                String str7 = this.f110086e;
                String str8 = this.f110087f;
                String valueOf2 = String.valueOf(qVar.f146540f);
                Log.m105925i("MicroMsg.DownloadChecker", "reportInfo, appId:[ %s ], rawDownloadUrl:[ %s ], alterDownloadUrl:[ %s ], errCode:[ %s ], mainUrl:[ %s ], source:[ %s ], confirmType:[ %s ]", str4, str5, str6, valueOf, str7, str8, valueOf2);
                try {
                    if (!Util.isNullOrNil(str5)) {
                        str5 = URLEncoder.encode(str5, "UTF-8");
                    }
                    if (!Util.isNullOrNil(str6)) {
                        str6 = URLEncoder.encode(str6, "UTF-8");
                    }
                    if (!Util.isNullOrNil(str7)) {
                        str7 = URLEncoder.encode(str7, "UTF-8");
                    }
                } catch (UnsupportedEncodingException unused) {
                }
                C52416b a = C52416b.m58673a(16749, str4, str5, str6, valueOf, str7, str8, valueOf2);
                C115669n.INSTANCE.mo160126c(a.f146497a, a.f146498b, true, false);
            } else {
                downloadInterceptBean.f80875d = false;
            }
        } else {
            downloadInterceptBean.f80875d = false;
        }
        C1256g gVar3 = this.f110088g;
        if (gVar3 != null) {
            gVar3.mo894a(downloadInterceptBean);
        }
        return 0;
    }
}
