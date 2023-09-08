package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wepkg.model.s */
public class C44524s extends C44488a {

    /* renamed from: b */
    public final /* synthetic */ C44488a f120752b;

    /* renamed from: c */
    public final /* synthetic */ boolean f120753c;

    /* renamed from: d */
    public final /* synthetic */ String f120754d;

    /* renamed from: e */
    public final /* synthetic */ C44523r f120755e;

    public C44524s(C44523r rVar, C44488a aVar, boolean z, String str) {
        this.f120755e = rVar;
        this.f120752b = aVar;
        this.f120753c = z;
        this.f120754d = str;
    }

    /* renamed from: a */
    public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
        if (baseWepkgProcessTask instanceof WepkgDownloadProcessTask) {
            WepkgDownloadProcessTask wepkgDownloadProcessTask = (WepkgDownloadProcessTask) baseWepkgProcessTask;
            if (wepkgDownloadProcessTask.f120635t != WePkgDownloader.IWepkgUpdateCallback.RetCode.OK || Util.isNullOrNil(wepkgDownloadProcessTask.f120627i) || Util.isNullOrNil(wepkgDownloadProcessTask.f120634s)) {
                if (this.f120752b != null) {
                    WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
                    wepkgCrossProcessTask.f120608f = false;
                    this.f120752b.mo66027a(wepkgCrossProcessTask);
                }
                this.f120755e.mo69303f(this.f120753c, this.f120754d, 1);
                return;
            }
            C44509m.m48887h(wepkgDownloadProcessTask.f120627i, wepkgDownloadProcessTask.f120634s, true, this.f120752b);
            return;
        }
        this.f120755e.mo69303f(this.f120753c, this.f120754d, 2);
    }
}
