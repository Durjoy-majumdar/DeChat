package c51;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.ipcinvoker.wx_extension.IPCRunCgi;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfo;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import gy3.C87412m;
import java.net.URLEncoder;
import java.util.LinkedList;
import js0.C88024r;
import js0.C9512b;
import ke3.C88144b;
import kotlin.Metadata;
import ob0.C47350c;
import org.json.JSONObject;
import p237sp.C48458z;
import pe3.C47465a;
import u41.C52423c;
import u41.C52425e;
import u41.C52428h;
import u41.C52432l;
import u41.C52433m;
import u41.C52434n;
import u41.C52435o;
import u41.C52445y;
import v41.C52744c;
import v41.C52745d;
import v41.C52748g;
import v41.C52752k;
import z41.C53736a;

/* renamed from: c51.e */
public final class C39896e implements C48458z {

    /* renamed from: a */
    public static final C39896e f106968a = new C39896e();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lc51/e$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-downloader_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: c51.e$a */
    public static final class C39897a implements C80916r<Bundle, Bundle> {
        public Object invoke(Object obj) {
            int i;
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            String string = bundle.getString("appid");
            Bundle bundle2 = new Bundle();
            if (string == null || string.length() == 0) {
                bundle2.putBoolean("isDownloaded", false);
            } else {
                C53736a d = C40933j.m44315d(string);
                if (d != null && ((i = d.field_status) == 3 || i == 2 || i == 1)) {
                    bundle2.putBoolean("isDownloaded", true);
                }
            }
            return bundle2;
        }
    }

    /* renamed from: c51.e$b */
    public static final class C39898b implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C48458z.C48459a f106969a;

        /* renamed from: b */
        public final /* synthetic */ Context f106970b;

        /* renamed from: c */
        public final /* synthetic */ String f106971c;

        /* renamed from: d */
        public final /* synthetic */ String f106972d;

        /* renamed from: e */
        public final /* synthetic */ int f106973e;

        /* renamed from: c51.e$b$a */
        public static final class C39899a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f106974d;

            /* renamed from: e */
            public final /* synthetic */ C48458z.C48459a f106975e;

            /* renamed from: f */
            public final /* synthetic */ C52433m f106976f;

            /* renamed from: g */
            public final /* synthetic */ String f106977g;

            /* renamed from: h */
            public final /* synthetic */ String f106978h;

            /* renamed from: i */
            public final /* synthetic */ int f106979i;

            public C39899a(Context context, C48458z.C48459a aVar, C52433m mVar, String str, String str2, int i) {
                this.f106974d = context;
                this.f106975e = aVar;
                this.f106976f = mVar;
                this.f106977g = str;
                this.f106978h = str2;
                this.f106979i = i;
            }

            public final void run() {
                Context context = this.f106974d;
                C48458z.C48459a aVar = this.f106975e;
                C52425e eVar = this.f106976f.f146528f;
                C87412m.m108593f(eVar, "response.app_info");
                C39896e.m42674b(context, aVar, eVar, this.f106977g, this.f106976f.f146527e, this.f106978h, this.f106979i);
            }
        }

        /* renamed from: c51.e$b$b */
        public static final class C39900b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f106980d;

            /* renamed from: e */
            public final /* synthetic */ C48458z.C48459a f106981e;

            /* renamed from: f */
            public final /* synthetic */ C52433m f106982f;

            /* renamed from: g */
            public final /* synthetic */ String f106983g;

            /* renamed from: h */
            public final /* synthetic */ String f106984h;

            /* renamed from: i */
            public final /* synthetic */ int f106985i;

            public C39900b(Context context, C48458z.C48459a aVar, C52433m mVar, String str, String str2, int i) {
                this.f106980d = context;
                this.f106981e = aVar;
                this.f106982f = mVar;
                this.f106983g = str;
                this.f106984h = str2;
                this.f106985i = i;
            }

            public final void run() {
                Context context = this.f106980d;
                C48458z.C48459a aVar = this.f106981e;
                C52425e eVar = this.f106982f.f146528f;
                C87412m.m108593f(eVar, "response.app_info");
                C39896e.m42674b(context, aVar, eVar, this.f106983g, (String) null, this.f106984h, this.f106985i);
            }
        }

        public C39898b(C48458z.C48459a aVar, Context context, String str, String str2, int i) {
            this.f106969a = aVar;
            this.f106970b = context;
            this.f106971c = str;
            this.f106972d = str2;
            this.f106973e = i;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.GetCloudGameDownloadInfoResponse");
            C52433m mVar = (C52433m) aVar;
            if (i == 0 && i2 == 0) {
                Log.m105924i("GameDetainManager", "response .open_type  = " + mVar.f146526d);
                int i3 = mVar.f146526d;
                if (i3 != 1) {
                    if (i3 != 2) {
                        C48458z.C48459a aVar2 = this.f106969a;
                        if (aVar2 != null) {
                            aVar2.mo65731a("open_type illegal open_type  = " + mVar.f146526d);
                        }
                    } else if (mVar.f146528f != null) {
                        C88024r.m109572b(new C39900b(this.f106970b, this.f106969a, mVar, this.f106971c, this.f106972d, this.f106973e));
                    } else {
                        C48458z.C48459a aVar3 = this.f106969a;
                        if (aVar3 != null) {
                            aVar3.mo65731a("gamelog response .open_type  = 2  app_info is null");
                        }
                    }
                } else if (Util.isNullOrNil(mVar.f146527e) || mVar.f146528f == null) {
                    C48458z.C48459a aVar4 = this.f106969a;
                    if (aVar4 != null) {
                        aVar4.mo65731a("gamelog response .open_type  = 1  h5_url is null");
                    }
                } else {
                    C88024r.m109572b(new C39899a(this.f106970b, this.f106969a, mVar, this.f106971c, this.f106972d, this.f106973e));
                }
            } else {
                C48458z.C48459a aVar5 = this.f106969a;
                if (aVar5 != null) {
                    aVar5.mo65731a("cgiGetGameDownloadDetainConfig CGI return, errType = " + i + ", errCode = " + str);
                }
            }
        }
    }

    /* renamed from: c51.e$c */
    public static final class C39901c implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ String f106986a;

        public C39901c(String str) {
            this.f106986a = str;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C52428h hVar;
            C52428h hVar2;
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.GetCloudGameRetainConfResponse");
            C52435o oVar = (C52435o) aVar;
            if (i == 0 && i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("response.detain_config_switch  = ");
                C52423c cVar2 = oVar.f146533d;
                Integer num = null;
                sb.append(cVar2 != null ? Boolean.valueOf(cVar2.f146508d) : null);
                sb.append("   response.user_record  = ");
                sb.append(oVar.f146534e);
                sb.append("  downloaderMaxDetainTime = ");
                C52423c cVar3 = oVar.f146533d;
                if (!(cVar3 == null || (hVar2 = cVar3.f146510f) == null)) {
                    num = Integer.valueOf(hVar2.f146519d);
                }
                sb.append(num);
                Log.m105924i("GameDetainManager", sb.toString());
                C52423c cVar4 = oVar.f146533d;
                if (cVar4 != null && cVar4.f146508d && (hVar = cVar4.f146510f) != null) {
                    int i3 = hVar.f146519d;
                    LinkedList<C52445y> linkedList = oVar.f146534e;
                    if (i3 > (linkedList != null ? linkedList.size() : 0)) {
                        Context context = MMApplicationContext.getContext();
                        C87412m.m108593f(context, "getContext()");
                        String str2 = this.f106986a;
                        C87412m.m108594g(str2, "appId");
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        C52432l lVar = new C52432l();
                        lVar.f146525d = str2;
                        bVar.f127066a = lVar;
                        bVar.f127067b = new C52433m();
                        bVar.f127068c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
                        bVar.f127069d = 4786;
                        IPCRunCgi.m98794a(bVar.mo72403a(), new C39898b((C48458z.C48459a) null, context, (String) null, str2, 2));
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105920e("GameDetainManager", "gamelog cgiGetCloudGameRetainConf CGI return, errType = " + i + ", errCode = " + str);
        }
    }

    /* renamed from: b */
    public static final void m42674b(Context context, C48458z.C48459a aVar, C52425e eVar, String str, String str2, String str3, int i) {
        C52744c cVar;
        C52744c cVar2;
        C52744c cVar3;
        C52744c cVar4;
        C52744c cVar5;
        C52744c cVar6;
        C52744c cVar7;
        C52744c cVar8;
        C52744c cVar9;
        C52744c cVar10;
        C52744c cVar11;
        C52745d dVar;
        C52745d dVar2;
        C52748g gVar;
        C52744c cVar12;
        Context context2 = context;
        C52425e eVar2 = eVar;
        String str4 = str3;
        boolean z = true;
        if (i == 1) {
            String str5 = MainProcessIPCService.f108404e;
            Bundle bundle = new Bundle();
            bundle.putString("appid", str4);
            if (((Bundle) C80907o.m98783f(str5, bundle, C39897a.class)).getBoolean("isDownloaded", false)) {
                Log.m105924i("GameDetainManager", "gamelog.download, downloader , back, gameId = " + str4 + " app downloaded");
                if (aVar != null) {
                    aVar.onDismiss();
                    return;
                }
                return;
            }
        }
        if (!(!(str2 == null || str2.length() == 0))) {
            C52752k kVar = eVar2.f146512d;
            String str6 = (kVar == null || (gVar = kVar.f147402f) == null || (cVar12 = gVar.f147385d) == null) ? null : cVar12.f147350e;
            if ((str6 == null || str6.length() == 0) || C9512b.m9207a(context2, str6) == null) {
                z = false;
            }
            if (z) {
                Log.m105924i("GameDetainManager", "gamelog.download, downloader , back, gameId = " + str4 + " app installed");
                if (aVar != null) {
                    aVar.onDismiss();
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        C52752k kVar2 = eVar2.f146512d;
        String str7 = (kVar2 == null || (dVar2 = kVar2.f147400d) == null) ? null : dVar2.f147369e;
        String str8 = (kVar2 == null || (dVar = kVar2.f147400d) == null) ? null : dVar.f147370f;
        String str9 = kVar2.f147400d.f147368d;
        C52748g gVar2 = kVar2.f147402f;
        intent.putExtra("appInfoWrapper", new CloudGameAppInfoWrapper(str2, str3, str, i, new CloudGameAppInfo(str7, str8, str9, (gVar2 == null || (cVar11 = gVar2.f147385d) == null) ? null : cVar11.f147350e, (gVar2 == null || (cVar10 = gVar2.f147385d) == null) ? null : cVar10.f147364v, (gVar2 == null || (cVar9 = gVar2.f147385d) == null) ? null : cVar9.f147367y, (gVar2 == null || (cVar8 = gVar2.f147385d) == null) ? null : cVar8.f147361s, (gVar2 == null || (cVar7 = gVar2.f147385d) == null) ? null : cVar7.f147366x, (gVar2 == null || (cVar6 = gVar2.f147385d) == null) ? null : cVar6.f147365w, (gVar2 == null || (cVar5 = gVar2.f147385d) == null) ? 0 : cVar5.f147351f, (gVar2 == null || (cVar4 = gVar2.f147385d) == null) ? null : cVar4.f147349d, (gVar2 == null || (cVar3 = gVar2.f147385d) == null) ? null : cVar3.f147357o, (gVar2 == null || (cVar2 = gVar2.f147385d) == null) ? null : cVar2.f147352g, (gVar2 == null || (cVar = gVar2.f147385d) == null) ? 0 : cVar.f147353h)));
        if (context2 instanceof Activity) {
            C88144b.m109795m(context2, "downloader", ".ui.GameCloudAppDownloadUI", intent, CdnLogic.kMediaTypeBeatificFile);
        } else {
            C88144b.m109791i(context2, "downloader", ".ui.GameCloudAppDownloadUI", intent, (Bundle) null);
        }
    }

    /* renamed from: c */
    public static final void m42675c(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        Log.m105924i("GameDetainManager", "gamelog.download, downloader , detain, appId = " + str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C52434n nVar = new C52434n();
        nVar.f146529d = 2;
        nVar.f146531f = str;
        bVar.f127066a = nVar;
        bVar.f127067b = new C52435o();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getcloudgameretainconf";
        bVar.f127069d = 4568;
        IPCRunCgi.m98794a(bVar.mo72403a(), new C39901c(str));
    }

    /* renamed from: a */
    public void mo62505a(Context context, String str, String str2, int i, C48458z.C48459a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C52432l lVar = new C52432l();
        lVar.f146525d = str;
        bVar.f127066a = lVar;
        bVar.f127067b = new C52433m();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        bVar.f127069d = 4786;
        IPCRunCgi.m98794a(bVar.mo72403a(), new C39898b(aVar, context, str2, str, i));
    }

    /* renamed from: d */
    public final void mo62506d(long j, String str, String str2, String str3) {
        Log.m105919d("GameDetainManager", "kv16099, sceneId = 16, areaId = 1601, positionId = 1, actionId = %d, appId = %s, actId = %s, gameId = %s", Long.valueOf(j), str2, str3, str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ActID", str3);
        jSONObject.put("appid", str2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …pId)\n        }.toString()");
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        objArr[0] = Integer.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 0 : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? 4 : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? 3 : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? 2 : 1);
        objArr[1] = 16;
        objArr[2] = Integer.valueOf(TingClientProto.TingScene.TingScene_FinderLiteAppSinger_VALUE);
        objArr[3] = 1;
        objArr[4] = Long.valueOf(j);
        objArr[5] = str;
        objArr[6] = "";
        objArr[7] = URLEncoder.encode(jSONObject2, "utf-8");
        nVar.mo160131h(16099, objArr);
    }
}
