package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wepkg.model.r$$b */
public class r$$b extends C44488a {

    /* renamed from: b */
    public final /* synthetic */ boolean f120745b;

    /* renamed from: c */
    public final /* synthetic */ String f120746c;

    /* renamed from: d */
    public final /* synthetic */ C44523r f120747d;

    public r$$b(C44523r rVar, boolean z, String str) {
        this.f120747d = rVar;
        this.f120745b = z;
        this.f120746c = str;
    }

    /* renamed from: a */
    public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
        Object obj = this.f120671a;
        if (obj instanceof String) {
            String str = (String) obj;
            boolean z = baseWepkgProcessTask.f120608f;
            boolean z2 = !baseWepkgProcessTask.f120609g;
            this.f120747d.getClass();
            Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "notifyBigPkgDownloadComplete: " + str);
            C44478c.m48834a(new DownloadBigPkgCompleteNotify(str, z, z2), (C44478c.C44480b) null);
            Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "updateLiteApp, pkgId : %s, success : %b, haveDownloadAction : %b", str, Boolean.valueOf(z), Boolean.valueOf(z2));
            if (z && z2) {
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(str), r$$d.class, new r$$a(str));
            }
            C44523r rVar = this.f120747d;
            boolean z3 = this.f120745b;
            rVar.getClass();
            if (Util.isNullOrNil(str)) {
                rVar.mo69303f(z3, str, 3);
                return;
            }
            Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "update preload files. pkgid:%s, isAutoUpdate:%s", str, Boolean.valueOf(z3));
            List<WepkgPreloadFile> b = C44509m.m48881b(str);
            if (!Util.isNullOrNil((List) b)) {
                Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "pkgid:%s, %s preload files need to download", str, Integer.valueOf(b.size()));
            }
            rVar.mo69300c(str, b, z3);
            return;
        }
        this.f120747d.mo69303f(this.f120745b, this.f120746c, 2);
    }
}
