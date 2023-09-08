package d51;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c51.C39890a;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.downloader_app.api.DownloadWidgetTaskInfo;
import com.tencent.p014mm.plugin.downloader_app.model.C29855f0;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.plugin.downloader_app.model.C40983c;
import com.tencent.p014mm.plugin.downloader_app.model.C41009x;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import e51.C45542a;
import e51.C45543b;
import e51.C45544c;
import e51.C45547h;
import e51.C45548j;
import ei3.C86522b;
import h81.C32735h;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import p237sp.C13754y;
import z41.C53736a;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: d51.d */
public class C45261d extends C86301e implements C45547h {

    /* renamed from: d51.d$a */
    public class C45262a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f122613d;

        /* renamed from: e */
        public final /* synthetic */ String f122614e;

        public C45262a(C45261d dVar, Context context, String str) {
            this.f122613d = context;
            this.f122614e = str;
        }

        public void run() {
            C39890a.m42670c(this.f122613d, this.f122614e, (C44580q1) null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(5:2|3|4|5|6)|(1:9)|10|(1:12)|13|14|15|16|17|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String vx0(java.lang.String r5) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r1 = "utf-8"
            r2 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x000e }
        L_0x000e:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0015 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0015 }
            r2 = r0
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            if (r2 != 0) goto L_0x001d
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x001d:
            java.lang.String r0 = "OpInWidget"
            int r3 = r2.optInt(r0)
            r4 = 1
            if (r3 != r4) goto L_0x0029
            r2.remove(r0)
        L_0x0029:
            java.lang.String r0 = "DownloadInWidget"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x002e }
        L_0x002e:
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0036 }
            java.lang.String r5 = java.net.URLEncoder.encode(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x0036 }
        L_0x0036:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d51.C45261d.vx0(java.lang.String):java.lang.String");
    }

    /* renamed from: Di */
    public void mo70786Di() {
        C29855f0.m38893d();
        Iterator<String> it = C29855f0.f80900a.iterator();
        while (it.hasNext()) {
            C53736a d = C40933j.m44315d(it.next());
            if (d != null && d.field_status == 1) {
                ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63965m(d.field_downloadId);
            }
        }
    }

    /* renamed from: FP */
    public boolean mo70787FP() {
        C29855f0.m38893d();
        return C29855f0.f80900a.size() > 0;
    }

    public boolean Kq0() {
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        C41009x.C41012c.f110393a.getClass();
        boolean z = MultiProcessMMKV.getMMKV("download_app").getBoolean("show_red_dot", false);
        if (z) {
            if (System.currentTimeMillis() - MultiProcessMMKV.getMMKV("download_app").getLong("red_dot_create_time", 0) > 86400) {
                MultiProcessMMKV.getMMKV("download_app").putBoolean("show_red_dot", false).apply();
                MultiProcessMMKV.getMMKV("download_app").putLong("red_dot_create_time", 0).apply();
                return false;
            }
        }
        return z;
    }

    /* renamed from: R7 */
    public long mo70789R7(C40979a aVar, C45543b bVar) {
        aVar.f110298j = vx0(aVar.f110298j);
        return C40983c.m44421c(aVar, bVar);
    }

    /* renamed from: RH */
    public void mo70790RH(Context context, Bundle bundle) {
        if (context != null && bundle != null) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.game_luggage, true)) {
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else if (!Util.isNullOrNil(intent.getStringExtra("rawUrl"))) {
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: Se */
    public LinkedList<DownloadWidgetTaskInfo> mo70791Se() {
        C29855f0.m38893d();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(C29855f0.f80900a);
        if (Util.isNullOrNil((List) linkedList)) {
            return null;
        }
        LinkedList<DownloadWidgetTaskInfo> linkedList2 = new LinkedList<>();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            DownloadWidgetTaskInfo downloadWidgetTaskInfo = new DownloadWidgetTaskInfo();
            downloadWidgetTaskInfo.f110282d = str;
            FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
            if (o != null) {
                downloadWidgetTaskInfo.f110283e = o.f12194d;
                int i = o.f12196f;
                downloadWidgetTaskInfo.f110288j = i;
                if (i == 1) {
                    downloadWidgetTaskInfo.f110284f = "downloading";
                } else if (i == 2) {
                    downloadWidgetTaskInfo.f110284f = "download_pause";
                } else if (i == 3) {
                    downloadWidgetTaskInfo.f110284f = "download_succ";
                } else if (i != 4) {
                    downloadWidgetTaskInfo.f110284f = "default";
                } else {
                    downloadWidgetTaskInfo.f110284f = "download_fail";
                }
                long j = o.f12201n;
                if (j > 0) {
                    long j2 = o.f12200j;
                    downloadWidgetTaskInfo.f110285g = (int) ((100 * j2) / j);
                    downloadWidgetTaskInfo.f110287i = (((float) j2) * 100.0f) / ((float) j);
                }
                if (o.f12205r) {
                    downloadWidgetTaskInfo.f110286h = true;
                }
                linkedList2.add(downloadWidgetTaskInfo);
            }
        }
        return linkedList2;
    }

    public void Xh0(C45548j jVar) {
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        C41009x.C41012c.f110393a.getClass();
        C41009x.f110384t.add(jVar);
    }

    /* renamed from: e1 */
    public void mo70793e1(String str) {
        C29855f0.m38894e(str);
    }

    /* renamed from: fZ */
    public void mo70794fZ(Context context, String str) {
        C40319a0.m43496d(new C45262a(this, context, str), 200);
    }

    public boolean ha0(long j, boolean z, C45543b bVar) {
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            c.field_extInfo = vx0(c.field_extInfo);
            C40933j.m44322k(c);
            return C40983c.m44424f(c, z, bVar);
        } else if (bVar == null) {
            return false;
        } else {
            bVar.mo63984a(C45542a.FAIL, j);
            return false;
        }
    }

    /* renamed from: in */
    public void mo70796in(C45548j jVar) {
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        C41009x.C41012c.f110393a.getClass();
        C41009x.f110384t.remove(jVar);
    }

    public void p30(Context context, Intent intent, C45544c cVar) {
        if (context != null) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.getExtras();
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setClass(context, DownloadMainUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/DownloaderAppDelegateImpl", "startDownloadManager", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader_app/api/DownloadAppCallback$StartDownloadManagerCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/downloader_app/DownloaderAppDelegateImpl", "startDownloadManager", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader_app/api/DownloadAppCallback$StartDownloadManagerCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (cVar != null) {
                cVar.mo5407a();
            }
        } else if (cVar != null) {
            cVar.mo5407a();
        }
    }

    /* renamed from: pE */
    public void mo70798pE() {
    }

    /* renamed from: uD */
    public void mo70799uD() {
        LinkedList<String> linkedList = C29855f0.f80900a;
    }
}
