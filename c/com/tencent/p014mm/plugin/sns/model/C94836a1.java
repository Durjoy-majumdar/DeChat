package com.tencent.p014mm.plugin.sns.model;

import android.content.SharedPreferences;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import hd0.C98398h0;
import p1081gi.C98121d;
import p1081gi.C98127h;

/* renamed from: com.tencent.mm.plugin.sns.model.a1 */
public class C94836a1 implements C55394a {

    /* renamed from: d */
    public String f274750d = "";

    /* renamed from: e */
    public C55394a.C55395a f274751e;

    /* renamed from: f */
    public C98127h.C98128a f274752f = new C94837a();

    /* renamed from: com.tencent.mm.plugin.sns.model.a1$a */
    public class C94837a implements C98127h.C98128a {

        /* renamed from: com.tencent.mm.plugin.sns.model.a1$a$a */
        public class C94838a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f274754d;

            /* renamed from: e */
            public final /* synthetic */ long f274755e;

            /* renamed from: f */
            public final /* synthetic */ long f274756f;

            /* renamed from: g */
            public final /* synthetic */ CdnLogic.VideoInfo f274757g;

            public C94838a(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
                this.f274754d = str;
                this.f274755e = j;
                this.f274756f = j2;
                this.f274757g = videoInfo;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$1");
                C94836a1.m120177e(C94836a1.this).mo76639l(this.f274754d, this.f274755e, this.f274756f, this.f274757g.svrFlag);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.a1$a$b */
        public class C94839b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f274759d;

            /* renamed from: e */
            public final /* synthetic */ long f274760e;

            /* renamed from: f */
            public final /* synthetic */ long f274761f;

            public C94839b(String str, long j, long j2) {
                this.f274759d = str;
                this.f274760e = j;
                this.f274761f = j2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$2");
                C94836a1.m120177e(C94836a1.this).onDataAvailable(this.f274759d, this.f274760e, this.f274761f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.a1$a$c */
        public class C94840c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f274763d;

            /* renamed from: e */
            public final /* synthetic */ long f274764e;

            /* renamed from: f */
            public final /* synthetic */ long f274765f;

            public C94840c(String str, long j, long j2) {
                this.f274763d = str;
                this.f274764e = j;
                this.f274765f = j2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$3");
                C94836a1.m120177e(C94836a1.this).mo76638e(this.f274763d, this.f274764e, this.f274765f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$3");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.a1$a$d */
        public class C94841d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f274767d;

            /* renamed from: e */
            public final /* synthetic */ int f274768e;

            public C94841d(String str, int i) {
                this.f274767d = str;
                this.f274768e = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$4");
                MMApplicationContext.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(this.f274767d, true).commit();
                C94836a1.m120177e(C94836a1.this).mo76640m(this.f274767d, this.f274768e);
                C94866e1.Vx0().mo130998w(this.f274767d, (Object[]) null);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$4");
            }
        }

        public C94837a() {
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
            if (C94836a1.m120177e(C94836a1.this) != null && C94836a1.m120178g(C94836a1.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C94840c(str, j, j2));
            }
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
            if (C94836a1.m120177e(C94836a1.this) != null && C94836a1.m120178g(C94836a1.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C94841d(str, i));
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        }

        public void onDataAvailable(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
            if (C94836a1.m120177e(C94836a1.this) != null && C94836a1.m120178g(C94836a1.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C94839b(str, j, j2));
            }
            SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        }

        public void onM3U8Ready(String str, String str2) {
            SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
            SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
            if (C94836a1.m120177e(C94836a1.this) != null) {
                String str2 = str;
                if (C94836a1.m120178g(C94836a1.this).equals(str)) {
                    MMHandlerThread.postToMainThread(new C94838a(str, j, j2, videoInfo));
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        }
    }

    /* renamed from: e */
    public static /* synthetic */ C55394a.C55395a m120177e(C94836a1 a1Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        C55394a.C55395a aVar = a1Var.f274751e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return aVar;
    }

    /* renamed from: g */
    public static /* synthetic */ String m120178g(C94836a1 a1Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        String str = a1Var.f274750d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return str;
    }

    /* renamed from: a */
    public void mo36227a(String str) {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        Log.m105925i("MicroMsg.SnsAdStreamVideoProxy", "%s, stop stream[%s]", Integer.valueOf(hashCode()), str);
        if (this.f274750d.equals(str)) {
            C94866e1.Vx0().mo130998w(str, (Object[]) null);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    /* renamed from: b */
    public void mo36228b(C55394a.C55395a aVar) {
        SnsMethodCalculate.markStartTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        this.f274751e = aVar;
        SnsMethodCalculate.markEndTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    /* renamed from: c */
    public boolean mo36229c(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        boolean z = false;
        Log.m105919d("MicroMsg.SnsAdStreamVideoProxy", "%s, check video data available[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f274750d.equals(str)) {
            z = C98398h0.xx0().mo126989m(str, i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return z;
    }

    /* renamed from: d */
    public void mo36230d(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        Log.m105919d("MicroMsg.SnsAdStreamVideoProxy", "%s, request video data[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f274750d.equals(str)) {
            C98398h0.xx0().mo126990n(str, i, i2, 0);
        }
        SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    /* renamed from: f */
    public void mo36231f(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        this.f274750d = str;
        boolean z = false;
        Log.m105925i("MicroMsg.SnsAdStreamVideoProxy", "%s start http stream[%s, %s, %s]", Integer.valueOf(hashCode()), str, str3, str2);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("sns_ad_download_resource_preferences", 0);
        boolean z2 = sharedPreferences.getBoolean(str, false);
        if (C86013q1.m106450k(str2)) {
            Log.m105925i("MicroMsg.SnsAdStreamVideoProxy", "is already download %s", Boolean.valueOf(z2));
            if (z2) {
                ((C94837a) this.f274752f).mo17918g(str, 0, (C98121d) null);
                SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
                return;
            }
        } else if (z2) {
            Log.m105924i("MicroMsg.SnsAdStreamVideoProxy", "last download file was deleted");
            sharedPreferences.edit().putBoolean(str, false).commit();
        }
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (Vx0.f274821h) {
            try {
                if (Vx0.f274821h.containsKey(str)) {
                    SnsMethodCalculate.markEndTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    z = true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        if (z) {
            Log.m105924i("%s is already in downloading", str3);
            SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
            return;
        }
        C94866e1.Vx0().mo130984i(str, str3, str2, 0, false, -1, this.f274752f);
        SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }
}
