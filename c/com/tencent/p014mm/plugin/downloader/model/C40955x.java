package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import c51.C39890a;
import c51.C39896e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelstat.C81027f;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45542a;
import e51.C45543b;
import e51.C45545g;
import e51.C45547h;
import gu3.C107916a;
import gu3.C107917d;
import h81.C32735h;
import ji3.C9457a;
import nd3.C47223a;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C88955f;
import p237sp.C13747c0;
import p910lj.C76701a;
import qo3.C47883u;
import qo3.C77426q;
import v10.C52735e;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.x */
public class C40955x {

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$i */
    public class C2207i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f12232d;

        public C2207i(Context context) {
            this.f12232d = context;
        }

        public void run() {
            Context context = this.f12232d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8t), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$m */
    public class C2208m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f12233d;

        public C2208m(Context context) {
            this.f12233d = context;
        }

        public void run() {
            Context context = this.f12233d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8x), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$n */
    public class C2209n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f12234d;

        public C2209n(Context context) {
            this.f12234d = context;
        }

        public void run() {
            Context context = this.f12234d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f8u), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$a */
    public class C40956a implements C45543b {

        /* renamed from: a */
        public final /* synthetic */ C40979a f110224a;

        /* renamed from: b */
        public final /* synthetic */ C13747c0.C13748a f110225b;

        public C40956a(C40979a aVar, C13747c0.C13748a aVar2) {
            this.f110224a = aVar;
            this.f110225b = aVar2;
        }

        /* renamed from: a */
        public void mo63984a(C45542a aVar, long j) {
            JSONObject jSONObject = new JSONObject();
            if (aVar == C45542a.OK) {
                C81027f.m98942b(10, "LuggageGameWebViewUI_addGameDownloadTask", -1018420222);
                try {
                    jSONObject.put("download_id", j);
                    C40955x.m44386a(this.f110224a.f110309u, jSONObject);
                    this.f110225b.mo287a((String) null, jSONObject);
                } catch (JSONException unused) {
                    this.f110225b.mo287a((String) null, (JSONObject) null);
                }
            } else if (aVar == C45542a.WAIT_FOR_WIFI) {
                try {
                    jSONObject.put("download_id", j);
                    jSONObject.put("reserve_for_wifi", 1);
                    this.f110225b.mo287a((String) null, jSONObject);
                } catch (JSONException unused2) {
                    this.f110225b.mo287a((String) null, (JSONObject) null);
                }
            } else if (aVar == C45542a.CANCEL) {
                this.f110225b.mo287a("cancel", (JSONObject) null);
            } else if (aVar == C45542a.FAIL) {
                this.f110225b.mo287a("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$b */
    public class C40957b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f110226d;

        /* renamed from: e */
        public final /* synthetic */ C53736a f110227e;

        /* renamed from: f */
        public final /* synthetic */ boolean f110228f;

        /* renamed from: g */
        public final /* synthetic */ C13747c0.C13748a f110229g;

        public C40957b(PBool pBool, C53736a aVar, boolean z, C13747c0.C13748a aVar2) {
            this.f110226d = pBool;
            this.f110227e = aVar;
            this.f110228f = z;
            this.f110229g = aVar2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f110226d.value = true;
            C40955x.m44391f(this.f110227e, false, this.f110228f, this.f110229g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$c */
    public class C40958c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f110230d;

        /* renamed from: e */
        public final /* synthetic */ C53736a f110231e;

        /* renamed from: f */
        public final /* synthetic */ boolean f110232f;

        /* renamed from: g */
        public final /* synthetic */ C13747c0.C13748a f110233g;

        public C40958c(PBool pBool, C53736a aVar, boolean z, C13747c0.C13748a aVar2) {
            this.f110230d = pBool;
            this.f110231e = aVar;
            this.f110232f = z;
            this.f110233g = aVar2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f110230d.value = true;
            C40955x.m44391f(this.f110231e, true, this.f110232f, this.f110233g);
            C53736a aVar = this.f110231e;
            C53491a.m60013c(11, new C53493b(aVar.field_appId, aVar.field_scene, aVar.field_downloadId, "", (String) null, 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$d */
    public class C40959d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f110234d;

        /* renamed from: e */
        public final /* synthetic */ C53736a f110235e;

        /* renamed from: f */
        public final /* synthetic */ boolean f110236f;

        /* renamed from: g */
        public final /* synthetic */ C13747c0.C13748a f110237g;

        public C40959d(PBool pBool, C53736a aVar, boolean z, C13747c0.C13748a aVar2) {
            this.f110234d = pBool;
            this.f110235e = aVar;
            this.f110236f = z;
            this.f110237g = aVar2;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f110234d.value = true;
            C40955x.m44391f(this.f110235e, true, this.f110236f, this.f110237g);
            C53736a aVar = this.f110235e;
            C53491a.m60013c(11, new C53493b(aVar.field_appId, aVar.field_scene, aVar.field_downloadId, "", (String) null, 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$e */
    public class C40960e implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C13747c0.C13748a f110238a;

        public C40960e(C13747c0.C13748a aVar) {
            this.f110238a = aVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            this.f110238a.mo287a("fail_network_not_wifi", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$f */
    public class C40961f implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C53736a f110239a;

        /* renamed from: b */
        public final /* synthetic */ boolean f110240b;

        /* renamed from: c */
        public final /* synthetic */ C13747c0.C13748a f110241c;

        public C40961f(C53736a aVar, boolean z, C13747c0.C13748a aVar2) {
            this.f110239a = aVar;
            this.f110240b = z;
            this.f110241c = aVar2;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C40955x.m44391f(this.f110239a, false, this.f110240b, this.f110241c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$g */
    public class C40962g implements C107916a<C107917d.C87398b, Object> {

        /* renamed from: a */
        public final /* synthetic */ C77426q f110242a;

        public C40962g(C77426q qVar) {
            this.f110242a = qVar;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C107917d.C87398b bVar = (C107917d.C87398b) obj;
            this.f110242a.mo107603o();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$h */
    public class C40963h implements C45543b {

        /* renamed from: a */
        public final /* synthetic */ boolean f110243a;

        /* renamed from: b */
        public final /* synthetic */ boolean f110244b;

        /* renamed from: c */
        public final /* synthetic */ C13747c0.C13748a f110245c;

        public C40963h(boolean z, boolean z2, C13747c0.C13748a aVar) {
            this.f110243a = z;
            this.f110244b = z2;
            this.f110245c = aVar;
        }

        /* renamed from: a */
        public void mo63984a(C45542a aVar, long j) {
            if (aVar == C45542a.OK) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("download_id", j);
                    C40955x.m44386a(this.f110243a, jSONObject);
                    if (this.f110244b && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                        jSONObject.put("reserve_for_wifi", 1);
                    }
                } catch (JSONException unused) {
                }
                this.f110245c.mo287a((String) null, jSONObject);
            } else if (aVar == C45542a.CANCEL) {
                this.f110245c.mo287a("cancel", (JSONObject) null);
            } else {
                this.f110245c.mo287a("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$j */
    public class C40964j implements C45545g.C45546a {

        /* renamed from: a */
        public final /* synthetic */ PBool f110246a;

        /* renamed from: b */
        public final /* synthetic */ C53736a f110247b;

        /* renamed from: c */
        public final /* synthetic */ boolean f110248c;

        /* renamed from: d */
        public final /* synthetic */ C13747c0.C13748a f110249d;

        public C40964j(PBool pBool, C53736a aVar, boolean z, C13747c0.C13748a aVar2) {
            this.f110246a = pBool;
            this.f110247b = aVar;
            this.f110248c = z;
            this.f110249d = aVar2;
        }

        /* renamed from: a */
        public void mo63989a() {
            this.f110246a.value = true;
            C40955x.m44391f(this.f110247b, false, this.f110248c, this.f110249d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$k */
    public class C40965k implements C45545g.C45546a {

        /* renamed from: a */
        public final /* synthetic */ PBool f110250a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f110251b;

        /* renamed from: c */
        public final /* synthetic */ long f110252c;

        /* renamed from: d */
        public final /* synthetic */ C53736a f110253d;

        /* renamed from: e */
        public final /* synthetic */ Context f110254e;

        /* renamed from: f */
        public final /* synthetic */ C13747c0.C13748a f110255f;

        public C40965k(PBool pBool, JSONObject jSONObject, long j, C53736a aVar, Context context, C13747c0.C13748a aVar2) {
            this.f110250a = pBool;
            this.f110251b = jSONObject;
            this.f110252c = j;
            this.f110253d = aVar;
            this.f110254e = context;
            this.f110255f = aVar2;
        }

        /* renamed from: a */
        public void mo63989a() {
            this.f110250a.value = true;
            try {
                this.f110251b.put("reserve_for_wifi", 0);
                this.f110251b.put("download_id", this.f110252c);
            } catch (JSONException unused) {
            }
            C53736a aVar = this.f110253d;
            aVar.field_downloadInWifi = false;
            aVar.field_reserveInWifi = false;
            C40933j.m44322k(aVar);
            if (this.f110253d.field_status == 0) {
                ((C45547h) C86312j.m106911c(C45547h.class)).mo70793e1(this.f110253d.field_appId);
                C39896e.m42675c(this.f110254e, this.f110253d.field_appId);
            }
            this.f110255f.mo287a((String) null, this.f110251b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$l */
    public class C40966l implements C45545g.C45546a {

        /* renamed from: a */
        public final /* synthetic */ PBool f110256a;

        /* renamed from: b */
        public final /* synthetic */ C13747c0.C13748a f110257b;

        public C40966l(PBool pBool, C13747c0.C13748a aVar) {
            this.f110256a = pBool;
            this.f110257b = aVar;
        }

        /* renamed from: a */
        public void mo63989a() {
            if (!this.f110256a.value) {
                this.f110257b.mo287a("cancel", (JSONObject) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$o */
    public class C40967o implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f110258d;

        /* renamed from: e */
        public final /* synthetic */ C40979a f110259e;

        /* renamed from: f */
        public final /* synthetic */ C13747c0.C13748a f110260f;

        public C40967o(PBool pBool, C40979a aVar, C13747c0.C13748a aVar2) {
            this.f110258d = pBool;
            this.f110259e = aVar;
            this.f110260f = aVar2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f110258d.value = true;
            C40955x.m44388c(this.f110259e, this.f110260f, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$p */
    public class C40968p implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f110261d;

        /* renamed from: e */
        public final /* synthetic */ C40979a f110262e;

        /* renamed from: f */
        public final /* synthetic */ C13747c0.C13748a f110263f;

        public C40968p(PBool pBool, C40979a aVar, C13747c0.C13748a aVar2) {
            this.f110261d = pBool;
            this.f110262e = aVar;
            this.f110263f = aVar2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f110261d.value = true;
            C40955x.m44388c(this.f110262e, this.f110263f, true);
            C40979a aVar = this.f110262e;
            C53491a.m60013c(11, new C53493b(aVar.f110292d, aVar.f110299k, -1, "", (String) null, 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$q */
    public class C40969q implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f110264d;

        /* renamed from: e */
        public final /* synthetic */ C40979a f110265e;

        /* renamed from: f */
        public final /* synthetic */ C13747c0.C13748a f110266f;

        public C40969q(PBool pBool, C40979a aVar, C13747c0.C13748a aVar2) {
            this.f110264d = pBool;
            this.f110265e = aVar;
            this.f110266f = aVar2;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f110264d.value = true;
            C40955x.m44388c(this.f110265e, this.f110266f, true);
            C40979a aVar = this.f110265e;
            C53491a.m60013c(11, new C53493b(aVar.f110292d, aVar.f110299k, -1, "", (String) null, 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$r */
    public class C40970r implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C13747c0.C13748a f110267a;

        public C40970r(C13747c0.C13748a aVar) {
            this.f110267a = aVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            this.f110267a.mo287a("network_not_wifi", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$s */
    public class C40971s implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C40979a f110268a;

        /* renamed from: b */
        public final /* synthetic */ C13747c0.C13748a f110269b;

        public C40971s(C40979a aVar, C13747c0.C13748a aVar2) {
            this.f110268a = aVar;
            this.f110269b = aVar2;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C40955x.m44388c(this.f110268a, this.f110269b, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.x$t */
    public class C40972t implements C107916a<C107917d.C87398b, Object> {

        /* renamed from: a */
        public final /* synthetic */ C77426q f110270a;

        public C40972t(C77426q qVar) {
            this.f110270a = qVar;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C107917d.C87398b bVar = (C107917d.C87398b) obj;
            this.f110270a.mo107603o();
            return null;
        }
    }

    /* renamed from: a */
    public static void m44386a(boolean z, JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean z2 = false;
            if (z && ((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false)) {
                z2 = true;
            }
            if (z2 && NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext()) && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                try {
                    jSONObject.put("network_tips", 1);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m44387b(Context context, C40979a aVar, C13747c0.C13748a aVar2) {
        FileDownloadTaskInfo n;
        Class cls = C52735e.class;
        if (aVar != null) {
            boolean z = true;
            if (!Util.isNullOrNil(aVar.f110289a)) {
                if (!NetStatusUtil.isNetworkConnected(context)) {
                    aVar2.mo287a("network_not_connected", (JSONObject) null);
                    C9457a.m9138b(true, new C2207i(context));
                    Log.m105924i("MicroMsg.JsApiGameDownloadManager", " fail, network not ready");
                    return;
                } else if (!C88955f.m111058b()) {
                    aVar2.mo287a("sdcard_not_ready", (JSONObject) null);
                    C9457a.m9138b(true, new C2208m(context));
                    Log.m105924i("MicroMsg.JsApiGameDownloadManager", " fail, sdcard not ready");
                    return;
                } else {
                    long j = aVar.f110295g;
                    if (j <= 0 || C40940o.m44348a(j) || C40940o.m44350c(aVar.f110295g)) {
                        boolean z2 = aVar.f110309u && ((C52735e) C86312j.m106911c(cls)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false);
                        C53736a e = C40933j.m44316e(aVar.f110289a);
                        JSONObject jSONObject = new JSONObject();
                        if (!(e == null || (n = C40935l.m44326g().mo63966n(e.field_downloadId)) == null)) {
                            int i = n.f12196f;
                            if (i == 1) {
                                try {
                                    jSONObject.put("download_id", n.f12194d);
                                } catch (JSONException unused) {
                                }
                                aVar2.mo287a((String) null, jSONObject);
                                return;
                            } else if (i == 3) {
                                C39890a.m42668a(n.f12194d, false, (C47223a) null);
                                try {
                                    jSONObject.put("download_id", n.f12194d);
                                } catch (JSONException unused2) {
                                }
                                aVar2.mo287a((String) null, jSONObject);
                                return;
                            } else if (z2) {
                                m44391f(e, NetStatusUtil.isWifi(context), aVar.f110309u, aVar2);
                            } else if (aVar.f110300l && e.field_reserveInWifi && !NetStatusUtil.isWifi(context)) {
                                m44389d(context, e.field_downloadId, aVar.f110309u, aVar2);
                                return;
                            }
                        }
                        int Ad = ((C52735e) C86312j.m106911c(cls)).mo61266Ad(C32735h.C32737c.clicfg_download_allow_not_wifi_apk_size, 80);
                        long j2 = aVar.f110295g;
                        if (j2 <= 0 || j2 > ((long) (Ad * 1024 * 1024))) {
                            z = false;
                        }
                        if (z2) {
                            m44388c(aVar, aVar2, NetStatusUtil.isWifi(context));
                            return;
                        } else if (NetStatusUtil.isWifi(context) || z) {
                            m44388c(aVar, aVar2, false);
                            return;
                        } else if (aVar.f110300l) {
                            PBool pBool = new PBool();
                            ((C45545g) C86312j.m106911c(C45545g.class)).mo71051wl(context, aVar.f110292d, new C40967o(pBool, aVar, aVar2), new C40968p(pBool, aVar, aVar2), new C40969q(pBool, aVar, aVar2), aVar.f110295g);
                            return;
                        } else {
                            C77426q qVar = new C77426q(context);
                            qVar.mo107595g(context.getString(C0966R.string.lfa));
                            qVar.mo107606r(context.getString(C0966R.string.lfb));
                            qVar.mo107602n(context.getString(C0966R.string.lf6));
                            qVar.mo107598j(context.getString(C0966R.string.f7926wf));
                            qVar.mo107600l(new C40971s(aVar, aVar2));
                            qVar.mo107597i(new C40970r(aVar2));
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                qVar.mo107603o();
                                return;
                            }
                            C107917d<C107917d.C87398b> b = C107917d.m146213b();
                            b.f323124b = C107917d.f323121j;
                            b.mo158345f(new C40972t(qVar)).mo158346g();
                            return;
                        }
                    } else {
                        aVar2.mo287a("has_not_enough_space", (JSONObject) null);
                        MMHandlerThread.postToMainThread(new C2209n(context));
                        Log.m105924i("MicroMsg.JsApiGameDownloadManager", "fail, not enough space, require size = " + aVar.f110295g);
                        return;
                    }
                }
            }
        }
        aVar2.mo287a("fail", (JSONObject) null);
    }

    /* renamed from: c */
    public static void m44388c(C40979a aVar, C13747c0.C13748a aVar2, boolean z) {
        aVar.f110300l = z;
        ((C45547h) C86312j.m106911c(C45547h.class)).mo70789R7(aVar, new C40956a(aVar, aVar2));
    }

    /* renamed from: d */
    public static void m44389d(Context context, long j, boolean z, C13747c0.C13748a aVar) {
        C13747c0.C13748a aVar2 = aVar;
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            aVar2.mo287a("fail", (JSONObject) null);
            return;
        }
        C53491a.m60013c(12, new C53493b(c.field_appId, c.field_scene, c.field_downloadId, "", (String) null, 1));
        PBool pBool = new PBool();
        Context context2 = context;
        ((C45545g) C86312j.m106911c(C45545g.class)).mo71049gM(context2, c.field_appId, new C40964j(pBool, c, z, aVar2), new C40965k(pBool, new JSONObject(), j, c, context, aVar), new C40966l(pBool, aVar2));
    }

    /* renamed from: e */
    public static void m44390e(Context context, long j, boolean z, boolean z2, C13747c0.C13748a aVar) {
        if (j <= 0) {
            Log.m105920e("MicroMsg.JsApiGameDownloadManager", "fail, invalid downloadId = " + j);
            aVar.mo287a("invalid_downloadid", (JSONObject) null);
            return;
        }
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            aVar.mo287a("fail", (JSONObject) null);
            return;
        }
        FileDownloadTaskInfo n = C40935l.m44326g().mo63966n(c.field_downloadId);
        boolean z3 = true;
        if (n != null) {
            int i = n.f12196f;
            if (i == 1) {
                aVar.mo287a((String) null, (JSONObject) null);
                return;
            } else if (i == 3) {
                C39890a.m42668a(n.f12194d, false, (C47223a) null);
                aVar.mo287a((String) null, (JSONObject) null);
                return;
            }
        }
        if (!z2 || !((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false)) {
            z3 = false;
        }
        if (NetStatusUtil.isWifi(context)) {
            m44391f(c, false, z2, aVar);
        } else if (!z) {
            if (c.field_reserveInWifi) {
                c.field_downloadInWifi = false;
                c.field_reserveInWifi = false;
                C40933j.m44322k(c);
            }
            C77426q qVar = new C77426q(context);
            qVar.mo107595g(context.getString(C0966R.string.lfa));
            qVar.mo107606r(context.getString(C0966R.string.lfb));
            qVar.mo107602n(context.getString(C0966R.string.lf6));
            qVar.mo107598j(context.getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C40961f(c, z2, aVar));
            qVar.mo107597i(new C40960e(aVar));
            if (Looper.myLooper() == Looper.getMainLooper()) {
                qVar.mo107603o();
                return;
            }
            C107917d<C107917d.C87398b> b = C107917d.m146213b();
            b.f323124b = C107917d.f323121j;
            b.mo158345f(new C40962g(qVar)).mo158346g();
        } else if (c.field_reserveInWifi) {
            m44389d(context, c.field_downloadId, z2, aVar);
        } else if (z3) {
            m44391f(c, false, z2, aVar);
        } else {
            PBool pBool = new PBool();
            ((C45545g) C86312j.m106911c(C45545g.class)).mo71051wl(context, c.field_appId, new C40957b(pBool, c, z2, aVar), new C40958c(pBool, c, z2, aVar), new C40959d(pBool, c, z2, aVar), c.field_totalSize);
        }
    }

    /* renamed from: f */
    public static void m44391f(C53736a aVar, boolean z, boolean z2, C13747c0.C13748a aVar2) {
        C81027f.m98942b(10, "LuggageGameWebViewUI_resumeGameDownloadTask", -1018420222);
        ((C45547h) C86312j.m106911c(C45547h.class)).ha0(aVar.field_downloadId, z, new C40963h(z2, z, aVar2));
    }
}
