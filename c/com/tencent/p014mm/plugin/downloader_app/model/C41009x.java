package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c51.C39896e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.api.DownloadWidgetTaskInfo;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import e51.C45548j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ky2.C10432i;
import ky2.C10439o;
import p763ym.C79138l;
import qo3.C77426q;
import uv0.C111234h;
import xv0.C112185h;
import xv0.C53451i;
import y10.C15928a;
import y41.C53491a;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.x */
public class C41009x extends FloatBallHelper {

    /* renamed from: t */
    public static LinkedList<C45548j> f110384t = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<String> f110385n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<String> f110386o = new LinkedList<>();

    /* renamed from: p */
    public boolean f110387p = false;

    /* renamed from: q */
    public C10439o f110388q = new C41010a();

    /* renamed from: r */
    public boolean f110389r = false;

    /* renamed from: s */
    public C112185h f110390s = new C41011b();

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.x$a */
    public class C41010a implements C10439o {
        public C41010a() {
        }

        public void onDataChanged() {
            boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
            Log.m105925i("MicroMsg.GameDownloadFloatBallHelper", "onTeenModeDataChanged isTeenMode: %s, taskList.empty(): %s", Boolean.valueOf(e), Boolean.valueOf(C41009x.this.f110385n.isEmpty()));
            if (e && !C41009x.this.f110385n.isEmpty() && C41009x.this.mo90541w()) {
                C41009x.this.mo68418k();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.x$b */
    public class C41011b extends C53451i {
        public C41011b() {
        }

        /* renamed from: G1 */
        public void mo64040G1(BallInfo ballInfo) {
            Intent intent = new Intent();
            intent.putExtra("from_scene", 2);
            ((C45547h) C86312j.m106911c(C45547h.class)).p30(MMApplicationContext.getContext(), intent, (C45544c) null);
            C40314g.m43484c(MMApplicationContext.getContext(), 34, 3403, 1, 6, 0, C41009x.this.mo64035v0());
        }

        /* renamed from: H */
        public void mo64041H(BallInfo ballInfo) {
            C40314g.m43484c(MMApplicationContext.getContext(), 34, 3403, 0, 1, 0, C41009x.this.mo64035v0());
        }

        /* renamed from: c2 */
        public void mo64042c2(BallInfo ballInfo) {
            if (!C41009x.this.f110385n.isEmpty()) {
                C40314g.m43484c(MMApplicationContext.getContext(), 34, 3403, 2, 21, 0, C41009x.this.mo64035v0());
                C41009x xVar = C41009x.this;
                xVar.f110387p = true;
                int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_GAME_DOWNLOAD_FLOAT_BALL_REMOVE_INT, 0);
                if (j == 0) {
                    Context context = MMApplicationContext.getContext();
                    C77426q qVar = new C77426q(context);
                    qVar.mo107606r(context.getString(C0966R.string.ctr));
                    qVar.f225837a.f225714b.f225648e = context.getString(C0966R.string.ctp);
                    qVar.mo107602n(context.getString(C0966R.string.bjb));
                    qVar.mo107598j(context.getString(C0966R.string.ctq));
                    qVar.mo107607s(new C40980a0(xVar));
                    qVar.mo107603o();
                } else if (j == 2) {
                    xVar.mo64037x0();
                }
                xVar.mo64038y0(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.x$c */
    public static class C41012c {

        /* renamed from: a */
        public static C41009x f110393a = new C41009x();
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.x$d */
    public static class C41013d implements C80883e<Bundle, Bundle> {
        private C41013d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            boolean z = ((Bundle) obj).getBoolean("show");
            Iterator<C45548j> it = C41009x.f110384t.iterator();
            while (it.hasNext()) {
                it.next().mo65854a(z);
            }
        }
    }

    public C41009x() {
        mo35648A(16, "GameDownloadFloatBall");
        getReportInfo().f311717f = 11;
        mo149077r0(true);
        mo68414O();
        C111234h hVar = C111234h.C111236b.f333107a;
        ((HashMap) hVar.f333106a).put(16, new C41014y(this));
    }

    /* renamed from: A0 */
    public final void mo64034A0() {
        Class cls = C79138l.class;
        int size = this.f110385n.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f110386o.size() > 0) {
                sb.append(MMApplicationContext.getResources().getString(C0966R.string.f360200as1));
            }
            for (int i = size - 1; i > 0; i--) {
                C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(this.f110385n.get(i));
                if (appInfo != null) {
                    sb.append(appInfo.field_appName);
                    sb.append("、");
                }
            }
            C44561j appInfo2 = ((C79138l) C86312j.m106911c(cls)).getAppInfo(this.f110385n.get(0));
            if (appInfo2 != null) {
                sb.append(appInfo2.field_appName);
            }
            String sb4 = sb.toString();
            Log.m105925i("MicroMsg.GameDownloadFloatBallHelper", "updateTitle, name = %s, length : %d", sb4, Integer.valueOf(sb4.length()));
            mo67998q0(sb4);
        }
    }

    /* renamed from: v0 */
    public final String mo64035v0() {
        if (this.f110385n.isEmpty()) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("gamenum", String.valueOf(this.f110385n.size()));
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f110385n.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("_");
        }
        sb.deleteCharAt(sb.length() - 1);
        hashMap.put("appidg", sb.toString());
        return C15928a.m14856c(hashMap);
    }

    /* renamed from: w0 */
    public final void mo64036w0(String str, boolean z) {
        this.f110385n.remove(str);
        this.f110386o.remove(str);
        if (this.f110385n.isEmpty()) {
            this.f110387p = true;
            mo68418k();
            if (z) {
                mo64038y0(true);
                return;
            }
            return;
        }
        mo90537e(this.f110389r);
        Log.m105925i("MicroMsg.GameDownloadFloatBallHelper", "onTaskFinished, isInDownloadMainUI:%s", Boolean.valueOf(this.f110389r));
        mo64039z0();
        mo64034A0();
    }

    /* renamed from: x0 */
    public final void mo64037x0() {
        Class cls = C45547h.class;
        ((C45547h) C86312j.m106911c(cls)).mo70786Di();
        if (this.f110385n.size() == 1) {
            C39896e.m42675c(MMApplicationContext.getContext(), this.f110385n.get(0));
        }
        LinkedList<DownloadWidgetTaskInfo> Se = ((C45547h) C86312j.m106911c(cls)).mo70791Se();
        if (Se != null) {
            Iterator<DownloadWidgetTaskInfo> it = Se.iterator();
            while (it.hasNext()) {
                DownloadWidgetTaskInfo next = it.next();
                if (next.f110288j == 1) {
                    long j = next.f110283e;
                    ((ArrayList) C53491a.f150411b).add(Long.valueOf(j));
                }
            }
        }
        this.f110385n.clear();
    }

    /* renamed from: y0 */
    public void mo64038y0(boolean z) {
        MultiProcessMMKV.getMMKV("download_app").putBoolean("show_red_dot", z).apply();
        MultiProcessMMKV.getMMKV("download_app").putLong("red_dot_create_time", System.currentTimeMillis()).apply();
        Iterator<C45548j> it = f110384t.iterator();
        while (it.hasNext()) {
            it.next().mo65854a(z);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("show", z);
        ToolsProcessIPCService.m43508a(bundle, C41013d.class, (C1256g) null);
    }

    /* renamed from: z0 */
    public final void mo64039z0() {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = this.f110385n.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            String next = it.next();
            C53736a d = C40933j.m44315d(next);
            if (d == null || d.field_status != 1) {
                linkedList.add(next);
            } else {
                j2 += d.field_downloadedSize;
                j += d.field_totalSize;
            }
        }
        if (j > 0) {
            long j3 = (j2 * 100) / j;
            BallInfo ballInfo = this.f311726d;
            if (!(ballInfo == null || ballInfo.f311702w == j3)) {
                Log.m105927v("MicroMsg.FloatBallHelper", "updateProgress, progress:%d", Long.valueOf(j3));
                this.f311726d.f311702w = j3;
                mo68414O();
            }
        }
        if (linkedList.size() > 0) {
            this.f110385n.remove(linkedList);
        }
    }
}
