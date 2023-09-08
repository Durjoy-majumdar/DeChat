package com.tencent.p014mm.plugin.game.model.silent_download;

import com.tencent.p014mm.plugin.downloader.model.C40954w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p237sp.C48456t;
import p749xh.C53352w2;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.d */
public class C42102d implements C40954w {
    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        Log.m105918d("MicroMsg.GameSilentDownloadCallback", "onTaskProgressChanged");
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        Log.m105924i("MicroMsg.GameSilentDownloadCallback", "onTaskRemoved");
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh != null && nh.field_autoDownload) {
            C42104h.m45806c(nh.field_appId, 2, 0);
            mo66056g0(nh.field_appId);
        }
    }

    /* renamed from: O */
    public void mo1798O(long j) {
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        mo66057j0("onTaskResumed", j, true);
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        mo66057j0("onTaskPaused", j, false);
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        C53352w2 nh;
        Log.m105925i("MicroMsg.GameSilentDownloadCallback", "onTaskFailed, errCode:%d", Integer.valueOf(i));
        if (i != 104 && (nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j)) != null && nh.field_autoDownload) {
            C42104h.m45806c(nh.field_appId, 1, i);
            mo66056g0(nh.field_appId);
        }
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        mo66057j0("onTaskStarted", j, true);
    }

    /* renamed from: g0 */
    public final void mo66056g0(String str) {
        C42103f fVar = new C42103f();
        fVar.field_appId = str;
        Log.m105925i("MicroMsg.GameSilentDownloadCallback", "removeSilentDownloadTask, appid:%s, ret:%b", str, Boolean.valueOf(((C48484q) C86312j.m106911c(C48484q.class)).Po0().delete(fVar, new String[0])));
    }

    /* renamed from: j0 */
    public final void mo66057j0(String str, long j, boolean z) {
        Log.m105924i("MicroMsg.GameSilentDownloadCallback", str);
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh != null && nh.field_autoDownload) {
            Log.m105925i("MicroMsg.GameSilentDownloadCallback", "%s. appid:%s, ret:%b", str, nh.field_appId, Boolean.valueOf(((C48484q) C86312j.m106911c(C48484q.class)).Po0().mo66063bD(nh.field_appId, z)));
        }
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        Log.m105924i("MicroMsg.GameSilentDownloadCallback", "onTaskFinished");
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh != null && nh.field_autoDownload) {
            C42104h.m45806c(nh.field_appId, 0, 0);
            mo66056g0(nh.field_appId);
        }
    }
}
