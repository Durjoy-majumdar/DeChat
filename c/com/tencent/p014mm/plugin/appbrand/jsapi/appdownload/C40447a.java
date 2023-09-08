package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.plugin.downloader.model.C40954w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import f40.C86709a0;
import p237sp.C48456t;
import p749xh.C53352w2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.a */
public class C40447a implements C40954w {
    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        C53352w2 nh;
        if (C86709a0.m107522a() && (nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j)) != null) {
            AppBrandDownloadState appBrandDownloadState = new AppBrandDownloadState();
            appBrandDownloadState.f108698d = "download_progress_changed";
            appBrandDownloadState.f108699e = nh.field_downloadId;
            String str2 = nh.field_appId;
            appBrandDownloadState.f108700f = str2;
            long j4 = nh.field_totalSize;
            if (j4 != 0) {
                long j5 = nh.field_downloadedSize;
                appBrandDownloadState.f108701g = (long) ((((float) j5) / ((float) j4)) * 100.0f);
                appBrandDownloadState.f108703i = (((float) j5) * 100.0f) / ((float) j4);
            }
            Log.m105925i("MicroMsg.AppbrandFileDownloadCallback", "onTaskProgressChanged, appId: %s, progress: %d", str2, Long.valueOf(appBrandDownloadState.f108701g));
            appBrandDownloadState.f108702h = nh.field_totalSize;
            C82023c.m100725s(appBrandDownloadState);
        }
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        C53352w2 nh;
        if (C86709a0.m107522a() && (nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j)) != null) {
            Log.m105924i("MicroMsg.AppbrandFileDownloadCallback", "onTaskRemoved, appId: " + nh.field_appId);
            AppBrandDownloadState appBrandDownloadState = new AppBrandDownloadState();
            appBrandDownloadState.f108698d = "download_removed";
            appBrandDownloadState.f108699e = nh.field_downloadId;
            appBrandDownloadState.f108700f = nh.field_appId;
            appBrandDownloadState.f108702h = nh.field_totalSize;
            C82023c.m100725s(appBrandDownloadState);
        }
    }

    /* renamed from: O */
    public void mo1798O(long j) {
        C86709a0.m107522a();
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        C86709a0.m107522a();
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        C53352w2 nh;
        if (C86709a0.m107522a() && (nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j)) != null) {
            Log.m105924i("MicroMsg.AppbrandFileDownloadCallback", "onTaskPaused, appId: " + nh.field_appId);
            AppBrandDownloadState appBrandDownloadState = new AppBrandDownloadState();
            if (!nh.field_downloadInWifi || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                appBrandDownloadState.f108698d = "download_paused";
            } else {
                appBrandDownloadState.f108698d = "download_wait_wifi";
            }
            appBrandDownloadState.f108699e = nh.field_downloadId;
            appBrandDownloadState.f108700f = nh.field_appId;
            long j2 = nh.field_totalSize;
            appBrandDownloadState.f108702h = j2;
            if (j2 != 0) {
                long j3 = nh.field_downloadedSize;
                appBrandDownloadState.f108701g = (long) ((((float) j3) / ((float) j2)) * 100.0f);
                appBrandDownloadState.f108703i = (((float) j3) * 100.0f) / ((float) j2);
            }
            C82023c.m100725s(appBrandDownloadState);
        }
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        C53352w2 nh;
        if (C86709a0.m107522a() && (nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j)) != null) {
            Log.m105925i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFailed, appId: %s, downloadInWifi: %b, isWifi: %b", nh.field_appId, Boolean.valueOf(nh.field_downloadInWifi), Boolean.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext())));
            AppBrandDownloadState appBrandDownloadState = new AppBrandDownloadState();
            if (!nh.field_downloadInWifi || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                appBrandDownloadState.f108698d = "download_failed";
            } else {
                appBrandDownloadState.f108698d = "download_wait_wifi";
            }
            appBrandDownloadState.f108699e = nh.field_downloadId;
            appBrandDownloadState.f108700f = nh.field_appId;
            appBrandDownloadState.f108702h = nh.field_totalSize;
            C82023c.m100725s(appBrandDownloadState);
        }
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        C53352w2 nh;
        if (C86709a0.m107522a() && (nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j)) != null) {
            Log.m105924i("MicroMsg.AppbrandFileDownloadCallback", "onTaskStarted, appId: " + nh.field_appId);
            AppBrandDownloadState appBrandDownloadState = new AppBrandDownloadState();
            appBrandDownloadState.f108698d = "download_started";
            appBrandDownloadState.f108699e = nh.field_downloadId;
            appBrandDownloadState.f108700f = nh.field_appId;
            long j2 = nh.field_totalSize;
            if (j2 != 0) {
                long j3 = nh.field_downloadedSize;
                appBrandDownloadState.f108701g = (long) ((((float) j3) / ((float) j2)) * 100.0f);
                appBrandDownloadState.f108703i = (((float) j3) * 100.0f) / ((float) j2);
            }
            appBrandDownloadState.f108702h = j2;
            C82023c.m100725s(appBrandDownloadState);
        }
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        C53352w2 nh;
        Class cls = C48456t.class;
        if (C86709a0.m107522a() && (nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j)) != null) {
            Log.m105924i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFinished, appId: " + nh.field_appId);
            if (nh.field_downloadInWifi) {
                nh.field_downloadInWifi = false;
                ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
            }
            AppBrandDownloadState appBrandDownloadState = new AppBrandDownloadState();
            appBrandDownloadState.f108698d = "download_succ";
            appBrandDownloadState.f108699e = nh.field_downloadId;
            appBrandDownloadState.f108700f = nh.field_appId;
            appBrandDownloadState.f108701g = 100;
            appBrandDownloadState.f108702h = nh.field_totalSize;
            C82023c.m100725s(appBrandDownloadState);
        }
    }
}
