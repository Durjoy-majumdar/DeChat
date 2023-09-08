package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p237sp.C13749o;
import p237sp.C48456t;
import p237sp.C48457w;
import p749xh.C53352w2;
import y41.C53493b;

/* renamed from: com.tencent.mm.plugin.game.model.r */
public class C42089r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f113393d;

    public C42089r(long j) {
        this.f113393d = j;
    }

    public void run() {
        Class cls = C48456t.class;
        Class cls2 = C48457w.class;
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(this.f113393d);
        if (nh == null) {
            Log.m105920e("MicroMsg.GameDownloadEventBus", "fInfo is null");
        } else if (nh.field_status == 3) {
            if (C86013q1.m106450k(nh.field_filePath)) {
                Log.m105925i("MicroMsg.GameDownloadEventBus", "onInstallFinish, delete file: %s", nh.field_filePath);
                C86013q1.m106447h(nh.field_filePath);
            }
            Log.m105924i("MicroMsg.GameDownloadEventBus", "removeDownloadInfo, appId=" + nh.field_appId);
            ((C48456t) C86312j.m106911c(cls)).Fu0(this.f113393d);
            ((C48456t) C86312j.m106911c(cls)).vq0(nh.field_appId);
            ((C48456t) C86312j.m106911c(cls)).tm0(nh.field_downloadUrl);
            C53493b bVar = new C53493b();
            bVar.mo74165a(nh);
            ((C48457w) C86312j.m106911c(cls2)).mo72829tX(5, bVar);
            ((C48457w) C86312j.m106911c(cls2)).mo72827VV(nh.field_appId, 8, 1);
            C42091s.C42093b bVar2 = C42091s.f113398c.get(nh.field_downloadUrl);
            if (bVar2 == null) {
                ((C48457w) C86312j.m106911c(cls2)).mo72828q8(nh.field_appId, nh.field_scene, 5, nh.field_md5, nh.field_downloadUrl, "", nh.field_extInfo);
                return;
            }
            ((C48457w) C86312j.m106911c(cls2)).mo72828q8(bVar2.f113401c, bVar2.f113400b, 5, bVar2.f113399a, nh.field_downloadUrl, bVar2.f113402d, bVar2.f113403e);
            if (System.currentTimeMillis() - ((C13749o) C86312j.m106911c(C13749o.class)).mo13116mu(nh.field_packageName) <= 600000) {
                ((C48457w) C86312j.m106911c(cls2)).mo72829tX(17, bVar);
            }
        }
    }
}
