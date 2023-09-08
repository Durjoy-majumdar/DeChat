package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei0.C86518b;
import java.util.Objects;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c1$$e */
public class c1$$e implements m3$$b {

    /* renamed from: a */
    public final /* synthetic */ boolean f238629a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f238630b;

    /* renamed from: c */
    public final /* synthetic */ C81236c1 f238631c;

    public c1$$e(C81236c1 c1Var, boolean z, int i, Runnable runnable) {
        this.f238631c = c1Var;
        this.f238629a = z;
        this.f238630b = runnable;
    }

    /* renamed from: a */
    public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
        ICommLibReader iCommLibReader;
        m3$$c m3__c = (m3$$c) obj;
        if (!this.f238629a) {
            this.f238631c.f238626f = null;
        }
        if (C86518b.C86519a.OK == aVar) {
            C81263i2.m99623a();
            try {
                Object d = new WxaCommLibRuntimeReader.C81218c().invoke(IPCVoid.f10316d);
                Log.m105925i("MicroMsg.AppBrand.PkgDownloadService", "onPkgUpdateResult, IPC_ReadLib returns %s", d);
                if (d instanceof ICommLibReader) {
                    iCommLibReader = (ICommLibReader) d;
                } else if (d instanceof WxaPkgWrappingInfo) {
                    WxaPkgWrappingInfo wxaPkgWrappingInfo = (WxaPkgWrappingInfo) d;
                    iCommLibReader = wxaPkgWrappingInfo.f238587f ? AssetReader.f238551j : new WxaCommLibRuntimeReader.PkgReader(wxaPkgWrappingInfo);
                } else {
                    NotifyWxaCommLibUpdatedEvent.m99496a(new NotifyWxaCommLibUpdatedEvent(new NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed()));
                    return;
                }
                Objects.requireNonNull(iCommLibReader);
                NotifyWxaCommLibUpdatedEvent.m99496a(new NotifyWxaCommLibUpdatedEvent(new NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed(iCommLibReader)));
                if (!this.f238629a) {
                    ((C119157j) C119157j.f356862d).mo183895z(new c1$$e$$a(iCommLibReader));
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.PkgDownloadService", "onPkgUpdateResult download(version: %d) succeed, publish get exception %s", Integer.valueOf(m3__c.f238710b), e);
            }
        } else {
            NotifyWxaCommLibUpdatedEvent.m99496a(new NotifyWxaCommLibUpdatedEvent(new NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed()));
            if (!this.f238629a) {
                ((C119157j) C119157j.f356862d).mo183895z(new c1$$e$$b());
            }
        }
        Runnable runnable = this.f238630b;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo113494b(Object obj) {
        WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
    }
}
