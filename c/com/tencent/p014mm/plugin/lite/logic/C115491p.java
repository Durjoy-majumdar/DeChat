package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.lite.logic.p */
public class C115491p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115492q.C115496d f346240d;

    /* renamed from: e */
    public final /* synthetic */ C115477b f346241e;

    /* renamed from: f */
    public final /* synthetic */ boolean f346242f;

    /* renamed from: g */
    public final /* synthetic */ String f346243g;

    /* renamed from: h */
    public final /* synthetic */ C115492q f346244h;

    public C115491p(C115492q qVar, C115492q.C115496d dVar, C115477b bVar, boolean z, String str) {
        this.f346244h = qVar;
        this.f346240d = dVar;
        this.f346241e = bVar;
        this.f346242f = z;
        this.f346243g = str;
    }

    public void run() {
        C115477b bVar = this.f346240d.f346263c;
        C115477b bVar2 = this.f346241e;
        if (bVar == bVar2 && bVar2 != null) {
            int i = 0;
            if (!this.f346242f) {
                Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkDownloadTimeout, appId:%s syncCheckUpdate:false", this.f346243g);
                this.f346241e.mo5700a(this.f346243g, 10);
                return;
            }
            WxaLiteAppInfo j = this.f346244h.mo175472j(this.f346243g);
            Object[] objArr = new Object[2];
            objArr[0] = this.f346243g;
            if (j != null) {
                i = 1;
            }
            objArr[1] = Integer.valueOf(i);
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkDownloadTimeout, appId:%s info:%d", objArr);
            if (j == null) {
                this.f346241e.mo5700a(this.f346243g, 10);
            } else {
                this.f346241e.mo5701b(j, 10);
            }
        }
    }
}
