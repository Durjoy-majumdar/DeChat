package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p237sp.C13754y;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.game.model.t */
public class C42112t {

    /* renamed from: a */
    public C42039b f113423a;

    /* renamed from: b */
    public int f113424b = 0;

    /* renamed from: c */
    public int f113425c = 1;

    /* renamed from: d */
    public int f113426d = 0;

    public C42112t(C42039b bVar) {
        this.f113423a = bVar;
    }

    /* renamed from: a */
    public void mo66072a(Context context) {
        C42039b bVar = this.f113423a;
        if (bVar != null) {
            int i = bVar.f149252S;
            Log.m105925i("MicroMsg.GameDownloadInfo", "AppId: %s, Initial downloadMode: %d", bVar.field_appId, Integer.valueOf(i));
            if (i == 2) {
                i = 3;
            }
            if (i == 3 && !((C79138l) C86312j.m106911c(C79138l.class)).Tb0(context, "wx3909f6add1206543")) {
                i = 1;
            }
            if (i != 1) {
                int i2 = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(this.f113423a.field_appId).f12196f;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    i = 1;
                }
            }
            this.f113425c = i;
            Log.m105925i("MicroMsg.GameDownloadInfo", "AppId: %s, Final downloadMode: %d", this.f113423a.field_appId, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public void mo66073b() {
        if (this.f113423a != null) {
            if (this.f113425c != 1) {
                this.f113424b = 0;
            } else {
                FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(this.f113423a.field_appId);
                long j = o.f12201n;
                if (j != 0) {
                    this.f113426d = (int) ((((double) o.f12200j) / ((double) j)) * 100.0d);
                } else {
                    this.f113426d = 0;
                }
                int i = this.f113426d;
                if (i == 0) {
                    i = 1;
                }
                this.f113426d = i;
                Log.m105918d("MicroMsg.GameDownloadInfo", "status = " + o.f12196f);
                int i2 = o.f12196f;
                if (i2 == 0) {
                    this.f113424b = 0;
                } else if (i2 == 1) {
                    this.f113424b = 1;
                } else if (i2 == 2) {
                    this.f113424b = 2;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        this.f113424b = 0;
                    } else if (this.f113426d == 0 || NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                        this.f113424b = 0;
                    } else {
                        this.f113424b = 2;
                    }
                } else if (C86013q1.m106450k(o.f12197g)) {
                    this.f113424b = 3;
                } else {
                    this.f113424b = 0;
                }
            }
            Log.m105925i("MicroMsg.GameDownloadInfo", "Updating Download Status, AppId: %s, downloadMode: %d, downloadStatus: %d", this.f113423a.field_appId, Integer.valueOf(this.f113425c), Integer.valueOf(this.f113424b));
        }
    }
}
