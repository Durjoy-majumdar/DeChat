package com.tencent.p014mm.plugin.downloader_app.model;

import android.app.Activity;
import android.content.Context;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader_app.model.C40986d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import di3.C86312j;
import e51.C45542a;
import e51.C45543b;
import e51.C45545g;
import g51.C45880a;
import h81.C32735h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import nd3.C47223a;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13754y;
import p680ru.C77570i;
import qo3.C47877k0;
import v10.C52735e;
import v41.C52744c;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.c */
public class C40983c {
    /* renamed from: a */
    public static void m44419a(Context context) {
        if (((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false) && NetStatusUtil.isNetworkConnected(context) && !NetStatusUtil.isWifi(context) && (context instanceof Activity)) {
            C47877k0.m53190b((Activity) context, C0966R.C0971layout.c_p, C0966R.raw.bottomsheet_icon_complain, context.getResources().getColor(C0966R.color.f2976b7), context.getString(C0966R.string.c1a), 2000);
        }
    }

    /* renamed from: b */
    public static void m44420b(Context context, C40990e0 e0Var, boolean z) {
        String str;
        if (!z) {
            C45880a.m51163b(10, C45880a.m51162a(e0Var.f110332c), e0Var.f110333d, 23, e0Var.f110335f, "", "");
        }
        if (context != null && e0Var != null) {
            C40979a aVar = new C40979a();
            C52744c cVar = e0Var.f110342m;
            aVar.f110289a = cVar.f147349d;
            aVar.f110290b = cVar.f147357o;
            aVar.f110292d = e0Var.f110335f;
            aVar.f110291c = e0Var.f110336g;
            aVar.f110295g = cVar.f147351f;
            aVar.f110296h = cVar.f147352g;
            aVar.f110294f = cVar.f147350e;
            aVar.f110297i = cVar.f147353h;
            JSONObject jSONObject = new JSONObject();
            boolean z2 = true;
            try {
                jSONObject.put("DownloadInWidget", 1);
                jSONObject.put("OpInWidget", 1);
            } catch (JSONException unused) {
            }
            try {
                str = URLEncoder.encode(jSONObject.toString(), "utf-8");
            } catch (UnsupportedEncodingException unused2) {
                str = null;
            }
            aVar.f110298j = str;
            int i = z ? 6003 : 6002;
            aVar.f110299k = i;
            C52744c cVar2 = e0Var.f110342m;
            aVar.f110300l = cVar2.f147359q;
            aVar.f110302n = 1;
            aVar.f110303o = 1;
            aVar.f110308t = cVar2.f147360r;
            C53491a.m60013c(9, new C53493b(aVar.f110292d, i, -1, "", (String) null, 0));
            if (!NetStatusUtil.isConnected(context)) {
                C76879j.m92711E(context, context.getString(C0966R.string.h7f), context.getString(C0966R.string.h7g), context.getString(C0966R.string.g1l), false, new C40999m(aVar, (C45543b) null));
                return;
            }
            C41002p pVar = new C41002p(context, (C45543b) null);
            Class cls = C52735e.class;
            if (!Util.isNullOrNil(aVar.f110289a)) {
                int Ad = ((C52735e) C86312j.m106911c(cls)).mo61266Ad(C32735h.C32737c.clicfg_download_allow_not_wifi_apk_size, 80);
                long j = aVar.f110295g;
                if (j <= 0 || j > ((long) (Ad * 1024 * 1024))) {
                    z2 = false;
                }
                if (((C52735e) C86312j.m106911c(cls)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false)) {
                    aVar.f110300l = NetStatusUtil.isWifi(context);
                    m44421c(aVar, pVar);
                } else if (NetStatusUtil.isWifi(context) || z2) {
                    C41008v.m44443c(aVar.f110292d);
                    aVar.f110300l = false;
                    m44421c(aVar, pVar);
                } else if (aVar.f110300l) {
                    ((C45545g) C86312j.m106911c(C45545g.class)).mo71051wl(context, aVar.f110292d, new C41003q(aVar, pVar), new C41004r(aVar, pVar), new C41005s(aVar, pVar), aVar.f110295g);
                } else {
                    C76879j.m92710D(context, context.getString(C0966R.string.lfa), context.getString(C0966R.string.lfb), context.getString(C0966R.string.lf6), context.getString(C0966R.string.f7926wf), false, new C41006t(aVar, pVar), new C41007u(), C0966R.color.akw);
                }
            }
        }
    }

    /* renamed from: c */
    public static long m44421c(C40979a aVar, C45543b bVar) {
        String str;
        Class cls = C13754y.class;
        if (!C29855f0.m38891b(aVar.f110292d)) {
            LinkedList<String> c = C29855f0.m38892c();
            c.add(aVar.f110292d);
            C40986d0.m44430b(c, new c$$d());
            C29855f0.m38890a(aVar.f110292d);
        }
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        nVar.f110176a = aVar.f110289a;
        nVar.f110177b = aVar.f110290b;
        nVar.f110179d = aVar.f110291c;
        nVar.f110182g = aVar.f110292d;
        nVar.f110180e = aVar.f110296h;
        nVar.f110184i = aVar.f110301m;
        nVar.f110185j = false;
        int i = aVar.f110302n;
        if (i == 0) {
            i = 1;
        }
        nVar.f110181f = i;
        String str2 = aVar.f110294f;
        nVar.f110183h = str2;
        nVar.f110193r = true;
        nVar.f110187l = aVar.f110299k;
        nVar.f110192q = aVar.f110298j;
        nVar.f110189n = aVar.f110300l;
        nVar.f110197v = aVar.f110303o;
        nVar.f110194s = aVar.f110306r;
        nVar.f110195t = aVar.f110305q;
        nVar.f110196u = aVar.f110304p;
        nVar.f110186k = aVar.f110307s;
        nVar.f110198w = aVar.f110308t;
        nVar.f110199x = aVar.f110293e;
        String str3 = System.currentTimeMillis() + ".apk";
        if (Util.isNullOrNil(str2)) {
            str = VFSStrategy.m163776d("gameDownload") + "/gameApk/" + str3;
        } else {
            str = VFSStrategy.m163776d("gameDownload") + "/gameApk/" + str2 + "/" + (str2.replace(".", "") + System.currentTimeMillis() + ".apk");
        }
        Log.m105924i("MicroMsg.DownloadPluginUtil", "gamelog.download, gamedownload, download apk path  = " + str);
        nVar.f110201z = str;
        long c2 = aVar.f110297i == 1 ? ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63957c(nVar) : ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63956b(nVar);
        Log.m105925i("MicroMsg.DownloadPluginUtil", " add download task result:[%d], appid[%s]，downloaerType[%d]", Long.valueOf(c2), aVar.f110292d, Integer.valueOf(aVar.f110297i));
        if (bVar != null) {
            if (!aVar.f110300l || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                bVar.mo63984a(c2 > 0 ? C45542a.OK : C45542a.FAIL, c2);
            } else {
                bVar.mo63984a(C45542a.WAIT_FOR_WIFI, c2);
            }
        }
        if (aVar.f110300l && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            String str4 = aVar.f110292d;
            Iterator<v$$f> it = C41008v.f110379e.iterator();
            while (it.hasNext()) {
                it.next().mo64030a(str4);
            }
        }
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "DownloadPluginUtil_downloadTaskStraight", C40983c.class.hashCode());
        return c2;
    }

    /* renamed from: d */
    public static boolean m44422d(Context context, C40990e0 e0Var) {
        C53736a d = C40933j.m44315d(e0Var.f110335f);
        if (d == null) {
            return false;
        }
        if (C86013q1.m106450k(d.field_filePath)) {
            C39890a.m42668a(d.field_downloadId, false, (C47223a) null);
            C45880a.m51163b(10, C45880a.m51162a(e0Var.f110332c), e0Var.f110333d, 44, e0Var.f110335f, "", "");
            return true;
        }
        C76879j.m92709C(context, context.getString(C0966R.string.hg9), context.getString(C0966R.string.hg_), context.getString(C0966R.string.i47), context.getString(C0966R.string.jvd), false, new c$$b(context, e0Var), new c$$c());
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0036 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m44423e(android.content.Context r11, com.tencent.p014mm.plugin.downloader_app.model.C40990e0 r12, boolean r13, e51.C45543b r14) {
        /*
            java.lang.String r0 = r12.f110335f
            z41.a r0 = com.tencent.p014mm.plugin.downloader.model.C40933j.m44315d(r0)
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = r0.field_extInfo
            java.lang.String r2 = "OpInWidget"
            r3 = 1
            if (r1 == 0) goto L_0x0016
            boolean r4 = r1.contains(r2)
            if (r4 == 0) goto L_0x0016
            goto L_0x003e
        L_0x0016:
            r4 = 0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r6 = "utf-8"
            if (r5 != 0) goto L_0x002c
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r6)     // Catch:{ UnsupportedEncodingException -> 0x0024 }
        L_0x0024:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x002b }
            r5.<init>(r1)     // Catch:{ Exception -> 0x002b }
            r4 = r5
            goto L_0x002c
        L_0x002b:
        L_0x002c:
            if (r4 != 0) goto L_0x0033
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L_0x0033:
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x0036 }
        L_0x0036:
            java.lang.String r2 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x003e }
            java.lang.String r1 = java.net.URLEncoder.encode(r2, r6)     // Catch:{ UnsupportedEncodingException -> 0x003e }
        L_0x003e:
            r0.field_extInfo = r1
            r0.field_downloadType = r3
            com.tencent.mm.plugin.downloader_app.model.c$$e r1 = new com.tencent.mm.plugin.downloader_app.model.c$$e
            r1.<init>(r11, r14)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r11)
            if (r14 != 0) goto L_0x006e
            r14 = 2131833502(0x7f11329e, float:1.9300088E38)
            java.lang.String r3 = r11.getString(r14)
            r14 = 2131833503(0x7f11329f, float:1.930009E38)
            java.lang.String r4 = r11.getString(r14)
            r14 = 2131831788(0x7f112bec, float:1.9296611E38)
            java.lang.String r5 = r11.getString(r14)
            r6 = 0
            com.tencent.mm.plugin.downloader_app.model.d r7 = new com.tencent.mm.plugin.downloader_app.model.d
            r7.<init>(r0, r1)
            r2 = r11
            nj3.C76879j.m92711E(r2, r3, r4, r5, r6, r7)
            goto L_0x00fb
        L_0x006e:
            java.lang.Class<v10.e> r14 = v10.C52735e.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            v10.e r14 = (v10.C52735e) r14
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_download_game_ignore_network
            r3 = 0
            boolean r14 = r14.mo61269fe(r2, r3)
            if (r14 == 0) goto L_0x008c
            java.lang.String r14 = r0.field_appId
            com.tencent.p014mm.plugin.downloader_app.model.C41008v.m44443c(r14)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r11)
            m44424f(r0, r11, r1)
            goto L_0x00fb
        L_0x008c:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r11)
            if (r14 == 0) goto L_0x009b
            java.lang.String r11 = r0.field_appId
            com.tencent.p014mm.plugin.downloader_app.model.C41008v.m44443c(r11)
            m44424f(r0, r3, r1)
            goto L_0x00fb
        L_0x009b:
            v41.c r14 = r12.f110342m
            boolean r14 = r14.f147359q
            if (r14 == 0) goto L_0x00c2
            java.lang.Class<e51.g> r14 = e51.C45545g.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            r2 = r14
            e51.g r2 = (e51.C45545g) r2
            java.lang.String r4 = r0.field_appId
            com.tencent.mm.plugin.downloader_app.model.e r5 = new com.tencent.mm.plugin.downloader_app.model.e
            r5.<init>(r0, r1)
            com.tencent.mm.plugin.downloader_app.model.f r6 = new com.tencent.mm.plugin.downloader_app.model.f
            r6.<init>(r0, r1)
            com.tencent.mm.plugin.downloader_app.model.c$$a r7 = new com.tencent.mm.plugin.downloader_app.model.c$$a
            r7.<init>(r0, r1)
            long r8 = r0.field_totalSize
            r3 = r11
            r2.mo71051wl(r3, r4, r5, r6, r7, r8)
            goto L_0x00fb
        L_0x00c2:
            boolean r14 = r0.field_reserveInWifi
            if (r14 == 0) goto L_0x00cd
            r0.field_downloadInWifi = r3
            r0.field_reserveInWifi = r3
            com.tencent.p014mm.plugin.downloader.model.C40933j.m44322k(r0)
        L_0x00cd:
            r14 = 2131839989(0x7f114bf5, float:1.9313245E38)
            java.lang.String r3 = r11.getString(r14)
            r14 = 2131839990(0x7f114bf6, float:1.9313247E38)
            java.lang.String r4 = r11.getString(r14)
            r14 = 2131839984(0x7f114bf0, float:1.9313235E38)
            java.lang.String r5 = r11.getString(r14)
            r14 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r6 = r11.getString(r14)
            r7 = 0
            com.tencent.mm.plugin.downloader_app.model.g r8 = new com.tencent.mm.plugin.downloader_app.model.g
            r8.<init>(r0, r1)
            com.tencent.mm.plugin.downloader_app.model.h r9 = new com.tencent.mm.plugin.downloader_app.model.h
            r9.<init>(r12)
            r10 = 2131101823(0x7f06087f, float:1.7816067E38)
            r2 = r11
            nj3.C76879j.m92710D(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00fb:
            y41.b r11 = new y41.b
            r11.<init>()
            r11.mo74165a(r0)
            r14 = 10
            y41.C53491a.m60013c(r14, r11)
        L_0x0108:
            if (r13 == 0) goto L_0x011e
            r0 = 10
            int r11 = r12.f110332c
            int r1 = g51.C45880a.m51162a(r11)
            int r2 = r12.f110333d
            r3 = 6
            java.lang.String r4 = r12.f110335f
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            g51.C45880a.m51163b(r0, r1, r2, r3, r4, r5, r6)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader_app.model.C40983c.m44423e(android.content.Context, com.tencent.mm.plugin.downloader_app.model.e0, boolean, e51.b):void");
    }

    /* renamed from: f */
    public static boolean m44424f(C53736a aVar, boolean z, C45543b bVar) {
        if (!C29855f0.m38891b(aVar.field_appId)) {
            LinkedList<String> c = C29855f0.m38892c();
            c.add(aVar.field_appId);
            C40986d0.m44430b(c, (C40986d0.C40988b) null);
            C29855f0.m38890a(aVar.field_appId);
        }
        aVar.field_showNotification = false;
        aVar.field_fromDownloadApp = true;
        aVar.field_downloadInWifi = z;
        aVar.field_reserveInWifi = z;
        C40933j.m44322k(aVar);
        boolean t = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63972t(aVar.field_downloadId);
        if (bVar != null) {
            bVar.mo63984a(t ? C45542a.OK : C45542a.FAIL, aVar.field_downloadId);
        }
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "DownloadPluginUtil_resumeDownloadTaskStraight", C40983c.class.hashCode());
        return t;
    }

    /* renamed from: g */
    public static void m44425g(C53736a aVar, C45543b bVar) {
        if (!aVar.field_reserveInWifi || !aVar.field_downloadInWifi) {
            aVar.field_downloadInWifi = true;
            aVar.field_reserveInWifi = true;
            C40933j.m44322k(aVar);
        }
        C53491a.m60013c(11, new C53493b(aVar.field_appId, aVar.field_scene, aVar.field_downloadId, "", (String) null, 1));
        bVar.mo63984a(C45542a.WAIT_FOR_WIFI, aVar.field_downloadId);
    }
}
